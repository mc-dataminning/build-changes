import com.mojang.brigadier.context.CommandContext;

public class ez extends ex<cxg> {
   private ez() {
      super(cxg.d, cxg::values);
   }

   public static ex<cxg> a() {
      return new ez();
   }

   public static cxg a(CommandContext<dr> $$0, String $$1) {
      return (cxg)$$0.getArgument($$1, cxg.class);
   }
}
