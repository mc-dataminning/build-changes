import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjj extends cie {
   public static final cjj.d a = new cjj.d(cjj.b.a, cwv.a, cwv.a);
   private static final akg<Integer> c = akk.a(cjj.class, aki.b);
   public static final List<cjj.d> b = List.of(
      new cjj.d(cjj.b.h, cwv.b, cwv.h),
      new cjj.d(cjj.b.g, cwv.h, cwv.h),
      new cjj.d(cjj.b.g, cwv.h, cwv.l),
      new cjj.d(cjj.b.l, cwv.a, cwv.h),
      new cjj.d(cjj.b.b, cwv.l, cwv.h),
      new cjj.d(cjj.b.a, cwv.b, cwv.a),
      new cjj.d(cjj.b.f, cwv.g, cwv.d),
      new cjj.d(cjj.b.j, cwv.k, cwv.e),
      new cjj.d(cjj.b.l, cwv.a, cwv.o),
      new cjj.d(cjj.b.f, cwv.a, cwv.e),
      new cjj.d(cjj.b.i, cwv.a, cwv.h),
      new cjj.d(cjj.b.l, cwv.a, cwv.b),
      new cjj.d(cjj.b.d, cwv.j, cwv.g),
      new cjj.d(cjj.b.e, cwv.f, cwv.d),
      new cjj.d(cjj.b.k, cwv.o, cwv.a),
      new cjj.d(cjj.b.c, cwv.h, cwv.o),
      new cjj.d(cjj.b.j, cwv.o, cwv.a),
      new cjj.d(cjj.b.g, cwv.a, cwv.e),
      new cjj.d(cjj.b.a, cwv.o, cwv.a),
      new cjj.d(cjj.b.b, cwv.h, cwv.a),
      new cjj.d(cjj.b.d, cwv.j, cwv.e),
      new cjj.d(cjj.b.g, cwv.e, cwv.e)
   );
   private boolean bE = true;

   public cjj(bwb<? extends cjj> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cjj.b $$0, cwv $$1, cwv $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cwv c(int $$0) {
      return cwv.a($$0 >> 16 & 0xFF);
   }

   public static cwv r(int $$0) {
      return cwv.a($$0 >> 24 & 0xFF);
   }

   public static cjj.b s(int $$0) {
      return cjj.b.a($$0 & 65535);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.t($$0.h("Variant"));
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.bE;
   }

   private int gz() {
      return this.al.a(c);
   }

   public cwv gw() {
      return c(this.gz());
   }

   public cwv gx() {
      return r(this.gz());
   }

   public cjj.b gy() {
      return s(this.gz());
   }

   private void a(cjj.b $$0) {
      int $$1 = this.gz();
      cwv $$2 = c($$1);
      cwv $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cwv $$0) {
      int $$1 = this.gz();
      cjj.b $$2 = s($$1);
      cwv $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cwv $$0) {
      int $$1 = this.gz();
      cjj.b $$2 = s($$1);
      cwv $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      if ($$0 == kx.ay) {
         return b((kw<T>)$$0, this.gy());
      } else if ($$0 == kx.az) {
         return b((kw<T>)$$0, this.gw());
      } else {
         return $$0 == kx.aA ? b((kw<T>)$$0, this.gx()) : super.a($$0);
      }
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.ay);
      this.a($$0, kx.az);
      this.a($$0, kx.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.ay) {
         this.a(b(kx.ay, $$1));
         return true;
      } else if ($$0 == kx.az) {
         this.a(b(kx.az, $$1));
         return true;
      } else if ($$0 == kx.aA) {
         this.b(b(kx.aA, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Override
   public void j(cxy $$0) {
      super.j($$0);
      $$0.a(kx.ay, this);
      $$0.a(kx.az, this);
      $$0.a(kx.aA, this);
   }

   @Override
   public cxy R_() {
      return new cxy(cyc.rt);
   }

   @Override
   protected awj u() {
      return awk.AK;
   }

   @Override
   protected awj l_() {
      return awk.AL;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.AN;
   }

   @Override
   protected awj t() {
      return awk.AM;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.C_();
      cjj.d $$6;
      if ($$3 instanceof cjj.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = af.a(b, $$4);
         $$3 = new cjj.c(this, $$6);
      } else {
         this.bE = false;
         cjj.b[] $$8 = cjj.b.values();
         cwv[] $$9 = cwv.values();
         cjj.b $$10 = af.a($$8, $$4);
         cwv $$11 = af.a($$9, $$4);
         cwv $$12 = af.a($$9, $$4);
         $$6 = new cjj.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bwb<cjj> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dkw.J) && ($$1.t($$3).a(awy.ap) || cjl.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bag {
      a("kob", cjj.a.a, 0),
      b("sunstreak", cjj.a.a, 1),
      c("snooper", cjj.a.a, 2),
      d("dasher", cjj.a.a, 3),
      e("brinely", cjj.a.a, 4),
      f("spotty", cjj.a.a, 5),
      g("flopper", cjj.a.b, 0),
      h("stripey", cjj.a.b, 1),
      i("glitter", cjj.a.b, 2),
      j("blockfish", cjj.a.b, 3),
      k("betty", cjj.a.b, 4),
      l("clayfish", cjj.a.b, 5);

      public static final Codec<cjj.b> m = bag.a(cjj.b::values);
      private static final IntFunction<cjj.b> o = aya.a(cjj.b::b, values(), a);
      public static final yt<ByteBuf, cjj.b> n = yr.a(o, cjj.b::b);
      private final String p;
      private final wv q;
      private final cjj.a r;
      private final int s;

      private b(final String $$0, final cjj.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = wv.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static cjj.b a(int $$0) {
         return o.apply($$0);
      }

      public cjj.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public wv d() {
         return this.q;
      }
   }

   static class c extends cie.a {
      final cjj.d b;

      c(cjj $$0, cjj.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cjj.b b, cwv c, cwv d) {
      public static final Codec<cjj.d> a = Codec.INT.xmap(cjj.d::new, cjj.d::a);

      public d(int $$0) {
         this(cjj.s($$0), cjj.c($$0), cjj.r($$0));
      }

      public int a() {
         return cjj.a(this.b, this.c, this.d);
      }
   }
}
