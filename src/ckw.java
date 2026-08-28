import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckw extends cjt {
   private static final String a = "type";
   private static final aku<Integer> b = aky.a(ckw.class, akw.b);

   public ckw(bxn<? extends ckw> $$0, dkj $$1) {
      super($$0, $$1);
      this.h_();
   }

   @Override
   public int gw() {
      return 5;
   }

   @Override
   public dak a() {
      return new dak(dao.rw);
   }

   @Override
   protected awx s() {
      return awy.wt;
   }

   @Override
   protected awx j_() {
      return awy.wu;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.ww;
   }

   @Override
   protected awx gv() {
      return awy.wv;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(b, ckw.a.d.a());
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.h_();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("type", ckw.a.e, this.gD());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckw.a>a("type", ckw.a.e).orElse(ckw.a.d));
   }

   @Override
   public void a_(dak $$0) {
      cjx.a(this, $$0);
      $$0.a(kl.aA, this);
   }

   private void a(ckw.a $$0) {
      this.al.a(b, $$0.i);
   }

   public ckw.a gD() {
      return ckw.a.g.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aA ? c((kk<T>)$$0, this.gD()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aA);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aA) {
         this.a(c(kl.aA, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      btm.a<ckw.a> $$4 = btm.b();
      $$4.a(ckw.a.a, 30);
      $$4.a(ckw.a.b, 50);
      $$4.a(ckw.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gE() {
      return this.gD().j;
   }

   @Override
   protected bxh e(byr $$0) {
      return super.e($$0).a(this.gE());
   }

   public static enum a implements bax {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final ckw.a d = b;
      public static final bax.a<ckw.a> e = bax.a(ckw.a::values);
      static final IntFunction<ckw.a> g = ayo.a(ckw.a::a, values(), ayo.a.c);
      public static final ze<ByteBuf, ckw.a> f = zc.a(g, ckw.a::a);
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
