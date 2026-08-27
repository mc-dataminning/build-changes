import com.mojang.brigadier.context.CommandContext;

public class fd extends fb<czw> {
   private fd() {
      super(czw.d, czw::values);
   }

   public static fb<czw> a() {
      return new fd();
   }

   public static czw a(CommandContext<du> $$0, String $$1) {
      return (czw)$$0.getArgument($$1, czw.class);
   }
}
