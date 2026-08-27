import java.util.function.UnaryOperator;

public interface atj {
   UnaryOperator<wx> a = UnaryOperator.identity();
   atj b = a(a, true);
   atj c = a(a("pack.source.builtin"), true);
   atj d = a(a("pack.source.feature"), false);
   atj e = a(a("pack.source.world"), true);
   atj f = a(a("pack.source.server"), true);

   wx a(wx var1);

   boolean a();

   static atj a(final UnaryOperator<wx> $$0, final boolean $$1) {
      return new atj() {
         @Override
         public wx a(wx $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wx> a(String $$0) {
      wx $$1 = wx.c($$0);
      return $$1x -> wx.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
