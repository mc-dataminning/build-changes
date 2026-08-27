import com.mojang.brigadier.context.CommandContext;

public class fr extends fn<djr> {
   private fr() {
      super(djr.e, djr::values);
   }

   public static fr a() {
      return new fr();
   }

   public static djr a(CommandContext<ed> $$0, String $$1) {
      return (djr)$$0.getArgument($$1, djr.class);
   }
}
