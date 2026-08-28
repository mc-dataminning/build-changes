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

public class anc {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wo.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wo.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wo.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ex> b = ($$0, $$1) -> {
      alj $$2 = ((ex)$$0.getSource()).l().aE();
      fc.a($$2.e(), $$1, "#");
      return fc.a($$2.d(), $$1);
   };
   static final anc.b<ex> e = new anc.b<ex>() {
      public void a(ex $$0, aku $$1, int $$2) {
         $$0.a(() -> wo.a("commands.function.result", wo.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ex> $$0) {
      LiteralArgumentBuilder<ex> $$1 = ey.a("with");

      for (apn.c $$2 : apn.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anc.c() {
               @Override
               protected tq a(CommandContext<ex> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ey.a("path", fp.a()).executes(new anc.c() {
               @Override
               protected tq a(CommandContext<ex> $$0) throws CommandSyntaxException {
                  return anc.a(fp.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ey.a("name", hf.a()).suggests(b).executes(new anc.c() {
               @Nullable
               @Override
               protected tq a(CommandContext<ex> $$0) {
                  return null;
               }
            })).then(ey.a("arguments", fh.a()).executes(new anc.c() {
               @Override
               protected tq a(CommandContext<ex> $$0) {
                  return fh.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static tq a(fp.g $$0, apm $$1) throws CommandSyntaxException {
      un $$2 = apn.a($$0, $$1);
      if ($$2 instanceof tq) {
         return (tq)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ex a(ex $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ez<T>> void a(Collection<il<T>> $$0, @Nullable tq $$1, T $$2, T $$3, hy<T> $$4, anc.b<T> $$5, hs $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ez<T>> void a(@Nullable tq $$0, hy<T> $$1, CommandDispatcher<T> $$2, T $$3, il<T> $$4, aku $$5, eu $$6, boolean $$7) throws CommandSyntaxException {
      try {
         in<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new ie<>($$8, $$6, $$7).bind($$3));
      } catch (fa var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ez<T>> eu a(T $$0, anc.b<T> $$1, aku $$2, eu $$3) {
      return $$0.x() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ez<T>> void a(Collection<il<T>> $$0, @Nullable tq $$1, T $$2, T $$3, hy<T> $$4, anc.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eu $$8 = eu.chain($$2.p(), $$4.b().d());

      for (il<T> $$9 : $$0) {
         aku $$10 = $$9.a();
         eu $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ii.a());
   }

   private static <T extends ez<T>> void b(Collection<il<T>> $$0, @Nullable tq $$1, T $$2, T $$3, hy<T> $$4, anc.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.w();
      T $$7 = $$3.a_();
      eu $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            il<T> $$9 = $$0.iterator().next();
            aku $$10 = $$9.a();
            eu $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == eu.a) {
            for (il<T> $$12 : $$0) {
               aku $$13 = $$12.a();
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

            for (il<T> $$17 : $$0) {
               aku $$18 = $$17.a();
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
      void a(T var1, aku var2, int var3);
   }

   abstract static class c extends hu.b<ex> implements hu.a<ex> {
      @Nullable
      protected abstract tq a(CommandContext<ex> var1) throws CommandSyntaxException;

      public void a(ex $$0, ContextChain<ex> $$1, hs $$2, hy<ex> $$3) throws CommandSyntaxException {
         CommandContext<ex> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<aku, Collection<il<ex>>> $$5 = hf.c($$4, "name");
         Collection<il<ex>> $$6 = (Collection<il<ex>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anc.d.create(wo.a((aku)$$5.getFirst()));
         } else {
            tq $$7 = this.a($$4);
            ex $$8 = anc.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wo.a("commands.function.scheduled.single", wo.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wo.a("commands.function.scheduled.multiple", wr.b($$6.stream().map(il::a).toList(), wo::a)), true);
            }

            anc.a($$6, $$7, $$0, $$8, $$3, anc.e, $$2);
         }
      }
   }
}
