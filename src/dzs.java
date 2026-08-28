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

public class dzs {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dzs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jz.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               jz.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dkb.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ezt.a.lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dzs::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dkb> h;
   protected Optional<alf<ezt>> i;
   @Nullable
   protected bwi j;
   @Nullable
   private bsq<czk> p;
   protected double k;
   protected double l;

   public dzs() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dzs(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dkb> $$5, Optional<alf<ezt>> $$6) {
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

   public boolean a(dzp $$0, azv $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().i().c();
   }

   public boolean a(dzq $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(arq $$0, dzq $$1, int $$2) {
      return $$0.ae() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(iv $$0) {
      if (this.c.isEmpty()) {
         ag.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(arq $$0, iv $$1, dzp $$2) {
      boolean $$3 = ($$1.a() + $$0.ae()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dzt.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<crj, jf<bvk>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  crj $$4x = (crj)$$3x.getFirst();
                  if ($$3x.getSecond() == bvo.E) {
                     a($$4x);
                  }

                  $$0.c(3020, iv.a((jp)$$4x.bC()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dzt.f) || $$7) {
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

   private static Optional<Pair<crj, jf<bvk>>> a(arq $$0, List<UUID> $$1) {
      crj $$2 = null;

      for (UUID $$3 : $$1) {
         crj $$4 = $$0.a($$3);
         if ($$4 != null) {
            jf<bvk> $$5 = bvo.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bvo.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bvo.E));
   }

   public void a(dzp $$0, arq $$1) {
      this.d.stream().map($$1::b).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.du(), dzp.a.a.a());
            if ($$1x instanceof bxl $$2) {
               $$2.b($$1);
            }

            $$1x.a(bwi.d.b);
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

   private static void a(crj $$0) {
      bvm $$1 = $$0.c(bvo.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bvo.E);
         $$0.a(new bvm(bvo.H, $$3, 0));
      }
   }

   public boolean a(arq $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.ae() >= (float)$$3 + $$1;
   }

   public boolean b(arq $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.ae() - $$3) % $$1 == 0.0F;
   }

   public boolean a(arq $$0) {
      return $$0.ae() >= this.e;
   }

   protected dkb b(dzp $$0, azv $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bsq<dkb> $$2 = $$0.b().i();
         Optional<dkb> $$3 = $$2.c() ? this.h : $$2.a($$1);
         this.h = Optional.of($$3.orElseGet(dkb::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bwi a(dzp $$0, djh $$1, dzt $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            tz $$3 = this.b($$0, $$1.C_()).a();
            if ($$3.b("id", 8)) {
               this.j = bwr.a($$3, $$1, bwq.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public tz a(dzt $$0) {
      tz $$1 = new tz();
      if ($$0 == dzt.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h.ifPresent($$1x -> $$1.a("spawn_data", dkb.b, $$1x));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bsq<czk> a(arq $$0, dzq $$1, iv $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         ezt $$3 = $$0.p().bc().b($$1.k());
         ezr $$4 = new ezr.a($$0).a(fch.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<czk> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bsq.a();
         } else {
            bsq.a<czk> $$7 = bsq.b();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               czk $$8 = (czk)var10.next();
               $$7.a($$8.c(1), $$8.M());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(arq $$0, iv $$1) {
      iv $$2 = new iv(azm.d((float)$$1.u() / 30.0F), azm.d((float)$$1.v() / 20.0F), azm.d((float)$$1.w() / 30.0F));
      return $$0.E() + $$2.a();
   }
}
