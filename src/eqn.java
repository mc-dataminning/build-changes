import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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

public class eqn extends eqf {
   private static final Logger i = LogUtils.getLogger();
   private static final int j = 128;
   private static final int k = 64;
   public static final int a = 4;
   public static final int b = 256;
   public final int c;
   public final int d;
   public final akp<dcu> e;
   private final boolean l;
   private final boolean m;
   public final byte f;
   public byte[] g = new byte[16384];
   public final boolean h;
   private final List<eqn.a> n = Lists.newArrayList();
   private final Map<cmv, eqn.a> o = Maps.newHashMap();
   private final Map<String, eqg> p = Maps.newHashMap();
   final Map<String, eqh> q = Maps.newLinkedHashMap();
   private final Map<String, eqk> r = Maps.newHashMap();
   private int s;

   public static eqf.a<eqn> a() {
      return new eqf.a<>(() -> {
         throw new IllegalStateException("Should never create an empty map saved data");
      }, eqn::b, azv.j);
   }

   private eqn(int $$0, int $$1, byte $$2, boolean $$3, boolean $$4, boolean $$5, akp<dcu> $$6) {
      this.f = $$2;
      this.c = $$0;
      this.d = $$1;
      this.e = $$6;
      this.l = $$3;
      this.m = $$4;
      this.h = $$5;
      this.c();
   }

   public static eqn a(double $$0, double $$1, byte $$2, boolean $$3, boolean $$4, akp<dcu> $$5) {
      int $$6 = 128 * (1 << $$2);
      int $$7 = ayn.a(($$0 + 64.0) / (double)$$6);
      int $$8 = ayn.a(($$1 + 64.0) / (double)$$6);
      int $$9 = $$7 * $$6 + $$6 / 2 - 64;
      int $$10 = $$8 * $$6 + $$6 / 2 - 64;
      return new eqn($$9, $$10, $$2, $$3, $$4, false, $$5);
   }

   public static eqn a(byte $$0, boolean $$1, akp<dcu> $$2) {
      return new eqn(0, 0, $$0, false, false, $$1, $$2);
   }

   public static eqn b(ua $$0, jo.a $$1) {
      akp<dcu> $$2 = (akp<dcu>)dwv.a(new Dynamic(uo.a, $$0.c("dimension")))
         .resultOrPartial(i::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + $$0.c("dimension")));
      int $$3 = $$0.h("xCenter");
      int $$4 = $$0.h("zCenter");
      byte $$5 = (byte)ayn.a($$0.f("scale"), 0, 4);
      boolean $$6 = !$$0.b("trackingPosition", 1) || $$0.q("trackingPosition");
      boolean $$7 = $$0.q("unlimitedTracking");
      boolean $$8 = $$0.q("locked");
      eqn $$9 = new eqn($$3, $$4, $$5, $$6, $$7, $$8, $$2);
      byte[] $$10 = $$0.m("colors");
      if ($$10.length == 16384) {
         $$9.g = $$10;
      }

      ako<ux> $$11 = $$1.a(uo.a);

      for (eqg $$13 : eqg.b.parse($$11, $$0.c("banners")).resultOrPartial($$0x -> i.warn("Failed to parse map banner: '{}'", $$0x)).orElse(List.of())) {
         $$9.p.put($$13.b(), $$13);
         $$9.a($$13.a(), null, $$13.b(), (double)$$13.c().u(), (double)$$13.c().w(), 180.0, $$13.e().orElse(null));
      }

      ug $$14 = $$0.c("frames", 10);

      for (int $$15 = 0; $$15 < $$14.size(); $$15++) {
         eqk $$16 = eqk.a($$14.a($$15));
         if ($$16 != null) {
            $$9.r.put($$16.e(), $$16);
            $$9.a(eqj.b, null, "frame-" + $$16.d(), (double)$$16.b().u(), (double)$$16.b().w(), (double)$$16.c(), null);
         }
      }

      return $$9;
   }

   @Override
   public ua a(ua $$0, jo.a $$1) {
      akq.a.encodeStart(uo.a, this.e.a()).resultOrPartial(i::error).ifPresent($$1x -> $$0.a("dimension", $$1x));
      $$0.a("xCenter", this.c);
      $$0.a("zCenter", this.d);
      $$0.a("scale", this.f);
      $$0.a("colors", this.g);
      $$0.a("trackingPosition", this.l);
      $$0.a("unlimitedTracking", this.m);
      $$0.a("locked", this.h);
      ako<ux> $$2 = $$1.a(uo.a);
      $$0.a("banners", (ux)eqg.b.encodeStart($$2, List.copyOf(this.p.values())).getOrThrow());
      ug $$3 = new ug();

      for (eqk $$4 : this.r.values()) {
         $$3.add($$4.a());
      }

      $$0.a("frames", $$3);
      return $$0;
   }

   public eqn b() {
      eqn $$0 = new eqn(this.c, this.d, this.f, this.l, this.m, true, this.e);
      $$0.p.putAll(this.p);
      $$0.q.putAll(this.q);
      $$0.s = this.s;
      System.arraycopy(this.g, 0, $$0.g, 0, this.g.length);
      $$0.c();
      return $$0;
   }

   public eqn e() {
      return a((double)this.c, (double)this.d, (byte)ayn.a(this.f + 1, 0, 4), this.l, this.m, this.e);
   }

   private static Predicate<cuo> a(cuo $$0) {
      eql $$1 = $$0.a(kq.B);
      return $$2 -> $$2 == $$0 ? true : $$2.a($$0.g()) && Objects.equals($$1, $$2.a(kq.B));
   }

   public void a(cmv $$0, cuo $$1) {
      if (!this.o.containsKey($$0)) {
         eqn.a $$2 = new eqn.a($$0);
         this.o.put($$0, $$2);
         this.n.add($$2);
      }

      Predicate<cuo> $$3 = a($$1);
      if (!$$0.fZ().b($$3)) {
         this.a($$0.ah().getString());
      }

      for (int $$4 = 0; $$4 < this.n.size(); $$4++) {
         eqn.a $$5 = this.n.get($$4);
         String $$6 = $$5.a.ah().getString();
         if (!$$5.a.dL() && ($$5.a.fZ().b($$3) || $$1.C())) {
            if (!$$1.C() && $$5.a.dQ().af() == this.e && this.l) {
               this.a(eqj.a, $$5.a.dQ(), $$6, $$5.a.dv(), $$5.a.dB(), (double)$$5.a.dG(), null);
            }
         } else {
            this.o.remove($$5.a);
            this.n.remove($$5);
            this.a($$6);
         }
      }

      if ($$1.C() && this.l) {
         ciy $$7 = $$1.D();
         jd $$8 = $$7.t();
         eqk $$9 = this.r.get(eqk.a($$8));
         if ($$9 != null && $$7.an() != $$9.d() && this.r.containsKey($$9.e())) {
            this.a("frame-" + $$9.d());
         }

         eqk $$10 = new eqk($$8, $$7.cI().e() * 90, $$7.an());
         this.a(eqj.b, $$0.dQ(), "frame-" + $$7.an(), (double)$$8.u(), (double)$$8.w(), (double)($$7.cI().e() * 90), null);
         this.r.put($$10.e(), $$10);
      }

      cxp $$11 = $$1.a(kq.C, cxp.a);
      if (!this.q.keySet().containsAll($$11.a().keySet())) {
         $$11.a().forEach(($$1x, $$2) -> {
            if (!this.q.containsKey($$1x)) {
               this.a($$2.a(), $$0.dQ(), $$1x, $$2.b(), $$2.c(), (double)$$2.d(), null);
            }
         });
      }
   }

   private void a(String $$0) {
      eqh $$1 = this.q.remove($$0);
      if ($$1 != null && $$1.c().a().f()) {
         this.s--;
      }

      this.i();
   }

   public static void a(cuo $$0, jd $$1, String $$2, jm<eqi> $$3) {
      cxp.a $$4 = new cxp.a($$3, (double)$$1.u(), (double)$$1.w(), 180.0F);
      $$0.a(kq.C, cxp.a, $$2x -> $$2x.a($$2, $$4));
      if ($$3.a().a()) {
         $$0.b(kq.A, new cxq($$3.a().d()));
      }
   }

   private void a(jm<eqi> $$0, @Nullable dcv $$1, String $$2, double $$3, double $$4, double $$5, @Nullable wy $$6) {
      int $$7 = 1 << this.f;
      float $$8 = (float)($$3 - (double)this.c) / (float)$$7;
      float $$9 = (float)($$4 - (double)this.d) / (float)$$7;
      byte $$10 = (byte)((int)((double)($$8 * 2.0F) + 0.5));
      byte $$11 = (byte)((int)((double)($$9 * 2.0F) + 0.5));
      int $$12 = 63;
      byte $$13;
      if ($$8 >= -63.0F && $$9 >= -63.0F && $$8 <= 63.0F && $$9 <= 63.0F) {
         $$5 += $$5 < 0.0 ? -8.0 : 8.0;
         $$13 = (byte)((int)($$5 * 16.0 / 360.0));
         if (this.e == dcu.i && $$1 != null) {
            int $$14 = (int)($$1.A_().d() / 10L);
            $$13 = (byte)($$14 * $$14 * 34187121 + $$14 * 121 >> 15 & 15);
         }
      } else {
         if (!$$0.a(eqj.a)) {
            this.a($$2);
            return;
         }

         int $$15 = 320;
         if (Math.abs($$8) < 320.0F && Math.abs($$9) < 320.0F) {
            $$0 = eqj.g;
         } else {
            if (!this.m) {
               this.a($$2);
               return;
            }

            $$0 = eqj.h;
         }

         $$13 = 0;
         if ($$8 <= -63.0F) {
            $$10 = -128;
         }

         if ($$9 <= -63.0F) {
            $$11 = -128;
         }

         if ($$8 >= 63.0F) {
            $$10 = 127;
         }

         if ($$9 >= 63.0F) {
            $$11 = 127;
         }
      }

      eqh $$18 = new eqh($$0, $$10, $$11, $$13, Optional.ofNullable($$6));
      eqh $$19 = this.q.put($$2, $$18);
      if (!$$18.equals($$19)) {
         if ($$19 != null && $$19.c().a().f()) {
            this.s--;
         }

         if ($$0.a().f()) {
            this.s++;
         }

         this.i();
      }
   }

   @Nullable
   public zf<?> a(eql $$0, cmv $$1) {
      eqn.a $$2 = this.o.get($$1);
      return $$2 == null ? null : $$2.a($$0);
   }

   private void a(int $$0, int $$1) {
      this.c();

      for (eqn.a $$2 : this.n) {
         $$2.a($$0, $$1);
      }
   }

   private void i() {
      this.c();
      this.n.forEach(eqn.a::b);
   }

   public eqn.a a(cmv $$0) {
      eqn.a $$1 = this.o.get($$0);
      if ($$1 == null) {
         $$1 = new eqn.a($$0);
         this.o.put($$0, $$1);
         this.n.add($$1);
      }

      return $$1;
   }

   public boolean a(dcv $$0, jd $$1) {
      double $$2 = (double)$$1.u() + 0.5;
      double $$3 = (double)$$1.w() + 0.5;
      int $$4 = 1 << this.f;
      double $$5 = ($$2 - (double)this.c) / (double)$$4;
      double $$6 = ($$3 - (double)this.d) / (double)$$4;
      int $$7 = 63;
      if ($$5 >= -63.0 && $$6 >= -63.0 && $$5 <= 63.0 && $$6 <= 63.0) {
         eqg $$8 = eqg.a($$0, $$1);
         if ($$8 == null) {
            return false;
         }

         if (this.p.remove($$8.b(), $$8)) {
            this.a($$8.b());
            return true;
         }

         if (!this.a(256)) {
            this.p.put($$8.b(), $$8);
            this.a($$8.a(), $$0, $$8.b(), $$2, $$3, 180.0, $$8.e().orElse(null));
            return true;
         }
      }

      return false;
   }

   public void a(dca $$0, int $$1, int $$2) {
      Iterator<eqg> $$3 = this.p.values().iterator();

      while ($$3.hasNext()) {
         eqg $$4 = $$3.next();
         if ($$4.c().u() == $$1 && $$4.c().w() == $$2) {
            eqg $$5 = eqg.a($$0, $$4.c());
            if (!$$4.equals($$5)) {
               $$3.remove();
               this.a($$4.b());
            }
         }
      }
   }

   public Collection<eqg> f() {
      return this.p.values();
   }

   public void a(jd $$0, int $$1) {
      this.a("frame-" + $$1);
      this.r.remove(eqk.a($$0));
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
      for (eqh $$0 : this.q.values()) {
         if ($$0.c().a().e()) {
            return true;
         }
      }

      return false;
   }

   public void a(List<eqh> $$0) {
      this.q.clear();
      this.s = 0;

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         eqh $$2 = $$0.get($$1);
         this.q.put("icon-" + $$1, $$2);
         if ($$2.c().a().f()) {
            this.s++;
         }
      }
   }

   public Iterable<eqh> h() {
      return this.q.values();
   }

   public boolean a(int $$0) {
      return this.s >= $$0;
   }

   public class a {
      public final cmv a;
      private boolean d = true;
      private int e;
      private int f;
      private int g = 127;
      private int h = 127;
      private boolean i = true;
      private int j;
      public int b;

      a(final cmv $$1) {
         this.a = $$1;
      }

      private eqn.b a() {
         int $$0 = this.e;
         int $$1 = this.f;
         int $$2 = this.g + 1 - this.e;
         int $$3 = this.h + 1 - this.f;
         byte[] $$4 = new byte[$$2 * $$3];

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$4[$$5 + $$6 * $$2] = eqn.this.g[$$0 + $$5 + ($$1 + $$6) * 128];
            }
         }

         return new eqn.b($$0, $$1, $$2, $$3, $$4);
      }

      @Nullable
      zf<?> a(eql $$0) {
         eqn.b $$1;
         if (this.d) {
            this.d = false;
            $$1 = this.a();
         } else {
            $$1 = null;
         }

         Collection<eqh> $$3;
         if (this.i && this.j++ % 5 == 0) {
            this.i = false;
            $$3 = eqn.this.q.values();
         } else {
            $$3 = null;
         }

         return $$3 == null && $$1 == null ? null : new adl($$0, eqn.this.f, eqn.this.h, $$3, $$1);
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

   public static record b(int b, int c, int d, int e, byte[] f) {
      public static final yw<ByteBuf, Optional<eqn.b>> a = yw.a(eqn.b::a, eqn.b::a);

      private static void a(ByteBuf $$0, Optional<eqn.b> $$1) {
         if ($$1.isPresent()) {
            eqn.b $$2 = $$1.get();
            $$0.writeByte($$2.d);
            $$0.writeByte($$2.e);
            $$0.writeByte($$2.b);
            $$0.writeByte($$2.c);
            vv.a($$0, $$2.f);
         } else {
            $$0.writeByte(0);
         }
      }

      private static Optional<eqn.b> a(ByteBuf $$0) {
         int $$1 = $$0.readUnsignedByte();
         if ($$1 > 0) {
            int $$2 = $$0.readUnsignedByte();
            int $$3 = $$0.readUnsignedByte();
            int $$4 = $$0.readUnsignedByte();
            byte[] $$5 = vv.a($$0);
            return Optional.of(new eqn.b($$3, $$4, $$1, $$2, $$5));
         } else {
            return Optional.empty();
         }
      }

      public void a(eqn $$0) {
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
