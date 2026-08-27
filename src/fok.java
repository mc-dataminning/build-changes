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

public class fok implements apb {
   private static final Logger b = LogUtils.getLogger();
   private static final agb c = agb.a("particles");
   private static final agi d = new agi("particles");
   private static final int e = 16384;
   private static final List<fom> f = ImmutableList.of(fom.a, fom.b, fom.d, fom.c, fom.e);
   protected flj a;
   private final Map<fom, Queue<foi>> g = Maps.newIdentityHashMap();
   private final Queue<fpl> h = Queues.newArrayDeque();
   private final gbv i;
   private final ats j = ats.a();
   private final Int2ObjectMap<fol<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<foi> l = Queues.newArrayDeque();
   private final Map<agi, fok.b> m = Maps.newHashMap();
   private final gbt n;
   private final Object2IntOpenHashMap<jp> o = new Object2IntOpenHashMap();

   public fok(flj $$0, gbv $$1) {
      this.n = new gbt(gbt.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(js.a, fpb.a::new);
      this.a(js.b, fnz.a::new);
      this.a(js.d, new fne.a());
      this.a(js.c, new fpi.a());
      this.a(js.e, fnh.a::new);
      this.a(js.al, fng.a::new);
      this.a(js.aj, fni.a::new);
      this.a(js.ao, fnj.a::new);
      this.a(js.ap, fnj.b::new);
      this.a(js.f, fon.a::new);
      this.a(js.L, fph.a::new);
      this.a(js.g, fnl.c::new);
      this.a(js.ak, fpo.a::new);
      this.a(js.h, fnl.a::new);
      this.a(js.i, fnm.a::new);
      this.a(js.an, fph.b::new);
      this.a(js.j, fnn::c);
      this.a(js.k, fnn::d);
      this.a(js.l, fnn::e);
      this.a(js.m, fnn::a);
      this.a(js.n, fnn::b);
      this.a(js.o, fnp.a::new);
      this.a(js.p, fno.a::new);
      this.a(js.q, fpb.d::new);
      this.a(js.r, new fof.a());
      this.a(js.s, fnl.b::new);
      this.a(js.t, fns.b::new);
      this.a(js.u, fnt.a::new);
      this.a(js.v, fpb.c::new);
      this.a(js.w, new fob.a());
      this.a(js.x, foa.a::new);
      this.a(js.y, foz.a::new);
      this.a(js.z, fnv.a::new);
      this.a(js.A, fnw.d::new);
      this.a(js.B, fpn.a::new);
      this.a(js.C, fnx.a::new);
      this.a(js.E, fpa.a::new);
      this.a(js.F, fos.a::new);
      this.a(js.G, fot.a::new);
      this.a(js.I, fpa.b::new);
      this.a(js.H, fnx.a::new);
      this.a(js.J, fnw.a::new);
      this.a(js.K, fph.d::new);
      this.a(js.M, fnz.b::new);
      this.a(js.N, fpb.b::new);
      this.a(js.O, new fnf.a());
      this.a(js.Q, new fnf.b());
      this.a(js.R, new fnf.c());
      this.a(js.S, fod.a::new);
      this.a(js.T, foe.a::new);
      this.a(js.U, fph.e::new);
      this.a(js.am, fns.a::new);
      this.a(js.V, foh.a::new);
      this.a(js.W, fnu.a::new);
      this.a(js.X, foo.a::new);
      this.a(js.Y, fpp.a::new);
      this.a(js.Z, fox.a::new);
      this.a(js.aa, fpr.a::new);
      this.a(js.ab, fon.b::new);
      this.a(js.aF, foy.a::new);
      this.a(js.ac, fpc.a::new);
      this.a(js.ae, fnc.a::new);
      this.a(js.af, fpk.a::new);
      this.a(js.ad, fpf.b::new);
      this.a(js.ag, fpg.c::new);
      this.a(js.ah, fpd.a::new);
      this.a(js.ai, fpb.e::new);
      this.a(js.aq, fnn::f);
      this.a(js.ar, fnn::g);
      this.a(js.as, fnn::h);
      this.a(js.at, fnn::m);
      this.a(js.au, fnn::n);
      this.a(js.ay, fpg.b::new);
      this.a(js.av, fnb.a::new);
      this.a(js.aw, fpg.a::new);
      this.a(js.ax, fpg.d::new);
      this.a(js.az, fnn::o);
      this.a(js.aA, fnn::p);
      this.a(js.aB, fnn::q);
      this.a(js.aC, fop.a::new);
      this.a(js.aD, fpq.a::new);
      this.a(js.aE, fnx.b::new);
      this.a(js.aI, fnn::i);
      this.a(js.aJ, fnn::j);
      this.a(js.D, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fnk($$2, $$3, $$4, $$5, $$0));
      this.a(js.aG, fnn::k);
      this.a(js.aH, fnn::l);
      this.a(js.P, fpm.a::new);
      this.a(js.aK, fpf.a::new);
      this.a(js.aL, fny.b::new);
      this.a(js.aM, fny.e::new);
      this.a(js.aN, fny.d::new);
      this.a(js.aO, fny.a::new);
      this.a(js.aP, fny.c::new);
      this.a(js.aQ, fou.a::new);
      this.a(js.aR, fph.c::new);
      this.a(js.aS, fnr.a::new);
   }

   private <T extends jq> void a(jr<T> $$0, fol<T> $$1) {
      this.k.put(jy.k.a($$0), $$1);
   }

   private <T extends jq> void a(jr<T> $$0, fol.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fpj $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jq> void a(jr<T> $$0, fok.c<T> $$1) {
      fok.b $$2 = new fok.b();
      this.m.put(jy.k.b($$0), $$2);
      this.k.put(jy.k.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      record a(agi a, Optional<List<agi>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<agi, apf>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            agi $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<gbp.a> $$7 = gbp.a(this.n).a($$1, d, 0, $$4).thenCompose(gbp.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gbp.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<agi> $$5x = new HashSet<>();
         gbu $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<agi>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gbu> $$5xx = new ArrayList<>();

               for (agi $$6xx : $$4xx.get()) {
                  gbu $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(agi::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<agi>> a(agi $$0, apf $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               foj $$3 = foj.a(atc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bkq $$0, jq $$1) {
      this.h.add(new fpl(this.a, $$0, $$1));
   }

   public void a(bkq $$0, jq $$1, int $$2) {
      this.h.add(new fpl(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public foi a(jq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      foi $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jq> foi b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fol<T> $$7 = (fol<T>)this.k.get(jy.k.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(foi $$0) {
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
         this.a.ae().a($$0.toString());
         this.a($$1x);
         this.a.ae().c();
      });
      if (!this.h.isEmpty()) {
         List<fpl> $$0 = Lists.newArrayList();

         for (fpl $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      foi $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<foi> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<foi> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            foi $$2 = $$1.next();
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

   private void b(foi $$0) {
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

   public void a(enw $$0, fqu.a $$1, fqt $$2, eso $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      enw $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (fom $$6 : f) {
         Iterable<foi> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fqn::u);
            eny $$8 = eny.b();
            enr $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (foi $$10 : $$7) {
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

   public void a(@Nullable flj $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ht $$0, dhi $$1) {
      if (!$$1.i() && $$1.z()) {
         ekn $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, atm.c($$8 / 0.25));
               int $$12 = Math.max(2, atm.c($$9 / 0.25));
               int $$13 = Math.max(2, atm.c($$10 / 0.25));

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
                           new fpi(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ht $$0, hx $$1) {
      dhi $$2 = this.a.a_($$0);
      if ($$2.l() != dbf.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ejp $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new fpi(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fpe {
      private List<gbu> a;

      @Override
      public gbu a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gbu a(ats $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gbu> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jq> {
      fol<T> create(fpe var1);
   }
}
