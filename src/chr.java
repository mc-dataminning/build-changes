import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chr extends cgu implements bwf<chr.a> {
   private static final String a = "type";
   private static final ajx<Integer> b = akb.a(chr.class, ajz.b);

   public chr(buq<? extends chr> $$0, dgg $$1) {
      super($$0, $$1);
      this.m_();
   }

   @Override
   public int gq() {
      return 5;
   }

   @Override
   public cwn W_() {
      return new cwn(cwr.rn);
   }

   @Override
   protected avy u() {
      return avz.wf;
   }

   @Override
   protected avy o_() {
      return avz.wg;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.wi;
   }

   @Override
   protected avy gp() {
      return avz.wh;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, chr.a.b.a());
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (b.equals($$0)) {
         this.m_();
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("type", this.gx().c());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chr.a.a($$0.l("type")));
   }

   @Override
   public void i(cwn $$0) {
      cgy.a(this, $$0);
      cyw.a(kv.X, $$0, $$0x -> $$0x.a("type", this.gx().c()));
   }

   @Override
   public void h(tq $$0) {
      cgy.a(this, $$0);
      this.a(chr.a.a($$0.l("type")));
   }

   public void a(chr.a $$0) {
      this.al.a(b, $$0.g);
   }

   public chr.a gx() {
      return chr.a.e.apply(this.al.a(b));
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      bqq.a<chr.a> $$4 = bqq.a();
      $$4.a(chr.a.a, 30);
      $$4.a(chr.a.b, 50);
      $$4.a(chr.a.c, 15);
      $$4.a().a(this.ae).ifPresent(this::a);
      return super.a($$0, $$1, $$2, $$3);
   }

   public float gy() {
      return this.gx().h;
   }

   @Override
   protected bum e(bvr $$0) {
      return super.e($$0).a(this.gy());
   }

   public static enum a implements azu {
      a("small", 0, 0.5F),
      b("medium", 1, 1.0F),
      c("large", 2, 1.5F);

      public static final azu.a<chr.a> d = azu.a(chr.a::values);
      static final IntFunction<chr.a> e = axp.a(chr.a::a, values(), axp.a.c);
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

      static chr.a a(String $$0) {
         return d.a($$0, b);
      }
   }
}
