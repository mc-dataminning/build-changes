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

public class ed {
   private static final ThreadLocal<hb<ec>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ec> h = new CommandDispatcher();

   public ed(ed.a $$0, dy $$1) {
      alk.a(this.h);
      all.a(this.h, $$1);
      amf.a(this.h, $$1);
      alp.a(this.h, $$1);
      alr.a(this.h, $$1);
      als.a(this.h, $$1);
      alt.a(this.h, $$1);
      aou.a(this.h);
      alu.a(this.h);
      alw.a(this.h);
      ama.a(this.h);
      amb.a(this.h);
      amc.a(this.h, $$1);
      amd.a(this.h);
      ame.a(this.h, $$1);
      amg.a(this.h);
      ami.a(this.h, $$1);
      amh.a(this.h, $$1);
      amj.a(this.h);
      amk.a(this.h);
      aml.a(this.h);
      amm.a(this.h);
      amn.a(this.h, $$1);
      amo.a(this.h);
      amp.a(this.h, $$1);
      amr.a(this.h);
      ams.a(this.h);
      amt.a(this.h);
      amu.a(this.h, $$1);
      amv.a(this.h, $$1);
      amw.a(this.h);
      ana.a(this.h, $$1);
      anc.a(this.h);
      and.a(this.h);
      ang.a(this.h);
      ani.a(this.h);
      anh.a(this.h);
      ank.a(this.h);
      anl.a(this.h);
      anp.a(this.h);
      anq.a(this.h);
      anr.a(this.h, $$1);
      ans.a(this.h, $$0 != ed.a.c);
      anu.a(this.h, $$1);
      anw.a(this.h);
      anx.a(this.h);
      anz.a(this.h);
      aoa.a(this.h);
      aoc.a(this.h);
      aod.a(this.h, $$1);
      aoe.a(this.h);
      aof.a(this.h, $$1);
      aog.a(this.h);
      aoh.a(this.h);
      aoi.a(this.h, $$1);
      aoj.a(this.h);
      aok.a(this.h);
      aol.a(this.h, $$1);
      aon.a(this.h);
      aop.a(this.h);
      aor.a(this.h);
      if (blk.f.d()) {
         amq.a(this.h);
      }

      if (aa.aX) {
         tm.a(this.h);
         anj.a(this.h);
         anf.a(this.h, $$1);
         alz.a(this.h);
         aly.a(this.h);
         aoo.a(this.h);
         any.a(this.h);
         ant.a(this.h);
         if ($$0.e) {
            alx.a(this.h);
         }
      }

      if ($$0.e) {
         alm.a(this.h);
         aln.a(this.h);
         alo.a(this.h);
         alv.a(this.h);
         amx.a(this.h);
         amy.a(this.h);
         amz.a(this.h);
         anb.a(this.h);
         anm.a(this.h);
         ann.a(this.h);
         ano.a(this.h);
         anv.a(this.h);
         aob.a(this.h);
         aom.a(this.h);
         aoq.a(this.h);
      }

      if ($$0.d) {
         ane.a(this.h);
      }

      this.h.setConsumer(ee.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ec $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ec> $$0, String $$1) {
      ec $$2 = (ec)$$0.getContext().getSource();
      $$2.l().aU().a(() -> "/" + $$1);
      ContextChain<ec> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hb.a($$3x, $$1, $$3, $$2, dz.a));
         }
      } catch (Exception var12) {
         xg $$5 = ws.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(ws.c("command.failed").a($$1x -> $$1x.a(new wy(wy.a.a, $$5))));
         if (aa.aX) {
            $$2.b(ws.b(ac.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aU().c();
      }
   }

   @Nullable
   private static ContextChain<ec> a(ParseResults<ec> $$0, String $$1, ec $$2) {
      try {
         a($$0);
         return (ContextChain<ec>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(wv.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xg $$5 = ws.i().a(n.h).a($$1x -> $$1x.a(new wq(wq.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(wr.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               ws $$6 = ws.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(ws.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ec $$0, Consumer<hb<ec>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hb<ec> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aN().c(czq.x));
         int $$6 = $$2.aN().c(czq.y);

         try (hb<ec> $$7 = new hb<>($$5, $$6, $$2.aU())) {
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

   public void a(aqf $$0) {
      Map<CommandNode<ec>, CommandNode<eh>> $$1 = Maps.newHashMap();
      RootCommandNode<eh> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.de(), $$1);
      $$0.d.b(new acd($$2));
   }

   private void a(CommandNode<ec> $$0, CommandNode<eh> $$1, ec $$2, Map<CommandNode<ec>, CommandNode<eh>> $$3) {
      for (CommandNode<ec> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<eh, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<eh, ?> $$6 = (RequiredArgumentBuilder<eh, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(ia.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<eh> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ec> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ec, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ed.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ec> a() {
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

   public static dy a(final ix.a $$0) {
      return new dy() {
         @Override
         public Stream<ake<? extends ji<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<ix.b<T>> a(ake<? extends ji<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> ix.b.a<T> a(final ix.b<T> $$0x) {
            return new ix.b.a<T>() {
               @Override
               public ix.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<iz.c<T>> a(awd<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public iz.c<T> b(awd<T> $$0xx) {
                  Optional<iz.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> iz.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dy $$0 = a(os.a());
      CommandDispatcher<ec> $$1 = new ed(ed.a.a, $$0).a();
      RootCommandNode<ec> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hy.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !hx.a($$0x.getClass())).collect(Collectors.toSet());
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
