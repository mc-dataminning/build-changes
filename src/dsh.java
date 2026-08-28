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

public class dsh {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dsh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kg.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kg.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               ddo.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               akq.a(lu.bc).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dsh::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<ddo> h;
   protected Optional<akq<eru>> i;
   @Nullable
   protected bsr j;
   @Nullable
   private bpb<cuq> p;
   protected double k;
   protected double l;

   public dsh() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dsh(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<ddo> $$5, Optional<akq<eru>> $$6) {
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
      this.h = Optional.empty();
   }

   public boolean a(dsf $$0, ayw $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().h().d();
   }

   public boolean a(dsg $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public boolean a(aqu $$0, dsg $$1, int $$2) {
      return $$0.Z() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(jd $$0) {
      if (this.c.isEmpty()) {
         ad.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(aqu $$0, jd $$1, dsf $$2) {
      boolean $$3 = ($$1.a() + $$0.Z()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dsi.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<cmx, jm<brx>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cmx $$4x = (cmx)$$3x.getFirst();
                  if ($$3x.getSecond() == bsb.E) {
                     a($$4x);
                  }

                  $$0.c(3020, jd.a((jw)$$4x.by()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dsi.f) || $$7) {
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

   private static Optional<Pair<cmx, jm<brx>>> a(aqu $$0, List<UUID> $$1) {
      cmx $$2 = null;

      for (UUID $$3 : $$1) {
         cmx $$4 = $$0.b($$3);
         if ($$4 != null) {
            jm<brx> $$5 = bsb.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bsb.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bsb.E));
   }

   public void a(dsf $$0, aqu $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dp(), dsf.a.a.a());
            if ($$1x instanceof btp $$2) {
               $$2.fR();
            }

            $$1x.a(bsr.c.b);
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

   private static void a(cmx $$0) {
      brz $$1 = $$0.c(bsb.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bsb.E);
         $$0.b(new brz(bsb.H, $$3, 0));
      }
   }

   public boolean a(aqu $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.Z() >= (float)$$3 + $$1;
   }

   public boolean b(aqu $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.Z() - $$3) % $$1 == 0.0F;
   }

   public boolean a(aqu $$0) {
      return $$0.Z() >= this.e;
   }

   public void a(dsf $$0, ayw $$1, bsx<?> $$2) {
      this.b($$0, $$1).a().a("id", lt.f.b($$2).toString());
   }

   protected ddo b(dsf $$0, ayw $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bpb<ddo> $$2 = $$0.b().h();
         Optional<ddo> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bpd.b::b);
         this.h = Optional.of($$3.orElseGet(ddo::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bsr a(dsf $$0, dcw $$1, dsi $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            ub $$3 = this.b($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.j = bsx.a($$3, $$1, Function.identity());
            }
         }

         return this.j;
      }
   }

   public ub a(dsi $$0) {
      ub $$1 = new ub();
      if ($$0 == dsi.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (uy)ddo.b.encodeStart(up.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double c() {
      return this.k;
   }

   public double d() {
      return this.l;
   }

   bpb<cuq> a(aqu $$0, dsg $$1, jd $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         eru $$3 = $$0.o().be().b($$1.j());
         ers $$4 = new ers.a($$0).a(euk.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cuq> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bpb.b();
         } else {
            bpb.a<cuq> $$7 = new bpb.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cuq $$8 = (cuq)var10.next();
               $$7.a($$8.c(1), $$8.H());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(aqu $$0, jd $$1) {
      jd $$2 = new jd(ayo.d((float)$$1.u() / 30.0F), ayo.d((float)$$1.v() / 20.0F), ayo.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
