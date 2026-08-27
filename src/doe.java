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

public class doe {
   public static final String a = "spawn_data";
   private static final String n = "next_mob_spawns_at";
   public static MapCodec<doe> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jf.b.optionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               jf.b.optionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.optionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.optionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               czo.b.optionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ajt.a.optionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, doe::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<czo> h;
   protected Optional<ajt> i;
   protected bmk<czo> j;
   @Nullable
   protected bpv k;
   protected double l;
   protected double m;

   public doe() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public doe(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<czo> $$5, Optional<ajt> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a(dod $$0) {
      bmk<czo> $$1 = $$0.i();
      if ($$1.d()) {
         this.j = bmk.a(this.h.orElseGet(czo::new));
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

   public boolean a(doc $$0, axr $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !this.j.d();
   }

   public boolean a(dod $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public boolean a(aps $$0, dod $$1, int $$2) {
      return $$0.Y() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(ib $$0) {
      if (this.c.isEmpty()) {
         ac.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(aps $$0, ib $$1, dob $$2, dob.a $$3, int $$4) {
      List<UUID> $$5 = $$2.detect($$0, $$3, $$1, (double)$$4);
      boolean $$6 = this.c.addAll($$5);
      if ($$6) {
         this.f = Math.max($$0.Y() + 40L, this.f);
         $$0.c(3013, $$1, this.c.size());
      }
   }

   public boolean a(aps $$0, dod $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)$$0.Y() >= (float)$$3 + $$2;
   }

   public boolean b(aps $$0, dod $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)($$0.Y() - $$3) % $$2 == 0.0F;
   }

   public boolean a(aps $$0) {
      return $$0.Y() >= this.e;
   }

   public void a(doc $$0, axr $$1, bqb<?> $$2) {
      this.b($$0, $$1).a().a("id", kr.g.b($$2).toString());
   }

   protected czo b(doc $$0, axr $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         czo $$2 = this.j.b($$1).map(bmm.b::b).orElseGet(czo::new);
         this.h = Optional.of($$2);
         $$0.e();
         return $$2;
      }
   }

   @Nullable
   public bpv a(doc $$0, cyx $$1, dof $$2) {
      if ($$0.a($$1) && $$2.d()) {
         if (this.k == null) {
            tm $$3 = this.b($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.k = bqb.a($$3, $$1, Function.identity());
            }
         }

         return this.k;
      } else {
         return null;
      }
   }

   public tm a(dof $$0) {
      tm $$1 = new tm();
      if ($$0 == dof.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (uj)czo.b.encodeStart(ua.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double c() {
      return this.l;
   }

   public double d() {
      return this.m;
   }
}
