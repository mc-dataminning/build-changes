import com.mojang.serialization.MapCodec;

public class dmz extends dpr implements dmx {
   public static final MapCodec<dmz> c = b(dmz::new);

   @Override
   public MapCodec<dmz> a() {
      return c;
   }

   public dmz(dzy.d $$0) {
      super($$0, ja.a, s_, false);
      this.l(this.B.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dps c() {
      return (dps)dmc.ta;
   }

   @Override
   protected dzz a(dzz $$0, dzz $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(czc.xC);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      return dmx.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
