import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dr extends RuntimeException {
   private final ur a;

   public dr(ur $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public ur a() {
      return this.a;
   }
}
