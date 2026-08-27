import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dfr> {
   private fg() {
      super(dfr.e, dfr::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dfr a(CommandContext<du> $$0, String $$1) {
      return (dfr)$$0.getArgument($$1, dfr.class);
   }
}
