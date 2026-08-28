import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgh extends cfg implements bur<cgh.b> {
   public static final String b = "BucketVariantTag";
   private static final akk<Integer> d = ako.a(cgh.class, akm.b);
   public static final List<cgh.d> c = List.of(
      new cgh.d(cgh.b.h, ctk.b, ctk.h),
      new cgh.d(cgh.b.g, ctk.h, ctk.h),
      new cgh.d(cgh.b.g, ctk.h, ctk.l),
      new cgh.d(cgh.b.l, ctk.a, ctk.h),
      new cgh.d(cgh.b.b, ctk.l, ctk.h),
      new cgh.d(cgh.b.a, ctk.b, ctk.a),
      new cgh.d(cgh.b.f, ctk.g, ctk.d),
      new cgh.d(cgh.b.j, ctk.k, ctk.e),
      new cgh.d(cgh.b.l, ctk.a, ctk.o),
      new cgh.d(cgh.b.f, ctk.a, ctk.e),
      new cgh.d(cgh.b.i, ctk.a, ctk.h),
      new cgh.d(cgh.b.l, ctk.a, ctk.b),
      new cgh.d(cgh.b.d, ctk.j, ctk.g),
      new cgh.d(cgh.b.e, ctk.f, ctk.d),
      new cgh.d(cgh.b.k, ctk.o, ctk.a),
      new cgh.d(cgh.b.c, ctk.h, ctk.o),
      new cgh.d(cgh.b.j, ctk.o, ctk.a),
      new cgh.d(cgh.b.g, ctk.a, ctk.e),
      new cgh.d(cgh.b.a, ctk.o, ctk.a),
      new cgh.d(cgh.b.b, ctk.h, ctk.a),
      new cgh.d(cgh.b.d, ctk.j, ctk.e),
      new cgh.d(cgh.b.g, ctk.e, ctk.e)
   );
   private boolean e = true;

   public cgh(btc<? extends cgh> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgh.b $$0, ctk $$1, ctk $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ctk t(int $$0) {
      return ctk.a($$0 >> 16 & 0xFF);
   }

   public static ctk u(int $$0) {
      return ctk.a($$0 >> 24 & 0xFF);
   }

   public static cgh.b v(int $$0) {
      return cgh.b.a($$0 & 65535);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC());
   }

   @Override
   public void a(us $$0) {
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

   public ctk gz() {
      return t(this.gC());
   }

   public ctk gA() {
      return u(this.gC());
   }

   public cgh.b gB() {
      return v(this.gC());
   }

   public void a(cgh.b $$0) {
      int $$1 = this.gC();
      ctk $$2 = t($$1);
      ctk $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cur $$0) {
      super.n($$0);
      cxg.a(km.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cur b() {
      return new cur(cuu.qI);
   }

   @Override
   protected avz v() {
      return awa.zJ;
   }

   @Override
   protected avz o_() {
      return awa.zK;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.zM;
   }

   @Override
   protected avz gr() {
      return awa.zL;
   }

   @Override
   public void c(us $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      cgh.d $$6;
      if ($$3 instanceof cgh.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cgh.c(this, $$6);
      } else {
         this.e = false;
         cgh.b[] $$8 = cgh.b.values();
         ctk[] $$9 = ctk.values();
         cgh.b $$10 = ac.a($$8, $$4);
         ctk $$11 = ac.a($$9, $$4);
         ctk $$12 = ac.a($$9, $$4);
         $$6 = new cgh.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(btc<cgh> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      return $$1.b_($$3.d()).a(awv.a) && $$1.a_($$3.c()).a(dfd.G) && ($$1.t($$3).a(awo.an) || cgj.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azu {
      a("kob", cgh.a.a, 0),
      b("sunstreak", cgh.a.a, 1),
      c("snooper", cgh.a.a, 2),
      d("dasher", cgh.a.a, 3),
      e("brinely", cgh.a.a, 4),
      f("spotty", cgh.a.a, 5),
      g("flopper", cgh.a.b, 0),
      h("stripey", cgh.a.b, 1),
      i("glitter", cgh.a.b, 2),
      j("blockfish", cgh.a.b, 3),
      k("betty", cgh.a.b, 4),
      l("clayfish", cgh.a.b, 5);

      public static final Codec<cgh.b> m = azu.a(cgh.b::values);
      private static final IntFunction<cgh.b> n = axp.a(cgh.b::b, values(), a);
      private final String o;
      private final xp p;
      private final cgh.a q;
      private final int r;

      private b(final String $$0, final cgh.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgh.b a(int $$0) {
         return n.apply($$0);
      }

      public cgh.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xp d() {
         return this.p;
      }
   }

   static class c extends cfg.a {
      final cgh.d b;

      c(cgh $$0, cgh.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgh.b b, ctk c, ctk d) {
      public static final Codec<cgh.d> a = Codec.INT.xmap(cgh.d::new, cgh.d::a);

      public d(int $$0) {
         this(cgh.v($$0), cgh.t($$0), cgh.u($$0));
      }

      public int a() {
         return cgh.a(this.b, this.c, this.d);
      }
   }
}
