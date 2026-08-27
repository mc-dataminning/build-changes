import java.util.function.UnaryOperator;

public interface ang {
   UnaryOperator<tm> a = UnaryOperator.identity();
   ang b = a(a, true);
   ang c = a(a("pack.source.builtin"), true);
   ang d = a(a("pack.source.feature"), false);
   ang e = a(a("pack.source.world"), true);
   ang f = a(a("pack.source.server"), true);

   tm a(tm var1);

   boolean a();

   static ang a(final UnaryOperator<tm> $$0, final boolean $$1) {
      return new ang() {
         @Override
         public tm a(tm $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<tm> a(String $$0) {
      tm $$1 = tm.c($$0);
      return $$1x -> tm.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
