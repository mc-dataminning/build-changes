import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cht extends cgw implements bwh<cht.a> {
   private static final String a = "type";
   private static final ajy<Integer> b = akc.a(cht.class, aka.b);

   public cht(bus<? extends cht> $$0, dgi $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gt() {
      return 5;
   }

   @Override
   public cwp W_() {
      return new cwp(cwt.rn);
   }

   @Override
   protected avz u() {
      return awa.wf;
   }

   @Override
   protected avz o_() {
      return awa.wg;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.wi;
   }

   @Override
   protected avz gs() {
      return awa.wh;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, cht.a.b.a());
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.m_();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("type", this.gA().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cht.a.a($$0.l("type")));
   }

   @Override
   public void i(cwp $$0) {
      cha.a(this, $$0);
      cyy.a(kv.X, $$0, $$0x -> $$0x.a("type", this.gA().c()));
   }

   @Override
   public void h(tq $$0) {
      cha.a(this, $$0);
      this.a(cht.a.a($$0.l("type")));
   }

   public void a(cht.a $$0) {
      this.al.a(b, $$0.g);
   }

   public cht.a gA() {
      return cht.a.e.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bqs.a<cht.a> $$4 = bqs.a();
      $$4.a(cht.a.a, 30);
      $$4.a(cht.a.b, 50);
      $$4.a(cht.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gB() {
      return this.gA().h;
   }

   @Override
   protected buo e(bvt $$0) {
      return super.e($$0).a(this.gB());
   }

   public static enum a implements azv {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final azv.a<cht.a> d = azv.a(cht.a::values);
      static final IntFunction<cht.a> e = axq.a(cht.a::a, values(), axq.a.c);
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

      static cht.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
