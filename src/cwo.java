import java.util.List;
import javax.annotation.Nullable;

public class cwo extends cuc {
   public cwo(cuc.a $$0) {
      super($$0);
   }

   @Override
   public xe o(cuh $$0) {
      cya $$1 = $$0.a(ke.H);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azh.h($$2)) {
            return xe.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cya $$4 = $$0.a(ke.H);
      if ($$4 != null) {
         if (!azh.h($$4.e())) {
            $$2.add(xe.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xe.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avz.c.b(this));
      return bqb.a($$3, $$0.x_());
   }

   public static boolean a(cuh $$0, eh $$1, @Nullable cly $$2) {
      cya $$3 = $$0.a(ke.H);
      if ($$3 != null && !$$3.g()) {
         cya $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ke.H, $$4);
            return true;
         }

         $$0.b(ke.H, $$3.c());
      }

      return false;
   }
}
