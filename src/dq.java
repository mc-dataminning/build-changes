import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dq extends RuntimeException {
   private final tn a;

   public dq(tn $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public tn a() {
      return this.a;
   }
}
