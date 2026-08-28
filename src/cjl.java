import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjl extends cim {
   private static final String a = "type";
   private static final akh<Integer> b = akl.a(cjl.class, akj.b);

   public cjl(bwj<? extends cjl> $$0, dip $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public cys R_() {
      return new cys(cyw.rr);
   }

   @Override
   protected awk u() {
      return awl.wp;
   }

   @Override
   protected awk l_() {
      return awl.wq;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.ws;
   }

   @Override
   protected awk t() {
      return awl.wr;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, cjl.a.b.a());
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("type", this.gw().c());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cjl.a.a($$0.l("type")));
   }

   @Override
   public void j(cys $$0) {
      ciq.a(this, $$0);
      $$0.a(kj.az, this);
   }

   private void a(cjl.a $$0) {
      this.al.a(b, $$0.h);
   }

   public cjl.a gw() {
      return cjl.a.f.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.az ? c((ki<T>)$$0, this.gw()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.az);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.az) {
         this.a(c(kj.az, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      bsj.a<cjl.a> $$4 = bsj.b();
      $$4.a(cjl.a.a, 30);
      $$4.a(cjl.a.b, 50);
      $$4.a(cjl.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gx() {
      return this.gw().i;
   }

   @Override
   protected bwd e(bxl $$0) {
      return super.e($$0).a(this.gx());
   }

   public static enum a implements bai {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final bai.a<cjl.a> d = bai.a(cjl.a::values);
      static final IntFunction<cjl.a> f = aya.a(cjl.a::a, values(), aya.a.c);
      public static final yu<ByteBuf, cjl.a> e = ys.a(f, cjl.a::a);
      private final String g;
      final int h;
      final float i;

      private a(final String $$0, final int $$1, final float $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      @Override
      public String c() {
         return this.g;
      }

      int a() {
         return this.h;
      }

      static cjl.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
