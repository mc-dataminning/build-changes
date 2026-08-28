import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eut extends eul {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   private static final String l = "frame-";
   public final int c;
   public final int d;
   public final akt<dgi> e;
   private final boolean m;
   private final boolean n;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<eut.a> o = Lists.newArrayList();
   private final Map<cox, eut.a> p = Maps.newHashMap();
   private final Map<String, eum> q = Maps.newHashMap();
   final Map<String, eun> r = Maps.newLinkedHashMap();
   private final Map<String, euq> s = Maps.newHashMap();
   private int t;

   public static eul.a<eut> a() {
      return new eul.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, eut::b, ban.j);
   }

   private eut(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, akt<dgi> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.m = $$3;
      this.n = $$4;
      this.h = $$5;
   }

   public static eut a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, akt<dgi> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = ayz.a(($$0 + 64.0) / (double)$$6);
      int $$8 = ayz.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eut($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eut a(byte $$0, boolean $$1, akt<dgi> $$2) {
      return new eut(0, 0, $$0, false, false, $$1, $$2);
   }

   public static eut b(tq $$0, jt.a $$1) {
      akt<dgi> $$2 = (akt<dgi>)eas.a(new Dynamic(ue.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)ayz.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      eut $$9 = new eut($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      aks<un> $$11 = $$1.a(ue.a);

      for (eum $$13 : eum.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.q.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      tw $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         euq $$16 = euq.a($$14.a($$15));
         if ($$16 != null) {
            $$9.s.put($$16.e(), $$16);
            $$9.a(eup.b, null, b($$16.d()), (double)$$16.b().u(), (double)$$16.b().w(), (double)$$16.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      aku.a.encodeStart(ue.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.m);
      $$0.a("unlimitedTracking", this.n);
      $$0.a("locked", this.h);
      aks<un> $$2 = $$1.a(ue.a);
      $$0.a("banners", (un)eum.b.encodeStart($$2, List.copyOf(this.q.values())).getOrThrow());
      tw $$3 = new tw();

      for (euq $$4 : this.s.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public eut b() {
      eut $$0 = new eut(this.c, this.d, this.f, this.m, this.n, true, this.e);
      $$0.q.putAll(this.q);
      $$0.r.putAll(this.r);
      $$0.t = this.t;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      return $$0;
   }

   public eut e() {
      return a((double)this.c, (double)this.d, (byte)ayz.a(this.f + 1, 0, 4), this.m, this.n, this.e);
   }

   private static Predicate<cwp> a(cwp $$0) {
      eur $$1 = $$0.a(kv.L);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.h()) && Objects.equals($$1, $$2.a(kv.L));
   }

   public void a(cox $$0, cwp $$1) {
      if (!this.p.containsKey($$0)) {
         eut.a $$2 = new eut.a($$0);
         this.p.put($$0, $$2);
         this.o.add($$2);
      }

      Predicate<cwp> $$3 = a($$1);
      if (!$$0.gi().b($$3)) {
         this.a($$0.al().getString());
      }

      for (int $$4 = 0; $$4 < this.o.size(); $$4++) {
         eut.a $$5 = this.o.get($$4);
         cox $$6 = $$5.a;
         String $$7 = $$6.al().getString();
         if (!$$6.dR() && ($$6.gi().b($$3) || $$1.H())) {
            if (!$$1.H() && $$6.dW().ai() == this.e && this.m) {
               this.a(eup.a, $$6.dW(), $$7, $$6.dB(), $$6.dH(), (double)$$6.dM(), null);
            }
         } else {
            this.p.remove($$6);
            this.o.remove($$5);
            this.a($$7);
         }

         if (!$$6.equals($$0) && b($$6)) {
            this.a($$7);
         }
      }

      if ($$1.H() && this.m) {
         cku $$8 = $$1.I();
         ji $$9 = $$8.p();
         euq $$10 = this.s.get(euq.a($$9));
         if ($$10 != null && $$8.ar() != $$10.d() && this.s.containsKey($$10.e())) {
            this.a(b($$10.d()));
         }

         euq $$11 = new euq($$9, $$8.cO().e() * 90, $$8.ar());
         this.a(eup.b, $$0.dW(), b($$8.ar()), (double)$$9.u(), (double)$$9.w(), (double)($$8.cO().e() * 90), null);
         this.s.put($$11.e(), $$11);
      }

      czk $$12 = $$1.a(kv.M, czk.a);
      if (!this.r.keySet().containsAll($$12.a().keySet())) {
         $$12.a().forEach(($$1x, $$2) -> {
            if (!this.r.containsKey($$1x)) {
               this.a($$2.a(), $$0.dW(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private static boolean b(cox $$0) {
      for (bus $$1 : bus.values()) {
         if ($$1 != bus.a && $$1 != bus.b && $$0.a($$1).a(awy.cp)) {
            return true;
         }
      }

      return false;
   }

   private void a(String $$0) {
      eun $$1 = this.r.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.t--;
      }

      this.i();
   }

   public static void a(cwp $$0, ji $$1, String $$2, jr<euo> $$3) {
      czk.a $$4 = new czk.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(kv.M, czk.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(kv.K, new czl($$3.a().d()));
      }
   }

   private void a(jr<euo> $$0, @Nullable dgj $$1, String $$2, double $$3, double $$4, double $$5, @Nullable wo $$6) {
      int $$7 = 1 << this.f;
      float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
      eut.b $$10 = this.a($$0, $$1, $$5, $$8, $$9);
      if ($$10 == null) {
         this.a($$2);
      } else {
         eun $$11 = new eun($$10.a(), $$10.b(), $$10.c(), $$10.d(), Optional.ofNullable($$6));
         eun $$12 = this.r.put($$2, $$11);
         if (!$$11.equals($$12)) {
            if ($$12 != null && $$12.c().a().f()) {
               this.t--;
            }

            if ($$10.a().a().f()) {
               this.t++;
            }

            this.i();
         }
      }
   }

   @Nullable
   private eut.b a(jr<euo> $$0, @Nullable dgj $$1, double $$2, float $$3, float $$4) {
      byte $$5 = a($$3);
      byte $$6 = a($$4);
      if ($$0.a(eup.a)) {
         Pair<jr<euo>, Byte> $$7 = this.b($$0, $$1, $$2, $$3, $$4);
         return $$7 == null ? null : new eut.b((jr<euo>)$$7.getFirst(), $$5, $$6, (Byte)$$7.getSecond());
      } else {
         return !a($$3, $$4) && !this.n ? null : new eut.b($$0, $$5, $$6, this.a($$1, $$2));
      }
   }

   @Nullable
   private Pair<jr<euo>, Byte> b(jr<euo> $$0, @Nullable dgj $$1, double $$2, float $$3, float $$4) {
      if (a($$3, $$4)) {
         return Pair.of($$0, this.a($$1, $$2));
      } else {
         jr<euo> $$5 = this.b($$3, $$4);
         return $$5 == null ? null : Pair.of($$5, (byte)0);
      }
   }

   private byte a(@Nullable dgj $$0, double $$1) {
      if (this.e == dgi.j && $$0 != null) {
         int $$2 = (int)($$0.D_().d() / 10L);
         return (byte)($$2 * $$2 * 34187121 + $$2 * 121 >> 15 & 15);
      } else {
         double $$3 = $$1 < 0.0 ? $$1 - 8.0 : $$1 + 8.0;
         return (byte)((int)($$3 * 16.0 / 360.0));
      }
   }

   private static boolean a(float $$0, float $$1) {
      int $$2 = 63;
      return $$0 >= -63.0F && $$1 >= -63.0F && $$0 <= 63.0F && $$1 <= 63.0F;
   }

   @Nullable
   private jr<euo> b(float $$0, float $$1) {
      int $$2 = 320;
      boolean $$3 = Math.abs($$0) < 320.0F && Math.abs($$1) < 320.0F;
      if ($$3) {
         return eup.g;
      } else {
         return this.n ? eup.h : null;
      }
   }

   private static byte a(float $$0) {
      int $$1 = 63;
      if ($$0 <= -63.0F) {
         return -128;
      } else {
         return $$0 >= 63.0F ? 127 : (byte)((int)((double)($$0 * 2.0F) + 0.5));
      }
   }

   @Nullable
   public yv<?> a(eur $$0, cox $$1) {
      eut.a $$2 = this.p.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (eut.a $$2 : this.o) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.c();
      this.o.forEach(eut.a::b);
   }

   public eut.a a(cox $$0) {
      eut.a $$1 = this.p.get($$0);
      if ($$1 == null) {
         $$1 = new eut.a($$0);
         this.p.put($$0, $$1);
         this.o.add($$1);
      }

      return $$1;
   }

   public boolean a(dgj $$0, ji $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eum $$8 = eum.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.q.remove($$8.b(), $$8)) {
            this.a($$8.b());
            return true;
         }

         if (!this.a(256)) {
            this.q.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            return true;
         }
      }

      return false;
   }

   public void a(dfn $$0, int $$1, int $$2) {
      Iterator<eum> $$3 = this.q.values().iterator();

      while ($$3.hasNext()) {
         eum $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            eum $$5 = eum.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<eum> f() {
      return this.q.values();
   }

   public void a(ji $$0, int $$1) {
      this.a(b($$1));
      this.s.remove(euq.a($$0));
      this.c();
   }

   public boolean a(int $$0, int $$1, byte $$2) {
      byte $$3 = this.g[$$0 + $$1 * 128];
      if ($$3 != $$2) {
         this.b($$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   public void b(int $$0, int $$1, byte $$2) {
      this.g[$$0 + $$1 * 128] = $$2;
      this.a($$0, $$1);
   }

   public boolean g() {
      for (eun $$0 : this.r.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eun> $$0) {
      this.r.clear();
      this.t = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eun $$2 = $$0.get($$1);
         this.r.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.t++;
         }
      }
   }

   public Iterable<eun> h() {
      return this.r.values();
   }

   public boolean a(int $$0) {
      return this.t >= $$0;
   }

   private static String b(int $$0) {
      return "frame-" + $$0;
   }

   public class a {
      public final cox a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final cox $$1) {
         this.a = $$1;
      }

      private eut.c a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eut.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eut.c($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      yv<?> a(eur $$0) {
         eut.c $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eun> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eut.this.r.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new add($$0, eut.this.f, eut.this.h, $$3, $$1);
      }

      void a(int $$0, int $$1) {
         if (this.d) {
            this.e = Math.min(this.e, $$0);
            this.f = Math.min(this.f, $$1);
            this.g = Math.max(this.g, $$0);
            this.h = Math.max(this.h, $$1);
         } else {
            this.d = true;
            this.e = $$0;
            this.f = $$1;
            this.g = $$0;
            this.h = $$1;
         }
      }

      private void b() {
         this.i = true;
      }
   }

   static record b(jr<euo> a, byte b, byte c, byte d) {
   }

   public static record c(int b, int c, int d, int e, byte[] f) {
      public static final ym<ByteBuf, Optional<eut.c>> a = ym.a(eut.c::a, eut.c::a);

      private static void a(ByteBuf $$0, Optional<eut.c> $$1) {
         if ($$1.isPresent()) {
            eut.c $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            vl.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<eut.c> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = vl.a($$0);
            return Optional.of(new eut.c($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(eut $$0) {
         for (int $$1 = 0; $$1 < this.d; $$1++) {
            for (int $$2 = 0; $$2 < this.e; $$2++) {
               $$0.b(this.b + $$1, this.c + $$2, this.f[$$1 + $$2 * this.d]);
            }
         }
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public byte[] e() {
         return this.f;
      }
   }
}
