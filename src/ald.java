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

public class ald {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> vq.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> vq.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vq.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<du> b = ($$0, $$1) -> {
      ajm $$2 = ((du)$$0.getSource()).l().aC();
      dz.a($$2.e(), $$1, "#");
      return dz.a($$2.d(), $$1);
   };
   static final ald.b<du> e = new ald.b<du>() {
      public void a(du $$0, aiy $$1, int $$2) {
         $$0.a(() -> vq.a("commands.function.result", vq.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("with");

      for (anm.c $$2 : anm.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new ald.c() {
               @Override
               protected sw a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dv.a("path", em.a()).executes(new ald.c() {
               @Override
               protected sw a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return ald.a(em.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("name", fz.a()).suggests(b).executes(new ald.c() {
               @Nullable
               @Override
               protected sw a(CommandContext<du> $$0) {
                  return null;
               }
            })).then(dv.a("arguments", ee.a()).executes(new ald.c() {
               @Override
               protected sw a(CommandContext<du> $$0) {
                  return ee.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static sw a(em.g $$0, anl $$1) throws CommandSyntaxException {
      tt $$2 = anm.a($$0, $$1);
      if ($$2 instanceof sw) {
         return (sw)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static du a(du $$0) {
      return $$0.a().b(2);
   }

   public static <T extends dw<T>> void a(Collection<hd<T>> $$0, @Nullable sw $$1, T $$2, T $$3, gr<T> $$4, ald.b<T> $$5, gl $$6) throws CommandSyntaxException {
      if ($$6.c()) {
         a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         b($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static <T extends dw<T>> void a(@Nullable sw $$0, gr<T> $$1, CommandDispatcher<T> $$2, T $$3, hd<T> $$4, aiy $$5, dr $$6, boolean $$7) throws CommandSyntaxException {
      try {
         hf<T> $$8 = $$4.a($$0, $$2);
         $$1.a(new gx<>($$8, $$6, $$7).bind($$3));
      } catch (dx var9) {
         throw a.create($$5, var9.a());
      }
   }

   private static <T extends dw<T>> dr a(T $$0, ald.b<T> $$1, aiy $$2, dr $$3) {
      return $$0.y() ? $$3 : ($$4, $$5) -> {
         $$1.a($$0, $$2, $$5);
         $$3.onResult($$4, $$5);
      };
   }

   private static <T extends dw<T>> void a(Collection<hd<T>> $$0, @Nullable sw $$1, T $$2, T $$3, gr<T> $$4, ald.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dr $$8 = dr.chain($$2.p(), $$4.b().d());

      for (hd<T> $$9 : $$0) {
         aiy $$10 = $$9.a();
         dr $$11 = a($$2, $$5, $$10, $$8);
         a($$1, $$4, $$6, $$7, $$9, $$10, $$11, true);
      }

      $$4.a(ha.a());
   }

   private static <T extends dw<T>> void b(Collection<hd<T>> $$0, @Nullable sw $$1, T $$2, T $$3, gr<T> $$4, ald.b<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      T $$7 = $$3.a_();
      dr $$8 = $$2.p();
      if (!$$0.isEmpty()) {
         if ($$0.size() == 1) {
            hd<T> $$9 = $$0.iterator().next();
            aiy $$10 = $$9.a();
            dr $$11 = a($$2, $$5, $$10, $$8);
            a($$1, $$4, $$6, $$7, $$9, $$10, $$11, false);
         } else if ($$8 == dr.a) {
            for (hd<T> $$12 : $$0) {
               aiy $$13 = $$12.a();
               dr $$14 = a($$2, $$5, $$13, $$8);
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
            dr $$16 = ($$1x, $$2x) -> $$15.a($$2x);

            for (hd<T> $$17 : $$0) {
               aiy $$18 = $$17.a();
               dr $$19 = a($$2, $$5, $$18, $$16);
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
      void a(T var1, aiy var2, int var3);
   }

   abstract static class c extends gn.b<du> implements gn.a<du> {
      @Nullable
      protected abstract sw a(CommandContext<du> var1) throws CommandSyntaxException;

      public void a(du $$0, ContextChain<du> $$1, gl $$2, gr<du> $$3) throws CommandSyntaxException {
         CommandContext<du> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<aiy, Collection<hd<du>>> $$5 = fz.c($$4, "name");
         Collection<hd<du>> $$6 = (Collection<hd<du>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw ald.d.create(vq.a((aiy)$$5.getFirst()));
         } else {
            sw $$7 = this.a($$4);
            du $$8 = ald.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> vq.a("commands.function.scheduled.single", vq.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> vq.a("commands.function.scheduled.multiple", vt.b($$6.stream().map(hd::a).toList(), vq::a)), true);
            }

            ald.a($$6, $$7, $$0, $$8, $$3, ald.e, $$2);
         }
      }
   }
}
