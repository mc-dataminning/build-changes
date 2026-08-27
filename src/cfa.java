import javax.annotation.Nullable;

public interface cfa extends cht {
   bfo g();

   default amg ak_() {
      return amh.af;
   }

   default bdy<cfz> a(cfu $$0, cmm $$1, byo $$2, bdw $$3) {
      cfz $$4 = $$2.b($$3);
      bfo $$5 = bgb.h($$4);
      cfz $$6 = $$2.c($$5);
      if (!cki.d($$6) && !cfz.a($$4, $$6)) {
         if (!$$1.r_()) {
            $$2.b(amr.c.b($$0));
         }

         cfz $$7 = $$6.b() ? $$4 : $$6.c();
         cfz $$8 = $$4.c();
         $$2.a($$5, $$8);
         return bdy.a($$7, $$1.r_());
      } else {
         return bdy.d($$4);
      }
   }

   @Nullable
   static cfa c_(cfz $$0) {
      cfu $$3 = $$0.d();
      if ($$3 instanceof cfa) {
         return (cfa)$$3;
      } else {
         if ($$0.d() instanceof cds $$2) {
            cpn var6 = $$2.e();
            if (var6 instanceof cfa) {
               return (cfa)var6;
            }
         }

         return null;
      }
   }
}
