import com.mojang.brigadier.context.CommandContext;

public class fb extends ez<cxl> {
   private fb() {
      super(cxl.d, cxl::values);
   }

   public static ez<cxl> a() {
      return new fb();
   }

   public static cxl a(CommandContext<dt> $$0, String $$1) {
      return (cxl)$$0.getArgument($$1, cxl.class);
   }
}
