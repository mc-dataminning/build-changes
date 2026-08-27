import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bsl extends brk implements bgy<bsl.b> {
   public static final String b = "BucketVariantTag";
   private static final aby<Integer> d = acb.a(bsl.class, aca.b);
   public static final List<bsl.d> c = List.of(
      new bsl.d(bsl.b.h, cen.b, cen.h),
      new bsl.d(bsl.b.g, cen.h, cen.h),
      new bsl.d(bsl.b.g, cen.h, cen.l),
      new bsl.d(bsl.b.l, cen.a, cen.h),
      new bsl.d(bsl.b.b, cen.l, cen.h),
      new bsl.d(bsl.b.a, cen.b, cen.a),
      new bsl.d(bsl.b.f, cen.g, cen.d),
      new bsl.d(bsl.b.j, cen.k, cen.e),
      new bsl.d(bsl.b.l, cen.a, cen.o),
      new bsl.d(bsl.b.f, cen.a, cen.e),
      new bsl.d(bsl.b.i, cen.a, cen.h),
      new bsl.d(bsl.b.l, cen.a, cen.b),
      new bsl.d(bsl.b.d, cen.j, cen.g),
      new bsl.d(bsl.b.e, cen.f, cen.d),
      new bsl.d(bsl.b.k, cen.o, cen.a),
      new bsl.d(bsl.b.c, cen.h, cen.o),
      new bsl.d(bsl.b.j, cen.o, cen.a),
      new bsl.d(bsl.b.g, cen.a, cen.e),
      new bsl.d(bsl.b.a, cen.o, cen.a),
      new bsl.d(bsl.b.b, cen.h, cen.a),
      new bsl.d(bsl.b.d, cen.j, cen.e),
      new bsl.d(bsl.b.g, cen.e, cen.e)
   );
   private boolean e = true;

   public bsl(bfn<? extends bsl> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bsl.b $$0, cen $$1, cen $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cen s(int $$0) {
      return cen.a($$0 >> 16 & 0xFF);
   }

   public static cen t(int $$0) {
      return cen.a($$0 >> 24 & 0xFF);
   }

   public static bsl.b u(int $$0) {
      return bsl.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(d, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gk());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gk() {
      return this.am.b(d);
   }

   public cen gh() {
      return s(this.gk());
   }

   public cen gi() {
      return t(this.gk());
   }

   public bsl.b gj() {
      return u(this.gk());
   }

   public void a(bsl.b $$0) {
      int $$1 = this.gk();
      cen $$2 = s($$1);
      cen $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cfz $$0) {
      super.l($$0);
      qr $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gk());
   }

   @Override
   public cfz b() {
      return new cfz(cgc.pU);
   }

   @Override
   protected amg s() {
      return amh.xT;
   }

   @Override
   protected amg g_() {
      return amh.xU;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.xW;
   }

   @Override
   protected amg fZ() {
      return amh.xV;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bgd.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         apf $$5 = $$0.y_();
         bsl.d $$7;
         if ($$3 instanceof bsl.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bsl.c(this, $$7);
         } else {
            this.e = false;
            bsl.b[] $$9 = bsl.b.values();
            cen[] $$10 = cen.values();
            bsl.b $$11 = ac.a($$9, $$5);
            cen $$12 = ac.a($$10, $$5);
            cen $$13 = ac.a($$10, $$5);
            $$7 = new bsl.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bfn<bsl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.b_($$3.d()).a(anb.a) && $$1.a_($$3.c()).a(cpo.G) && ($$1.s($$3).a(amv.am) || bsn.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements apr {
      a("kob", bsl.a.a, 0),
      b("sunstreak", bsl.a.a, 1),
      c("snooper", bsl.a.a, 2),
      d("dasher", bsl.a.a, 3),
      e("brinely", bsl.a.a, 4),
      f("spotty", bsl.a.a, 5),
      g("flopper", bsl.a.b, 0),
      h("stripey", bsl.a.b, 1),
      i("glitter", bsl.a.b, 2),
      j("blockfish", bsl.a.b, 3),
      k("betty", bsl.a.b, 4),
      l("clayfish", bsl.a.b, 5);

      public static final Codec<bsl.b> m = apr.a(bsl.b::values);
      private static final IntFunction<bsl.b> n = anu.a(bsl.b::b, values(), a);
      private final String o;
      private final sw p;
      private final bsl.a q;
      private final int r;

      private b(String $$0, bsl.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = sw.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bsl.b a(int $$0) {
         return n.apply($$0);
      }

      public bsl.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public sw d() {
         return this.p;
      }
   }

   static class c extends brk.a {
      final bsl.d b;

      c(bsl $$0, bsl.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bsl.b a, cen b, cen c) {
      public int a() {
         return bsl.a(this.a, this.b, this.c);
      }

      public bsl.b b() {
         return this.a;
      }

      public cen c() {
         return this.b;
      }

      public cen d() {
         return this.c;
      }
   }
}
