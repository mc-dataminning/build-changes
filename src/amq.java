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

public class amq {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<ee> $$0, ea $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ef.a("from", ga.a())
                  .then(
                     ef.a("to", ga.a())
                        .then(
                           ((RequiredArgumentBuilder)ef.a("biome", fd.a($$1, lf.az))
                                 .executes($$0x -> a((ee)$$0x.getSource(), ga.a($$0x, "from"), ga.a($$0x, "to"), fd.a($$0x, "biome", lf.az), $$0xx -> true)))
                              .then(
                                 ef.a("replace")
                                    .then(
                                       ef.a("filter", fh.a($$1, lf.az))
                                          .executes(
                                             $$0x -> a(
                                                   (ee)$$0x.getSource(),
                                                   ga.a($$0x, "from"),
                                                   ga.a($$0x, "to"),
                                                   fd.a($$0x, "biome", lf.az),
                                                   fh.a($$0x, "filter", lf.az)::test
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
      return ji.c(ji.a($$0));
   }

   private static io a(io $$0) {
      return new io(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static dcb a(MutableInt $$0, dsz $$1, ehd $$2, ix<dby> $$3, Predicate<ix<dby>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = ji.c($$5);
         int $$10 = ji.c($$6);
         int $$11 = ji.c($$7);
         ix<dby> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(aqn $$0, io $$1, io $$2, ix<dby> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(aqn $$0, io $$1, io $$2, ix<dby> $$3, Predicate<ix<dby>> $$4, Consumer<Supplier<wx>> $$5) {
      io $$6 = a($$1);
      io $$7 = a($$2);
      ehd $$8 = ehd.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.aa().c(dav.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<dsz> $$11 = new ArrayList<>();

         for (int $$12 = jq.a($$8.j()); $$12 <= jq.a($$8.m()); $$12++) {
            for (int $$13 = jq.a($$8.h()); $$13 <= jq.a($$8.k()); $$13++) {
               dsz $$14 = $$0.a($$13, $$12, dty.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dsz $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> wx.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(ee $$0, io $$1, io $$2, ix.c<dby> $$3, Predicate<ix<dby>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
