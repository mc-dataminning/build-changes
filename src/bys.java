import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bys extends bxr implements bnd<bys.b> {
   public static final String b = "BucketVariantTag";
   private static final agj<Integer> d = agm.a(bys.class, agl.b);
   public static final List<bys.d> c = List.of(
      new bys.d(bys.b.h, clf.b, clf.h),
      new bys.d(bys.b.g, clf.h, clf.h),
      new bys.d(bys.b.g, clf.h, clf.l),
      new bys.d(bys.b.l, clf.a, clf.h),
      new bys.d(bys.b.b, clf.l, clf.h),
      new bys.d(bys.b.a, clf.b, clf.a),
      new bys.d(bys.b.f, clf.g, clf.d),
      new bys.d(bys.b.j, clf.k, clf.e),
      new bys.d(bys.b.l, clf.a, clf.o),
      new bys.d(bys.b.f, clf.a, clf.e),
      new bys.d(bys.b.i, clf.a, clf.h),
      new bys.d(bys.b.l, clf.a, clf.b),
      new bys.d(bys.b.d, clf.j, clf.g),
      new bys.d(bys.b.e, clf.f, clf.d),
      new bys.d(bys.b.k, clf.o, clf.a),
      new bys.d(bys.b.c, clf.h, clf.o),
      new bys.d(bys.b.j, clf.o, clf.a),
      new bys.d(bys.b.g, clf.a, clf.e),
      new bys.d(bys.b.a, clf.o, clf.a),
      new bys.d(bys.b.b, clf.h, clf.a),
      new bys.d(bys.b.d, clf.j, clf.e),
      new bys.d(bys.b.g, clf.e, clf.e)
   );
   private boolean e = true;

   public bys(blt<? extends bys> $$0, cti $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bys.b $$0, clf $$1, clf $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static clf s(int $$0) {
      return clf.a($$0 >> 16 & 0xFF);
   }

   public static clf t(int $$0) {
      return clf.a($$0 >> 24 & 0xFF);
   }

   public static bys.b u(int $$0) {
      return bys.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(sl $$0) {
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

   public clf gn() {
      return s(this.gq());
   }

   public clf go() {
      return t(this.gq());
   }

   public bys.b gp() {
      return u(this.gq());
   }

   public void a(bys.b $$0) {
      int $$1 = this.gq();
      clf $$2 = s($$1);
      clf $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cmr $$0) {
      super.l($$0);
      sl $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public cmr b() {
      return new cmr(cmu.qF);
   }

   @Override
   protected arl y() {
      return arm.yP;
   }

   @Override
   protected arl n_() {
      return arm.yQ;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.yS;
   }

   @Override
   protected arl gf() {
      return arm.yR;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bmj.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         aup $$5 = $$0.F_();
         bys.d $$7;
         if ($$3 instanceof bys.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bys.c(this, $$7);
         } else {
            this.e = false;
            bys.b[] $$9 = bys.b.values();
            clf[] $$10 = clf.values();
            bys.b $$11 = ac.a($$9, $$5);
            clf $$12 = ac.a($$10, $$5);
            clf $$13 = ac.a($$10, $$5);
            $$7 = new bys.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(blt<bys> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.b_($$3.d()).a(asg.a) && $$1.a_($$3.c()).a(cwl.G) && ($$1.t($$3).a(asa.an) || byu.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ave {
      a("kob", bys.a.a, 0),
      b("sunstreak", bys.a.a, 1),
      c("snooper", bys.a.a, 2),
      d("dasher", bys.a.a, 3),
      e("brinely", bys.a.a, 4),
      f("spotty", bys.a.a, 5),
      g("flopper", bys.a.b, 0),
      h("stripey", bys.a.b, 1),
      i("glitter", bys.a.b, 2),
      j("blockfish", bys.a.b, 3),
      k("betty", bys.a.b, 4),
      l("clayfish", bys.a.b, 5);

      public static final Codec<bys.b> m = ave.a(bys.b::values);
      private static final IntFunction<bys.b> n = ata.a(bys.b::b, values(), a);
      private final String o;
      private final vd p;
      private final bys.a q;
      private final int r;

      private b(String $$0, bys.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vd.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bys.b a(int $$0) {
         return n.apply($$0);
      }

      public bys.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vd d() {
         return this.p;
      }
   }

   static class c extends bxr.a {
      final bys.d b;

      c(bys $$0, bys.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bys.b a, clf b, clf c) {
      public int a() {
         return bys.a(this.a, this.b, this.c);
      }

      public bys.b b() {
         return this.a;
      }

      public clf c() {
         return this.b;
      }

      public clf d() {
         return this.c;
      }
   }
}
