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

public class amw {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<eh> $$0, ed $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               ei.a("from", gd.a())
                  .then(
                     ei.a("to", gd.a())
                        .then(
                           ((RequiredArgumentBuilder)ei.a("biome", fg.a($$1, li.az))
                                 .executes($$0x -> a((eh)$$0x.getSource(), gd.a($$0x, "from"), gd.a($$0x, "to"), fg.a($$0x, "biome", li.az), $$0xx -> true)))
                              .then(
                                 ei.a("replace")
                                    .then(
                                       ei.a("filter", fk.a($$1, li.az))
                                          .executes(
                                             $$0x -> a(
                                                   (eh)$$0x.getSource(),
                                                   gd.a($$0x, "from"),
                                                   gd.a($$0x, "to"),
                                                   fg.a($$0x, "biome", li.az),
                                                   fk.a($$0x, "filter", li.az)::test
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
      return jl.c(jl.a($$0));
   }

   private static ir a(ir $$0) {
      return new ir(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static ddc a(MutableInt $$0, duy $$1, ejl $$2, ja<dcz> $$3, Predicate<ja<dcz>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = jl.c($$5);
         int $$10 = jl.c($$6);
         int $$11 = jl.c($$7);
         ja<dcz> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.d($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   public static Either<Integer, CommandSyntaxException> a(aqt $$0, ir $$1, ir $$2, ja<dcz> $$3) {
      return a($$0, $$1, $$2, $$3, $$0x -> true, $$0x -> {
      });
   }

   public static Either<Integer, CommandSyntaxException> a(aqt $$0, ir $$1, ir $$2, ja<dcz> $$3, Predicate<ja<dcz>> $$4, Consumer<Supplier<xe>> $$5) {
      ir $$6 = a($$1);
      ir $$7 = a($$2);
      ejl $$8 = ejl.a($$6, $$7);
      int $$9 = $$8.d() * $$8.e() * $$8.f();
      int $$10 = $$0.ab().c(dbw.z);
      if ($$9 > $$10) {
         return Either.right(b.create($$10, $$9));
      } else {
         List<duy> $$11 = new ArrayList<>();

         for (int $$12 = jt.a($$8.j()); $$12 <= jt.a($$8.m()); $$12++) {
            for (int $$13 = jt.a($$8.h()); $$13 <= jt.a($$8.k()); $$13++) {
               duy $$14 = $$0.a($$13, $$12, dvx.n, false);
               if ($$14 == null) {
                  return Either.right(a.create());
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (duy $$16 : $$11) {
            $$16.a(a($$15, $$16, $$8, $$3, $$4), $$0.l().i().b());
            $$16.a(true);
         }

         $$0.l().a.a($$11);
         $$5.accept(() -> xe.a("commands.fillbiome.success.count", $$15.getValue(), $$8.h(), $$8.i(), $$8.j(), $$8.k(), $$8.l(), $$8.m()));
         return Either.left($$15.getValue());
      }
   }

   private static int a(eh $$0, ir $$1, ir $$2, ja.c<dcz> $$3, Predicate<ja<dcz>> $$4) throws CommandSyntaxException {
      Either<Integer, CommandSyntaxException> $$5 = a($$0.e(), $$1, $$2, $$3, $$4, $$1x -> $$0.a($$1x, true));
      Optional<CommandSyntaxException> $$6 = $$5.right();
      if ($$6.isPresent()) {
         throw (CommandSyntaxException)$$6.get();
      } else {
         return (Integer)$$5.left().get();
      }
   }
}
