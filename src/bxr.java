import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxr extends bwq implements bme<bxr.b> {
   public static final String b = "BucketVariantTag";
   private static final afo<Integer> d = afr.a(bxr.class, afq.b);
   public static final List<bxr.d> c = List.of(
      new bxr.d(bxr.b.h, cjx.b, cjx.h),
      new bxr.d(bxr.b.g, cjx.h, cjx.h),
      new bxr.d(bxr.b.g, cjx.h, cjx.l),
      new bxr.d(bxr.b.l, cjx.a, cjx.h),
      new bxr.d(bxr.b.b, cjx.l, cjx.h),
      new bxr.d(bxr.b.a, cjx.b, cjx.a),
      new bxr.d(bxr.b.f, cjx.g, cjx.d),
      new bxr.d(bxr.b.j, cjx.k, cjx.e),
      new bxr.d(bxr.b.l, cjx.a, cjx.o),
      new bxr.d(bxr.b.f, cjx.a, cjx.e),
      new bxr.d(bxr.b.i, cjx.a, cjx.h),
      new bxr.d(bxr.b.l, cjx.a, cjx.b),
      new bxr.d(bxr.b.d, cjx.j, cjx.g),
      new bxr.d(bxr.b.e, cjx.f, cjx.d),
      new bxr.d(bxr.b.k, cjx.o, cjx.a),
      new bxr.d(bxr.b.c, cjx.h, cjx.o),
      new bxr.d(bxr.b.j, cjx.o, cjx.a),
      new bxr.d(bxr.b.g, cjx.a, cjx.e),
      new bxr.d(bxr.b.a, cjx.o, cjx.a),
      new bxr.d(bxr.b.b, cjx.h, cjx.a),
      new bxr.d(bxr.b.d, cjx.j, cjx.e),
      new bxr.d(bxr.b.g, cjx.e, cjx.e)
   );
   private boolean e = true;

   public bxr(bku<? extends bxr> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bxr.b $$0, cjx $$1, cjx $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cjx s(int $$0) {
      return cjx.a($$0 >> 16 & 0xFF);
   }

   public static cjx t(int $$0) {
      return cjx.a($$0 >> 24 & 0xFF);
   }

   public static bxr.b u(int $$0) {
      return bxr.b.a($$0 & 65535);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr());
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

   private int gr() {
      return this.an.b(d);
   }

   public cjx go() {
      return s(this.gr());
   }

   public cjx gp() {
      return t(this.gr());
   }

   public bxr.b gq() {
      return u(this.gr());
   }

   public void a(bxr.b $$0) {
      int $$1 = this.gr();
      cjx $$2 = s($$1);
      cjx $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(clj $$0) {
      super.l($$0);
      rz $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gr());
   }

   @Override
   public clj b() {
      return new clj(clm.qF);
   }

   @Override
   protected aqq y() {
      return aqr.yu;
   }

   @Override
   protected aqq m_() {
      return aqr.yv;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.yx;
   }

   @Override
   protected aqq gg() {
      return aqr.yw;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == blk.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         ats $$5 = $$0.E_();
         bxr.d $$7;
         if ($$3 instanceof bxr.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bxr.c(this, $$7);
         } else {
            this.e = false;
            bxr.b[] $$9 = bxr.b.values();
            cjx[] $$10 = cjx.values();
            bxr.b $$11 = ac.a($$9, $$5);
            cjx $$12 = ac.a($$10, $$5);
            cjx $$13 = ac.a($$10, $$5);
            $$7 = new bxr.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bku<bxr> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.b_($$3.d()).a(arl.a) && $$1.a_($$3.c()).a(cvc.G) && ($$1.s($$3).a(arf.am) || bxt.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements aug {
      a("kob", bxr.a.a, 0),
      b("sunstreak", bxr.a.a, 1),
      c("snooper", bxr.a.a, 2),
      d("dasher", bxr.a.a, 3),
      e("brinely", bxr.a.a, 4),
      f("spotty", bxr.a.a, 5),
      g("flopper", bxr.a.b, 0),
      h("stripey", bxr.a.b, 1),
      i("glitter", bxr.a.b, 2),
      j("blockfish", bxr.a.b, 3),
      k("betty", bxr.a.b, 4),
      l("clayfish", bxr.a.b, 5);

      public static final Codec<bxr.b> m = aug.a(bxr.b::values);
      private static final IntFunction<bxr.b> n = asf.a(bxr.b::b, values(), a);
      private final String o;
      private final ur p;
      private final bxr.a q;
      private final int r;

      private b(String $$0, bxr.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = ur.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bxr.b a(int $$0) {
         return n.apply($$0);
      }

      public bxr.a a() {
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

   static class c extends bwq.a {
      final bxr.d b;

      c(bxr $$0, bxr.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bxr.b a, cjx b, cjx c) {
      public int a() {
         return bxr.a(this.a, this.b, this.c);
      }

      public bxr.b b() {
         return this.a;
      }

      public cjx c() {
         return this.b;
      }

      public cjx d() {
         return this.c;
      }
   }
}
