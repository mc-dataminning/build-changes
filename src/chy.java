import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chy extends cgw implements bwh<chy.b> {
   public static final String a = "BucketVariantTag";
   private static final ajy<Integer> c = akc.a(chy.class, aka.b);
   public static final List<chy.d> b = List.of(
      new chy.d(chy.b.h, cvm.b, cvm.h),
      new chy.d(chy.b.g, cvm.h, cvm.h),
      new chy.d(chy.b.g, cvm.h, cvm.l),
      new chy.d(chy.b.l, cvm.a, cvm.h),
      new chy.d(chy.b.b, cvm.l, cvm.h),
      new chy.d(chy.b.a, cvm.b, cvm.a),
      new chy.d(chy.b.f, cvm.g, cvm.d),
      new chy.d(chy.b.j, cvm.k, cvm.e),
      new chy.d(chy.b.l, cvm.a, cvm.o),
      new chy.d(chy.b.f, cvm.a, cvm.e),
      new chy.d(chy.b.i, cvm.a, cvm.h),
      new chy.d(chy.b.l, cvm.a, cvm.b),
      new chy.d(chy.b.d, cvm.j, cvm.g),
      new chy.d(chy.b.e, cvm.f, cvm.d),
      new chy.d(chy.b.k, cvm.o, cvm.a),
      new chy.d(chy.b.c, cvm.h, cvm.o),
      new chy.d(chy.b.j, cvm.o, cvm.a),
      new chy.d(chy.b.g, cvm.a, cvm.e),
      new chy.d(chy.b.a, cvm.o, cvm.a),
      new chy.d(chy.b.b, cvm.h, cvm.a),
      new chy.d(chy.b.d, cvm.j, cvm.e),
      new chy.d(chy.b.g, cvm.e, cvm.e)
   );
   private boolean bY = true;

   public chy(bus<? extends chy> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(chy.b $$0, cvm $$1, cvm $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cvm c(int $$0) {
      return cvm.a($$0 >> 16 & 0xFF);
   }

   public static cvm r(int $$0) {
      return cvm.a($$0 >> 24 & 0xFF);
   }

   public static chy.b s(int $$0) {
      return chy.b.a($$0 & 65535);
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

   public cvm gA() {
      return c(this.gD());
   }

   public cvm gB() {
      return r(this.gD());
   }

   public chy.b gC() {
      return s(this.gD());
   }

   public void a(chy.b $$0) {
      int $$1 = this.gD();
      cvm $$2 = c($$1);
      cvm $$3 = r($$1);
      this.u(a($$0, $$2, $$3));
   }

   @Override
   public void i(cwp $$0) {
      super.i($$0);
      cyy.a(kv.X, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gD()));
   }

   @Override
   public cwp W_() {
      return new cwp(cwt.rp);
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
   protected avz e(btb $$0) {
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azh $$4 = $$0.H_();
      chy.d $$6;
      if ($$3 instanceof chy.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new chy.c(this, $$6);
      } else {
         this.bY = false;
         chy.b[] $$8 = chy.b.values();
         cvm[] $$9 = cvm.values();
         chy.b $$10 = af.a($$8, $$4);
         cvm $$11 = af.a($$9, $$4);
         cvm $$12 = af.a($$9, $$4);
         $$6 = new chy.d($$10, $$11, $$12);
      }

      this.u($$6.a());
      return $$3;
   }

   public static boolean b(bus<chy> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(djo.J) && ($$1.t($$3).a(awo.an) || cia.c($$0, $$1, $$2, $$3, $$4));
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
      a("kob", chy.a.a, 0),
      b("sunstreak", chy.a.a, 1),
      c("snooper", chy.a.a, 2),
      d("dasher", chy.a.a, 3),
      e("brinely", chy.a.a, 4),
      f("spotty", chy.a.a, 5),
      g("flopper", chy.a.b, 0),
      h("stripey", chy.a.b, 1),
      i("glitter", chy.a.b, 2),
      j("blockfish", chy.a.b, 3),
      k("betty", chy.a.b, 4),
      l("clayfish", chy.a.b, 5);

      public static final Codec<chy.b> m = azv.a(chy.b::values);
      private static final IntFunction<chy.b> n = axq.a(chy.b::b, values(), a);
      private final String o;
      private final wp p;
      private final chy.a q;
      private final int r;

      private b(final String $$0, final chy.a $$1, final int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wp.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static chy.b a(int $$0) {
         return n.apply($$0);
      }

      public chy.a a() {
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

   static class c extends cgw.a {
      final chy.d b;

      c(chy $$0, chy.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(chy.b b, cvm c, cvm d) {
      public static final Codec<chy.d> a = Codec.INT.xmap(chy.d::new, chy.d::a);

      public d(int $$0) {
         this(chy.s($$0), chy.c($$0), chy.r($$0));
      }

      public int a() {
         return chy.a(this.b, this.c, this.d);
      }
   }
}
