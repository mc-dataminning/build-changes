import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<ddk> {
   private ff() {
      super(ddk.d, ddk::values);
   }

   public static fc<ddk> a() {
      return new ff();
   }

   public static ddk a(CommandContext<du> $$0, String $$1) {
      return (ddk)$$0.getArgument($$1, ddk.class);
   }
}
