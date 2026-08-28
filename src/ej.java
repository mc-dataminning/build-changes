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

public class ej {
   private static final ThreadLocal<hj<ei>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ei> h = new CommandDispatcher();

   public ej(ej.a $$0, ee $$1) {
      amm.a(this.h);
      amn.a(this.h, $$1);
      anh.a(this.h, $$1);
      amr.a(this.h, $$1);
      amt.a(this.h, $$1);
      amu.a(this.h, $$1);
      amv.a(this.h, $$1);
      apy.a(this.h);
      amw.a(this.h);
      amy.a(this.h);
      anc.a(this.h);
      and.a(this.h);
      ane.a(this.h, $$1);
      anf.a(this.h);
      ang.a(this.h, $$1);
      ani.a(this.h);
      ank.a(this.h, $$1);
      anj.a(this.h, $$1);
      anl.a(this.h);
      anm.a(this.h);
      ann.a(this.h);
      ano.a(this.h, $$1);
      anp.a(this.h, $$1);
      anq.a(this.h);
      ans.a(this.h, $$1);
      anu.a(this.h);
      anv.a(this.h);
      anw.a(this.h);
      anx.a(this.h, $$1);
      anz.a(this.h, $$1);
      aoa.a(this.h);
      aoe.a(this.h, $$1);
      aog.a(this.h);
      aoh.a(this.h);
      aok.a(this.h);
      aom.a(this.h);
      aol.a(this.h);
      aon.a(this.h);
      aoo.a(this.h);
      aop.a(this.h);
      aot.a(this.h);
      aou.a(this.h);
      aov.a(this.h, $$1);
      aow.a(this.h, $$0 != ej.a.c);
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
      ti.a(this.h, $$1);
      apn.a(this.h);
      apo.a(this.h);
      app.a(this.h, $$1);
      apr.a(this.h);
      apt.a(this.h);
      apv.a(this.h);
      if (bqr.f.d()) {
         ant.a(this.h);
      }

      if (ab.aU) {
         aoj.a(this.h, $$1);
         anb.a(this.h);
         ana.a(this.h);
         aps.a(this.h);
         apc.a(this.h);
         aox.a(this.h);
         if ($$0.e) {
            amz.a(this.h);
         }
      }

      if ($$0.e) {
         amo.a(this.h);
         amp.a(this.h);
         amq.a(this.h);
         amx.a(this.h);
         aob.a(this.h);
         aoc.a(this.h);
         aod.a(this.h);
         aof.a(this.h);
         aoq.a(this.h);
         aor.a(this.h);
         aos.a(this.h);
         aoz.a(this.h);
         apf.a(this.h);
         apq.a(this.h);
         apu.a(this.h);
      }

      if ($$0.d) {
         aoi.a(this.h);
      }

      this.h.setConsumer(ek.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ei $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ei> $$0, String $$1) {
      ei $$2 = (ei)$$0.getContext().getSource();
      bqi.a().a(() -> "/" + $$1);
      ContextChain<ei> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> hj.a($$3x, $$1, $$3, $$2, ef.a));
         }
      } catch (Exception var12) {
         xk $$5 = ww.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(ww.c("command.failed").a($$1x -> $$1x.a(new xc.e($$5))));
         if (ab.aU) {
            $$2.b(ww.b(af.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         bqi.a().c();
      }
   }

   @Nullable
   private static ContextChain<ei> a(ParseResults<ei> $$0, String $$1, ei $$2) {
      try {
         a($$0);
         return (ContextChain<ei>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(wz.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            xk $$5 = ww.i().a(n.h).a($$1x -> $$1x.a(new wu.g("/" + $$1)));
            if ($$4 > 10) {
               $$5.b(wv.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               ww $$6 = ww.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(ww.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ei $$0, Consumer<hj<ei>> $$1) {
      MinecraftServer $$2 = $$0.l();
      hj<ei> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aL().d(dil.y));
         int $$6 = $$2.aL().d(dil.z);

         try (hj<ei> $$7 = new hj<>($$5, $$6, bqi.a())) {
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

   public void a(arp $$0) {
      Map<CommandNode<ei>, CommandNode<en>> $$1 = Maps.newHashMap();
      RootCommandNode<en> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.A(), $$1);
      $$0.f.b(new ack($$2));
   }

   private void a(CommandNode<ei> $$0, CommandNode<en> $$1, ei $$2, Map<CommandNode<ei>, CommandNode<en>> $$3) {
      for (CommandNode<ei> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<en, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<en, ?> $$6 = (RequiredArgumentBuilder<en, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(ij.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<en> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ei> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ei, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ej.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ei> a() {
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

   public static ee a(final jg.a $$0) {
      return new ee() {
         @Override
         public cub a() {
            return cud.e.a();
         }

         @Override
         public Stream<ald<? extends jr<?>>> b() {
            return $$0.b();
         }

         @Override
         public <T> Optional<jg.b<T>> a(ald<? extends jr<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> jg.b.a<T> a(final jg.b<T> $$0x) {
            return new jg.b.a<T>() {
               @Override
               public jg.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<ji.c<T>> a(axp<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ji.c<T> b(axp<T> $$0xx) {
                  Optional<ji.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> ji.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      ee $$0 = a(ov.a());
      CommandDispatcher<ei> $$1 = new ej(ej.a.a, $$0).a();
      RootCommandNode<ei> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = ih.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !ig.a($$0x.getClass())).collect(Collectors.toSet());
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
