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

public class fop implements apf {
   private static final Logger b = LogUtils.getLogger();
   private static final agf c = agf.a("particles");
   private static final agm d = new agm("particles");
   private static final int e = 16384;
   private static final List<fos> f = ImmutableList.of(fos.a, fos.b, fos.d, fos.c, fos.e);
   protected flo a;
   private final Map<fos, Queue<fon>> g = Maps.newIdentityHashMap();
   private final Queue<fpq> h = Queues.newArrayDeque();
   private final gca i;
   private final atw j = atw.a();
   private final Int2ObjectMap<foq<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fon> l = Queues.newArrayDeque();
   private final Map<agm, fop.b> m = Maps.newHashMap();
   private final gby n;
   private final Object2IntOpenHashMap<jt> o = new Object2IntOpenHashMap();

   public fop(flo $$0, gca $$1) {
      this.n = new gby(gby.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jw.a, fpg.a::new);
      this.a(jw.b, foe.a::new);
      this.a(jw.d, new fnj.a());
      this.a(jw.c, new fpn.a());
      this.a(jw.e, fnm.a::new);
      this.a(jw.al, fnl.a::new);
      this.a(jw.aj, fnn.a::new);
      this.a(jw.ao, fno.a::new);
      this.a(jw.ap, fno.b::new);
      this.a(jw.f, fot.a::new);
      this.a(jw.L, fpm.a::new);
      this.a(jw.g, fnq.c::new);
      this.a(jw.ak, fpt.a::new);
      this.a(jw.h, fnq.a::new);
      this.a(jw.i, fnr.a::new);
      this.a(jw.an, fpm.b::new);
      this.a(jw.j, fns::c);
      this.a(jw.k, fns::d);
      this.a(jw.l, fns::e);
      this.a(jw.m, fns::a);
      this.a(jw.n, fns::b);
      this.a(jw.o, fnu.a::new);
      this.a(jw.p, fnt.a::new);
      this.a(jw.q, fpg.d::new);
      this.a(jw.r, new fok.a());
      this.a(jw.s, fnq.b::new);
      this.a(jw.t, fnx.b::new);
      this.a(jw.u, fny.a::new);
      this.a(jw.v, fpg.c::new);
      this.a(jw.w, new fog.a());
      this.a(jw.x, fof.a::new);
      this.a(jw.y, fpe.a::new);
      this.a(jw.z, foa.a::new);
      this.a(jw.A, fob.d::new);
      this.a(jw.B, fps.a::new);
      this.a(jw.C, foc.a::new);
      this.a(jw.E, fpf.a::new);
      this.a(jw.F, fox.a::new);
      this.a(jw.G, foy.a::new);
      this.a(jw.I, fpf.b::new);
      this.a(jw.H, foc.a::new);
      this.a(jw.J, fob.a::new);
      this.a(jw.K, fpm.d::new);
      this.a(jw.M, foe.b::new);
      this.a(jw.N, fpg.b::new);
      this.a(jw.O, new fnk.a());
      this.a(jw.Q, new fnk.b());
      this.a(jw.R, new fnk.c());
      this.a(jw.S, foi.a::new);
      this.a(jw.T, foj.a::new);
      this.a(jw.U, fpm.e::new);
      this.a(jw.am, fnx.a::new);
      this.a(jw.V, fom.a::new);
      this.a(jw.W, fnz.a::new);
      this.a(jw.X, fou.a::new);
      this.a(jw.Y, fpu.a::new);
      this.a(jw.Z, fpc.a::new);
      this.a(jw.aa, fpw.a::new);
      this.a(jw.ab, fot.b::new);
      this.a(jw.aF, fpd.a::new);
      this.a(jw.ac, fph.a::new);
      this.a(jw.ae, fnh.a::new);
      this.a(jw.af, fpp.a::new);
      this.a(jw.ad, fpk.b::new);
      this.a(jw.ag, fpl.c::new);
      this.a(jw.ah, fpi.a::new);
      this.a(jw.ai, fpg.e::new);
      this.a(jw.aq, fns::f);
      this.a(jw.ar, fns::g);
      this.a(jw.as, fns::h);
      this.a(jw.at, fns::m);
      this.a(jw.au, fns::n);
      this.a(jw.ay, fpl.b::new);
      this.a(jw.av, fng.a::new);
      this.a(jw.aw, fpl.a::new);
      this.a(jw.ax, fpl.d::new);
      this.a(jw.az, fns::o);
      this.a(jw.aA, fns::p);
      this.a(jw.aB, fns::q);
      this.a(jw.aC, fov.a::new);
      this.a(jw.aD, fpv.a::new);
      this.a(jw.aE, foc.b::new);
      this.a(jw.aI, fns::i);
      this.a(jw.aJ, fns::j);
      this.a(jw.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fnp($$2, $$3, $$4, $$5, $$0));
      this.a(jw.aG, fns::k);
      this.a(jw.aH, fns::l);
      this.a(jw.P, fpr.a::new);
      this.a(jw.aK, fpk.a::new);
      this.a(jw.aL, fod.b::new);
      this.a(jw.aM, fod.e::new);
      this.a(jw.aN, fod.d::new);
      this.a(jw.aO, fod.a::new);
      this.a(jw.aP, fod.c::new);
      this.a(jw.aQ, foz.a::new);
      this.a(jw.aR, fpm.c::new);
      this.a(jw.aS, fnw.a::new);
   }

   private <T extends ju> void a(jv<T> $$0, foq<T> $$1) {
      this.k.put(kc.k.a($$0), $$1);
   }

   private <T extends ju> void a(jv<T> $$0, foq.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fpo $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ju> void a(jv<T> $$0, fop.c<T> $$1) {
      fop.b $$2 = new fop.b();
      this.m.put(kc.k.b($$0), $$2);
      this.k.put(kc.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      record a(agm a, Optional<List<agm>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<agm, apj>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            agm $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<gbu.a> $$7 = gbu.a(this.n).a($$1, d, 0, $$4).thenCompose(gbu.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gbu.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<agm> $$5x = new HashSet<>();
         gbz $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<agm>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gbz> $$5xx = new ArrayList<>();

               for (agm $$6xx : $$4xx.get()) {
                  gbz $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(agm::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<agm>> a(agm $$0, apj $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               foo $$3 = foo.a(atg.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bkv $$0, ju $$1) {
      this.h.add(new fpq(this.a, $$0, $$1));
   }

   public void a(bkv $$0, ju $$1, int $$2) {
      this.h.add(new fpq(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fon a(ju $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fon $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ju> fon b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      foq<T> $$7 = (foq<T>)this.k.get(kc.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fon $$0) {
      Optional<jt> $$1 = $$0.o();
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
         List<fpq> $$0 = Lists.newArrayList();

         for (fpq $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fon $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fon> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fon> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fon $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(jt $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fon $$0) {
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

   public void a(eob $$0, fqz.a $$1, fqy $$2, est $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      eob $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fos $$6 : f) {
         Iterable<fon> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fqs::u);
            eod $$8 = eod.b();
            enw $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (fon $$10 : $$7) {
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

   public void a(@Nullable flo $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hx $$0, dhn $$1) {
      if (!$$1.i() && $$1.z()) {
         eks $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, atq.c($$8 / 0.25));
               int $$12 = Math.max(2, atq.c($$9 / 0.25));
               int $$13 = Math.max(2, atq.c($$10 / 0.25));

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
                           new fpn(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hx $$0, ib $$1) {
      dhn $$2 = this.a.a_($$0);
      if ($$2.l() != dbk.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eju $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ib.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ib.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ib.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ib.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ib.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ib.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fpn(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(jt $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fpj {
      private List<gbz> a;

      @Override
      public gbz a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gbz a(atw $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gbz> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ju> {
      foq<T> create(fpj var1);
   }
}
