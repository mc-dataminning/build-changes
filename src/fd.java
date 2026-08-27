import com.mojang.brigadier.context.CommandContext;

public class fd extends fb<cyv> {
   private fd() {
      super(cyv.d, cyv::values);
   }

   public static fb<cyv> a() {
      return new fd();
   }

   public static cyv a(CommandContext<du> $$0, String $$1) {
      return (cyv)$$0.getArgument($$1, cyv.class);
   }
}
