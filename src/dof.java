import com.mojang.serialization.MapCodec;

public class dof extends dgf {
   public static final MapCodec<dof> n = b(dof::new);

   @Override
   public MapCodec<dof> a() {
      return n;
   }

   public dof(dtb.d $$0) {
      super($$0, () -> dqe.d);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dsa($$0, $$1);
   }

   @Override
   protected avw<akt> c() {
      return avz.i.b(avz.aj);
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return aym.a(dqj.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$3 == iw.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
