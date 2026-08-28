import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckb extends cis {
   public static final ckb.d a = new ckb.d(ckb.b.a, cyb.a, cyb.a);
   private static final akj<Integer> c = akn.a(ckb.class, akl.b);
   public static final List<ckb.d> b = List.of(
      new ckb.d(ckb.b.h, cyb.b, cyb.h),
      new ckb.d(ckb.b.g, cyb.h, cyb.h),
      new ckb.d(ckb.b.g, cyb.h, cyb.l),
      new ckb.d(ckb.b.l, cyb.a, cyb.h),
      new ckb.d(ckb.b.b, cyb.l, cyb.h),
      new ckb.d(ckb.b.a, cyb.b, cyb.a),
      new ckb.d(ckb.b.f, cyb.g, cyb.d),
      new ckb.d(ckb.b.j, cyb.k, cyb.e),
      new ckb.d(ckb.b.l, cyb.a, cyb.o),
      new ckb.d(ckb.b.f, cyb.a, cyb.e),
      new ckb.d(ckb.b.i, cyb.a, cyb.h),
      new ckb.d(ckb.b.l, cyb.a, cyb.b),
      new ckb.d(ckb.b.d, cyb.j, cyb.g),
      new ckb.d(ckb.b.e, cyb.f, cyb.d),
      new ckb.d(ckb.b.k, cyb.o, cyb.a),
      new ckb.d(ckb.b.c, cyb.h, cyb.o),
      new ckb.d(ckb.b.j, cyb.o, cyb.a),
      new ckb.d(ckb.b.g, cyb.a, cyb.e),
      new ckb.d(ckb.b.a, cyb.o, cyb.a),
      new ckb.d(ckb.b.b, cyb.h, cyb.a),
      new ckb.d(ckb.b.d, cyb.j, cyb.e),
      new ckb.d(ckb.b.g, cyb.e, cyb.e)
   );
   private boolean bG = true;

   public ckb(bwo<? extends ckb> $$0, dja $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(ckb.b $$0, cyb $$1, cyb $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cyb c(int $$0) {
      return cyb.a($$0 >> 16 & 0xFF);
   }

   public static cyb r(int $$0) {
      return cyb.a($$0 >> 24 & 0xFF);
   }

   public static ckb.b s(int $$0) {
      return ckb.b.a($$0 & 65535);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.t($$0.h("Variant"));
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bG;
   }

   private int gA() {
      return this.al.a(c);
   }

   public cyb gx() {
      return c(this.gA());
   }

   public cyb gy() {
      return r(this.gA());
   }

   public ckb.b gz() {
      return s(this.gA());
   }

   private void a(ckb.b $$0) {
      int $$1 = this.gA();
      cyb $$2 = c($$1);
      cyb $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cyb $$0) {
      int $$1 = this.gA();
      ckb.b $$2 = s($$1);
      cyb $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cyb $$0) {
      int $$1 = this.gA();
      ckb.b $$2 = s($$1);
      cyb $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      if ($$0 == kj.aB) {
         return c((ki<T>)$$0, this.gz());
      } else if ($$0 == kj.aC) {
         return c((ki<T>)$$0, this.gx());
      } else {
         return $$0 == kj.aD ? c((ki<T>)$$0, this.gy()) : super.a($$0);
      }
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aB);
      this.a($$0, kj.aC);
      this.a($$0, kj.aD);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aB) {
         this.a(c(kj.aB, $$1));
         return true;
      } else if ($$0 == kj.aC) {
         this.a(c(kj.aC, $$1));
         return true;
      } else if ($$0 == kj.aD) {
         this.b(c(kj.aD, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(czd $$0) {
      super.a_($$0);
      $$0.a(kj.aB, this);
      $$0.a(kj.aC, this);
      $$0.a(kj.aD, this);
   }

   @Override
   public czd S_() {
      return new czd(czh.ry);
   }

   @Override
   protected awm u() {
      return awn.AQ;
   }

   @Override
   protected awm l_() {
      return awn.AR;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.AT;
   }

   @Override
   protected awm t() {
      return awn.AS;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      ckb.d $$6;
      if ($$3 instanceof ckb.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new ckb.c(this, $$6);
      } else {
         this.bG = false;
         ckb.b[] $$8 = ckb.b.values();
         cyb[] $$9 = cyb.values();
         ckb.b $$10 = af.a($$8, $$4);
         cyb $$11 = af.a($$9, $$4);
         cyb $$12 = af.a($$9, $$4);
         $$6 = new ckb.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bwo<ckb> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmh.J) && ($$1.u($$3).a(axb.ap) || ckd.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bak, dci {
      a("kob", ckb.a.a, 0),
      b("sunstreak", ckb.a.a, 1),
      c("snooper", ckb.a.a, 2),
      d("dasher", ckb.a.a, 3),
      e("brinely", ckb.a.a, 4),
      f("spotty", ckb.a.a, 5),
      g("flopper", ckb.a.b, 0),
      h("stripey", ckb.a.b, 1),
      i("glitter", ckb.a.b, 2),
      j("blockfish", ckb.a.b, 3),
      k("betty", ckb.a.b, 4),
      l("clayfish", ckb.a.b, 5);

      public static final Codec<ckb.b> m = bak.a(ckb.b::values);
      private static final IntFunction<ckb.b> o = ayc.a(ckb.b::b, values(), a);
      public static final yw<ByteBuf, ckb.b> n = yu.a(o, ckb.b::b);
      private final String p;
      private final wy q;
      private final ckb.a r;
      private final int s;

      private b(final String $$0, final ckb.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = wy.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static ckb.b a(int $$0) {
         return o.apply($$0);
      }

      public ckb.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public wy d() {
         return this.q;
      }

      @Override
      public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
         cyb $$4 = $$3.a(kj.aC, ckb.a.c());
         cyb $$5 = $$3.a(kj.aD, ckb.a.d());
         n[] $$6 = new n[]{n.u, n.h};
         int $$7 = ckb.b.indexOf(new ckb.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(wy.c(ckb.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xm $$8 = wy.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(wy.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cis.a {
      final ckb.d b;

      c(ckb $$0, ckb.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(ckb.b b, cyb c, cyb d) {
      public static final Codec<ckb.d> a = Codec.INT.xmap(ckb.d::new, ckb.d::a);

      public d(int $$0) {
         this(ckb.s($$0), ckb.c($$0), ckb.r($$0));
      }

      public int a() {
         return ckb.a(this.b, this.c, this.d);
      }
   }
}
