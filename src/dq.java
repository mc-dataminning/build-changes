import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dq extends RuntimeException {
   private final tl a;

   public dq(tl $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public tl a() {
      return this.a;
   }
}
