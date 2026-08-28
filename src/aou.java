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

public class aou {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("commands.schedule.cleared.failure", $$0));
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xh.b("commands.schedule.macro"));
   private static final SuggestionProvider<ev> d = ($$0, $$1) -> fa.b(((ev)$$0.getSource()).l().ba().I().s().a(), $$1);

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("schedule").requires($$0x -> $$0x.c(2)))
               .then(
                  ew.a("function")
                     .then(
                        ew.a("function", hd.a())
                           .suggests(anp.b)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("time", gk.a())
                                       .executes($$0x -> a((ev)$$0x.getSource(), hd.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true)))
                                    .then(
                                       ew.a("append")
                                          .executes(
                                             $$0x -> a((ev)$$0x.getSource(), hd.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), false)
                                          )
                                    ))
                                 .then(
                                    ew.a("replace")
                                       .executes($$0x -> a((ev)$$0x.getSource(), hd.b($$0x, "function"), IntegerArgumentType.getInteger($$0x, "time"), true))
                                 )
                           )
                     )
               ))
            .then(
               ew.a("clear")
                  .then(
                     ew.a("function", StringArgumentType.greedyString())
                        .suggests(d)
                        .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "function")))
                  )
            )
      );
   }

   private static int a(ev $$0, Pair<alh, Either<ij<ev>, Collection<ij<ev>>>> $$1, int $$2, boolean $$3) throws CommandSyntaxException {
      if ($$2 == 0) {
         throw a.create();
      } else {
         long $$4 = $$0.e().aa() + (long)$$2;
         alh $$5 = (alh)$$1.getFirst();
         eyu<MinecraftServer> $$6 = $$0.l().ba().I().s();
         Optional<ij<ev>> $$7 = ((Either)$$1.getSecond()).left();
         if ($$7.isPresent()) {
            if ($$7.get() instanceof im) {
               throw c.create();
            }

            String $$8 = $$5.toString();
            if ($$3) {
               $$6.a($$8);
            }

            $$6.a($$8, $$4, new eyq($$5));
            $$0.a(() -> xh.a("commands.schedule.created.function", xh.a($$5), $$2, $$4), true);
         } else {
            String $$9 = "#" + $$5;
            if ($$3) {
               $$6.a($$9);
            }

            $$6.a($$9, $$4, new eyr($$5));
            $$0.a(() -> xh.a("commands.schedule.created.tag", xh.a($$5), $$2, $$4), true);
         }

         return Math.floorMod($$4, Integer.MAX_VALUE);
      }
   }

   private static int a(ev $$0, String $$1) throws CommandSyntaxException {
      int $$2 = $$0.l().ba().I().s().a($$1);
      if ($$2 == 0) {
         throw b.create($$1);
      } else {
         $$0.a(() -> xh.a("commands.schedule.cleared.success", $$2, $$1), true);
         return $$2;
      }
   }
}
