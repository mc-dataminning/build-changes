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
import org.apache.commons.lang3.mutable.MutableInt;

public class ain {
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> ur.b("commands.function.error.argument_not_compound", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> ur.b("commands.function.scheduled.no_functions", $$0));
   @VisibleForTesting
   public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("commands.function.instantiationFailure", $$0, $$1));
   public static final SuggestionProvider<du> b = ($$0, $$1) -> {
      agw $$2 = ((du)$$0.getSource()).m().aC();
      dy.a($$2.e(), $$1, "#");
      return dy.a($$2.d(), $$1);
   };
   static final ain.a<du> e = new ain.a<du>() {
      public void a(du $$0, agi $$1, int $$2) {
         $$0.a(() -> ur.a("commands.function.result", ur.a($$1), $$2), true);
      }
   };

   public static void a(CommandDispatcher<du> $$0) {
      LiteralArgumentBuilder<du> $$1 = dv.a("with");

      for (akv.c $$2 : akv.c) {
         $$2.a($$1, $$1x -> $$1x.executes(new ain.b() {
               @Override
               protected rz a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return $$2.a($$0).a();
               }
            }).then(dv.a("path", el.a()).executes(new ain.b() {
               @Override
               protected rz a(CommandContext<du> $$0) throws CommandSyntaxException {
                  return ain.a(el.a($$0, "path"), $$2.a($$0));
               }
            })));
      }

      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("function").requires($$0x -> $$0x.c(2)))
            .then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)dv.a("name", fx.a()).suggests(b).executes(new ain.b() {
               @Nullable
               @Override
               protected rz a(CommandContext<du> $$0) {
                  return null;
               }
            })).then(dv.a("arguments", ed.a()).executes(new ain.b() {
               @Override
               protected rz a(CommandContext<du> $$0) {
                  return ed.a($$0, "arguments");
               }
            }))).then($$1))
      );
   }

   static rz a(el.g $$0, aku $$1) throws CommandSyntaxException {
      sw $$2 = akv.a($$0, $$1);
      if ($$2 instanceof rz) {
         return (rz)$$2;
      } else {
         throw c.create($$2.c().a());
      }
   }

   public static du a(du $$0) {
      return $$0.b().b(2);
   }

   public static <T extends dw<T>> void a(Collection<gx<T>> $$0, @Nullable rz $$1, T $$2, T $$3, go<T> $$4, ain.a<T> $$5) throws CommandSyntaxException {
      CommandDispatcher<T> $$6 = $$2.x();
      MutableInt $$7 = new MutableInt();

      for (gx<T> $$8 : $$0) {
         agi $$9 = $$8.a();

         try {
            T $$10 = $$3.y().b($$4x -> {
               int $$5x = $$7.addAndGet($$4x);
               $$5.a($$2, $$9, $$5x);
               $$2.a(true, $$5x);
            });
            gz<T> $$11 = $$8.a($$1, $$6, $$10);
            $$4.a(new gt<>($$11).bind($$10));
         } catch (dx var13) {
            throw a.create($$9, var13.a());
         }
      }
   }

   public interface a<T> {
      void a(T var1, agi var2, int var3);
   }

   abstract static class b extends gk.b<du> implements gk.a<du> {
      @Nullable
      protected abstract rz a(CommandContext<du> var1) throws CommandSyntaxException;

      public void a(du $$0, ContextChain<du> $$1, boolean $$2, go<du> $$3) throws CommandSyntaxException {
         CommandContext<du> $$4 = $$1.getTopContext().copyFor($$0);
         Pair<agi, Collection<gx<du>>> $$5 = fx.b($$4, "name").mapSecond($$0x -> (Collection)$$0x.map(Collections::singleton, Function.identity()));
         Collection<gx<du>> $$6 = (Collection<gx<du>>)$$5.getSecond();
         if ($$6.isEmpty()) {
            throw ain.d.create(ur.a((agi)$$5.getFirst()));
         } else {
            rz $$7 = this.a($$4);
            du $$8 = ain.a($$0);
            if ($$6.size() == 1) {
               $$0.a(() -> ur.a("commands.function.scheduled.single", ur.a($$6.iterator().next().a())), true);
            } else {
               $$0.a(() -> ur.a("commands.function.scheduled.multiple", uu.b($$6.stream().map(gx::a).toList(), ur::a)), true);
            }

            ain.a($$6, $$7, $$0, $$8, $$3, ain.e);
         }
      }
   }
}
