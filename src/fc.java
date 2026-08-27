import com.mojang.brigadier.context.CommandContext;

public class fc extends ez<czn> {
   private fc() {
      super(czn.e, czn::values);
   }

   public static fc a() {
      return new fc();
   }

   public static czn a(CommandContext<dt> $$0, String $$1) {
      return (czn)$$0.getArgument($$1, czn.class);
   }
}
