import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chm extends cgk implements bvv<chm.b> {
   public static final String b = "BucketVariantTag";
   private static final akk<Integer> d = ako.a(chm.class, akm.b);
   public static final List<chm.d> c = List.of(
      new chm.d(chm.b.h, cuu.b, cuu.h),
      new chm.d(chm.b.g, cuu.h, cuu.h),
      new chm.d(chm.b.g, cuu.h, cuu.l),
      new chm.d(chm.b.l, cuu.a, cuu.h),
      new chm.d(chm.b.b, cuu.l, cuu.h),
      new chm.d(chm.b.a, cuu.b, cuu.a),
      new chm.d(chm.b.f, cuu.g, cuu.d),
      new chm.d(chm.b.j, cuu.k, cuu.e),
      new chm.d(chm.b.l, cuu.a, cuu.o),
      new chm.d(chm.b.f, cuu.a, cuu.e),
      new chm.d(chm.b.i, cuu.a, cuu.h),
      new chm.d(chm.b.l, cuu.a, cuu.b),
      new chm.d(chm.b.d, cuu.j, cuu.g),
      new chm.d(chm.b.e, cuu.f, cuu.d),
      new chm.d(chm.b.k, cuu.o, cuu.a),
      new chm.d(chm.b.c, cuu.h, cuu.o),
      new chm.d(chm.b.j, cuu.o, cuu.a),
      new chm.d(chm.b.g, cuu.a, cuu.e),
      new chm.d(chm.b.a, cuu.o, cuu.a),
      new chm.d(chm.b.b, cuu.h, cuu.a),
      new chm.d(chm.b.d, cuu.j, cuu.e),
      new chm.d(chm.b.g, cuu.e, cuu.e)
   );
   private boolean bY = true;

   public chm(bug<? extends chm> $$0, dev $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chm.b $$0, cuu $$1, cuu $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cuu c(int $$0) {
      return cuu.a($$0 >> 16 & 0xFF);
   }

   public static cuu s(int $$0) {
      return cuu.a($$0 >> 24 & 0xFF);
   }

   public static chm.b t(int $$0) {
      return chm.b.a($$0 & 65535);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gH());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public boolean r(int $$0) {
      return !this.bY;
   }

   private int gH() {
      return this.am.a(d);
   }

   public cuu gE() {
      return c(this.gH());
   }

   public cuu gF() {
      return s(this.gH());
   }

   public chm.b gG() {
      return t(this.gH());
   }

   public void a(chm.b $$0) {
      int $$1 = this.gH();
      cuu $$2 = c($$1);
      cuu $$3 = s($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void k(cvx $$0) {
      super.k($$0);
      cyg.a(kt.W, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gH()));
   }

   @Override
   public cvx X_() {
      return new cvx(cwb.qJ);
   }

   @Override
   protected awj w() {
      return awk.zQ;
   }

   @Override
   protected awj o_() {
      return awk.zR;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.zT;
   }

   @Override
   protected awj gw() {
      return awk.zS;
   }

   @Override
   public void h(uj $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.v($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azr $$4 = $$0.E_();
      chm.d $$6;
      if ($$3 instanceof chm.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ad.a(c, $$4);
         $$3 = new chm.c(this, $$6);
      } else {
         this.bY = false;
         chm.b[] $$8 = chm.b.values();
         cuu[] $$9 = cuu.values();
         chm.b $$10 = ad.a($$8, $$4);
         cuu $$11 = ad.a($$9, $$4);
         cuu $$12 = ad.a($$9, $$4);
         $$6 = new chm.d($$10, $$11, $$12);
      }

      this.v($$6.a());
      return $$3;
   }

   public static boolean b(bug<chm> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dia.G) && ($$1.t($$3).a(awy.an) || cho.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements baf {
      a("kob", chm.a.a, 0),
      b("sunstreak", chm.a.a, 1),
      c("snooper", chm.a.a, 2),
      d("dasher", chm.a.a, 3),
      e("brinely", chm.a.a, 4),
      f("spotty", chm.a.a, 5),
      g("flopper", chm.a.b, 0),
      h("stripey", chm.a.b, 1),
      i("glitter", chm.a.b, 2),
      j("blockfish", chm.a.b, 3),
      k("betty", chm.a.b, 4),
      l("clayfish", chm.a.b, 5);

      public static final Codec<chm.b> m = baf.a(chm.b::values);
      private static final IntFunction<chm.b> n = aya.a(chm.b::b, values(), a);
      private final String o;
      private final xh p;
      private final chm.a q;
      private final int r;

      private b(final String $$0, final chm.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = xh.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chm.b a(int $$0) {
         return n.apply($$0);
      }

      public chm.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public xh d() {
         return this.p;
      }
   }

   static class c extends cgk.a {
      final chm.d b;

      c(chm $$0, chm.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chm.b b, cuu c, cuu d) {
      public static final Codec<chm.d> a = Codec.INT.xmap(chm.d::new, chm.d::a);

      public d(int $$0) {
         this(chm.t($$0), chm.c($$0), chm.s($$0));
      }

      public int a() {
         return chm.a(this.b, this.c, this.d);
      }
   }
}
