import com.mojang.serialization.MapCodec;

public class dbg extends cwj implements cwm {
   public static final MapCodec<dbg> a = b(dbg::new);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbg(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qf.n)).ifPresent($$3x -> ((dra)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }
}
