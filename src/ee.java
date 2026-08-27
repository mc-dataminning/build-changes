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

public class ee {
   private static final ThreadLocal<hc<ed>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ed> h = new CommandDispatcher();

   public ee(ee.a $$0, dz $$1) {
      aln.a(this.h);
      alo.a(this.h, $$1);
      ami.a(this.h, $$1);
      als.a(this.h, $$1);
      alu.a(this.h, $$1);
      alv.a(this.h, $$1);
      alw.a(this.h, $$1);
      aox.a(this.h);
      alx.a(this.h);
      alz.a(this.h);
      amd.a(this.h);
      ame.a(this.h);
      amf.a(this.h, $$1);
      amg.a(this.h);
      amh.a(this.h, $$1);
      amj.a(this.h);
      aml.a(this.h, $$1);
      amk.a(this.h, $$1);
      amm.a(this.h);
      amn.a(this.h);
      amo.a(this.h);
      amp.a(this.h);
      amq.a(this.h, $$1);
      amr.a(this.h);
      ams.a(this.h, $$1);
      amu.a(this.h);
      amv.a(this.h);
      amw.a(this.h);
      amx.a(this.h, $$1);
      amy.a(this.h, $$1);
      amz.a(this.h);
      and.a(this.h, $$1);
      anf.a(this.h);
      ang.a(this.h);
      anj.a(this.h);
      anl.a(this.h);
      ank.a(this.h);
      ann.a(this.h);
      ano.a(this.h);
      ans.a(this.h);
      ant.a(this.h);
      anu.a(this.h, $$1);
      anv.a(this.h, $$0 != ee.a.c);
      anx.a(this.h, $$1);
      anz.a(this.h);
      aoa.a(this.h);
      aoc.a(this.h);
      aod.a(this.h);
      aof.a(this.h);
      aog.a(this.h, $$1);
      aoh.a(this.h);
      aoi.a(this.h, $$1);
      aoj.a(this.h);
      aok.a(this.h);
      aol.a(this.h, $$1);
      aom.a(this.h);
      aon.a(this.h);
      aoo.a(this.h, $$1);
      aoq.a(this.h);
      aos.a(this.h);
      aou.a(this.h);
      if (bmg.f.d()) {
         amt.a(this.h);
      }

      if (aa.aX) {
         to.a(this.h);
         anm.a(this.h);
         ani.a(this.h, $$1);
         amc.a(this.h);
         amb.a(this.h);
         aor.a(this.h);
         aob.a(this.h);
         anw.a(this.h);
         if ($$0.e) {
            ama.a(this.h);
         }
      }

      if ($$0.e) {
         alp.a(this.h);
         alq.a(this.h);
         alr.a(this.h);
         aly.a(this.h);
         ana.a(this.h);
         anb.a(this.h);
         anc.a(this.h);
         ane.a(this.h);
         anp.a(this.h);
         anq.a(this.h);
         anr.a(this.h);
         any.a(this.h);
         aoe.a(this.h);
         aop.a(this.h);
         aot.a(this.h);
      }

      if ($$0.d) {
         anh.a(this.h);
      }

      this.h.setConsumer(ef.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ed $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ed> $$0, String $$1) {
      ed $$2 = (ed)$$0.getContext().getSource();
      $$2.l().aT().a(() -> "/" + $$1);
      ContextChain<ed> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hc.a($$3x, $$1, $$3, $$2, ea.a));
         }
      } catch (Exception var12) {
         xi $$5 = wu.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(wu.c("command.failed").a($$1x -> $$1x.a(new xa(xa.a.a, $$5))));
         if (aa.aX) {
            $$2.b(wu.b(ac.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aT().c();
      }
   }

   @Nullable
   private static ContextChain<ed> a(ParseResults<ed> $$0, String $$1, ed $$2) {
      try {
         a($$0);
         return (ContextChain<ed>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(wx.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xi $$5 = wu.i().a(n.h).a($$1x -> $$1x.a(new ws(ws.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(wt.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               wu $$6 = wu.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(wu.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ed $$0, Consumer<hc<ed>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hc<ed> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aM().c(czz.x));
         int $$6 = $$2.aM().c(czz.y);

         try (hc<ed> $$7 = new hc<>($$5, $$6, $$2.aT())) {
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

   public void a(aqi $$0) {
      Map<CommandNode<ed>, CommandNode<ei>> $$1 = Maps.newHashMap();
      RootCommandNode<ei> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.de(), $$1);
      $$0.d.b(new acf($$2));
   }

   private void a(CommandNode<ed> $$0, CommandNode<ei> $$1, ed $$2, Map<CommandNode<ed>, CommandNode<ei>> $$3) {
      for (CommandNode<ed> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<ei, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<ei, ?> $$6 = (RequiredArgumentBuilder<ei, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(ib.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<ei> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ed> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ed, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ee.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ed> a() {
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

   public static dz a(final iy.a $$0) {
      return new dz() {
         @Override
         public Stream<akg<? extends jj<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<iy.b<T>> a(akg<? extends jj<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> iy.b.a<T> a(final iy.b<T> $$0x) {
            return new iy.b.a<T>() {
               @Override
               public iy.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<ja.c<T>> a(awg<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ja.c<T> b(awg<T> $$0xx) {
                  Optional<ja.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> ja.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dz $$0 = a(ot.a());
      CommandDispatcher<ed> $$1 = new ee(ee.a.a, $$0).a();
      RootCommandNode<ed> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hz.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !hy.a($$0x.getClass())).collect(Collectors.toSet());
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
