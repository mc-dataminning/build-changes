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

public class apa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xc.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xc.b("commands.schedule.macro"));
   private static final SuggestionProvider<ek> d = ($$0, $$1) -> ep.b(((ek)$$0.getSource()).l().aZ().I().s().a(), $$1);

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  el.a("function")
                     .then(
                        el.a("function", gt.a())
                           .suggests(ans.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)el.a("time", ga.a())
                                       .executes($$0x -> a((ek)$$0x.getSource(), gt.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       el.a("append")
                                          .executes(
                                             $$0x -> a((ek)$$0x.getSource(), gt.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    el.a("replace")
                                       .executes($$0x -> a((ek)$$0x.getSource(), gt.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               el.a("clear")
                  .then(
                     el.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ek $$0, Pair<alk, Either<hy<ek>, Collection<hy<ek>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().ae() + (long)$$2;
         alk $$5 = (alk)$$1.getFirst();
         fff<MinecraftServer> $$6 = $$0.l().aZ().I().s();
         Optional<hy<ek>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof ib) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new ffb($$5));
            $$0.a(() -> xc.a("commands.schedule.created.function", xc.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new ffc($$5));
            $$0.a(() -> xc.a("commands.schedule.created.tag", xc.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aZ().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xc.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
