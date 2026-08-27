import javax.annotation.Nullable;

public class crk extends crt {
   public crk(cqf.a $$0, daa $$1, daa $$2) {
      super($$1, $$2, $$0, ih.a);
   }

   public crk(cqf.a $$0, daa $$1, daa $$2, ih $$3) {
      super($$1, $$2, $$0, $$3);
   }

   @Override
   protected boolean a(ib $$0, cwz $$1, @Nullable cis $$2, cqk $$3, dmz $$4) {
      boolean $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$1.B && !$$5 && $$2 != null && $$1.c_($$0) instanceof dlp $$6 && $$1.a_($$0).b() instanceof dgz $$7) {
         $$7.a($$2, $$6, true);
      }

      return $$5;
   }
}
