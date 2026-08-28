import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chx extends cgv implements bwg<chx.b> {
   public static final String a = "BucketVariantTag";
   private static final ajx<Integer> c = akb.a(chx.class, ajz.b);
   public static final List<chx.d> b = List.of(
      new chx.d(chx.b.h, cvm.b, cvm.h),
      new chx.d(chx.b.g, cvm.h, cvm.h),
      new chx.d(chx.b.g, cvm.h, cvm.l),
      new chx.d(chx.b.l, cvm.a, cvm.h),
      new chx.d(chx.b.b, cvm.l, cvm.h),
      new chx.d(chx.b.a, cvm.b, cvm.a),
      new chx.d(chx.b.f, cvm.g, cvm.d),
      new chx.d(chx.b.j, cvm.k, cvm.e),
      new chx.d(chx.b.l, cvm.a, cvm.o),
      new chx.d(chx.b.f, cvm.a, cvm.e),
      new chx.d(chx.b.i, cvm.a, cvm.h),
      new chx.d(chx.b.l, cvm.a, cvm.b),
      new chx.d(chx.b.d, cvm.j, cvm.g),
      new chx.d(chx.b.e, cvm.f, cvm.d),
      new chx.d(chx.b.k, cvm.o, cvm.a),
      new chx.d(chx.b.c, cvm.h, cvm.o),
      new chx.d(chx.b.j, cvm.o, cvm.a),
      new chx.d(chx.b.g, cvm.a, cvm.e),
      new chx.d(chx.b.a, cvm.o, cvm.a),
      new chx.d(chx.b.b, cvm.h, cvm.a),
      new chx.d(chx.b.d, cvm.j, cvm.e),
      new chx.d(chx.b.g, cvm.e, cvm.e)
   );
   private boolean bY = true;

   public chx(bur<? extends chx> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chx.b $$0, cvm $$1, cvm $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvm c(int $$0) {
      return cvm.a($$0 >> 16 & 0xFF);
   }

   public static cvm r(int $$0) {
      return cvm.a($$0 >> 24 & 0xFF);
   }

   public static chx.b s(int $$0) {
      return chx.b.a($$0 & 65535);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.u($$0.h("Variant"));
   }

   private void u(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bY;
   }

   private int gA() {
      return this.al.a(c);
   }

   public cvm gx() {
      return c(this.gA());
   }

   public cvm gy() {
      return r(this.gA());
   }

   public chx.b gz() {
      return s(this.gA());
   }

   public void a(chx.b $$0) {
      int $$1 = this.gA();
      cvm $$2 = c($$1);
      cvm $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cwp $$0) {
      super.i($$0);
      cyy.a(kv.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gA()));
   }

   @Override
   public cwp W_() {
      return new cwp(cwt.rp);
   }

   @Override
   protected avz u() {
      return awa.AB;
   }

   @Override
   protected avz o_() {
      return awa.AC;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.AE;
   }

   @Override
   protected avz gp() {
      return awa.AD;
   }

   @Override
   public void h(tq $$0) {
      super.h($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.u($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      chx.d $$6;
      if ($$3 instanceof chx.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new chx.c(this, $$6);
      } else {
         this.bY = false;
         chx.b[] $$8 = chx.b.values();
         cvm[] $$9 = cvm.values();
         chx.b $$10 = af.a($$8, $$4);
         cvm $$11 = af.a($$9, $$4);
         cvm $$12 = af.a($$9, $$4);
         $$6 = new chx.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bur<chx> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(djo.J) && ($$1.t($$3).a(awo.an) || chz.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements azv {
      a("kob", chx.a.a, 0),
      b("sunstreak", chx.a.a, 1),
      c("snooper", chx.a.a, 2),
      d("dasher", chx.a.a, 3),
      e("brinely", chx.a.a, 4),
      f("spotty", chx.a.a, 5),
      g("flopper", chx.a.b, 0),
      h("stripey", chx.a.b, 1),
      i("glitter", chx.a.b, 2),
      j("blockfish", chx.a.b, 3),
      k("betty", chx.a.b, 4),
      l("clayfish", chx.a.b, 5);

      public static final Codec<chx.b> m = azv.a(chx.b::values);
      private static final IntFunction<chx.b> n = axq.a(chx.b::b, values(), a);
      private final String o;
      private final wo p;
      private final chx.a q;
      private final int r;

      private b(final String $$0, final chx.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wo.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chx.b a(int $$0) {
         return n.apply($$0);
      }

      public chx.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wo d() {
         return this.p;
      }
   }

   static class c extends cgv.a {
      final chx.d b;

      c(chx $$0, chx.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chx.b b, cvm c, cvm d) {
      public static final Codec<chx.d> a = Codec.INT.xmap(chx.d::new, chx.d::a);

      public d(int $$0) {
         this(chx.s($$0), chx.c($$0), chx.r($$0));
      }

      public int a() {
         return chx.a(this.b, this.c, this.d);
      }
   }
}
