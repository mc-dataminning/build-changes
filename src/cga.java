import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cga extends cez implements buk<cga.b> {
   public static final String b = "BucketVariantTag";
   private static final akg<Integer> d = akk.a(cga.class, aki.b);
   public static final List<cga.d> c = List.of(
      new cga.d(cga.b.h, ctd.b, ctd.h),
      new cga.d(cga.b.g, ctd.h, ctd.h),
      new cga.d(cga.b.g, ctd.h, ctd.l),
      new cga.d(cga.b.l, ctd.a, ctd.h),
      new cga.d(cga.b.b, ctd.l, ctd.h),
      new cga.d(cga.b.a, ctd.b, ctd.a),
      new cga.d(cga.b.f, ctd.g, ctd.d),
      new cga.d(cga.b.j, ctd.k, ctd.e),
      new cga.d(cga.b.l, ctd.a, ctd.o),
      new cga.d(cga.b.f, ctd.a, ctd.e),
      new cga.d(cga.b.i, ctd.a, ctd.h),
      new cga.d(cga.b.l, ctd.a, ctd.b),
      new cga.d(cga.b.d, ctd.j, ctd.g),
      new cga.d(cga.b.e, ctd.f, ctd.d),
      new cga.d(cga.b.k, ctd.o, ctd.a),
      new cga.d(cga.b.c, ctd.h, ctd.o),
      new cga.d(cga.b.j, ctd.o, ctd.a),
      new cga.d(cga.b.g, ctd.a, ctd.e),
      new cga.d(cga.b.a, ctd.o, ctd.a),
      new cga.d(cga.b.b, ctd.h, ctd.a),
      new cga.d(cga.b.d, ctd.j, ctd.e),
      new cga.d(cga.b.g, ctd.e, ctd.e)
   );
   private boolean e = true;

   public cga(bsv<? extends cga> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cga.b $$0, ctd $$1, ctd $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ctd t(int $$0) {
      return ctd.a($$0 >> 16 & 0xFF);
   }

   public static ctd u(int $$0) {
      return ctd.a($$0 >> 24 & 0xFF);
   }

   public static cga.b v(int $$0) {
      return cga.b.a($$0 & 65535);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gC() {
      return this.ao.a(d);
   }

   public ctd gz() {
      return t(this.gC());
   }

   public ctd gA() {
      return u(this.gC());
   }

   public cga.b gB() {
      return v(this.gC());
   }

   public void a(cga.b $$0) {
      int $$1 = this.gC();
      ctd $$2 = t($$1);
      ctd $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuk $$0) {
      super.n($$0);
      cwz.a(km.M, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cuk b() {
      return new cuk(cun.qI);
   }

   @Override
   protected avv v() {
      return avw.zJ;
   }

   @Override
   protected avv o_() {
      return avw.zK;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.zM;
   }

   @Override
   protected avv gr() {
      return avw.zL;
   }

   @Override
   public void c(ur $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azc $$4 = $$0.E_();
      cga.d $$6;
      if ($$3 instanceof cga.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cga.c(this, $$6);
      } else {
         this.e = false;
         cga.b[] $$8 = cga.b.values();
         ctd[] $$9 = ctd.values();
         cga.b $$10 = ac.a($$8, $$4);
         ctd $$11 = ac.a($$9, $$4);
         ctd $$12 = ac.a($$9, $$4);
         $$6 = new cga.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bsv<cga> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.b_($$3.d()).a(awr.a) && $$1.a_($$3.c()).a(dew.G) && ($$1.t($$3).a(awk.an) || cgc.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azp {
      a("kob", cga.a.a, 0),
      b("sunstreak", cga.a.a, 1),
      c("snooper", cga.a.a, 2),
      d("dasher", cga.a.a, 3),
      e("brinely", cga.a.a, 4),
      f("spotty", cga.a.a, 5),
      g("flopper", cga.a.b, 0),
      h("stripey", cga.a.b, 1),
      i("glitter", cga.a.b, 2),
      j("blockfish", cga.a.b, 3),
      k("betty", cga.a.b, 4),
      l("clayfish", cga.a.b, 5);

      public static final Codec<cga.b> m = azp.a(cga.b::values);
      private static final IntFunction<cga.b> n = axl.a(cga.b::b, values(), a);
      private final String o;
      private final xl p;
      private final cga.a q;
      private final int r;

      private b(final String $$0, final cga.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xl.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cga.b a(int $$0) {
         return n.apply($$0);
      }

      public cga.a a() {
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

   static class c extends cez.a {
      final cga.d b;

      c(cga $$0, cga.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cga.b b, ctd c, ctd d) {
      public static final Codec<cga.d> a = Codec.INT.xmap(cga.d::new, cga.d::a);

      public d(int $$0) {
         this(cga.v($$0), cga.t($$0), cga.u($$0));
      }

      public int a() {
         return cga.a(this.b, this.c, this.d);
      }
   }
}
