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

public class el {
   private static final ThreadLocal<hl<ek>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ek> h = new CommandDispatcher();

   public el(el.a $$0, eg $$1) {
      amz.a(this.h);
      ana.a(this.h, $$1);
      anu.a(this.h, $$1);
      ane.a(this.h, $$1);
      ang.a(this.h, $$1);
      anh.a(this.h, $$1);
      ani.a(this.h, $$1);
      aql.a(this.h);
      anj.a(this.h);
      anl.a(this.h);
      anp.a(this.h);
      anq.a(this.h);
      anr.a(this.h, $$1);
      ans.a(this.h);
      ant.a(this.h, $$1);
      anv.a(this.h);
      anx.a(this.h, $$1);
      anw.a(this.h, $$1);
      any.a(this.h);
      anz.a(this.h);
      aoa.a(this.h);
      aob.a(this.h, $$1);
      aoc.a(this.h, $$1);
      aod.a(this.h);
      aof.a(this.h, $$1);
      aoh.a(this.h);
      aoi.a(this.h);
      aoj.a(this.h);
      aok.a(this.h, $$1);
      aom.a(this.h, $$1);
      aon.a(this.h);
      aor.a(this.h, $$1);
      aot.a(this.h);
      aou.a(this.h);
      aox.a(this.h);
      aoz.a(this.h);
      aoy.a(this.h);
      apa.a(this.h);
      apb.a(this.h);
      apc.a(this.h);
      apg.a(this.h);
      aph.a(this.h);
      api.a(this.h, $$1);
      apj.a(this.h, $$0 != el.a.c);
      apl.a(this.h, $$1);
      apn.a(this.h);
      apo.a(this.h);
      apq.a(this.h);
      apr.a(this.h);
      apt.a(this.h);
      apu.a(this.h, $$1);
      apv.a(this.h);
      apw.a(this.h, $$1);
      apx.a(this.h);
      apy.a(this.h);
      apz.a(this.h, $$1);
      tk.a(this.h, $$1);
      aqa.a(this.h);
      aqb.a(this.h);
      aqc.a(this.h, $$1);
      aqe.a(this.h);
      aqg.a(this.h);
      aqi.a(this.h);
      if (bru.f.d()) {
         aog.a(this.h);
      }

      if (ac.aU) {
         aow.a(this.h, $$1);
         ano.a(this.h);
         ann.a(this.h);
         aqf.a(this.h);
         app.a(this.h);
         apk.a(this.h);
         if ($$0.e) {
            anm.a(this.h);
         }
      }

      if ($$0.e) {
         anb.a(this.h);
         anc.a(this.h);
         and.a(this.h);
         ank.a(this.h);
         aoo.a(this.h);
         aop.a(this.h);
         aoq.a(this.h);
         aos.a(this.h);
         apd.a(this.h);
         ape.a(this.h);
         apf.a(this.h);
         apm.a(this.h);
         aps.a(this.h);
         aqd.a(this.h);
         aqh.a(this.h);
      }

      if ($$0.d) {
         aov.a(this.h);
      }

      this.h.setConsumer(em.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ek $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ek> $$0, String $$1) {
      ek $$2 = (ek)$$0.getContext().getSource();
      brl.a().a(() -> "/" + $$1);
      ContextChain<ek> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hl.a($$3x, $$1, $$3, $$2, eh.a));
         }
      } catch (Exception var12) {
         xu $$5 = xg.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(xg.c("command.failed").a($$1x -> $$1x.a(new xm.e($$5))));
         if (ac.aU) {
            $$2.b(xg.b(ag.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         brl.a().c();
      }
   }

   @Nullable
   private static ContextChain<ek> a(ParseResults<ek> $$0, String $$1, ek $$2) {
      try {
         a($$0);
         return (ContextChain<ek>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(xj.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xu $$5 = xg.i().a(o.h).a($$1x -> $$1x.a(new xe.g("/" + $$1)));
            if ($$4 > 10) {
               $$5.b(xf.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               xg $$6 = xg.b(var7.getInput().substring($$4)).a(o.m, o.t);
               $$5.b($$6);
            }

            $$5.b(xg.c("command.context.here").a(o.m, o.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ek $$0, Consumer<hl<ek>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hl<ek> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().d(dkf.z));
         int $$6 = $$2.aL().d(dkf.A);

         try (hl<ek> $$7 = new hl<>($$5, $$6, brl.a())) {
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

   public void a(asc $$0) {
      Map<CommandNode<ek>, CommandNode<ep>> $$1 = Maps.newHashMap();
      RootCommandNode<ep> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.A(), $$1);
      $$0.f.b(new acx($$2));
   }

   private void a(CommandNode<ek> $$0, CommandNode<ep> $$1, ek $$2, Map<CommandNode<ek>, CommandNode<ep>> $$3) {
      for (CommandNode<ek> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<ep, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<ep, ?> $$6 = (RequiredArgumentBuilder<ep, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(il.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<ep> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ek> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ek, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(el.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ek> a() {
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

   public static eg a(final ji.a $$0) {
      return new eg() {
         @Override
         public cvs a() {
            return cvu.e.a();
         }

         @Override
         public Stream<alq<? extends jt<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<ji.b<T>> a(alq<? extends jt<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> ji.b.a<T> a(final ji.b<T> $$0x) {
            return new ji.b.a<T>() {
               @Override
               public ji.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<jk.c<T>> a(ayc<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public jk.c<T> b(ayc<T> $$0xx) {
                  Optional<jk.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> jk.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      eg $$0 = a(ox.a());
      CommandDispatcher<ek> $$1 = new el(el.a.a, $$0).a();
      RootCommandNode<ek> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = ij.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !ii.a($$0x.getClass())).collect(Collectors.toSet());
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
