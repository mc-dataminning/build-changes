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

public class dt {
   private static final ThreadLocal<gm<ds>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<ds> h = new CommandDispatcher();

   public dt(dt.a $$0, dn $$1) {
      ahy.a(this.h);
      ahz.a(this.h, $$1);
      ait.a(this.h, $$1);
      aid.a(this.h);
      aif.a(this.h, $$1);
      aig.a(this.h, $$1);
      aih.a(this.h, $$1);
      alg.a(this.h);
      aii.a(this.h);
      aik.a(this.h);
      aio.a(this.h);
      aip.a(this.h);
      aiq.a(this.h, $$1);
      air.a(this.h);
      ais.a(this.h, $$1);
      aiu.a(this.h);
      aiw.a(this.h, $$1);
      aiv.a(this.h, $$1);
      aix.a(this.h);
      aiy.a(this.h);
      aiz.a(this.h);
      aja.a(this.h);
      ajb.a(this.h, $$1);
      ajc.a(this.h);
      ajd.a(this.h, $$1);
      ajf.a(this.h);
      ajg.a(this.h);
      ajh.a(this.h);
      aji.a(this.h, $$1);
      ajj.a(this.h, $$1);
      ajk.a(this.h);
      ajo.a(this.h, $$1);
      ajq.a(this.h);
      ajr.a(this.h);
      aju.a(this.h);
      ajw.a(this.h);
      ajv.a(this.h);
      ajy.a(this.h);
      ajz.a(this.h);
      akd.a(this.h);
      ake.a(this.h);
      akf.a(this.h);
      akg.a(this.h, $$0 != dt.a.c);
      akh.a(this.h, $$1);
      akj.a(this.h);
      akk.a(this.h);
      akm.a(this.h);
      akn.a(this.h);
      akp.a(this.h);
      akq.a(this.h, $$1);
      akr.a(this.h);
      aks.a(this.h);
      akt.a(this.h);
      aku.a(this.h);
      akv.a(this.h);
      akw.a(this.h);
      akx.a(this.h);
      aky.a(this.h);
      akz.a(this.h);
      alb.a(this.h);
      ald.a(this.h);
      if (bgi.e.d()) {
         aje.a(this.h);
      }

      if (aa.aW) {
         rz.a(this.h);
         ajx.a(this.h);
         ajt.a(this.h);
         ain.a(this.h);
         aim.a(this.h);
         ala.a(this.h);
         akl.a(this.h);
         if ($$0.e) {
            ail.a(this.h);
         }
      }

      if ($$0.e) {
         aia.a(this.h);
         aib.a(this.h);
         aic.a(this.h);
         aij.a(this.h);
         ajl.a(this.h);
         ajm.a(this.h);
         ajn.a(this.h);
         ajp.a(this.h);
         aka.a(this.h);
         akb.a(this.h);
         akc.a(this.h);
         aki.a(this.h);
         ako.a(this.h);
         alc.a(this.h);
      }

      if ($$0.d) {
         ajs.a(this.h);
      }

      this.h.setConsumer(du.b_());
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public void a(ds $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      this.a(this.h.parse($$1, $$0), $$1);
   }

   public void a(ParseResults<ds> $$0, String $$1) {
      ds $$2 = (ds)$$0.getContext().getSource();
      $$2.l().aR().a(() -> "/" + $$1);
      ContextChain<ds> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> gm.a($$3x, $$1, $$3, $$2, dp.a));
         }
      } catch (Exception var12) {
         vp $$5 = vb.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(vb.c("command.failed").a($$1x -> $$1x.a(new vh(vh.a.a, $$5))));
         if (aa.aW) {
            $$2.b(vb.b(ac.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aR().c();
      }
   }

   @Nullable
   private static ContextChain<ds> a(ParseResults<ds> $$0, String $$1, ds $$2) {
      try {
         a($$0);
         return (ContextChain<ds>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(ve.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            vp $$5 = vb.i().a(n.h).a($$1x -> $$1x.a(new uz(uz.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(va.t);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               vb $$6 = vb.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(vb.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(ds $$0, Consumer<gm<ds>> $$1) {
      MinecraftServer $$2 = $$0.l();
      gm<ds> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aK().c(csu.x));
         int $$6 = $$2.aK().c(csu.y);

         try (gm<ds> $$7 = new gm<>($$5, $$6, $$2.aR())) {
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

   public void a(amq $$0) {
      Map<CommandNode<ds>, CommandNode<dw>> $$1 = Maps.newHashMap();
      RootCommandNode<dw> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dd(), $$1);
      $$0.c.b(new zg($$2));
   }

   private void a(CommandNode<ds> $$0, CommandNode<dw> $$1, ds $$2, Map<CommandNode<ds>, CommandNode<dw>> $$3) {
      for (CommandNode<ds> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<dw, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<dw, ?> $$6 = (RequiredArgumentBuilder<dw, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(hl.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<dw> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<ds> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<ds, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(dt.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<ds> a() {
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

   public static dn a(final ih.b $$0) {
      return new dn() {
         @Override
         public <T> ih<T> a(ags<? extends ir<T>> $$0x) {
            final ih.c<T> $$1 = $$0.b($$0);
            return new ih.a<T>($$1) {
               @Override
               public Optional<ij.c<T>> a(asg<T> $$0x) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ij.c<T> b(asg<T> $$0x) {
                  Optional<ij.c<T>> $$1 = $$1.a($$0);
                  return $$1.orElseGet(() -> ij.a($$1, $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dn $$0 = a(nl.a());
      CommandDispatcher<ds> $$1 = new dt(dt.a.a, $$0).a();
      RootCommandNode<ds> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hj.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !hi.a($$0x.getClass())).collect(Collectors.toSet());
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
