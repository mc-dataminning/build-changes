import com.mojang.brigadier.context.CommandContext;

public class fu extends fr<dke> {
   private fu() {
      super(dke.d, dke::values);
   }

   public static fr<dke> a() {
      return new fu();
   }

   public static dke a(CommandContext<eh> $$0, String $$1) {
      return (dke)$$0.getArgument($$1, dke.class);
   }
}
