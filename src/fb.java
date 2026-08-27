import com.mojang.brigadier.context.CommandContext;

public class fb extends ez<cxq> {
   private fb() {
      super(cxq.d, cxq::values);
   }

   public static ez<cxq> a() {
      return new fb();
   }

   public static cxq a(CommandContext<dt> $$0, String $$1) {
      return (cxq)$$0.getArgument($$1, cxq.class);
   }
}
