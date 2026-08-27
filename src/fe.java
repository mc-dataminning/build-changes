import com.mojang.brigadier.context.CommandContext;

public class fe extends fb<dbf> {
   private fe() {
      super(dbf.e, dbf::values);
   }

   public static fe a() {
      return new fe();
   }

   public static dbf a(CommandContext<du> $$0, String $$1) {
      return (dbf)$$0.getArgument($$1, dbf.class);
   }
}
