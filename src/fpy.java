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

public class fpy implements apm {
   private static final Logger b = LogUtils.getLogger();
   private static final agm c = agm.a("particles");
   private static final agt d = new agt("particles");
   private static final int e = 16384;
   private static final List<fqa> f = ImmutableList.of(fqa.a, fqa.b, fqa.d, fqa.c, fqa.e);
   protected fmt a;
   private final Map<fqa, Queue<fpw>> g = Maps.newIdentityHashMap();
   private final Queue<fqy> h = Queues.newArrayDeque();
   private final gdp i;
   private final auf j = auf.a();
   private final Int2ObjectMap<fpz<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fpw> l = Queues.newArrayDeque();
   private final Map<agt, fpy.b> m = Maps.newHashMap();
   private final gdn n;
   private final Object2IntOpenHashMap<js> o = new Object2IntOpenHashMap();

   public fpy(fmt $$0, gdp $$1) {
      this.n = new gdn(gdn.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jv.a, fqo.a::new);
      this.a(jv.b, fpn.a::new);
      this.a(jv.d, new foo.a());
      this.a(jv.c, new fqv.a());
      this.a(jv.e, fos.a::new);
      this.a(jv.an, foq.a::new);
      this.a(jv.al, fot.a::new);
      this.a(jv.aq, fou.a::new);
      this.a(jv.ar, fou.b::new);
      this.a(jv.f, fqb.a::new);
      this.a(jv.N, fqu.a::new);
      this.a(jv.g, fow.c::new);
      this.a(jv.am, frc.a::new);
      this.a(jv.h, fow.a::new);
      this.a(jv.i, fox.a::new);
      this.a(jv.ap, fqu.b::new);
      this.a(jv.j, foy::c);
      this.a(jv.k, foy::d);
      this.a(jv.l, foy::e);
      this.a(jv.m, foy::a);
      this.a(jv.n, foy::b);
      this.a(jv.o, fpa.a::new);
      this.a(jv.p, foz.a::new);
      this.a(jv.q, fqo.d::new);
      this.a(jv.r, new fpt.a());
      this.a(jv.s, fow.b::new);
      this.a(jv.t, fpd.b::new);
      this.a(jv.u, fpe.a::new);
      this.a(jv.v, fqo.c::new);
      this.a(jv.w, new fpp.a());
      this.a(jv.x, fpo.a::new);
      this.a(jv.A, fqm.a::new);
      this.a(jv.B, fpg.a::new);
      this.a(jv.y, fpl.a::new);
      this.a(jv.z, new fpm.a());
      this.a(jv.C, fph.d::new);
      this.a(jv.D, frb.a::new);
      this.a(jv.E, fpi.a::new);
      this.a(jv.G, fqn.a::new);
      this.a(jv.H, fqf.a::new);
      this.a(jv.I, fqg.a::new);
      this.a(jv.K, fqn.b::new);
      this.a(jv.J, fpi.a::new);
      this.a(jv.L, fph.a::new);
      this.a(jv.M, fqu.d::new);
      this.a(jv.O, fpn.b::new);
      this.a(jv.P, fqo.b::new);
      this.a(jv.Q, new fop.a());
      this.a(jv.S, new fop.b());
      this.a(jv.T, new fop.c());
      this.a(jv.U, fpr.a::new);
      this.a(jv.V, fps.a::new);
      this.a(jv.W, fqu.e::new);
      this.a(jv.ao, fpd.a::new);
      this.a(jv.X, fpv.a::new);
      this.a(jv.Y, fpf.a::new);
      this.a(jv.Z, fqc.a::new);
      this.a(jv.aa, frd.a::new);
      this.a(jv.ab, fqk.a::new);
      this.a(jv.ac, frf.a::new);
      this.a(jv.ad, fqb.b::new);
      this.a(jv.aH, fql.a::new);
      this.a(jv.ae, fqp.a::new);
      this.a(jv.ag, fom.a::new);
      this.a(jv.ah, fqx.a::new);
      this.a(jv.af, fqs.b::new);
      this.a(jv.ai, fqt.c::new);
      this.a(jv.aj, fqq.a::new);
      this.a(jv.ak, fqo.e::new);
      this.a(jv.as, foy::f);
      this.a(jv.at, foy::g);
      this.a(jv.au, foy::h);
      this.a(jv.av, foy::m);
      this.a(jv.aw, foy::n);
      this.a(jv.aA, fqt.b::new);
      this.a(jv.ax, fol.a::new);
      this.a(jv.ay, fqt.a::new);
      this.a(jv.az, fqt.d::new);
      this.a(jv.aB, foy::o);
      this.a(jv.aC, foy::p);
      this.a(jv.aD, foy::q);
      this.a(jv.aE, fqd.a::new);
      this.a(jv.aF, fre.a::new);
      this.a(jv.aG, fpi.b::new);
      this.a(jv.aK, foy::i);
      this.a(jv.aL, foy::j);
      this.a(jv.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fov($$2, $$3, $$4, $$5, $$0));
      this.a(jv.aI, foy::k);
      this.a(jv.aJ, foy::l);
      this.a(jv.R, fra.a::new);
      this.a(jv.aM, fqs.a::new);
      this.a(jv.aN, fpj.b::new);
      this.a(jv.aO, fpj.e::new);
      this.a(jv.aP, fpj.d::new);
      this.a(jv.aQ, fpj.a::new);
      this.a(jv.aR, fpj.c::new);
      this.a(jv.aS, fqh.a::new);
      this.a(jv.aT, fqu.c::new);
      this.a(jv.aU, fpc.a::new);
      this.a(jv.aV, fpk.a::new);
      this.a(jv.aW, fqz.a::new);
   }

   private <T extends jt> void a(ju<T> $$0, fpz<T> $$1) {
      this.k.put(kb.j.a($$0), $$1);
   }

   private <T extends jt> void a(ju<T> $$0, fpz.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fqw $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jt> void a(ju<T> $$0, fpy.c<T> $$1) {
      fpy.b $$2 = new fpy.b();
      this.m.put(kb.j.b($$0), $$2);
      this.k.put(kb.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      record a(agt a, Optional<List<agt>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<agt, apq>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            agt $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<gdj.a> $$7 = gdj.a(this.n).a($$1, d, 0, $$4).thenCompose(gdj.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gdj.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<agt> $$5x = new HashSet<>();
         gdo $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<agt>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gdo> $$5xx = new ArrayList<>();

               for (agt $$6xx : $$4xx.get()) {
                  gdo $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(agt::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<agt>> a(agt $$0, apq $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fpx $$3 = fpx.a(ato.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(blf $$0, jt $$1) {
      this.h.add(new fqy(this.a, $$0, $$1));
   }

   public void a(blf $$0, jt $$1, int $$2) {
      this.h.add(new fqy(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fpw a(jt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fpw $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jt> fpw b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fpz<T> $$7 = (fpz<T>)this.k.get(kb.j.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fpw $$0) {
      Optional<js> $$1 = $$0.o();
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
         this.a.ae().a($$0.toString());
         this.a($$1x);
         this.a.ae().c();
      });
      if (!this.h.isEmpty()) {
         List<fqy> $$0 = Lists.newArrayList();

         for (fqy $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fpw $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fpw> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fpw> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fpw $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(js $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fpw $$0) {
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

   public void a(epd $$0, fsi.a $$1, fsh $$2, etv $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      epd $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fqa $$6 : f) {
         Iterable<fpw> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fsb::u);
            epf $$8 = epf.b();
            eoy $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (fpw $$10 : $$7) {
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

   public void a(@Nullable fmt $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hv $$0, dip $$1) {
      if (!$$1.i() && $$1.z()) {
         elu $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aty.c($$8 / 0.25));
               int $$12 = Math.max(2, aty.c($$9 / 0.25));
               int $$13 = Math.max(2, aty.c($$10 / 0.25));

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
                           new fqv(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hv $$0, ia $$1) {
      dip $$2 = this.a.a_($$0);
      if ($$2.l() != dce.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ekw $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ia.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ia.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ia.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ia.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ia.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ia.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fqv(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(js $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fqr {
      private List<gdo> a;

      @Override
      public gdo a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gdo a(auf $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gdo> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jt> {
      fpz<T> create(fqr var1);
   }
}
