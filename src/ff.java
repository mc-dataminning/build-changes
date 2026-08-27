import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<dey> {
   private ff() {
      super(dey.d, dey::values);
   }

   public static fc<dey> a() {
      return new ff();
   }

   public static dey a(CommandContext<du> $$0, String $$1) {
      return (dey)$$0.getArgument($$1, dey.class);
   }
}
