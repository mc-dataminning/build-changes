import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class ano {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((du)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)dv.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (du)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((du)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           dv.a("players", eh.d())
                              .executes(
                                 $$0x -> a(
                                       (du)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       eh.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(du $$0, String $$1, int $$2, Collection<apg> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (apg $$4 : $$3) {
            $$4.d.b(new yp($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> vu.a("commands.transfer.success.single", $$3.iterator().next().O_(), $$1, $$2), true);
         } else {
            $$0.a(() -> vu.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
