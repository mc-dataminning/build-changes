import com.mojang.brigadier.context.CommandContext;

public class ff extends fc<deb> {
   private ff() {
      super(deb.d, deb::values);
   }

   public static fc<deb> a() {
      return new ff();
   }

   public static deb a(CommandContext<du> $$0, String $$1) {
      return (deb)$$0.getArgument($$1, deb.class);
   }
}
