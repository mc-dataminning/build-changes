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

public class amq {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<eq> b = ($$0, $$1) -> {
      akz $$2 = ((eq)$$0.getSource()).l().aF();
      ev.a($$2.e(), $$1, "#");
      return ev.a($$2.d(), $$1);
   };
   static final amq.b<eq> e = new amq.b<eq>() {
      public void a(eq $$0, akk $$1, int $$2) {
         $$0.a(() -> wu.a("commands.function.result", wu.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<eq> $$0) {
      LiteralArgumentBuilder<eq> $$1 = er.a("with");

      for (apa.c $$2 : apa.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new amq.c() {
               @Override
               protected tx a(CommandContext<eq> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(er.a("path", fi.a()).executes(new amq.c() {
               @Override
               protected tx a(CommandContext<eq> $$0) throws CommandSyntaxException {
                  return amq.a(fi.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)er.a("name", gy.a()).suggests(b).executes(new amq.c() {
               @Nullable
               @Override
               protected tx a(CommandContext<eq> $$0) {
                  return null;
               }
            })).then(er.a("arguments", fa.a()).executes(new amq.c() {
               @Override
               protected tx a(CommandContext<eq> $$0) {
                  return fa.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static tx a(fi.g $$0, aoz $$1) throws CommandSyntaxException {
      uu $$2 = apa.a($$0, $$1);
      if ($$2 instanceof tx) {
         return (tx)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static eq a(eq $$0) {
      return $$0.a().b(2);
   }

   public static <T extends es<T>> void a(Collection<ic<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hq<T> $$4, amq.b<T> $$5, hk $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends es<T>> void a(@Nullable tx $$0, hq<T> $$1, CommandDispatcher<T> $$2, T $$3, ic<T> $$4, akk $$5, en $$6, boolean $$7) throws CommandSyntaxException {
      try {
         ie<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hw<>($$8, $$6, $$7).bind($$3));
      } catch (et var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends es<T>> en a(T $$0, amq.b<T> $$1, akk $$2, en $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends es<T>> void a(Collection<ic<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hq<T> $$4, amq.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      en $$8 = en.chain($$2.p(), $$4.b().d());

      for (ic<T> $$9 : $$0) {
         akk $$10 = $$9.a();
         en $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hz.a());
   }

   private static <T extends es<T>> void b(Collection<ic<T>> $$0, @Nullable tx $$1, T $$2, T $$3, hq<T> $$4, amq.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      en $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ic<T> $$9 = $$0.iterator().next();
            akk $$10 = $$9.a();
            en $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == en.a) {
            for (ic<T> $$12 : $$0) {
               akk $$13 = $$12.a();
               en $$14 = a($$2, $$5, $$13, $$8);
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
            en $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ic<T> $$17 : $$0) {
               akk $$18 = $$17.a();
               en $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akk var2, int var3);
   }

   abstract static class c extends hm.b<eq> implements hm.a<eq> {
      @Nullable
      protected abstract tx a(CommandContext<eq> var1) throws CommandSyntaxException;

      public void a(eq $$0, ContextChain<eq> $$1, hk $$2, hq<eq> $$3) throws CommandSyntaxException {
         CommandContext<eq> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akk, Collection<ic<eq>>> $$5 = gy.c($$4, "name");
         Collection<ic<eq>> $$6 = (Collection<ic<eq>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw amq.d.create(wu.a((akk)$$5.getFirst()));
         } else {
            tx $$7 = this.a($$4);
            eq $$8 = amq.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wu.a("commands.function.scheduled.single", wu.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wu.a("commands.function.scheduled.multiple", wx.b($$6.stream().map(ic::a).toList(), wu::a)), true);
            }

            amq.a($$6, $$7, $$0, $$8, $$3, amq.e, $$2);
         }
      }
   }
}
