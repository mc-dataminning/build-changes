import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class dr extends RuntimeException {
   private final ui a;

   public dr(ui $$0) {
      super($$0.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
      this.a = $$0;
   }

   public ui a() {
      return this.a;
   }
}
