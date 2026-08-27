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
import java.util.Collections;
import java.util.function.Function;
import javax.annotation.Nullable;

public class aji {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vd.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vd.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vd.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ds> b = ($$0, $$1) -> {
      ahr $$2 = ((ds)$$0.getSource()).l().aC();
      dx.a($$2.e(), $$1, "#");
      return dx.a($$2.d(), $$1);
   };
   static final aji.b<ds> e = new aji.b<ds>() {
      public void a(ds $$0, ahd $$1, int $$2) {
         $$0.a(() -> vd.a("commands.function.result", vd.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ds> $$0) {
      LiteralArgumentBuilder<ds> $$1 = dt.a("with");

      for (alq.c $$2 : alq.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new aji.c() {
               @Override
               protected sl a(CommandContext<ds> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dt.a("path", ek.a()).executes(new aji.c() {
               @Override
               protected sl a(CommandContext<ds> $$0) throws CommandSyntaxException {
                  return aji.a(ek.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dt.a("name", fx.a()).suggests(b).executes(new aji.c() {
               @Nullable
               @Override
               protected sl a(CommandContext<ds> $$0) {
                  return null;
               }
            })).then(dt.a("arguments", ec.a()).executes(new aji.c() {
               @Override
               protected sl a(CommandContext<ds> $$0) {
                  return ec.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static sl a(ek.g $$0, alp $$1) throws CommandSyntaxException {
      ti $$2 = alq.a($$0, $$1);
      if ($$2 instanceof sl) {
         return (sl)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ds a(ds $$0) {
      return $$0.a().b(2);
   }

   public static <T extends du<T>> void a(Collection<hb<T>> $$0, @Nullable sl $$1, T $$2, T $$3, gp<T> $$4, aji.b<T> $$5, gj $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends du<T>> void a(@Nullable sl $$0, gp<T> $$1, CommandDispatcher<T> $$2, T $$3, hb<T> $$4, ahd $$5, dp $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hd<T> $$8 = $$4.a($$0, $$2, $$3);
         $$1.a(new gv<>($$8, $$6, $$7).bind($$3));
      } catch (dv var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends du<T>> dp a(T $$0, aji.b<T> $$1, ahd $$2, dp $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onSuccess($$5);
      };
   }

   private static <T extends du<T>> void a(Collection<hb<T>> $$0, @Nullable sl $$1, T $$2, T $$3, gp<T> $$4, aji.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dp $$8 = dp.chain($$2.p(), $$4.b().d());

      for (hb<T> $$9 : $$0) {
         ahd $$10 = $$9.a();
         dp $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      if ($$8 != dp.a) {
         $$4.a(gy.a());
      }
   }

   private static <T extends du<T>> void b(Collection<hb<T>> $$0, @Nullable sl $$1, T $$2, T $$3, gp<T> $$4, aji.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dp $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hb<T> $$9 = $$0.iterator().next();
            ahd $$10 = $$9.a();
            dp $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dp.a) {
            for (hb<T> $$12 : $$0) {
               ahd $$13 = $$12.a();
               dp $$14 = a($$2, $$5, $$13, $$8);
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
            dp $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hb<T> $$17 : $$0) {
               ahd $$18 = $$17.a();
               dp $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, ahd var2, int var3);
   }

   abstract static class c extends gl.b<ds> implements gl.a<ds> {
      @Nullable
      protected abstract sl a(CommandContext<ds> var1) throws CommandSyntaxException;

      public void a(ds $$0, ContextChain<ds> $$1, gj $$2, gp<ds> $$3) throws CommandSyntaxException {
         CommandContext<ds> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ahd, Collection<hb<ds>>> $$5 = fx.b($$4, "name").mapSecond($$0x -> (Collection)$$0x.map(Collections::singleton, Function.identity()));
         Collection<hb<ds>> $$6 = (Collection<hb<ds>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw aji.d.create(vd.a((ahd)$$5.getFirst()));
         } else {
            sl $$7 = this.a($$4);
            ds $$8 = aji.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> vd.a("commands.function.scheduled.single", vd.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> vd.a("commands.function.scheduled.multiple", vg.b($$6.stream().map(hb::a).toList(), vd::a)), true);
            }

            aji.a($$6, $$7, $$0, $$8, $$3, aji.e, $$2);
         }
      }
   }
}
