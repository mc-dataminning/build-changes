import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bwu extends bvt implements blh<bwu.b> {
   public static final String b = "BucketVariantTag";
   private static final afc<Integer> d = aff.a(bwu.class, afe.b);
   public static final List<bwu.d> c = List.of(
      new bwu.d(bwu.b.h, cix.b, cix.h),
      new bwu.d(bwu.b.g, cix.h, cix.h),
      new bwu.d(bwu.b.g, cix.h, cix.l),
      new bwu.d(bwu.b.l, cix.a, cix.h),
      new bwu.d(bwu.b.b, cix.l, cix.h),
      new bwu.d(bwu.b.a, cix.b, cix.a),
      new bwu.d(bwu.b.f, cix.g, cix.d),
      new bwu.d(bwu.b.j, cix.k, cix.e),
      new bwu.d(bwu.b.l, cix.a, cix.o),
      new bwu.d(bwu.b.f, cix.a, cix.e),
      new bwu.d(bwu.b.i, cix.a, cix.h),
      new bwu.d(bwu.b.l, cix.a, cix.b),
      new bwu.d(bwu.b.d, cix.j, cix.g),
      new bwu.d(bwu.b.e, cix.f, cix.d),
      new bwu.d(bwu.b.k, cix.o, cix.a),
      new bwu.d(bwu.b.c, cix.h, cix.o),
      new bwu.d(bwu.b.j, cix.o, cix.a),
      new bwu.d(bwu.b.g, cix.a, cix.e),
      new bwu.d(bwu.b.a, cix.o, cix.a),
      new bwu.d(bwu.b.b, cix.h, cix.a),
      new bwu.d(bwu.b.d, cix.j, cix.e),
      new bwu.d(bwu.b.g, cix.e, cix.e)
   );
   private boolean e = true;

   public bwu(bjx<? extends bwu> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bwu.b $$0, cix $$1, cix $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cix s(int $$0) {
      return cix.a($$0 >> 16 & 0xFF);
   }

   public static cix t(int $$0) {
      return cix.a($$0 >> 24 & 0xFF);
   }

   public static bwu.b u(int $$0) {
      return bwu.b.a($$0 & 65535);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(rt $$0) {
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

   public cix gn() {
      return s(this.gq());
   }

   public cix go() {
      return t(this.gq());
   }

   public bwu.b gp() {
      return u(this.gq());
   }

   public void a(bwu.b $$0) {
      int $$1 = this.gq();
      cix $$2 = s($$1);
      cix $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(ckj $$0) {
      super.l($$0);
      rt $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public ckj b() {
      return new ckj(ckm.pU);
   }

   @Override
   protected aqc w() {
      return aqd.yb;
   }

   @Override
   protected aqc m_() {
      return aqd.yc;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.ye;
   }

   @Override
   protected aqc gf() {
      return aqd.yd;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bkn.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         ate $$5 = $$0.E_();
         bwu.d $$7;
         if ($$3 instanceof bwu.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bwu.c(this, $$7);
         } else {
            this.e = false;
            bwu.b[] $$9 = bwu.b.values();
            cix[] $$10 = cix.values();
            bwu.b $$11 = ac.a($$9, $$5);
            cix $$12 = ac.a($$10, $$5);
            cix $$13 = ac.a($$10, $$5);
            $$7 = new bwu.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bjx<bwu> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.b_($$3.d()).a(aqx.a) && $$1.a_($$3.c()).a(cuc.G) && ($$1.s($$3).a(aqr.am) || bww.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements atr {
      a("kob", bwu.a.a, 0),
      b("sunstreak", bwu.a.a, 1),
      c("snooper", bwu.a.a, 2),
      d("dasher", bwu.a.a, 3),
      e("brinely", bwu.a.a, 4),
      f("spotty", bwu.a.a, 5),
      g("flopper", bwu.a.b, 0),
      h("stripey", bwu.a.b, 1),
      i("glitter", bwu.a.b, 2),
      j("blockfish", bwu.a.b, 3),
      k("betty", bwu.a.b, 4),
      l("clayfish", bwu.a.b, 5);

      public static final Codec<bwu.b> m = atr.a(bwu.b::values);
      private static final IntFunction<bwu.b> n = arr.a(bwu.b::b, values(), a);
      private final String o;
      private final ui p;
      private final bwu.a q;
      private final int r;

      private b(String $$0, bwu.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = ui.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bwu.b a(int $$0) {
         return n.apply($$0);
      }

      public bwu.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public ui d() {
         return this.p;
      }
   }

   static class c extends bvt.a {
      final bwu.d b;

      c(bwu $$0, bwu.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bwu.b a, cix b, cix c) {
      public int a() {
         return bwu.a(this.a, this.b, this.c);
      }

      public bwu.b b() {
         return this.a;
      }

      public cix c() {
         return this.b;
      }

      public cix d() {
         return this.c;
      }
   }
}
