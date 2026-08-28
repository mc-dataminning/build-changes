import javax.annotation.Nullable;

public class cvw extends cwe {
   public cvw(cul.a $$0, dfy $$1, dfy $$2) {
      super($$1, $$2, $$0, ji.a);
   }

   public cvw(cul.a $$0, dfy $$1, dfy $$2, ji $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(jd $$0, dcw $$1, @Nullable cmx $$2, cuq $$3, dtc $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof drs $$6 && $$1.a_($$0).b() instanceof dmz $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
