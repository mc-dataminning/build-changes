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

public class amn {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wu.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wu.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wu.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ed> b = ($$0, $$1) -> {
      akw $$2 = ((ed)$$0.getSource()).l().aF();
      ei.a($$2.e(), $$1, "#");
      return ei.a($$2.d(), $$1);
   };
   static final amn.b<ed> e = new amn.b<ed>() {
      public void a(ed $$0, akh $$1, int $$2) {
         $$0.a(() -> wu.a("commands.function.result", wu.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ed> $$0) {
      LiteralArgumentBuilder<ed> $$1 = ee.a("with");

      for (aox.c $$2 : aox.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new amn.c() {
               @Override
               protected ua a(CommandContext<ed> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ee.a("path", ev.a()).executes(new amn.c() {
               @Override
               protected ua a(CommandContext<ed> $$0) throws CommandSyntaxException {
                  return amn.a(ev.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("name", gl.a()).suggests(b).executes(new amn.c() {
               @Nullable
               @Override
               protected ua a(CommandContext<ed> $$0) {
                  return null;
               }
            })).then(ee.a("arguments", en.a()).executes(new amn.c() {
               @Override
               protected ua a(CommandContext<ed> $$0) {
                  return en.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ua a(ev.g $$0, aow $$1) throws CommandSyntaxException {
      ux $$2 = aox.a($$0, $$1);
      if ($$2 instanceof ua) {
         return (ua)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ed a(ed $$0) {
      return $$0.a().b(2);
   }

   public static <T extends ef<T>> void a(Collection<hp<T>> $$0, @Nullable ua $$1, T $$2, T $$3, hd<T> $$4, amn.b<T> $$5, gx $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends ef<T>> void a(@Nullable ua $$0, hd<T> $$1, CommandDispatcher<T> $$2, T $$3, hp<T> $$4, akh $$5, ea $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hr<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hj<>($$8, $$6, $$7).bind($$3));
      } catch (eg var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends ef<T>> ea a(T $$0, amn.b<T> $$1, akh $$2, ea $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends ef<T>> void a(Collection<hp<T>> $$0, @Nullable ua $$1, T $$2, T $$3, hd<T> $$4, amn.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ea $$8 = ea.chain($$2.p(), $$4.b().d());

      for (hp<T> $$9 : $$0) {
         akh $$10 = $$9.a();
         ea $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hm.a());
   }

   private static <T extends ef<T>> void b(Collection<hp<T>> $$0, @Nullable ua $$1, T $$2, T $$3, hd<T> $$4, amn.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      ea $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hp<T> $$9 = $$0.iterator().next();
            akh $$10 = $$9.a();
            ea $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == ea.a) {
            for (hp<T> $$12 : $$0) {
               akh $$13 = $$12.a();
               ea $$14 = a($$2, $$5, $$13, $$8);
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
            ea $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hp<T> $$17 : $$0) {
               akh $$18 = $$17.a();
               ea $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akh var2, int var3);
   }

   abstract static class c extends gz.b<ed> implements gz.a<ed> {
      @Nullable
      protected abstract ua a(CommandContext<ed> var1) throws CommandSyntaxException;

      public void a(ed $$0, ContextChain<ed> $$1, gx $$2, hd<ed> $$3) throws CommandSyntaxException {
         CommandContext<ed> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akh, Collection<hp<ed>>> $$5 = gl.c($$4, "name");
         Collection<hp<ed>> $$6 = (Collection<hp<ed>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw amn.d.create(wu.a((akh)$$5.getFirst()));
         } else {
            ua $$7 = this.a($$4);
            ed $$8 = amn.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wu.a("commands.function.scheduled.single", wu.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wu.a("commands.function.scheduled.multiple", wx.b($$6.stream().map(hp::a).toList(), wu::a)), true);
            }

            amn.a($$6, $$7, $$0, $$8, $$3, amn.e, $$2);
         }
      }
   }
}
