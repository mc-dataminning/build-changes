import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfs extends cer implements buc<cfs.b> {
   public static final String b = "BucketVariantTag";
   private static final ajp<Integer> d = ajt.a(cfs.class, ajr.b);
   public static final List<cfs.d> c = List.of(
      new cfs.d(cfs.b.h, csw.b, csw.h),
      new cfs.d(cfs.b.g, csw.h, csw.h),
      new cfs.d(cfs.b.g, csw.h, csw.l),
      new cfs.d(cfs.b.l, csw.a, csw.h),
      new cfs.d(cfs.b.b, csw.l, csw.h),
      new cfs.d(cfs.b.a, csw.b, csw.a),
      new cfs.d(cfs.b.f, csw.g, csw.d),
      new cfs.d(cfs.b.j, csw.k, csw.e),
      new cfs.d(cfs.b.l, csw.a, csw.o),
      new cfs.d(cfs.b.f, csw.a, csw.e),
      new cfs.d(cfs.b.i, csw.a, csw.h),
      new cfs.d(cfs.b.l, csw.a, csw.b),
      new cfs.d(cfs.b.d, csw.j, csw.g),
      new cfs.d(cfs.b.e, csw.f, csw.d),
      new cfs.d(cfs.b.k, csw.o, csw.a),
      new cfs.d(cfs.b.c, csw.h, csw.o),
      new cfs.d(cfs.b.j, csw.o, csw.a),
      new cfs.d(cfs.b.g, csw.a, csw.e),
      new cfs.d(cfs.b.a, csw.o, csw.a),
      new cfs.d(cfs.b.b, csw.h, csw.a),
      new cfs.d(cfs.b.d, csw.j, csw.e),
      new cfs.d(cfs.b.g, csw.e, csw.e)
   );
   private boolean e = true;

   public cfs(bsn<? extends cfs> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfs.b $$0, csw $$1, csw $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static csw s(int $$0) {
      return csw.a($$0 >> 16 & 0xFF);
   }

   public static csw t(int $$0) {
      return csw.a($$0 >> 24 & 0xFF);
   }

   public static cfs.b u(int $$0) {
      return cfs.b.a($$0 & 65535);
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

   public csw gw() {
      return s(this.gz());
   }

   public csw gx() {
      return t(this.gz());
   }

   public cfs.b gy() {
      return u(this.gz());
   }

   public void a(cfs.b $$0) {
      int $$1 = this.gz();
      csw $$2 = s($$1);
      csw $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void n(cud $$0) {
      super.n($$0);
      cwr.a(kn.N, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gz()));
   }

   @Override
   public cud b() {
      return new cud(cug.qI);
   }

   @Override
   protected avg v() {
      return avh.zM;
   }

   @Override
   protected avg n_() {
      return avh.zN;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.zP;
   }

   @Override
   protected avg go() {
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
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayo $$4 = $$0.E_();
      cfs.d $$6;
      if ($$3 instanceof cfs.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cfs.c(this, $$6);
      } else {
         this.e = false;
         cfs.b[] $$8 = cfs.b.values();
         csw[] $$9 = csw.values();
         cfs.b $$10 = ac.a($$8, $$4);
         csw $$11 = ac.a($$9, $$4);
         csw $$12 = ac.a($$9, $$4);
         $$6 = new cfs.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bsn<cfs> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.b_($$3.d()).a(awc.a) && $$1.a_($$3.c()).a(dfk.G) && ($$1.t($$3).a(avv.an) || cfu.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", cfs.a.a, 0),
      b("sunstreak", cfs.a.a, 1),
      c("snooper", cfs.a.a, 2),
      d("dasher", cfs.a.a, 3),
      e("brinely", cfs.a.a, 4),
      f("spotty", cfs.a.a, 5),
      g("flopper", cfs.a.b, 0),
      h("stripey", cfs.a.b, 1),
      i("glitter", cfs.a.b, 2),
      j("blockfish", cfs.a.b, 3),
      k("betty", cfs.a.b, 4),
      l("clayfish", cfs.a.b, 5);

      public static final Codec<cfs.b> m = azc.a(cfs.b::values);
      private static final IntFunction<cfs.b> n = aww.a(cfs.b::b, values(), a);
      private final String o;
      private final wu p;
      private final cfs.a q;
      private final int r;

      private b(final String $$0, final cfs.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wu.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfs.b a(int $$0) {
         return n.apply($$0);
      }

      public cfs.a a() {
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

   static class c extends cer.a {
      final cfs.d b;

      c(cfs $$0, cfs.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfs.b b, csw c, csw d) {
      public static final Codec<cfs.d> a = Codec.INT.xmap(cfs.d::new, cfs.d::a);

      public d(int $$0) {
         this(cfs.u($$0), cfs.s($$0), cfs.t($$0));
      }

      public int a() {
         return cfs.a(this.b, this.c, this.d);
      }
   }
}
