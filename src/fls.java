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

public class fls implements anq {
   private static final Logger b = LogUtils.getLogger();
   private static final aes c = aes.a("particles");
   private static final aez d = new aez("particles");
   private static final int e = 16384;
   private static final List<flu> f = ImmutableList.of(flu.a, flu.b, flu.d, flu.c, flu.e);
   protected fis a;
   private final Map<flu, Queue<flq>> g = Maps.newIdentityHashMap();
   private final Queue<fms> h = Queues.newArrayDeque();
   private final fzb i;
   private final ash j = ash.a();
   private final Int2ObjectMap<flt<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<flq> l = Queues.newArrayDeque();
   private final Map<aez, fls.b> m = Maps.newHashMap();
   private final fyz n;
   private final Object2IntOpenHashMap<is> o = new Object2IntOpenHashMap();

   public fls(fis $$0, fzb $$1) {
      this.n = new fyz(fyz.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(iv.a, fmi.a::new);
      this.a(iv.b, flh.a::new);
      this.a(iv.d, new fkn.a());
      this.a(iv.c, new fmp.a());
      this.a(iv.e, fkq.a::new);
      this.a(iv.ak, fkp.a::new);
      this.a(iv.ai, fkr.a::new);
      this.a(iv.an, fks.a::new);
      this.a(iv.ao, fks.b::new);
      this.a(iv.f, flv.a::new);
      this.a(iv.L, fmo.a::new);
      this.a(iv.g, fku.c::new);
      this.a(iv.aj, fmv.a::new);
      this.a(iv.h, fku.a::new);
      this.a(iv.i, fkv.a::new);
      this.a(iv.am, fmo.b::new);
      this.a(iv.j, fkw::c);
      this.a(iv.k, fkw::d);
      this.a(iv.l, fkw::e);
      this.a(iv.m, fkw::a);
      this.a(iv.n, fkw::b);
      this.a(iv.o, fky.a::new);
      this.a(iv.p, fkx.a::new);
      this.a(iv.q, fmi.d::new);
      this.a(iv.r, new fln.a());
      this.a(iv.s, fku.b::new);
      this.a(iv.t, fla.b::new);
      this.a(iv.u, flb.a::new);
      this.a(iv.v, fmi.c::new);
      this.a(iv.w, new flj.a());
      this.a(iv.x, fli.a::new);
      this.a(iv.y, fmg.a::new);
      this.a(iv.z, fld.a::new);
      this.a(iv.A, fle.d::new);
      this.a(iv.B, fmu.a::new);
      this.a(iv.C, flf.a::new);
      this.a(iv.E, fmh.a::new);
      this.a(iv.F, flz.a::new);
      this.a(iv.G, fma.a::new);
      this.a(iv.I, fmh.b::new);
      this.a(iv.H, flf.a::new);
      this.a(iv.J, fle.a::new);
      this.a(iv.K, fmo.d::new);
      this.a(iv.M, flh.b::new);
      this.a(iv.N, fmi.b::new);
      this.a(iv.O, new fko.a());
      this.a(iv.Q, new fko.b());
      this.a(iv.R, new fko.c());
      this.a(iv.S, fll.a::new);
      this.a(iv.T, flm.a::new);
      this.a(iv.U, fmo.e::new);
      this.a(iv.al, fla.a::new);
      this.a(iv.V, flp.a::new);
      this.a(iv.W, flc.a::new);
      this.a(iv.X, flw.a::new);
      this.a(iv.Y, fmw.a::new);
      this.a(iv.Z, fme.a::new);
      this.a(iv.aa, flv.b::new);
      this.a(iv.aE, fmf.a::new);
      this.a(iv.ab, fmj.a::new);
      this.a(iv.ad, fkl.a::new);
      this.a(iv.ae, fmr.a::new);
      this.a(iv.ac, fmm.b::new);
      this.a(iv.af, fmn.c::new);
      this.a(iv.ag, fmk.a::new);
      this.a(iv.ah, fmi.e::new);
      this.a(iv.ap, fkw::f);
      this.a(iv.aq, fkw::g);
      this.a(iv.ar, fkw::h);
      this.a(iv.as, fkw::m);
      this.a(iv.at, fkw::n);
      this.a(iv.ax, fmn.b::new);
      this.a(iv.au, fkk.a::new);
      this.a(iv.av, fmn.a::new);
      this.a(iv.aw, fmn.d::new);
      this.a(iv.ay, fkw::o);
      this.a(iv.az, fkw::p);
      this.a(iv.aA, fkw::q);
      this.a(iv.aB, flx.a::new);
      this.a(iv.aC, fmx.a::new);
      this.a(iv.aD, flf.b::new);
      this.a(iv.aH, fkw::i);
      this.a(iv.aI, fkw::j);
      this.a(iv.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fkt($$2, $$3, $$4, $$5, $$0));
      this.a(iv.aF, fkw::k);
      this.a(iv.aG, fkw::l);
      this.a(iv.P, fmt.a::new);
      this.a(iv.aJ, fmm.a::new);
      this.a(iv.aK, flg.b::new);
      this.a(iv.aL, flg.e::new);
      this.a(iv.aM, flg.d::new);
      this.a(iv.aN, flg.a::new);
      this.a(iv.aO, flg.c::new);
      this.a(iv.aP, fmb.a::new);
      this.a(iv.aQ, fmo.c::new);
   }

   private <T extends it> void a(iu<T> $$0, flt<T> $$1) {
      this.k.put(jb.k.a($$0), $$1);
   }

   private <T extends it> void a(iu<T> $$0, flt.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fmq $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends it> void a(iu<T> $$0, fls.c<T> $$1) {
      fls.b $$2 = new fls.b();
      this.m.put(jb.k.b($$0), $$2);
      this.k.put(jb.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      record a(aez a, Optional<List<aez>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aez, anu>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aez $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fyv.a> $$7 = fyv.a(this.n).a($$1, d, 0, $$4).thenCompose(fyv.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fyv.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aez> $$5x = new HashSet<>();
         fza $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aez>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<fza> $$5xx = new ArrayList<>();

               for (aez $$6xx : $$4xx.get()) {
                  fza $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aez::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aez>> a(aez $$0, anu $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               flr $$3 = flr.a(arr.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(biw $$0, it $$1) {
      this.h.add(new fms(this.a, $$0, $$1));
   }

   public void a(biw $$0, it $$1, int $$2) {
      this.h.add(new fms(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public flq a(it $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flq $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends it> flq b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      flt<T> $$7 = (flt<T>)this.k.get(jb.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(flq $$0) {
      Optional<is> $$1 = $$0.o();
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
         List<fms> $$0 = Lists.newArrayList();

         for (fms $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      flq $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<flq> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<flq> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            flq $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(is $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(flq $$0) {
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

   public void a(elj $$0, foa.a $$1, fnz $$2, eqa $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      elj $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (flu $$6 : f) {
         Iterable<flq> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fnt::u);
            ell $$8 = ell.a();
            ele $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (flq $$10 : $$7) {
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

   public void a(gw $$0, dfd $$1) {
      if (!$$1.i() && $$1.z()) {
         eia $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, asb.c($$8 / 0.25));
               int $$12 = Math.max(2, asb.c($$9 / 0.25));
               int $$13 = Math.max(2, asb.c($$10 / 0.25));

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
                           new fmp(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(gw $$0, ha $$1) {
      dfd $$2 = this.a.a_($$0);
      if ($$2.l() != czg.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ehc $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ha.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ha.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ha.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ha.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ha.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ha.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fmp(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(is $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fml {
      private List<fza> a;

      @Override
      public fza a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public fza a(ash $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<fza> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends it> {
      flt<T> create(fml var1);
   }
}
