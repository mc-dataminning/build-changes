import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class apn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ev.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((eu)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)ev.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (eu)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((eu)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           ev.a("players", fh.d())
                              .executes(
                                 $$0x -> a(
                                       (eu)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       fh.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, String $$1, int $$2, Collection<ark> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (ark $$4 : $$3) {
            $$4.c.b(new aab($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> xe.a("commands.transfer.success.single", $$3.iterator().next().R_(), $$1, $$2), true);
         } else {
            $$0.a(() -> xe.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
