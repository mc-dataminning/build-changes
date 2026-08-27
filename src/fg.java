import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dik> {
   private fg() {
      super(dik.e, dik::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dik a(CommandContext<du> $$0, String $$1) {
      return (dik)$$0.getArgument($$1, dik.class);
   }
}
