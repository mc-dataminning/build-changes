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

public class frj implements aqd {
   private static final Logger b = LogUtils.getLogger();
   private static final aha c = aha.a("particles");
   private static final ahh d = new ahh("particles");
   private static final int e = 16384;
   private static final List<frl> f = ImmutableList.of(frl.a, frl.b, frl.d, frl.c, frl.e);
   protected foe a;
   private final Map<frl, Queue<frh>> g = Maps.newIdentityHashMap();
   private final Queue<fsj> h = Queues.newArrayDeque();
   private final gfc i;
   private final auw j = auw.a();
   private final Int2ObjectMap<frk<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<frh> l = Queues.newArrayDeque();
   private final Map<ahh, frj.b> m = Maps.newHashMap();
   private final gfa n;
   private final Object2IntOpenHashMap<ju> o = new Object2IntOpenHashMap();

   public frj(foe $$0, gfc $$1) {
      this.n = new gfa(gfa.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jx.a, frz.a::new);
      this.a(jx.b, fqy.a::new);
      this.a(jx.d, new fqa.a());
      this.a(jx.c, new fsg.a());
      this.a(jx.e, fqd.a::new);
      this.a(jx.an, fqc.a::new);
      this.a(jx.al, fqe.a::new);
      this.a(jx.aq, fqf.a::new);
      this.a(jx.ar, fqf.b::new);
      this.a(jx.f, frm.a::new);
      this.a(jx.N, fsf.a::new);
      this.a(jx.g, fqh.c::new);
      this.a(jx.am, fsn.a::new);
      this.a(jx.h, fqh.a::new);
      this.a(jx.i, fqi.a::new);
      this.a(jx.ap, fsf.b::new);
      this.a(jx.j, fqj::c);
      this.a(jx.k, fqj::d);
      this.a(jx.l, fqj::e);
      this.a(jx.m, fqj::a);
      this.a(jx.n, fqj::b);
      this.a(jx.o, fql.a::new);
      this.a(jx.p, fqk.a::new);
      this.a(jx.q, frz.d::new);
      this.a(jx.r, new fre.a());
      this.a(jx.s, fqh.b::new);
      this.a(jx.t, fqo.b::new);
      this.a(jx.u, fqp.a::new);
      this.a(jx.v, frz.c::new);
      this.a(jx.w, new fra.a());
      this.a(jx.x, fqz.a::new);
      this.a(jx.A, frx.a::new);
      this.a(jx.B, fqr.a::new);
      this.a(jx.y, fqw.a::new);
      this.a(jx.z, new fqx.a());
      this.a(jx.C, fqs.d::new);
      this.a(jx.D, fsm.a::new);
      this.a(jx.E, fqt.a::new);
      this.a(jx.G, fry.a::new);
      this.a(jx.H, frq.a::new);
      this.a(jx.I, frr.a::new);
      this.a(jx.K, fry.b::new);
      this.a(jx.J, fqt.a::new);
      this.a(jx.L, fqs.a::new);
      this.a(jx.M, fsf.d::new);
      this.a(jx.O, fqy.b::new);
      this.a(jx.P, frz.b::new);
      this.a(jx.Q, new fqb.a());
      this.a(jx.S, new fqb.b());
      this.a(jx.T, new fqb.c());
      this.a(jx.U, frc.a::new);
      this.a(jx.V, frd.a::new);
      this.a(jx.W, fsf.e::new);
      this.a(jx.ao, fqo.a::new);
      this.a(jx.X, frg.a::new);
      this.a(jx.Y, fqq.a::new);
      this.a(jx.Z, frn.a::new);
      this.a(jx.aa, fso.a::new);
      this.a(jx.ab, frv.a::new);
      this.a(jx.ac, fsq.a::new);
      this.a(jx.ad, frm.b::new);
      this.a(jx.aH, frw.a::new);
      this.a(jx.ae, fsa.a::new);
      this.a(jx.ag, fpy.a::new);
      this.a(jx.ah, fsi.a::new);
      this.a(jx.af, fsd.b::new);
      this.a(jx.ai, fse.c::new);
      this.a(jx.aj, fsb.a::new);
      this.a(jx.ak, frz.e::new);
      this.a(jx.as, fqj::f);
      this.a(jx.at, fqj::g);
      this.a(jx.au, fqj::h);
      this.a(jx.av, fqj::m);
      this.a(jx.aw, fqj::n);
      this.a(jx.aA, fse.b::new);
      this.a(jx.ax, fpx.a::new);
      this.a(jx.ay, fse.a::new);
      this.a(jx.az, fse.d::new);
      this.a(jx.aB, fqj::o);
      this.a(jx.aC, fqj::p);
      this.a(jx.aD, fqj::q);
      this.a(jx.aE, fro.a::new);
      this.a(jx.aF, fsp.a::new);
      this.a(jx.aG, fqt.b::new);
      this.a(jx.aK, fqj::i);
      this.a(jx.aL, fqj::j);
      this.a(jx.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fqg($$2, $$3, $$4, $$5, $$0));
      this.a(jx.aI, fqj::k);
      this.a(jx.aJ, fqj::l);
      this.a(jx.R, fsl.a::new);
      this.a(jx.aM, fsd.a::new);
      this.a(jx.aN, fqu.b::new);
      this.a(jx.aO, fqu.e::new);
      this.a(jx.aP, fqu.d::new);
      this.a(jx.aQ, fqu.a::new);
      this.a(jx.aR, fqu.c::new);
      this.a(jx.aS, frs.a::new);
      this.a(jx.aT, fsf.c::new);
      this.a(jx.aU, fqn.a::new);
      this.a(jx.aV, fqv.a::new);
      this.a(jx.aW, fsk.a::new);
   }

   private <T extends jv> void a(jw<T> $$0, frk<T> $$1) {
      this.k.put(kd.j.a($$0), $$1);
   }

   private <T extends jv> void a(jw<T> $$0, frk.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fsh $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jv> void a(jw<T> $$0, frj.c<T> $$1) {
      frj.b $$2 = new frj.b();
      this.m.put(kd.j.b($$0), $$2);
      this.k.put(kd.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      record a(ahh a, Optional<List<ahh>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ahh, aqh>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ahh $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<gew.a> $$7 = gew.a(this.n).a($$1, d, 0, $$4).thenCompose(gew.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gew.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ahh> $$5x = new HashSet<>();
         gfb $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ahh>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gfb> $$5xx = new ArrayList<>();

               for (ahh $$6xx : $$4xx.get()) {
                  gfb $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ahh::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ahh>> a(ahh $$0, aqh $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fri $$3 = fri.a(auf.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(blw $$0, jv $$1) {
      this.h.add(new fsj(this.a, $$0, $$1));
   }

   public void a(blw $$0, jv $$1, int $$2) {
      this.h.add(new fsj(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public frh a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      frh $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jv> frh b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      frk<T> $$7 = (frk<T>)this.k.get(kd.j.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(frh $$0) {
      Optional<ju> $$1 = $$0.o();
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
         this.a.af().a($$0.toString());
         this.a($$1x);
         this.a.af().c();
      });
      if (!this.h.isEmpty()) {
         List<fsj> $$0 = Lists.newArrayList();

         for (fsj $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      frh $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<frh> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<frh> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            frh $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ju $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(frh $$0) {
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

   public void a(eqk $$0, ftt.a $$1, fts $$2, evc $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      eqk $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (frl $$6 : f) {
         Iterable<frh> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(ftm::u);
            eqm $$8 = eqm.b();
            eqf $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (frh $$10 : $$7) {
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

   public void a(@Nullable foe $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hx $$0, djp $$1) {
      if (!$$1.i() && $$1.z()) {
         emv $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aup.c($$8 / 0.25));
               int $$12 = Math.max(2, aup.c($$9 / 0.25));
               int $$13 = Math.max(2, aup.c($$10 / 0.25));

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
                           new fsg(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hx $$0, ic $$1) {
      djp $$2 = this.a.a_($$0);
      if ($$2.l() != ddd.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         elx $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ic.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ic.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ic.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ic.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ic.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ic.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fsg(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ju $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fsc {
      private List<gfb> a;

      @Override
      public gfb a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gfb a(auw $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gfb> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jv> {
      frk<T> create(fsc var1);
   }
}
