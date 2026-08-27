import com.mojang.brigadier.context.CommandContext;

public class fe extends fb<dal> {
   private fe() {
      super(dal.e, dal::values);
   }

   public static fe a() {
      return new fe();
   }

   public static dal a(CommandContext<du> $$0, String $$1) {
      return (dal)$$0.getArgument($$1, dal.class);
   }
}
