import javax.annotation.Nullable;

public class chd extends cds implements cel {
   private final amg c;

   public chd(cpn $$0, amg $$1, cfu.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Override
   public bdx a(cij $$0) {
      bdx $$1 = super.a($$0);
      byo $$2 = $$0.o();
      if ($$1.a() && $$2 != null && !$$2.f()) {
         bdw $$3 = $$0.p();
         $$2.a($$3, cgc.pK.ae_());
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.q();
   }

   @Override
   protected amg a(dcb $$0) {
      return this.c;
   }

   @Override
   public boolean a(@Nullable byo $$0, cmm $$1, gu $$2, @Nullable eee $$3) {
      if ($$1.j($$2) && $$1.t($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.e().n(), 3);
         }

         $$1.a($$0, dgl.A, $$2);
         $$1.a($$0, $$2, this.c, ami.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
