import com.mojang.serialization.MapCodec;

public class djs extends dmz {
   public static final MapCodec<djs> a = b(djs::new);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(dvu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         jh $$4 = $$2.e();
         dvv $$5 = $$1.a_($$4);
         if (!a($$5.g($$1, $$4), jm.b)) {
            azq.a($$1, $$2, $$3, ls.H);
         }
      }
   }
}
