import com.mojang.serialization.MapCodec;

public class dgi extends deu {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dso b = dsn.w;
   public static final dso c = dsn.r;

   @Override
   protected MapCodec<? extends dgi> a() {
      return a;
   }

   public dgi(drw.d $$0) {
      super($$0);
      this.k(this.n().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arb $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$1 instanceof arb $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(drx $$0, arb $$1, iz $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         drx $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? avw.fG : avw.fH, avx.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
