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
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xe.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xe.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xe.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<eu> b = ($$0, $$1) -> {
      alt $$2 = ((eu)$$0.getSource()).l().aE();
      ez.a($$2.e(), $$1, "#");
      return ez.a($$2.d(), $$1);
   };
   static final anm.b<eu> e = new anm.b<eu>() {
      public void a(eu $$0, ale $$1, int $$2) {
         $$0.a(() -> xe.a("commands.function.result", xe.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<eu> $$0) {
      LiteralArgumentBuilder<eu> $$1 = ev.a("with");

      for (apv.c $$2 : apv.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anm.c() {
               @Override
               protected ug a(CommandContext<eu> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ev.a("path", fm.a()).executes(new anm.c() {
               @Override
               protected ug a(CommandContext<eu> $$0) throws CommandSyntaxException {
                  return anm.a(fm.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ev.a("name", hc.a()).suggests(b).executes(new anm.c() {
               @Nullable
               @Override
               protected ug a(CommandContext<eu> $$0) {
                  return null;
               }
            })).then(ev.a("arguments", fe.a()).executes(new anm.c() {
               @Override
               protected ug a(CommandContext<eu> $$0) {
                  return fe.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ug a(fm.g $$0, apu $$1) throws CommandSyntaxException {
      vd $$2 = apv.a($$0, $$1);
      if ($$2 instanceof ug) {
         return (ug)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static eu a(eu $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ew<T>> void a(Collection<ii<T>> $$0, @Nullable ug $$1, T $$2, T $$3, hv<T> $$4, anm.b<T> $$5, hp $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ew<T>> void a(@Nullable ug $$0, hv<T> $$1, CommandDispatcher<T> $$2, T $$3, ii<T> $$4, ale $$5, er $$6, boolean $$7) throws CommandSyntaxException {
      try {
         ik<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new ib<>($$8, $$6, $$7).bind($$3));
      } catch (ex var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ew<T>> er a(T $$0, anm.b<T> $$1, ale $$2, er $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ew<T>> void a(Collection<ii<T>> $$0, @Nullable ug $$1, T $$2, T $$3, hv<T> $$4, anm.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      er $$8 = er.chain($$2.p(), $$4.b().d());

      for (ii<T> $$9 : $$0) {
         ale $$10 = $$9.a();
         er $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ie.a());
   }

   private static <T extends ew<T>> void b(Collection<ii<T>> $$0, @Nullable ug $$1, T $$2, T $$3, hv<T> $$4, anm.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      er $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ii<T> $$9 = $$0.iterator().next();
            ale $$10 = $$9.a();
            er $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == er.a) {
            for (ii<T> $$12 : $$0) {
               ale $$13 = $$12.a();
               er $$14 = a($$2, $$5, $$13, $$8);
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
            er $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ii<T> $$17 : $$0) {
               ale $$18 = $$17.a();
               er $$19 = a($$2, $$5, $$18, $$16);
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

   abstract static class c extends hr.b<eu> implements hr.a<eu> {
      @Nullable
      protected abstract ug a(CommandContext<eu> var1) throws CommandSyntaxException;

      public void a(eu $$0, ContextChain<eu> $$1, hp $$2, hv<eu> $$3) throws CommandSyntaxException {
         CommandContext<eu> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ale, Collection<ii<eu>>> $$5 = hc.c($$4, "name");
         Collection<ii<eu>> $$6 = (Collection<ii<eu>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anm.d.create(xe.a((ale)$$5.getFirst()));
         } else {
            ug $$7 = this.a($$4);
            eu $$8 = anm.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xe.a("commands.function.scheduled.single", xe.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xe.a("commands.function.scheduled.multiple", xh.b($$6.stream().map(ii::a).toList(), xe::a)), true);
            }

            anm.a($$6, $$7, $$0, $$8, $$3, anm.e, $$2);
         }
      }
   }
}
