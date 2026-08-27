import com.mojang.brigadier.context.CommandContext;

public class fe extends fb<dbr> {
   private fe() {
      super(dbr.e, dbr::values);
   }

   public static fe a() {
      return new fe();
   }

   public static dbr a(CommandContext<du> $$0, String $$1) {
      return (dbr)$$0.getArgument($$1, dbr.class);
   }
}
