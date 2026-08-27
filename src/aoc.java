import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dw.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((dv)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((dv)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)dw.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (dv)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((dv)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           dw.a("players", ei.d())
                              .executes(
                                 $$0x -> a(
                                       (dv)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       ei.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(dv $$0, String $$1, int $$2, Collection<apv> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (apv $$4 : $$3) {
            $$4.d.b(new zd($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> wi.a("commands.transfer.success.single", $$3.iterator().next().O_(), $$1, $$2), true);
         } else {
            $$0.a(() -> wi.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
