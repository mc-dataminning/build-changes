import com.mojang.serialization.MapCodec;

public class cxa extends cwj {
   public static final MapCodec<cxa> a = b(cxa::new);
   protected static final emf b = cwj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends cxa> a() {
      return a;
   }

   public cxa(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return b;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return !$$1.u($$2.d());
   }
}
