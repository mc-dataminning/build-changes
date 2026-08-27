import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class du {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<dt> g = new CommandDispatcher();

   public du(du.a $$0, dn $$1) {
      agd.a(this.g);
      age.a(this.g, $$1);
      agy.a(this.g, $$1);
      agi.a(this.g);
      agk.a(this.g, $$1);
      agl.a(this.g, $$1);
      agm.a(this.g, $$1);
      ajk.a(this.g);
      agn.a(this.g);
      agp.a(this.g);
      agt.a(this.g);
      agu.a(this.g);
      agv.a(this.g, $$1);
      agw.a(this.g);
      agx.a(this.g, $$1);
      agz.a(this.g);
      ahb.a(this.g, $$1);
      aha.a(this.g, $$1);
      ahc.a(this.g);
      ahd.a(this.g);
      ahe.a(this.g);
      ahf.a(this.g);
      ahg.a(this.g, $$1);
      ahh.a(this.g);
      ahi.a(this.g, $$1);
      ahk.a(this.g);
      ahl.a(this.g);
      ahm.a(this.g);
      ahn.a(this.g, $$1);
      aho.a(this.g, $$1);
      ahp.a(this.g);
      aht.a(this.g, $$1);
      ahv.a(this.g);
      ahw.a(this.g);
      ahz.a(this.g);
      aib.a(this.g);
      aia.a(this.g);
      aid.a(this.g);
      aie.a(this.g);
      aii.a(this.g);
      aij.a(this.g);
      aik.a(this.g);
      ail.a(this.g, $$0 != du.a.c);
      aim.a(this.g, $$1);
      aio.a(this.g);
      aip.a(this.g);
      air.a(this.g);
      ais.a(this.g);
      aiu.a(this.g);
      aiv.a(this.g, $$1);
      aiw.a(this.g);
      aix.a(this.g);
      aiy.a(this.g);
      aiz.a(this.g);
      aja.a(this.g);
      ajb.a(this.g);
      ajc.a(this.g);
      ajd.a(this.g);
      ajf.a(this.g);
      ajh.a(this.g);
      if (beb.e.d()) {
         ahj.a(this.g);
      }

      if (aa.aT) {
         qm.a(this.g);
         aiq.a(this.g);
         if ($$0.e) {
            agq.a(this.g);
         }
      }

      if ($$0.e) {
         agf.a(this.g);
         agg.a(this.g);
         agh.a(this.g);
         ago.a(this.g);
         ahq.a(this.g);
         ahr.a(this.g);
         ahs.a(this.g);
         ahu.a(this.g);
         aif.a(this.g);
         aig.a(this.g);
         aih.a(this.g);
         ain.a(this.g);
         ait.a(this.g);
         ajg.a(this.g);
      }

      if ($$0.d) {
         ahx.a(this.g);
      }

      this.g.setConsumer(($$0x, $$1x, $$2) -> ((dt)$$0x.getSource()).a($$0x, $$1x, $$2));
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public int a(dt $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      return this.a(this.g.parse($$1, $$0), $$1);
   }

   public int a(ParseResults<dt> $$0, String $$1) {
      dt $$2 = (dt)$$0.getContext().getSource();
      $$2.l().aM().a(() -> "/" + $$1);

      byte var20;
      try {
         return this.g.execute($$0);
      } catch (dq var13) {
         $$2.b(var13.a());
         return 0;
      } catch (CommandSyntaxException var14) {
         $$2.b(to.a(var14.getRawMessage()));
         if (var14.getInput() != null && var14.getCursor() >= 0) {
            int $$5 = Math.min(var14.getInput().length(), var14.getCursor());
            tz $$6 = tl.i().a(n.h).a($$1x -> $$1x.a(new tj(tj.a.d, "/" + $$1)));
            if ($$5 > 10) {
               $$6.b(tk.t);
            }

            $$6.f(var14.getInput().substring(Math.max(0, $$5 - 10), $$5));
            if ($$5 < var14.getInput().length()) {
               tl $$7 = tl.b(var14.getInput().substring($$5)).a(n.m, n.t);
               $$6.b($$7);
            }

            $$6.b(tl.c("command.context.here").a(n.m, n.u));
            $$2.b($$6);
         }

         return 0;
      } catch (Exception var15) {
         tz $$9 = tl.b(var15.getMessage() == null ? var15.getClass().getName() : var15.getMessage());
         if (f.isDebugEnabled()) {
            f.error("Command exception: /{}", $$1, var15);
            StackTraceElement[] $$10 = var15.getStackTrace();

            for (int $$11 = 0; $$11 < Math.min($$10.length, 3); $$11++) {
               $$9.f("\n\n").f($$10[$$11].getMethodName()).f("\n ").f($$10[$$11].getFileName()).f(":").f(String.valueOf($$10[$$11].getLineNumber()));
            }
         }

         $$2.b(tl.c("command.failed").a($$1x -> $$1x.a(new tr(tr.a.a, $$9))));
         if (aa.aT) {
            $$2.b(tl.b(ac.c(var15)));
            f.error("'/{}' threw an exception", $$1, var15);
         }

         var20 = 0;
      } finally {
         $$2.l().aM().c();
      }

      return var20;
   }

   public void a(aku $$0) {
      Map<CommandNode<dt>, CommandNode<dw>> $$1 = Maps.newHashMap();
      RootCommandNode<dw> $$2 = new RootCommandNode();
      $$1.put(this.g.getRoot(), $$2);
      this.a(this.g.getRoot(), $$2, $$0.dc(), $$1);
      $$0.c.b(new xp($$2));
   }

   private void a(CommandNode<dt> $$0, CommandNode<dw> $$1, dt $$2, Map<CommandNode<dt>, CommandNode<dw>> $$3) {
      for (CommandNode<dt> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<dw, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<dw, ?> $$6 = (RequiredArgumentBuilder<dw, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(gm.b($$6.getSuggestionsProvider()));
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

   public static LiteralArgumentBuilder<dt> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<dt, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(du.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<dt> a() {
      return this.g;
   }

   @Nullable
   public static <S> CommandSyntaxException a(ParseResults<S> $$0) {
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

   public static dn a(final hg.b $$0) {
      return new dn() {
         @Override
         public <T> hg<T> a(aey<? extends hq<T>> $$0x) {
            final hg.c<T> $$1 = $$0.b($$0);
            return new hg.a<T>($$1) {
               @Override
               public Optional<hi.c<T>> a(aqk<T> $$0x) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public hi.c<T> b(aqk<T> $$0x) {
                  Optional<hi.c<T>> $$1 = $$1.a($$0);
                  return $$1.orElseGet(() -> hi.a($$1, $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dn $$0 = a(mh.a());
      CommandDispatcher<dt> $$1 = new du(du.a.a, $$0).a();
      RootCommandNode<dt> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> f.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = gk.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !gj.a($$0x.getClass())).collect(Collectors.toSet());
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
