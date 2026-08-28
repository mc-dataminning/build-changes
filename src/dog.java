import com.mojang.serialization.MapCodec;

public class dog extends dnk {
   public static final MapCodec<dog> a = b(dog::new);
   private static final wo b = wo.c("container.loom");

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   protected dog(dww.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ax);
      }

      return bsj.a;
   }

   @Override
   protected bsl b(dwx $$0, dgi $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new ctj($$2x, $$3, csp.a($$1, $$2)), b);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF);
   }
}
