import com.mojang.brigadier.context.CommandContext;

public class fp extends fl<dji> {
   private fp() {
      super(dji.e, dji::values);
   }

   public static fp a() {
      return new fp();
   }

   public static dji a(CommandContext<ec> $$0, String $$1) {
      return (dji)$$0.getArgument($$1, dji.class);
   }
}
