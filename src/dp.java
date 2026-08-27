import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dp extends RuntimeException {
   private final sw a;

   public dp(sw $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public sw a() {
      return this.a;
   }
}
