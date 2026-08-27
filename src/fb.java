import com.mojang.brigadier.context.CommandContext;

public class fb extends ez<cxs> {
   private fb() {
      super(cxs.d, cxs::values);
   }

   public static ez<cxs> a() {
      return new fb();
   }

   public static cxs a(CommandContext<dt> $$0, String $$1) {
      return (cxs)$$0.getArgument($$1, cxs.class);
   }
}
