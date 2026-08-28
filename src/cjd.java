import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjd extends cie {
   private static final String a = "type";
   private static final akg<Integer> b = akk.a(cjd.class, aki.b);

   public cjd(bwb<? extends cjd> $$0, dhp $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   public int x() {
      return 5;
   }

   @Override
   public cxy R_() {
      return new cxy(cyc.rr);
   }

   @Override
   protected awj u() {
      return awk.wp;
   }

   @Override
   protected awj l_() {
      return awk.wq;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.ws;
   }

   @Override
   protected awj t() {
      return awk.wr;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, cjd.a.b.a());
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("type", this.gw().c());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(cjd.a.a($$0.l("type")));
   }

   @Override
   public void j(cxy $$0) {
      cii.a(this, $$0);
      $$0.a(kx.aw, this);
   }

   private void a(cjd.a $$0) {
      this.al.a(b, $$0.h);
   }

   public cjd.a gw() {
      return cjd.a.f.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aw ? b((kw<T>)$$0, this.gw()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aw);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aw) {
         this.a(b(kx.aw, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      bsb.a<cjd.a> $$4 = bsb.b();
      $$4.a(cjd.a.a, 30);
      $$4.a(cjd.a.b, 50);
      $$4.a(cjd.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gx() {
      return this.gw().i;
   }

   @Override
   protected bvv e(bxd $$0) {
      return super.e($$0).a(this.gx());
   }

   public static enum a implements bag {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final bag.a<cjd.a> d = bag.a(cjd.a::values);
      static final IntFunction<cjd.a> f = aya.a(cjd.a::a, values(), aya.a.c);
      public static final yt<ByteBuf, cjd.a> e = yr.a(f, cjd.a::a);
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

      static cjd.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
