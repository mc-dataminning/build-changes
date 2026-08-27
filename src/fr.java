import com.mojang.brigadier.context.CommandContext;

public class fr extends fo<dix> {
   private fr() {
      super(dix.d, dix::values);
   }

   public static fo<dix> a() {
      return new fr();
   }

   public static dix a(CommandContext<ee> $$0, String $$1) {
      return (dix)$$0.getArgument($$1, dix.class);
   }
}
