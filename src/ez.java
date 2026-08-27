import com.mojang.brigadier.context.CommandContext;

public class ez extends ex<cxh> {
   private ez() {
      super(cxh.d, cxh::values);
   }

   public static ex<cxh> a() {
      return new ez();
   }

   public static cxh a(CommandContext<dr> $$0, String $$1) {
      return (cxh)$$0.getArgument($$1, cxh.class);
   }
}
