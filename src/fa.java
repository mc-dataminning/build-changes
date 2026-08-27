import com.mojang.brigadier.context.CommandContext;

public class fa extends ex<cyy> {
   private fa() {
      super(cyy.e, cyy::values);
   }

   public static fa a() {
      return new fa();
   }

   public static cyy a(CommandContext<dr> $$0, String $$1) {
      return (cyy)$$0.getArgument($$1, cyy.class);
   }
}
