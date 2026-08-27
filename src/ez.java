import com.mojang.brigadier.context.CommandContext;

public class ez extends ex<cui> {
   private ez() {
      super(cui.d, cui::values);
   }

   public static ex<cui> a() {
      return new ez();
   }

   public static cui a(CommandContext<ds> $$0, String $$1) {
      return (cui)$$0.getArgument($$1, cui.class);
   }
}
