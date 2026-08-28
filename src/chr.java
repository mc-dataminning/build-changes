import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chr extends cgp implements bwa<chr.b> {
   public static final String b = "BucketVariantTag";
   private static final akl<Integer> d = akp.a(chr.class, akn.b);
   public static final List<chr.d> c = List.of(
      new chr.d(chr.b.h, cuy.b, cuy.h),
      new chr.d(chr.b.g, cuy.h, cuy.h),
      new chr.d(chr.b.g, cuy.h, cuy.l),
      new chr.d(chr.b.l, cuy.a, cuy.h),
      new chr.d(chr.b.b, cuy.l, cuy.h),
      new chr.d(chr.b.a, cuy.b, cuy.a),
      new chr.d(chr.b.f, cuy.g, cuy.d),
      new chr.d(chr.b.j, cuy.k, cuy.e),
      new chr.d(chr.b.l, cuy.a, cuy.o),
      new chr.d(chr.b.f, cuy.a, cuy.e),
      new chr.d(chr.b.i, cuy.a, cuy.h),
      new chr.d(chr.b.l, cuy.a, cuy.b),
      new chr.d(chr.b.d, cuy.j, cuy.g),
      new chr.d(chr.b.e, cuy.f, cuy.d),
      new chr.d(chr.b.k, cuy.o, cuy.a),
      new chr.d(chr.b.c, cuy.h, cuy.o),
      new chr.d(chr.b.j, cuy.o, cuy.a),
      new chr.d(chr.b.g, cuy.a, cuy.e),
      new chr.d(chr.b.a, cuy.o, cuy.a),
      new chr.d(chr.b.b, cuy.h, cuy.a),
      new chr.d(chr.b.d, cuy.j, cuy.e),
      new chr.d(chr.b.g, cuy.e, cuy.e)
   );
   private boolean bY = true;

   public chr(bul<? extends chr> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chr.b $$0, cuy $$1, cuy $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cuy c(int $$0) {
      return cuy.a($$0 >> 16 & 0xFF);
   }

   public static cuy s(int $$0) {
      return cuy.a($$0 >> 24 & 0xFF);
   }

   public static chr.b t(int $$0) {
      return chr.b.a($$0 & 65535);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gG());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean r(int $$0) {
      return !this.bY;
   }

   private int gG() {
      return this.am.a(d);
   }

   public cuy gD() {
      return c(this.gG());
   }

   public cuy gE() {
      return s(this.gG());
   }

   public chr.b gF() {
      return t(this.gG());
   }

   public void a(chr.b $$0) {
      int $$1 = this.gG();
      cuy $$2 = c($$1);
      cuy $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void k(cwb $$0) {
      super.k($$0);
      cyk.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gG()));
   }

   @Override
   public cwb X_() {
      return new cwb(cwf.qJ);
   }

   @Override
   protected awk w() {
      return awl.zQ;
   }

   @Override
   protected awk o_() {
      return awl.zR;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.zT;
   }

   @Override
   protected awk gv() {
      return awl.zS;
   }

   @Override
   public void h(uk $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.E_();
      chr.d $$6;
      if ($$3 instanceof chr.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(c, $$4);
         $$3 = new chr.c(this, $$6);
      } else {
         this.bY = false;
         chr.b[] $$8 = chr.b.values();
         cuy[] $$9 = cuy.values();
         chr.b $$10 = ae.a($$8, $$4);
         cuy $$11 = ae.a($$9, $$4);
         cuy $$12 = ae.a($$9, $$4);
         $$6 = new chr.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bul<chr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.b_($$3.e()).a(axg.a) && $$1.a_($$3.d()).a(dig.G) && ($$1.t($$3).a(awz.an) || cht.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bag {
      a("kob", chr.a.a, 0),
      b("sunstreak", chr.a.a, 1),
      c("snooper", chr.a.a, 2),
      d("dasher", chr.a.a, 3),
      e("brinely", chr.a.a, 4),
      f("spotty", chr.a.a, 5),
      g("flopper", chr.a.b, 0),
      h("stripey", chr.a.b, 1),
      i("glitter", chr.a.b, 2),
      j("blockfish", chr.a.b, 3),
      k("betty", chr.a.b, 4),
      l("clayfish", chr.a.b, 5);

      public static final Codec<chr.b> m = bag.a(chr.b::values);
      private static final IntFunction<chr.b> n = ayb.a(chr.b::b, values(), a);
      private final String o;
      private final xi p;
      private final chr.a q;
      private final int r;

      private b(final String $$0, final chr.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xi.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chr.b a(int $$0) {
         return n.apply($$0);
      }

      public chr.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xi d() {
         return this.p;
      }
   }

   static class c extends cgp.a {
      final chr.d b;

      c(chr $$0, chr.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chr.b b, cuy c, cuy d) {
      public static final Codec<chr.d> a = Codec.INT.xmap(chr.d::new, chr.d::a);

      public d(int $$0) {
         this(chr.t($$0), chr.c($$0), chr.s($$0));
      }

      public int a() {
         return chr.a(this.b, this.c, this.d);
      }
   }
}
