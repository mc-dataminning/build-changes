import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvx extends buw implements bkk<bvx.b> {
   public static final String b = "BucketVariantTag";
   private static final aef<Integer> d = aei.a(bvx.class, aeh.b);
   public static final List<bvx.d> c = List.of(
      new bvx.d(bvx.b.h, chz.b, chz.h),
      new bvx.d(bvx.b.g, chz.h, chz.h),
      new bvx.d(bvx.b.g, chz.h, chz.l),
      new bvx.d(bvx.b.l, chz.a, chz.h),
      new bvx.d(bvx.b.b, chz.l, chz.h),
      new bvx.d(bvx.b.a, chz.b, chz.a),
      new bvx.d(bvx.b.f, chz.g, chz.d),
      new bvx.d(bvx.b.j, chz.k, chz.e),
      new bvx.d(bvx.b.l, chz.a, chz.o),
      new bvx.d(bvx.b.f, chz.a, chz.e),
      new bvx.d(bvx.b.i, chz.a, chz.h),
      new bvx.d(bvx.b.l, chz.a, chz.b),
      new bvx.d(bvx.b.d, chz.j, chz.g),
      new bvx.d(bvx.b.e, chz.f, chz.d),
      new bvx.d(bvx.b.k, chz.o, chz.a),
      new bvx.d(bvx.b.c, chz.h, chz.o),
      new bvx.d(bvx.b.j, chz.o, chz.a),
      new bvx.d(bvx.b.g, chz.a, chz.e),
      new bvx.d(bvx.b.a, chz.o, chz.a),
      new bvx.d(bvx.b.b, chz.h, chz.a),
      new bvx.d(bvx.b.d, chz.j, chz.e),
      new bvx.d(bvx.b.g, chz.e, chz.e)
   );
   private boolean e = true;

   public bvx(bja<? extends bvx> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvx.b $$0, chz $$1, chz $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static chz s(int $$0) {
      return chz.a($$0 >> 16 & 0xFF);
   }

   public static chz t(int $$0) {
      return chz.a($$0 >> 24 & 0xFF);
   }

   public static bvx.b u(int $$0) {
      return bvx.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gq() {
      return this.an.b(d);
   }

   public chz gn() {
      return s(this.gq());
   }

   public chz go() {
      return t(this.gq());
   }

   public bvx.b gp() {
      return u(this.gq());
   }

   public void a(bvx.b $$0) {
      int $$1 = this.gq();
      chz $$2 = s($$1);
      chz $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cjl $$0) {
      super.l($$0);
      qw $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public cjl b() {
      return new cjl(cjo.pU);
   }

   @Override
   protected apf w() {
      return apg.xZ;
   }

   @Override
   protected apf l_() {
      return apg.ya;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.yc;
   }

   @Override
   protected apf gf() {
      return apg.yb;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjq.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         ash $$5 = $$0.D_();
         bvx.d $$7;
         if ($$3 instanceof bvx.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvx.c(this, $$7);
         } else {
            this.e = false;
            bvx.b[] $$9 = bvx.b.values();
            chz[] $$10 = chz.values();
            bvx.b $$11 = ac.a($$9, $$5);
            chz $$12 = ac.a($$10, $$5);
            chz $$13 = ac.a($$10, $$5);
            $$7 = new bvx.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bja<bvx> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.b_($$3.d()).a(aqa.a) && $$1.a_($$3.c()).a(cte.G) && ($$1.s($$3).a(apu.am) || bvz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements asu {
      a("kob", bvx.a.a, 0),
      b("sunstreak", bvx.a.a, 1),
      c("snooper", bvx.a.a, 2),
      d("dasher", bvx.a.a, 3),
      e("brinely", bvx.a.a, 4),
      f("spotty", bvx.a.a, 5),
      g("flopper", bvx.a.b, 0),
      h("stripey", bvx.a.b, 1),
      i("glitter", bvx.a.b, 2),
      j("blockfish", bvx.a.b, 3),
      k("betty", bvx.a.b, 4),
      l("clayfish", bvx.a.b, 5);

      public static final Codec<bvx.b> m = asu.a(bvx.b::values);
      private static final IntFunction<bvx.b> n = aqu.a(bvx.b::b, values(), a);
      private final String o;
      private final tl p;
      private final bvx.a q;
      private final int r;

      private b(String $$0, bvx.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = tl.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvx.b a(int $$0) {
         return n.apply($$0);
      }

      public bvx.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public tl d() {
         return this.p;
      }
   }

   static class c extends buw.a {
      final bvx.d b;

      c(bvx $$0, bvx.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvx.b a, chz b, chz c) {
      public int a() {
         return bvx.a(this.a, this.b, this.c);
      }

      public bvx.b b() {
         return this.a;
      }

      public chz c() {
         return this.b;
      }

      public chz d() {
         return this.c;
      }
   }
}
