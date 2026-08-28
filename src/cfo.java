import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfo extends cen implements bty<cfo.b> {
   public static final String b = "BucketVariantTag";
   private static final ajp<Integer> d = ajt.a(cfo.class, ajr.b);
   public static final List<cfo.d> c = List.of(
      new cfo.d(cfo.b.h, cst.b, cst.h),
      new cfo.d(cfo.b.g, cst.h, cst.h),
      new cfo.d(cfo.b.g, cst.h, cst.l),
      new cfo.d(cfo.b.l, cst.a, cst.h),
      new cfo.d(cfo.b.b, cst.l, cst.h),
      new cfo.d(cfo.b.a, cst.b, cst.a),
      new cfo.d(cfo.b.f, cst.g, cst.d),
      new cfo.d(cfo.b.j, cst.k, cst.e),
      new cfo.d(cfo.b.l, cst.a, cst.o),
      new cfo.d(cfo.b.f, cst.a, cst.e),
      new cfo.d(cfo.b.i, cst.a, cst.h),
      new cfo.d(cfo.b.l, cst.a, cst.b),
      new cfo.d(cfo.b.d, cst.j, cst.g),
      new cfo.d(cfo.b.e, cst.f, cst.d),
      new cfo.d(cfo.b.k, cst.o, cst.a),
      new cfo.d(cfo.b.c, cst.h, cst.o),
      new cfo.d(cfo.b.j, cst.o, cst.a),
      new cfo.d(cfo.b.g, cst.a, cst.e),
      new cfo.d(cfo.b.a, cst.o, cst.a),
      new cfo.d(cfo.b.b, cst.h, cst.a),
      new cfo.d(cfo.b.d, cst.j, cst.e),
      new cfo.d(cfo.b.g, cst.e, cst.e)
   );
   private boolean e = true;

   public cfo(bsj<? extends cfo> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfo.b $$0, cst $$1, cst $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cst s(int $$0) {
      return cst.a($$0 >> 16 & 0xFF);
   }

   public static cst t(int $$0) {
      return cst.a($$0 >> 24 & 0xFF);
   }

   public static cfo.b u(int $$0) {
      return cfo.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gz() {
      return this.ao.a(d);
   }

   public cst gw() {
      return s(this.gz());
   }

   public cst gx() {
      return t(this.gz());
   }

   public cfo.b gy() {
      return u(this.gz());
   }

   public void a(cfo.b $$0) {
      int $$1 = this.gz();
      cst $$2 = s($$1);
      cst $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void n(cua $$0) {
      super.n($$0);
      cwo.a(kn.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public cua b() {
      return new cua(cud.qI);
   }

   @Override
   protected ave v() {
      return avf.zM;
   }

   @Override
   protected ave o_() {
      return avf.zN;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.zP;
   }

   @Override
   protected ave go() {
      return avf.zO;
   }

   @Override
   public void c(tx $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      cfo.d $$6;
      if ($$3 instanceof cfo.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cfo.c(this, $$6);
      } else {
         this.e = false;
         cfo.b[] $$8 = cfo.b.values();
         cst[] $$9 = cst.values();
         cfo.b $$10 = ac.a($$8, $$4);
         cst $$11 = ac.a($$9, $$4);
         cst $$12 = ac.a($$9, $$4);
         $$6 = new cfo.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bsj<cfo> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.b_($$3.d()).a(awa.a) && $$1.a_($$3.c()).a(dfh.G) && ($$1.t($$3).a(avt.an) || cfq.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayz {
      a("kob", cfo.a.a, 0),
      b("sunstreak", cfo.a.a, 1),
      c("snooper", cfo.a.a, 2),
      d("dasher", cfo.a.a, 3),
      e("brinely", cfo.a.a, 4),
      f("spotty", cfo.a.a, 5),
      g("flopper", cfo.a.b, 0),
      h("stripey", cfo.a.b, 1),
      i("glitter", cfo.a.b, 2),
      j("blockfish", cfo.a.b, 3),
      k("betty", cfo.a.b, 4),
      l("clayfish", cfo.a.b, 5);

      public static final Codec<cfo.b> m = ayz.a(cfo.b::values);
      private static final IntFunction<cfo.b> n = awu.a(cfo.b::b, values(), a);
      private final String o;
      private final wu p;
      private final cfo.a q;
      private final int r;

      private b(final String $$0, final cfo.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfo.b a(int $$0) {
         return n.apply($$0);
      }

      public cfo.a a() {
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

   static class c extends cen.a {
      final cfo.d b;

      c(cfo $$0, cfo.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfo.b b, cst c, cst d) {
      public static final Codec<cfo.d> a = Codec.INT.xmap(cfo.d::new, cfo.d::a);

      public d(int $$0) {
         this(cfo.u($$0), cfo.s($$0), cfo.t($$0));
      }

      public int a() {
         return cfo.a(this.b, this.c, this.d);
      }
   }
}
