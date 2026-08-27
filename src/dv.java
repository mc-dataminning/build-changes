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

public class dv {
   private static final ThreadLocal<gs<du>> f = new ThreadLocal<>();
   private static final Logger g = LogUtils.getLogger();
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public static final int e = 4;
   private final CommandDispatcher<du> h = new CommandDispatcher();

   public dv(dv.a $$0, dq $$1) {
      akm.a(this.h);
      akn.a(this.h, $$1);
      alh.a(this.h, $$1);
      akr.a(this.h, $$1);
      akt.a(this.h, $$1);
      aku.a(this.h, $$1);
      akv.a(this.h, $$1);
      anw.a(this.h);
      akw.a(this.h);
      aky.a(this.h);
      alc.a(this.h);
      ald.a(this.h);
      ale.a(this.h, $$1);
      alf.a(this.h);
      alg.a(this.h, $$1);
      ali.a(this.h);
      alk.a(this.h, $$1);
      alj.a(this.h, $$1);
      all.a(this.h);
      alm.a(this.h);
      aln.a(this.h);
      alo.a(this.h);
      alp.a(this.h, $$1);
      alq.a(this.h);
      alr.a(this.h, $$1);
      alt.a(this.h);
      alu.a(this.h);
      alv.a(this.h);
      alw.a(this.h, $$1);
      alx.a(this.h, $$1);
      aly.a(this.h);
      amc.a(this.h, $$1);
      ame.a(this.h);
      amf.a(this.h);
      ami.a(this.h);
      amk.a(this.h);
      amj.a(this.h);
      amm.a(this.h);
      amn.a(this.h);
      amr.a(this.h);
      ams.a(this.h);
      amt.a(this.h, $$1);
      amu.a(this.h, $$0 != dv.a.c);
      amw.a(this.h, $$1);
      amy.a(this.h);
      amz.a(this.h);
      anb.a(this.h);
      anc.a(this.h);
      ane.a(this.h);
      anf.a(this.h, $$1);
      ang.a(this.h);
      anh.a(this.h, $$1);
      ani.a(this.h);
      anj.a(this.h);
      ank.a(this.h, $$1);
      anl.a(this.h);
      anm.a(this.h);
      ann.a(this.h, $$1);
      anp.a(this.h);
      anr.a(this.h);
      ant.a(this.h);
      if (bjw.f.d()) {
         als.a(this.h);
      }

      if (aa.aW) {
         so.a(this.h);
         aml.a(this.h);
         amh.a(this.h, $$1);
         alb.a(this.h);
         ala.a(this.h);
         anq.a(this.h);
         ana.a(this.h);
         amv.a(this.h);
         if ($$0.e) {
            akz.a(this.h);
         }
      }

      if ($$0.e) {
         ako.a(this.h);
         akp.a(this.h);
         akq.a(this.h);
         akx.a(this.h);
         alz.a(this.h);
         ama.a(this.h);
         amb.a(this.h);
         amd.a(this.h);
         amo.a(this.h);
         amp.a(this.h);
         amq.a(this.h);
         amx.a(this.h);
         and.a(this.h);
         ano.a(this.h);
         ans.a(this.h);
      }

      if ($$0.d) {
         amg.a(this.h);
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
      $$2.l().aU().a(() -> "/" + $$1);
      ContextChain<du> $$3 = a($$0, $$1, $$2);

      try {
         if ($$3 != null) {
            a($$2, $$3x -> gs.a($$3x, $$1, $$3, $$2, dr.a));
         }
      } catch (Exception var12) {
         wi $$5 = vu.b(var12.getMessage() == null ? var12.getClass().getName() : var12.getMessage());
         if (g.isDebugEnabled()) {
            g.error("Command exception: /{}", $$1, var12);
            StackTraceElement[] $$6 = var12.getStackTrace();

            for (int $$7 = 0; $$7 < Math.min($$6.length, 3); $$7++) {
               $$5.f("\n\n").f($$6[$$7].getMethodName()).f("\n ").f($$6[$$7].getFileName()).f(":").f(String.valueOf($$6[$$7].getLineNumber()));
            }
         }

         $$2.b(vu.c("command.failed").a($$1x -> $$1x.a(new wa(wa.a.a, $$5))));
         if (aa.aW) {
            $$2.b(vu.b(ac.c(var12)));
            g.error("'/{}' threw an exception", $$1, var12);
         }
      } finally {
         $$2.l().aU().c();
      }
   }

   @Nullable
   private static ContextChain<du> a(ParseResults<du> $$0, String $$1, du $$2) {
      try {
         a($$0);
         return (ContextChain<du>)ContextChain.tryFlatten($$0.getContext().build($$1))
            .orElseThrow(() -> CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext($$0.getReader()));
      } catch (CommandSyntaxException var7) {
         $$2.b(vx.a(var7.getRawMessage()));
         if (var7.getInput() != null && var7.getCursor() >= 0) {
            int $$4 = Math.min(var7.getInput().length(), var7.getCursor());
            wi $$5 = vu.i().a(n.h).a($$1x -> $$1x.a(new vs(vs.a.d, "/" + $$1)));
            if ($$4 > 10) {
               $$5.b(vt.u);
            }

            $$5.f(var7.getInput().substring(Math.max(0, $$4 - 10), $$4));
            if ($$4 < var7.getInput().length()) {
               vu $$6 = vu.b(var7.getInput().substring($$4)).a(n.m, n.t);
               $$5.b($$6);
            }

            $$5.b(vu.c("command.context.here").a(n.m, n.u));
            $$2.b($$5);
         }

         return null;
      }
   }

   public static void a(du $$0, Consumer<gs<du>> $$1) {
      MinecraftServer $$2 = $$0.l();
      gs<du> $$3 = f.get();
      boolean $$4 = $$3 == null;
      if ($$4) {
         int $$5 = Math.max(1, $$2.aN().c(cwv.x));
         int $$6 = $$2.aN().c(cwv.y);

         try (gs<du> $$7 = new gs<>($$5, $$6, $$2.aU())) {
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

   public void a(apg $$0) {
      Map<CommandNode<du>, CommandNode<dz>> $$1 = Maps.newHashMap();
      RootCommandNode<dz> $$2 = new RootCommandNode();
      $$1.put(this.h.getRoot(), $$2);
      this.a(this.h.getRoot(), $$2, $$0.dd(), $$1);
      $$0.d.b(new abf($$2));
   }

   private void a(CommandNode<du> $$0, CommandNode<dz> $$1, du $$2, Map<CommandNode<du>, CommandNode<dz>> $$3) {
      for (CommandNode<du> $$4 : $$0.getChildren()) {
         if ($$4.canUse($$2)) {
            ArgumentBuilder<dz, ?> $$5 = $$4.createBuilder();
            $$5.requires($$0x -> true);
            if ($$5.getCommand() != null) {
               $$5.executes($$0x -> 0);
            }

            if ($$5 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder<dz, ?> $$6 = (RequiredArgumentBuilder<dz, ?>)$$5;
               if ($$6.getSuggestionsProvider() != null) {
                  $$6.suggests(hr.b($$6.getSuggestionsProvider()));
               }
            }

            if ($$5.getRedirect() != null) {
               $$5.redirect($$3.get($$5.getRedirect()));
            }

            CommandNode<dz> $$7 = $$5.build();
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

   public static dq a(final in.a $$0) {
      return new dq() {
         @Override
         public Stream<ajg<? extends iy<?>>> a() {
            return $$0.a();
         }

         @Override
         public <T> Optional<in.b<T>> a(ajg<? extends iy<? extends T>> $$0x) {
            return $$0.a($$0).map(this::a);
         }

         private <T> in.b.a<T> a(final in.b<T> $$0x) {
            return new in.b.a<T>() {
               @Override
               protected in.b<T> a() {
                  return $$0;
               }

               @Override
               public Optional<ip.c<T>> a(avd<T> $$0xx) {
                  return Optional.of(this.b($$0));
               }

               @Override
               public ip.c<T> b(avd<T> $$0xx) {
                  Optional<ip.c<T>> $$1 = this.a().a($$0);
                  return $$1.orElseGet(() -> ip.a(this.a(), $$0));
               }
            };
         }
      };
   }

   public static void b() {
      dq $$0 = a(nv.a());
      CommandDispatcher<du> $$1 = new dv(dv.a.a, $$0).a();
      RootCommandNode<du> $$2 = $$1.getRoot();
      $$1.findAmbiguities(
         ($$1x, $$2x, $$3x, $$4x) -> g.warn("Ambiguity between arguments {} and {} with inputs: {}", new Object[]{$$1.getPath($$2x), $$1.getPath($$3x), $$4x})
      );
      Set<ArgumentType<?>> $$3 = hp.a($$2);
      Set<ArgumentType<?>> $$4 = $$3.stream().filter($$0x -> !ho.a($$0x.getClass())).collect(Collectors.toSet());
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
