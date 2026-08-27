import com.mojang.brigadier.context.CommandContext;

public class fc extends ez<dcl> {
   private fc() {
      super(dcl.e, dcl::values);
   }

   public static fc a() {
      return new fc();
   }

   public static dcl a(CommandContext<ds> $$0, String $$1) {
      return (dcl)$$0.getArgument($$1, dcl.class);
   }
}
