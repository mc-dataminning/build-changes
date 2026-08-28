import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class eq {
   private static final ThreadLocal<ho<ep>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ep> h = new CommandDispatcher();

   public eq(eq.a $$0, el $$1) {
      amh.a(this.h);
      ami.a(this.h, $$1);
      anc.a(this.h, $$1);
      amm.a(this.h, $$1);
      amo.a(this.h, $$1);
      amp.a(this.h, $$1);
      amq.a(this.h, $$1);
      apr.a(this.h);
      amr.a(this.h);
      amt.a(this.h);
      amx.a(this.h);
      amy.a(this.h);
      amz.a(this.h, $$1);
      ana.a(this.h);
      anb.a(this.h, $$1);
      and.a(this.h);
      anf.a(this.h, $$1);
      ane.a(this.h, $$1);
      ang.a(this.h);
      anh.a(this.h);
      ani.a(this.h);
      anj.a(this.h);
      ank.a(this.h, $$1);
      anl.a(this.h);
      anm.a(this.h, $$1);
      ano.a(this.h);
      anp.a(this.h);
      anq.a(this.h);
      anr.a(this.h, $$1);
      ans.a(this.h, $$1);
      ant.a(this.h);
      anx.a(this.h, $$1);
      anz.a(this.h);
      aoa.a(this.h);
      aod.a(this.h);
      aof.a(this.h);
      aoe.a(this.h);
      aoh.a(this.h);
      aoi.a(this.h);
      aom.a(this.h);
      aon.a(this.h);
      aoo.a(this.h, $$1);
      aop.a(this.h, $$0 != eq.a.c);
      aor.a(this.h, $$1);
      aot.a(this.h);
      aou.a(this.h);
      aow.a(this.h);
      aox.a(this.h);
      aoz.a(this.h);
      apa.a(this.h, $$1);
      apb.a(this.h);
      apc.a(this.h, $$1);
      apd.a(this.h);
      ape.a(this.h);
      apf.a(this.h, $$1);
      apg.a(this.h);
      aph.a(this.h);
      api.a(this.h, $$1);
      apk.a(this.h);
      apm.a(this.h);
      apo.a(this.h);
      if (bnj.f.d()) {
         ann.a(this.h);
      }

      if (aa.aX) {
         uf.a(this.h);
         aog.a(this.h);
         aoc.a(this.h, $$1);
         amw.a(this.h);
         amv.a(this.h);
         apl.a(this.h);
         aov.a(this.h);
         aoq.a(this.h);
         if ($$0.e) {
            amu.a(this.h);
         }
      }

      if ($$0.e) {
         amj.a(this.h);
         amk.a(this.h);
         aml.a(this.h);
         ams.a(this.h);
         anu.a(this.h);
         anv.a(this.h);
         anw.a(this.h);
         any.a(this.h);
         aoj.a(this.h);
         aok.a(this.h);
         aol.a(this.h);
         aos.a(this.h);
         aoy.a(this.h);
         apj.a(this.h);
         apn.a(this.h);
      }

      if ($$0.d) {
         aob.a(this.h);
      }

      this.h.setConsumer(er.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ep $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ep> $$0, String $$1) {
      ep $$2 = (ep)$$0.getContext().getSource();
      $$2.l().aT().a(() -> "/" + $$1);
      ContextChain<ep> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> ho.a($$3x, $$1, $$3, $$2, em.a));
         }
      } catch (Exception var12) {
         xz $$5 = xl.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xl.c("command.failed").a($$1x -> $$1x.a(new xr(xr.a.a, $$5))));
         if (aa.aX) {
            $$2.b(xl.b(ac.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aT().c();
      }
   }

   @Nullable
   private static ContextChain<ep> a(ParseResults<ep> $$0, String $$1, ep $$2) {
      try {
         a($$0);
         return (ContextChain<ep>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xo.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xz $$5 = xl.i().a(n.h).a($$1x -> $$1x.a(new xj(xj.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(xk.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xl $$6 = xl.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(xl.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ep $$0, Consumer<ho<ep>> $$1) {
      MinecraftServer $$2 = $$0.l();
      ho<ep> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aM().c(dbp.x));
         int $$6 = $$2.aM().c(dbp.y);

         try (ho<ep> $$7 = new ho<>($$5, $$6, $$2.aT())) {
            f.set($$7);
            $$1.accept($$7);
            $$7.a();
         } finally {
            f.set(null);
         }
      } else {
         $$1.accept($$3);
      }
   }

   public void a(arc $$0) {
      Map<CommandNode<ep>, CommandNode<eu>> $$1 = Maps.newHashMap();
      RootCommandNode<eu> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dg(), $$1);
      $$0.c.b(new acx($$2));
   }

   private void a(CommandNode<ep> $$0, CommandNode<eu> $$1, ep $$2, Map<CommandNode<ep>, CommandNode<eu>> $$3) {
      for (CommandNode<ep> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<eu, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<eu, ?> $$6 = (RequiredArgumentBuilder<eu, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(io.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<eu> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ep> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ep, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(eq.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ep> a() {
      return this.h;
   }

   public static <S> void a(ParseResults<S> $$0) throws CommandSyntaxException {
      CommandSyntaxException $$1 = b($$0);
      if ($$1 != null) {
         throw $$1;
      }
   }

   @Nullable
   public static <S> CommandSyntaxException b(ParseResults<S> $$0) {
      if (!$$0.getReader().canRead()) {
         return null;
      } else if ($$0.getExceptions().size() == 1) {
         return (CommandSyntaxException)$$0.getExceptions().values().iterator().next();
      } else {
         return $$0.getContext().getRange().isEmpty()
            ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader())
            : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext($$0.getReader());
      }
   }

   public static el a(final jk.a $$0) {
      return new el() {
         @Override
         public Stream<ala<? extends jv<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jk.b<T>> a(ala<? extends jv<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jk.b.a<T> a(final jk.b<T> $$0x) {
            return new jk.b.a<T>() {
               @Override
               public jk.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jm.c<T>> a(axb<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jm.c<T> b(axb<T> $$0xx) {
                  Optional<jm.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jm.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      el $$0 = a(ph.a());
      CommandDispatcher<ep> $$1 = new eq(eq.a.a, $$0).a();
      RootCommandNode<ep> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = im.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !il.a($$0x.getClass())).collect(Collectors.toSet());
      if (!$$4.isEmpty()) {
         g.warn("Missing type registration for following arguments:\n {}", $$4.stream().map($$0x -> "\t" + $$0x).collect(Collectors.joining(",\n")));
         throw new IllegalStateException("Unregistered argument types");
      }
   }

   public static enum a {
      a(true, true),
      b(false, true),
      c(true, false);

      final boolean d;
      final boolean e;

      private a(final boolean $$0, final boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   public interface b {
      void parse(StringReader var1) throws CommandSyntaxException;
   }
}
