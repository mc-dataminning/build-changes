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

public class ewn extends ewf {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   private static final String l = "frame-";
   public final int c;
   public final int d;
   public final alc<dhp> e;
   private final boolean m;
   private final boolean n;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<ewn.a> o = Lists.newArrayList();
   private final Map<cqi, ewn.a> p = Maps.newHashMap();
   private final Map<String, ewg> q = Maps.newHashMap();
   final Map<String, ewh> r = Maps.newLinkedHashMap();
   private final Map<String, ewk> s = Maps.newHashMap();
   private int t;

   public static ewf.a<ewn> a() {
      return new ewf.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, ewn::b, bax.j);
   }

   private ewn(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, alc<dhp> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.m = $$3;
      this.n = $$4;
      this.h = $$5;
   }

   public static ewn a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, alc<dhp> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = azk.a(($$0 + 64.0) / (double)$$6);
      int $$8 = azk.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new ewn($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static ewn a(byte $$0, boolean $$1, alc<dhp> $$2) {
      return new ewn(0, 0, $$0, false, false, $$1, $$2);
   }

   public static ewn b(tw $$0, ju.a $$1) {
      alc<dhp> $$2 = (alc<dhp>)ecj.a(new Dynamic(uk.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)azk.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      ewn $$9 = new ewn($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      alb<ut> $$11 = $$1.a(uk.a);

      for (ewg $$13 : ewg.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.q.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      uc $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         ewk $$16 = ewk.a($$14.a($$15));
         if ($$16 != null) {
            $$9.s.put($$16.b(), $$16);
            $$9.a(ewj.b, null, b($$16.e()), (double)$$16.c().u(), (double)$$16.c().w(), (double)$$16.d(), null);
         }
      }

      return $$9;
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      ald.a.encodeStart(uk.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.m);
      $$0.a("unlimitedTracking", this.n);
      $$0.a("locked", this.h);
      alb<ut> $$2 = $$1.a(uk.a);
      $$0.a("banners", (ut)ewg.b.encodeStart($$2, List.copyOf(this.q.values())).getOrThrow());
      uc $$3 = new uc();

      for (ewk $$4 : this.s.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public ewn b() {
      ewn $$0 = new ewn(this.c, this.d, this.f, this.m, this.n, true, this.e);
      $$0.q.putAll(this.q);
      $$0.r.putAll(this.r);
      $$0.t = this.t;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      return $$0;
   }

   public ewn c() {
      return a((double)this.c, (double)this.d, (byte)azk.a(this.f + 1, 0, 4), this.m, this.n, this.e);
   }

   private static Predicate<cxy> a(cxy $$0) {
      ewl $$1 = $$0.a(kx.M);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.h()) && Objects.equals($$1, $$2.a(kx.M));
   }

   public void a(cqi $$0, cxy $$1) {
      if (!this.p.containsKey($$0)) {
         ewn.a $$2 = new ewn.a($$0);
         this.p.put($$0, $$2);
         this.o.add($$2);
      }

      Predicate<cxy> $$3 = a($$1);
      if (!$$0.gi().b($$3)) {
         this.a($$0.al().getString());
      }

      for (int $$4 = 0; $$4 < this.o.size(); $$4++) {
         ewn.a $$5 = this.o.get($$4);
         cqi $$6 = $$5.a;
         String $$7 = $$6.al().getString();
         if (!$$6.dQ() && ($$6.gi().b($$3) || $$1.H())) {
            if (!$$1.H() && $$6.dV().aj() == this.e && this.m) {
               this.a(ewj.a, $$6.dV(), $$7, $$6.dA(), $$6.dG(), (double)$$6.dL(), null);
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
         cmg $$8 = $$1.I();
         jj $$9 = $$8.j();
         ewk $$10 = this.s.get(ewk.a($$9));
         if ($$10 != null && $$8.ar() != $$10.e() && this.s.containsKey($$10.b())) {
            this.a(b($$10.e()));
         }

         ewk $$11 = new ewk($$9, $$8.cO().e() * 90, $$8.ar());
         this.a(ewj.b, $$0.dV(), b($$8.ar()), (double)$$9.u(), (double)$$9.w(), (double)($$8.cO().e() * 90), null);
         ewk $$12 = this.s.put($$11.b(), $$11);
         if (!$$11.equals($$12)) {
            this.g();
         }
      }

      daq $$13 = $$1.a(kx.N, daq.a);
      if (!this.r.keySet().containsAll($$13.a().keySet())) {
         $$13.a().forEach(($$1x, $$2) -> {
            if (!this.r.containsKey($$1x)) {
               this.a($$2.a(), $$0.dV(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private static boolean b(cqi $$0) {
      for (bwc $$1 : bwc.values()) {
         if ($$1 != bwc.a && $$1 != bwc.b && $$0.a($$1).a(axi.cq)) {
            return true;
         }
      }

      return false;
   }

   private void a(String $$0) {
      ewh $$1 = this.r.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.t--;
      }

      this.i();
   }

   public static void a(cxy $$0, jj $$1, String $$2, js<ewi> $$3) {
      daq.a $$4 = new daq.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(kx.N, daq.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(kx.L, new dar($$3.a().d()));
      }
   }

   private void a(js<ewi> $$0, @Nullable dhq $$1, String $$2, double $$3, double $$4, double $$5, @Nullable wv $$6) {
      int $$7 = 1 << this.f;
      float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
      ewn.b $$10 = this.a($$0, $$1, $$5, $$8, $$9);
      if ($$10 == null) {
         this.a($$2);
      } else {
         ewh $$11 = new ewh($$10.a(), $$10.b(), $$10.c(), $$10.d(), Optional.ofNullable($$6));
         ewh $$12 = this.r.put($$2, $$11);
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
   private ewn.b a(js<ewi> $$0, @Nullable dhq $$1, double $$2, float $$3, float $$4) {
      byte $$5 = a($$3);
      byte $$6 = a($$4);
      if ($$0.a(ewj.a)) {
         Pair<js<ewi>, Byte> $$7 = this.b($$0, $$1, $$2, $$3, $$4);
         return $$7 == null ? null : new ewn.b((js<ewi>)$$7.getFirst(), $$5, $$6, (Byte)$$7.getSecond());
      } else {
         return !a($$3, $$4) && !this.n ? null : new ewn.b($$0, $$5, $$6, this.a($$1, $$2));
      }
   }

   @Nullable
   private Pair<js<ewi>, Byte> b(js<ewi> $$0, @Nullable dhq $$1, double $$2, float $$3, float $$4) {
      if (a($$3, $$4)) {
         return Pair.of($$0, this.a($$1, $$2));
      } else {
         js<ewi> $$5 = this.b($$3, $$4);
         return $$5 == null ? null : Pair.of($$5, (byte)0);
      }
   }

   private byte a(@Nullable dhq $$0, double $$1) {
      if (this.e == dhp.j && $$0 != null) {
         int $$2 = (int)($$0.y_().d() / 10L);
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
   private js<ewi> b(float $$0, float $$1) {
      int $$2 = 320;
      boolean $$3 = Math.abs($$0) < 320.0F && Math.abs($$1) < 320.0F;
      if ($$3) {
         return ewj.g;
      } else {
         return this.n ? ewj.h : null;
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
   public zc<?> a(ewl $$0, cqi $$1) {
      ewn.a $$2 = this.p.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.g();

      for (ewn.a $$2 : this.o) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.o.forEach(ewn.a::b);
   }

   public ewn.a a(cqi $$0) {
      ewn.a $$1 = this.p.get($$0);
      if ($$1 == null) {
         $$1 = new ewn.a($$0);
         this.p.put($$0, $$1);
         this.o.add($$1);
      }

      return $$1;
   }

   public boolean a(dhq $$0, jj $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         ewg $$8 = ewg.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.q.remove($$8.b(), $$8)) {
            this.a($$8.b());
            this.g();
            return true;
         }

         if (!this.a(256)) {
            this.q.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            this.g();
            return true;
         }
      }

      return false;
   }

   public void a(dgv $$0, int $$1, int $$2) {
      Iterator<ewg> $$3 = this.q.values().iterator();

      while ($$3.hasNext()) {
         ewg $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            ewg $$5 = ewg.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
               this.g();
            }
         }
      }
   }

   public Collection<ewg> d() {
      return this.q.values();
   }

   public void a(jj $$0, int $$1) {
      this.a(b($$1));
      this.s.remove(ewk.a($$0));
      this.g();
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

   public boolean e() {
      for (ewh $$0 : this.r.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<ewh> $$0) {
      this.r.clear();
      this.t = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ewh $$2 = $$0.get($$1);
         this.r.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.t++;
         }
      }
   }

   public Iterable<ewh> f() {
      return this.r.values();
   }

   public boolean a(int $$0) {
      return this.t >= $$0;
   }

   private static String b(int $$0) {
      return "frame-" + $$0;
   }

   public class a {
      public final cqi a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final cqi $$1) {
         this.a = $$1;
      }

      private ewn.c a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = ewn.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new ewn.c($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zc<?> a(ewl $$0) {
         ewn.c $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<ewh> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = ewn.this.r.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new adj($$0, ewn.this.f, ewn.this.h, $$3, $$1);
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

   static record b(js<ewi> a, byte b, byte c, byte d) {
   }

   public static record c(int b, int c, int d, int e, byte[] f) {
      public static final yt<ByteBuf, Optional<ewn.c>> a = yt.a(ewn.c::a, ewn.c::a);

      private static void a(ByteBuf $$0, Optional<ewn.c> $$1) {
         if ($$1.isPresent()) {
            ewn.c $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            vr.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<ewn.c> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = vr.a($$0);
            return Optional.of(new ewn.c($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(ewn $$0) {
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
