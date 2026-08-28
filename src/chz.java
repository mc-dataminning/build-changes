import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chz extends cgx implements bwi<chz.b> {
   public static final String a = "BucketVariantTag";
   private static final ajy<Integer> c = akc.a(chz.class, aka.b);
   public static final List<chz.d> b = List.of(
      new chz.d(chz.b.h, cvn.b, cvn.h),
      new chz.d(chz.b.g, cvn.h, cvn.h),
      new chz.d(chz.b.g, cvn.h, cvn.l),
      new chz.d(chz.b.l, cvn.a, cvn.h),
      new chz.d(chz.b.b, cvn.l, cvn.h),
      new chz.d(chz.b.a, cvn.b, cvn.a),
      new chz.d(chz.b.f, cvn.g, cvn.d),
      new chz.d(chz.b.j, cvn.k, cvn.e),
      new chz.d(chz.b.l, cvn.a, cvn.o),
      new chz.d(chz.b.f, cvn.a, cvn.e),
      new chz.d(chz.b.i, cvn.a, cvn.h),
      new chz.d(chz.b.l, cvn.a, cvn.b),
      new chz.d(chz.b.d, cvn.j, cvn.g),
      new chz.d(chz.b.e, cvn.f, cvn.d),
      new chz.d(chz.b.k, cvn.o, cvn.a),
      new chz.d(chz.b.c, cvn.h, cvn.o),
      new chz.d(chz.b.j, cvn.o, cvn.a),
      new chz.d(chz.b.g, cvn.a, cvn.e),
      new chz.d(chz.b.a, cvn.o, cvn.a),
      new chz.d(chz.b.b, cvn.h, cvn.a),
      new chz.d(chz.b.d, cvn.j, cvn.e),
      new chz.d(chz.b.g, cvn.e, cvn.e)
   );
   private boolean bY = true;

   public chz(but<? extends chz> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chz.b $$0, cvn $$1, cvn $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvn c(int $$0) {
      return cvn.a($$0 >> 16 & 0xFF);
   }

   public static cvn r(int $$0) {
      return cvn.a($$0 >> 24 & 0xFF);
   }

   public static chz.b s(int $$0) {
      return chz.b.a($$0 & 65535);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD());
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

   private int gD() {
      return this.al.a(c);
   }

   public cvn gA() {
      return c(this.gD());
   }

   public cvn gB() {
      return r(this.gD());
   }

   public chz.b gC() {
      return s(this.gD());
   }

   public void a(chz.b $$0) {
      int $$1 = this.gD();
      cvn $$2 = c($$1);
      cvn $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cwq $$0) {
      super.i($$0);
      cyz.a(kv.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gD()));
   }

   @Override
   public cwq W_() {
      return new cwq(cwu.rp);
   }

   @Override
   protected avz u() {
      return awa.AA;
   }

   @Override
   protected avz o_() {
      return awa.AB;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.AD;
   }

   @Override
   protected avz gs() {
      return awa.AC;
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
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      chz.d $$6;
      if ($$3 instanceof chz.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new chz.c(this, $$6);
      } else {
         this.bY = false;
         chz.b[] $$8 = chz.b.values();
         cvn[] $$9 = cvn.values();
         chz.b $$10 = af.a($$8, $$4);
         cvn $$11 = af.a($$9, $$4);
         cvn $$12 = af.a($$9, $$4);
         $$6 = new chz.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(but<chz> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      return $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(djp.J) && ($$1.t($$3).a(awo.an) || cib.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", chz.a.a, 0),
      b("sunstreak", chz.a.a, 1),
      c("snooper", chz.a.a, 2),
      d("dasher", chz.a.a, 3),
      e("brinely", chz.a.a, 4),
      f("spotty", chz.a.a, 5),
      g("flopper", chz.a.b, 0),
      h("stripey", chz.a.b, 1),
      i("glitter", chz.a.b, 2),
      j("blockfish", chz.a.b, 3),
      k("betty", chz.a.b, 4),
      l("clayfish", chz.a.b, 5);

      public static final Codec<chz.b> m = azv.a(chz.b::values);
      private static final IntFunction<chz.b> n = axq.a(chz.b::b, values(), a);
      private final String o;
      private final wp p;
      private final chz.a q;
      private final int r;

      private b(final String $$0, final chz.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chz.b a(int $$0) {
         return n.apply($$0);
      }

      public chz.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wp d() {
         return this.p;
      }
   }

   static class c extends cgx.a {
      final chz.d b;

      c(chz $$0, chz.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chz.b b, cvn c, cvn d) {
      public static final Codec<chz.d> a = Codec.INT.xmap(chz.d::new, chz.d::a);

      public d(int $$0) {
         this(chz.s($$0), chz.c($$0), chz.r($$0));
      }

      public int a() {
         return chz.a(this.b, this.c, this.d);
      }
   }
}
