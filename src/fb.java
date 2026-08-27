import com.mojang.brigadier.context.CommandContext;

public class fb extends ez<dav> {
   private fb() {
      super(dav.d, dav::values);
   }

   public static ez<dav> a() {
      return new fb();
   }

   public static dav a(CommandContext<ds> $$0, String $$1) {
      return (dav)$$0.getArgument($$1, dav.class);
   }
}
