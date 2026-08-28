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

public class dsf {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dsf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kg.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               ddm.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               akp.a(lu.bc).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dsf::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<ddm> h;
   protected Optional<akp<erq>> i;
   @Nullable
   protected bsq j;
   @Nullable
   private bpa<cuo> p;
   protected double k;
   protected double l;

   public dsf() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dsf(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<ddm> $$5, Optional<akp<erq>> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a() {
      this.c.clear();
      this.g = 0;
      this.f = 0L;
      this.e = 0L;
      this.d.clear();
   }

   public boolean a(dsd $$0, ayv $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().h().d();
   }

   public boolean a(dse $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public boolean a(aqt $$0, dse $$1, int $$2) {
      return $$0.Z() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(jd $$0) {
      if (this.c.isEmpty()) {
         ad.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(aqt $$0, jd $$1, dsd $$2) {
      boolean $$3 = ($$1.a() + $$0.Z()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dsg.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<cmv, jm<brw>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cmv $$4x = (cmv)$$3x.getFirst();
                  if ($$3x.getSecond() == bsa.E) {
                     a($$4x);
                  }

                  $$0.c(3020, jd.a((jw)$$4x.by()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dsg.f) || $$7) {
               boolean $$8 = $$2.f().c.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$9)) {
                  this.f = Math.max($$0.Z() + 40L, this.f);
                  if (!$$7) {
                     int $$10 = $$2.e() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<cmv, jm<brw>>> a(aqt $$0, List<UUID> $$1) {
      cmv $$2 = null;

      for (UUID $$3 : $$1) {
         cmv $$4 = $$0.b($$3);
         if ($$4 != null) {
            jm<brw> $$5 = bsa.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bsa.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bsa.E));
   }

   public void a(dsd $$0, aqt $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dq(), dsd.a.a.a());
            $$1x.a(bsq.c.b);
         }
      });
      if (!$$0.d().h().d()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.Z() + (long)$$0.d().g();
      $$0.j();
      this.e = $$1.Z() + $$0.d().a();
   }

   private static void a(cmv $$0) {
      bry $$1 = $$0.c(bsa.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bsa.E);
         $$0.b(new bry(bsa.H, $$3, 0));
      }
   }

   public boolean a(aqt $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.Z() >= (float)$$3 + $$1;
   }

   public boolean b(aqt $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.Z() - $$3) % $$1 == 0.0F;
   }

   public boolean a(aqt $$0) {
      return $$0.Z() >= this.e;
   }

   public void a(dsd $$0, ayv $$1, bsw<?> $$2) {
      this.b($$0, $$1).a().a("id", lt.f.b($$2).toString());
   }

   protected ddm b(dsd $$0, ayv $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bpa<ddm> $$2 = $$0.b().h();
         Optional<ddm> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bpc.b::b);
         this.h = Optional.of($$3.orElseGet(ddm::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bsq a(dsd $$0, dcu $$1, dsg $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            ua $$3 = this.b($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.j = bsw.a($$3, $$1, Function.identity());
            }
         }

         return this.j;
      }
   }

   public ua a(dsg $$0) {
      ua $$1 = new ua();
      if ($$0 == dsg.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (ux)ddm.b.encodeStart(uo.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double c() {
      return this.k;
   }

   public double d() {
      return this.l;
   }

   bpa<cuo> a(aqt $$0, dse $$1, jd $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         erq $$3 = $$0.o().be().b($$1.j());
         ero $$4 = new ero.a($$0).a(eug.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cuo> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bpa.b();
         } else {
            bpa.a<cuo> $$7 = new bpa.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cuo $$8 = (cuo)var10.next();
               $$7.a($$8.c(1), $$8.H());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(aqt $$0, jd $$1) {
      jd $$2 = new jd(ayn.d((float)$$1.u() / 30.0F), ayn.d((float)$$1.v() / 20.0F), ayn.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
