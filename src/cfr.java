import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfr extends ceq implements bub<cfr.b> {
   public static final String b = "BucketVariantTag";
   private static final ajp<Integer> d = ajt.a(cfr.class, ajr.b);
   public static final List<cfr.d> c = List.of(
      new cfr.d(cfr.b.h, csv.b, csv.h),
      new cfr.d(cfr.b.g, csv.h, csv.h),
      new cfr.d(cfr.b.g, csv.h, csv.l),
      new cfr.d(cfr.b.l, csv.a, csv.h),
      new cfr.d(cfr.b.b, csv.l, csv.h),
      new cfr.d(cfr.b.a, csv.b, csv.a),
      new cfr.d(cfr.b.f, csv.g, csv.d),
      new cfr.d(cfr.b.j, csv.k, csv.e),
      new cfr.d(cfr.b.l, csv.a, csv.o),
      new cfr.d(cfr.b.f, csv.a, csv.e),
      new cfr.d(cfr.b.i, csv.a, csv.h),
      new cfr.d(cfr.b.l, csv.a, csv.b),
      new cfr.d(cfr.b.d, csv.j, csv.g),
      new cfr.d(cfr.b.e, csv.f, csv.d),
      new cfr.d(cfr.b.k, csv.o, csv.a),
      new cfr.d(cfr.b.c, csv.h, csv.o),
      new cfr.d(cfr.b.j, csv.o, csv.a),
      new cfr.d(cfr.b.g, csv.a, csv.e),
      new cfr.d(cfr.b.a, csv.o, csv.a),
      new cfr.d(cfr.b.b, csv.h, csv.a),
      new cfr.d(cfr.b.d, csv.j, csv.e),
      new cfr.d(cfr.b.g, csv.e, csv.e)
   );
   private boolean e = true;

   public cfr(bsm<? extends cfr> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfr.b $$0, csv $$1, csv $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static csv s(int $$0) {
      return csv.a($$0 >> 16 & 0xFF);
   }

   public static csv t(int $$0) {
      return csv.a($$0 >> 24 & 0xFF);
   }

   public static cfr.b u(int $$0) {
      return cfr.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
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

   private int gA() {
      return this.ao.a(d);
   }

   public csv gx() {
      return s(this.gA());
   }

   public csv gy() {
      return t(this.gA());
   }

   public cfr.b gz() {
      return u(this.gA());
   }

   public void a(cfr.b $$0) {
      int $$1 = this.gA();
      csv $$2 = s($$1);
      csv $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void n(cuc $$0) {
      super.n($$0);
      cwq.a(kn.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gA()));
   }

   @Override
   public cuc b() {
      return new cuc(cuf.qI);
   }

   @Override
   protected avg v() {
      return avh.zM;
   }

   @Override
   protected avg o_() {
      return avh.zN;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.zP;
   }

   @Override
   protected avg gp() {
      return avh.zO;
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
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      cfr.d $$6;
      if ($$3 instanceof cfr.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cfr.c(this, $$6);
      } else {
         this.e = false;
         cfr.b[] $$8 = cfr.b.values();
         csv[] $$9 = csv.values();
         cfr.b $$10 = ac.a($$8, $$4);
         csv $$11 = ac.a($$9, $$4);
         csv $$12 = ac.a($$9, $$4);
         $$6 = new cfr.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bsm<cfr> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.b_($$3.d()).a(awc.a) && $$1.a_($$3.c()).a(dfj.G) && ($$1.t($$3).a(avv.an) || cft.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azc {
      a("kob", cfr.a.a, 0),
      b("sunstreak", cfr.a.a, 1),
      c("snooper", cfr.a.a, 2),
      d("dasher", cfr.a.a, 3),
      e("brinely", cfr.a.a, 4),
      f("spotty", cfr.a.a, 5),
      g("flopper", cfr.a.b, 0),
      h("stripey", cfr.a.b, 1),
      i("glitter", cfr.a.b, 2),
      j("blockfish", cfr.a.b, 3),
      k("betty", cfr.a.b, 4),
      l("clayfish", cfr.a.b, 5);

      public static final Codec<cfr.b> m = azc.a(cfr.b::values);
      private static final IntFunction<cfr.b> n = aww.a(cfr.b::b, values(), a);
      private final String o;
      private final wu p;
      private final cfr.a q;
      private final int r;

      private b(final String $$0, final cfr.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfr.b a(int $$0) {
         return n.apply($$0);
      }

      public cfr.a a() {
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

   static class c extends ceq.a {
      final cfr.d b;

      c(cfr $$0, cfr.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfr.b b, csv c, csv d) {
      public static final Codec<cfr.d> a = Codec.INT.xmap(cfr.d::new, cfr.d::a);

      public d(int $$0) {
         this(cfr.u($$0), cfr.s($$0), cfr.t($$0));
      }

      public int a() {
         return cfr.a(this.b, this.c, this.d);
      }
   }
}
