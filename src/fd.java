import com.mojang.brigadier.context.CommandContext;

public class fd extends fa<dbf> {
   private fd() {
      super(dbf.d, dbf::values);
   }

   public static fa<dbf> a() {
      return new fd();
   }

   public static dbf a(CommandContext<ds> $$0, String $$1) {
      return (dbf)$$0.getArgument($$1, dbf.class);
   }
}
