import com.mojang.brigadier.context.CommandContext;

public class fs extends fo<dkn> {
   private fs() {
      super(dkn.e, dkn::values);
   }

   public static fs a() {
      return new fs();
   }

   public static dkn a(CommandContext<ee> $$0, String $$1) {
      return (dkn)$$0.getArgument($$1, dkn.class);
   }
}
