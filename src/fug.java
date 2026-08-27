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

public class fug implements arz {
   private static final Logger b = LogUtils.getLogger();
   private static final aiv c = aiv.a("particles");
   private static final ajc d = new ajc("particles");
   private static final int e = 16384;
   private static final List<fui> f = ImmutableList.of(fui.a, fui.b, fui.d, fui.c, fui.e);
   protected fra a;
   private final Map<fui, Queue<fue>> g = Maps.newIdentityHashMap();
   private final Queue<fvg> h = Queues.newArrayDeque();
   private final gia i;
   private final awt j = awt.a();
   private final Int2ObjectMap<fuh<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fue> l = Queues.newArrayDeque();
   private final Map<ajc, fug.b> m = Maps.newHashMap();
   private final ghy n;
   private final Object2IntOpenHashMap<jy> o = new Object2IntOpenHashMap();

   public fug(fra $$0, gia $$1) {
      this.n = new ghy(ghy.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kb.a, fuw.a::new);
      this.a(kb.b, ftv.a::new);
      this.a(kb.d, new fsy.a());
      this.a(kb.c, new fvd.a());
      this.a(kb.e, ftb.a::new);
      this.a(kb.an, fta.a::new);
      this.a(kb.al, ftc.a::new);
      this.a(kb.aq, ftd.a::new);
      this.a(kb.ar, ftd.b::new);
      this.a(kb.f, fuj.a::new);
      this.a(kb.N, fvc.a::new);
      this.a(kb.g, ftf.c::new);
      this.a(kb.am, fvk.a::new);
      this.a(kb.h, ftf.a::new);
      this.a(kb.i, ftg.a::new);
      this.a(kb.ap, fvc.b::new);
      this.a(kb.j, fth::c);
      this.a(kb.k, fth::d);
      this.a(kb.l, fth::e);
      this.a(kb.m, fth::a);
      this.a(kb.n, fth::b);
      this.a(kb.o, ftj.a::new);
      this.a(kb.p, fti.a::new);
      this.a(kb.q, fuw.d::new);
      this.a(kb.r, new fub.a());
      this.a(kb.s, ftf.b::new);
      this.a(kb.t, ftr.a::new);
      this.a(kb.u, ftm.a::new);
      this.a(kb.v, fuw.c::new);
      this.a(kb.w, new ftx.a());
      this.a(kb.x, ftw.a::new);
      this.a(kb.A, fuu.a::new);
      this.a(kb.B, fto.a::new);
      this.a(kb.y, ftt.a::new);
      this.a(kb.z, new ftu.a());
      this.a(kb.C, ftp.d::new);
      this.a(kb.D, fvj.a::new);
      this.a(kb.E, ftq.a::new);
      this.a(kb.G, fuv.a::new);
      this.a(kb.H, fun.a::new);
      this.a(kb.I, fuo.a::new);
      this.a(kb.K, fuv.b::new);
      this.a(kb.J, ftq.a::new);
      this.a(kb.L, ftp.a::new);
      this.a(kb.M, fvc.d::new);
      this.a(kb.O, ftv.b::new);
      this.a(kb.P, fuw.b::new);
      this.a(kb.Q, new fsz.a());
      this.a(kb.S, new fsz.b());
      this.a(kb.T, new fsz.c());
      this.a(kb.U, ftz.a::new);
      this.a(kb.V, fua.a::new);
      this.a(kb.W, fvc.e::new);
      this.a(kb.ao, ftr.b::new);
      this.a(kb.X, fud.a::new);
      this.a(kb.Y, ftn.a::new);
      this.a(kb.Z, fuk.a::new);
      this.a(kb.aa, fvl.a::new);
      this.a(kb.ab, fus.a::new);
      this.a(kb.ac, fvn.a::new);
      this.a(kb.ad, fuj.b::new);
      this.a(kb.aH, fut.a::new);
      this.a(kb.ae, fux.a::new);
      this.a(kb.ag, fsw.a::new);
      this.a(kb.ah, fvf.a::new);
      this.a(kb.af, fva.b::new);
      this.a(kb.ai, fvb.c::new);
      this.a(kb.aj, fuy.a::new);
      this.a(kb.ak, fuw.e::new);
      this.a(kb.as, fth::f);
      this.a(kb.at, fth::g);
      this.a(kb.au, fth::h);
      this.a(kb.av, fth::m);
      this.a(kb.aw, fth::n);
      this.a(kb.aA, fvb.b::new);
      this.a(kb.ax, fsv.a::new);
      this.a(kb.ay, fvb.a::new);
      this.a(kb.az, fvb.d::new);
      this.a(kb.aB, fth::o);
      this.a(kb.aC, fth::p);
      this.a(kb.aD, fth::q);
      this.a(kb.aE, ful.a::new);
      this.a(kb.aF, fvm.a::new);
      this.a(kb.aG, ftq.b::new);
      this.a(kb.aK, fth::i);
      this.a(kb.aL, fth::j);
      this.a(kb.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fte($$2, $$3, $$4, $$5, $$0));
      this.a(kb.aI, fth::k);
      this.a(kb.aJ, fth::l);
      this.a(kb.R, fvi.a::new);
      this.a(kb.aM, fva.a::new);
      this.a(kb.aN, fts.b::new);
      this.a(kb.aO, fts.e::new);
      this.a(kb.aP, fts.d::new);
      this.a(kb.aQ, fts.a::new);
      this.a(kb.aR, fts.c::new);
      this.a(kb.aS, fup.a::new);
      this.a(kb.aT, fvc.c::new);
      this.a(kb.aU, ftl.a::new);
      this.a(kb.aV, fvh.a::new);
      this.a(kb.aW, ftr.c::new);
   }

   private <T extends jz> void a(ka<T> $$0, fuh<T> $$1) {
      this.k.put(kh.j.a($$0), $$1);
   }

   private <T extends jz> void a(ka<T> $$0, fuh.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fve $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jz> void a(ka<T> $$0, fug.c<T> $$1) {
      fug.b $$2 = new fug.b();
      this.m.put(kh.j.b($$0), $$2);
      this.k.put(kh.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      record a(ajc a, Optional<List<ajc>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ajc, asd>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ajc $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<ghu.a> $$7 = ghu.a(this.n).a($$1, d, 0, $$4).thenCompose(ghu.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         ghu.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ajc> $$5x = new HashSet<>();
         ghz $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ajc>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<ghz> $$5xx = new ArrayList<>();

               for (ajc $$6xx : $$4xx.get()) {
                  ghz $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ajc::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ajc>> a(ajc $$0, asd $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fuf $$3 = fuf.a(awc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bof $$0, jz $$1) {
      this.h.add(new fvg(this.a, $$0, $$1));
   }

   public void a(bof $$0, jz $$1, int $$2) {
      this.h.add(new fvg(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fue a(jz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fue $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jz> fue b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fuh<T> $$7 = (fuh<T>)this.k.get(kh.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fue $$0) {
      Optional<jy> $$1 = $$0.o();
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
         List<fvg> $$0 = Lists.newArrayList();

         for (fvg $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fue $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fue> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fue> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fue $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(jy $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fue $$0) {
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

   public void a(fwp $$0, exv $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fui $$3 : f) {
         Iterable<fue> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(fwj::u);
            etf $$5 = etf.b();
            esy $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fue $$7 : $$4) {
               try {
                  $$7.a($$6, $$1, $$2);
               } catch (Throwable var14) {
                  o $$9 = o.a(var14, "Rendering Particle");
                  p $$10 = $$9.a("Particle being rendered");
                  $$10.a("Particle", $$7::toString);
                  $$10.a("Particle Type", $$3::toString);
                  throw new y($$9);
               }
            }

            $$3.a($$5);
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fra $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ib $$0, dme $$1) {
      if (!$$1.i() && $$1.z()) {
         epo $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, awm.c($$8 / 0.25));
               int $$12 = Math.max(2, awm.c($$9 / 0.25));
               int $$13 = Math.max(2, awm.c($$10 / 0.25));

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
                           new fvd(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ib $$0, ih $$1) {
      dme $$2 = this.a.a_($$0);
      if ($$2.l() != dfk.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eoq $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ih.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ih.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ih.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ih.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ih.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ih.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fvd(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(jy $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fuz {
      private List<ghz> a;

      @Override
      public ghz a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public ghz a(awt $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<ghz> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jz> {
      fuh<T> create(fuz var1);
   }
}
