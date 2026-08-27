import com.mojang.serialization.MapCodec;

public class dcy extends cwp implements cws {
   public static final MapCodec<dcy> a = b(dcy::new);

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(djf.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      $$0.b($$2.d(), cwr.sG.o());
   }
}
