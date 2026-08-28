import com.mojang.serialization.MapCodec;

public abstract class den extends dfi {
   private final ctg a;

   protected den(ctg $$0, dsz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends den> a();

   @Override
   public boolean a(dta $$0) {
      return true;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dpu($$0, $$1, this.a);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return $$0.c_($$1) instanceof dpu $$3 ? $$3.c() : super.a($$0, $$1, $$2);
   }

   public ctg b() {
      return this.a;
   }
}
