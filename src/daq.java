import javax.annotation.Nullable;

public class daq extends day {
   public daq(dmr $$0, dmr $$1, czj.a $$2) {
      super($$0, $$1, jb.a, $$2);
   }

   public daq(czj.a $$0, dmr $$1, dmr $$2, jb $$3) {
      super($$1, $$2, $$3, $$0);
   }

   @Override
   protected boolean a(iv $$0, djm $$1, @Nullable crm $$2, czn $$3, eat $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.C && !$$5 && $$2 != null && $$1.c_($$0) instanceof dzf $$6 && $$1.a_($$0).b() instanceof dub $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
