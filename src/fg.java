import com.mojang.brigadier.context.CommandContext;

public class fg extends fc<dgm> {
   private fg() {
      super(dgm.e, dgm::values);
   }

   public static fg a() {
      return new fg();
   }

   public static dgm a(CommandContext<du> $$0, String $$1) {
      return (dgm)$$0.getArgument($$1, dgm.class);
   }
}
