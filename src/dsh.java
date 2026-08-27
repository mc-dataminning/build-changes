import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
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
   private static final String n = "next_mob_spawns_at";
   public static MapCodec<dsh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.b.optionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               ju.b.optionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.optionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.optionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dcr.b.optionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               aks.a(li.aU).optionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dsh::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dcr> h;
   protected Optional<aks<eru>> i;
   protected bok<dcr> j;
   @Nullable
   protected brv k;
   protected double l;
   protected double m;

   public dsh() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dsh(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dcr> $$5, Optional<aks<eru>> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a(dsg $$0) {
      bok<dcr> $$1 = $$0.i();
      if ($$1.d()) {
         this.j = bok.a(this.h.orElseGet(dcr::new));
      } else {
         this.j = $$1;
      }
   }

   public void a() {
      this.c.clear();
      this.g = 0;
      this.f = 0L;
      this.e = 0L;
      this.d.clear();
   }

   public boolean a(dsf $$0, ayt $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !this.j.d();
   }

   public boolean a(dsg $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public boolean a(aqt $$0, dsg $$1, int $$2) {
      return $$0.Z() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(ir $$0) {
      if (this.c.isEmpty()) {
         ad.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(aqt $$0, ir $$1, dse $$2, dse.a $$3, int $$4) {
      List<UUID> $$5 = $$2.detect($$0, $$3, $$1, (double)$$4);
      boolean $$6 = this.c.addAll($$5);
      if ($$6) {
         this.f = Math.max($$0.Z() + 40L, this.f);
         $$0.c(3013, $$1, this.c.size());
      }
   }

   public boolean a(aqt $$0, dsg $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)$$0.Z() >= (float)$$3 + $$2;
   }

   public boolean b(aqt $$0, dsg $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)($$0.Z() - $$3) % $$2 == 0.0F;
   }

   public boolean a(aqt $$0) {
      return $$0.Z() >= this.e;
   }

   public void a(dsf $$0, ayt $$1, bsb<?> $$2) {
      this.b($$0, $$1).a().a("id", lh.g.b($$2).toString());
   }

   protected dcr b(dsf $$0, ayt $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         dcr $$2 = this.j.b($$1).map(bom.b::b).orElseGet(dcr::new);
         this.h = Optional.of($$2);
         $$0.e();
         return $$2;
      }
   }

   @Nullable
   public brv a(dsf $$0, dca $$1, dsi $$2) {
      if ($$0.a($$1) && $$2.d()) {
         if (this.k == null) {
            uk $$3 = this.b($$0, $$1.F_()).a();
            if ($$3.b("id", 8)) {
               this.k = bsb.a($$3, $$1, Function.identity());
            }
         }

         return this.k;
      } else {
         return null;
      }
   }

   public uk a(dsi $$0) {
      uk $$1 = new uk();
      if ($$0 == dsi.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (vh)dcr.b.encodeStart(uy.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double c() {
      return this.l;
   }

   public double d() {
      return this.m;
   }
}
