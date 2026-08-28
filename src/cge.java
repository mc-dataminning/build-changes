import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cge extends cfd implements buo<cge.b> {
   public static final String b = "BucketVariantTag";
   private static final akj<Integer> d = akn.a(cge.class, akl.b);
   public static final List<cge.d> c = List.of(
      new cge.d(cge.b.h, cth.b, cth.h),
      new cge.d(cge.b.g, cth.h, cth.h),
      new cge.d(cge.b.g, cth.h, cth.l),
      new cge.d(cge.b.l, cth.a, cth.h),
      new cge.d(cge.b.b, cth.l, cth.h),
      new cge.d(cge.b.a, cth.b, cth.a),
      new cge.d(cge.b.f, cth.g, cth.d),
      new cge.d(cge.b.j, cth.k, cth.e),
      new cge.d(cge.b.l, cth.a, cth.o),
      new cge.d(cge.b.f, cth.a, cth.e),
      new cge.d(cge.b.i, cth.a, cth.h),
      new cge.d(cge.b.l, cth.a, cth.b),
      new cge.d(cge.b.d, cth.j, cth.g),
      new cge.d(cge.b.e, cth.f, cth.d),
      new cge.d(cge.b.k, cth.o, cth.a),
      new cge.d(cge.b.c, cth.h, cth.o),
      new cge.d(cge.b.j, cth.o, cth.a),
      new cge.d(cge.b.g, cth.a, cth.e),
      new cge.d(cge.b.a, cth.o, cth.a),
      new cge.d(cge.b.b, cth.h, cth.a),
      new cge.d(cge.b.d, cth.j, cth.e),
      new cge.d(cge.b.g, cth.e, cth.e)
   );
   private boolean e = true;

   public cge(bsz<? extends cge> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cge.b $$0, cth $$1, cth $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cth t(int $$0) {
      return cth.a($$0 >> 16 & 0xFF);
   }

   public static cth u(int $$0) {
      return cth.a($$0 >> 24 & 0xFF);
   }

   public static cge.b v(int $$0) {
      return cge.b.a($$0 & 65535);
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

   public cth gz() {
      return t(this.gC());
   }

   public cth gA() {
      return u(this.gC());
   }

   public cge.b gB() {
      return v(this.gC());
   }

   public void a(cge.b $$0) {
      int $$1 = this.gC();
      cth $$2 = t($$1);
      cth $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuo $$0) {
      super.n($$0);
      cxd.a(km.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cuo b() {
      return new cuo(cur.qI);
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
   protected avy d(brm $$0) {
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
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azg $$4 = $$0.E_();
      cge.d $$6;
      if ($$3 instanceof cge.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cge.c(this, $$6);
      } else {
         this.e = false;
         cge.b[] $$8 = cge.b.values();
         cth[] $$9 = cth.values();
         cge.b $$10 = ac.a($$8, $$4);
         cth $$11 = ac.a($$9, $$4);
         cth $$12 = ac.a($$9, $$4);
         $$6 = new cge.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bsz<cge> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.b_($$3.d()).a(awu.a) && $$1.a_($$3.c()).a(dfa.G) && ($$1.t($$3).a(awn.an) || cgg.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azt {
      a("kob", cge.a.a, 0),
      b("sunstreak", cge.a.a, 1),
      c("snooper", cge.a.a, 2),
      d("dasher", cge.a.a, 3),
      e("brinely", cge.a.a, 4),
      f("spotty", cge.a.a, 5),
      g("flopper", cge.a.b, 0),
      h("stripey", cge.a.b, 1),
      i("glitter", cge.a.b, 2),
      j("blockfish", cge.a.b, 3),
      k("betty", cge.a.b, 4),
      l("clayfish", cge.a.b, 5);

      public static final Codec<cge.b> m = azt.a(cge.b::values);
      private static final IntFunction<cge.b> n = axo.a(cge.b::b, values(), a);
      private final String o;
      private final xo p;
      private final cge.a q;
      private final int r;

      private b(final String $$0, final cge.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xo.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cge.b a(int $$0) {
         return n.apply($$0);
      }

      public cge.a a() {
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

   static class c extends cfd.a {
      final cge.d b;

      c(cge $$0, cge.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cge.b b, cth c, cth d) {
      public static final Codec<cge.d> a = Codec.INT.xmap(cge.d::new, cge.d::a);

      public d(int $$0) {
         this(cge.v($$0), cge.t($$0), cge.u($$0));
      }

      public int a() {
         return cge.a(this.b, this.c, this.d);
      }
   }
}
