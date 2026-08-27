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

public class dmg {
   public static final String a = "spawn_data";
   private static final String n = "next_mob_spawns_at";
   public static MapCodec<dmg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jf.b.optionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               jf.b.optionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.optionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.optionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               cxs.b.optionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ajh.a.optionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dmg::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<cxs> h;
   protected Optional<ajh> i;
   protected bln<cxs> j;
   @Nullable
   protected box k;
   protected double l;
   protected double m;

   public dmg() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dmg(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<cxs> $$5, Optional<ajh> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a(dmf $$0) {
      bln<cxs> $$1 = $$0.i();
      if ($$1.d()) {
         this.j = bln.a(this.h.orElseGet(cxs::new));
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

   public boolean b() {
      boolean $$0 = this.h.isPresent() && this.h.get().a().b("id", 8);
      return $$0 || !this.j.d();
   }

   public boolean a(dmf $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(apf $$0, dmf $$1, int $$2) {
      return $$0.X() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(ib $$0) {
      if (this.c.isEmpty()) {
         ac.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(apf $$0, ib $$1, dmd $$2, dmd.a $$3, int $$4) {
      List<UUID> $$5 = $$2.detect($$0, $$3, $$1, (double)$$4);
      boolean $$6 = this.c.addAll($$5);
      if ($$6) {
         this.f = Math.max($$0.X() + 40L, this.f);
         $$0.c(3013, $$1, this.c.size());
      }
   }

   public boolean a(apf $$0, dmf $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)$$0.X() >= (float)$$3 + $$2;
   }

   public boolean b(apf $$0, dmf $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)($$0.X() - $$3) % $$2 == 0.0F;
   }

   public boolean a(apf $$0) {
      return $$0.X() >= this.e;
   }

   public void a(dme $$0, axd $$1, bpd<?> $$2) {
      this.a($$0, $$1).a().a("id", ki.g.b($$2).toString());
   }

   protected cxs a(dme $$0, axd $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         this.h = Optional.of(this.j.b($$1).map(blp.b::b).orElseGet(cxs::new));
         $$0.e();
         return this.h.get();
      }
   }

   @Nullable
   public box a(dme $$0, cxb $$1, dmh $$2) {
      if ($$0.a($$1) && $$2.d()) {
         if (this.k == null) {
            ta $$3 = this.a($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.k = bpd.a($$3, $$1, Function.identity());
            }
         }

         return this.k;
      } else {
         return null;
      }
   }

   public ta a(dmh $$0) {
      ta $$1 = new ta();
      if ($$0 == dmh.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (tx)cxs.b.encodeStart(to.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.l;
   }

   public double e() {
      return this.m;
   }
}
