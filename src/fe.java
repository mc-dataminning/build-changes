import com.mojang.brigadier.context.CommandContext;

public class fe extends fa<dcv> {
   private fe() {
      super(dcv.e, dcv::values);
   }

   public static fe a() {
      return new fe();
   }

   public static dcv a(CommandContext<ds> $$0, String $$1) {
      return (dcv)$$0.getArgument($$1, dcv.class);
   }
}
