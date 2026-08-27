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

public class fqv implements aqb {
   private static final Logger b = LogUtils.getLogger();
   private static final agz c = agz.a("particles");
   private static final ahg d = new ahg("particles");
   private static final int e = 16384;
   private static final List<fqx> f = ImmutableList.of(fqx.a, fqx.b, fqx.d, fqx.c, fqx.e);
   protected fnq a;
   private final Map<fqx, Queue<fqt>> g = Maps.newIdentityHashMap();
   private final Queue<frv> h = Queues.newArrayDeque();
   private final gem i;
   private final auu j = auu.a();
   private final Int2ObjectMap<fqw<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fqt> l = Queues.newArrayDeque();
   private final Map<ahg, fqv.b> m = Maps.newHashMap();
   private final gek n;
   private final Object2IntOpenHashMap<ju> o = new Object2IntOpenHashMap();

   public fqv(fnq $$0, gem $$1) {
      this.n = new gek(gek.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jx.a, frl.a::new);
      this.a(jx.b, fqk.a::new);
      this.a(jx.d, new fpm.a());
      this.a(jx.c, new frs.a());
      this.a(jx.e, fpp.a::new);
      this.a(jx.an, fpo.a::new);
      this.a(jx.al, fpq.a::new);
      this.a(jx.aq, fpr.a::new);
      this.a(jx.ar, fpr.b::new);
      this.a(jx.f, fqy.a::new);
      this.a(jx.N, frr.a::new);
      this.a(jx.g, fpt.c::new);
      this.a(jx.am, frz.a::new);
      this.a(jx.h, fpt.a::new);
      this.a(jx.i, fpu.a::new);
      this.a(jx.ap, frr.b::new);
      this.a(jx.j, fpv::c);
      this.a(jx.k, fpv::d);
      this.a(jx.l, fpv::e);
      this.a(jx.m, fpv::a);
      this.a(jx.n, fpv::b);
      this.a(jx.o, fpx.a::new);
      this.a(jx.p, fpw.a::new);
      this.a(jx.q, frl.d::new);
      this.a(jx.r, new fqq.a());
      this.a(jx.s, fpt.b::new);
      this.a(jx.t, fqa.b::new);
      this.a(jx.u, fqb.a::new);
      this.a(jx.v, frl.c::new);
      this.a(jx.w, new fqm.a());
      this.a(jx.x, fql.a::new);
      this.a(jx.A, frj.a::new);
      this.a(jx.B, fqd.a::new);
      this.a(jx.y, fqi.a::new);
      this.a(jx.z, new fqj.a());
      this.a(jx.C, fqe.d::new);
      this.a(jx.D, fry.a::new);
      this.a(jx.E, fqf.a::new);
      this.a(jx.G, frk.a::new);
      this.a(jx.H, frc.a::new);
      this.a(jx.I, frd.a::new);
      this.a(jx.K, frk.b::new);
      this.a(jx.J, fqf.a::new);
      this.a(jx.L, fqe.a::new);
      this.a(jx.M, frr.d::new);
      this.a(jx.O, fqk.b::new);
      this.a(jx.P, frl.b::new);
      this.a(jx.Q, new fpn.a());
      this.a(jx.S, new fpn.b());
      this.a(jx.T, new fpn.c());
      this.a(jx.U, fqo.a::new);
      this.a(jx.V, fqp.a::new);
      this.a(jx.W, frr.e::new);
      this.a(jx.ao, fqa.a::new);
      this.a(jx.X, fqs.a::new);
      this.a(jx.Y, fqc.a::new);
      this.a(jx.Z, fqz.a::new);
      this.a(jx.aa, fsa.a::new);
      this.a(jx.ab, frh.a::new);
      this.a(jx.ac, fsc.a::new);
      this.a(jx.ad, fqy.b::new);
      this.a(jx.aH, fri.a::new);
      this.a(jx.ae, frm.a::new);
      this.a(jx.ag, fpk.a::new);
      this.a(jx.ah, fru.a::new);
      this.a(jx.af, frp.b::new);
      this.a(jx.ai, frq.c::new);
      this.a(jx.aj, frn.a::new);
      this.a(jx.ak, frl.e::new);
      this.a(jx.as, fpv::f);
      this.a(jx.at, fpv::g);
      this.a(jx.au, fpv::h);
      this.a(jx.av, fpv::m);
      this.a(jx.aw, fpv::n);
      this.a(jx.aA, frq.b::new);
      this.a(jx.ax, fpj.a::new);
      this.a(jx.ay, frq.a::new);
      this.a(jx.az, frq.d::new);
      this.a(jx.aB, fpv::o);
      this.a(jx.aC, fpv::p);
      this.a(jx.aD, fpv::q);
      this.a(jx.aE, fra.a::new);
      this.a(jx.aF, fsb.a::new);
      this.a(jx.aG, fqf.b::new);
      this.a(jx.aK, fpv::i);
      this.a(jx.aL, fpv::j);
      this.a(jx.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fps($$2, $$3, $$4, $$5, $$0));
      this.a(jx.aI, fpv::k);
      this.a(jx.aJ, fpv::l);
      this.a(jx.R, frx.a::new);
      this.a(jx.aM, frp.a::new);
      this.a(jx.aN, fqg.b::new);
      this.a(jx.aO, fqg.e::new);
      this.a(jx.aP, fqg.d::new);
      this.a(jx.aQ, fqg.a::new);
      this.a(jx.aR, fqg.c::new);
      this.a(jx.aS, fre.a::new);
      this.a(jx.aT, frr.c::new);
      this.a(jx.aU, fpz.a::new);
      this.a(jx.aV, fqh.a::new);
      this.a(jx.aW, frw.a::new);
   }

   private <T extends jv> void a(jw<T> $$0, fqw<T> $$1) {
      this.k.put(kd.j.a($$0), $$1);
   }

   private <T extends jv> void a(jw<T> $$0, fqw.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            frt $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jv> void a(jw<T> $$0, fqv.c<T> $$1) {
      fqv.b $$2 = new fqv.b();
      this.m.put(kd.j.b($$0), $$2);
      this.k.put(kd.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      record a(ahg a, Optional<List<ahg>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ahg, aqf>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ahg $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<geg.a> $$7 = geg.a(this.n).a($$1, d, 0, $$4).thenCompose(geg.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         geg.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ahg> $$5x = new HashSet<>();
         gel $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ahg>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gel> $$5xx = new ArrayList<>();

               for (ahg $$6xx : $$4xx.get()) {
                  gel $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ahg::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ahg>> a(ahg $$0, aqf $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fqu $$3 = fqu.a(aud.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(blu $$0, jv $$1) {
      this.h.add(new frv(this.a, $$0, $$1));
   }

   public void a(blu $$0, jv $$1, int $$2) {
      this.h.add(new frv(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fqt a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fqt $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jv> fqt b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fqw<T> $$7 = (fqw<T>)this.k.get(kd.j.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fqt $$0) {
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
         List<frv> $$0 = Lists.newArrayList();

         for (frv $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fqt $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fqt> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fqt> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fqt $$2 = $$1.next();
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

   private void b(fqt $$0) {
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

   public void a(epz $$0, ftf.a $$1, fte $$2, eur $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      epz $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fqx $$6 : f) {
         Iterable<fqt> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fsy::u);
            eqb $$8 = eqb.b();
            epu $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (fqt $$10 : $$7) {
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

   public void a(@Nullable fnq $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hx $$0, djg $$1) {
      if (!$$1.i() && $$1.z()) {
         eml $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aun.c($$8 / 0.25));
               int $$12 = Math.max(2, aun.c($$9 / 0.25));
               int $$13 = Math.max(2, aun.c($$10 / 0.25));

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
                           new frs(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hx $$0, ic $$1) {
      djg $$2 = this.a.a_($$0);
      if ($$2.l() != dcu.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eln $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new frs(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fro {
      private List<gel> a;

      @Override
      public gel a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gel a(auu $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gel> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jv> {
      fqw<T> create(fro var1);
   }
}
