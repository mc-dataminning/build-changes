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

public class ey {
   private static final ThreadLocal<hx<ex>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ex> h = new CommandDispatcher();

   public ey(ey.a $$0, et $$1) {
      amc.a(this.h);
      amd.a(this.h, $$1);
      amx.a(this.h, $$1);
      amh.a(this.h, $$1);
      amj.a(this.h, $$1);
      amk.a(this.h, $$1);
      aml.a(this.h, $$1);
      apn.a(this.h);
      amm.a(this.h);
      amo.a(this.h);
      ams.a(this.h);
      amt.a(this.h);
      amu.a(this.h, $$1);
      amv.a(this.h);
      amw.a(this.h, $$1);
      amy.a(this.h);
      ana.a(this.h, $$1);
      amz.a(this.h, $$1);
      anb.a(this.h);
      anc.a(this.h);
      and.a(this.h);
      ane.a(this.h, $$1);
      anf.a(this.h, $$1);
      ang.a(this.h);
      anh.a(this.h, $$1);
      anj.a(this.h);
      ank.a(this.h);
      anl.a(this.h);
      anm.a(this.h, $$1);
      ano.a(this.h, $$1);
      anp.a(this.h);
      ant.a(this.h, $$1);
      anv.a(this.h);
      anw.a(this.h);
      anz.a(this.h);
      aob.a(this.h);
      aoa.a(this.h);
      aoc.a(this.h);
      aod.a(this.h);
      aoe.a(this.h);
      aoi.a(this.h);
      aoj.a(this.h);
      aok.a(this.h, $$1);
      aol.a(this.h, $$0 != ey.a.c);
      aon.a(this.h, $$1);
      aop.a(this.h);
      aoq.a(this.h);
      aos.a(this.h);
      aot.a(this.h);
      aov.a(this.h);
      aow.a(this.h, $$1);
      aox.a(this.h);
      aoy.a(this.h, $$1);
      aoz.a(this.h);
      apa.a(this.h);
      apb.a(this.h, $$1);
      apc.a(this.h);
      apd.a(this.h);
      ape.a(this.h, $$1);
      apg.a(this.h);
      api.a(this.h);
      apk.a(this.h);
      if (bpa.f.d()) {
         ani.a(this.h);
      }

      if (ab.aU) {
         td.a(this.h);
         any.a(this.h, $$1);
         amr.a(this.h);
         amq.a(this.h);
         aph.a(this.h);
         aor.a(this.h);
         aom.a(this.h);
         if ($$0.e) {
            amp.a(this.h);
         }
      }

      if ($$0.e) {
         ame.a(this.h);
         amf.a(this.h);
         amg.a(this.h);
         amn.a(this.h);
         anq.a(this.h);
         anr.a(this.h);
         ans.a(this.h);
         anu.a(this.h);
         aof.a(this.h);
         aog.a(this.h);
         aoh.a(this.h);
         aoo.a(this.h);
         aou.a(this.h);
         apf.a(this.h);
         apj.a(this.h);
      }

      if ($$0.d) {
         anx.a(this.h);
      }

      this.h.setConsumer(ez.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ex $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ex> $$0, String $$1) {
      ex $$2 = (ex)$$0.getContext().getSource();
      bor.a().a(() -> "/" + $$1);
      ContextChain<ex> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hx.a($$3x, $$1, $$3, $$2, eu.a));
         }
      } catch (Exception var12) {
         xc $$5 = wo.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(wo.c("command.failed").a($$1x -> $$1x.a(new wu(wu.a.a, $$5))));
         if (ab.aU) {
            $$2.b(wo.b(af.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         bor.a().c();
      }
   }

   @Nullable
   private static ContextChain<ex> a(ParseResults<ex> $$0, String $$1, ex $$2) {
      try {
         a($$0);
         return (ContextChain<ex>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(wr.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xc $$5 = wo.i().a(n.h).a($$1x -> $$1x.a(new wm(wm.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(wn.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               wo $$6 = wo.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(wo.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ex $$0, Consumer<hx<ex>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hx<ex> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().c(dge.y));
         int $$6 = $$2.aL().c(dge.z);

         try (hx<ex> $$7 = new hx<>($$5, $$6, bor.a())) {
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

   public void a(ard $$0) {
      Map<CommandNode<ex>, CommandNode<fc>> $$1 = Maps.newHashMap();
      RootCommandNode<fc> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.A(), $$1);
      $$0.f.b(new acd($$2));
   }

   private void a(CommandNode<ex> $$0, CommandNode<fc> $$1, ex $$2, Map<CommandNode<ex>, CommandNode<fc>> $$3) {
      for (CommandNode<ex> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<fc, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<fc, ?> $$6 = (RequiredArgumentBuilder<fc, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(ix.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<fc> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ex> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ex, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ey.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ex> a() {
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

   public static et a(final jt.a $$0) {
      return new et() {
         @Override
         public crt a() {
            return crv.e.a();
         }

         @Override
         public Stream<akt<? extends ke<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jt.b<T>> a(akt<? extends ke<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jt.b.a<T> a(final jt.b<T> $$0x) {
            return new jt.b.a<T>() {
               @Override
               public jt.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jv.c<T>> a(axf<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jv.c<T> b(axf<T> $$0xx) {
                  Optional<jv.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jv.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      et $$0 = a(or.a());
      CommandDispatcher<ex> $$1 = new ey(ey.a.a, $$0).a();
      RootCommandNode<ex> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = iv.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !iu.a($$0x.getClass())).collect(Collectors.toSet());
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
