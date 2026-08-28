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

public class ete extends esw {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   private static final String l = "frame-";
   public final int c;
   public final int d;
   public final alh<dfb> e;
   private final boolean m;
   private final boolean n;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<ete.a> o = Lists.newArrayList();
   private final Map<com, ete.a> p = Maps.newHashMap();
   private final Map<String, esx> q = Maps.newHashMap();
   final Map<String, esy> r = Maps.newLinkedHashMap();
   private final Map<String, etb> s = Maps.newHashMap();
   private int t;

   public static esw.a<ete> a() {
      return new esw.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, ete::b, bat.j);
   }

   private ete(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, alh<dfb> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.m = $$3;
      this.n = $$4;
      this.h = $$5;
   }

   public static ete a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, alh<dfb> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = azk.a(($$0 + 64.0) / (double)$$6);
      int $$8 = azk.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new ete($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static ete a(byte $$0, boolean $$1, alh<dfb> $$2) {
      return new ete(0, 0, $$0, false, false, $$1, $$2);
   }

   public static ete b(uk $$0, js.a $$1) {
      alh<dfb> $$2 = (alh<dfb>)dzf.a(new Dynamic(uy.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)azk.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      ete $$9 = new ete($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      alg<vh> $$11 = $$1.a(uy.a);

      for (esx $$13 : esx.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.q.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      uq $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         etb $$16 = etb.a($$14.a($$15));
         if ($$16 != null) {
            $$9.s.put($$16.e(), $$16);
            $$9.a(eta.b, null, b($$16.d()), (double)$$16.b().u(), (double)$$16.b().w(), (double)$$16.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public uk a(uk $$0, js.a $$1) {
      ali.a.encodeStart(uy.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.m);
      $$0.a("unlimitedTracking", this.n);
      $$0.a("locked", this.h);
      alg<vh> $$2 = $$1.a(uy.a);
      $$0.a("banners", (vh)esx.b.encodeStart($$2, List.copyOf(this.q.values())).getOrThrow());
      uq $$3 = new uq();

      for (etb $$4 : this.s.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public ete b() {
      ete $$0 = new ete(this.c, this.d, this.f, this.m, this.n, true, this.e);
      $$0.q.putAll(this.q);
      $$0.r.putAll(this.r);
      $$0.t = this.t;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      return $$0;
   }

   public ete e() {
      return a((double)this.c, (double)this.d, (byte)azk.a(this.f + 1, 0, 4), this.m, this.n, this.e);
   }

   private static Predicate<cwb> a(cwb $$0) {
      etc $$1 = $$0.a(ku.L);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.h()) && Objects.equals($$1, $$2.a(ku.L));
   }

   public void a(com $$0, cwb $$1) {
      if (!this.p.containsKey($$0)) {
         ete.a $$2 = new ete.a($$0);
         this.p.put($$0, $$2);
         this.o.add($$2);
      }

      Predicate<cwb> $$3 = a($$1);
      if (!$$0.gk().b($$3)) {
         this.a($$0.am().getString());
      }

      for (int $$4 = 0; $$4 < this.o.size(); $$4++) {
         ete.a $$5 = this.o.get($$4);
         String $$6 = $$5.a.am().getString();
         if (!$$5.a.dS() && ($$5.a.gk().b($$3) || $$1.G())) {
            if (!$$1.G() && $$5.a.dX().ag() == this.e && this.m) {
               this.a(eta.a, $$5.a.dX(), $$6, $$5.a.dC(), $$5.a.dI(), (double)$$5.a.dN(), null);
            }
         } else {
            this.p.remove($$5.a);
            this.o.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.G() && this.m) {
         cko $$7 = $$1.H();
         jh $$8 = $$7.q();
         etb $$9 = this.s.get(etb.a($$8));
         if ($$9 != null && $$7.as() != $$9.d() && this.s.containsKey($$9.e())) {
            this.a(b($$9.d()));
         }

         etb $$10 = new etb($$8, $$7.cP().e() * 90, $$7.as());
         this.a(eta.b, $$0.dX(), b($$7.as()), (double)$$8.u(), (double)$$8.w(), (double)($$7.cP().e() * 90), null);
         this.s.put($$10.e(), $$10);
      }

      cyw $$11 = $$1.a(ku.M, cyw.a);
      if (!this.r.keySet().containsAll($$11.a().keySet())) {
         $$11.a().forEach(($$1x, $$2) -> {
            if (!this.r.containsKey($$1x)) {
               this.a($$2.a(), $$0.dX(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private void a(String $$0) {
      esy $$1 = this.r.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.t--;
      }

      this.i();
   }

   public static void a(cwb $$0, jh $$1, String $$2, jq<esz> $$3) {
      cyw.a $$4 = new cyw.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(ku.M, cyw.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(ku.K, new cyx($$3.a().d()));
      }
   }

   private void a(jq<esz> $$0, @Nullable dfc $$1, String $$2, double $$3, double $$4, double $$5, @Nullable xi $$6) {
      int $$7 = 1 << this.f;
      float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
      ete.b $$10 = this.a($$0, $$1, $$5, $$8, $$9);
      if ($$10 == null) {
         this.a($$2);
      } else {
         esy $$11 = new esy($$10.a(), $$10.b(), $$10.c(), $$10.d(), Optional.ofNullable($$6));
         esy $$12 = this.r.put($$2, $$11);
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
   private ete.b a(jq<esz> $$0, @Nullable dfc $$1, double $$2, float $$3, float $$4) {
      byte $$5 = a($$3);
      byte $$6 = a($$4);
      if ($$0.a(eta.a)) {
         Pair<jq<esz>, Byte> $$7 = this.b($$0, $$1, $$2, $$3, $$4);
         return $$7 == null ? null : new ete.b((jq<esz>)$$7.getFirst(), $$5, $$6, (Byte)$$7.getSecond());
      } else {
         return !a($$3, $$4) && !this.n ? null : new ete.b($$0, $$5, $$6, this.a($$1, $$2));
      }
   }

   @Nullable
   private Pair<jq<esz>, Byte> b(jq<esz> $$0, @Nullable dfc $$1, double $$2, float $$3, float $$4) {
      if (a($$3, $$4)) {
         return Pair.of($$0, this.a($$1, $$2));
      } else {
         jq<esz> $$5 = this.b($$3, $$4);
         return $$5 == null ? null : Pair.of($$5, (byte)0);
      }
   }

   private byte a(@Nullable dfc $$0, double $$1) {
      if (this.e == dfb.j && $$0 != null) {
         int $$2 = (int)($$0.A_().d() / 10L);
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
   private jq<esz> b(float $$0, float $$1) {
      int $$2 = 320;
      boolean $$3 = Math.abs($$0) < 320.0F && Math.abs($$1) < 320.0F;
      if ($$3) {
         return eta.g;
      } else {
         return this.n ? eta.h : null;
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
   public zp<?> a(etc $$0, com $$1) {
      ete.a $$2 = this.p.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (ete.a $$2 : this.o) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.c();
      this.o.forEach(ete.a::b);
   }

   public ete.a a(com $$0) {
      ete.a $$1 = this.p.get($$0);
      if ($$1 == null) {
         $$1 = new ete.a($$0);
         this.p.put($$0, $$1);
         this.o.add($$1);
      }

      return $$1;
   }

   public boolean a(dfc $$0, jh $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         esx $$8 = esx.a($$0, $$1);
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

   public void a(deg $$0, int $$1, int $$2) {
      Iterator<esx> $$3 = this.q.values().iterator();

      while ($$3.hasNext()) {
         esx $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            esx $$5 = esx.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<esx> f() {
      return this.q.values();
   }

   public void a(jh $$0, int $$1) {
      this.a(b($$1));
      this.s.remove(etb.a($$0));
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
      for (esy $$0 : this.r.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<esy> $$0) {
      this.r.clear();
      this.t = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         esy $$2 = $$0.get($$1);
         this.r.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.t++;
         }
      }
   }

   public Iterable<esy> h() {
      return this.r.values();
   }

   public boolean a(int $$0) {
      return this.t >= $$0;
   }

   private static String b(int $$0) {
      return "frame-" + $$0;
   }

   public class a {
      public final com a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final com $$1) {
         this.a = $$1;
      }

      private ete.c a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = ete.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new ete.c($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zp<?> a(etc $$0) {
         ete.c $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<esy> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = ete.this.r.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new adw($$0, ete.this.f, ete.this.h, $$3, $$1);
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

   static record b(jq<esz> a, byte b, byte c, byte d) {
   }

   public static record c(int b, int c, int d, int e, byte[] f) {
      public static final zg<ByteBuf, Optional<ete.c>> a = zg.a(ete.c::a, ete.c::a);

      private static void a(ByteBuf $$0, Optional<ete.c> $$1) {
         if ($$1.isPresent()) {
            ete.c $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            wf.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<ete.c> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = wf.a($$0);
            return Optional.of(new ete.c($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(ete $$0) {
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
