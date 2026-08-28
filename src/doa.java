import com.mojang.serialization.MapCodec;

public class doa extends dfg {
   public static final MapCodec<doa> a = b(doa::new);
   protected static final ewi b = dex.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   protected doa(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof are && $$3 instanceof cot) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      ent $$3 = $$1.b_($$2);
      ent $$4 = $$1.b_($$2.c());
      return ($$3.a() == enu.c || $$0.b() instanceof div) && $$4.a() == enu.a;
   }
}
