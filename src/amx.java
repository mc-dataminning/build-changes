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

public class amx {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wy.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wy.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wy.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<et> b = ($$0, $$1) -> {
      alf $$2 = ((et)$$0.getSource()).l().aF();
      ey.a($$2.e(), $$1, "#");
      return ey.a($$2.d(), $$1);
   };
   static final amx.b<et> e = new amx.b<et>() {
      public void a(et $$0, akq $$1, int $$2) {
         $$0.a(() -> wy.a("commands.function.result", wy.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<et> $$0) {
      LiteralArgumentBuilder<et> $$1 = eu.a("with");

      for (apg.c $$2 : apg.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new amx.c() {
               @Override
               protected ua a(CommandContext<et> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(eu.a("path", fl.a()).executes(new amx.c() {
               @Override
               protected ua a(CommandContext<et> $$0) throws CommandSyntaxException {
                  return amx.a(fl.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)eu.a("name", hb.a()).suggests(b).executes(new amx.c() {
               @Nullable
               @Override
               protected ua a(CommandContext<et> $$0) {
                  return null;
               }
            })).then(eu.a("arguments", fd.a()).executes(new amx.c() {
               @Override
               protected ua a(CommandContext<et> $$0) {
                  return fd.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ua a(fl.g $$0, apf $$1) throws CommandSyntaxException {
      ux $$2 = apg.a($$0, $$1);
      if ($$2 instanceof ua) {
         return (ua)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static et a(et $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ev<T>> void a(Collection<ig<T>> $$0, @Nullable ua $$1, T $$2, T $$3, ht<T> $$4, amx.b<T> $$5, hn $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ev<T>> void a(@Nullable ua $$0, ht<T> $$1, CommandDispatcher<T> $$2, T $$3, ig<T> $$4, akq $$5, eq $$6, boolean $$7) throws CommandSyntaxException {
      try {
         ii<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hz<>($$8, $$6, $$7).bind($$3));
      } catch (ew var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ev<T>> eq a(T $$0, amx.b<T> $$1, akq $$2, eq $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ev<T>> void a(Collection<ig<T>> $$0, @Nullable ua $$1, T $$2, T $$3, ht<T> $$4, amx.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      eq $$8 = eq.chain($$2.p(), $$4.b().d());

      for (ig<T> $$9 : $$0) {
         akq $$10 = $$9.a();
         eq $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ic.a());
   }

   private static <T extends ev<T>> void b(Collection<ig<T>> $$0, @Nullable ua $$1, T $$2, T $$3, ht<T> $$4, amx.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      eq $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ig<T> $$9 = $$0.iterator().next();
            akq $$10 = $$9.a();
            eq $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == eq.a) {
            for (ig<T> $$12 : $$0) {
               akq $$13 = $$12.a();
               eq $$14 = a($$2, $$5, $$13, $$8);
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
            eq $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ig<T> $$17 : $$0) {
               akq $$18 = $$17.a();
               eq $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akq var2, int var3);
   }

   abstract static class c extends hp.b<et> implements hp.a<et> {
      @Nullable
      protected abstract ua a(CommandContext<et> var1) throws CommandSyntaxException;

      public void a(et $$0, ContextChain<et> $$1, hn $$2, ht<et> $$3) throws CommandSyntaxException {
         CommandContext<et> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akq, Collection<ig<et>>> $$5 = hb.c($$4, "name");
         Collection<ig<et>> $$6 = (Collection<ig<et>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw amx.d.create(wy.a((akq)$$5.getFirst()));
         } else {
            ua $$7 = this.a($$4);
            et $$8 = amx.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wy.a("commands.function.scheduled.single", wy.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wy.a("commands.function.scheduled.multiple", xb.b($$6.stream().map(ig::a).toList(), wy::a)), true);
            }

            amx.a($$6, $$7, $$0, $$8, $$3, amx.e, $$2);
         }
      }
   }
}
