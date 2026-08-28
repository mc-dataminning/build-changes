import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjv extends cis {
   private static final String a = "type";
   private static final akj<Integer> b = akn.a(cjv.class, akl.b);

   public cjv(bwo<? extends cjv> $$0, dja $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public czd S_() {
      return new czd(czh.rw);
   }

   @Override
   protected awm u() {
      return awn.wt;
   }

   @Override
   protected awm l_() {
      return awn.wu;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.ww;
   }

   @Override
   protected awm t() {
      return awn.wv;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, cjv.a.b.a());
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("type", this.gx().c());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjv.a.a($$0.l("type")));
   }

   @Override
   public void a_(czd $$0) {
      ciw.a(this, $$0);
      $$0.a(kj.az, this);
   }

   private void a(cjv.a $$0) {
      this.al.a(b, $$0.h);
   }

   public cjv.a gx() {
      return cjv.a.f.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.az ? c((ki<T>)$$0, this.gx()) : super.a($$0);
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
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      bso.a<cjv.a> $$4 = bso.b();
      $$4.a(cjv.a.a, 30);
      $$4.a(cjv.a.b, 50);
      $$4.a(cjv.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gy() {
      return this.gx().i;
   }

   @Override
   protected bwi e(bxq $$0) {
      return super.e($$0).a(this.gy());
   }

   public static enum a implements bak {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final bak.a<cjv.a> d = bak.a(cjv.a::values);
      static final IntFunction<cjv.a> f = ayc.a(cjv.a::a, values(), ayc.a.c);
      public static final yw<ByteBuf, cjv.a> e = yu.a(f, cjv.a::a);
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

      static cjv.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
