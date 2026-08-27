import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dfe> {
   private fg() {
      super(dfe.e, dfe::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dfe a(CommandContext<du> $$0, String $$1) {
      return (dfe)$$0.getArgument($$1, dfe.class);
   }
}
