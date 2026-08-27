import com.mojang.serialization.MapCodec;

public class dbc extends cut implements cuw {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      $$0.b($$2.d(), cuv.rF.o());
   }
}
