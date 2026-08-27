import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<dew> {
   private ff() {
      super(dew.d, dew::values);
   }

   public static fc<dew> a() {
      return new ff();
   }

   public static dew a(CommandContext<du> $$0, String $$1) {
      return (dew)$$0.getArgument($$1, dew.class);
   }
}
