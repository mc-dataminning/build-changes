import java.util.function.UnaryOperator;

public interface aof {
   UnaryOperator<ui> a = UnaryOperator.identity();
   aof b = a(a, true);
   aof c = a(a("pack.source.builtin"), true);
   aof d = a(a("pack.source.feature"), false);
   aof e = a(a("pack.source.world"), true);
   aof f = a(a("pack.source.server"), true);

   ui a(ui var1);

   boolean a();

   static aof a(final UnaryOperator<ui> $$0, final boolean $$1) {
      return new aof() {
         @Override
         public ui a(ui $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<ui> a(String $$0) {
      ui $$1 = ui.c($$0);
      return $$1x -> ui.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
