import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxj extends bwi implements blw<bxj.b> {
   public static final String b = "BucketVariantTag";
   private static final afm<Integer> d = afp.a(bxj.class, afo.b);
   public static final List<bxj.d> c = List.of(
      new bxj.d(bxj.b.h, cjp.b, cjp.h),
      new bxj.d(bxj.b.g, cjp.h, cjp.h),
      new bxj.d(bxj.b.g, cjp.h, cjp.l),
      new bxj.d(bxj.b.l, cjp.a, cjp.h),
      new bxj.d(bxj.b.b, cjp.l, cjp.h),
      new bxj.d(bxj.b.a, cjp.b, cjp.a),
      new bxj.d(bxj.b.f, cjp.g, cjp.d),
      new bxj.d(bxj.b.j, cjp.k, cjp.e),
      new bxj.d(bxj.b.l, cjp.a, cjp.o),
      new bxj.d(bxj.b.f, cjp.a, cjp.e),
      new bxj.d(bxj.b.i, cjp.a, cjp.h),
      new bxj.d(bxj.b.l, cjp.a, cjp.b),
      new bxj.d(bxj.b.d, cjp.j, cjp.g),
      new bxj.d(bxj.b.e, cjp.f, cjp.d),
      new bxj.d(bxj.b.k, cjp.o, cjp.a),
      new bxj.d(bxj.b.c, cjp.h, cjp.o),
      new bxj.d(bxj.b.j, cjp.o, cjp.a),
      new bxj.d(bxj.b.g, cjp.a, cjp.e),
      new bxj.d(bxj.b.a, cjp.o, cjp.a),
      new bxj.d(bxj.b.b, cjp.h, cjp.a),
      new bxj.d(bxj.b.d, cjp.j, cjp.e),
      new bxj.d(bxj.b.g, cjp.e, cjp.e)
   );
   private boolean e = true;

   public bxj(bkm<? extends bxj> $$0, crs $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bxj.b $$0, cjp $$1, cjp $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cjp s(int $$0) {
      return cjp.a($$0 >> 16 & 0xFF);
   }

   public static cjp t(int $$0) {
      return cjp.a($$0 >> 24 & 0xFF);
   }

   public static bxj.b u(int $$0) {
      return bxj.b.a($$0 & 65535);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(rz $$0) {
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

   public cjp gn() {
      return s(this.gq());
   }

   public cjp go() {
      return t(this.gq());
   }

   public bxj.b gp() {
      return u(this.gq());
   }

   public void a(bxj.b $$0) {
      int $$1 = this.gq();
      cjp $$2 = s($$1);
      cjp $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(clb $$0) {
      super.l($$0);
      rz $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public clb b() {
      return new clb(cle.pU);
   }

   @Override
   protected aqm w() {
      return aqn.yd;
   }

   @Override
   protected aqm m_() {
      return aqn.ye;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.yg;
   }

   @Override
   protected aqm gf() {
      return aqn.yf;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == blc.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         ato $$5 = $$0.E_();
         bxj.d $$7;
         if ($$3 instanceof bxj.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bxj.c(this, $$7);
         } else {
            this.e = false;
            bxj.b[] $$9 = bxj.b.values();
            cjp[] $$10 = cjp.values();
            bxj.b $$11 = ac.a($$9, $$5);
            cjp $$12 = ac.a($$10, $$5);
            cjp $$13 = ac.a($$10, $$5);
            $$7 = new bxj.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bkm<bxj> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.b_($$3.d()).a(arh.a) && $$1.a_($$3.c()).a(cuv.G) && ($$1.s($$3).a(arb.am) || bxl.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements aub {
      a("kob", bxj.a.a, 0),
      b("sunstreak", bxj.a.a, 1),
      c("snooper", bxj.a.a, 2),
      d("dasher", bxj.a.a, 3),
      e("brinely", bxj.a.a, 4),
      f("spotty", bxj.a.a, 5),
      g("flopper", bxj.a.b, 0),
      h("stripey", bxj.a.b, 1),
      i("glitter", bxj.a.b, 2),
      j("blockfish", bxj.a.b, 3),
      k("betty", bxj.a.b, 4),
      l("clayfish", bxj.a.b, 5);

      public static final Codec<bxj.b> m = aub.a(bxj.b::values);
      private static final IntFunction<bxj.b> n = asb.a(bxj.b::b, values(), a);
      private final String o;
      private final ur p;
      private final bxj.a q;
      private final int r;

      private b(String $$0, bxj.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = ur.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bxj.b a(int $$0) {
         return n.apply($$0);
      }

      public bxj.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public ur d() {
         return this.p;
      }
   }

   static class c extends bwi.a {
      final bxj.d b;

      c(bxj $$0, bxj.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bxj.b a, cjp b, cjp c) {
      public int a() {
         return bxj.a(this.a, this.b, this.c);
      }

      public bxj.b b() {
         return this.a;
      }

      public cjp c() {
         return this.b;
      }

      public cjp d() {
         return this.c;
      }
   }
}
