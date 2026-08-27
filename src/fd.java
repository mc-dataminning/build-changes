import com.mojang.brigadier.context.CommandContext;

public class fd extends fb<czp> {
   private fd() {
      super(czp.d, czp::values);
   }

   public static fb<czp> a() {
      return new fd();
   }

   public static czp a(CommandContext<du> $$0, String $$1) {
      return (czp)$$0.getArgument($$1, czp.class);
   }
}
