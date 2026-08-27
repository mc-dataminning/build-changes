import com.mojang.brigadier.context.CommandContext;

public class fd extends fa<dbl> {
   private fd() {
      super(dbl.d, dbl::values);
   }

   public static fa<dbl> a() {
      return new fd();
   }

   public static dbl a(CommandContext<ds> $$0, String $$1) {
      return (dbl)$$0.getArgument($$1, dbl.class);
   }
}
