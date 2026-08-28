import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class app {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wv.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ey.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((ex)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((ex)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)ey.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (ex)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((ex)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           ey.a("players", fk.d())
                              .executes(
                                 $$0x -> a(
                                       (ex)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       fk.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, String $$1, int $$2, Collection<aro> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (aro $$4 : $$3) {
            $$4.f.b(new zs($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> wv.a("commands.transfer.success.single", $$3.iterator().next().m_(), $$1, $$2), true);
         } else {
            $$0.a(() -> wv.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
