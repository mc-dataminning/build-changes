import com.mojang.serialization.MapCodec;

public class diy extends dea implements ded {
   public static final MapCodec<diy> a = b(diy::new);

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(drc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      $$0.H_().c(lf.aC).flatMap($$0x -> $$0x.b(rr.n)).ifPresent($$3x -> ((dzm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public ded.a ar_() {
      return ded.a.a;
   }
}
