import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgd extends cfc implements bun<cgd.b> {
   public static final String b = "BucketVariantTag";
   private static final akj<Integer> d = akn.a(cgd.class, akl.b);
   public static final List<cgd.d> c = List.of(
      new cgd.d(cgd.b.h, ctg.b, ctg.h),
      new cgd.d(cgd.b.g, ctg.h, ctg.h),
      new cgd.d(cgd.b.g, ctg.h, ctg.l),
      new cgd.d(cgd.b.l, ctg.a, ctg.h),
      new cgd.d(cgd.b.b, ctg.l, ctg.h),
      new cgd.d(cgd.b.a, ctg.b, ctg.a),
      new cgd.d(cgd.b.f, ctg.g, ctg.d),
      new cgd.d(cgd.b.j, ctg.k, ctg.e),
      new cgd.d(cgd.b.l, ctg.a, ctg.o),
      new cgd.d(cgd.b.f, ctg.a, ctg.e),
      new cgd.d(cgd.b.i, ctg.a, ctg.h),
      new cgd.d(cgd.b.l, ctg.a, ctg.b),
      new cgd.d(cgd.b.d, ctg.j, ctg.g),
      new cgd.d(cgd.b.e, ctg.f, ctg.d),
      new cgd.d(cgd.b.k, ctg.o, ctg.a),
      new cgd.d(cgd.b.c, ctg.h, ctg.o),
      new cgd.d(cgd.b.j, ctg.o, ctg.a),
      new cgd.d(cgd.b.g, ctg.a, ctg.e),
      new cgd.d(cgd.b.a, ctg.o, ctg.a),
      new cgd.d(cgd.b.b, ctg.h, ctg.a),
      new cgd.d(cgd.b.d, ctg.j, ctg.e),
      new cgd.d(cgd.b.g, ctg.e, ctg.e)
   );
   private boolean e = true;

   public cgd(bsy<? extends cgd> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgd.b $$0, ctg $$1, ctg $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ctg t(int $$0) {
      return ctg.a($$0 >> 16 & 0xFF);
   }

   public static ctg u(int $$0) {
      return ctg.a($$0 >> 24 & 0xFF);
   }

   public static cgd.b v(int $$0) {
      return cgd.b.a($$0 & 65535);
   }

   @Override
   protected void a(akn.a $$0) {
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

   public ctg gz() {
      return t(this.gC());
   }

   public ctg gA() {
      return u(this.gC());
   }

   public cgd.b gB() {
      return v(this.gC());
   }

   public void a(cgd.b $$0) {
      int $$1 = this.gC();
      ctg $$2 = t($$1);
      ctg $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cun $$0) {
      super.n($$0);
      cxc.a(km.M, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cun b() {
      return new cun(cuq.qI);
   }

   @Override
   protected avy v() {
      return avz.zJ;
   }

   @Override
   protected avy o_() {
      return avz.zK;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.zM;
   }

   @Override
   protected avy gr() {
      return avz.zL;
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azf $$4 = $$0.E_();
      cgd.d $$6;
      if ($$3 instanceof cgd.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cgd.c(this, $$6);
      } else {
         this.e = false;
         cgd.b[] $$8 = cgd.b.values();
         ctg[] $$9 = ctg.values();
         cgd.b $$10 = ac.a($$8, $$4);
         ctg $$11 = ac.a($$9, $$4);
         ctg $$12 = ac.a($$9, $$4);
         $$6 = new cgd.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bsy<cgd> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.b_($$3.d()).a(awu.a) && $$1.a_($$3.c()).a(dez.G) && ($$1.t($$3).a(awn.an) || cgf.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azs {
      a("kob", cgd.a.a, 0),
      b("sunstreak", cgd.a.a, 1),
      c("snooper", cgd.a.a, 2),
      d("dasher", cgd.a.a, 3),
      e("brinely", cgd.a.a, 4),
      f("spotty", cgd.a.a, 5),
      g("flopper", cgd.a.b, 0),
      h("stripey", cgd.a.b, 1),
      i("glitter", cgd.a.b, 2),
      j("blockfish", cgd.a.b, 3),
      k("betty", cgd.a.b, 4),
      l("clayfish", cgd.a.b, 5);

      public static final Codec<cgd.b> m = azs.a(cgd.b::values);
      private static final IntFunction<cgd.b> n = axo.a(cgd.b::b, values(), a);
      private final String o;
      private final xo p;
      private final cgd.a q;
      private final int r;

      private b(final String $$0, final cgd.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xo.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgd.b a(int $$0) {
         return n.apply($$0);
      }

      public cgd.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xo d() {
         return this.p;
      }
   }

   static class c extends cfc.a {
      final cgd.d b;

      c(cgd $$0, cgd.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgd.b b, ctg c, ctg d) {
      public static final Codec<cgd.d> a = Codec.INT.xmap(cgd.d::new, cgd.d::a);

      public d(int $$0) {
         this(cgd.v($$0), cgd.t($$0), cgd.u($$0));
      }

      public int a() {
         return cgd.a(this.b, this.c, this.d);
      }
   }
}
