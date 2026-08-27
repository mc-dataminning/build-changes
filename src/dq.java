import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dq extends RuntimeException {
   private final ti a;

   public dq(ti $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public ti a() {
      return this.a;
   }
}
