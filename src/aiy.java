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
import java.util.Collections;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aiy {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vb.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vb.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vb.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ds> b = ($$0, $$1) -> {
      ahh $$2 = ((ds)$$0.getSource()).l().aC();
      dw.a($$2.e(), $$1, "#");
      return dw.a($$2.d(), $$1);
   };
   static final aiy.b<ds> e = new aiy.b<ds>() {
      public void a(ds $$0, agt $$1, int $$2) {
         $$0.a(() -> vb.a("commands.function.result", vb.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("with");

      for (alg.c $$2 : alg.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new aiy.c() {
               @Override
               protected sj a(CommandContext<ds> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dt.a("path", ej.a()).executes(new aiy.c() {
               @Override
               protected sj a(CommandContext<ds> $$0) throws CommandSyntaxException {
                  return aiy.a(ej.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("name", fv.a()).suggests(b).executes(new aiy.c() {
               @Nullable
               @Override
               protected sj a(CommandContext<ds> $$0) {
                  return null;
               }
            })).then(dt.a("arguments", eb.a()).executes(new aiy.c() {
               @Override
               protected sj a(CommandContext<ds> $$0) {
                  return eb.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static sj a(ej.g $$0, alf $$1) throws CommandSyntaxException {
      tg $$2 = alg.a($$0, $$1);
      if ($$2 instanceof sj) {
         return (sj)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ds a(ds $$0) {
      return $$0.a().b(2);
   }

   public static <T extends du<T>> void a(Collection<gz<T>> $$0, @Nullable sj $$1, T $$2, T $$3, gn<T> $$4, aiy.b<T> $$5, gh $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends du<T>> void a(@Nullable sj $$0, gn<T> $$1, CommandDispatcher<T> $$2, T $$3, gz<T> $$4, agt $$5, dp $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hb<T> $$8 = $$4.a($$0, $$2, $$3);
         $$1.a(new gt<>($$8, $$6, $$7).bind($$3));
      } catch (dv var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends du<T>> dp a(T $$0, aiy.b<T> $$1, agt $$2, dp $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onSuccess($$5);
      };
   }

   private static <T extends du<T>> void a(Collection<gz<T>> $$0, @Nullable sj $$1, T $$2, T $$3, gn<T> $$4, aiy.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dp $$8 = dp.chain($$2.p(), $$4.b().d());

      for (gz<T> $$9 : $$0) {
         agt $$10 = $$9.a();
         dp $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      if ($$8 != dp.a) {
         $$4.a(gw.a());
      }
   }

   private static <T extends du<T>> void b(Collection<gz<T>> $$0, @Nullable sj $$1, T $$2, T $$3, gn<T> $$4, aiy.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dp $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            gz<T> $$9 = $$0.iterator().next();
            agt $$10 = $$9.a();
            dp $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dp.a) {
            for (gz<T> $$12 : $$0) {
               agt $$13 = $$12.a();
               dp $$14 = a($$2, $$5, $$13, $$8);
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
            dp $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (gz<T> $$17 : $$0) {
               agt $$18 = $$17.a();
               dp $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, agt var2, int var3);
   }

   abstract static class c extends gj.b<ds> implements gj.a<ds> {
      @Nullable
      protected abstract sj a(CommandContext<ds> var1) throws CommandSyntaxException;

      public void a(ds $$0, ContextChain<ds> $$1, gh $$2, gn<ds> $$3) throws CommandSyntaxException {
         CommandContext<ds> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<agt, Collection<gz<ds>>> $$5 = fv.b($$4, "name").mapSecond($$0x -> (Collection)$$0x.map(Collections::singleton, Function.identity()));
         Collection<gz<ds>> $$6 = (Collection<gz<ds>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw aiy.d.create(vb.a((agt)$$5.getFirst()));
         } else {
            sj $$7 = this.a($$4);
            ds $$8 = aiy.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> vb.a("commands.function.scheduled.single", vb.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> vb.a("commands.function.scheduled.multiple", ve.b($$6.stream().map(gz::a).toList(), vb::a)), true);
            }

            aiy.a($$6, $$7, $$0, $$8, $$3, aiy.e, $$2);
         }
      }
   }
}
