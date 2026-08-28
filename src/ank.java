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

public class ank {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ep> b = ($$0, $$1) -> {
      alt $$2 = ((ep)$$0.getSource()).l().aF();
      eu.a($$2.e(), $$1, "#");
      return eu.a($$2.d(), $$1);
   };
   static final ank.b<ep> e = new ank.b<ep>() {
      public void a(ep $$0, ale $$1, int $$2) {
         $$0.a(() -> xo.a("commands.function.result", xo.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ep> $$0) {
      LiteralArgumentBuilder<ep> $$1 = eq.a("with");

      for (apu.c $$2 : apu.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new ank.c() {
               @Override
               protected ur a(CommandContext<ep> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(eq.a("path", fh.a()).executes(new ank.c() {
               @Override
               protected ur a(CommandContext<ep> $$0) throws CommandSyntaxException {
                  return ank.a(fh.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)eq.a("name", gx.a()).suggests(b).executes(new ank.c() {
               @Nullable
               @Override
               protected ur a(CommandContext<ep> $$0) {
                  return null;
               }
            })).then(eq.a("arguments", ez.a()).executes(new ank.c() {
               @Override
               protected ur a(CommandContext<ep> $$0) {
                  return ez.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ur a(fh.g $$0, apt $$1) throws CommandSyntaxException {
      vo $$2 = apu.a($$0, $$1);
      if ($$2 instanceof ur) {
         return (ur)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ep a(ep $$0) {
      return $$0.a().b(2);
   }

   public static <T extends er<T>> void a(Collection<ib<T>> $$0, @Nullable ur $$1, T $$2, T $$3, hp<T> $$4, ank.b<T> $$5, hj $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends er<T>> void a(@Nullable ur $$0, hp<T> $$1, CommandDispatcher<T> $$2, T $$3, ib<T> $$4, ale $$5, em $$6, boolean $$7) throws CommandSyntaxException {
      try {
         id<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hv<>($$8, $$6, $$7).bind($$3));
      } catch (es var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends er<T>> em a(T $$0, ank.b<T> $$1, ale $$2, em $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends er<T>> void a(Collection<ib<T>> $$0, @Nullable ur $$1, T $$2, T $$3, hp<T> $$4, ank.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      em $$8 = em.chain($$2.p(), $$4.b().d());

      for (ib<T> $$9 : $$0) {
         ale $$10 = $$9.a();
         em $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hy.a());
   }

   private static <T extends er<T>> void b(Collection<ib<T>> $$0, @Nullable ur $$1, T $$2, T $$3, hp<T> $$4, ank.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      em $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ib<T> $$9 = $$0.iterator().next();
            ale $$10 = $$9.a();
            em $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == em.a) {
            for (ib<T> $$12 : $$0) {
               ale $$13 = $$12.a();
               em $$14 = a($$2, $$5, $$13, $$8);
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
            em $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ib<T> $$17 : $$0) {
               ale $$18 = $$17.a();
               em $$19 = a($$2, $$5, $$18, $$16);
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

   abstract static class c extends hl.b<ep> implements hl.a<ep> {
      @Nullable
      protected abstract ur a(CommandContext<ep> var1) throws CommandSyntaxException;

      public void a(ep $$0, ContextChain<ep> $$1, hj $$2, hp<ep> $$3) throws CommandSyntaxException {
         CommandContext<ep> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<ale, Collection<ib<ep>>> $$5 = gx.c($$4, "name");
         Collection<ib<ep>> $$6 = (Collection<ib<ep>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw ank.d.create(xo.a((ale)$$5.getFirst()));
         } else {
            ur $$7 = this.a($$4);
            ep $$8 = ank.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xo.a("commands.function.scheduled.single", xo.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xo.a("commands.function.scheduled.multiple", xr.b($$6.stream().map(ib::a).toList(), xo::a)), true);
            }

            ank.a($$6, $$7, $$0, $$8, $$3, ank.e, $$2);
         }
      }
   }
}
