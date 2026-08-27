import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<dgu> {
   private ff() {
      super(dgu.d, dgu::values);
   }

   public static fc<dgu> a() {
      return new ff();
   }

   public static dgu a(CommandContext<du> $$0, String $$1) {
      return (dgu)$$0.getArgument($$1, dgu.class);
   }
}
