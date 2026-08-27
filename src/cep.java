import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cep extends cdo implements bsz<cep.b> {
   public static final String b = "BucketVariantTag";
   private static final ajm<Integer> d = ajq.a(cep.class, ajo.b);
   public static final List<cep.d> c = List.of(
      new cep.d(cep.b.h, crs.b, crs.h),
      new cep.d(cep.b.g, crs.h, crs.h),
      new cep.d(cep.b.g, crs.h, crs.l),
      new cep.d(cep.b.l, crs.a, crs.h),
      new cep.d(cep.b.b, crs.l, crs.h),
      new cep.d(cep.b.a, crs.b, crs.a),
      new cep.d(cep.b.f, crs.g, crs.d),
      new cep.d(cep.b.j, crs.k, crs.e),
      new cep.d(cep.b.l, crs.a, crs.o),
      new cep.d(cep.b.f, crs.a, crs.e),
      new cep.d(cep.b.i, crs.a, crs.h),
      new cep.d(cep.b.l, crs.a, crs.b),
      new cep.d(cep.b.d, crs.j, crs.g),
      new cep.d(cep.b.e, crs.f, crs.d),
      new cep.d(cep.b.k, crs.o, crs.a),
      new cep.d(cep.b.c, crs.h, crs.o),
      new cep.d(cep.b.j, crs.o, crs.a),
      new cep.d(cep.b.g, crs.a, crs.e),
      new cep.d(cep.b.a, crs.o, crs.a),
      new cep.d(cep.b.b, crs.h, crs.a),
      new cep.d(cep.b.d, crs.j, crs.e),
      new cep.d(cep.b.g, crs.e, crs.e)
   );
   private boolean e = true;

   public cep(brn<? extends cep> $$0, dad $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cep.b $$0, crs $$1, crs $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static crs t(int $$0) {
      return crs.a($$0 >> 16 & 0xFF);
   }

   public static crs u(int $$0) {
      return crs.a($$0 >> 24 & 0xFF);
   }

   public static cep.b v(int $$0) {
      return cep.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB());
   }

   @Override
   public void a(ua $$0) {
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

   private int gB() {
      return this.ao.a(d);
   }

   public crs gy() {
      return t(this.gB());
   }

   public crs gz() {
      return u(this.gB());
   }

   public cep.b gA() {
      return v(this.gB());
   }

   public void a(cep.b $$0) {
      int $$1 = this.gB();
      crs $$2 = t($$1);
      crs $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(csz $$0) {
      super.n($$0);
      cvm.a(ka.L, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public csz b() {
      return new csz(ctc.qI);
   }

   @Override
   protected avb v() {
      return avc.zy;
   }

   @Override
   protected avb o_() {
      return avc.zz;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.zB;
   }

   @Override
   protected avb gq() {
      return avc.zA;
   }

   @Override
   public void c(ua $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayg $$4 = $$0.E_();
      cep.d $$6;
      if ($$3 instanceof cep.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cep.c(this, $$6);
      } else {
         this.e = false;
         cep.b[] $$8 = cep.b.values();
         crs[] $$9 = crs.values();
         cep.b $$10 = ac.a($$8, $$4);
         crs $$11 = ac.a($$9, $$4);
         crs $$12 = ac.a($$9, $$4);
         $$6 = new cep.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(brn<cep> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.b_($$3.d()).a(avw.a) && $$1.a_($$3.c()).a(ddg.G) && ($$1.t($$3).a(avq.an) || cer.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayt {
      a("kob", cep.a.a, 0),
      b("sunstreak", cep.a.a, 1),
      c("snooper", cep.a.a, 2),
      d("dasher", cep.a.a, 3),
      e("brinely", cep.a.a, 4),
      f("spotty", cep.a.a, 5),
      g("flopper", cep.a.b, 0),
      h("stripey", cep.a.b, 1),
      i("glitter", cep.a.b, 2),
      j("blockfish", cep.a.b, 3),
      k("betty", cep.a.b, 4),
      l("clayfish", cep.a.b, 5);

      public static final Codec<cep.b> m = ayt.a(cep.b::values);
      private static final IntFunction<cep.b> n = awq.a(cep.b::b, values(), a);
      private final String o;
      private final wu p;
      private final cep.a q;
      private final int r;

      private b(String $$0, cep.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cep.b a(int $$0) {
         return n.apply($$0);
      }

      public cep.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wu d() {
         return this.p;
      }
   }

   static class c extends cdo.a {
      final cep.d b;

      c(cep $$0, cep.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cep.b b, crs c, crs d) {
      public static final Codec<cep.d> a = Codec.INT.xmap(cep.d::new, cep.d::a);

      public d(int $$0) {
         this(cep.v($$0), cep.t($$0), cep.u($$0));
      }

      public int a() {
         return cep.a(this.b, this.c, this.d);
      }
   }
}
