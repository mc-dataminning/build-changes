import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class apu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ek.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((ej)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)ek.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (ej)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((ej)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           ek.a("players", ew.d())
                              .executes(
                                 $$0x -> a(
                                       (ej)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       ew.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, String $$1, int $$2, Collection<art> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (art $$4 : $$3) {
            $$4.f.b(new zx($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> xa.a("commands.transfer.success.single", $$3.iterator().next().m_(), $$1, $$2), true);
         } else {
            $$0.a(() -> xa.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
