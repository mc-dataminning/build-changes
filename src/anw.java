import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ek.a("targets", ew.d())
                     .executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), wy.c("multiplayer.disconnect.kicked"))))
                  .then(ek.a("reason", fa.a()).executes($$0x -> a((ej)$$0x.getSource(), ew.f($$0x, "targets"), fa.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ej $$0, Collection<arr> $$1, wy $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (arr $$4 : $$1) {
            if (!$$0.l().a($$4.gh())) {
               $$4.f.a($$2);
               $$0.a(() -> wy.a("commands.kick.success", $$4.m_(), $$2), true);
               $$3++;
            }
         }

         if ($$3 == 0) {
            throw a.create();
         } else {
            return $$3;
         }
      }
   }
}
