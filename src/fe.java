import com.mojang.brigadier.context.CommandContext;

public class fe extends fa<ddk> {
   private fe() {
      super(ddk.e, ddk::values);
   }

   public static fe a() {
      return new fe();
   }

   public static ddk a(CommandContext<ds> $$0, String $$1) {
      return (ddk)$$0.getArgument($$1, ddk.class);
   }
}
