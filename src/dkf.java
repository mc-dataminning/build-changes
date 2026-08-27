import com.mojang.serialization.MapCodec;

public class dkf extends dfc implements dff {
   public static final MapCodec<dkf> a = b(dkf::new);

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      $$0.I_().c(li.aC).flatMap($$0x -> $$0x.b(ry.o)).ifPresent($$3x -> ((ebm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public dff.a aq_() {
      return dff.a.a;
   }
}
