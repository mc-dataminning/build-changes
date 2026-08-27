import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdi {
   private static final Logger a = LogUtils.getLogger();
   private final eqv b;
   private final ecg c;

   public fdi(eqv $$0, ecg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(eyk $$0, String $$1) {
      this.a($$0, $$1, false, true);
   }

   public void a(String $$0, cpz $$1, dlq $$2, Function<hu, dln> $$3) {
      ecg.c $$4 = this.a($$0);
      if ($$4 != null) {
         anf $$5 = ani.a($$4);
         cqo $$6 = $$1.g();

         try {
            afr.d $$7 = new afr.d($$5, $$6, false, false);
            afs $$8 = this.a($$7, $$3x -> {
               dln.b $$4x = $$3.apply($$3x.c()).a($$3x.d().d(je.aI));
               return new afr.b<>(new eck($$1, $$2, $$4x.d(), $$4x.a()), $$4x.b());
            }, afs::new);
            this.b.a($$0, $$4, $$5, $$8, true);
         } catch (Exception var10) {
            a.warn("Failed to load datapacks, can't proceed with server load", var10);
            a($$4, $$0);
         }
      }
   }

   @Nullable
   private ecg.c a(String $$0) {
      try {
         return this.c.c($$0);
      } catch (IOException var3) {
         a.warn("Failed to read level {} data", $$0, var3);
         euw.a(this.b, $$0);
         this.b.a(null);
         return null;
      } catch (ehc var4) {
         a.warn("{}", var4.getMessage());
         this.b.a(exz.a(null));
         return null;
      }
   }

   public void a(ecg.c $$0, afh $$1, hn<afg> $$2, ecm $$3) {
      anf $$4 = ani.a($$0);
      ank $$5 = (ank)new afr.d($$4, $$3.F(), false, false).a().getSecond();
      this.b.a($$0.b(), $$0, $$4, new afs($$5, $$1, $$2, $$3), true);
   }

   private afs a(ecg.c $$0, boolean $$1, anf $$2) throws Exception {
      afr.d $$3 = this.b($$0, $$1, $$2);
      return this.a($$3, $$1x -> {
         DynamicOps<rr> $$2x = aev.a(rj.a, $$1x.c());
         ht<dit> $$3x = $$1x.d().d(je.aI);
         Pair<ecm, dln.b> $$4 = $$0.a($$2x, $$1x.b(), $$3x, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afr.b<>((ecm)$$4.getFirst(), ((dln.b)$$4.getSecond()).b());
         }
      }, afs::new);
   }

   public Pair<cpz, fdg> a(ecg.c $$0) throws Exception {
      anf $$1 = ani.a($$0);
      afr.d $$2 = this.b($$0, false, $$1);

      record a(cpz a, dlq b, ht<dit> c) {
      }

      return this.a($$2, $$1x -> {
         DynamicOps<rr> $$2x = aev.a(rj.a, $$1x.c());
         ht<dit> $$3 = new ho<>(je.aI, Lifecycle.stable()).l();
         Pair<ecm, dln.b> $$4 = $$0.a($$2x, $$1x.b(), $$3, $$1x.c().d());
         if ($$4 == null) {
            throw new IllegalStateException("Failed to load world");
         } else {
            return new afr.b<>(new a(((ecm)$$4.getFirst()).L(), ((ecm)$$4.getFirst()).A(), ((dln.b)$$4.getSecond()).c()), $$1x.d());
         }
      }, ($$0x, $$1x, $$2x, $$3) -> {
         $$0x.close();
         return Pair.of($$3.a, new fdg($$3.b, new dln($$3.c), $$2x, $$1x, $$3.a.g()));
      });
   }

   private afr.d b(ecg.c $$0, boolean $$1, anf $$2) {
      cqo $$3 = $$0.e();
      if ($$3 == null) {
         throw new IllegalStateException("Failed to load data pack config");
      } else {
         return new afr.d($$2, $$3, $$1, false);
      }
   }

   public afs a(ecg.c $$0, boolean $$1) throws Exception {
      anf $$2 = ani.a($$0);
      return this.a($$0, $$1, $$2);
   }

   private <D, R> R a(afr.d $$0, afr.f<D> $$1, afr.e<D, R> $$2) throws Exception {
      afr.c $$3 = new afr.c($$0, du.a.c, 2);
      CompletableFuture<R> $$4 = afr.a($$3, $$1, $$2, ac.f(), this.b);
      this.b.c($$4::isDone);
      return $$4.get();
   }

   private void a(eyk $$0, String $$1, boolean $$2, boolean $$3) {
      ecg.c $$4 = this.a($$1);
      if ($$4 != null) {
         anf $$5 = ani.a($$4);

         afs $$6;
         try {
            $$6 = this.a($$4, $$2, $$5);
         } catch (Exception var11) {
            a.warn("Failed to load level data or datapacks, can't proceed with server load", var11);
            if (!$$2) {
               this.b.a(new exi(() -> this.a($$0, $$1, true, $$3)));
            } else {
               this.b
                  .a(
                     new ewx(
                        () -> this.b.a(null), tm.c("datapackFailure.safeMode.failed.title"), tm.c("datapackFailure.safeMode.failed.description"), tl.l, true
                     )
                  );
            }

            a($$4, $$1);
            return;
         }

         ecm $$9 = $$6.d();
         boolean $$10 = $$9.A().e();
         boolean $$11 = $$9.D() != Lifecycle.stable();
         if (!$$3 || !$$10 && !$$11) {
            this.b.ac().a($$4).thenApply($$0x -> true).exceptionallyComposeAsync($$0x -> {
               a.warn("Failed to load pack: ", $$0x);
               return this.a();
            }, this.b).thenAcceptAsync($$5x -> {
               if ($$5x) {
                  this.b.a($$1, $$4, $$5, $$6, false);
               } else {
                  $$6.close();
                  a($$4, $$1);
                  this.b.ac().a().thenRunAsync(() -> this.b.a($$0), this.b);
               }
            }, this.b).exceptionally($$0x -> {
               this.b.a(o.a($$0x, "Load world"));
               return null;
            });
         } else {
            this.a($$0, $$1, $$10, () -> this.a($$0, $$1, $$2, false));
            $$6.close();
            a($$4, $$1);
         }
      }
   }

   private CompletableFuture<Boolean> a() {
      CompletableFuture<Boolean> $$0 = new CompletableFuture<>();
      this.b.a(new exd($$0::complete, tm.c("multiplayer.texturePrompt.failure.line1"), tm.c("multiplayer.texturePrompt.failure.line2"), tl.i, tl.e));
      return $$0;
   }

   private static void a(ecg.c $$0, String $$1) {
      try {
         $$0.close();
      } catch (IOException var3) {
         a.warn("Failed to unlock access to level {}", $$1, var3);
      }
   }

   private void a(eyk $$0, String $$1, boolean $$2, Runnable $$3) {
      tm $$4;
      tm $$5;
      if ($$2) {
         $$4 = tm.c("selectWorld.backupQuestion.customized");
         $$5 = tm.c("selectWorld.backupWarning.customized");
      } else {
         $$4 = tm.c("selectWorld.backupQuestion.experimental");
         $$5 = tm.c("selectWorld.backupWarning.experimental");
      }

      this.b.a(new ewy($$0, ($$2x, $$3x) -> {
         if ($$2x) {
            fda.a(this.c, $$1);
         }

         $$3.run();
      }, $$4, $$5, false));
   }

   public static void a(eqv $$0, fcy $$1, Lifecycle $$2, Runnable $$3, boolean $$4) {
      BooleanConsumer $$5 = $$3x -> {
         if ($$3x) {
            $$3.run();
         } else {
            $$0.a($$1);
         }
      };
      if ($$4 || $$2 == Lifecycle.stable()) {
         $$3.run();
      } else if ($$2 == Lifecycle.experimental()) {
         $$0.a(new exd($$5, tm.c("selectWorld.warning.experimental.title"), tm.c("selectWorld.warning.experimental.question")));
      } else {
         $$0.a(new exd($$5, tm.c("selectWorld.warning.deprecated.title"), tm.c("selectWorld.warning.deprecated.question")));
      }
   }
}
