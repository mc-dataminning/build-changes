import com.mojang.serialization.MapCodec;

public abstract class dgv extends dhq {
   private final cuy a;

   protected dgv(cuy $$0, dvi.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dgv> a();

   @Override
   public boolean a(dvj $$0) {
      return true;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dsb($$0, $$1, this.a);
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return $$0.c_($$1) instanceof dsb $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public cuy b() {
      return this.a;
   }
}
