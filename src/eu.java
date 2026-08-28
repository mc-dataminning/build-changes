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

public class eu {
   private static final ThreadLocal<hs<et>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<et> h = new CommandDispatcher();

   public eu(eu.a $$0, ep $$1) {
      aly.a(this.h);
      alz.a(this.h, $$1);
      amt.a(this.h, $$1);
      amd.a(this.h, $$1);
      amf.a(this.h, $$1);
      amg.a(this.h, $$1);
      amh.a(this.h, $$1);
      aph.a(this.h);
      ami.a(this.h);
      amk.a(this.h);
      amo.a(this.h);
      amp.a(this.h);
      amq.a(this.h, $$1);
      amr.a(this.h);
      ams.a(this.h, $$1);
      amu.a(this.h);
      amw.a(this.h, $$1);
      amv.a(this.h, $$1);
      amx.a(this.h);
      amy.a(this.h);
      amz.a(this.h);
      ana.a(this.h);
      anb.a(this.h, $$1);
      anc.a(this.h);
      and.a(this.h, $$1);
      anf.a(this.h);
      ang.a(this.h);
      anh.a(this.h);
      ani.a(this.h, $$1);
      anj.a(this.h, $$1);
      ank.a(this.h);
      ano.a(this.h, $$1);
      anq.a(this.h);
      anr.a(this.h);
      anu.a(this.h);
      anw.a(this.h);
      anv.a(this.h);
      anx.a(this.h);
      any.a(this.h);
      aoc.a(this.h);
      aod.a(this.h);
      aoe.a(this.h, $$1);
      aof.a(this.h, $$0 != eu.a.c);
      aoh.a(this.h, $$1);
      aoj.a(this.h);
      aok.a(this.h);
      aom.a(this.h);
      aon.a(this.h);
      aop.a(this.h);
      aoq.a(this.h, $$1);
      aor.a(this.h);
      aos.a(this.h, $$1);
      aot.a(this.h);
      aou.a(this.h);
      aov.a(this.h, $$1);
      aow.a(this.h);
      aox.a(this.h);
      aoy.a(this.h, $$1);
      apa.a(this.h);
      apc.a(this.h);
      ape.a(this.h);
      if (bnl.f.d()) {
         ane.a(this.h);
      }

      if (ab.aV) {
         tp.a(this.h);
         ant.a(this.h, $$1);
         amn.a(this.h);
         amm.a(this.h);
         apb.a(this.h);
         aol.a(this.h);
         aog.a(this.h);
         if ($$0.e) {
            aml.a(this.h);
         }
      }

      if ($$0.e) {
         ama.a(this.h);
         amb.a(this.h);
         amc.a(this.h);
         amj.a(this.h);
         anl.a(this.h);
         anm.a(this.h);
         ann.a(this.h);
         anp.a(this.h);
         anz.a(this.h);
         aoa.a(this.h);
         aob.a(this.h);
         aoi.a(this.h);
         aoo.a(this.h);
         aoz.a(this.h);
         apd.a(this.h);
      }

      if ($$0.d) {
         ans.a(this.h);
      }

      this.h.setConsumer(ev.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(et $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<et> $$0, String $$1) {
      et $$2 = (et)$$0.getContext().getSource();
      $$2.l().aT().a(() -> "/" + $$1);
      ContextChain<et> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hs.a($$3x, $$1, $$3, $$2, eq.a));
         }
      } catch (Exception var12) {
         xn $$5 = wz.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(wz.c("command.failed").a($$1x -> $$1x.a(new xf(xf.a.a, $$5))));
         if (ab.aV) {
            $$2.b(wz.b(ad.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aT().c();
      }
   }

   @Nullable
   private static ContextChain<et> a(ParseResults<et> $$0, String $$1, et $$2) {
      try {
         a($$0);
         return (ContextChain<et>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xc.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xn $$5 = wz.i().a(n.h).a($$1x -> $$1x.a(new wx(wx.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(wy.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               wz $$6 = wz.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(wz.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(et $$0, Consumer<hs<et>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hs<et> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aM().c(dcs.x));
         int $$6 = $$2.aM().c(dcs.y);

         try (hs<et> $$7 = new hs<>($$5, $$6, $$2.aT())) {
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

   public void a(aqv $$0) {
      Map<CommandNode<et>, CommandNode<ey>> $$1 = Maps.newHashMap();
      RootCommandNode<ey> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dg(), $$1);
      $$0.c.b(new acn($$2));
   }

   private void a(CommandNode<et> $$0, CommandNode<ey> $$1, et $$2, Map<CommandNode<et>, CommandNode<ey>> $$3) {
      for (CommandNode<et> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<ey, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<ey, ?> $$6 = (RequiredArgumentBuilder<ey, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(is.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<ey> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<et> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<et, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(eu.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<et> a() {
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

   public static ep a(final jo.a $$0) {
      return new ep() {
         @Override
         public Stream<akq<? extends jz<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jo.b<T>> a(akq<? extends jz<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jo.b.a<T> a(final jo.b<T> $$0x) {
            return new jo.b.a<T>() {
               @Override
               public jo.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jq.c<T>> a(awu<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jq.c<T> b(awu<T> $$0xx) {
                  Optional<jq.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jq.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      ep $$0 = a(pd.a());
      CommandDispatcher<et> $$1 = new eu(eu.a.a, $$0).a();
      RootCommandNode<et> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = iq.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !ip.a($$0x.getClass())).collect(Collectors.toSet());
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
