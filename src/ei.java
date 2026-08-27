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

public class ei {
   private static final ThreadLocal<hg<eh>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<eh> h = new CommandDispatcher();

   public ei(ei.a $$0, ed $$1) {
      alz.a(this.h);
      ama.a(this.h, $$1);
      amu.a(this.h, $$1);
      ame.a(this.h, $$1);
      amg.a(this.h, $$1);
      amh.a(this.h, $$1);
      ami.a(this.h, $$1);
      apj.a(this.h);
      amj.a(this.h);
      aml.a(this.h);
      amp.a(this.h);
      amq.a(this.h);
      amr.a(this.h, $$1);
      ams.a(this.h);
      amt.a(this.h, $$1);
      amv.a(this.h);
      amx.a(this.h, $$1);
      amw.a(this.h, $$1);
      amy.a(this.h);
      amz.a(this.h);
      ana.a(this.h);
      anb.a(this.h);
      anc.a(this.h, $$1);
      and.a(this.h);
      ane.a(this.h, $$1);
      ang.a(this.h);
      anh.a(this.h);
      ani.a(this.h);
      anj.a(this.h, $$1);
      ank.a(this.h, $$1);
      anl.a(this.h);
      anp.a(this.h, $$1);
      anr.a(this.h);
      ans.a(this.h);
      anv.a(this.h);
      anx.a(this.h);
      anw.a(this.h);
      anz.a(this.h);
      aoa.a(this.h);
      aoe.a(this.h);
      aof.a(this.h);
      aog.a(this.h, $$1);
      aoh.a(this.h, $$0 != ei.a.c);
      aoj.a(this.h, $$1);
      aol.a(this.h);
      aom.a(this.h);
      aoo.a(this.h);
      aop.a(this.h);
      aor.a(this.h);
      aos.a(this.h, $$1);
      aot.a(this.h);
      aou.a(this.h, $$1);
      aov.a(this.h);
      aow.a(this.h);
      aox.a(this.h, $$1);
      aoy.a(this.h);
      aoz.a(this.h);
      apa.a(this.h, $$1);
      apc.a(this.h);
      ape.a(this.h);
      apg.a(this.h);
      if (bmu.f.d()) {
         anf.a(this.h);
      }

      if (ab.aX) {
         ty.a(this.h);
         any.a(this.h);
         anu.a(this.h, $$1);
         amo.a(this.h);
         amn.a(this.h);
         apd.a(this.h);
         aon.a(this.h);
         aoi.a(this.h);
         if ($$0.e) {
            amm.a(this.h);
         }
      }

      if ($$0.e) {
         amb.a(this.h);
         amc.a(this.h);
         amd.a(this.h);
         amk.a(this.h);
         anm.a(this.h);
         ann.a(this.h);
         ano.a(this.h);
         anq.a(this.h);
         aob.a(this.h);
         aoc.a(this.h);
         aod.a(this.h);
         aok.a(this.h);
         aoq.a(this.h);
         apb.a(this.h);
         apf.a(this.h);
      }

      if ($$0.d) {
         ant.a(this.h);
      }

      this.h.setConsumer(ej.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(eh $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<eh> $$0, String $$1) {
      eh $$2 = (eh)$$0.getContext().getSource();
      $$2.l().aT().a(() -> "/" + $$1);
      ContextChain<eh> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hg.a($$3x, $$1, $$3, $$2, ee.a));
         }
      } catch (Exception var12) {
         xs $$5 = xe.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xe.c("command.failed").a($$1x -> $$1x.a(new xk(xk.a.a, $$5))));
         if (ab.aX) {
            $$2.b(xe.b(ad.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aT().c();
      }
   }

   @Nullable
   private static ContextChain<eh> a(ParseResults<eh> $$0, String $$1, eh $$2) {
      try {
         a($$0);
         return (ContextChain<eh>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xh.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xs $$5 = xe.i().a(n.h).a($$1x -> $$1x.a(new xc(xc.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.a(xd.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xe $$6 = xe.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.a($$6);
            }

            $$5.a(xe.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(eh $$0, Consumer<hg<eh>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hg<eh> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aM().c(dbw.x));
         int $$6 = $$2.aM().c(dbw.y);

         try (hg<eh> $$7 = new hg<>($$5, $$6, $$2.aT())) {
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

   public void a(aqu $$0) {
      Map<CommandNode<eh>, CommandNode<em>> $$1 = Maps.newHashMap();
      RootCommandNode<em> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dl(), $$1);
      $$0.d.b(new acq($$2));
   }

   private void a(CommandNode<eh> $$0, CommandNode<em> $$1, eh $$2, Map<CommandNode<eh>, CommandNode<em>> $$3) {
      for (CommandNode<eh> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<em, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<em, ?> $$6 = (RequiredArgumentBuilder<em, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(ig.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<em> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<eh> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<eh, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ei.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<eh> a() {
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

   public static ed a(final jc.a $$0) {
      return new ed() {
         @Override
         public Stream<aks<? extends jn<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<jc.b<T>> a(aks<? extends jn<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jc.b.a<T> a(final jc.b<T> $$0x) {
            return new jc.b.a<T>() {
               @Override
               public jc.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<je.c<T>> a(awt<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public je.c<T> b(awt<T> $$0xx) {
                  Optional<je.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> je.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      ed $$0 = a(oy.a());
      CommandDispatcher<eh> $$1 = new ei(ei.a.a, $$0).a();
      RootCommandNode<eh> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = id.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !ic.a($$0x.getClass())).collect(Collectors.toSet());
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

      private a(boolean $$0, boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   public interface b {
      void parse(StringReader var1) throws CommandSyntaxException;
   }
}
