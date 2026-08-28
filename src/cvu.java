import javax.annotation.Nullable;

public class cvu extends cwc {
   public cvu(cuj.a $$0, dfw $$1, dfw $$2) {
      super($$1, $$2, $$0, ji.a);
   }

   public cvu(cuj.a $$0, dfw $$1, dfw $$2, ji $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(jd $$0, dcu $$1, @Nullable cmv $$2, cuo $$3, dta $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof drq $$6 && $$1.a_($$0).b() instanceof dmx $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
