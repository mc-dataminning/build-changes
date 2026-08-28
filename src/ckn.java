import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckn extends cjk {
   private static final String a = "type";
   private static final akn<Integer> b = akr.a(ckn.class, akp.b);

   public ckn(bxe<? extends ckn> $$0, djz $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public daa W_() {
      return new daa(dae.rw);
   }

   @Override
   protected awq u() {
      return awr.wt;
   }

   @Override
   protected awq l_() {
      return awr.wu;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.ww;
   }

   @Override
   protected awq t() {
      return awr.wv;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(b, ckn.a.d.a());
   }

   @Override
   public void a(akn<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("type", ckn.a.e, this.gA());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckn.a>a("type", ckn.a.e).orElse(ckn.a.d));
   }

   @Override
   public void a_(daa $$0) {
      cjo.a(this, $$0);
      $$0.a(kl.aA, this);
   }

   private void a(ckn.a $$0) {
      this.al.a(b, $$0.i);
   }

   public ckn.a gA() {
      return ckn.a.g.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aA ? c((kk<T>)$$0, this.gA()) : super.a($$0);
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      btd.a<ckn.a> $$4 = btd.b();
      $$4.a(ckn.a.a, 30);
      $$4.a(ckn.a.b, 50);
      $$4.a(ckn.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gB() {
      return this.gA().j;
   }

   @Override
   protected bwy e(byi $$0) {
      return super.e($$0).a(this.gB());
   }

   public static enum a implements bao {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final ckn.a d = b;
      public static final bao.a<ckn.a> e = bao.a(ckn.a::values);
      static final IntFunction<ckn.a> g = ayg.a(ckn.a::a, values(), ayg.a.c);
      public static final za<ByteBuf, ckn.a> f = yy.a(g, ckn.a::a);
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
