import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)er.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((eq)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)er.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (eq)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((eq)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           er.a("players", fd.d())
                              .executes(
                                 $$0x -> a(
                                       (eq)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       fd.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, String $$1, int $$2, Collection<aql> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (aql $$4 : $$3) {
            $$4.c.b(new zp($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> wu.a("commands.transfer.success.single", $$3.iterator().next().O_(), $$1, $$2), true);
         } else {
            $$0.a(() -> wu.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
