import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableInt;

public class anm {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ev> $$0, er $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ew.a("from", gr.a())
                  .then(
                     ew.a("to", gr.a())
                        .then(
                           ((RequiredArgumentBuilder)ew.a("biome", fu.a($$1, ly.aG))
                                 .executes($$0x -> a((ev)$$0x.getSource(), gr.a($$0x, "from"), gr.a($$0x, "to"), fu.a($$0x, "biome", ly.aG), $$0xx -> true)))
                              .then(
                                 ew.a("replace")
                                    .then(
                                       ew.a("filter", fy.a($$1, ly.aG))
                                          .executes(
                                             $$0x -> a(
                                                   (ev)$$0x.getSource(),
                                                   gr.a($$0x, "from"),
                                                   gr.a($$0x, "to"),
                                                   fu.a($$0x, "biome", ly.aG),
                                                   fy.a($$0x, "filter", ly.aG)::test
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int a(int $$0) {
      return ka.c(ka.a($$0));
   }

   private static jg a(jg $$0) {
      return new jg(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dfz a(MutableInt $$0, dwz $$1, elj $$2, jp<dfw> $$3, Predicate<jp<dfw>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = ka.c($$5);
         int $$10 = ka.c($$6);
         int $$11 = ka.c($$7);
         jp<dfw> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(arm $$0, jg $$1, jg $$2, jp<dfw> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(arm $$0, jg $$1, jg $$2, jp<dfw> $$3, Predicate<jp<dfw>> $$4, Consumer<Supplier<xh>> $$5) {
      jg $$6 = a($$1);
      jg $$7 = a($$2);
      elj $$8 = elj.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ac().c(der.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dwz> $$11 = new ArrayList<>();

         for (int $$12 = ki.a($$8.j()); $$12 <= ki.a($$8.m()); $$12++) {
            for (int $$13 = ki.a($$8.h()); $$13 <= ki.a($$8.k()); $$13++) {
               dwz $$14 = $$0.a($$13, $$12, dya.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dwz $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> xh.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ev $$0, jg $$1, jg $$2, jp.c<dfw> $$3, Predicate<jp<dfw>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
