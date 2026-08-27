import com.mojang.serialization.MapCodec;

public class cxx extends cwj {
   public static final MapCodec<cxx> a = b(cxx::new);
   public static final djr b = djq.w;
   public static final djr c = djq.r;

   @Override
   protected MapCodec<? extends cxx> a() {
      return a;
   }

   public cxx(diz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof amz $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof amz $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dja $$0, amz $$1, hx $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dja $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? arm.fd : arm.fe, arn.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
