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

public class ams {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<ee> b = ($$0, $$1) -> {
      alb $$2 = ((ee)$$0.getSource()).l().aF();
      ej.a($$2.e(), $$1, "#");
      return ej.a($$2.d(), $$1);
   };
   static final ams.b<ee> e = new ams.b<ee>() {
      public void a(ee $$0, akm $$1, int $$2) {
         $$0.a(() -> wx.a("commands.function.result", wx.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<ee> $$0) {
      LiteralArgumentBuilder<ee> $$1 = ef.a("with");

      for (apc.c $$2 : apc.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new ams.c() {
               @Override
               protected ud a(CommandContext<ee> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(ef.a("path", ew.a()).executes(new ams.c() {
               @Override
               protected ud a(CommandContext<ee> $$0) throws CommandSyntaxException {
                  return ams.a(ew.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ef.a("name", gm.a()).suggests(b).executes(new ams.c() {
               @Nullable
               @Override
               protected ud a(CommandContext<ee> $$0) {
                  return null;
               }
            })).then(ef.a("arguments", eo.a()).executes(new ams.c() {
               @Override
               protected ud a(CommandContext<ee> $$0) {
                  return eo.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static ud a(ew.g $$0, apb $$1) throws CommandSyntaxException {
      va $$2 = apc.a($$0, $$1);
      if ($$2 instanceof ud) {
         return (ud)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static ee a(ee $$0) {
      return $$0.a().b(2);
   }

   public static <T extends eg<T>> void a(Collection<hq<T>> $$0, @Nullable ud $$1, T $$2, T $$3, he<T> $$4, ams.b<T> $$5, gy $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends eg<T>> void a(@Nullable ud $$0, he<T> $$1, CommandDispatcher<T> $$2, T $$3, hq<T> $$4, akm $$5, eb $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hs<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new hk<>($$8, $$6, $$7).bind($$3));
      } catch (eh var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends eg<T>> eb a(T $$0, ams.b<T> $$1, akm $$2, eb $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends eg<T>> void a(Collection<hq<T>> $$0, @Nullable ud $$1, T $$2, T $$3, he<T> $$4, ams.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      eb $$8 = eb.chain($$2.p(), $$4.b().d());

      for (hq<T> $$9 : $$0) {
         akm $$10 = $$9.a();
         eb $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(hn.a());
   }

   private static <T extends eg<T>> void b(Collection<hq<T>> $$0, @Nullable ud $$1, T $$2, T $$3, he<T> $$4, ams.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      eb $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hq<T> $$9 = $$0.iterator().next();
            akm $$10 = $$9.a();
            eb $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == eb.a) {
            for (hq<T> $$12 : $$0) {
               akm $$13 = $$12.a();
               eb $$14 = a($$2, $$5, $$13, $$8);
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
            eb $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hq<T> $$17 : $$0) {
               akm $$18 = $$17.a();
               eb $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, akm var2, int var3);
   }

   abstract static class c extends ha.b<ee> implements ha.a<ee> {
      @Nullable
      protected abstract ud a(CommandContext<ee> var1) throws CommandSyntaxException;

      public void a(ee $$0, ContextChain<ee> $$1, gy $$2, he<ee> $$3) throws CommandSyntaxException {
         CommandContext<ee> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<akm, Collection<hq<ee>>> $$5 = gm.c($$4, "name");
         Collection<hq<ee>> $$6 = (Collection<hq<ee>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw ams.d.create(wx.a((akm)$$5.getFirst()));
         } else {
            ud $$7 = this.a($$4);
            ee $$8 = ams.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> wx.a("commands.function.scheduled.single", wx.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> wx.a("commands.function.scheduled.multiple", xa.b($$6.stream().map(hq::a).toList(), wx::a)), true);
            }

            ams.a($$6, $$7, $$0, $$8, $$3, ams.e, $$2);
         }
      }
   }
}
