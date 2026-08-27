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

public class fms implements aon {
   private static final Logger b = LogUtils.getLogger();
   private static final afp c = afp.a("particles");
   private static final afw d = new afw("particles");
   private static final int e = 16384;
   private static final List<fmu> f = ImmutableList.of(fmu.a, fmu.b, fmu.d, fmu.c, fmu.e);
   protected fjr a;
   private final Map<fmu, Queue<fmq>> g = Maps.newIdentityHashMap();
   private final Queue<fns> h = Queues.newArrayDeque();
   private final gab i;
   private final ate j = ate.a();
   private final Int2ObjectMap<fmt<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fmq> l = Queues.newArrayDeque();
   private final Map<afw, fms.b> m = Maps.newHashMap();
   private final fzz n;
   private final Object2IntOpenHashMap<jp> o = new Object2IntOpenHashMap();

   public fms(fjr $$0, gab $$1) {
      this.n = new fzz(fzz.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(js.a, fni.a::new);
      this.a(js.b, fmh.a::new);
      this.a(js.d, new flm.a());
      this.a(js.c, new fnp.a());
      this.a(js.e, flp.a::new);
      this.a(js.ak, flo.a::new);
      this.a(js.ai, flq.a::new);
      this.a(js.an, flr.a::new);
      this.a(js.ao, flr.b::new);
      this.a(js.f, fmv.a::new);
      this.a(js.L, fno.a::new);
      this.a(js.g, flt.c::new);
      this.a(js.aj, fnv.a::new);
      this.a(js.h, flt.a::new);
      this.a(js.i, flu.a::new);
      this.a(js.am, fno.b::new);
      this.a(js.j, flv::c);
      this.a(js.k, flv::d);
      this.a(js.l, flv::e);
      this.a(js.m, flv::a);
      this.a(js.n, flv::b);
      this.a(js.o, flx.a::new);
      this.a(js.p, flw.a::new);
      this.a(js.q, fni.d::new);
      this.a(js.r, new fmn.a());
      this.a(js.s, flt.b::new);
      this.a(js.t, fma.b::new);
      this.a(js.u, fmb.a::new);
      this.a(js.v, fni.c::new);
      this.a(js.w, new fmj.a());
      this.a(js.x, fmi.a::new);
      this.a(js.y, fng.a::new);
      this.a(js.z, fmd.a::new);
      this.a(js.A, fme.d::new);
      this.a(js.B, fnu.a::new);
      this.a(js.C, fmf.a::new);
      this.a(js.E, fnh.a::new);
      this.a(js.F, fmz.a::new);
      this.a(js.G, fna.a::new);
      this.a(js.I, fnh.b::new);
      this.a(js.H, fmf.a::new);
      this.a(js.J, fme.a::new);
      this.a(js.K, fno.d::new);
      this.a(js.M, fmh.b::new);
      this.a(js.N, fni.b::new);
      this.a(js.O, new fln.a());
      this.a(js.Q, new fln.b());
      this.a(js.R, new fln.c());
      this.a(js.S, fml.a::new);
      this.a(js.T, fmm.a::new);
      this.a(js.U, fno.e::new);
      this.a(js.al, fma.a::new);
      this.a(js.V, fmp.a::new);
      this.a(js.W, fmc.a::new);
      this.a(js.X, fmw.a::new);
      this.a(js.Y, fnw.a::new);
      this.a(js.Z, fne.a::new);
      this.a(js.aa, fmv.b::new);
      this.a(js.aE, fnf.a::new);
      this.a(js.ab, fnj.a::new);
      this.a(js.ad, flk.a::new);
      this.a(js.ae, fnr.a::new);
      this.a(js.ac, fnm.b::new);
      this.a(js.af, fnn.c::new);
      this.a(js.ag, fnk.a::new);
      this.a(js.ah, fni.e::new);
      this.a(js.ap, flv::f);
      this.a(js.aq, flv::g);
      this.a(js.ar, flv::h);
      this.a(js.as, flv::m);
      this.a(js.at, flv::n);
      this.a(js.ax, fnn.b::new);
      this.a(js.au, flj.a::new);
      this.a(js.av, fnn.a::new);
      this.a(js.aw, fnn.d::new);
      this.a(js.ay, flv::o);
      this.a(js.az, flv::p);
      this.a(js.aA, flv::q);
      this.a(js.aB, fmx.a::new);
      this.a(js.aC, fnx.a::new);
      this.a(js.aD, fmf.b::new);
      this.a(js.aH, flv::i);
      this.a(js.aI, flv::j);
      this.a(js.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fls($$2, $$3, $$4, $$5, $$0));
      this.a(js.aF, flv::k);
      this.a(js.aG, flv::l);
      this.a(js.P, fnt.a::new);
      this.a(js.aJ, fnm.a::new);
      this.a(js.aK, fmg.b::new);
      this.a(js.aL, fmg.e::new);
      this.a(js.aM, fmg.d::new);
      this.a(js.aN, fmg.a::new);
      this.a(js.aO, fmg.c::new);
      this.a(js.aP, fnb.a::new);
      this.a(js.aQ, fno.c::new);
      this.a(js.aR, flz.a::new);
   }

   private <T extends jq> void a(jr<T> $$0, fmt<T> $$1) {
      this.k.put(jy.k.a($$0), $$1);
   }

   private <T extends jq> void a(jr<T> $$0, fmt.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fnq $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jq> void a(jr<T> $$0, fms.c<T> $$1) {
      fms.b $$2 = new fms.b();
      this.m.put(jy.k.b($$0), $$2);
      this.k.put(jy.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      record a(afw a, Optional<List<afw>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<afw, aor>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            afw $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<fzv.a> $$7 = fzv.a(this.n).a($$1, d, 0, $$4).thenCompose(fzv.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         fzv.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<afw> $$5x = new HashSet<>();
         gaa $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<afw>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gaa> $$5xx = new ArrayList<>();

               for (afw $$6xx : $$4xx.get()) {
                  gaa $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(afw::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<afw>> a(afw $$0, aor $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fmr $$3 = fmr.a(aso.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bjt $$0, jq $$1) {
      this.h.add(new fns(this.a, $$0, $$1));
   }

   public void a(bjt $$0, jq $$1, int $$2) {
      this.h.add(new fns(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fmq a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fmq $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jq> fmq b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fmt<T> $$7 = (fmt<T>)this.k.get(jy.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fmq $$0) {
      Optional<jp> $$1 = $$0.o();
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
         List<fns> $$0 = Lists.newArrayList();

         for (fns $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fmq $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fmq> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fmq> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fmq $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(jp $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fmq $$0) {
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

   public void a(emh $$0, fpb.a $$1, fpa $$2, eqz $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      emh $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fmu $$6 : f) {
         Iterable<fmq> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fou::u);
            emj $$8 = emj.a();
            emc $$9 = $$8.c();
            $$6.a($$9, this.i);

            for (fmq $$10 : $$7) {
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

   public void a(@Nullable fjr $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ht $$0, dgb $$1) {
      if (!$$1.i() && $$1.z()) {
         eiy $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, asy.c($$8 / 0.25));
               int $$12 = Math.max(2, asy.c($$9 / 0.25));
               int $$13 = Math.max(2, asy.c($$10 / 0.25));

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
                           new fnp(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ht $$0, hx $$1) {
      dgb $$2 = this.a.a_($$0);
      if ($$2.l() != dae.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eia $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == hx.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == hx.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == hx.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == hx.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == hx.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == hx.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fnp(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(jp $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fnl {
      private List<gaa> a;

      @Override
      public gaa a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gaa a(ate $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gaa> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jq> {
      fmt<T> create(fnl var1);
   }
}
