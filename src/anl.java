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

public class anl {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wv.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wv.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wv.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ex> b = ($$0, $$1) -> {
      als $$2 = ((ex)$$0.getSource()).l().aE();
      fc.a($$2.e(), $$1, "#");
      return fc.a($$2.d(), $$1);
   };
   static final anl.b<ex> e = new anl.b<ex>() {
      public void a(ex $$0, ald $$1, int $$2) {
         $$0.a(() -> wv.a("commands.function.result", wv.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = ey.a("with");

      for (apx.c $$2 : apx.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anl.c() {
               @Override
               protected tw a(CommandContext<ex> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ey.a("path", fp.a()).executes(new anl.c() {
               @Override
               protected tw a(CommandContext<ex> $$0) throws CommandSyntaxException {
                  return anl.a(fp.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("name", hg.a()).suggests(b).executes(new anl.c() {
               @Nullable
               @Override
               protected tw a(CommandContext<ex> $$0) {
                  return null;
               }
            })).then(ey.a("arguments", fh.a()).executes(new anl.c() {
               @Override
               protected tw a(CommandContext<ex> $$0) {
                  return fh.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static tw a(fp.g $$0, apw $$1) throws CommandSyntaxException {
      ut $$2 = apx.a($$0, $$1);
      if ($$2 instanceof tw) {
         return (tw)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ex a(ex $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ez<T>> void a(Collection<im<T>> $$0, @Nullable tw $$1, T $$2, T $$3, hz<T> $$4, anl.b<T> $$5, ht $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ez<T>> void a(@Nullable tw $$0, hz<T> $$1, CommandDispatcher<T> $$2, T $$3, im<T> $$4, ald $$5, eu $$6, boolean $$7) throws CommandSyntaxException {
      try {
         io<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new ig<>($$8, $$6, $$7).bind($$3));
      } catch (fa var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ez<T>> eu a(T $$0, anl.b<T> $$1, ald $$2, eu $$3) {
      return $$0.x() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ez<T>> void a(Collection<im<T>> $$0, @Nullable tw $$1, T $$2, T $$3, hz<T> $$4, anl.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eu $$8 = eu.chain($$2.p(), $$4.b().d());

      for (im<T> $$9 : $$0) {
         ald $$10 = $$9.a();
         eu $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ij.a());
   }

   private static <T extends ez<T>> void b(Collection<im<T>> $$0, @Nullable tw $$1, T $$2, T $$3, hz<T> $$4, anl.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eu $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            im<T> $$9 = $$0.iterator().next();
            ald $$10 = $$9.a();
            eu $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == eu.a) {
            for (im<T> $$12 : $$0) {
               ald $$13 = $$12.a();
               eu $$14 = a($$2, $$5, $$13, $$8);
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
            eu $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (im<T> $$17 : $$0) {
               ald $$18 = $$17.a();
               eu $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, ald var2, int var3);
   }

   abstract static class c extends hv.b<ex> implements hv.a<ex> {
      @Nullable
      protected abstract tw a(CommandContext<ex> var1) throws CommandSyntaxException;

      public void a(ex $$0, ContextChain<ex> $$1, ht $$2, hz<ex> $$3) throws CommandSyntaxException {
         CommandContext<ex> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ald, Collection<im<ex>>> $$5 = hg.c($$4, "name");
         Collection<im<ex>> $$6 = (Collection<im<ex>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anl.d.create(wv.a((ald)$$5.getFirst()));
         } else {
            tw $$7 = this.a($$4);
            ex $$8 = anl.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wv.a("commands.function.scheduled.single", wv.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wv.a("commands.function.scheduled.multiple", wy.b($$6.stream().map(im::a).toList(), wv::a)), true);
            }

            anl.a($$6, $$7, $$0, $$8, $$3, anl.e, $$2);
         }
      }
   }
}
