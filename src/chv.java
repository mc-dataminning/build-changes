import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chv extends cgt implements bwe<chv.b> {
   public static final String b = "BucketVariantTag";
   private static final ako<Integer> d = aks.a(chv.class, akq.b);
   public static final List<chv.d> c = List.of(
      new chv.d(chv.b.h, cvc.b, cvc.h),
      new chv.d(chv.b.g, cvc.h, cvc.h),
      new chv.d(chv.b.g, cvc.h, cvc.l),
      new chv.d(chv.b.l, cvc.a, cvc.h),
      new chv.d(chv.b.b, cvc.l, cvc.h),
      new chv.d(chv.b.a, cvc.b, cvc.a),
      new chv.d(chv.b.f, cvc.g, cvc.d),
      new chv.d(chv.b.j, cvc.k, cvc.e),
      new chv.d(chv.b.l, cvc.a, cvc.o),
      new chv.d(chv.b.f, cvc.a, cvc.e),
      new chv.d(chv.b.i, cvc.a, cvc.h),
      new chv.d(chv.b.l, cvc.a, cvc.b),
      new chv.d(chv.b.d, cvc.j, cvc.g),
      new chv.d(chv.b.e, cvc.f, cvc.d),
      new chv.d(chv.b.k, cvc.o, cvc.a),
      new chv.d(chv.b.c, cvc.h, cvc.o),
      new chv.d(chv.b.j, cvc.o, cvc.a),
      new chv.d(chv.b.g, cvc.a, cvc.e),
      new chv.d(chv.b.a, cvc.o, cvc.a),
      new chv.d(chv.b.b, cvc.h, cvc.a),
      new chv.d(chv.b.d, cvc.j, cvc.e),
      new chv.d(chv.b.g, cvc.e, cvc.e)
   );
   private boolean bY = true;

   public chv(bup<? extends chv> $$0, dff $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chv.b $$0, cvc $$1, cvc $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvc c(int $$0) {
      return cvc.a($$0 >> 16 & 0xFF);
   }

   public static cvc s(int $$0) {
      return cvc.a($$0 >> 24 & 0xFF);
   }

   public static chv.b t(int $$0) {
      return chv.b.a($$0 & 65535);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Variant", this.gH());
   }

   @Override
   public void a(un $$0) {
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

   private int gH() {
      return this.am.a(d);
   }

   public cvc gE() {
      return c(this.gH());
   }

   public cvc gF() {
      return s(this.gH());
   }

   public chv.b gG() {
      return t(this.gH());
   }

   public void a(chv.b $$0) {
      int $$1 = this.gH();
      cvc $$2 = c($$1);
      cvc $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void k(cwf $$0) {
      super.k($$0);
      cyo.a(ku.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gH()));
   }

   @Override
   public cwf X_() {
      return new cwf(cwj.qJ);
   }

   @Override
   protected awn w() {
      return awo.zQ;
   }

   @Override
   protected awn o_() {
      return awo.zR;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.zT;
   }

   @Override
   protected awn gw() {
      return awo.zS;
   }

   @Override
   public void h(un $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.E_();
      chv.d $$6;
      if ($$3 instanceof chv.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ae.a(c, $$4);
         $$3 = new chv.c(this, $$6);
      } else {
         this.bY = false;
         chv.b[] $$8 = chv.b.values();
         cvc[] $$9 = cvc.values();
         chv.b $$10 = ae.a($$8, $$4);
         cvc $$11 = ae.a($$9, $$4);
         cvc $$12 = ae.a($$9, $$4);
         $$6 = new chv.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bup<chv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.b_($$3.e()).a(axj.a) && $$1.a_($$3.d()).a(dil.G) && ($$1.t($$3).a(axc.an) || chx.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements baj {
      a("kob", chv.a.a, 0),
      b("sunstreak", chv.a.a, 1),
      c("snooper", chv.a.a, 2),
      d("dasher", chv.a.a, 3),
      e("brinely", chv.a.a, 4),
      f("spotty", chv.a.a, 5),
      g("flopper", chv.a.b, 0),
      h("stripey", chv.a.b, 1),
      i("glitter", chv.a.b, 2),
      j("blockfish", chv.a.b, 3),
      k("betty", chv.a.b, 4),
      l("clayfish", chv.a.b, 5);

      public static final Codec<chv.b> m = baj.a(chv.b::values);
      private static final IntFunction<chv.b> n = aye.a(chv.b::b, values(), a);
      private final String o;
      private final xl p;
      private final chv.a q;
      private final int r;

      private b(final String $$0, final chv.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xl.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chv.b a(int $$0) {
         return n.apply($$0);
      }

      public chv.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xl d() {
         return this.p;
      }
   }

   static class c extends cgt.a {
      final chv.d b;

      c(chv $$0, chv.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chv.b b, cvc c, cvc d) {
      public static final Codec<chv.d> a = Codec.INT.xmap(chv.d::new, chv.d::a);

      public d(int $$0) {
         this(chv.t($$0), chv.c($$0), chv.s($$0));
      }

      public int a() {
         return chv.a(this.b, this.c, this.d);
      }
   }
}
