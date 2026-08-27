import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cax extends bzw implements bph<cax.b> {
   public static final String b = "BucketVariantTag";
   private static final aie<Integer> d = aih.a(cax.class, aig.b);
   public static final List<cax.d> c = List.of(
      new cax.d(cax.b.h, cnr.b, cnr.h),
      new cax.d(cax.b.g, cnr.h, cnr.h),
      new cax.d(cax.b.g, cnr.h, cnr.l),
      new cax.d(cax.b.l, cnr.a, cnr.h),
      new cax.d(cax.b.b, cnr.l, cnr.h),
      new cax.d(cax.b.a, cnr.b, cnr.a),
      new cax.d(cax.b.f, cnr.g, cnr.d),
      new cax.d(cax.b.j, cnr.k, cnr.e),
      new cax.d(cax.b.l, cnr.a, cnr.o),
      new cax.d(cax.b.f, cnr.a, cnr.e),
      new cax.d(cax.b.i, cnr.a, cnr.h),
      new cax.d(cax.b.l, cnr.a, cnr.b),
      new cax.d(cax.b.d, cnr.j, cnr.g),
      new cax.d(cax.b.e, cnr.f, cnr.d),
      new cax.d(cax.b.k, cnr.o, cnr.a),
      new cax.d(cax.b.c, cnr.h, cnr.o),
      new cax.d(cax.b.j, cnr.o, cnr.a),
      new cax.d(cax.b.g, cnr.a, cnr.e),
      new cax.d(cax.b.a, cnr.o, cnr.a),
      new cax.d(cax.b.b, cnr.h, cnr.a),
      new cax.d(cax.b.d, cnr.j, cnr.e),
      new cax.d(cax.b.g, cnr.e, cnr.e)
   );
   private boolean e = true;

   public cax(bnw<? extends cax> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cax.b $$0, cnr $$1, cnr $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cnr t(int $$0) {
      return cnr.a($$0 >> 16 & 0xFF);
   }

   public static cnr u(int $$0) {
      return cnr.a($$0 >> 24 & 0xFF);
   }

   public static cax.b v(int $$0) {
      return cax.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gs());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gs() {
      return this.am.b(d);
   }

   public cnr gp() {
      return t(this.gs());
   }

   public cnr gq() {
      return u(this.gs());
   }

   public cax.b gr() {
      return v(this.gs());
   }

   public void a(cax.b $$0) {
      int $$1 = this.gs();
      cnr $$2 = t($$1);
      cnr $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void l(cpd $$0) {
      super.l($$0);
      sw $$1 = $$0.x();
      $$1.a("BucketVariantTag", this.gs());
   }

   @Override
   public cpd b() {
      return new cpd(cpg.qH);
   }

   @Override
   protected atk y() {
      return atl.zf;
   }

   @Override
   protected atk n_() {
      return atl.zg;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.zi;
   }

   @Override
   protected atk gh() {
      return atl.zh;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bom.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.w($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         awp $$5 = $$0.F_();
         cax.d $$7;
         if ($$3 instanceof cax.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new cax.c(this, $$7);
         } else {
            this.e = false;
            cax.b[] $$9 = cax.b.values();
            cnr[] $$10 = cnr.values();
            cax.b $$11 = ac.a($$9, $$5);
            cnr $$12 = ac.a($$10, $$5);
            cnr $$13 = ac.a($$10, $$5);
            $$7 = new cax.d($$11, $$12, $$13);
         }

         this.w($$7.a());
         return $$3;
      }
   }

   public static boolean b(bnw<cax> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.b_($$3.d()).a(auf.a) && $$1.a_($$3.c()).a(cyu.G) && ($$1.t($$3).a(atz.an) || caz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements axc {
      a("kob", cax.a.a, 0),
      b("sunstreak", cax.a.a, 1),
      c("snooper", cax.a.a, 2),
      d("dasher", cax.a.a, 3),
      e("brinely", cax.a.a, 4),
      f("spotty", cax.a.a, 5),
      g("flopper", cax.a.b, 0),
      h("stripey", cax.a.b, 1),
      i("glitter", cax.a.b, 2),
      j("blockfish", cax.a.b, 3),
      k("betty", cax.a.b, 4),
      l("clayfish", cax.a.b, 5);

      public static final Codec<cax.b> m = axc.a(cax.b::values);
      private static final IntFunction<cax.b> n = ava.a(cax.b::b, values(), a);
      private final String o;
      private final vq p;
      private final cax.a q;
      private final int r;

      private b(String $$0, cax.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vq.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cax.b a(int $$0) {
         return n.apply($$0);
      }

      public cax.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vq d() {
         return this.p;
      }
   }

   static class c extends bzw.a {
      final cax.d b;

      c(cax $$0, cax.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cax.b a, cnr b, cnr c) {
      public int a() {
         return cax.a(this.a, this.b, this.c);
      }

      public cax.b b() {
         return this.a;
      }

      public cnr c() {
         return this.b;
      }

      public cnr d() {
         return this.c;
      }
   }
}
