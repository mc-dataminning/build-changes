import com.mojang.brigadier.context.CommandContext;

public class fe extends fa<ddb> {
   private fe() {
      super(ddb.e, ddb::values);
   }

   public static fe a() {
      return new fe();
   }

   public static ddb a(CommandContext<ds> $$0, String $$1) {
      return (ddb)$$0.getArgument($$1, ddb.class);
   }
}
