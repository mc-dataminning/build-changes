import com.mojang.serialization.MapCodec;

public class cya extends dbh {
   public static final MapCodec<cya> a = b(cya::new);

   @Override
   public MapCodec<cya> a() {
      return a;
   }

   public cya(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hx $$4 = $$2.d();
         djp $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ic.b)) {
            aus.a($$1, $$2, $$3, jx.F);
         }
      }
   }
}
