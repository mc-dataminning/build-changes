import com.mojang.serialization.MapCodec;

public class diw extends ddy implements deb {
   public static final MapCodec<diw> a = b(diw::new);

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(dra.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      $$0.H_().c(lf.aC).flatMap($$0x -> $$0x.b(rr.n)).ifPresent($$3x -> ((dzk)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public deb.a aq_() {
      return deb.a.a;
   }
}
