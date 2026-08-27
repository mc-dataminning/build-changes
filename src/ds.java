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

public class ds {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<dr> g = new CommandDispatcher();

   public ds(ds.a $$0, dl $$1) {
      afv.a(this.g);
      afw.a(this.g, $$1);
      agq.a(this.g, $$1);
      aga.a(this.g);
      agc.a(this.g, $$1);
      agd.a(this.g, $$1);
      age.a(this.g, $$1);
      ajc.a(this.g);
      agf.a(this.g);
      agh.a(this.g);
      agl.a(this.g);
      agm.a(this.g);
      agn.a(this.g, $$1);
      ago.a(this.g);
      agp.a(this.g, $$1);
      agr.a(this.g);
      agt.a(this.g, $$1);
      ags.a(this.g, $$1);
      agu.a(this.g);
      agv.a(this.g);
      agw.a(this.g);
      agx.a(this.g);
      agy.a(this.g, $$1);
      agz.a(this.g);
      aha.a(this.g, $$1);
      ahc.a(this.g);
      ahd.a(this.g);
      ahe.a(this.g);
      ahf.a(this.g, $$1);
      ahg.a(this.g, $$1);
      ahh.a(this.g);
      ahl.a(this.g, $$1);
      ahn.a(this.g);
      aho.a(this.g);
      ahr.a(this.g);
      aht.a(this.g);
      ahs.a(this.g);
      ahv.a(this.g);
      ahw.a(this.g);
      aia.a(this.g);
      aib.a(this.g);
      aic.a(this.g);
      aid.a(this.g, $$0 != ds.a.c);
      aie.a(this.g, $$1);
      aig.a(this.g);
      aih.a(this.g);
      aij.a(this.g);
      aik.a(this.g);
      aim.a(this.g);
      ain.a(this.g, $$1);
      aio.a(this.g);
      aip.a(this.g);
      aiq.a(this.g);
      air.a(this.g);
      ais.a(this.g);
      ait.a(this.g);
      aiu.a(this.g);
      aiv.a(this.g);
      aix.a(this.g);
      aiz.a(this.g);
      if (bdn.e.d()) {
         ahb.a(this.g);
      }

      if (aa.aS) {
         qh.a(this.g);
         aii.a(this.g);
         if ($$0.e) {
            agi.a(this.g);
         }
      }

      if ($$0.e) {
         afx.a(this.g);
         afy.a(this.g);
         afz.a(this.g);
         agg.a(this.g);
         ahi.a(this.g);
         ahj.a(this.g);
         ahk.a(this.g);
         ahm.a(this.g);
         ahx.a(this.g);
         ahy.a(this.g);
         ahz.a(this.g);
         aif.a(this.g);
         ail.a(this.g);
         aiy.a(this.g);
      }

      if ($$0.d) {
         ahp.a(this.g);
      }

      this.g.setConsumer(($$0x, $$1x, $$2) -> ((dr)$$0x.getSource()).a($$0x, $$1x, $$2));
   }

   public static <S> ParseResults<S> a(ParseResults<S> $$0, UnaryOperator<S> $$1) {
      CommandContextBuilder<S> $$2 = $$0.getContext();
      CommandContextBuilder<S> $$3 = $$2.withSource($$1.apply((S)$$2.getSource()));
      return new ParseResults($$3, $$0.getReader(), $$0.getExceptions());
   }

   public int a(dr $$0, String $$1) {
      $$1 = $$1.startsWith("/") ? $$1.substring(1) : $$1;
      return this.a(this.g.parse($$1, $$0), $$1);
   }

   public int a(ParseResults<dr> $$0, String $$1) {
      dr $$2 = (dr)$$0.getContext().getSource();
      $$2.l().aM().a(() -> "/" + $$1);

      byte var20;
      try {
         return this.g.execute($$0);
      } catch (dn var13) {
         $$2.b(var13.a());
         return 0;
      } catch (CommandSyntaxException var14) {
         $$2.b(th.a(var14.getRawMessage()));
         if (var14.getInput() != null && var14.getCursor() >= 0) {
            int $$5 = Math.min(var14.getInput().length(), var14.getCursor());
            ts $$6 = tf.h().a(n.h).a($$1x -> $$1x.a(new td(td.a.d, "/" + $$1)));
            if ($$5 > 10) {
               $$6.b(te.t);
            }

            $$6.f(var14.getInput().substring(Math.max(0, $$5 - 10), $$5));
            if ($$5 < var14.getInput().length()) {
               tf $$7 = tf.b(var14.getInput().substring($$5)).a(n.m, n.t);
               $$6.b($$7);
            }

            $$6.b(tf.c("command.context.here").a(n.m, n.u));
            $$2.b($$6);
         }

         return 0;
      } catch (Exception var15) {
         ts $$9 = tf.b(var15.getMessage() == null ? var15.getClass().getName() : var15.getMessage());
         if (f.isDebugEnabled()) {
            f.error("Command exception: /{}", $$1, var15);
            StackTraceElement[] $$10 = var15.getStackTrace();

            for (int $$11 = 0; $$11 < Math.min($$10.length, 3); $$11++) {
               $$9.f("\n\n").f($$10[$$11].getMethodName()).f("\n ").f($$10[$$11].getFileName()).f(":").f(String.valueOf($$10[$$11].getLineNumber()));
            }
         }

         $$2.b(tf.c("command.failed").a($$1x -> $$1x.a(new tk(tk.a.a, $$9))));
         if (aa.aS) {
            $$2.b(tf.b(ac.c(var15)));
            f.error("'/{}' threw an exception", $$1, var15);
         }

         var20 = 0;
      } finally {
         $$2.l().aM().c();
      }

      return var20;
   }

   public void a(akl $$0) {
      Map<CommandNode<dr>, CommandNode<du>> $$1 = Maps.newHashMap();
      RootCommandNode<du> $$2 = new RootCommandNode();
      $$1.put(this.g.getRoot(), $$2);
      this.a(this.g.getRoot(), $$2, $$0.dc(), $$1);
      $$0.c.b(new xi($$2));
   }

   private void a(CommandNode<dr> $$0, CommandNode<du> $$1, dr $$2, Map<CommandNode<dr>, CommandNode<du>> $$3) {
      for (CommandNode<dr> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<du, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<du, ?> $$6 = (RequiredArgumentBuilder<du, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(gk.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<du> $$7 = $$5.build();
            $$3.put($$4, $$7);
            $$1.addChild($$7);
            if (!$$4.getChildren().isEmpty()) {
               this.a($$4, $$7, $$2, $$3);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<dr> a(String $$0) {
      return LiteralArgumentBuilder.literal($$0);
   }

   public static <T> RequiredArgumentBuilder<dr, T> a(String $$0, ArgumentType<T> $$1) {
      return RequiredArgumentBuilder.argument($$0, $$1);
   }

   public static Predicate<String> a(ds.b $$0) {
      return $$1 -> {
         try {
            $$0.parse(new StringReader($$1));
            return true;
         } catch (CommandSyntaxException var3) {
            return false;
         }
      };
   }

   public CommandDispatcher<dr> a() {
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

   public static dl a(final hg.b $$0) {
      return new dl() {
         @Override
         public <T> hg<T> a(aeq<? extends hr<T>> $$0x) {
            final hg.c<T> $$1 = $$0.b($$0);
            return new hg.a<T>($$1) {
               @Override
               public Optional<hi.c<T>> a(aqa<T> $$0x) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public hi.c<T> b(aqa<T> $$0x) {
                  Optional<hi.c<T>> $$1 = $$1.a($$0);
                  return $$1.orElseGet(() -> hi.a($$1, $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dl $$0 = a(me.a());
      CommandDispatcher<dr> $$1 = new ds(ds.a.a, $$0).a();
      RootCommandNode<dr> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> f.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = gi.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !gh.a($$0x.getClass())).collect(Collectors.toSet());
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
