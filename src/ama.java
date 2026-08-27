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

public class ama {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wi.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wi.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wi.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<dv> b = ($$0, $$1) -> {
      akj $$2 = ((dv)$$0.getSource()).l().aF();
      ea.a($$2.e(), $$1, "#");
      return ea.a($$2.d(), $$1);
   };
   static final ama.b<dv> e = new ama.b<dv>() {
      public void a(dv $$0, ajv $$1, int $$2) {
         $$0.a(() -> wi.a("commands.function.result", wi.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<dv> $$0) {
      LiteralArgumentBuilder<dv> $$1 = dw.a("with");

      for (aok.c $$2 : aok.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new ama.c() {
               @Override
               protected to a(CommandContext<dv> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dw.a("path", en.a()).executes(new ama.c() {
               @Override
               protected to a(CommandContext<dv> $$0) throws CommandSyntaxException {
                  return ama.a(en.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dw.a("name", gb.a()).suggests(b).executes(new ama.c() {
               @Nullable
               @Override
               protected to a(CommandContext<dv> $$0) {
                  return null;
               }
            })).then(dw.a("arguments", ef.a()).executes(new ama.c() {
               @Override
               protected to a(CommandContext<dv> $$0) {
                  return ef.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static to a(en.g $$0, aoj $$1) throws CommandSyntaxException {
      ul $$2 = aok.a($$0, $$1);
      if ($$2 instanceof to) {
         return (to)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static dv a(dv $$0) {
      return $$0.a().b(2);
   }

   public static <T extends dx<T>> void a(Collection<hh<T>> $$0, @Nullable to $$1, T $$2, T $$3, gv<T> $$4, ama.b<T> $$5, gp $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends dx<T>> void a(@Nullable to $$0, gv<T> $$1, CommandDispatcher<T> $$2, T $$3, hh<T> $$4, ajv $$5, ds $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hj<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hb<>($$8, $$6, $$7).bind($$3));
      } catch (dy var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends dx<T>> ds a(T $$0, ama.b<T> $$1, ajv $$2, ds $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends dx<T>> void a(Collection<hh<T>> $$0, @Nullable to $$1, T $$2, T $$3, gv<T> $$4, ama.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ds $$8 = ds.chain($$2.p(), $$4.b().d());

      for (hh<T> $$9 : $$0) {
         ajv $$10 = $$9.a();
         ds $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(he.a());
   }

   private static <T extends dx<T>> void b(Collection<hh<T>> $$0, @Nullable to $$1, T $$2, T $$3, gv<T> $$4, ama.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ds $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hh<T> $$9 = $$0.iterator().next();
            ajv $$10 = $$9.a();
            ds $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == ds.a) {
            for (hh<T> $$12 : $$0) {
               ajv $$13 = $$12.a();
               ds $$14 = a($$2, $$5, $$13, $$8);
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
            ds $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hh<T> $$17 : $$0) {
               ajv $$18 = $$17.a();
               ds $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, ajv var2, int var3);
   }

   abstract static class c extends gr.b<dv> implements gr.a<dv> {
      @Nullable
      protected abstract to a(CommandContext<dv> var1) throws CommandSyntaxException;

      public void a(dv $$0, ContextChain<dv> $$1, gp $$2, gv<dv> $$3) throws CommandSyntaxException {
         CommandContext<dv> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ajv, Collection<hh<dv>>> $$5 = gb.c($$4, "name");
         Collection<hh<dv>> $$6 = (Collection<hh<dv>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw ama.d.create(wi.a((ajv)$$5.getFirst()));
         } else {
            to $$7 = this.a($$4);
            dv $$8 = ama.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wi.a("commands.function.scheduled.single", wi.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wi.a("commands.function.scheduled.multiple", wl.b($$6.stream().map(hh::a).toList(), wi::a)), true);
            }

            ama.a($$6, $$7, $$0, $$8, $$3, ama.e, $$2);
         }
      }
   }
}
