import com.mojang.brigadier.context.CommandContext;

public class fd extends fa<dbm> {
   private fd() {
      super(dbm.d, dbm::values);
   }

   public static fa<dbm> a() {
      return new fd();
   }

   public static dbm a(CommandContext<ds> $$0, String $$1) {
      return (dbm)$$0.getArgument($$1, dbm.class);
   }
}
