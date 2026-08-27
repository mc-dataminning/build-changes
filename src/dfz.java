import com.mojang.serialization.MapCodec;

public class dfz extends cxh {
   public static final MapCodec<dfz> a = b(dfz::new);
   protected static final emv b = cwy.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   protected dfz(djo.d $$0) {
      super($$0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ane && $$3 instanceof chk) {
         $$1.a(new hx($$2), true, $$3);
      }
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      eez $$3 = $$1.b_($$2);
      eez $$4 = $$1.b_($$2.c());
      return ($$3.a() == efa.c || $$0.b() instanceof dav) && $$4.a() == efa.a;
   }
}
