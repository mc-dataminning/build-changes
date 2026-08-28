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

public class anr {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xj.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xj.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xj.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ew> b = ($$0, $$1) -> {
      aly $$2 = ((ew)$$0.getSource()).l().aE();
      fb.a($$2.e(), $$1, "#");
      return fb.a($$2.d(), $$1);
   };
   static final anr.b<ew> e = new anr.b<ew>() {
      public void a(ew $$0, alj $$1, int $$2) {
         $$0.a(() -> xj.a("commands.function.result", xj.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ew> $$0) {
      LiteralArgumentBuilder<ew> $$1 = ex.a("with");

      for (aqa.c $$2 : aqa.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new anr.c() {
               @Override
               protected ul a(CommandContext<ew> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ex.a("path", fo.a()).executes(new anr.c() {
               @Override
               protected ul a(CommandContext<ew> $$0) throws CommandSyntaxException {
                  return anr.a(fo.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ex.a("name", he.a()).suggests(b).executes(new anr.c() {
               @Nullable
               @Override
               protected ul a(CommandContext<ew> $$0) {
                  return null;
               }
            })).then(ex.a("arguments", fg.a()).executes(new anr.c() {
               @Override
               protected ul a(CommandContext<ew> $$0) {
                  return fg.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ul a(fo.g $$0, apz $$1) throws CommandSyntaxException {
      vi $$2 = aqa.a($$0, $$1);
      if ($$2 instanceof ul) {
         return (ul)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ew a(ew $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ey<T>> void a(Collection<ik<T>> $$0, @Nullable ul $$1, T $$2, T $$3, hx<T> $$4, anr.b<T> $$5, hr $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ey<T>> void a(@Nullable ul $$0, hx<T> $$1, CommandDispatcher<T> $$2, T $$3, ik<T> $$4, alj $$5, et $$6, boolean $$7) throws CommandSyntaxException {
      try {
         im<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new id<>($$8, $$6, $$7).bind($$3));
      } catch (ez var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ey<T>> et a(T $$0, anr.b<T> $$1, alj $$2, et $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ey<T>> void a(Collection<ik<T>> $$0, @Nullable ul $$1, T $$2, T $$3, hx<T> $$4, anr.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      et $$8 = et.chain($$2.p(), $$4.b().d());

      for (ik<T> $$9 : $$0) {
         alj $$10 = $$9.a();
         et $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ih.a());
   }

   private static <T extends ey<T>> void b(Collection<ik<T>> $$0, @Nullable ul $$1, T $$2, T $$3, hx<T> $$4, anr.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      et $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            ik<T> $$9 = $$0.iterator().next();
            alj $$10 = $$9.a();
            et $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == et.a) {
            for (ik<T> $$12 : $$0) {
               alj $$13 = $$12.a();
               et $$14 = a($$2, $$5, $$13, $$8);
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
            et $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (ik<T> $$17 : $$0) {
               alj $$18 = $$17.a();
               et $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, alj var2, int var3);
   }

   abstract static class c extends ht.b<ew> implements ht.a<ew> {
      @Nullable
      protected abstract ul a(CommandContext<ew> var1) throws CommandSyntaxException;

      public void a(ew $$0, ContextChain<ew> $$1, hr $$2, hx<ew> $$3) throws CommandSyntaxException {
         CommandContext<ew> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<alj, Collection<ik<ew>>> $$5 = he.c($$4, "name");
         Collection<ik<ew>> $$6 = (Collection<ik<ew>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw anr.d.create(xj.a((alj)$$5.getFirst()));
         } else {
            ul $$7 = this.a($$4);
            ew $$8 = anr.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> xj.a("commands.function.scheduled.single", xj.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> xj.a("commands.function.scheduled.multiple", xm.b($$6.stream().map(ik::a).toList(), xj::a)), true);
            }

            anr.a($$6, $$7, $$0, $$8, $$3, anr.e, $$2);
         }
      }
   }
}
