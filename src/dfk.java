import com.mojang.serialization.MapCodec;

public class dfk extends cws {
   public static final MapCodec<dfk> a = b(dfk::new);
   protected static final emf b = cwj.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   protected dfk(diz.d $$0) {
      super($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof amz && $$3 instanceof cgv) {
         $$1.a(new hx($$2), true, $$3);
      }
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      eek $$3 = $$1.b_($$2);
      eek $$4 = $$1.b_($$2.c());
      return ($$3.a() == eel.c || $$0.b() instanceof dag) && $$4.a() == eel.a;
   }
}
