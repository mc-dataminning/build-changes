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

public class dwd {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dwd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kl.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dhd.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               aku.a(mc.bg).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dwd::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dhd> h;
   protected Optional<aku<evx>> i;
   @Nullable
   protected bum j;
   @Nullable
   private bqt<cwq> p;
   protected double k;
   protected double l;

   public dwd() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dwd(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dhd> $$5, Optional<aku<evx>> $$6) {
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

   public boolean a(dwa $$0, azh $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().i().d();
   }

   public boolean a(dwb $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(ard $$0, dwb $$1, int $$2) {
      return $$0.ad() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(ji $$0) {
      if (this.c.isEmpty()) {
         af.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(ard $$0, ji $$1, dwa $$2) {
      boolean $$3 = ($$1.a() + $$0.ad()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dwe.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<coy, jr<btp>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  coy $$4x = (coy)$$3x.getFirst();
                  if ($$3x.getSecond() == btt.E) {
                     a($$4x);
                  }

                  $$0.c(3020, ji.a((kb)$$4x.bF()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dwe.f) || $$7) {
               boolean $$8 = $$2.f().c.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$9)) {
                  this.f = Math.max($$0.ad() + 40L, this.f);
                  if (!$$7) {
                     int $$10 = $$2.e() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<coy, jr<btp>>> a(ard $$0, List<UUID> $$1) {
      coy $$2 = null;

      for (UUID $$3 : $$1) {
         coy $$4 = $$0.b($$3);
         if ($$4 != null) {
            jr<btp> $$5 = btt.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(btt.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, btt.E));
   }

   public void a(dwa $$0, ard $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dv(), dwa.a.a.a());
            if ($$1x instanceof bvk $$2) {
               $$2.b($$1);
            }

            $$1x.a(bum.d.b);
         }
      });
      if (!$$0.d().i().d()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.ad() + (long)$$0.d().h();
      $$0.j();
      this.e = $$1.ad() + $$0.d().a();
   }

   private static void a(coy $$0) {
      btr $$1 = $$0.c(btt.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(btt.E);
         $$0.a(new btr(btt.H, $$3, 0));
      }
   }

   public boolean a(ard $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.ad() >= (float)$$3 + $$1;
   }

   public boolean b(ard $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.ad() - $$3) % $$1 == 0.0F;
   }

   public boolean a(ard $$0) {
      return $$0.ad() >= this.e;
   }

   protected dhd b(dwa $$0, azh $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bqt<dhd> $$2 = $$0.b().i();
         Optional<dhd> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bqv.b::b);
         this.h = Optional.of($$3.orElseGet(dhd::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bum a(dwa $$0, dgj $$1, dwe $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            tq $$3 = this.b($$0, $$1.H_()).a();
            if ($$3.b("id", 8)) {
               this.j = but.a($$3, $$1, bus.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public tq a(dwe $$0) {
      tq $$1 = new tq();
      if ($$0 == dwe.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (un)dhd.b.encodeStart(ue.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bqt<cwq> a(ard $$0, dwb $$1, ji $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         evx $$3 = $$0.p().bc().b($$1.k());
         evv $$4 = new evv.a($$0).a(eyl.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cwq> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bqt.b();
         } else {
            bqt.a<cwq> $$7 = new bqt.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cwq $$8 = (cwq)var10.next();
               $$7.a($$8.c(1), $$8.M());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(ard $$0, ji $$1) {
      ji $$2 = new ji(ayz.d((float)$$1.u() / 30.0F), ayz.d((float)$$1.v() / 20.0F), ayz.d((float)$$1.w() / 30.0F));
      return $$0.E() + $$2.a();
   }
}
