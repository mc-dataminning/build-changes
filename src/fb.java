import com.mojang.brigadier.context.CommandContext;

public class fb extends ey<cyw> {
   private fb() {
      super(cyw.e, cyw::values);
   }

   public static fb a() {
      return new fb();
   }

   public static cyw a(CommandContext<ds> $$0, String $$1) {
      return (cyw)$$0.getArgument($$1, cyw.class);
   }
}
