import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgv extends cft implements bve<cgv.b> {
   public static final String b = "BucketVariantTag";
   private static final akg<Integer> d = akk.a(cgv.class, aki.b);
   public static final List<cgv.d> c = List.of(
      new cgv.d(cgv.b.h, cue.b, cue.h),
      new cgv.d(cgv.b.g, cue.h, cue.h),
      new cgv.d(cgv.b.g, cue.h, cue.l),
      new cgv.d(cgv.b.l, cue.a, cue.h),
      new cgv.d(cgv.b.b, cue.l, cue.h),
      new cgv.d(cgv.b.a, cue.b, cue.a),
      new cgv.d(cgv.b.f, cue.g, cue.d),
      new cgv.d(cgv.b.j, cue.k, cue.e),
      new cgv.d(cgv.b.l, cue.a, cue.o),
      new cgv.d(cgv.b.f, cue.a, cue.e),
      new cgv.d(cgv.b.i, cue.a, cue.h),
      new cgv.d(cgv.b.l, cue.a, cue.b),
      new cgv.d(cgv.b.d, cue.j, cue.g),
      new cgv.d(cgv.b.e, cue.f, cue.d),
      new cgv.d(cgv.b.k, cue.o, cue.a),
      new cgv.d(cgv.b.c, cue.h, cue.o),
      new cgv.d(cgv.b.j, cue.o, cue.a),
      new cgv.d(cgv.b.g, cue.a, cue.e),
      new cgv.d(cgv.b.a, cue.o, cue.a),
      new cgv.d(cgv.b.b, cue.h, cue.a),
      new cgv.d(cgv.b.d, cue.j, cue.e),
      new cgv.d(cgv.b.g, cue.e, cue.e)
   );
   private boolean bZ = true;

   public cgv(btq<? extends cgv> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgv.b $$0, cue $$1, cue $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cue c(int $$0) {
      return cue.a($$0 >> 16 & 0xFF);
   }

   public static cue s(int $$0) {
      return cue.a($$0 >> 24 & 0xFF);
   }

   public static cgv.b t(int $$0) {
      return cgv.b.a($$0 & 65535);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean r(int $$0) {
      return !this.bZ;
   }

   private int gA() {
      return this.am.a(d);
   }

   public cue gx() {
      return c(this.gA());
   }

   public cue gy() {
      return s(this.gA());
   }

   public cgv.b gz() {
      return t(this.gA());
   }

   public void a(cgv.b $$0) {
      int $$1 = this.gA();
      cue $$2 = c($$1);
      cue $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void o(cvl $$0) {
      super.o($$0);
      cya.a(kr.P, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gA()));
   }

   @Override
   public cvl V_() {
      return new cvl(cvo.qJ);
   }

   @Override
   protected awc w() {
      return awd.zS;
   }

   @Override
   protected awc n_() {
      return awd.zT;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.zV;
   }

   @Override
   protected awc gp() {
      return awd.zU;
   }

   @Override
   public void h(uf $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azk $$4 = $$0.C_();
      cgv.d $$6;
      if ($$3 instanceof cgv.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new cgv.c(this, $$6);
      } else {
         this.bZ = false;
         cgv.b[] $$8 = cgv.b.values();
         cue[] $$9 = cue.values();
         cgv.b $$10 = ad.a($$8, $$4);
         cue $$11 = ad.a($$9, $$4);
         cue $$12 = ad.a($$9, $$4);
         $$6 = new cgv.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(btq<cgv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.b_($$3.e()).a(awy.a) && $$1.a_($$3.d()).a(dgx.G) && ($$1.t($$3).a(awr.an) || cgx.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azy {
      a("kob", cgv.a.a, 0),
      b("sunstreak", cgv.a.a, 1),
      c("snooper", cgv.a.a, 2),
      d("dasher", cgv.a.a, 3),
      e("brinely", cgv.a.a, 4),
      f("spotty", cgv.a.a, 5),
      g("flopper", cgv.a.b, 0),
      h("stripey", cgv.a.b, 1),
      i("glitter", cgv.a.b, 2),
      j("blockfish", cgv.a.b, 3),
      k("betty", cgv.a.b, 4),
      l("clayfish", cgv.a.b, 5);

      public static final Codec<cgv.b> m = azy.a(cgv.b::values);
      private static final IntFunction<cgv.b> n = axt.a(cgv.b::b, values(), a);
      private final String o;
      private final xd p;
      private final cgv.a q;
      private final int r;

      private b(final String $$0, final cgv.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xd.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgv.b a(int $$0) {
         return n.apply($$0);
      }

      public cgv.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xd d() {
         return this.p;
      }
   }

   static class c extends cft.a {
      final cgv.d b;

      c(cgv $$0, cgv.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgv.b b, cue c, cue d) {
      public static final Codec<cgv.d> a = Codec.INT.xmap(cgv.d::new, cgv.d::a);

      public d(int $$0) {
         this(cgv.t($$0), cgv.c($$0), cgv.s($$0));
      }

      public int a() {
         return cgv.a(this.b, this.c, this.d);
      }
   }
}
