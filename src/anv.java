import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ee $$1 = (ee)$$0x.getSource();
         boolean $$2 = false;

         for (aqm $$3 : $$1.l().K()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> wx.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
