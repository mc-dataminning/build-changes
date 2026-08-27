import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvt extends bus implements bkg<bvt.b> {
   public static final String b = "BucketVariantTag";
   private static final aeg<Integer> d = aej.a(bvt.class, aei.b);
   public static final List<bvt.d> c = List.of(
      new bvt.d(bvt.b.h, chv.b, chv.h),
      new bvt.d(bvt.b.g, chv.h, chv.h),
      new bvt.d(bvt.b.g, chv.h, chv.l),
      new bvt.d(bvt.b.l, chv.a, chv.h),
      new bvt.d(bvt.b.b, chv.l, chv.h),
      new bvt.d(bvt.b.a, chv.b, chv.a),
      new bvt.d(bvt.b.f, chv.g, chv.d),
      new bvt.d(bvt.b.j, chv.k, chv.e),
      new bvt.d(bvt.b.l, chv.a, chv.o),
      new bvt.d(bvt.b.f, chv.a, chv.e),
      new bvt.d(bvt.b.i, chv.a, chv.h),
      new bvt.d(bvt.b.l, chv.a, chv.b),
      new bvt.d(bvt.b.d, chv.j, chv.g),
      new bvt.d(bvt.b.e, chv.f, chv.d),
      new bvt.d(bvt.b.k, chv.o, chv.a),
      new bvt.d(bvt.b.c, chv.h, chv.o),
      new bvt.d(bvt.b.j, chv.o, chv.a),
      new bvt.d(bvt.b.g, chv.a, chv.e),
      new bvt.d(bvt.b.a, chv.o, chv.a),
      new bvt.d(bvt.b.b, chv.h, chv.a),
      new bvt.d(bvt.b.d, chv.j, chv.e),
      new bvt.d(bvt.b.g, chv.e, chv.e)
   );
   private boolean e = true;

   public bvt(biw<? extends bvt> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvt.b $$0, chv $$1, chv $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static chv s(int $$0) {
      return chv.a($$0 >> 16 & 0xFF);
   }

   public static chv t(int $$0) {
      return chv.a($$0 >> 24 & 0xFF);
   }

   public static bvt.b u(int $$0) {
      return bvt.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(qy $$0) {
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

   private int gp() {
      return this.an.b(d);
   }

   public chv gm() {
      return s(this.gp());
   }

   public chv gn() {
      return t(this.gp());
   }

   public bvt.b go() {
      return u(this.gp());
   }

   public void a(bvt.b $$0) {
      int $$1 = this.gp();
      chv $$2 = s($$1);
      chv $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cjh $$0) {
      super.l($$0);
      qy $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gp());
   }

   @Override
   public cjh b() {
      return new cjh(cjk.pU);
   }

   @Override
   protected ape w() {
      return apf.xZ;
   }

   @Override
   protected ape l_() {
      return apf.ya;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.yc;
   }

   @Override
   protected ape ge() {
      return apf.yb;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjm.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         ase $$5 = $$0.D_();
         bvt.d $$7;
         if ($$3 instanceof bvt.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvt.c(this, $$7);
         } else {
            this.e = false;
            bvt.b[] $$9 = bvt.b.values();
            chv[] $$10 = chv.values();
            bvt.b $$11 = ac.a($$9, $$5);
            chv $$12 = ac.a($$10, $$5);
            chv $$13 = ac.a($$10, $$5);
            $$7 = new bvt.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(biw<bvt> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.b_($$3.d()).a(apz.a) && $$1.a_($$3.c()).a(csy.G) && ($$1.s($$3).a(apt.am) || bvv.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements asr {
      a("kob", bvt.a.a, 0),
      b("sunstreak", bvt.a.a, 1),
      c("snooper", bvt.a.a, 2),
      d("dasher", bvt.a.a, 3),
      e("brinely", bvt.a.a, 4),
      f("spotty", bvt.a.a, 5),
      g("flopper", bvt.a.b, 0),
      h("stripey", bvt.a.b, 1),
      i("glitter", bvt.a.b, 2),
      j("blockfish", bvt.a.b, 3),
      k("betty", bvt.a.b, 4),
      l("clayfish", bvt.a.b, 5);

      public static final Codec<bvt.b> m = asr.a(bvt.b::values);
      private static final IntFunction<bvt.b> n = aqt.a(bvt.b::b, values(), a);
      private final String o;
      private final tn p;
      private final bvt.a q;
      private final int r;

      private b(String $$0, bvt.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = tn.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvt.b a(int $$0) {
         return n.apply($$0);
      }

      public bvt.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public tn d() {
         return this.p;
      }
   }

   static class c extends bus.a {
      final bvt.d b;

      c(bvt $$0, bvt.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvt.b a, chv b, chv c) {
      public int a() {
         return bvt.a(this.a, this.b, this.c);
      }

      public bvt.b b() {
         return this.a;
      }

      public chv c() {
         return this.b;
      }

      public chv d() {
         return this.c;
      }
   }
}
