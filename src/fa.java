import com.mojang.brigadier.context.CommandContext;

public class fa extends ex<cvz> {
   private fa() {
      super(cvz.e, cvz::values);
   }

   public static fa a() {
      return new fa();
   }

   public static cvz a(CommandContext<ds> $$0, String $$1) {
      return (cvz)$$0.getArgument($$1, cvz.class);
   }
}
