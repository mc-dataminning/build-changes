import com.google.common.annotations.VisibleForTesting;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import javax.annotation.Nullable;

public class alh {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vs.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vs.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vs.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<du> b = ($$0, $$1) -> {
      ajq $$2 = ((du)$$0.getSource()).l().aF();
      dz.a($$2.e(), $$1, "#");
      return dz.a($$2.d(), $$1);
   };
   static final alh.b<du> e = new alh.b<du>() {
      public void a(du $$0, ajc $$1, int $$2) {
         $$0.a(() -> vs.a("commands.function.result", vs.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("with");

      for (anr.c $$2 : anr.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new alh.c() {
               @Override
               protected sy a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dv.a("path", em.a()).executes(new alh.c() {
               @Override
               protected sy a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return alh.a(em.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("name", fz.a()).suggests(b).executes(new alh.c() {
               @Nullable
               @Override
               protected sy a(CommandContext<du> $$0) {
                  return null;
               }
            })).then(dv.a("arguments", ee.a()).executes(new alh.c() {
               @Override
               protected sy a(CommandContext<du> $$0) {
                  return ee.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static sy a(em.g $$0, anq $$1) throws CommandSyntaxException {
      tv $$2 = anr.a($$0, $$1);
      if ($$2 instanceof sy) {
         return (sy)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static du a(du $$0) {
      return $$0.a().b(2);
   }

   public static <T extends dw<T>> void a(Collection<hf<T>> $$0, @Nullable sy $$1, T $$2, T $$3, gt<T> $$4, alh.b<T> $$5, gn $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends dw<T>> void a(@Nullable sy $$0, gt<T> $$1, CommandDispatcher<T> $$2, T $$3, hf<T> $$4, ajc $$5, dr $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hh<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new gz<>($$8, $$6, $$7).bind($$3));
      } catch (dx var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends dw<T>> dr a(T $$0, alh.b<T> $$1, ajc $$2, dr $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends dw<T>> void a(Collection<hf<T>> $$0, @Nullable sy $$1, T $$2, T $$3, gt<T> $$4, alh.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dr $$8 = dr.chain($$2.p(), $$4.b().d());

      for (hf<T> $$9 : $$0) {
         ajc $$10 = $$9.a();
         dr $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hc.a());
   }

   private static <T extends dw<T>> void b(Collection<hf<T>> $$0, @Nullable sy $$1, T $$2, T $$3, gt<T> $$4, alh.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dr $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hf<T> $$9 = $$0.iterator().next();
            ajc $$10 = $$9.a();
            dr $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dr.a) {
            for (hf<T> $$12 : $$0) {
               ajc $$13 = $$12.a();
               dr $$14 = a($$2, $$5, $$13, $$8);
               a($$1, $$4, $$6, $$7, $$12, $$13, $$14, false);
            }
         } else {
            class a {
               boolean a;
               int b;

               public void a(int $$0) {
                  this.a = true;
                  this.b += $$0;
               }
            }

            a $$15 = new a();
            dr $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hf<T> $$17 : $$0) {
               ajc $$18 = $$17.a();
               dr $$19 = a($$2, $$5, $$18, $$16);
               a($$1, $$4, $$6, $$7, $$17, $$18, $$19, false);
            }

            $$4.a(($$2x, $$3x) -> {
               if ($$15.a) {
                  $$8.onSuccess($$15.b);
               }
            });
         }
      }
   }

   public interface b<T> {
      void a(T var1, ajc var2, int var3);
   }

   abstract static class c extends gp.b<du> implements gp.a<du> {
      @Nullable
      protected abstract sy a(CommandContext<du> var1) throws CommandSyntaxException;

      public void a(du $$0, ContextChain<du> $$1, gn $$2, gt<du> $$3) throws CommandSyntaxException {
         CommandContext<du> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ajc, Collection<hf<du>>> $$5 = fz.c($$4, "name");
         Collection<hf<du>> $$6 = (Collection<hf<du>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw alh.d.create(vs.a((ajc)$$5.getFirst()));
         } else {
            sy $$7 = this.a($$4);
            du $$8 = alh.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> vs.a("commands.function.scheduled.single", vs.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> vs.a("commands.function.scheduled.multiple", vv.b($$6.stream().map(hf::a).toList(), vs::a)), true);
            }

            alh.a($$6, $$7, $$0, $$8, $$3, alh.e, $$2);
         }
      }
   }
}
