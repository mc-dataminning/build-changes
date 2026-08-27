import com.mojang.brigadier.context.CommandContext;

public class fe extends fb<dbm> {
   private fe() {
      super(dbm.e, dbm::values);
   }

   public static fe a() {
      return new fe();
   }

   public static dbm a(CommandContext<du> $$0, String $$1) {
      return (dbm)$$0.getArgument($$1, dbm.class);
   }
}
