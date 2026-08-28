import com.mojang.serialization.MapCodec;

public class dnp extends dge {
   public static final MapCodec<dnp> n = b(dnp::new);

   @Override
   public MapCodec<dnp> a() {
      return n;
   }

   public dnp(dsd.d $$0) {
      super($$0, () -> dpl.c);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new drc($$0, $$1);
   }

   @Override
   protected awh<alf> c() {
      return awk.i.b(awk.ai);
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return ayz.a(dpq.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
