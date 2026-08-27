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

public class air {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> uv.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> uv.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<du> b = ($$0, $$1) -> {
      aha $$2 = ((du)$$0.getSource()).l().aC();
      dy.a($$2.e(), $$1, "#");
      return dy.a($$2.d(), $$1);
   };
   static final air.b<du> e = new air.b<du>() {
      public void a(du $$0, agm $$1, int $$2) {
         $$0.a(() -> uv.a("commands.function.result", uv.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("with");

      for (akz.c $$2 : akz.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new air.c() {
               @Override
               protected sd a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dv.a("path", el.a()).executes(new air.c() {
               @Override
               protected sd a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return air.a(el.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("name", fx.a()).suggests(b).executes(new air.c() {
               @Nullable
               @Override
               protected sd a(CommandContext<du> $$0) {
                  return null;
               }
            })).then(dv.a("arguments", ed.a()).executes(new air.c() {
               @Override
               protected sd a(CommandContext<du> $$0) {
                  return ed.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static sd a(el.g $$0, aky $$1) throws CommandSyntaxException {
      ta $$2 = akz.a($$0, $$1);
      if ($$2 instanceof sd) {
         return (sd)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static du a(du $$0) {
      return $$0.a().b(2);
   }

   public static <T extends dw<T>> void a(Collection<hb<T>> $$0, @Nullable sd $$1, T $$2, T $$3, gp<T> $$4, air.b<T> $$5, gj $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends dw<T>> void a(@Nullable sd $$0, gp<T> $$1, CommandDispatcher<T> $$2, T $$3, hb<T> $$4, agm $$5, dq $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hd<T> $$8 = $$4.a($$0, $$2, $$3);
         $$1.a(new gv<>($$8, $$6, $$7).bind($$3));
      } catch (dx var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends dw<T>> dq a(T $$0, air.b<T> $$1, agm $$2, dq $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onSuccess($$5);
      };
   }

   private static <T extends dw<T>> void a(Collection<hb<T>> $$0, @Nullable sd $$1, T $$2, T $$3, gp<T> $$4, air.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dq $$8 = dq.chain($$2.p(), $$4.b().d());

      for (hb<T> $$9 : $$0) {
         agm $$10 = $$9.a();
         dq $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      if ($$8 != dq.a) {
         $$4.a(gy.a());
      }
   }

   private static <T extends dw<T>> void b(Collection<hb<T>> $$0, @Nullable sd $$1, T $$2, T $$3, gp<T> $$4, air.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dq $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hb<T> $$9 = $$0.iterator().next();
            agm $$10 = $$9.a();
            dq $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dq.a) {
            for (hb<T> $$12 : $$0) {
               agm $$13 = $$12.a();
               dq $$14 = a($$2, $$5, $$13, $$8);
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
            dq $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hb<T> $$17 : $$0) {
               agm $$18 = $$17.a();
               dq $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, agm var2, int var3);
   }

   abstract static class c extends gl.b<du> implements gl.a<du> {
      @Nullable
      protected abstract sd a(CommandContext<du> var1) throws CommandSyntaxException;

      public void a(du $$0, ContextChain<du> $$1, gj $$2, gp<du> $$3) throws CommandSyntaxException {
         CommandContext<du> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<agm, Collection<hb<du>>> $$5 = fx.b($$4, "name").mapSecond($$0x -> (Collection)$$0x.map(Collections::singleton, Function.identity()));
         Collection<hb<du>> $$6 = (Collection<hb<du>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw air.d.create(uv.a((agm)$$5.getFirst()));
         } else {
            sd $$7 = this.a($$4);
            du $$8 = air.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> uv.a("commands.function.scheduled.single", uv.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> uv.a("commands.function.scheduled.multiple", uy.b($$6.stream().map(hb::a).toList(), uv::a)), true);
            }

            air.a($$6, $$7, $$0, $$8, $$3, air.e, $$2);
         }
      }
   }
}
