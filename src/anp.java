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

public class anp {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ev> b = ($$0, $$1) -> {
      alw $$2 = ((ev)$$0.getSource()).l().aE();
      fa.a($$2.e(), $$1, "#");
      return fa.a($$2.d(), $$1);
   };
   static final anp.b<ev> e = new anp.b<ev>() {
      public void a(ev $$0, alh $$1, int $$2) {
         $$0.a(() -> xh.a("commands.function.result", xh.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ev> $$0) {
      LiteralArgumentBuilder<ev> $$1 = ew.a("with");

      for (apy.c $$2 : apy.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anp.c() {
               @Override
               protected uj a(CommandContext<ev> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ew.a("path", fn.a()).executes(new anp.c() {
               @Override
               protected uj a(CommandContext<ev> $$0) throws CommandSyntaxException {
                  return anp.a(fn.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ew.a("name", hd.a()).suggests(b).executes(new anp.c() {
               @Nullable
               @Override
               protected uj a(CommandContext<ev> $$0) {
                  return null;
               }
            })).then(ew.a("arguments", ff.a()).executes(new anp.c() {
               @Override
               protected uj a(CommandContext<ev> $$0) {
                  return ff.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static uj a(fn.g $$0, apx $$1) throws CommandSyntaxException {
      vg $$2 = apy.a($$0, $$1);
      if ($$2 instanceof uj) {
         return (uj)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ev a(ev $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ex<T>> void a(Collection<ij<T>> $$0, @Nullable uj $$1, T $$2, T $$3, hw<T> $$4, anp.b<T> $$5, hq $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ex<T>> void a(@Nullable uj $$0, hw<T> $$1, CommandDispatcher<T> $$2, T $$3, ij<T> $$4, alh $$5, es $$6, boolean $$7) throws CommandSyntaxException {
      try {
         il<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new ic<>($$8, $$6, $$7).bind($$3));
      } catch (ey var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ex<T>> es a(T $$0, anp.b<T> $$1, alh $$2, es $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ex<T>> void a(Collection<ij<T>> $$0, @Nullable uj $$1, T $$2, T $$3, hw<T> $$4, anp.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      es $$8 = es.chain($$2.p(), $$4.b().d());

      for (ij<T> $$9 : $$0) {
         alh $$10 = $$9.a();
         es $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ig.a());
   }

   private static <T extends ex<T>> void b(Collection<ij<T>> $$0, @Nullable uj $$1, T $$2, T $$3, hw<T> $$4, anp.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      es $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ij<T> $$9 = $$0.iterator().next();
            alh $$10 = $$9.a();
            es $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == es.a) {
            for (ij<T> $$12 : $$0) {
               alh $$13 = $$12.a();
               es $$14 = a($$2, $$5, $$13, $$8);
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
            es $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ij<T> $$17 : $$0) {
               alh $$18 = $$17.a();
               es $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, alh var2, int var3);
   }

   abstract static class c extends hs.b<ev> implements hs.a<ev> {
      @Nullable
      protected abstract uj a(CommandContext<ev> var1) throws CommandSyntaxException;

      public void a(ev $$0, ContextChain<ev> $$1, hq $$2, hw<ev> $$3) throws CommandSyntaxException {
         CommandContext<ev> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<alh, Collection<ij<ev>>> $$5 = hd.c($$4, "name");
         Collection<ij<ev>> $$6 = (Collection<ij<ev>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anp.d.create(xh.a((alh)$$5.getFirst()));
         } else {
            uj $$7 = this.a($$4);
            ev $$8 = anp.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xh.a("commands.function.scheduled.single", xh.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xh.a("commands.function.scheduled.multiple", xk.b($$6.stream().map(ij::a).toList(), xh::a)), true);
            }

            anp.a($$6, $$7, $$0, $$8, $$3, anp.e, $$2);
         }
      }
   }
}
