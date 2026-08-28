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

public class ew {
   private static final ThreadLocal<hv<ev>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ev> h = new CommandDispatcher();

   public ew(ew.a $$0, er $$1) {
      amp.a(this.h);
      amq.a(this.h, $$1);
      ank.a(this.h, $$1);
      amu.a(this.h, $$1);
      amw.a(this.h, $$1);
      amx.a(this.h, $$1);
      amy.a(this.h, $$1);
      apy.a(this.h);
      amz.a(this.h);
      anb.a(this.h);
      anf.a(this.h);
      ang.a(this.h);
      anh.a(this.h, $$1);
      ani.a(this.h);
      anj.a(this.h, $$1);
      anl.a(this.h);
      ann.a(this.h, $$1);
      anm.a(this.h, $$1);
      ano.a(this.h);
      anp.a(this.h);
      anq.a(this.h);
      anr.a(this.h);
      ans.a(this.h, $$1);
      ant.a(this.h);
      anu.a(this.h, $$1);
      anw.a(this.h);
      anx.a(this.h);
      any.a(this.h);
      anz.a(this.h, $$1);
      aoa.a(this.h, $$1);
      aob.a(this.h);
      aof.a(this.h, $$1);
      aoh.a(this.h);
      aoi.a(this.h);
      aol.a(this.h);
      aon.a(this.h);
      aom.a(this.h);
      aoo.a(this.h);
      aop.a(this.h);
      aot.a(this.h);
      aou.a(this.h);
      aov.a(this.h, $$1);
      aow.a(this.h, $$0 != ew.a.c);
      aoy.a(this.h, $$1);
      apa.a(this.h);
      apb.a(this.h);
      apd.a(this.h);
      ape.a(this.h);
      apg.a(this.h);
      aph.a(this.h, $$1);
      api.a(this.h);
      apj.a(this.h, $$1);
      apk.a(this.h);
      apl.a(this.h);
      apm.a(this.h, $$1);
      apn.a(this.h);
      apo.a(this.h);
      app.a(this.h, $$1);
      apr.a(this.h);
      apt.a(this.h);
      apv.a(this.h);
      if (boq.f.d()) {
         anv.a(this.h);
      }

      if (ab.aW) {
         tw.a(this.h);
         aok.a(this.h, $$1);
         ane.a(this.h);
         and.a(this.h);
         aps.a(this.h);
         apc.a(this.h);
         aox.a(this.h);
         if ($$0.e) {
            anc.a(this.h);
         }
      }

      if ($$0.e) {
         amr.a(this.h);
         ams.a(this.h);
         amt.a(this.h);
         ana.a(this.h);
         aoc.a(this.h);
         aod.a(this.h);
         aoe.a(this.h);
         aog.a(this.h);
         aoq.a(this.h);
         aor.a(this.h);
         aos.a(this.h);
         aoz.a(this.h);
         apf.a(this.h);
         apq.a(this.h);
         apu.a(this.h);
      }

      if ($$0.d) {
         aoj.a(this.h);
      }

      this.h.setConsumer(ex.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ev $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ev> $$0, String $$1) {
      ev $$2 = (ev)$$0.getContext().getSource();
      $$2.l().aS().a(() -> "/" + $$1);
      ContextChain<ev> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hv.a($$3x, $$1, $$3, $$2, es.a));
         }
      } catch (Exception var12) {
         xv $$5 = xh.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xh.c("command.failed").a($$1x -> $$1x.a(new xn(xn.a.a, $$5))));
         if (ab.aW) {
            $$2.b(xh.b(ad.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aS().c();
      }
   }

   @Nullable
   private static ContextChain<ev> a(ParseResults<ev> $$0, String $$1, ev $$2) {
      try {
         a($$0);
         return (ContextChain<ev>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xk.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xv $$5 = xh.i().a(n.h).a($$1x -> $$1x.a(new xf(xf.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(xg.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xh $$6 = xh.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(xh.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ev $$0, Consumer<hv<ev>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hv<ev> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().c(der.x));
         int $$6 = $$2.aL().c(der.y);

         try (hv<ev> $$7 = new hv<>($$5, $$6, $$2.aS())) {
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

   public void a(arn $$0) {
      Map<CommandNode<ev>, CommandNode<fa>> $$1 = Maps.newHashMap();
      RootCommandNode<fa> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dp(), $$1);
      $$0.d.b(new acw($$2));
   }

   private void a(CommandNode<ev> $$0, CommandNode<fa> $$1, ev $$2, Map<CommandNode<ev>, CommandNode<fa>> $$3) {
      for (CommandNode<ev> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<fa, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<fa, ?> $$6 = (RequiredArgumentBuilder<fa, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(iv.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<fa> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ev> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ev, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ew.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ev> a() {
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

   public static er a(final jr.a $$0) {
      return new er() {
         @Override
         public Stream<alg<? extends kc<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jr.b<T>> a(alg<? extends kc<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jr.b.a<T> a(final jr.b<T> $$0x) {
            return new jr.b.a<T>() {
               @Override
               public jr.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jt.c<T>> a(axp<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jt.c<T> b(axp<T> $$0xx) {
                  Optional<jt.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jt.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      er $$0 = a(pk.a());
      CommandDispatcher<ev> $$1 = new ew(ew.a.a, $$0).a();
      RootCommandNode<ev> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = it.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !is.a($$0x.getClass())).collect(Collectors.toSet());
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
