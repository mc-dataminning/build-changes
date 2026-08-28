import java.util.function.UnaryOperator;

public interface auh {
   UnaryOperator<xe> a = UnaryOperator.identity();
   auh b = a(a, true);
   auh c = a(a("pack.source.builtin"), true);
   auh d = a(a("pack.source.feature"), false);
   auh e = a(a("pack.source.world"), true);
   auh f = a(a("pack.source.server"), true);

   xe a(xe var1);

   boolean a();

   static auh a(final UnaryOperator<xe> $$0, final boolean $$1) {
      return new auh() {
         @Override
         public xe a(xe $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xe> a(String $$0) {
      xe $$1 = xe.c($$0);
      return $$1x -> xe.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
