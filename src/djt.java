import com.mojang.serialization.MapCodec;

public class djt extends deu {
   public static final MapCodec<djt> a = b(djt::new);
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return ewc.b();
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.b();
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 0.2F;
   }
}
