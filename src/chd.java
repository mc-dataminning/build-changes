import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chd extends cgb implements bvm<chd.b> {
   public static final String b = "BucketVariantTag";
   private static final akh<Integer> d = akl.a(chd.class, akj.b);
   public static final List<chd.d> c = List.of(
      new chd.d(chd.b.h, cum.b, cum.h),
      new chd.d(chd.b.g, cum.h, cum.h),
      new chd.d(chd.b.g, cum.h, cum.l),
      new chd.d(chd.b.l, cum.a, cum.h),
      new chd.d(chd.b.b, cum.l, cum.h),
      new chd.d(chd.b.a, cum.b, cum.a),
      new chd.d(chd.b.f, cum.g, cum.d),
      new chd.d(chd.b.j, cum.k, cum.e),
      new chd.d(chd.b.l, cum.a, cum.o),
      new chd.d(chd.b.f, cum.a, cum.e),
      new chd.d(chd.b.i, cum.a, cum.h),
      new chd.d(chd.b.l, cum.a, cum.b),
      new chd.d(chd.b.d, cum.j, cum.g),
      new chd.d(chd.b.e, cum.f, cum.d),
      new chd.d(chd.b.k, cum.o, cum.a),
      new chd.d(chd.b.c, cum.h, cum.o),
      new chd.d(chd.b.j, cum.o, cum.a),
      new chd.d(chd.b.g, cum.a, cum.e),
      new chd.d(chd.b.a, cum.o, cum.a),
      new chd.d(chd.b.b, cum.h, cum.a),
      new chd.d(chd.b.d, cum.j, cum.e),
      new chd.d(chd.b.g, cum.e, cum.e)
   );
   private boolean bY = true;

   public chd(bty<? extends chd> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chd.b $$0, cum $$1, cum $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cum c(int $$0) {
      return cum.a($$0 >> 16 & 0xFF);
   }

   public static cum s(int $$0) {
      return cum.a($$0 >> 24 & 0xFF);
   }

   public static chd.b t(int $$0) {
      return chd.b.a($$0 & 65535);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
   }

   @Override
   public void a(ug $$0) {
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

   private int gA() {
      return this.am.a(d);
   }

   public cum gx() {
      return c(this.gA());
   }

   public cum gy() {
      return s(this.gA());
   }

   public chd.b gz() {
      return t(this.gA());
   }

   public void a(chd.b $$0) {
      int $$1 = this.gA();
      cum $$2 = c($$1);
      cum $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void m(cvs $$0) {
      super.m($$0);
      cyh.a(ks.S, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gA()));
   }

   @Override
   public cvs W_() {
      return new cvs(cvw.qJ);
   }

   @Override
   protected awf w() {
      return awg.zS;
   }

   @Override
   protected awf o_() {
      return awg.zT;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.zV;
   }

   @Override
   protected awf gp() {
      return awg.zU;
   }

   @Override
   public void h(ug $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azn $$4 = $$0.D_();
      chd.d $$6;
      if ($$3 instanceof chd.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new chd.c(this, $$6);
      } else {
         this.bY = false;
         chd.b[] $$8 = chd.b.values();
         cum[] $$9 = cum.values();
         chd.b $$10 = ad.a($$8, $$4);
         cum $$11 = ad.a($$9, $$4);
         cum $$12 = ad.a($$9, $$4);
         $$6 = new chd.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bty<chd> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.b_($$3.e()).a(axb.a) && $$1.a_($$3.d()).a(dho.G) && ($$1.t($$3).a(awu.an) || chf.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bab {
      a("kob", chd.a.a, 0),
      b("sunstreak", chd.a.a, 1),
      c("snooper", chd.a.a, 2),
      d("dasher", chd.a.a, 3),
      e("brinely", chd.a.a, 4),
      f("spotty", chd.a.a, 5),
      g("flopper", chd.a.b, 0),
      h("stripey", chd.a.b, 1),
      i("glitter", chd.a.b, 2),
      j("blockfish", chd.a.b, 3),
      k("betty", chd.a.b, 4),
      l("clayfish", chd.a.b, 5);

      public static final Codec<chd.b> m = bab.a(chd.b::values);
      private static final IntFunction<chd.b> n = axw.a(chd.b::b, values(), a);
      private final String o;
      private final xe p;
      private final chd.a q;
      private final int r;

      private b(final String $$0, final chd.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xe.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chd.b a(int $$0) {
         return n.apply($$0);
      }

      public chd.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xe d() {
         return this.p;
      }
   }

   static class c extends cgb.a {
      final chd.d b;

      c(chd $$0, chd.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chd.b b, cum c, cum d) {
      public static final Codec<chd.d> a = Codec.INT.xmap(chd.d::new, chd.d::a);

      public d(int $$0) {
         this(chd.t($$0), chd.c($$0), chd.s($$0));
      }

      public int a() {
         return chd.a(this.b, this.c, this.d);
      }
   }
}
