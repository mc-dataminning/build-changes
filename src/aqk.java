import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class aqk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.transfer.error.no_players"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("transfer").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ex.a("hostname", StringArgumentType.string())
                     .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "hostname"), 25565, List.of(((ew)$$0x.getSource()).h()))))
                  .then(
                     ((RequiredArgumentBuilder)ex.a("port", IntegerArgumentType.integer(1, 65535))
                           .executes(
                              $$0x -> a(
                                    (ew)$$0x.getSource(),
                                    StringArgumentType.getString($$0x, "hostname"),
                                    IntegerArgumentType.getInteger($$0x, "port"),
                                    List.of(((ew)$$0x.getSource()).h())
                                 )
                           ))
                        .then(
                           ex.a("players", fj.d())
                              .executes(
                                 $$0x -> a(
                                       (ew)$$0x.getSource(),
                                       StringArgumentType.getString($$0x, "hostname"),
                                       IntegerArgumentType.getInteger($$0x, "port"),
                                       fj.f($$0x, "players")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, String $$1, int $$2, Collection<asi> $$3) throws CommandSyntaxException {
      if ($$3.isEmpty()) {
         throw a.create();
      } else {
         for (asi $$4 : $$3) {
            $$4.f.b(new aas($$1, $$2));
         }

         if ($$3.size() == 1) {
            $$0.a(() -> xv.a("commands.transfer.success.single", $$3.iterator().next().p_(), $$1, $$2), true);
         } else {
            $$0.a(() -> xv.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
         }

         return $$3.size();
      }
   }
}
