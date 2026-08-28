import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class aqd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((ek)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)el.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (ek)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((ek)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           el.a("players", ex.d())
                              .executes(
                                 $$0x -> a(
                                       (ek)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       ex.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, String $$1, int $$2, Collection<asc> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (asc $$4 : $$3) {
            $$4.f.b(new aag($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> xg.a("commands.transfer.success.single", $$3.iterator().next().P_(), $$1, $$2), true);
         } else {
            $$0.a(() -> xg.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
