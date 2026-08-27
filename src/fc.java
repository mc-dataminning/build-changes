import com.mojang.brigadier.context.CommandContext;

public class fc extends ez<czh> {
   private fc() {
      super(czh.e, czh::values);
   }

   public static fc a() {
      return new fc();
   }

   public static czh a(CommandContext<dt> $$0, String $$1) {
      return (czh)$$0.getArgument($$1, czh.class);
   }
}
