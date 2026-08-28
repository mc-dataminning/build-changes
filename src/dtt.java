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

public class dtt {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dtt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               kh.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dez.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               alb.a(lv.bd).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dtt::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dez> h;
   protected Optional<alb<etm>> i;
   @Nullable
   protected bto j;
   @Nullable
   private bpz<cvp> p;
   protected double k;
   protected double l;

   public dtt() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dtt(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dez> $$5, Optional<alb<etm>> $$6) {
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

   public boolean a(dtr $$0, azl $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().h().d();
   }

   public boolean a(dts $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(arh $$0, dts $$1, int $$2) {
      return $$0.aa() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(je $$0) {
      if (this.c.isEmpty()) {
         ad.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(arh $$0, je $$1, dtr $$2) {
      boolean $$3 = ($$1.a() + $$0.aa()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dtu.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<cnu, jn<bst>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cnu $$4x = (cnu)$$3x.getFirst();
                  if ($$3x.getSecond() == bsx.E) {
                     a($$4x);
                  }

                  $$0.c(3020, je.a((jx)$$4x.bC()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dtu.f) || $$7) {
               boolean $$8 = $$2.f().c.isEmpty();
               List<UUID> $$9 = $$8 ? $$4 : $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), false);
               if (this.c.addAll($$9)) {
                  this.f = Math.max($$0.aa() + 40L, this.f);
                  if (!$$7) {
                     int $$10 = $$2.e() ? 3019 : 3013;
                     $$0.c($$10, $$1, this.c.size());
                  }
               }
            }
         }
      }
   }

   private static Optional<Pair<cnu, jn<bst>>> a(arh $$0, List<UUID> $$1) {
      cnu $$2 = null;

      for (UUID $$3 : $$1) {
         cnu $$4 = $$0.b($$3);
         if ($$4 != null) {
            jn<bst> $$5 = bsx.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bsx.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bsx.E));
   }

   public void a(dtr $$0, arh $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.ds(), dtr.a.a.a());
            if ($$1x instanceof bum $$2) {
               $$2.fV();
            }

            $$1x.a(bto.c.b);
         }
      });
      if (!$$0.d().h().d()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.aa() + (long)$$0.d().g();
      $$0.j();
      this.e = $$1.aa() + $$0.d().a();
   }

   private static void a(cnu $$0) {
      bsv $$1 = $$0.c(bsx.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bsx.E);
         $$0.a(new bsv(bsx.H, $$3, 0));
      }
   }

   public boolean a(arh $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.aa() >= (float)$$3 + $$1;
   }

   public boolean b(arh $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.aa() - $$3) % $$1 == 0.0F;
   }

   public boolean a(arh $$0) {
      return $$0.aa() >= this.e;
   }

   public void a(dtr $$0, azl $$1, btv<?> $$2) {
      this.b($$0, $$1).a().a("id", lu.f.b($$2).toString());
   }

   protected dez b(dtr $$0, azl $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bpz<dez> $$2 = $$0.b().h();
         Optional<dez> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bqb.b::b);
         this.h = Optional.of($$3.orElseGet(dez::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public bto a(dtr $$0, deg $$1, dtu $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            uf $$3 = this.b($$0, $$1.C_()).a();
            if ($$3.b("id", 8)) {
               this.j = btv.a($$3, $$1, btu.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public uf a(dtu $$0) {
      uf $$1 = new uf();
      if ($$0 == dtu.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (vc)dez.b.encodeStart(ut.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bpz<cvp> a(arh $$0, dts $$1, je $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         etm $$3 = $$0.o().bd().b($$1.j());
         etk $$4 = new etk.a($$0).a(ewc.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cvp> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bpz.b();
         } else {
            bpz.a<cvp> $$7 = new bpz.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cvp $$8 = (cvp)var10.next();
               $$7.a($$8.c(1), $$8.J());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(arh $$0, je $$1) {
      je $$2 = new je(azd.d((float)$$1.u() / 30.0F), azd.d((float)$$1.v() / 20.0F), azd.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
