import com.mojang.brigadier.context.CommandContext;

public class fq extends fn<dib> {
   private fq() {
      super(dib.d, dib::values);
   }

   public static fn<dib> a() {
      return new fq();
   }

   public static dib a(CommandContext<ed> $$0, String $$1) {
      return (dib)$$0.getArgument($$1, dib.class);
   }
}
