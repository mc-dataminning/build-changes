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

public class fly implements anp {
   private static final Logger b = LogUtils.getLogger();
   private static final aer c = aer.a("particles");
   private static final aey d = new aey("particles");
   private static final int e = 16384;
   private static final List<fma> f = ImmutableList.of(fma.a, fma.b, fma.d, fma.c, fma.e);
   protected fiz a;
   private final Map<fma, Queue<flw>> g = Maps.newIdentityHashMap();
   private final Queue<fmy> h = Queues.newArrayDeque();
   private final fzh i;
   private final ase j = ase.a();
   private final Int2ObjectMap<flz<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<flw> l = Queues.newArrayDeque();
   private final Map<aey, fly.b> m = Maps.newHashMap();
   private final fzf n;
   private final Object2IntOpenHashMap<iu> o = new Object2IntOpenHashMap();

   public fly(fiz $$0, fzh $$1) {
      this.n = new fzf(fzf.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ix.a, fmo.a::new);
      this.a(ix.b, fln.a::new);
      this.a(ix.d, new fkt.a());
      this.a(ix.c, new fmv.a());
      this.a(ix.e, fkw.a::new);
      this.a(ix.ak, fkv.a::new);
      this.a(ix.ai, fkx.a::new);
      this.a(ix.an, fky.a::new);
      this.a(ix.ao, fky.b::new);
      this.a(ix.f, fmb.a::new);
      this.a(ix.L, fmu.a::new);
      this.a(ix.g, fla.c::new);
      this.a(ix.aj, fnb.a::new);
      this.a(ix.h, fla.a::new);
      this.a(ix.i, flb.a::new);
      this.a(ix.am, fmu.b::new);
      this.a(ix.j, flc::c);
      this.a(ix.k, flc::d);
      this.a(ix.l, flc::e);
      this.a(ix.m, flc::a);
      this.a(ix.n, flc::b);
      this.a(ix.o, fle.a::new);
      this.a(ix.p, fld.a::new);
      this.a(ix.q, fmo.d::new);
      this.a(ix.r, new flt.a());
      this.a(ix.s, fla.b::new);
      this.a(ix.t, flg.b::new);
      this.a(ix.u, flh.a::new);
      this.a(ix.v, fmo.c::new);
      this.a(ix.w, new flp.a());
      this.a(ix.x, flo.a::new);
      this.a(ix.y, fmm.a::new);
      this.a(ix.z, flj.a::new);
      this.a(ix.A, flk.d::new);
      this.a(ix.B, fna.a::new);
      this.a(ix.C, fll.a::new);
      this.a(ix.E, fmn.a::new);
      this.a(ix.F, fmf.a::new);
      this.a(ix.G, fmg.a::new);
      this.a(ix.I, fmn.b::new);
      this.a(ix.H, fll.a::new);
      this.a(ix.J, flk.a::new);
      this.a(ix.K, fmu.d::new);
      this.a(ix.M, fln.b::new);
      this.a(ix.N, fmo.b::new);
      this.a(ix.O, new fku.a());
      this.a(ix.Q, new fku.b());
      this.a(ix.R, new fku.c());
      this.a(ix.S, flr.a::new);
      this.a(ix.T, fls.a::new);
      this.a(ix.U, fmu.e::new);
      this.a(ix.al, flg.a::new);
      this.a(ix.V, flv.a::new);
      this.a(ix.W, fli.a::new);
      this.a(ix.X, fmc.a::new);
      this.a(ix.Y, fnc.a::new);
      this.a(ix.Z, fmk.a::new);
      this.a(ix.aa, fmb.b::new);
      this.a(ix.aE, fml.a::new);
      this.a(ix.ab, fmp.a::new);
      this.a(ix.ad, fkr.a::new);
      this.a(ix.ae, fmx.a::new);
      this.a(ix.ac, fms.b::new);
      this.a(ix.af, fmt.c::new);
      this.a(ix.ag, fmq.a::new);
      this.a(ix.ah, fmo.e::new);
      this.a(ix.ap, flc::f);
      this.a(ix.aq, flc::g);
      this.a(ix.ar, flc::h);
      this.a(ix.as, flc::m);
      this.a(ix.at, flc::n);
      this.a(ix.ax, fmt.b::new);
      this.a(ix.au, fkq.a::new);
      this.a(ix.av, fmt.a::new);
      this.a(ix.aw, fmt.d::new);
      this.a(ix.ay, flc::o);
      this.a(ix.az, flc::p);
      this.a(ix.aA, flc::q);
      this.a(ix.aB, fmd.a::new);
      this.a(ix.aC, fnd.a::new);
      this.a(ix.aD, fll.b::new);
      this.a(ix.aH, flc::i);
      this.a(ix.aI, flc::j);
      this.a(ix.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fkz($$2, $$3, $$4, $$5, $$0));
      this.a(ix.aF, flc::k);
      this.a(ix.aG, flc::l);
      this.a(ix.P, fmz.a::new);
      this.a(ix.aJ, fms.a::new);
      this.a(ix.aK, flm.b::new);
      this.a(ix.aL, flm.e::new);
      this.a(ix.aM, flm.d::new);
      this.a(ix.aN, flm.a::new);
      this.a(ix.aO, flm.c::new);
      this.a(ix.aP, fmh.a::new);
      this.a(ix.aQ, fmu.c::new);
   }

   private <T extends iv> void a(iw<T> $$0, flz<T> $$1) {
      this.k.put(jd.k.a($$0), $$1);
   }

   private <T extends iv> void a(iw<T> $$0, flz.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fmw $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends iv> void a(iw<T> $$0, fly.c<T> $$1) {
      fly.b $$2 = new fly.b();
      this.m.put(jd.k.b($$0), $$2);
      this.k.put(jd.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      record a(aey a, Optional<List<aey>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aey, ant>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aey $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fzb.a> $$7 = fzb.a(this.n).a($$1, d, 0, $$4).thenCompose(fzb.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fzb.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aey> $$5x = new HashSet<>();
         fzg $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aey>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<fzg> $$5xx = new ArrayList<>();

               for (aey $$6xx : $$4xx.get()) {
                  fzg $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aey::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aey>> a(aey $$0, ant $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               flx $$3 = flx.a(arp.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bis $$0, iv $$1) {
      this.h.add(new fmy(this.a, $$0, $$1));
   }

   public void a(bis $$0, iv $$1, int $$2) {
      this.h.add(new fmy(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public flw a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flw $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends iv> flw b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flz<T> $$7 = (flz<T>)this.k.get(jd.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(flw $$0) {
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
         List<fmy> $$0 = Lists.newArrayList();

         for (fmy $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      flw $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<flw> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<flw> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            flw $$2 = $$1.next();
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

   private void b(flw $$0) {
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

   public void a(elr $$0, fog.a $$1, fof $$2, eqi $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      elr $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fma $$6 : f) {
         Iterable<flw> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fnz::u);
            elt $$8 = elt.a();
            elm $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (flw $$10 : $$7) {
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

   public void a(@Nullable fiz $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(gw $$0, dfl $$1) {
      if (!$$1.i() && $$1.z()) {
         eii $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ary.c($$8 / 0.25));
               int $$12 = Math.max(2, ary.c($$9 / 0.25));
               int $$13 = Math.max(2, ary.c($$10 / 0.25));

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
                           new fmv(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(gw $$0, hc $$1) {
      dfl $$2 = this.a.a_($$0);
      if ($$2.l() != czc.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ehk $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new fmv(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fmr {
      private List<fzg> a;

      @Override
      public fzg a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public fzg a(ase $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<fzg> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends iv> {
      flz<T> create(fmr var1);
   }
}
