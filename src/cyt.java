import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyt extends czo {
   private final cpd a;

   protected cyt(cpd $$0, dna.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends cyt> a();

   @Override
   public boolean a(dnb $$0) {
      return true;
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new djy($$0, $$1, this.a);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, @Nullable bpp $$3, cqm $$4) {
      if ($$0.B) {
         $$0.a($$1, dkk.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.B()) {
         $$0.a($$1, dkk.t).ifPresent($$1x -> $$1x.a($$4.z()));
      }
   }

   @Override
   public cqm a(cxe $$0, ib $$1, dnb $$2) {
      dki $$3 = $$0.c_($$1);
      return $$3 instanceof djy ? ((djy)$$3).c() : super.a($$0, $$1, $$2);
   }

   public cpd b() {
      return this.a;
   }
}
