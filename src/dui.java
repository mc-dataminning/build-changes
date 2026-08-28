import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dui {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dui> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kj.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kj.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dfo.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               alg.a(ly.bd).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dui::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dfo> h;
   protected Optional<alg<eub>> i;
   @Nullable
   protected btz j;
   @Nullable
   private bqg<cvx> p;
   protected double k;
   protected double l;

   public dui() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dui(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dfo> $$5, Optional<alg<eub>> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a() {
      this.d.clear();
      this.h = Optional.empty();
      this.b();
   }

   public void b() {
      this.c.clear();
      this.g = 0;
      this.f = 0L;
      this.e = 0L;
   }

   public boolean a(duf $$0, azr $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().i().d();
   }

   public boolean a(dug $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(arm $$0, dug $$1, int $$2) {
      return $$0.aa() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(jg $$0) {
      if (this.c.isEmpty()) {
         ad.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(arm $$0, jg $$1, duf $$2) {
      boolean $$3 = ($$1.a() + $$0.aa()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(duj.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<coh, jp<btc>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  coh $$4x = (coh)$$3x.getFirst();
                  if ($$3x.getSecond() == btg.E) {
                     a($$4x);
                  }

                  $$0.c(3020, jg.a((jz)$$4x.bG()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(duj.f) || $$7) {
               boolean $$8 = $$2.f().c.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$9)) {
                  this.f = Math.max($$0.aa() + 40L, this.f);
                  if (!$$7) {
                     int $$10 = $$2.e() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<coh, jp<btc>>> a(arm $$0, List<UUID> $$1) {
      coh $$2 = null;

      for (UUID $$3 : $$1) {
         coh $$4 = $$0.b($$3);
         if ($$4 != null) {
            jp<btc> $$5 = btg.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(btg.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, btg.E));
   }

   public void a(duf $$0, arm $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dx(), duf.a.a.a());
            if ($$1x instanceof bux $$2) {
               $$2.ga();
            }

            $$1x.a(btz.c.b);
         }
      });
      if (!$$0.d().i().d()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.aa() + (long)$$0.d().h();
      $$0.j();
      this.e = $$1.aa() + $$0.d().a();
   }

   private static void a(coh $$0) {
      bte $$1 = $$0.c(btg.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(btg.E);
         $$0.a(new bte(btg.H, $$3, 0));
      }
   }

   public boolean a(arm $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.aa() >= (float)$$3 + $$1;
   }

   public boolean b(arm $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.aa() - $$3) % $$1 == 0.0F;
   }

   public boolean a(arm $$0) {
      return $$0.aa() >= this.e;
   }

   public void a(duf $$0, azr $$1, bug<?> $$2) {
      this.b($$0, $$1).a().a("id", lx.f.b($$2).toString());
   }

   protected dfo b(duf $$0, azr $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bqg<dfo> $$2 = $$0.b().i();
         Optional<dfo> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bqi.b::b);
         this.h = Optional.of($$3.orElseGet(dfo::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public btz a(duf $$0, dev $$1, duj $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            uj $$3 = this.b($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.j = bug.a($$3, $$1, buf.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public uj a(duj $$0) {
      uj $$1 = new uj();
      if ($$0 == duj.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (vg)dfo.b.encodeStart(ux.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bqg<cvx> a(arm $$0, dug $$1, jg $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         eub $$3 = $$0.o().bd().b($$1.k());
         etz $$4 = new etz.a($$0).a(ewr.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cvx> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bqg.b();
         } else {
            bqg.a<cvx> $$7 = new bqg.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cvx $$8 = (cvx)var10.next();
               $$7.a($$8.c(1), $$8.L());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(arm $$0, jg $$1) {
      jg $$2 = new jg(azj.d((float)$$1.u() / 30.0F), azj.d((float)$$1.v() / 20.0F), azj.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
