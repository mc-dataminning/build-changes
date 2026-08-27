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

public class amz {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<eh> b = ($$0, $$1) -> {
      ali $$2 = ((eh)$$0.getSource()).l().aF();
      em.a($$2.e(), $$1, "#");
      return em.a($$2.d(), $$1);
   };
   static final amz.b<eh> e = new amz.b<eh>() {
      public void a(eh $$0, akt $$1, int $$2) {
         $$0.a(() -> xe.a("commands.function.result", xe.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<eh> $$0) {
      LiteralArgumentBuilder<eh> $$1 = ei.a("with");

      for (apj.c $$2 : apj.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new amz.c() {
               @Override
               protected uk a(CommandContext<eh> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ei.a("path", ez.a()).executes(new amz.c() {
               @Override
               protected uk a(CommandContext<eh> $$0) throws CommandSyntaxException {
                  return amz.a(ez.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ei.a("name", gp.a()).suggests(b).executes(new amz.c() {
               @Nullable
               @Override
               protected uk a(CommandContext<eh> $$0) {
                  return null;
               }
            })).then(ei.a("arguments", er.a()).executes(new amz.c() {
               @Override
               protected uk a(CommandContext<eh> $$0) {
                  return er.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static uk a(ez.g $$0, api $$1) throws CommandSyntaxException {
      vh $$2 = apj.a($$0, $$1);
      if ($$2 instanceof uk) {
         return (uk)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static eh a(eh $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ej<T>> void a(Collection<ht<T>> $$0, @Nullable uk $$1, T $$2, T $$3, hh<T> $$4, amz.b<T> $$5, hb $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ej<T>> void a(@Nullable uk $$0, hh<T> $$1, CommandDispatcher<T> $$2, T $$3, ht<T> $$4, akt $$5, ee $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hv<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hn<>($$8, $$6, $$7).bind($$3));
      } catch (ek var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ej<T>> ee a(T $$0, amz.b<T> $$1, akt $$2, ee $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ej<T>> void a(Collection<ht<T>> $$0, @Nullable uk $$1, T $$2, T $$3, hh<T> $$4, amz.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ee $$8 = ee.chain($$2.p(), $$4.b().d());

      for (ht<T> $$9 : $$0) {
         akt $$10 = $$9.a();
         ee $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hq.a());
   }

   private static <T extends ej<T>> void b(Collection<ht<T>> $$0, @Nullable uk $$1, T $$2, T $$3, hh<T> $$4, amz.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ee $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ht<T> $$9 = $$0.iterator().next();
            akt $$10 = $$9.a();
            ee $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == ee.a) {
            for (ht<T> $$12 : $$0) {
               akt $$13 = $$12.a();
               ee $$14 = a($$2, $$5, $$13, $$8);
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
            ee $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ht<T> $$17 : $$0) {
               akt $$18 = $$17.a();
               ee $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akt var2, int var3);
   }

   abstract static class c extends hd.b<eh> implements hd.a<eh> {
      @Nullable
      protected abstract uk a(CommandContext<eh> var1) throws CommandSyntaxException;

      public void a(eh $$0, ContextChain<eh> $$1, hb $$2, hh<eh> $$3) throws CommandSyntaxException {
         CommandContext<eh> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akt, Collection<ht<eh>>> $$5 = gp.c($$4, "name");
         Collection<ht<eh>> $$6 = (Collection<ht<eh>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw amz.d.create(xe.a((akt)$$5.getFirst()));
         } else {
            uk $$7 = this.a($$4);
            eh $$8 = amz.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xe.a("commands.function.scheduled.single", xe.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xe.a("commands.function.scheduled.multiple", xh.b($$6.stream().map(ht::a).toList(), xe::a)), true);
            }

            amz.a($$6, $$7, $$0, $$8, $$3, amz.e, $$2);
         }
      }
   }
}
