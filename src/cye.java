import com.mojang.serialization.MapCodec;

public class cye extends cwq {
   public static final MapCodec<cye> a = b(cye::new);
   public static final djy b = djx.w;
   public static final djy c = djx.r;

   @Override
   protected MapCodec<? extends cye> a() {
      return a;
   }

   public cye(djg.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof and $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof and $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(djh $$0, and $$1, hx $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         djh $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? ars.fd : ars.fe, art.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
