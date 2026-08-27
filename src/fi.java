import com.mojang.brigadier.context.CommandContext;

public class fi extends fe<dit> {
   private fi() {
      super(dit.e, dit::values);
   }

   public static fi a() {
      return new fi();
   }

   public static dit a(CommandContext<dv> $$0, String $$1) {
      return (dit)$$0.getArgument($$1, dit.class);
   }
}
