import com.mojang.brigadier.context.CommandContext;

public class fe extends fa<ddc> {
   private fe() {
      super(ddc.e, ddc::values);
   }

   public static fe a() {
      return new fe();
   }

   public static ddc a(CommandContext<ds> $$0, String $$1) {
      return (ddc)$$0.getArgument($$1, ddc.class);
   }
}
