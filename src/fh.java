import com.mojang.brigadier.context.CommandContext;

public class fh extends fe<dhd> {
   private fh() {
      super(dhd.d, dhd::values);
   }

   public static fe<dhd> a() {
      return new fh();
   }

   public static dhd a(CommandContext<dv> $$0, String $$1) {
      return (dhd)$$0.getArgument($$1, dhd.class);
   }
}
