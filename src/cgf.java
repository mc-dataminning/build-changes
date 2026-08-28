import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgf extends cfe implements bup<cgf.b> {
   public static final String b = "BucketVariantTag";
   private static final akk<Integer> d = ako.a(cgf.class, akm.b);
   public static final List<cgf.d> c = List.of(
      new cgf.d(cgf.b.h, cti.b, cti.h),
      new cgf.d(cgf.b.g, cti.h, cti.h),
      new cgf.d(cgf.b.g, cti.h, cti.l),
      new cgf.d(cgf.b.l, cti.a, cti.h),
      new cgf.d(cgf.b.b, cti.l, cti.h),
      new cgf.d(cgf.b.a, cti.b, cti.a),
      new cgf.d(cgf.b.f, cti.g, cti.d),
      new cgf.d(cgf.b.j, cti.k, cti.e),
      new cgf.d(cgf.b.l, cti.a, cti.o),
      new cgf.d(cgf.b.f, cti.a, cti.e),
      new cgf.d(cgf.b.i, cti.a, cti.h),
      new cgf.d(cgf.b.l, cti.a, cti.b),
      new cgf.d(cgf.b.d, cti.j, cti.g),
      new cgf.d(cgf.b.e, cti.f, cti.d),
      new cgf.d(cgf.b.k, cti.o, cti.a),
      new cgf.d(cgf.b.c, cti.h, cti.o),
      new cgf.d(cgf.b.j, cti.o, cti.a),
      new cgf.d(cgf.b.g, cti.a, cti.e),
      new cgf.d(cgf.b.a, cti.o, cti.a),
      new cgf.d(cgf.b.b, cti.h, cti.a),
      new cgf.d(cgf.b.d, cti.j, cti.e),
      new cgf.d(cgf.b.g, cti.e, cti.e)
   );
   private boolean e = true;

   public cgf(bta<? extends cgf> $$0, dby $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cgf.b $$0, cti $$1, cti $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cti t(int $$0) {
      return cti.a($$0 >> 16 & 0xFF);
   }

   public static cti u(int $$0) {
      return cti.a($$0 >> 24 & 0xFF);
   }

   public static cgf.b v(int $$0) {
      return cgf.b.a($$0 & 65535);
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

   public cti gz() {
      return t(this.gC());
   }

   public cti gA() {
      return u(this.gC());
   }

   public cgf.b gB() {
      return v(this.gC());
   }

   public void a(cgf.b $$0) {
      int $$1 = this.gC();
      cti $$2 = t($$1);
      cti $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cup $$0) {
      super.n($$0);
      cxe.a(km.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gC()));
   }

   @Override
   public cup b() {
      return new cup(cus.qI);
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
   protected avz d(brn $$0) {
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
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.E_();
      cgf.d $$6;
      if ($$3 instanceof cgf.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cgf.c(this, $$6);
      } else {
         this.e = false;
         cgf.b[] $$8 = cgf.b.values();
         cti[] $$9 = cti.values();
         cgf.b $$10 = ac.a($$8, $$4);
         cti $$11 = ac.a($$9, $$4);
         cti $$12 = ac.a($$9, $$4);
         $$6 = new cgf.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bta<cgf> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.b_($$3.d()).a(awv.a) && $$1.a_($$3.c()).a(dfb.G) && ($$1.t($$3).a(awo.an) || cgh.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", cgf.a.a, 0),
      b("sunstreak", cgf.a.a, 1),
      c("snooper", cgf.a.a, 2),
      d("dasher", cgf.a.a, 3),
      e("brinely", cgf.a.a, 4),
      f("spotty", cgf.a.a, 5),
      g("flopper", cgf.a.b, 0),
      h("stripey", cgf.a.b, 1),
      i("glitter", cgf.a.b, 2),
      j("blockfish", cgf.a.b, 3),
      k("betty", cgf.a.b, 4),
      l("clayfish", cgf.a.b, 5);

      public static final Codec<cgf.b> m = azu.a(cgf.b::values);
      private static final IntFunction<cgf.b> n = axp.a(cgf.b::b, values(), a);
      private final String o;
      private final xp p;
      private final cgf.a q;
      private final int r;

      private b(final String $$0, final cgf.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cgf.b a(int $$0) {
         return n.apply($$0);
      }

      public cgf.a a() {
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

   static class c extends cfe.a {
      final cgf.d b;

      c(cgf $$0, cgf.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cgf.b b, cti c, cti d) {
      public static final Codec<cgf.d> a = Codec.INT.xmap(cgf.d::new, cgf.d::a);

      public d(int $$0) {
         this(cgf.v($$0), cgf.t($$0), cgf.u($$0));
      }

      public int a() {
         return cgf.a(this.b, this.c, this.d);
      }
   }
}
