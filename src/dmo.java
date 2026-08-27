import com.mojang.serialization.MapCodec;

public class dmo extends dfd {
   public static final MapCodec<dmo> n = b(dmo::new);

   @Override
   public MapCodec<dmo> a() {
      return n;
   }

   public dmo(drc.d $$0) {
      super($$0, () -> dok.c);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dqb($$0, $$1);
   }

   @Override
   protected avp<akn> c() {
      return avs.i.b(avs.ai);
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return ayf.a(dop.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 == it.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
