import java.util.function.UnaryOperator;

public interface asq {
   UnaryOperator<wi> a = UnaryOperator.identity();
   asq b = a(a, true);
   asq c = a(a("pack.source.builtin"), true);
   asq d = a(a("pack.source.feature"), false);
   asq e = a(a("pack.source.world"), true);
   asq f = a(a("pack.source.server"), true);

   wi a(wi var1);

   boolean a();

   static asq a(final UnaryOperator<wi> $$0, final boolean $$1) {
      return new asq() {
         @Override
         public wi a(wi $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wi> a(String $$0) {
      wi $$1 = wi.c($$0);
      return $$1x -> wi.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
