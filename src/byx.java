import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byx extends bxw implements bni<byx.b> {
   public static final String b = "BucketVariantTag";
   private static final agm<Integer> d = agp.a(byx.class, ago.b);
   public static final List<byx.d> c = List.of(
      new byx.d(byx.b.h, cll.b, cll.h),
      new byx.d(byx.b.g, cll.h, cll.h),
      new byx.d(byx.b.g, cll.h, cll.l),
      new byx.d(byx.b.l, cll.a, cll.h),
      new byx.d(byx.b.b, cll.l, cll.h),
      new byx.d(byx.b.a, cll.b, cll.a),
      new byx.d(byx.b.f, cll.g, cll.d),
      new byx.d(byx.b.j, cll.k, cll.e),
      new byx.d(byx.b.l, cll.a, cll.o),
      new byx.d(byx.b.f, cll.a, cll.e),
      new byx.d(byx.b.i, cll.a, cll.h),
      new byx.d(byx.b.l, cll.a, cll.b),
      new byx.d(byx.b.d, cll.j, cll.g),
      new byx.d(byx.b.e, cll.f, cll.d),
      new byx.d(byx.b.k, cll.o, cll.a),
      new byx.d(byx.b.c, cll.h, cll.o),
      new byx.d(byx.b.j, cll.o, cll.a),
      new byx.d(byx.b.g, cll.a, cll.e),
      new byx.d(byx.b.a, cll.o, cll.a),
      new byx.d(byx.b.b, cll.h, cll.a),
      new byx.d(byx.b.d, cll.j, cll.e),
      new byx.d(byx.b.g, cll.e, cll.e)
   );
   private boolean e = true;

   public byx(bly<? extends byx> $$0, cto $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(byx.b $$0, cll $$1, cll $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cll s(int $$0) {
      return cll.a($$0 >> 16 & 0xFF);
   }

   public static cll t(int $$0) {
      return cll.a($$0 >> 24 & 0xFF);
   }

   public static byx.b u(int $$0) {
      return byx.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(sn $$0) {
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

   public cll gn() {
      return s(this.gq());
   }

   public cll go() {
      return t(this.gq());
   }

   public byx.b gp() {
      return u(this.gq());
   }

   public void a(byx.b $$0) {
      int $$1 = this.gq();
      cll $$2 = s($$1);
      cll $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cmx $$0) {
      super.l($$0);
      sn $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public cmx b() {
      return new cmx(cna.qF);
   }

   @Override
   protected arq y() {
      return arr.yP;
   }

   @Override
   protected arq n_() {
      return arr.yQ;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.yS;
   }

   @Override
   protected arq gf() {
      return arr.yR;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bmo.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         auu $$5 = $$0.F_();
         byx.d $$7;
         if ($$3 instanceof byx.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new byx.c(this, $$7);
         } else {
            this.e = false;
            byx.b[] $$9 = byx.b.values();
            cll[] $$10 = cll.values();
            byx.b $$11 = ac.a($$9, $$5);
            cll $$12 = ac.a($$10, $$5);
            cll $$13 = ac.a($$10, $$5);
            $$7 = new byx.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bly<byx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.b_($$3.d()).a(asl.a) && $$1.a_($$3.c()).a(cwr.G) && ($$1.t($$3).a(asf.an) || byz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements avj {
      a("kob", byx.a.a, 0),
      b("sunstreak", byx.a.a, 1),
      c("snooper", byx.a.a, 2),
      d("dasher", byx.a.a, 3),
      e("brinely", byx.a.a, 4),
      f("spotty", byx.a.a, 5),
      g("flopper", byx.a.b, 0),
      h("stripey", byx.a.b, 1),
      i("glitter", byx.a.b, 2),
      j("blockfish", byx.a.b, 3),
      k("betty", byx.a.b, 4),
      l("clayfish", byx.a.b, 5);

      public static final Codec<byx.b> m = avj.a(byx.b::values);
      private static final IntFunction<byx.b> n = atf.a(byx.b::b, values(), a);
      private final String o;
      private final vf p;
      private final byx.a q;
      private final int r;

      private b(String $$0, byx.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vf.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static byx.b a(int $$0) {
         return n.apply($$0);
      }

      public byx.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vf d() {
         return this.p;
      }
   }

   static class c extends bxw.a {
      final byx.d b;

      c(byx $$0, byx.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(byx.b a, cll b, cll c) {
      public int a() {
         return byx.a(this.a, this.b, this.c);
      }

      public byx.b b() {
         return this.a;
      }

      public cll c() {
         return this.b;
      }

      public cll d() {
         return this.c;
      }
   }
}
