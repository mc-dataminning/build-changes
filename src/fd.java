import com.mojang.brigadier.context.CommandContext;

public class fd extends fb<dab> {
   private fd() {
      super(dab.d, dab::values);
   }

   public static fb<dab> a() {
      return new fd();
   }

   public static dab a(CommandContext<du> $$0, String $$1) {
      return (dab)$$0.getArgument($$1, dab.class);
   }
}
