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

public class flr implements anj {
   private static final Logger b = LogUtils.getLogger();
   private static final aen c = aen.a("particles");
   private static final aeu d = new aeu("particles");
   private static final int e = 16384;
   private static final List<flt> f = ImmutableList.of(flt.a, flt.b, flt.d, flt.c, flt.e);
   protected fis a;
   private final Map<flt, Queue<flp>> g = Maps.newIdentityHashMap();
   private final Queue<fmr> h = Queues.newArrayDeque();
   private final fza i;
   private final arx j = arx.a();
   private final Int2ObjectMap<fls<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<flp> l = Queues.newArrayDeque();
   private final Map<aeu, flr.b> m = Maps.newHashMap();
   private final fyy n;
   private final Object2IntOpenHashMap<iu> o = new Object2IntOpenHashMap();

   public flr(fis $$0, fza $$1) {
      this.n = new fyy(fyy.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ix.a, fmh.a::new);
      this.a(ix.b, flg.a::new);
      this.a(ix.d, new fkm.a());
      this.a(ix.c, new fmo.a());
      this.a(ix.e, fkp.a::new);
      this.a(ix.ak, fko.a::new);
      this.a(ix.ai, fkq.a::new);
      this.a(ix.an, fkr.a::new);
      this.a(ix.ao, fkr.b::new);
      this.a(ix.f, flu.a::new);
      this.a(ix.L, fmn.a::new);
      this.a(ix.g, fkt.c::new);
      this.a(ix.aj, fmu.a::new);
      this.a(ix.h, fkt.a::new);
      this.a(ix.i, fku.a::new);
      this.a(ix.am, fmn.b::new);
      this.a(ix.j, fkv::c);
      this.a(ix.k, fkv::d);
      this.a(ix.l, fkv::e);
      this.a(ix.m, fkv::a);
      this.a(ix.n, fkv::b);
      this.a(ix.o, fkx.a::new);
      this.a(ix.p, fkw.a::new);
      this.a(ix.q, fmh.d::new);
      this.a(ix.r, new flm.a());
      this.a(ix.s, fkt.b::new);
      this.a(ix.t, fkz.b::new);
      this.a(ix.u, fla.a::new);
      this.a(ix.v, fmh.c::new);
      this.a(ix.w, new fli.a());
      this.a(ix.x, flh.a::new);
      this.a(ix.y, fmf.a::new);
      this.a(ix.z, flc.a::new);
      this.a(ix.A, fld.d::new);
      this.a(ix.B, fmt.a::new);
      this.a(ix.C, fle.a::new);
      this.a(ix.E, fmg.a::new);
      this.a(ix.F, fly.a::new);
      this.a(ix.G, flz.a::new);
      this.a(ix.I, fmg.b::new);
      this.a(ix.H, fle.a::new);
      this.a(ix.J, fld.a::new);
      this.a(ix.K, fmn.d::new);
      this.a(ix.M, flg.b::new);
      this.a(ix.N, fmh.b::new);
      this.a(ix.O, new fkn.a());
      this.a(ix.Q, new fkn.b());
      this.a(ix.R, new fkn.c());
      this.a(ix.S, flk.a::new);
      this.a(ix.T, fll.a::new);
      this.a(ix.U, fmn.e::new);
      this.a(ix.al, fkz.a::new);
      this.a(ix.V, flo.a::new);
      this.a(ix.W, flb.a::new);
      this.a(ix.X, flv.a::new);
      this.a(ix.Y, fmv.a::new);
      this.a(ix.Z, fmd.a::new);
      this.a(ix.aa, flu.b::new);
      this.a(ix.aE, fme.a::new);
      this.a(ix.ab, fmi.a::new);
      this.a(ix.ad, fkk.a::new);
      this.a(ix.ae, fmq.a::new);
      this.a(ix.ac, fml.b::new);
      this.a(ix.af, fmm.c::new);
      this.a(ix.ag, fmj.a::new);
      this.a(ix.ah, fmh.e::new);
      this.a(ix.ap, fkv::f);
      this.a(ix.aq, fkv::g);
      this.a(ix.ar, fkv::h);
      this.a(ix.as, fkv::m);
      this.a(ix.at, fkv::n);
      this.a(ix.ax, fmm.b::new);
      this.a(ix.au, fkj.a::new);
      this.a(ix.av, fmm.a::new);
      this.a(ix.aw, fmm.d::new);
      this.a(ix.ay, fkv::o);
      this.a(ix.az, fkv::p);
      this.a(ix.aA, fkv::q);
      this.a(ix.aB, flw.a::new);
      this.a(ix.aC, fmw.a::new);
      this.a(ix.aD, fle.b::new);
      this.a(ix.aH, fkv::i);
      this.a(ix.aI, fkv::j);
      this.a(ix.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fks($$2, $$3, $$4, $$5, $$0));
      this.a(ix.aF, fkv::k);
      this.a(ix.aG, fkv::l);
      this.a(ix.P, fms.a::new);
      this.a(ix.aJ, fml.a::new);
      this.a(ix.aK, flf.b::new);
      this.a(ix.aL, flf.e::new);
      this.a(ix.aM, flf.d::new);
      this.a(ix.aN, flf.a::new);
      this.a(ix.aO, flf.c::new);
      this.a(ix.aP, fma.a::new);
      this.a(ix.aQ, fmn.c::new);
   }

   private <T extends iv> void a(iw<T> $$0, fls<T> $$1) {
      this.k.put(jd.k.a($$0), $$1);
   }

   private <T extends iv> void a(iw<T> $$0, fls.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fmp $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends iv> void a(iw<T> $$0, flr.c<T> $$1) {
      flr.b $$2 = new flr.b();
      this.m.put(jd.k.b($$0), $$2);
      this.k.put(jd.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(anj.a $$0, anp $$1, bdk $$2, bdk $$3, Executor $$4, Executor $$5) {
      record a(aeu a, Optional<List<aeu>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aeu, ann>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aeu $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fyu.a> $$7 = fyu.a(this.n).a($$1, d, 0, $$4).thenCompose(fyu.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fyu.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aeu> $$5x = new HashSet<>();
         fyz $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aeu>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<fyz> $$5xx = new ArrayList<>();

               for (aeu $$6xx : $$4xx.get()) {
                  fyz $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aeu::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aeu>> a(aeu $$0, ann $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               flq $$3 = flq.a(arj.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bil $$0, iv $$1) {
      this.h.add(new fmr(this.a, $$0, $$1));
   }

   public void a(bil $$0, iv $$1, int $$2) {
      this.h.add(new fmr(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public flp a(iv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flp $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends iv> flp b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fls<T> $$7 = (fls<T>)this.k.get(jd.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(flp $$0) {
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
         List<fmr> $$0 = Lists.newArrayList();

         for (fmr $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      flp $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<flp> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<flp> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            flp $$2 = $$1.next();
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

   private void b(flp $$0) {
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

   public void a(elk $$0, fnz.a $$1, fny $$2, eqb $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      elk $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (flt $$6 : f) {
         Iterable<flp> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fns::u);
            elm $$8 = elm.a();
            elf $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (flp $$10 : $$7) {
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

   public void a(@Nullable fis $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(gw $$0, dfe $$1) {
      if (!$$1.i() && $$1.z()) {
         eib $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ars.c($$8 / 0.25));
               int $$12 = Math.max(2, ars.c($$9 / 0.25));
               int $$13 = Math.max(2, ars.c($$10 / 0.25));

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
                           new fmo(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(gw $$0, hc $$1) {
      dfe $$2 = this.a.a_($$0);
      if ($$2.l() != cyv.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ehd $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new fmo(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fmk {
      private List<fyz> a;

      @Override
      public fyz a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public fyz a(arx $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<fyz> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends iv> {
      fls<T> create(fmk var1);
   }
}
