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

public class ftb implements aru {
   private static final Logger b = LogUtils.getLogger();
   private static final air c = air.a("particles");
   private static final aiy d = new aiy("particles");
   private static final int e = 16384;
   private static final List<ftd> f = ImmutableList.of(ftd.a, ftd.b, ftd.d, ftd.c, ftd.e);
   protected fpx a;
   private final Map<ftd, Queue<fsz>> g = Maps.newIdentityHashMap();
   private final Queue<fub> h = Queues.newArrayDeque();
   private final ggu i;
   private final awo j = awo.a();
   private final Int2ObjectMap<ftc<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fsz> l = Queues.newArrayDeque();
   private final Map<aiy, ftb.b> m = Maps.newHashMap();
   private final ggs n;
   private final Object2IntOpenHashMap<jw> o = new Object2IntOpenHashMap();

   public ftb(fpx $$0, ggu $$1) {
      this.n = new ggs(ggs.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(jz.a, ftr.a::new);
      this.a(jz.b, fsq.a::new);
      this.a(jz.d, new frt.a());
      this.a(jz.c, new fty.a());
      this.a(jz.e, frw.a::new);
      this.a(jz.an, frv.a::new);
      this.a(jz.al, frx.a::new);
      this.a(jz.aq, fry.a::new);
      this.a(jz.ar, fry.b::new);
      this.a(jz.f, fte.a::new);
      this.a(jz.N, ftx.a::new);
      this.a(jz.g, fsa.c::new);
      this.a(jz.am, fuf.a::new);
      this.a(jz.h, fsa.a::new);
      this.a(jz.i, fsb.a::new);
      this.a(jz.ap, ftx.b::new);
      this.a(jz.j, fsc::c);
      this.a(jz.k, fsc::d);
      this.a(jz.l, fsc::e);
      this.a(jz.m, fsc::a);
      this.a(jz.n, fsc::b);
      this.a(jz.o, fse.a::new);
      this.a(jz.p, fsd.a::new);
      this.a(jz.q, ftr.d::new);
      this.a(jz.r, new fsw.a());
      this.a(jz.s, fsa.b::new);
      this.a(jz.t, fsh.b::new);
      this.a(jz.u, fsi.a::new);
      this.a(jz.v, ftr.c::new);
      this.a(jz.w, new fss.a());
      this.a(jz.x, fsr.a::new);
      this.a(jz.A, ftp.a::new);
      this.a(jz.B, fsk.a::new);
      this.a(jz.y, fso.a::new);
      this.a(jz.z, new fsp.a());
      this.a(jz.C, fsl.d::new);
      this.a(jz.D, fue.a::new);
      this.a(jz.E, fsm.a::new);
      this.a(jz.G, ftq.a::new);
      this.a(jz.H, fti.a::new);
      this.a(jz.I, ftj.a::new);
      this.a(jz.K, ftq.b::new);
      this.a(jz.J, fsm.a::new);
      this.a(jz.L, fsl.a::new);
      this.a(jz.M, ftx.d::new);
      this.a(jz.O, fsq.b::new);
      this.a(jz.P, ftr.b::new);
      this.a(jz.Q, new fru.a());
      this.a(jz.S, new fru.b());
      this.a(jz.T, new fru.c());
      this.a(jz.U, fsu.a::new);
      this.a(jz.V, fsv.a::new);
      this.a(jz.W, ftx.e::new);
      this.a(jz.ao, fsh.a::new);
      this.a(jz.X, fsy.a::new);
      this.a(jz.Y, fsj.a::new);
      this.a(jz.Z, ftf.a::new);
      this.a(jz.aa, fug.a::new);
      this.a(jz.ab, ftn.a::new);
      this.a(jz.ac, fui.a::new);
      this.a(jz.ad, fte.b::new);
      this.a(jz.aH, fto.a::new);
      this.a(jz.ae, fts.a::new);
      this.a(jz.ag, frr.a::new);
      this.a(jz.ah, fua.a::new);
      this.a(jz.af, ftv.b::new);
      this.a(jz.ai, ftw.c::new);
      this.a(jz.aj, ftt.a::new);
      this.a(jz.ak, ftr.e::new);
      this.a(jz.as, fsc::f);
      this.a(jz.at, fsc::g);
      this.a(jz.au, fsc::h);
      this.a(jz.av, fsc::m);
      this.a(jz.aw, fsc::n);
      this.a(jz.aA, ftw.b::new);
      this.a(jz.ax, frq.a::new);
      this.a(jz.ay, ftw.a::new);
      this.a(jz.az, ftw.d::new);
      this.a(jz.aB, fsc::o);
      this.a(jz.aC, fsc::p);
      this.a(jz.aD, fsc::q);
      this.a(jz.aE, ftg.a::new);
      this.a(jz.aF, fuh.a::new);
      this.a(jz.aG, fsm.b::new);
      this.a(jz.aK, fsc::i);
      this.a(jz.aL, fsc::j);
      this.a(jz.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new frz($$2, $$3, $$4, $$5, $$0));
      this.a(jz.aI, fsc::k);
      this.a(jz.aJ, fsc::l);
      this.a(jz.R, fud.a::new);
      this.a(jz.aM, ftv.a::new);
      this.a(jz.aN, fsn.b::new);
      this.a(jz.aO, fsn.e::new);
      this.a(jz.aP, fsn.d::new);
      this.a(jz.aQ, fsn.a::new);
      this.a(jz.aR, fsn.c::new);
      this.a(jz.aS, ftk.a::new);
      this.a(jz.aT, ftx.c::new);
      this.a(jz.aU, fsg.a::new);
      this.a(jz.aV, fuc.a::new);
   }

   private <T extends jx> void a(jy<T> $$0, ftc<T> $$1) {
      this.k.put(kf.j.a($$0), $$1);
   }

   private <T extends jx> void a(jy<T> $$0, ftc.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            ftz $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends jx> void a(jy<T> $$0, ftb.c<T> $$1) {
      ftb.b $$2 = new ftb.b();
      this.m.put(kf.j.b($$0), $$2);
      this.k.put(kf.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      record a(aiy a, Optional<List<aiy>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<aiy, ary>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aiy $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.b($$2x);
      });
      CompletableFuture<ggo.a> $$7 = ggo.a(this.n).a($$1, d, 0, $$4).thenCompose(ggo.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         ggo.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<aiy> $$5x = new HashSet<>();
         ggt $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<aiy>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<ggt> $$5xx = new ArrayList<>();

               for (aiy $$6xx : $$4xx.get()) {
                  ggt $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aiy::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<aiy>> a(aiy $$0, ary $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fta $$3 = fta.a(avx.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bno $$0, jx $$1) {
      this.h.add(new fub(this.a, $$0, $$1));
   }

   public void a(bno $$0, jx $$1, int $$2) {
      this.h.add(new fub(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fsz a(jx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fsz $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends jx> fsz b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ftc<T> $$7 = (ftc<T>)this.k.get(kf.j.a($$0.b()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fsz $$0) {
      Optional<jw> $$1 = $$0.o();
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
         List<fub> $$0 = Lists.newArrayList();

         for (fub $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fsz $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fsz> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fsz> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fsz $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(jw $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fsz $$0) {
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

   public void a(esa $$0, fvl.a $$1, fvk $$2, ews $$3, float $$4) {
      $$2.c();
      RenderSystem.enableDepthTest();
      esa $$5 = RenderSystem.getModelViewStack();
      $$5.a();
      $$5.a($$0.c().a());
      RenderSystem.applyModelViewMatrix();

      for (ftd $$6 : f) {
         Iterable<fsz> $$7 = this.g.get($$6);
         if ($$7 != null) {
            RenderSystem.setShader(fve::u);
            esc $$8 = esc.b();
            erv $$9 = $$8.d();
            $$6.a($$9, this.i);

            for (fsz $$10 : $$7) {
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

   public void a(@Nullable fpx $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(hz $$0, dlf $$1) {
      if (!$$1.i() && $$1.z()) {
         eol $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, awh.c($$8 / 0.25));
               int $$12 = Math.max(2, awh.c($$9 / 0.25));
               int $$13 = Math.max(2, awh.c($$10 / 0.25));

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
                           new fty(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(hz $$0, ie $$1) {
      dlf $$2 = this.a.a_($$0);
      if ($$2.l() != det.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         enn $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ie.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ie.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ie.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ie.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ie.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ie.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fty(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(jw $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements ftu {
      private List<ggt> a;

      @Override
      public ggt a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public ggt a(awo $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<ggt> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends jx> {
      ftc<T> create(ftu var1);
   }
}
