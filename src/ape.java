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

public class ape {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xk.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xk.b("commands.schedule.macro"));
   private static final SuggestionProvider<ew> d = ($$0, $$1) -> fb.b(((ew)$$0.getSource()).l().aZ().I().s().a(), $$1);

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ex.a("function")
                     .then(
                        ex.a("function", he.a())
                           .suggests(anx.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("time", gl.a())
                                       .executes($$0x -> a((ew)$$0x.getSource(), he.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ex.a("append")
                                          .executes(
                                             $$0x -> a((ew)$$0x.getSource(), he.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ex.a("replace")
                                       .executes($$0x -> a((ew)$$0x.getSource(), he.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ex.a("clear")
                  .then(
                     ex.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ew $$0, Pair<alp, Either<ik<ew>, Collection<ik<ew>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().ad() + (long)$$2;
         alp $$5 = (alp)$$1.getFirst();
         fbe<MinecraftServer> $$6 = $$0.l().aZ().I().s();
         Optional<ik<ew>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof in) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new fba($$5));
            $$0.a(() -> xk.a("commands.schedule.created.function", xk.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new fbb($$5));
            $$0.a(() -> xk.a("commands.schedule.created.tag", xk.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ew $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().aZ().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xk.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
