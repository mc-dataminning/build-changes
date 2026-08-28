import com.mojang.serialization.Codec;

public class efe extends eef<egv> {
   public efe(Codec<egv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egv> $$0) {
      egv $$1 = $$0.f();
      azr $$2 = $$0.d();
      dfs $$3 = $$0.b();
      dxa $$4 = $$0.c();
      jg $$5 = $$0.e();

      for (efz $$6 : $$1.b) {
         if ($$2.i() < $$6.c) {
            return $$6.a($$3, $$4, $$2, $$5);
         }
      }

      return $$1.c.a().a($$3, $$4, $$2, $$5);
   }
}
