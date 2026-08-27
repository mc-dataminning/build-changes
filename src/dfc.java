import com.mojang.serialization.MapCodec;

public class dfc extends dik {
   public static final MapCodec<dfc> a = b(dfc::new);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(drc.d $$0) {
      super($$0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         io $$4 = $$2.d();
         drd $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), it.b)) {
            ayi.a($$1, $$2, $$3, ky.H);
         }
      }
   }
}
