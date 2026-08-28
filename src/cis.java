import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cis extends chn implements bwy<cis.b> {
   public static final String a = "BucketVariantTag";
   private static final ajx<Integer> c = akb.a(cis.class, ajz.b);
   public static final List<cis.d> b = List.of(
      new cis.d(cis.b.h, cwe.b, cwe.h),
      new cis.d(cis.b.g, cwe.h, cwe.h),
      new cis.d(cis.b.g, cwe.h, cwe.l),
      new cis.d(cis.b.l, cwe.a, cwe.h),
      new cis.d(cis.b.b, cwe.l, cwe.h),
      new cis.d(cis.b.a, cwe.b, cwe.a),
      new cis.d(cis.b.f, cwe.g, cwe.d),
      new cis.d(cis.b.j, cwe.k, cwe.e),
      new cis.d(cis.b.l, cwe.a, cwe.o),
      new cis.d(cis.b.f, cwe.a, cwe.e),
      new cis.d(cis.b.i, cwe.a, cwe.h),
      new cis.d(cis.b.l, cwe.a, cwe.b),
      new cis.d(cis.b.d, cwe.j, cwe.g),
      new cis.d(cis.b.e, cwe.f, cwe.d),
      new cis.d(cis.b.k, cwe.o, cwe.a),
      new cis.d(cis.b.c, cwe.h, cwe.o),
      new cis.d(cis.b.j, cwe.o, cwe.a),
      new cis.d(cis.b.g, cwe.a, cwe.e),
      new cis.d(cis.b.a, cwe.o, cwe.a),
      new cis.d(cis.b.b, cwe.h, cwe.a),
      new cis.d(cis.b.d, cwe.j, cwe.e),
      new cis.d(cis.b.g, cwe.e, cwe.e)
   );
   private boolean bF = true;

   public cis(bvi<? extends cis> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cis.b $$0, cwe $$1, cwe $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwe c(int $$0) {
      return cwe.a($$0 >> 16 & 0xFF);
   }

   public static cwe r(int $$0) {
      return cwe.a($$0 >> 24 & 0xFF);
   }

   public static cis.b s(int $$0) {
      return cis.b.a($$0 & 65535);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.t($$0.h("Variant"));
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bF;
   }

   private int gB() {
      return this.al.a(c);
   }

   public cwe gy() {
      return c(this.gB());
   }

   public cwe gz() {
      return r(this.gB());
   }

   public cis.b gA() {
      return s(this.gB());
   }

   public void a(cis.b $$0) {
      int $$1 = this.gB();
      cwe $$2 = c($$1);
      cwe $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   @Override
   public void i(cxh $$0) {
      super.i($$0);
      czo.a(kv.Z, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public cxh R_() {
      return new cxh(cxl.rr);
   }

   @Override
   protected avz u() {
      return awa.AK;
   }

   @Override
   protected avz l_() {
      return awa.AL;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.AN;
   }

   @Override
   protected avz t() {
      return awa.AM;
   }

   @Override
   public void h(tq $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.t($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.C_();
      cis.d $$6;
      if ($$3 instanceof cis.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new cis.c(this, $$6);
      } else {
         this.bF = false;
         cis.b[] $$8 = cis.b.values();
         cwe[] $$9 = cwe.values();
         cis.b $$10 = af.a($$8, $$4);
         cwe $$11 = af.a($$9, $$4);
         cwe $$12 = af.a($$9, $$4);
         $$6 = new cis.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bvi<cis> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(dkg.J) && ($$1.t($$3).a(awo.ap) || ciu.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azv {
      a("kob", cis.a.a, 0),
      b("sunstreak", cis.a.a, 1),
      c("snooper", cis.a.a, 2),
      d("dasher", cis.a.a, 3),
      e("brinely", cis.a.a, 4),
      f("spotty", cis.a.a, 5),
      g("flopper", cis.a.b, 0),
      h("stripey", cis.a.b, 1),
      i("glitter", cis.a.b, 2),
      j("blockfish", cis.a.b, 3),
      k("betty", cis.a.b, 4),
      l("clayfish", cis.a.b, 5);

      public static final Codec<cis.b> m = azv.a(cis.b::values);
      private static final IntFunction<cis.b> n = axq.a(cis.b::b, values(), a);
      private final String o;
      private final wp p;
      private final cis.a q;
      private final int r;

      private b(final String $$0, final cis.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cis.b a(int $$0) {
         return n.apply($$0);
      }

      public cis.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wp d() {
         return this.p;
      }
   }

   static class c extends chn.a {
      final cis.d b;

      c(cis $$0, cis.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cis.b b, cwe c, cwe d) {
      public static final Codec<cis.d> a = Codec.INT.xmap(cis.d::new, cis.d::a);

      public d(int $$0) {
         this(cis.s($$0), cis.c($$0), cis.r($$0));
      }

      public int a() {
         return cis.a(this.b, this.c, this.d);
      }
   }
}
