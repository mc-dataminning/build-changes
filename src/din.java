import com.mojang.serialization.MapCodec;

public class din extends dbd {
   public static final MapCodec<din> n = b(din::new);

   @Override
   public MapCodec<din> a() {
      return n;
   }

   public din(dmy.d $$0) {
      super($$0, () -> dki.c);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dly($$0, $$1);
   }

   @Override
   protected auf<ajh> c() {
      return aui.i.b(aui.ai);
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return aww.a(dkn.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
