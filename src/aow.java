import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class aow {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wy.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(wy.b("commands.schedule.macro"));
   private static final SuggestionProvider<ej> d = ($$0, $$1) -> eo.b(((ej)$$0.getSource()).l().aZ().I().s().a(), $$1);

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ek.a("function")
                     .then(
                        ek.a("function", gs.a())
                           .suggests(ano.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ek.a("time", fz.a())
                                       .executes($$0x -> a((ej)$$0x.getSource(), gs.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ek.a("append")
                                          .executes(
                                             $$0x -> a((ej)$$0x.getSource(), gs.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ek.a("replace")
                                       .executes($$0x -> a((ej)$$0x.getSource(), gs.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ek.a("clear")
                  .then(
                     ek.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ej $$0, Pair<alg, Either<hx<ej>, Collection<hx<ej>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().ae() + (long)$$2;
         alg $$5 = (alg)$$1.getFirst();
         fep<MinecraftServer> $$6 = $$0.l().aZ().I().s();
         Optional<hx<ej>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof ia) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new fel($$5));
            $$0.a(() -> wy.a("commands.schedule.created.function", wy.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new fem($$5));
            $$0.a(() -> wy.a("commands.schedule.created.tag", wy.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ej $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aZ().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> wy.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
