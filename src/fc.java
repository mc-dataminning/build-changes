import com.mojang.brigadier.context.CommandContext;

public class fc extends ez<czj> {
   private fc() {
      super(czj.e, czj::values);
   }

   public static fc a() {
      return new fc();
   }

   public static czj a(CommandContext<dt> $$0, String $$1) {
      return (czj)$$0.getArgument($$1, czj.class);
   }
}
