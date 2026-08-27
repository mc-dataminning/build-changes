import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byi extends bxh implements bmt<byi.b> {
   public static final String b = "BucketVariantTag";
   private static final afz<Integer> d = agc.a(byi.class, agb.b);
   public static final List<byi.d> c = List.of(
      new byi.d(byi.b.h, ckv.b, ckv.h),
      new byi.d(byi.b.g, ckv.h, ckv.h),
      new byi.d(byi.b.g, ckv.h, ckv.l),
      new byi.d(byi.b.l, ckv.a, ckv.h),
      new byi.d(byi.b.b, ckv.l, ckv.h),
      new byi.d(byi.b.a, ckv.b, ckv.a),
      new byi.d(byi.b.f, ckv.g, ckv.d),
      new byi.d(byi.b.j, ckv.k, ckv.e),
      new byi.d(byi.b.l, ckv.a, ckv.o),
      new byi.d(byi.b.f, ckv.a, ckv.e),
      new byi.d(byi.b.i, ckv.a, ckv.h),
      new byi.d(byi.b.l, ckv.a, ckv.b),
      new byi.d(byi.b.d, ckv.j, ckv.g),
      new byi.d(byi.b.e, ckv.f, ckv.d),
      new byi.d(byi.b.k, ckv.o, ckv.a),
      new byi.d(byi.b.c, ckv.h, ckv.o),
      new byi.d(byi.b.j, ckv.o, ckv.a),
      new byi.d(byi.b.g, ckv.a, ckv.e),
      new byi.d(byi.b.a, ckv.o, ckv.a),
      new byi.d(byi.b.b, ckv.h, ckv.a),
      new byi.d(byi.b.d, ckv.j, ckv.e),
      new byi.d(byi.b.g, ckv.e, ckv.e)
   );
   private boolean e = true;

   public byi(blj<? extends byi> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(byi.b $$0, ckv $$1, ckv $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ckv s(int $$0) {
      return ckv.a($$0 >> 16 & 0xFF);
   }

   public static ckv t(int $$0) {
      return ckv.a($$0 >> 24 & 0xFF);
   }

   public static byi.b u(int $$0) {
      return byi.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(sj $$0) {
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

   public ckv gn() {
      return s(this.gq());
   }

   public ckv go() {
      return t(this.gq());
   }

   public byi.b gp() {
      return u(this.gq());
   }

   public void a(byi.b $$0) {
      int $$1 = this.gq();
      ckv $$2 = s($$1);
      ckv $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cmh $$0) {
      super.l($$0);
      sj $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public cmh b() {
      return new cmh(cmk.qF);
   }

   @Override
   protected arb y() {
      return arc.yP;
   }

   @Override
   protected arb n_() {
      return arc.yQ;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.yS;
   }

   @Override
   protected arb gf() {
      return arc.yR;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == blz.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         auf $$5 = $$0.F_();
         byi.d $$7;
         if ($$3 instanceof byi.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new byi.c(this, $$7);
         } else {
            this.e = false;
            byi.b[] $$9 = byi.b.values();
            ckv[] $$10 = ckv.values();
            byi.b $$11 = ac.a($$9, $$5);
            ckv $$12 = ac.a($$10, $$5);
            ckv $$13 = ac.a($$10, $$5);
            $$7 = new byi.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(blj<byi> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.b_($$3.d()).a(arw.a) && $$1.a_($$3.c()).a(cwb.G) && ($$1.s($$3).a(arq.an) || byk.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements aut {
      a("kob", byi.a.a, 0),
      b("sunstreak", byi.a.a, 1),
      c("snooper", byi.a.a, 2),
      d("dasher", byi.a.a, 3),
      e("brinely", byi.a.a, 4),
      f("spotty", byi.a.a, 5),
      g("flopper", byi.a.b, 0),
      h("stripey", byi.a.b, 1),
      i("glitter", byi.a.b, 2),
      j("blockfish", byi.a.b, 3),
      k("betty", byi.a.b, 4),
      l("clayfish", byi.a.b, 5);

      public static final Codec<byi.b> m = aut.a(byi.b::values);
      private static final IntFunction<byi.b> n = asq.a(byi.b::b, values(), a);
      private final String o;
      private final vb p;
      private final byi.a q;
      private final int r;

      private b(String $$0, byi.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vb.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static byi.b a(int $$0) {
         return n.apply($$0);
      }

      public byi.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vb d() {
         return this.p;
      }
   }

   static class c extends bxh.a {
      final byi.d b;

      c(byi $$0, byi.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(byi.b a, ckv b, ckv c) {
      public int a() {
         return byi.a(this.a, this.b, this.c);
      }

      public byi.b b() {
         return this.a;
      }

      public ckv c() {
         return this.b;
      }

      public ckv d() {
         return this.c;
      }
   }
}
