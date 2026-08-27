import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dgo> {
   private fg() {
      super(dgo.e, dgo::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dgo a(CommandContext<du> $$0, String $$1) {
      return (dgo)$$0.getArgument($$1, dgo.class);
   }
}
