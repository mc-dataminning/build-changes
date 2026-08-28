import com.google.common.collect.Sets;
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

public class dri {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dri> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kc.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dcq.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ale.a(lq.aU).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dri::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dcq> h;
   protected Optional<ale<eqo>> i;
   @Nullable
   protected bsv j;
   @Nullable
   private bpf<cuq> p;
   protected double k;
   protected double l;

   public dri() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dri(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dcq> $$5, Optional<ale<eqo>> $$6) {
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

   public boolean a(drg $$0, azh $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().h().d();
   }

   public boolean a(drh $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   public boolean a(arf $$0, drh $$1, int $$2) {
      return $$0.Z() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(iz $$0) {
      if (this.c.isEmpty()) {
         ac.a("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(arf $$0, iz $$1, drg $$2) {
      boolean $$3 = ($$1.a() + $$0.Z()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(drj.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            cmy $$5 = null;

            for (UUID $$6 : $$4) {
               cmy $$7 = $$0.b($$6);
               if ($$7 != null) {
                  if ($$7.b(bsf.E)) {
                     this.a($$7, $$7.c(bsf.E));
                     $$5 = $$7;
                  } else if ($$7.b(bsf.H)) {
                     $$5 = $$7;
                  }
               }
            }

            boolean $$8 = !$$2.e() && $$5 != null;
            if (!$$2.i().equals(drj.f) || $$8) {
               if ($$8) {
                  $$0.c(3020, iz.a($$5.bx()), 0);
                  $$2.a($$0, $$1);
               }

               boolean $$9 = $$2.f().c.isEmpty();
               List<UUID> $$10 = $$9 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$10)) {
                  this.f = Math.max($$0.Z() + 40L, this.f);
                  if (!$$8) {
                     int $$11 = $$2.e() ? 3019 : 3013;
                     $$0.c($$11, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   public void a(drg $$0, arf $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.dp(), drg.a.a.a());
            $$1x.a(bsv.c.b);
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

   private void a(cmy $$0, bsd $$1) {
      int $$2 = $$1.e() + 1;
      int $$3 = 18000 * $$2;
      $$0.e(bsf.E);
      $$0.b(new bsd(bsf.H, $$3, 0));
   }

   public boolean a(arf $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.Z() >= (float)$$3 + $$1;
   }

   public boolean b(arf $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.Z() - $$3) % $$1 == 0.0F;
   }

   public boolean a(arf $$0) {
      return $$0.Z() >= this.e;
   }

   public void a(drg $$0, azh $$1, btb<?> $$2) {
      this.b($$0, $$1).a().a("id", lp.g.b($$2).toString());
   }

   protected dcq b(drg $$0, azh $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bpf<dcq> $$2 = $$0.b().h();
         Optional<dcq> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bph.b::b);
         this.h = Optional.of($$3.orElseGet(dcq::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bsv a(drg $$0, dbz $$1, drj $$2) {
      if ($$0.a($$1) && $$2.d()) {
         if (this.j == null) {
            us $$3 = this.b($$0, $$1.E_()).a();
            if ($$3.b("id", 8)) {
               this.j = btb.a($$3, $$1, Function.identity());
            }
         }

         return this.j;
      } else {
         return null;
      }
   }

   public us a(drj $$0) {
      us $$1 = new us();
      if ($$0 == drj.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (vp)dcq.b.encodeStart(vg.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double c() {
      return this.k;
   }

   public double d() {
      return this.l;
   }

   bpf<cuq> a(arf $$0, drh $$1, iz $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         eqo $$3 = $$0.o().be().b($$1.j());
         eqm $$4 = new eqm.a($$0).a(ete.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cuq> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bpf.b();
         } else {
            bpf.a<cuq> $$7 = new bpf.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cuq $$8 = (cuq)var10.next();
               $$7.a($$8.c(1), $$8.I());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(arf $$0, iz $$1) {
      iz $$2 = new iz(ayz.d((float)$$1.u() / 30.0F), ayz.d((float)$$1.v() / 20.0F), ayz.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
