import com.mojang.brigadier.context.CommandContext;

public class fa extends ex<cyx> {
   private fa() {
      super(cyx.e, cyx::values);
   }

   public static fa a() {
      return new fa();
   }

   public static cyx a(CommandContext<dr> $$0, String $$1) {
      return (cyx)$$0.getArgument($$1, cyx.class);
   }
}
