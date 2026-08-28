import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgg extends cff implements buq<cgg.b> {
   public static final String b = "BucketVariantTag";
   private static final akk<Integer> d = ako.a(cgg.class, akm.b);
   public static final List<cgg.d> c = List.of(
      new cgg.d(cgg.b.h, ctj.b, ctj.h),
      new cgg.d(cgg.b.g, ctj.h, ctj.h),
      new cgg.d(cgg.b.g, ctj.h, ctj.l),
      new cgg.d(cgg.b.l, ctj.a, ctj.h),
      new cgg.d(cgg.b.b, ctj.l, ctj.h),
      new cgg.d(cgg.b.a, ctj.b, ctj.a),
      new cgg.d(cgg.b.f, ctj.g, ctj.d),
      new cgg.d(cgg.b.j, ctj.k, ctj.e),
      new cgg.d(cgg.b.l, ctj.a, ctj.o),
      new cgg.d(cgg.b.f, ctj.a, ctj.e),
      new cgg.d(cgg.b.i, ctj.a, ctj.h),
      new cgg.d(cgg.b.l, ctj.a, ctj.b),
      new cgg.d(cgg.b.d, ctj.j, ctj.g),
      new cgg.d(cgg.b.e, ctj.f, ctj.d),
      new cgg.d(cgg.b.k, ctj.o, ctj.a),
      new cgg.d(cgg.b.c, ctj.h, ctj.o),
      new cgg.d(cgg.b.j, ctj.o, ctj.a),
      new cgg.d(cgg.b.g, ctj.a, ctj.e),
      new cgg.d(cgg.b.a, ctj.o, ctj.a),
      new cgg.d(cgg.b.b, ctj.h, ctj.a),
      new cgg.d(cgg.b.d, ctj.j, ctj.e),
      new cgg.d(cgg.b.g, ctj.e, ctj.e)
   );
   private boolean e = true;

   public cgg(btb<? extends cgg> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgg.b $$0, ctj $$1, ctj $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ctj t(int $$0) {
      return ctj.a($$0 >> 16 & 0xFF);
   }

   public static ctj u(int $$0) {
      return ctj.a($$0 >> 24 & 0xFF);
   }

   public static cgg.b v(int $$0) {
      return cgg.b.a($$0 & 65535);
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

   public ctj gz() {
      return t(this.gC());
   }

   public ctj gA() {
      return u(this.gC());
   }

   public cgg.b gB() {
      return v(this.gC());
   }

   public void a(cgg.b $$0) {
      int $$1 = this.gC();
      ctj $$2 = t($$1);
      ctj $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuq $$0) {
      super.n($$0);
      cxf.a(km.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cuq b() {
      return new cuq(cut.qI);
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
   protected avz d(bro $$0) {
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
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      cgg.d $$6;
      if ($$3 instanceof cgg.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cgg.c(this, $$6);
      } else {
         this.e = false;
         cgg.b[] $$8 = cgg.b.values();
         ctj[] $$9 = ctj.values();
         cgg.b $$10 = ac.a($$8, $$4);
         ctj $$11 = ac.a($$9, $$4);
         ctj $$12 = ac.a($$9, $$4);
         $$6 = new cgg.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(btb<cgg> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.b_($$3.d()).a(awv.a) && $$1.a_($$3.c()).a(dfc.G) && ($$1.t($$3).a(awo.an) || cgi.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", cgg.a.a, 0),
      b("sunstreak", cgg.a.a, 1),
      c("snooper", cgg.a.a, 2),
      d("dasher", cgg.a.a, 3),
      e("brinely", cgg.a.a, 4),
      f("spotty", cgg.a.a, 5),
      g("flopper", cgg.a.b, 0),
      h("stripey", cgg.a.b, 1),
      i("glitter", cgg.a.b, 2),
      j("blockfish", cgg.a.b, 3),
      k("betty", cgg.a.b, 4),
      l("clayfish", cgg.a.b, 5);

      public static final Codec<cgg.b> m = azu.a(cgg.b::values);
      private static final IntFunction<cgg.b> n = axp.a(cgg.b::b, values(), a);
      private final String o;
      private final xp p;
      private final cgg.a q;
      private final int r;

      private b(final String $$0, final cgg.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgg.b a(int $$0) {
         return n.apply($$0);
      }

      public cgg.a a() {
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

   static class c extends cff.a {
      final cgg.d b;

      c(cgg $$0, cgg.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgg.b b, ctj c, ctj d) {
      public static final Codec<cgg.d> a = Codec.INT.xmap(cgg.d::new, cgg.d::a);

      public d(int $$0) {
         this(cgg.v($$0), cgg.t($$0), cgg.u($$0));
      }

      public int a() {
         return cgg.a(this.b, this.c, this.d);
      }
   }
}
