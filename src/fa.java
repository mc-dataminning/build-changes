import com.mojang.brigadier.context.CommandContext;

public class fa extends ey<cxf> {
   private fa() {
      super(cxf.d, cxf::values);
   }

   public static ey<cxf> a() {
      return new fa();
   }

   public static cxf a(CommandContext<ds> $$0, String $$1) {
      return (cxf)$$0.getArgument($$1, cxf.class);
   }
}
