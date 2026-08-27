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

public class fqp implements apw {
   private static final Logger b = LogUtils.getLogger();
   private static final agw c = agw.a("particles");
   private static final ahd d = new ahd("particles");
   private static final int e = 16384;
   private static final List<fqr> f = ImmutableList.of(fqr.a, fqr.b, fqr.d, fqr.c, fqr.e);
   protected fnk a;
   private final Map<fqr, Queue<fqn>> g = Maps.newIdentityHashMap();
   private final Queue<frp> h = Queues.newArrayDeque();
   private final geg i;
   private final aup j = aup.a();
   private final Int2ObjectMap<fqq<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fqn> l = Queues.newArrayDeque();
   private final Map<ahd, fqp.b> m = Maps.newHashMap();
   private final gee n;
   private final Object2IntOpenHashMap<ju> o = new Object2IntOpenHashMap();

   public fqp(fnk $$0, geg $$1) {
      this.n = new gee(gee.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jx.a, frf.a::new);
      this.a(jx.b, fqe.a::new);
      this.a(jx.d, new fpg.a());
      this.a(jx.c, new frm.a());
      this.a(jx.e, fpj.a::new);
      this.a(jx.an, fpi.a::new);
      this.a(jx.al, fpk.a::new);
      this.a(jx.aq, fpl.a::new);
      this.a(jx.ar, fpl.b::new);
      this.a(jx.f, fqs.a::new);
      this.a(jx.N, frl.a::new);
      this.a(jx.g, fpn.c::new);
      this.a(jx.am, frt.a::new);
      this.a(jx.h, fpn.a::new);
      this.a(jx.i, fpo.a::new);
      this.a(jx.ap, frl.b::new);
      this.a(jx.j, fpp::c);
      this.a(jx.k, fpp::d);
      this.a(jx.l, fpp::e);
      this.a(jx.m, fpp::a);
      this.a(jx.n, fpp::b);
      this.a(jx.o, fpr.a::new);
      this.a(jx.p, fpq.a::new);
      this.a(jx.q, frf.d::new);
      this.a(jx.r, new fqk.a());
      this.a(jx.s, fpn.b::new);
      this.a(jx.t, fpu.b::new);
      this.a(jx.u, fpv.a::new);
      this.a(jx.v, frf.c::new);
      this.a(jx.w, new fqg.a());
      this.a(jx.x, fqf.a::new);
      this.a(jx.A, frd.a::new);
      this.a(jx.B, fpx.a::new);
      this.a(jx.y, fqc.a::new);
      this.a(jx.z, new fqd.a());
      this.a(jx.C, fpy.d::new);
      this.a(jx.D, frs.a::new);
      this.a(jx.E, fpz.a::new);
      this.a(jx.G, fre.a::new);
      this.a(jx.H, fqw.a::new);
      this.a(jx.I, fqx.a::new);
      this.a(jx.K, fre.b::new);
      this.a(jx.J, fpz.a::new);
      this.a(jx.L, fpy.a::new);
      this.a(jx.M, frl.d::new);
      this.a(jx.O, fqe.b::new);
      this.a(jx.P, frf.b::new);
      this.a(jx.Q, new fph.a());
      this.a(jx.S, new fph.b());
      this.a(jx.T, new fph.c());
      this.a(jx.U, fqi.a::new);
      this.a(jx.V, fqj.a::new);
      this.a(jx.W, frl.e::new);
      this.a(jx.ao, fpu.a::new);
      this.a(jx.X, fqm.a::new);
      this.a(jx.Y, fpw.a::new);
      this.a(jx.Z, fqt.a::new);
      this.a(jx.aa, fru.a::new);
      this.a(jx.ab, frb.a::new);
      this.a(jx.ac, frw.a::new);
      this.a(jx.ad, fqs.b::new);
      this.a(jx.aH, frc.a::new);
      this.a(jx.ae, frg.a::new);
      this.a(jx.ag, fpe.a::new);
      this.a(jx.ah, fro.a::new);
      this.a(jx.af, frj.b::new);
      this.a(jx.ai, frk.c::new);
      this.a(jx.aj, frh.a::new);
      this.a(jx.ak, frf.e::new);
      this.a(jx.as, fpp::f);
      this.a(jx.at, fpp::g);
      this.a(jx.au, fpp::h);
      this.a(jx.av, fpp::m);
      this.a(jx.aw, fpp::n);
      this.a(jx.aA, frk.b::new);
      this.a(jx.ax, fpd.a::new);
      this.a(jx.ay, frk.a::new);
      this.a(jx.az, frk.d::new);
      this.a(jx.aB, fpp::o);
      this.a(jx.aC, fpp::p);
      this.a(jx.aD, fpp::q);
      this.a(jx.aE, fqu.a::new);
      this.a(jx.aF, frv.a::new);
      this.a(jx.aG, fpz.b::new);
      this.a(jx.aK, fpp::i);
      this.a(jx.aL, fpp::j);
      this.a(jx.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fpm($$2, $$3, $$4, $$5, $$0));
      this.a(jx.aI, fpp::k);
      this.a(jx.aJ, fpp::l);
      this.a(jx.R, frr.a::new);
      this.a(jx.aM, frj.a::new);
      this.a(jx.aN, fqa.b::new);
      this.a(jx.aO, fqa.e::new);
      this.a(jx.aP, fqa.d::new);
      this.a(jx.aQ, fqa.a::new);
      this.a(jx.aR, fqa.c::new);
      this.a(jx.aS, fqy.a::new);
      this.a(jx.aT, frl.c::new);
      this.a(jx.aU, fpt.a::new);
      this.a(jx.aV, fqb.a::new);
      this.a(jx.aW, frq.a::new);
   }

   private <T extends jv> void a(jw<T> $$0, fqq<T> $$1) {
      this.k.put(kd.j.a($$0), $$1);
   }

   private <T extends jv> void a(jw<T> $$0, fqq.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            frn $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jv> void a(jw<T> $$0, fqp.c<T> $$1) {
      fqp.b $$2 = new fqp.b();
      this.m.put(kd.j.b($$0), $$2);
      this.k.put(kd.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      record a(ahd a, Optional<List<ahd>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ahd, aqa>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ahd $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<gea.a> $$7 = gea.a(this.n).a($$1, d, 0, $$4).thenCompose(gea.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gea.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ahd> $$5x = new HashSet<>();
         gef $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ahd>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gef> $$5xx = new ArrayList<>();

               for (ahd $$6xx : $$4xx.get()) {
                  gef $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ahd::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ahd>> a(ahd $$0, aqa $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fqo $$3 = fqo.a(aty.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(blp $$0, jv $$1) {
      this.h.add(new frp(this.a, $$0, $$1));
   }

   public void a(blp $$0, jv $$1, int $$2) {
      this.h.add(new frp(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fqn a(jv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fqn $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jv> fqn b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fqq<T> $$7 = (fqq<T>)this.k.get(kd.j.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fqn $$0) {
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
         List<frp> $$0 = Lists.newArrayList();

         for (frp $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fqn $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fqn> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fqn> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fqn $$2 = $$1.next();
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

   private void b(fqn $$0) {
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

   public void a(ept $$0, fsz.a $$1, fsy $$2, eul $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      ept $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fqr $$6 : f) {
         Iterable<fqn> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fss::u);
            epv $$8 = epv.b();
            epo $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (fqn $$10 : $$7) {
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

   public void a(@Nullable fnk $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hx $$0, dja $$1) {
      if (!$$1.i() && $$1.z()) {
         emf $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aui.c($$8 / 0.25));
               int $$12 = Math.max(2, aui.c($$9 / 0.25));
               int $$13 = Math.max(2, aui.c($$10 / 0.25));

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
                           new frm(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hx $$0, ic $$1) {
      dja $$2 = this.a.a_($$0);
      if ($$2.l() != dco.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         elh $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new frm(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fri {
      private List<gef> a;

      @Override
      public gef a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gef a(aup $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gef> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jv> {
      fqq<T> create(fri var1);
   }
}
