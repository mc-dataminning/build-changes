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

public class fky implements ane {
   private static final Logger b = LogUtils.getLogger();
   private static final aei c = aei.a("particles");
   private static final aep d = new aep("particles");
   private static final int e = 16384;
   private static final List<fla> f = ImmutableList.of(fla.a, fla.b, fla.d, fla.c, fla.e);
   protected fie a;
   private final Map<fla, Queue<fkw>> g = Maps.newIdentityHashMap();
   private final Queue<fly> h = Queues.newArrayDeque();
   private final fyh i;
   private final art j = art.a();
   private final Int2ObjectMap<fkz<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fkw> l = Queues.newArrayDeque();
   private final Map<aep, fky.b> m = Maps.newHashMap();
   private final fyf n;
   private final Object2IntOpenHashMap<it> o = new Object2IntOpenHashMap();

   public fky(fie $$0, fyh $$1) {
      this.n = new fyf(fyf.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(iw.a, flo.a::new);
      this.a(iw.b, fkn.a::new);
      this.a(iw.d, new fjt.a());
      this.a(iw.c, new flv.a());
      this.a(iw.e, fjw.a::new);
      this.a(iw.ak, fjv.a::new);
      this.a(iw.ai, fjx.a::new);
      this.a(iw.an, fjy.a::new);
      this.a(iw.ao, fjy.b::new);
      this.a(iw.f, flb.a::new);
      this.a(iw.L, flu.a::new);
      this.a(iw.g, fka.c::new);
      this.a(iw.aj, fmb.a::new);
      this.a(iw.h, fka.a::new);
      this.a(iw.i, fkb.a::new);
      this.a(iw.am, flu.b::new);
      this.a(iw.j, fkc::c);
      this.a(iw.k, fkc::d);
      this.a(iw.l, fkc::e);
      this.a(iw.m, fkc::a);
      this.a(iw.n, fkc::b);
      this.a(iw.o, fke.a::new);
      this.a(iw.p, fkd.a::new);
      this.a(iw.q, flo.d::new);
      this.a(iw.r, new fkt.a());
      this.a(iw.s, fka.b::new);
      this.a(iw.t, fkg.b::new);
      this.a(iw.u, fkh.a::new);
      this.a(iw.v, flo.c::new);
      this.a(iw.w, new fkp.a());
      this.a(iw.x, fko.a::new);
      this.a(iw.y, flm.a::new);
      this.a(iw.z, fkj.a::new);
      this.a(iw.A, fkk.d::new);
      this.a(iw.B, fma.a::new);
      this.a(iw.C, fkl.a::new);
      this.a(iw.E, fln.a::new);
      this.a(iw.F, flf.a::new);
      this.a(iw.G, flg.a::new);
      this.a(iw.I, fln.b::new);
      this.a(iw.H, fkl.a::new);
      this.a(iw.J, fkk.a::new);
      this.a(iw.K, flu.d::new);
      this.a(iw.M, fkn.b::new);
      this.a(iw.N, flo.b::new);
      this.a(iw.O, new fju.a());
      this.a(iw.Q, new fju.b());
      this.a(iw.R, new fju.c());
      this.a(iw.S, fkr.a::new);
      this.a(iw.T, fks.a::new);
      this.a(iw.U, flu.e::new);
      this.a(iw.al, fkg.a::new);
      this.a(iw.V, fkv.a::new);
      this.a(iw.W, fki.a::new);
      this.a(iw.X, flc.a::new);
      this.a(iw.Y, fmc.a::new);
      this.a(iw.Z, flk.a::new);
      this.a(iw.aa, flb.b::new);
      this.a(iw.aE, fll.a::new);
      this.a(iw.ab, flp.a::new);
      this.a(iw.ad, fjr.a::new);
      this.a(iw.ae, flx.a::new);
      this.a(iw.ac, fls.b::new);
      this.a(iw.af, flt.c::new);
      this.a(iw.ag, flq.a::new);
      this.a(iw.ah, flo.e::new);
      this.a(iw.ap, fkc::f);
      this.a(iw.aq, fkc::g);
      this.a(iw.ar, fkc::h);
      this.a(iw.as, fkc::m);
      this.a(iw.at, fkc::n);
      this.a(iw.ax, flt.b::new);
      this.a(iw.au, fjq.a::new);
      this.a(iw.av, flt.a::new);
      this.a(iw.aw, flt.d::new);
      this.a(iw.ay, fkc::o);
      this.a(iw.az, fkc::p);
      this.a(iw.aA, fkc::q);
      this.a(iw.aB, fld.a::new);
      this.a(iw.aC, fmd.a::new);
      this.a(iw.aD, fkl.b::new);
      this.a(iw.aH, fkc::i);
      this.a(iw.aI, fkc::j);
      this.a(iw.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fjz($$2, $$3, $$4, $$5, $$0));
      this.a(iw.aF, fkc::k);
      this.a(iw.aG, fkc::l);
      this.a(iw.P, flz.a::new);
      this.a(iw.aJ, fls.a::new);
      this.a(iw.aK, fkm.b::new);
      this.a(iw.aL, fkm.e::new);
      this.a(iw.aM, fkm.d::new);
      this.a(iw.aN, fkm.a::new);
      this.a(iw.aO, fkm.c::new);
      this.a(iw.aP, flh.a::new);
      this.a(iw.aQ, flu.c::new);
   }

   private <T extends iu> void a(iv<T> $$0, fkz<T> $$1) {
      this.k.put(jc.k.a($$0), $$1);
   }

   private <T extends iu> void a(iv<T> $$0, fkz.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            flw $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends iu> void a(iv<T> $$0, fky.c<T> $$1) {
      fky.b $$2 = new fky.b();
      this.m.put(jc.k.b($$0), $$2);
      this.k.put(jc.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      record a(aep a, Optional<List<aep>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aep, ani>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aep $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fyb.a> $$7 = fyb.a(this.n).a($$1, d, 0, $$4).thenCompose(fyb.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fyb.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aep> $$5x = new HashSet<>();
         fyg $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aep>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<fyg> $$5xx = new ArrayList<>();

               for (aep $$6xx : $$4xx.get()) {
                  fyg $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aep::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aep>> a(aep $$0, ani $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fkx $$3 = fkx.a(arf.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(big $$0, iu $$1) {
      this.h.add(new fly(this.a, $$0, $$1));
   }

   public void a(big $$0, iu $$1, int $$2) {
      this.h.add(new fly(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fkw a(iu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fkw $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends iu> fkw b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fkz<T> $$7 = (fkz<T>)this.k.get(jc.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fkw $$0) {
      Optional<it> $$1 = $$0.o();
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
         List<fly> $$0 = Lists.newArrayList();

         for (fly $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fkw $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fkw> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fkw> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fkw $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(it $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fkw $$0) {
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

   public void a(elh $$0, fng.a $$1, fnf $$2, epy $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      elh $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fla $$6 : f) {
         Iterable<fkw> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fmz::u);
            elj $$8 = elj.a();
            elc $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (fkw $$10 : $$7) {
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

   public void a(@Nullable fie $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(gv $$0, dey $$1) {
      if (!$$1.i() && $$1.z()) {
         ehy $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aro.c($$8 / 0.25));
               int $$12 = Math.max(2, aro.c($$9 / 0.25));
               int $$13 = Math.max(2, aro.c($$10 / 0.25));

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
                           new flv(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(gv $$0, hb $$1) {
      dey $$2 = this.a.a_($$0);
      if ($$2.l() != cyp.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eha $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == hb.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == hb.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == hb.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == hb.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == hb.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == hb.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new flv(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(it $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements flr {
      private List<fyg> a;

      @Override
      public fyg a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public fyg a(art $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<fyg> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends iu> {
      fkz<T> create(flr var1);
   }
}
