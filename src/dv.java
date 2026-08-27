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
   private static final ThreadLocal<go<du>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<du> h = new CommandDispatcher();

   public dv(dv.a $$0, dp $$1) {
      ahr.a(this.h);
      ahs.a(this.h, $$1);
      aim.a(this.h, $$1);
      ahw.a(this.h);
      ahy.a(this.h, $$1);
      ahz.a(this.h, $$1);
      aia.a(this.h, $$1);
      akz.a(this.h);
      aib.a(this.h);
      aid.a(this.h);
      aih.a(this.h);
      aii.a(this.h);
      aij.a(this.h, $$1);
      aik.a(this.h);
      ail.a(this.h, $$1);
      ain.a(this.h);
      aip.a(this.h, $$1);
      aio.a(this.h, $$1);
      aiq.a(this.h);
      air.a(this.h);
      ais.a(this.h);
      ait.a(this.h);
      aiu.a(this.h, $$1);
      aiv.a(this.h);
      aiw.a(this.h, $$1);
      aiy.a(this.h);
      aiz.a(this.h);
      aja.a(this.h);
      ajb.a(this.h, $$1);
      ajc.a(this.h, $$1);
      ajd.a(this.h);
      ajh.a(this.h, $$1);
      ajj.a(this.h);
      ajk.a(this.h);
      ajn.a(this.h);
      ajp.a(this.h);
      ajo.a(this.h);
      ajr.a(this.h);
      ajs.a(this.h);
      ajw.a(this.h);
      ajx.a(this.h);
      ajy.a(this.h);
      ajz.a(this.h, $$0 != dv.a.c);
      aka.a(this.h, $$1);
      akc.a(this.h);
      akd.a(this.h);
      akf.a(this.h);
      akg.a(this.h);
      aki.a(this.h);
      akj.a(this.h, $$1);
      akk.a(this.h);
      akl.a(this.h);
      akm.a(this.h);
      akn.a(this.h);
      ako.a(this.h);
      akp.a(this.h);
      akq.a(this.h);
      akr.a(this.h);
      aks.a(this.h);
      aku.a(this.h);
      akw.a(this.h);
      if (bfy.e.d()) {
         aix.a(this.h);
      }

      if (aa.aT) {
         rt.a(this.h);
         ajq.a(this.h);
         ajm.a(this.h);
         aig.a(this.h);
         aif.a(this.h);
         akt.a(this.h);
         ake.a(this.h);
         if ($$0.e) {
            aie.a(this.h);
         }
      }

      if ($$0.e) {
         aht.a(this.h);
         ahu.a(this.h);
         ahv.a(this.h);
         aic.a(this.h);
         aje.a(this.h);
         ajf.a(this.h);
         ajg.a(this.h);
         aji.a(this.h);
         ajt.a(this.h);
         aju.a(this.h);
         ajv.a(this.h);
         akb.a(this.h);
         akh.a(this.h);
         akv.a(this.h);
      }

      if ($$0.d) {
         ajl.a(this.h);
      }

      this.h.setConsumer(dw.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(du $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<du> $$0, String $$1) {
      du $$2 = (du)$$0.getContext().getSource();
      $$2.l().aR().a(() -> "/" + $$1);
      ContextChain<du> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> go.a($$3x, $$1, $$3, $$2, dq.a));
         }
      } catch (dr var13) {
         $$2.b(var13.a());
      } catch (Exception var14) {
         vj $$6 = uv.b(var14.getMessage() == null ? var14.getClass().getName() : var14.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var14);
            StackTraceElement[] $$7 = var14.getStackTrace();

            for (int $$8 = 0; $$8 < Math.min($$7.length, 3); $$8++) {
               $$6.f("\n\n").f($$7[$$8].getMethodName()).f("\n ").f($$7[$$8].getFileName()).f(":").f(String.valueOf($$7[$$8].getLineNumber()));
            }
         }

         $$2.b(uv.c("command.failed").a($$1x -> $$1x.a(new vb(vb.a.a, $$6))));
         if (aa.aT) {
            $$2.b(uv.b(ac.c(var14)));
            g.error("'/{}' threw an exception", $$1, var14);
         }
      } finally {
         $$2.l().aR().c();
      }
   }

   @Nullable
   private static ContextChain<du> a(ParseResults<du> $$0, String $$1, du $$2) {
      try {
         a($$0);
         return (ContextChain<du>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(uy.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            vj $$5 = uv.i().a(n.h).a($$1x -> $$1x.a(new ut(ut.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(uu.t);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               uv $$6 = uv.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(uv.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(du $$0, Consumer<go<du>> $$1) {
      MinecraftServer $$2 = $$0.l();
      go<du> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aK().c(csb.x));
         int $$6 = $$2.aK().c(csb.y);

         try (go<du> $$7 = new go<>($$5, $$6, $$2.aR())) {
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

   public void a(amj $$0) {
      Map<CommandNode<du>, CommandNode<dy>> $$1 = Maps.newHashMap();
      RootCommandNode<dy> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.de(), $$1);
      $$0.c.b(new yz($$2));
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
                  $$6.suggests(hn.b($$6.getSuggestionsProvider()));
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

   public static dp a(final ii.b $$0) {
      return new dp() {
         @Override
         public <T> ii<T> a(agl<? extends is<T>> $$0x) {
            final ii.c<T> $$1 = $$0.b($$0);
            return new ii.a<T>($$1) {
               @Override
               public Optional<ik.c<T>> a(arz<T> $$0x) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ik.c<T> b(arz<T> $$0x) {
                  Optional<ik.c<T>> $$1 = $$1.a($$0);
                  return $$1.orElseGet(() -> ik.a($$1, $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dp $$0 = a(nn.a());
      CommandDispatcher<du> $$1 = new dv(dv.a.a, $$0).a();
      RootCommandNode<du> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hl.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !hk.a($$0x.getClass())).collect(Collectors.toSet());
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
