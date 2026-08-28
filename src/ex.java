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

public class ex {
   private static final ThreadLocal<hw<ew>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ew> h = new CommandDispatcher();

   public ex(ex.a $$0, es $$1) {
      amx.a(this.h);
      amy.a(this.h, $$1);
      ans.a(this.h, $$1);
      anc.a(this.h, $$1);
      ane.a(this.h, $$1);
      anf.a(this.h, $$1);
      ang.a(this.h, $$1);
      aqi.a(this.h);
      anh.a(this.h);
      anj.a(this.h);
      ann.a(this.h);
      ano.a(this.h);
      anp.a(this.h, $$1);
      anq.a(this.h);
      anr.a(this.h, $$1);
      ant.a(this.h);
      anv.a(this.h, $$1);
      anu.a(this.h, $$1);
      anw.a(this.h);
      anx.a(this.h);
      any.a(this.h);
      anz.a(this.h, $$1);
      aoa.a(this.h, $$1);
      aob.a(this.h);
      aoc.a(this.h, $$1);
      aoe.a(this.h);
      aof.a(this.h);
      aog.a(this.h);
      aoh.a(this.h, $$1);
      aoj.a(this.h, $$1);
      aok.a(this.h);
      aoo.a(this.h, $$1);
      aoq.a(this.h);
      aor.a(this.h);
      aou.a(this.h);
      aow.a(this.h);
      aov.a(this.h);
      aox.a(this.h);
      aoy.a(this.h);
      aoz.a(this.h);
      apd.a(this.h);
      ape.a(this.h);
      apf.a(this.h, $$1);
      apg.a(this.h, $$0 != ex.a.c);
      api.a(this.h, $$1);
      apk.a(this.h);
      apl.a(this.h);
      apn.a(this.h);
      apo.a(this.h);
      apq.a(this.h);
      apr.a(this.h, $$1);
      aps.a(this.h);
      apt.a(this.h, $$1);
      apu.a(this.h);
      apv.a(this.h);
      apw.a(this.h, $$1);
      apx.a(this.h);
      apy.a(this.h);
      apz.a(this.h, $$1);
      aqb.a(this.h);
      aqd.a(this.h);
      aqf.a(this.h);
      if (bpr.f.d()) {
         aod.a(this.h);
      }

      if (ab.aU) {
         tz.a(this.h);
         aot.a(this.h, $$1);
         anm.a(this.h);
         anl.a(this.h);
         aqc.a(this.h);
         apm.a(this.h);
         aph.a(this.h);
         if ($$0.e) {
            ank.a(this.h);
         }
      }

      if ($$0.e) {
         amz.a(this.h);
         ana.a(this.h);
         anb.a(this.h);
         ani.a(this.h);
         aol.a(this.h);
         aom.a(this.h);
         aon.a(this.h);
         aop.a(this.h);
         apa.a(this.h);
         apb.a(this.h);
         apc.a(this.h);
         apj.a(this.h);
         app.a(this.h);
         aqa.a(this.h);
         aqe.a(this.h);
      }

      if ($$0.d) {
         aos.a(this.h);
      }

      this.h.setConsumer(ey.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ew $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ew> $$0, String $$1) {
      ew $$2 = (ew)$$0.getContext().getSource();
      bpi.a().a(() -> "/" + $$1);
      ContextChain<ew> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hw.a($$3x, $$1, $$3, $$2, et.a));
         }
      } catch (Exception var12) {
         xy $$5 = xk.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xk.c("command.failed").a($$1x -> $$1x.a(new xq(xq.a.a, $$5))));
         if (ab.aU) {
            $$2.b(xk.b(ae.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         bpi.a().c();
      }
   }

   @Nullable
   private static ContextChain<ew> a(ParseResults<ew> $$0, String $$1, ew $$2) {
      try {
         a($$0);
         return (ContextChain<ew>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xn.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xy $$5 = xk.i().a(n.h).a($$1x -> $$1x.a(new xi(xi.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(xj.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xk $$6 = xk.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(xk.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ew $$0, Consumer<hw<ew>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hw<ew> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().c(dgv.y));
         int $$6 = $$2.aL().c(dgv.z);

         try (hw<ew> $$7 = new hw<>($$5, $$6, bpi.a())) {
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

   public void a(ary $$0) {
      Map<CommandNode<ew>, CommandNode<fb>> $$1 = Maps.newHashMap();
      RootCommandNode<fb> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.A(), $$1);
      $$0.f.b(new acz($$2));
   }

   private void a(CommandNode<ew> $$0, CommandNode<fb> $$1, ew $$2, Map<CommandNode<ew>, CommandNode<fb>> $$3) {
      for (CommandNode<ew> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<fb, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<fb, ?> $$6 = (RequiredArgumentBuilder<fb, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(iw.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<fb> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ew> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ew, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ex.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ew> a() {
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

   public static es a(final js.a $$0) {
      return new es() {
         @Override
         public csk a() {
            return csm.e.a();
         }

         @Override
         public Stream<alo<? extends kd<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<js.b<T>> a(alo<? extends kd<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> js.b.a<T> a(final js.b<T> $$0x) {
            return new js.b.a<T>() {
               @Override
               public js.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<ju.c<T>> a(aya<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ju.c<T> b(aya<T> $$0xx) {
                  Optional<ju.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> ju.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      es $$0 = a(pn.a());
      CommandDispatcher<ew> $$1 = new ex(ex.a.a, $$0).a();
      RootCommandNode<ew> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = iu.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !it.a($$0x.getClass())).collect(Collectors.toSet());
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
