import com.mojang.brigadier.context.CommandContext;

public class fb extends ez<cxx> {
   private fb() {
      super(cxx.d, cxx::values);
   }

   public static ez<cxx> a() {
      return new fb();
   }

   public static cxx a(CommandContext<dt> $$0, String $$1) {
      return (cxx)$$0.getArgument($$1, cxx.class);
   }
}
