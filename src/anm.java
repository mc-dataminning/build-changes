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

public class anm {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ww.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ww.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ww.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ei> b = ($$0, $$1) -> {
      alt $$2 = ((ei)$$0.getSource()).l().aE();
      en.a($$2.e(), $$1, "#");
      return en.a($$2.d(), $$1);
   };
   static final anm.b<ei> e = new anm.b<ei>() {
      public void a(ei $$0, ale $$1, int $$2) {
         $$0.a(() -> ww.a("commands.function.result", ww.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ei> $$0) {
      LiteralArgumentBuilder<ei> $$1 = ej.a("with");

      for (apy.c $$2 : apy.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anm.c() {
               @Override
               protected tx a(CommandContext<ei> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ej.a("path", fa.a()).executes(new anm.c() {
               @Override
               protected tx a(CommandContext<ei> $$0) throws CommandSyntaxException {
                  return anm.a(fa.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ej.a("name", gr.a()).suggests(b).executes(new anm.c() {
               @Nullable
               @Override
               protected tx a(CommandContext<ei> $$0) {
                  return null;
               }
            })).then(ej.a("arguments", es.a()).executes(new anm.c() {
               @Override
               protected tx a(CommandContext<ei> $$0) {
                  return es.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static tx a(fa.g $$0, apx $$1) throws CommandSyntaxException {
      uu $$2 = apy.a($$0, $$1);
      if ($$2 instanceof tx) {
         return (tx)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ei a(ei $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ek<T>> void a(Collection<hw<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hk<T> $$4, anm.b<T> $$5, he $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ek<T>> void a(@Nullable tx $$0, hk<T> $$1, CommandDispatcher<T> $$2, T $$3, hw<T> $$4, ale $$5, ef $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hy<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hq<>($$8, $$6, $$7).bind($$3));
      } catch (el var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ek<T>> ef a(T $$0, anm.b<T> $$1, ale $$2, ef $$3) {
      return $$0.x() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ek<T>> void a(Collection<hw<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hk<T> $$4, anm.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      ef $$8 = ef.chain($$2.p(), $$4.b().d());

      for (hw<T> $$9 : $$0) {
         ale $$10 = $$9.a();
         ef $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ht.a());
   }

   private static <T extends ek<T>> void b(Collection<hw<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hk<T> $$4, anm.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      ef $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hw<T> $$9 = $$0.iterator().next();
            ale $$10 = $$9.a();
            ef $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == ef.a) {
            for (hw<T> $$12 : $$0) {
               ale $$13 = $$12.a();
               ef $$14 = a($$2, $$5, $$13, $$8);
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
            ef $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hw<T> $$17 : $$0) {
               ale $$18 = $$17.a();
               ef $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, ale var2, int var3);
   }

   abstract static class c extends hg.b<ei> implements hg.a<ei> {
      @Nullable
      protected abstract tx a(CommandContext<ei> var1) throws CommandSyntaxException;

      public void a(ei $$0, ContextChain<ei> $$1, he $$2, hk<ei> $$3) throws CommandSyntaxException {
         CommandContext<ei> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ale, Collection<hw<ei>>> $$5 = gr.c($$4, "name");
         Collection<hw<ei>> $$6 = (Collection<hw<ei>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anm.d.create(ww.a((ale)$$5.getFirst()));
         } else {
            tx $$7 = this.a($$4);
            ei $$8 = anm.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> ww.a("commands.function.scheduled.single", ww.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> ww.a("commands.function.scheduled.multiple", wz.b($$6.stream().map(hw::a).toList(), ww::a)), true);
            }

            anm.a($$6, $$7, $$0, $$8, $$3, anm.e, $$2);
         }
      }
   }
}
