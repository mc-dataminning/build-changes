import com.mojang.serialization.MapCodec;

public class dhe extends dch implements dck {
   public static final MapCodec<dhe> a = b(dhe::new);

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(dph.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      $$0.H_().c(ku.az).flatMap($$0x -> $$0x.b(rc.n)).ifPresent($$3x -> ((dxr)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dck.a aq_() {
      return dck.a.a;
   }
}
