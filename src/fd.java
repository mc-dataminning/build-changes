import com.mojang.brigadier.context.CommandContext;

public class fd extends fa<dbu> {
   private fd() {
      super(dbu.d, dbu::values);
   }

   public static fa<dbu> a() {
      return new fd();
   }

   public static dbu a(CommandContext<ds> $$0, String $$1) {
      return (dbu)$$0.getArgument($$1, dbu.class);
   }
}
