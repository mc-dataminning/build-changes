import com.mojang.brigadier.context.CommandContext;

public class fs extends fo<dkl> {
   private fs() {
      super(dkl.e, dkl::values);
   }

   public static fs a() {
      return new fs();
   }

   public static dkl a(CommandContext<ee> $$0, String $$1) {
      return (dkl)$$0.getArgument($$1, dkl.class);
   }
}
