import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckl extends cji {
   private static final String a = "type";
   private static final akl<Integer> b = akp.a(ckl.class, akn.b);

   public ckl(bxc<? extends ckl> $$0, djx $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public czy W_() {
      return new czy(dac.rw);
   }

   @Override
   protected awo u() {
      return awp.wt;
   }

   @Override
   protected awo l_() {
      return awp.wu;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.ww;
   }

   @Override
   protected awo t() {
      return awp.wv;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, ckl.a.d.a());
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("type", ckl.a.e, this.gA());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckl.a>a("type", ckl.a.e).orElse(ckl.a.d));
   }

   @Override
   public void a_(czy $$0) {
      cjm.a(this, $$0);
      $$0.a(kk.aA, this);
   }

   private void a(ckl.a $$0) {
      this.al.a(b, $$0.i);
   }

   public ckl.a gA() {
      return ckl.a.g.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aA ? c((kj<T>)$$0, this.gA()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aA) {
         this.a(c(kk.aA, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      btb.a<ckl.a> $$4 = btb.b();
      $$4.a(ckl.a.a, 30);
      $$4.a(ckl.a.b, 50);
      $$4.a(ckl.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gB() {
      return this.gA().j;
   }

   @Override
   protected bww e(byg $$0) {
      return super.e($$0).a(this.gB());
   }

   public static enum a implements bam {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final ckl.a d = b;
      public static final bam.a<ckl.a> e = bam.a(ckl.a::values);
      static final IntFunction<ckl.a> g = aye.a(ckl.a::a, values(), aye.a.c);
      public static final yy<ByteBuf, ckl.a> f = yw.a(g, ckl.a::a);
      private final String h;
      final int i;
      final float j;

      private a(final String $$0, final int $$1, final float $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      @Override
      public String c() {
         return this.h;
      }

      int a() {
         return this.i;
      }
   }
}
