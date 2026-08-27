import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dn extends RuntimeException {
   private final tf a;

   public dn(tf $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public tf a() {
      return this.a;
   }
}
