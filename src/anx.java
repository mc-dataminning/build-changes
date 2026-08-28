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

public class anx {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xk.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xk.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xk.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ew> b = ($$0, $$1) -> {
      ame $$2 = ((ew)$$0.getSource()).l().aE();
      fb.a($$2.e(), $$1, "#");
      return fb.a($$2.d(), $$1);
   };
   static final anx.b<ew> e = new anx.b<ew>() {
      public void a(ew $$0, alp $$1, int $$2) {
         $$0.a(() -> xk.a("commands.function.result", xk.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralArgumentBuilder<ew> $$1 = ex.a("with");

      for (aqi.c $$2 : aqi.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anx.c() {
               @Override
               protected um a(CommandContext<ew> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ex.a("path", fo.a()).executes(new anx.c() {
               @Override
               protected um a(CommandContext<ew> $$0) throws CommandSyntaxException {
                  return anx.a(fo.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("name", he.a()).suggests(b).executes(new anx.c() {
               @Nullable
               @Override
               protected um a(CommandContext<ew> $$0) {
                  return null;
               }
            })).then(ex.a("arguments", fg.a()).executes(new anx.c() {
               @Override
               protected um a(CommandContext<ew> $$0) {
                  return fg.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static um a(fo.g $$0, aqh $$1) throws CommandSyntaxException {
      vj $$2 = aqi.a($$0, $$1);
      if ($$2 instanceof um) {
         return (um)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ew a(ew $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ey<T>> void a(Collection<ik<T>> $$0, @Nullable um $$1, T $$2, T $$3, hx<T> $$4, anx.b<T> $$5, hr $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ey<T>> void a(@Nullable um $$0, hx<T> $$1, CommandDispatcher<T> $$2, T $$3, ik<T> $$4, alp $$5, et $$6, boolean $$7) throws CommandSyntaxException {
      try {
         im<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new id<>($$8, $$6, $$7).bind($$3));
      } catch (ez var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ey<T>> et a(T $$0, anx.b<T> $$1, alp $$2, et $$3) {
      return $$0.x() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ey<T>> void a(Collection<ik<T>> $$0, @Nullable um $$1, T $$2, T $$3, hx<T> $$4, anx.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      et $$8 = et.chain($$2.p(), $$4.b().d());

      for (ik<T> $$9 : $$0) {
         alp $$10 = $$9.a();
         et $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ih.a());
   }

   private static <T extends ey<T>> void b(Collection<ik<T>> $$0, @Nullable um $$1, T $$2, T $$3, hx<T> $$4, anx.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      et $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ik<T> $$9 = $$0.iterator().next();
            alp $$10 = $$9.a();
            et $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == et.a) {
            for (ik<T> $$12 : $$0) {
               alp $$13 = $$12.a();
               et $$14 = a($$2, $$5, $$13, $$8);
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
            et $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ik<T> $$17 : $$0) {
               alp $$18 = $$17.a();
               et $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, alp var2, int var3);
   }

   abstract static class c extends ht.b<ew> implements ht.a<ew> {
      @Nullable
      protected abstract um a(CommandContext<ew> var1) throws CommandSyntaxException;

      public void a(ew $$0, ContextChain<ew> $$1, hr $$2, hx<ew> $$3) throws CommandSyntaxException {
         CommandContext<ew> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<alp, Collection<ik<ew>>> $$5 = he.c($$4, "name");
         Collection<ik<ew>> $$6 = (Collection<ik<ew>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anx.d.create(xk.a((alp)$$5.getFirst()));
         } else {
            um $$7 = this.a($$4);
            ew $$8 = anx.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xk.a("commands.function.scheduled.single", xk.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xk.a("commands.function.scheduled.multiple", xn.b($$6.stream().map(ik::a).toList(), xk::a)), true);
            }

            anx.a($$6, $$7, $$0, $$8, $$3, anx.e, $$2);
         }
      }
   }
}
