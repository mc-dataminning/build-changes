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

public class dyt {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dyt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               jy.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               djj.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ald.a(mg.bo).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dyt::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<djj> h;
   protected Optional<ald<eys>> i;
   @Nullable
   protected bwa j;
   @Nullable
   private bsj<cys> p;
   protected double k;
   protected double l;

   public dyt() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dyt(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<djj> $$5, Optional<ald<eys>> $$6) {
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

   public boolean a(dyq $$0, azt $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().i().c();
   }

   public boolean a(dyr $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(aro $$0, dyr $$1, int $$2) {
      return $$0.ae() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(iu $$0) {
      if (this.c.isEmpty()) {
         af.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(aro $$0, iu $$1, dyq $$2) {
      boolean $$3 = ($$1.a() + $$0.ae()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dyu.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<cqs, je<bvc>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cqs $$4x = (cqs)$$3x.getFirst();
                  if ($$3x.getSecond() == bvg.E) {
                     a($$4x);
                  }

                  $$0.c(3020, iu.a((jo)$$4x.bE()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dyu.f) || $$7) {
               boolean $$8 = $$2.f().c.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$9)) {
                  this.f = Math.max($$0.ae() + 40L, this.f);
                  if (!$$7) {
                     int $$10 = $$2.e() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<cqs, je<bvc>>> a(aro $$0, List<UUID> $$1) {
      cqs $$2 = null;

      for (UUID $$3 : $$1) {
         cqs $$4 = $$0.a($$3);
         if ($$4 != null) {
            je<bvc> $$5 = bvg.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bvg.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bvg.E));
   }

   public void a(dyq $$0, aro $$1) {
      this.d.stream().map($$1::b).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dv(), dyq.a.a.a());
            if ($$1x instanceof bxb $$2) {
               $$2.b($$1);
            }

            $$1x.a(bwa.e.b);
         }
      });
      if (!$$0.d().i().c()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.ae() + (long)$$0.d().h();
      $$0.j();
      this.e = $$1.ae() + $$0.d().a();
   }

   private static void a(cqs $$0) {
      bve $$1 = $$0.c(bvg.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bvg.E);
         $$0.a(new bve(bvg.H, $$3, 0));
      }
   }

   public boolean a(aro $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.ae() >= (float)$$3 + $$1;
   }

   public boolean b(aro $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.ae() - $$3) % $$1 == 0.0F;
   }

   public boolean a(aro $$0) {
      return $$0.ae() >= this.e;
   }

   protected djj b(dyq $$0, azt $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bsj<djj> $$2 = $$0.b().i();
         Optional<djj> $$3 = $$2.c() ? this.h : $$2.a($$1);
         this.h = Optional.of($$3.orElseGet(djj::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bwa a(dyq $$0, dip $$1, dyu $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            tx $$3 = this.b($$0, $$1.C_()).a();
            if ($$3.b("id", 8)) {
               this.j = bwj.a($$3, $$1, bwi.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public tx a(dyu $$0) {
      tx $$1 = new tx();
      if ($$0 == dyu.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (uu)djj.b.encodeStart(ul.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bsj<cys> a(aro $$0, dyr $$1, iu $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         eys $$3 = $$0.p().bc().b($$1.k());
         eyq $$4 = new eyq.a($$0).a(fbg.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cys> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bsj.a();
         } else {
            bsj.a<cys> $$7 = bsj.b();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cys $$8 = (cys)var10.next();
               $$7.a($$8.c(1), $$8.M());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(aro $$0, iu $$1) {
      iu $$2 = new iu(azk.d((float)$$1.u() / 30.0F), azk.d((float)$$1.v() / 20.0F), azk.d((float)$$1.w() / 30.0F));
      return $$0.E() + $$2.a();
   }
}
