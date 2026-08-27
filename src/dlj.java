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

public class dlj {
   public static final String a = "spawn_data";
   private static final String n = "next_mob_spawns_at";
   public static MapCodec<dlj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.b.optionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               je.b.optionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.optionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.optionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).optionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               cwv.b.optionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ajc.a.optionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dlj::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<cwv> h;
   protected Optional<ajc> i;
   protected bkv<cwv> j;
   @Nullable
   protected bof k;
   protected double l;
   protected double m;

   public dlj() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dlj(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<cwv> $$5, Optional<ajc> $$6) {
      this.c.addAll($$0);
      this.d.addAll($$1);
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   public void a(dli $$0) {
      bkv<cwv> $$1 = $$0.i();
      if ($$1.d()) {
         this.j = bkv.a(this.h.orElseGet(cwv::new));
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

   public boolean a(dli $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(apa $$0, dli $$1, int $$2) {
      return $$0.X() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(ib $$0) {
      if (this.c.isEmpty()) {
         ac.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(apa $$0, ib $$1, dlg $$2, dlg.a $$3, int $$4) {
      List<UUID> $$5 = $$2.detect($$0, $$3, $$1, (double)$$4);
      boolean $$6 = this.c.addAll($$5);
      if ($$6) {
         this.f = Math.max($$0.X() + 40L, this.f);
         $$0.c(3013, $$1, this.c.size());
      }
   }

   public boolean a(apa $$0, dli $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)$$0.X() >= (float)$$3 + $$2;
   }

   public boolean b(apa $$0, dli $$1, float $$2) {
      long $$3 = this.e - (long)$$1.h();
      return (float)($$0.X() - $$3) % $$2 == 0.0F;
   }

   public boolean a(apa $$0) {
      return $$0.X() >= this.e;
   }

   public void a(dlh $$0, awt $$1, bol<?> $$2) {
      this.a($$0, $$1).a().a("id", kh.g.b($$2).toString());
   }

   protected cwv a(dlh $$0, awt $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         this.h = Optional.of(this.j.b($$1).map(bkx.b::b).orElseGet(cwv::new));
         $$0.e();
         return this.h.get();
      }
   }

   @Nullable
   public bof a(dlh $$0, cwe $$1, dlk $$2) {
      if ($$0.a($$1) && $$2.d()) {
         if (this.k == null) {
            sy $$3 = this.a($$0, $$1.F_()).a();
            if ($$3.b("id", 8)) {
               this.k = bol.a($$3, $$1, Function.identity());
            }
         }

         return this.k;
      } else {
         return null;
      }
   }

   public sy a(dlk $$0) {
      sy $$1 = new sy();
      if ($$0 == dlk.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (tv)cwv.b.encodeStart(tm.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.l;
   }

   public double e() {
      return this.m;
   }
}
