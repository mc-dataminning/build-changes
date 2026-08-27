import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dfa> {
   private fg() {
      super(dfa.e, dfa::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dfa a(CommandContext<du> $$0, String $$1) {
      return (dfa)$$0.getArgument($$1, dfa.class);
   }
}
