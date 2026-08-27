import com.mojang.serialization.MapCodec;

public class cym extends cwy {
   public static final MapCodec<cym> a = b(cym::new);
   public static final dkg b = dkf.w;
   public static final dkg c = dkf.r;

   @Override
   protected MapCodec<? extends cym> a() {
      return a;
   }

   public cym(djo.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof ane $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof ane $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(djp $$0, ane $$1, hx $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         djp $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? art.fs : art.ft, aru.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
