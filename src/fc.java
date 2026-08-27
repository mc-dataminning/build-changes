import com.mojang.brigadier.context.CommandContext;

public class fc extends ez<czc> {
   private fc() {
      super(czc.e, czc::values);
   }

   public static fc a() {
      return new fc();
   }

   public static czc a(CommandContext<dt> $$0, String $$1) {
      return (czc)$$0.getArgument($$1, czc.class);
   }
}
