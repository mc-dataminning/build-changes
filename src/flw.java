import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flw implements ano {
   private static final Logger b = LogUtils.getLogger();
   private static final aeq c = aeq.a("particles");
   private static final aex d = new aex("particles");
   private static final int e = 16384;
   private static final List<fly> f = ImmutableList.of(fly.a, fly.b, fly.d, fly.c, fly.e);
   protected fix a;
   private final Map<fly, Queue<flu>> g = Maps.newIdentityHashMap();
   private final Queue<fmw> h = Queues.newArrayDeque();
   private final fzf i;
   private final asc j = asc.a();
   private final Int2ObjectMap<flx<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<flu> l = Queues.newArrayDeque();
   private final Map<aex, flw.b> m = Maps.newHashMap();
   private final fzd n;
   private final Object2IntOpenHashMap<iu> o = new Object2IntOpenHashMap();

   public flw(fix $$0, fzf $$1) {
      this.n = new fzd(fzd.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ix.a, fmm.a::new);
      this.a(ix.b, fll.a::new);
      this.a(ix.d, new fkr.a());
      this.a(ix.c, new fmt.a());
      this.a(ix.e, fku.a::new);
      this.a(ix.ak, fkt.a::new);
      this.a(ix.ai, fkv.a::new);
      this.a(ix.an, fkw.a::new);
      this.a(ix.ao, fkw.b::new);
      this.a(ix.f, flz.a::new);
      this.a(ix.L, fms.a::new);
      this.a(ix.g, fky.c::new);
      this.a(ix.aj, fmz.a::new);
      this.a(ix.h, fky.a::new);
      this.a(ix.i, fkz.a::new);
      this.a(ix.am, fms.b::new);
      this.a(ix.j, fla::c);
      this.a(ix.k, fla::d);
      this.a(ix.l, fla::e);
      this.a(ix.m, fla::a);
      this.a(ix.n, fla::b);
      this.a(ix.o, flc.a::new);
      this.a(ix.p, flb.a::new);
      this.a(ix.q, fmm.d::new);
      this.a(ix.r, new flr.a());
      this.a(ix.s, fky.b::new);
      this.a(ix.t, fle.b::new);
      this.a(ix.u, flf.a::new);
      this.a(ix.v, fmm.c::new);
      this.a(ix.w, new fln.a());
      this.a(ix.x, flm.a::new);
      this.a(ix.y, fmk.a::new);
      this.a(ix.z, flh.a::new);
      this.a(ix.A, fli.d::new);
      this.a(ix.B, fmy.a::new);
      this.a(ix.C, flj.a::new);
      this.a(ix.E, fml.a::new);
      this.a(ix.F, fmd.a::new);
      this.a(ix.G, fme.a::new);
      this.a(ix.I, fml.b::new);
      this.a(ix.H, flj.a::new);
      this.a(ix.J, fli.a::new);
      this.a(ix.K, fms.d::new);
      this.a(ix.M, fll.b::new);
      this.a(ix.N, fmm.b::new);
      this.a(ix.O, new fks.a());
      this.a(ix.Q, new fks.b());
      this.a(ix.R, new fks.c());
      this.a(ix.S, flp.a::new);
      this.a(ix.T, flq.a::new);
      this.a(ix.U, fms.e::new);
      this.a(ix.al, fle.a::new);
      this.a(ix.V, flt.a::new);
      this.a(ix.W, flg.a::new);
      this.a(ix.X, fma.a::new);
      this.a(ix.Y, fna.a::new);
      this.a(ix.Z, fmi.a::new);
      this.a(ix.aa, flz.b::new);
      this.a(ix.aE, fmj.a::new);
      this.a(ix.ab, fmn.a::new);
      this.a(ix.ad, fkp.a::new);
      this.a(ix.ae, fmv.a::new);
      this.a(ix.ac, fmq.b::new);
      this.a(ix.af, fmr.c::new);
      this.a(ix.ag, fmo.a::new);
      this.a(ix.ah, fmm.e::new);
      this.a(ix.ap, fla::f);
      this.a(ix.aq, fla::g);
      this.a(ix.ar, fla::h);
      this.a(ix.as, fla::m);
      this.a(ix.at, fla::n);
      this.a(ix.ax, fmr.b::new);
      this.a(ix.au, fko.a::new);
      this.a(ix.av, fmr.a::new);
      this.a(ix.aw, fmr.d::new);
      this.a(ix.ay, fla::o);
      this.a(ix.az, fla::p);
      this.a(ix.aA, fla::q);
      this.a(ix.aB, fmb.a::new);
      this.a(ix.aC, fnb.a::new);
      this.a(ix.aD, flj.b::new);
      this.a(ix.aH, fla::i);
      this.a(ix.aI, fla::j);
      this.a(ix.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fkx($$2, $$3, $$4, $$5, $$0));
      this.a(ix.aF, fla::k);
      this.a(ix.aG, fla::l);
      this.a(ix.P, fmx.a::new);
      this.a(ix.aJ, fmq.a::new);
      this.a(ix.aK, flk.b::new);
      this.a(ix.aL, flk.e::new);
      this.a(ix.aM, flk.d::new);
      this.a(ix.aN, flk.a::new);
      this.a(ix.aO, flk.c::new);
      this.a(ix.aP, fmf.a::new);
      this.a(ix.aQ, fms.c::new);
   }

   private <T extends iv> void a(iw<T> $$0, flx<T> $$1) {
      this.k.put(jd.k.a($$0), $$1);
   }

   private <T extends iv> void a(iw<T> $$0, flx.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fmu $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends iv> void a(iw<T> $$0, flw.c<T> $$1) {
      flw.b $$2 = new flw.b();
      this.m.put(jd.k.b($$0), $$2);
      this.k.put(jd.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(ano.a $$0, anu $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      record a(aex a, Optional<List<aex>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aex, ans>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aex $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fyz.a> $$7 = fyz.a(this.n).a($$1, d, 0, $$4).thenCompose(fyz.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fyz.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aex> $$5x = new HashSet<>();
         fze $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aex>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<fze> $$5xx = new ArrayList<>();

               for (aex $$6xx : $$4xx.get()) {
                  fze $$7x = $$4x.f().get($$6xx);
                  if ($$7x == null) {
                     $$5x.add($$6xx);
                     $$5xx.add($$6x);
                  } else {
                     $$5xx.add($$7x);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6x);
               }

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aex::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aex>> a(aex $$0, ans $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               flv $$3 = flv.a(aro.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(biq $$0, iv $$1) {
      this.h.add(new fmw(this.a, $$0, $$1));
   }

   public void a(biq $$0, iv $$1, int $$2) {
      this.h.add(new fmw(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public flu a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flu $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends iv> flu b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flx<T> $$7 = (flx<T>)this.k.get(jd.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(flu $$0) {
      Optional<iu> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.l.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.l.add($$0);
      }
   }

   public void b() {
      this.g.forEach(($$0, $$1x) -> {
         this.a.ad().a($$0.toString());
         this.a($$1x);
         this.a.ad().c();
      });
      if (!this.h.isEmpty()) {
         List<fmw> $$0 = Lists.newArrayList();

         for (fmw $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      flu $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<flu> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<flu> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            flu $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(iu $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(flu $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         o $$2 = o.a(var5, "Ticking Particle");
         p $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new y($$2);
      }
   }

   public void a(elp $$0, foe.a $$1, fod $$2, eqg $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      elp $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fly $$6 : f) {
         Iterable<flu> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fnx::u);
            elr $$8 = elr.a();
            elk $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (flu $$10 : $$7) {
               try {
                  $$10.a($$9, $$3, $$4);
               } catch (Throwable var17) {
                  o $$12 = o.a(var17, "Rendering Particle");
                  p $$13 = $$12.a("Particle being rendered");
                  $$13.a("Particle", $$10::toString);
                  $$13.a("Particle Type", $$6::toString);
                  throw new y($$12);
               }
            }

            $$6.a($$8);
         }
      }

      $$5.b();
      RenderSystem.applyModelViewMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$2.b();
   }

   public void a(@Nullable fix $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(gw $$0, dfj $$1) {
      if (!$$1.i() && $$1.z()) {
         eig $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, arx.c($$8 / 0.25));
               int $$12 = Math.max(2, arx.c($$9 / 0.25));
               int $$13 = Math.max(2, arx.c($$10 / 0.25));

               for (int $$14 = 0; $$14 < $$11; $$14++) {
                  for (int $$15 = 0; $$15 < $$12; $$15++) {
                     for (int $$16 = 0; $$16 < $$13; $$16++) {
                        double $$17 = ((double)$$14 + 0.5) / (double)$$11;
                        double $$18 = ((double)$$15 + 0.5) / (double)$$12;
                        double $$19 = ((double)$$16 + 0.5) / (double)$$13;
                        double $$20 = $$17 * $$8 + $$2x;
                        double $$21 = $$18 * $$9 + $$3x;
                        double $$22 = $$19 * $$10 + $$4;
                        this.a(
                           new fmt(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(gw $$0, hc $$1) {
      dfj $$2 = this.a.a_($$0);
      if ($$2.l() != cza.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ehi $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == hc.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == hc.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == hc.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == hc.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == hc.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == hc.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fmt(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(iu $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fmp {
      private List<fze> a;

      @Override
      public fze a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public fze a(asc $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<fze> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends iv> {
      flx<T> create(fmp var1);
   }
}
