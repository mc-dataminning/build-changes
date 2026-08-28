import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckq extends cji {
   public static final ckq.d a = new ckq.d(ckq.b.a, cyw.a, cyw.a);
   private static final akl<Integer> c = akp.a(ckq.class, akn.b);
   public static final List<ckq.d> b = List.of(
      new ckq.d(ckq.b.h, cyw.b, cyw.h),
      new ckq.d(ckq.b.g, cyw.h, cyw.h),
      new ckq.d(ckq.b.g, cyw.h, cyw.l),
      new ckq.d(ckq.b.l, cyw.a, cyw.h),
      new ckq.d(ckq.b.b, cyw.l, cyw.h),
      new ckq.d(ckq.b.a, cyw.b, cyw.a),
      new ckq.d(ckq.b.f, cyw.g, cyw.d),
      new ckq.d(ckq.b.j, cyw.k, cyw.e),
      new ckq.d(ckq.b.l, cyw.a, cyw.o),
      new ckq.d(ckq.b.f, cyw.a, cyw.e),
      new ckq.d(ckq.b.i, cyw.a, cyw.h),
      new ckq.d(ckq.b.l, cyw.a, cyw.b),
      new ckq.d(ckq.b.d, cyw.j, cyw.g),
      new ckq.d(ckq.b.e, cyw.f, cyw.d),
      new ckq.d(ckq.b.k, cyw.o, cyw.a),
      new ckq.d(ckq.b.c, cyw.h, cyw.o),
      new ckq.d(ckq.b.j, cyw.o, cyw.a),
      new ckq.d(ckq.b.g, cyw.a, cyw.e),
      new ckq.d(ckq.b.a, cyw.o, cyw.a),
      new ckq.d(ckq.b.b, cyw.h, cyw.a),
      new ckq.d(ckq.b.d, cyw.j, cyw.e),
      new ckq.d(ckq.b.g, cyw.e, cyw.e)
   );
   private boolean e = true;

   public ckq(bxc<? extends ckq> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static String b(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(ckq.b $$0, cyw $$1, cyw $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cyw c(int $$0) {
      return cyw.a($$0 >> 16 & 0xFF);
   }

   public static cyw r(int $$0) {
      return cyw.a($$0 >> 24 & 0xFF);
   }

   public static ckq.b s(int $$0) {
      return ckq.b.a($$0 & 65535);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, a.a());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", ckq.d.a, new ckq.d(this.gD()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ckq.d $$1 = $$0.<ckq.d>a("Variant", ckq.d.a).orElse(a);
      this.t($$1.a());
   }

   private void t(int $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public boolean q(int $$0) {
      return !this.e;
   }

   private int gD() {
      return this.al.a(c);
   }

   public cyw gA() {
      return c(this.gD());
   }

   public cyw gB() {
      return r(this.gD());
   }

   public ckq.b gC() {
      return s(this.gD());
   }

   private void a(ckq.b $$0) {
      int $$1 = this.gD();
      cyw $$2 = c($$1);
      cyw $$3 = r($$1);
      this.t(a($$0, $$2, $$3));
   }

   private void a(cyw $$0) {
      int $$1 = this.gD();
      ckq.b $$2 = s($$1);
      cyw $$3 = r($$1);
      this.t(a($$2, $$0, $$3));
   }

   private void b(cyw $$0) {
      int $$1 = this.gD();
      ckq.b $$2 = s($$1);
      cyw $$3 = c($$1);
      this.t(a($$2, $$3, $$0));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      if ($$0 == kk.aC) {
         return c((kj<T>)$$0, this.gC());
      } else if ($$0 == kk.aD) {
         return c((kj<T>)$$0, this.gA());
      } else {
         return $$0 == kk.aE ? c((kj<T>)$$0, this.gB()) : super.a($$0);
      }
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aC);
      this.a($$0, kk.aD);
      this.a($$0, kk.aE);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aC) {
         this.a(c(kk.aC, $$1));
         return true;
      } else if ($$0 == kk.aD) {
         this.a(c(kk.aD, $$1));
         return true;
      } else if ($$0 == kk.aE) {
         this.b(c(kk.aE, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a_(czy $$0) {
      super.a_($$0);
      $$0.a(kk.aC, this);
      $$0.a(kk.aD, this);
      $$0.a(kk.aE, this);
   }

   @Override
   public czy W_() {
      return new czy(dac.ry);
   }

   @Override
   protected awo u() {
      return awp.AQ;
   }

   @Override
   protected awo l_() {
      return awp.AR;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.AT;
   }

   @Override
   protected awo t() {
      return awp.AS;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azx $$4 = $$0.G_();
      ckq.d $$6;
      if ($$3 instanceof ckq.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ag.a(b, $$4);
         $$3 = new ckq.c(this, $$6);
      } else {
         this.e = false;
         ckq.b[] $$8 = ckq.b.values();
         cyw[] $$9 = cyw.values();
         ckq.b $$10 = ag.a($$8, $$4);
         cyw $$11 = ag.a($$9, $$4);
         cyw $$12 = ag.a($$9, $$4);
         $$6 = new ckq.d($$10, $$11, $$12);
      }

      this.t($$6.a());
      return $$3;
   }

   public static boolean b(bxc<ckq> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.b_($$3.e()).a(axj.a) && $$1.a_($$3.d()).a(dne.J) && ($$1.u($$3).a(axd.ap) || cks.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements bam, ddd {
      a("kob", ckq.a.a, 0),
      b("sunstreak", ckq.a.a, 1),
      c("snooper", ckq.a.a, 2),
      d("dasher", ckq.a.a, 3),
      e("brinely", ckq.a.a, 4),
      f("spotty", ckq.a.a, 5),
      g("flopper", ckq.a.b, 0),
      h("stripey", ckq.a.b, 1),
      i("glitter", ckq.a.b, 2),
      j("blockfish", ckq.a.b, 3),
      k("betty", ckq.a.b, 4),
      l("clayfish", ckq.a.b, 5);

      public static final Codec<ckq.b> m = bam.a(ckq.b::values);
      private static final IntFunction<ckq.b> o = aye.a(ckq.b::b, values(), a);
      public static final yy<ByteBuf, ckq.b> n = yw.a(o, ckq.b::b);
      private final String p;
      private final xa q;
      private final ckq.a r;
      private final int s;

      private b(final String $$0, final ckq.a $$1, final int $$2) {
         this.p = $$0;
         this.r = $$1;
         this.s = $$1.c | $$2 << 8;
         this.q = xa.c("entity.minecraft.tropical_fish.type." + this.p);
      }

      public static ckq.b a(int $$0) {
         return o.apply($$0);
      }

      public ckq.a a() {
         return this.r;
      }

      public int b() {
         return this.s;
      }

      @Override
      public String c() {
         return this.p;
      }

      public xa d() {
         return this.q;
      }

      @Override
      public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
         cyw $$4 = $$3.a(kk.aD, ckq.a.c());
         cyw $$5 = $$3.a(kk.aE, ckq.a.d());
         o[] $$6 = new o[]{o.u, o.h};
         int $$7 = ckq.b.indexOf(new ckq.d(this, $$4, $$5));
         if ($$7 != -1) {
            $$1.accept(xa.c(ckq.b($$7)).a($$6));
         } else {
            $$1.accept(this.q.e().a($$6));
            xo $$8 = xa.c("color.minecraft." + $$4.b());
            if ($$4 != $$5) {
               $$8.f(", ").b(xa.c("color.minecraft." + $$5.b()));
            }

            $$8.a($$6);
            $$1.accept($$8);
         }
      }
   }

   static class c extends cji.a {
      final ckq.d b;

      c(ckq $$0, ckq.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(ckq.b b, cyw c, cyw d) {
      public static final Codec<ckq.d> a = Codec.INT.xmap(ckq.d::new, ckq.d::a);

      public d(int $$0) {
         this(ckq.s($$0), ckq.c($$0), ckq.r($$0));
      }

      public int a() {
         return ckq.a(this.b, this.c, this.d);
      }
   }
}
