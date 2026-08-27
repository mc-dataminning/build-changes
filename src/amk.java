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

public class amk {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ws.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ws.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ws.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ec> b = ($$0, $$1) -> {
      akt $$2 = ((ec)$$0.getSource()).l().aF();
      eh.a($$2.e(), $$1, "#");
      return eh.a($$2.d(), $$1);
   };
   static final amk.b<ec> e = new amk.b<ec>() {
      public void a(ec $$0, akf $$1, int $$2) {
         $$0.a(() -> ws.a("commands.function.result", ws.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ec> $$0) {
      LiteralArgumentBuilder<ec> $$1 = ed.a("with");

      for (aou.c $$2 : aou.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new amk.c() {
               @Override
               protected ty a(CommandContext<ec> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ed.a("path", eu.a()).executes(new amk.c() {
               @Override
               protected ty a(CommandContext<ec> $$0) throws CommandSyntaxException {
                  return amk.a(eu.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ed.a("name", gi.a()).suggests(b).executes(new amk.c() {
               @Nullable
               @Override
               protected ty a(CommandContext<ec> $$0) {
                  return null;
               }
            })).then(ed.a("arguments", em.a()).executes(new amk.c() {
               @Override
               protected ty a(CommandContext<ec> $$0) {
                  return em.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ty a(eu.g $$0, aot $$1) throws CommandSyntaxException {
      uv $$2 = aou.a($$0, $$1);
      if ($$2 instanceof ty) {
         return (ty)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ec a(ec $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ee<T>> void a(Collection<ho<T>> $$0, @Nullable ty $$1, T $$2, T $$3, hc<T> $$4, amk.b<T> $$5, gw $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ee<T>> void a(@Nullable ty $$0, hc<T> $$1, CommandDispatcher<T> $$2, T $$3, ho<T> $$4, akf $$5, dz $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hq<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hi<>($$8, $$6, $$7).bind($$3));
      } catch (ef var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ee<T>> dz a(T $$0, amk.b<T> $$1, akf $$2, dz $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ee<T>> void a(Collection<ho<T>> $$0, @Nullable ty $$1, T $$2, T $$3, hc<T> $$4, amk.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dz $$8 = dz.chain($$2.p(), $$4.b().d());

      for (ho<T> $$9 : $$0) {
         akf $$10 = $$9.a();
         dz $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hl.a());
   }

   private static <T extends ee<T>> void b(Collection<ho<T>> $$0, @Nullable ty $$1, T $$2, T $$3, hc<T> $$4, amk.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dz $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ho<T> $$9 = $$0.iterator().next();
            akf $$10 = $$9.a();
            dz $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dz.a) {
            for (ho<T> $$12 : $$0) {
               akf $$13 = $$12.a();
               dz $$14 = a($$2, $$5, $$13, $$8);
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
            dz $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ho<T> $$17 : $$0) {
               akf $$18 = $$17.a();
               dz $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akf var2, int var3);
   }

   abstract static class c extends gy.b<ec> implements gy.a<ec> {
      @Nullable
      protected abstract ty a(CommandContext<ec> var1) throws CommandSyntaxException;

      public void a(ec $$0, ContextChain<ec> $$1, gw $$2, hc<ec> $$3) throws CommandSyntaxException {
         CommandContext<ec> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akf, Collection<ho<ec>>> $$5 = gi.c($$4, "name");
         Collection<ho<ec>> $$6 = (Collection<ho<ec>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw amk.d.create(ws.a((akf)$$5.getFirst()));
         } else {
            ty $$7 = this.a($$4);
            ec $$8 = amk.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> ws.a("commands.function.scheduled.single", ws.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> ws.a("commands.function.scheduled.multiple", wv.b($$6.stream().map(ho::a).toList(), ws::a)), true);
            }

            amk.a($$6, $$7, $$0, $$8, $$3, amk.e, $$2);
         }
      }
   }
}
