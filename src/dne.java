import com.mojang.serialization.MapCodec;

public class dne extends dpy implements dnd {
   public static final MapCodec<dne> c = b(dne::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dne> a() {
      return c;
   }

   public dne(eag.d $$0) {
      super($$0, ja.a, s_, false, 0.1);
      this.l(this.C.b().b(e, Integer.valueOf(0)).b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Override
   protected boolean h(eah $$0) {
      return $$0.l();
   }

   @Override
   protected dmf b() {
      return dmh.te;
   }

   @Override
   protected eah a(eah $$0, eah $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected eah a(eah $$0, azv $$1) {
      return super.a($$0, $$1).b(t_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(czh.xH);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      return dnd.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      super.a($$0);
      $$0.a(t_);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
