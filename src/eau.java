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

public class eau {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<eau> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ka.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               ka.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dld.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               fay.a.lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eau::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dld> h;
   protected Optional<alq<fay>> i;
   @Nullable
   protected bxe j;
   @Nullable
   private btm<dak> p;
   protected double k;
   protected double l;

   public eau() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public eau(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dld> $$5, Optional<alq<fay>> $$6) {
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

   public boolean a(ear $$0, bai $$1) {
      boolean $$2 = this.b($$0, $$1).a().i("id").isPresent();
      return $$2 || !$$0.b().i().c();
   }

   public boolean a(eas $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(asb $$0, eas $$1, int $$2) {
      return $$0.ae() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(iw $$0) {
      if (this.c.isEmpty()) {
         ag.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(asb $$0, iw $$1, ear $$2) {
      boolean $$3 = ($$1.a() + $$0.ae()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(eav.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<csi, jg<bwg>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  csi $$4x = (csi)$$3x.getFirst();
                  if ($$3x.getSecond() == bwk.E) {
                     a($$4x);
                  }

                  $$0.c(3020, iw.a((jq)$$4x.bD()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(eav.f) || $$7) {
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

   private static Optional<Pair<csi, jg<bwg>>> a(asb $$0, List<UUID> $$1) {
      csi $$2 = null;

      for (UUID $$3 : $$1) {
         csi $$4 = $$0.a($$3);
         if ($$4 != null) {
            jg<bwg> $$5 = bwk.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bwk.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bwk.E));
   }

   public void a(ear $$0, asb $$1) {
      this.d.stream().map($$1::b).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dv(), ear.a.a.a());
            if ($$1x instanceof byh $$2) {
               $$2.b($$1);
            }

            $$1x.a(bxe.d.b);
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

   private static void a(csi $$0) {
      bwi $$1 = $$0.c(bwk.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bwk.E);
         $$0.a(new bwi(bwk.H, $$3, 0));
      }
   }

   public boolean a(asb $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.ae() >= (float)$$3 + $$1;
   }

   public boolean b(asb $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.ae() - $$3) % $$1 == 0.0F;
   }

   public boolean a(asb $$0) {
      return $$0.ae() >= this.e;
   }

   protected dld b(ear $$0, bai $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         btm<dld> $$2 = $$0.b().i();
         Optional<dld> $$3 = $$2.c() ? this.h : $$2.a($$1);
         this.h = Optional.of($$3.orElseGet(dld::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bxe a(ear $$0, dkj $$1, eav $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            ua $$3 = this.b($$0, $$1.G_()).a();
            if ($$3.i("id").isPresent()) {
               this.j = bxn.a($$3, $$1, bxm.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public ua a(eav $$0) {
      ua $$1 = new ua();
      if ($$0 == eav.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h.ifPresent($$1x -> $$1.a("spawn_data", dld.b, $$1x));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   btm<dak> a(asb $$0, eas $$1, iw $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         fay $$3 = $$0.p().bc().b($$1.k());
         faw $$4 = new faw.a($$0).a(fdm.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<dak> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return btm.a();
         } else {
            btm.a<dak> $$7 = btm.b();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               dak $$8 = (dak)var10.next();
               $$7.a($$8.c(1), $$8.M());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(asb $$0, iw $$1) {
      iw $$2 = new iw(azz.d((float)$$1.u() / 30.0F), azz.d((float)$$1.v() / 20.0F), azz.d((float)$$1.w() / 30.0F));
      return $$0.E() + $$2.a();
   }
}
