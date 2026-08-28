import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cij extends chm implements bwx<cij.a> {
   private static final String a = "type";
   private static final aks<Integer> b = akw.a(cij.class, aku.b);

   public cij(bvi<? extends cij> $$0, dgz $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gp() {
      return 5;
   }

   @Override
   public cxg X_() {
      return new cxg(cxk.rn);
   }

   @Override
   protected awu u() {
      return awv.wf;
   }

   @Override
   protected awu o_() {
      return awv.wg;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.wi;
   }

   @Override
   protected awu go() {
      return awv.wh;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(b, cij.a.b.a());
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.m_();
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("type", this.gw().c());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cij.a.a($$0.l("type")));
   }

   @Override
   public void i(cxg $$0) {
      chq.a(this, $$0);
      czp.a(ku.X, $$0, $$0x -> $$0x.a("type", this.gw().c()));
   }

   @Override
   public void h(um $$0) {
      chq.a(this, $$0);
      this.a(cij.a.a($$0.l("type")));
   }

   public void a(cij.a $$0) {
      this.al.a(b, $$0.g);
   }

   public cij.a gw() {
      return cij.a.e.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bri.a<cij.a> $$4 = bri.a();
      $$4.a(cij.a.a, 30);
      $$4.a(cij.a.b, 50);
      $$4.a(cij.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gx() {
      return this.gw().h;
   }

   @Override
   protected bve e(bwj $$0) {
      return super.e($$0).a(this.gx());
   }

   public static enum a implements baq {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final baq.a<cij.a> d = baq.a(cij.a::values);
      static final IntFunction<cij.a> e = ayl.a(cij.a::a, values(), ayl.a.c);
      private final String f;
      final int g;
      final float h;

      private a(final String $$0, final int $$1, final float $$2) {
         this.f = $$0;
         this.g = $$1;
         this.h = $$2;
      }

      @Override
      public String c() {
         return this.f;
      }

      int a() {
         return this.g;
      }

      static cij.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
