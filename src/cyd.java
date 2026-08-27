import com.mojang.serialization.MapCodec;

public class cyd extends cwp {
   public static final MapCodec<cyd> a = b(cyd::new);
   public static final djx b = djw.w;
   public static final djx c = djw.r;

   @Override
   protected MapCodec<? extends cyd> a() {
      return a;
   }

   public cyd(djf.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof and $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$1 instanceof and $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(djg $$0, and $$1, hx $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         djg $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? arr.fd : arr.fe, ars.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, b);
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
