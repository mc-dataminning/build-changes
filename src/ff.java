import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<ddo> {
   private ff() {
      super(ddo.d, ddo::values);
   }

   public static fc<ddo> a() {
      return new ff();
   }

   public static ddo a(CommandContext<du> $$0, String $$1) {
      return (ddo)$$0.getArgument($$1, ddo.class);
   }
}
