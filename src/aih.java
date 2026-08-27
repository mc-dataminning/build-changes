import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableInt;

public class aih {
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("argument.pos.unloaded"));
   private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.fillbiome.toobig", $$0, $$1));

   public static void a(CommandDispatcher<du> $$0, dp $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("fillbiome").requires($$0x -> $$0x.c(2)))
            .then(
               dv.a("from", fm.a())
                  .then(
                     dv.a("to", fm.a())
                        .then(
                           ((RequiredArgumentBuilder)dv.a("biome", es.a($$1, jz.ar))
                                 .executes($$0x -> a((du)$$0x.getSource(), fm.a($$0x, "from"), fm.a($$0x, "to"), es.a($$0x, "biome", jz.ar), $$0xx -> true)))
                              .then(
                                 dv.a("replace")
                                    .then(
                                       dv.a("filter", ev.a($$1, jz.ar))
                                          .executes(
                                             $$0x -> a(
                                                   (du)$$0x.getSource(),
                                                   fm.a($$0x, "from"),
                                                   fm.a($$0x, "to"),
                                                   es.a($$0x, "biome", jz.ar),
                                                   ev.a($$0x, "filter", jz.ar)::test
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
      return in.c(in.a($$0));
   }

   private static ht a(ht $$0) {
      return new ht(a($$0.u()), a($$0.v()), a($$0.w()));
   }

   private static cst a(MutableInt $$0, dis $$1, dwn $$2, ib<csq> $$3, Predicate<ib<csq>> $$4) {
      return ($$5, $$6, $$7, $$8) -> {
         int $$9 = in.c($$5);
         int $$10 = in.c($$6);
         int $$11 = in.c($$7);
         ib<csq> $$12 = $$1.getNoiseBiome($$5, $$6, $$7);
         if ($$2.c($$9, $$10, $$11) && $$4.test($$12)) {
            $$0.increment();
            return $$3;
         } else {
            return $$12;
         }
      };
   }

   private static int a(du $$0, ht $$1, ht $$2, ib.c<csq> $$3, Predicate<ib<csq>> $$4) throws CommandSyntaxException {
      ht $$5 = a($$1);
      ht $$6 = a($$2);
      dwn $$7 = dwn.a($$5, $$6);
      int $$8 = $$7.c() * $$7.d() * $$7.e();
      int $$9 = $$0.f().X().c(cro.z);
      if ($$8 > $$9) {
         throw b.create($$9, $$8);
      } else {
         ama $$10 = $$0.f();
         List<dis> $$11 = new ArrayList<>();

         for (int $$12 = iu.a($$7.i()); $$12 <= iu.a($$7.l()); $$12++) {
            for (int $$13 = iu.a($$7.g()); $$13 <= iu.a($$7.j()); $$13++) {
               dis $$14 = $$10.a($$13, $$12, dix.n, false);
               if ($$14 == null) {
                  throw a.create();
               }

               $$11.add($$14);
            }
         }

         MutableInt $$15 = new MutableInt(0);

         for (dis $$16 : $$11) {
            $$16.a(a($$15, $$16, $$7, $$3, $$4), $$10.k().i().b());
            $$16.a(true);
         }

         $$10.k().a.a($$11);
         $$0.a(() -> ur.a("commands.fillbiome.success.count", $$15.getValue(), $$7.g(), $$7.h(), $$7.i(), $$7.j(), $$7.k(), $$7.l()), true);
         return $$15.getValue();
      }
   }
}
