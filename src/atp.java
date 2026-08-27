import java.util.function.UnaryOperator;

public interface atp {
   UnaryOperator<xe> a = UnaryOperator.identity();
   atp b = a(a, true);
   atp c = a(a("pack.source.builtin"), true);
   atp d = a(a("pack.source.feature"), false);
   atp e = a(a("pack.source.world"), true);
   atp f = a(a("pack.source.server"), true);

   xe a(xe var1);

   boolean a();

   static atp a(final UnaryOperator<xe> $$0, final boolean $$1) {
      return new atp() {
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
