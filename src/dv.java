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
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dv {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<du> g = new CommandDispatcher();

   public dv(dv.a $$0, dp $$1) {
      aha.a(this.g);
      ahb.a(this.g, $$1);
      ahv.a(this.g, $$1);
      ahf.a(this.g);
      ahh.a(this.g, $$1);
      ahi.a(this.g, $$1);
      ahj.a(this.g, $$1);
      akh.a(this.g);
      ahk.a(this.g);
      ahm.a(this.g);
      ahq.a(this.g);
      ahr.a(this.g);
      ahs.a(this.g, $$1);
      aht.a(this.g);
      ahu.a(this.g, $$1);
      ahw.a(this.g);
      ahy.a(this.g, $$1);
      ahx.a(this.g, $$1);
      ahz.a(this.g);
      aia.a(this.g);
      aib.a(this.g);
      aic.a(this.g);
      aid.a(this.g, $$1);
      aie.a(this.g);
      aif.a(this.g, $$1);
      aih.a(this.g);
      aii.a(this.g);
      aij.a(this.g);
      aik.a(this.g, $$1);
      ail.a(this.g, $$1);
      aim.a(this.g);
      aiq.a(this.g, $$1);
      ais.a(this.g);
      ait.a(this.g);
      aiw.a(this.g);
      aiy.a(this.g);
      aix.a(this.g);
      aja.a(this.g);
      ajb.a(this.g);
      ajf.a(this.g);
      ajg.a(this.g);
      ajh.a(this.g);
      aji.a(this.g, $$0 != dv.a.c);
      ajj.a(this.g, $$1);
      ajl.a(this.g);
      ajm.a(this.g);
      ajo.a(this.g);
      ajp.a(this.g);
      ajr.a(this.g);
      ajs.a(this.g, $$1);
      ajt.a(this.g);
      aju.a(this.g);
      ajv.a(this.g);
      ajw.a(this.g);
      ajx.a(this.g);
      ajy.a(this.g);
      ajz.a(this.g);
      aka.a(this.g);
      akc.a(this.g);
      ake.a(this.g);
      if (bey.e.d()) {
         aig.a(this.g);
      }

      if (aa.aT) {
         rj.a(this.g);
         ajn.a(this.g);
         if ($$0.e) {
            ahn.a(this.g);
         }
      }

      if ($$0.e) {
         ahc.a(this.g);
         ahd.a(this.g);
         ahe.a(this.g);
         ahl.a(this.g);
         ain.a(this.g);
         aio.a(this.g);
         aip.a(this.g);
         air.a(this.g);
         ajc.a(this.g);
         ajd.a(this.g);
         aje.a(this.g);
         ajk.a(this.g);
         ajq.a(this.g);
         akd.a(this.g);
      }

      if ($$0.d) {
         aiu.a(this.g);
      }

      this.g.setConsumer(dw.a_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(du $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.g.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<du> $$0, String $$1) {
      du $$2 = (du)$$0.getContext().getSource();
      $$2.m().aM().a(() -> "/" + $$1);

      try {
         a($$0);
         ContextChain<du> $$3 = (ContextChain<du>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
         a($$2, $$3x -> gn.a($$3x, $$1, $$3, $$2));
      } catch (dr var13) {
         $$2.b(var13.a());
      } catch (CommandSyntaxException var14) {
         $$2.b(ul.a(var14.getRawMessage()));
         if (var14.getInput() != null && var14.getCursor() >= 0) {
            int $$6 = Math.min(var14.getInput().length(), var14.getCursor());
            uw $$7 = ui.i().a(n.h).a($$1x -> $$1x.a(new ug(ug.a.d, "/" + $$1)));
            if ($$6 > 10) {
               $$7.b(uh.t);
            }

            $$7.f(var14.getInput().substring(Math.max(0, $$6 - 10), $$6));
            if ($$6 < var14.getInput().length()) {
               ui $$8 = ui.b(var14.getInput().substring($$6)).a(n.m, n.t);
               $$7.b($$8);
            }

            $$7.b(ui.c("command.context.here").a(n.m, n.u));
            $$2.b($$7);
         }
      } catch (Exception var15) {
         uw $$10 = ui.b(var15.getMessage() == null ? var15.getClass().getName() : var15.getMessage());
         if (f.isDebugEnabled()) {
            f.error("Command exception: /{}", $$1, var15);
            StackTraceElement[] $$11 = var15.getStackTrace();

            for (int $$12 = 0; $$12 < Math.min($$11.length, 3); $$12++) {
               $$10.f("\n\n").f($$11[$$12].getMethodName()).f("\n ").f($$11[$$12].getFileName()).f(":").f(String.valueOf($$11[$$12].getLineNumber()));
            }
         }

         $$2.b(ui.c("command.failed").a($$1x -> $$1x.a(new uo(uo.a.a, $$10))));
         if (aa.aT) {
            $$2.b(ui.b(ac.c(var15)));
            f.error("'/{}' threw an exception", $$1, var15);
         }
      } finally {
         $$2.m().aM().c();
      }
   }

   public static void a(du $$0, Consumer<gn<du>> $$1) throws CommandSyntaxException {
      MinecraftServer $$2 = $$0.m();
      int $$3 = $$2.aI().c(cqv.w);
      int $$4 = $$2.aI().c(cqv.x);

      try (gn<du> $$5 = new gn<>($$3, $$4, $$2.aM())) {
         $$1.accept($$5);
         $$5.a();
      }
   }

   public void a(alr $$0) {
      Map<CommandNode<du>, CommandNode<dy>> $$1 = Maps.newHashMap();
      RootCommandNode<dy> $$2 = new RootCommandNode();
      $$1.put(this.g.getRoot(), $$2);
      this.a(this.g.getRoot(), $$2, $$0.dc(), $$1);
      $$0.c.b(new ym($$2));
   }

   private void a(CommandNode<du> $$0, CommandNode<dy> $$1, du $$2, Map<CommandNode<du>, CommandNode<dy>> $$3) {
      for (CommandNode<du> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<dy, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<dy, ?> $$6 = (RequiredArgumentBuilder<dy, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(hj.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<dy> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<du> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<du, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(dv.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<du> a() {
      return this.g;
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

   public static dp a(final id.b $$0) {
      return new dp() {
         @Override
         public <T> id<T> a(afv<? extends io<T>> $$0x) {
            final id.c<T> $$1 = $$0.b($$0);
            return new id.a<T>($$1) {
               @Override
               public Optional<ig.c<T>> a(arh<T> $$0x) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ig.c<T> b(arh<T> $$0x) {
                  Optional<ig.c<T>> $$1 = $$1.a($$0);
                  return $$1.orElseGet(() -> ig.a($$1, $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dp $$0 = a(ne.a());
      CommandDispatcher<du> $$1 = new dv(dv.a.a, $$0).a();
      RootCommandNode<du> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> f.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hh.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !hg.a($$0x.getClass())).collect(Collectors.toSet());
      if (!$$4.isEmpty()) {
         f.warn("Missing type registration for following arguments:\n {}", $$4.stream().map($$0x -> "\t" + $$0x).collect(Collectors.joining(",\n")));
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
