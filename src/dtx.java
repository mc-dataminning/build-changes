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

public class dtx {
   public static final String a = "spawn_data";
   private static final String m = "next_mob_spawns_at";
   private static final int n = 20;
   private static final int o = 18000;
   public static MapCodec<dtx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ki.b.lenientOptionalFieldOf("registered_players", Sets.newHashSet()).forGetter($$0x -> $$0x.c),
               ki.b.lenientOptionalFieldOf("current_mobs", Sets.newHashSet()).forGetter($$0x -> $$0x.d),
               Codec.LONG.lenientOptionalFieldOf("cooldown_ends_at", 0L).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("next_mob_spawns_at", 0L).forGetter($$0x -> $$0x.f),
               Codec.intRange(0, Integer.MAX_VALUE).lenientOptionalFieldOf("total_mobs_spawned", 0).forGetter($$0x -> $$0x.g),
               dfc.b.lenientOptionalFieldOf("spawn_data").forGetter($$0x -> $$0x.h),
               ald.a(lw.be).lenientOptionalFieldOf("ejecting_loot_table").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dtx::new)
   );
   protected final Set<UUID> c = new HashSet<>();
   protected final Set<UUID> d = new HashSet<>();
   protected long e;
   protected long f;
   protected int g;
   protected Optional<dfc> h;
   protected Optional<ald<etq>> i;
   @Nullable
   protected btr j;
   @Nullable
   private bqc<cvs> p;
   protected double k;
   protected double l;

   public dtx() {
      this(Collections.emptySet(), Collections.emptySet(), 0L, 0L, 0, Optional.empty(), Optional.empty());
   }

   public dtx(Set<UUID> $$0, Set<UUID> $$1, long $$2, long $$3, int $$4, Optional<dfc> $$5, Optional<ald<etq>> $$6) {
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

   public boolean a(dtu $$0, azn $$1) {
      boolean $$2 = this.b($$0, $$1).a().b("id", 8);
      return $$2 || !$$0.b().i().d();
   }

   public boolean a(dtv $$0, int $$1) {
      return this.g >= $$0.a($$1);
   }

   public boolean c() {
      return this.d.isEmpty();
   }

   public boolean a(arj $$0, dtv $$1, int $$2) {
      return $$0.aa() >= this.f && this.d.size() < $$1.b($$2);
   }

   public int a(jf $$0) {
      if (this.c.isEmpty()) {
         ad.b("Trial Spawner at " + $$0 + " has no detected players");
      }

      return Math.max(0, this.c.size() - 1);
   }

   public void a(arj $$0, jf $$1, dtu $$2) {
      boolean $$3 = ($$1.a() + $$0.aa()) % 20L != 0L;
      if (!$$3) {
         if (!$$2.i().equals(dty.f) || !$$2.e()) {
            List<UUID> $$4 = $$2.k().detect($$0, $$2.l(), $$1, (double)$$2.h(), true);
            boolean $$7;
            if (!$$2.e() && !$$4.isEmpty()) {
               Optional<Pair<cnx, jo<bsw>>> $$6 = a($$0, $$4);
               $$6.ifPresent($$3x -> {
                  cnx $$4x = (cnx)$$3x.getFirst();
                  if ($$3x.getSecond() == bta.E) {
                     a($$4x);
                  }

                  $$0.c(3020, jf.a((jy)$$4x.bC()), 0);
                  $$2.a($$0, $$1);
               });
               $$7 = $$6.isPresent();
            } else {
               $$7 = false;
            }

            if (!$$2.i().equals(dty.f) || $$7) {
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

   private static Optional<Pair<cnx, jo<bsw>>> a(arj $$0, List<UUID> $$1) {
      cnx $$2 = null;

      for (UUID $$3 : $$1) {
         cnx $$4 = $$0.b($$3);
         if ($$4 != null) {
            jo<bsw> $$5 = bta.H;
            if ($$4.b($$5)) {
               return Optional.of(Pair.of($$4, $$5));
            }

            if ($$4.b(bta.E)) {
               $$2 = $$4;
            }
         }
      }

      return Optional.ofNullable($$2).map($$0x -> Pair.of($$0x, bta.E));
   }

   public void a(dtu $$0, arj $$1) {
      this.d.stream().map($$1::a).forEach($$1x -> {
         if ($$1x != null) {
            $$1.c(3012, $$1x.ds(), dtu.a.a.a());
            if ($$1x instanceof bup $$2) {
               $$2.fV();
            }

            $$1x.a(btr.c.b);
         }
      });
      if (!$$0.d().i().d()) {
         this.h = Optional.empty();
      }

      this.g = 0;
      this.d.clear();
      this.f = $$1.aa() + (long)$$0.d().h();
      $$0.j();
      this.e = $$1.aa() + $$0.d().a();
   }

   private static void a(cnx $$0) {
      bsy $$1 = $$0.c(bta.E);
      if ($$1 != null) {
         int $$2 = $$1.e() + 1;
         int $$3 = 18000 * $$2;
         $$0.e(bta.E);
         $$0.a(new bsy(bta.H, $$3, 0));
      }
   }

   public boolean a(arj $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)$$0.aa() >= (float)$$3 + $$1;
   }

   public boolean b(arj $$0, float $$1, int $$2) {
      long $$3 = this.e - (long)$$2;
      return (float)($$0.aa() - $$3) % $$1 == 0.0F;
   }

   public boolean a(arj $$0) {
      return $$0.aa() >= this.e;
   }

   public void a(dtu $$0, azn $$1, bty<?> $$2) {
      this.b($$0, $$1).a().a("id", lv.f.b($$2).toString());
   }

   protected dfc b(dtu $$0, azn $$1) {
      if (this.h.isPresent()) {
         return this.h.get();
      } else {
         bqc<dfc> $$2 = $$0.b().i();
         Optional<dfc> $$3 = $$2.d() ? this.h : $$2.b($$1).map(bqe.b::b);
         this.h = Optional.of($$3.orElseGet(dfc::new));
         $$0.j();
         return this.h.get();
      }
   }

   @Nullable
   public btr a(dtu $$0, dej $$1, dty $$2) {
      if (!$$2.d()) {
         return null;
      } else {
         if (this.j == null) {
            ug $$3 = this.b($$0, $$1.D_()).a();
            if ($$3.b("id", 8)) {
               this.j = bty.a($$3, $$1, btx.q, Function.identity());
            }
         }

         return this.j;
      }
   }

   public ug a(dty $$0) {
      ug $$1 = new ug();
      if ($$0 == dty.c) {
         $$1.a("next_mob_spawns_at", this.f);
      }

      this.h
         .ifPresent($$1x -> $$1.a("spawn_data", (vd)dfc.b.encodeStart(uu.a, $$1x).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData"))));
      return $$1;
   }

   public double d() {
      return this.k;
   }

   public double e() {
      return this.l;
   }

   bqc<cvs> a(arj $$0, dtv $$1, jf $$2) {
      if (this.p != null) {
         return this.p;
      } else {
         etq $$3 = $$0.o().bd().b($$1.k());
         eto $$4 = new eto.a($$0).a(ewg.b);
         long $$5 = a($$0, $$2);
         ObjectArrayList<cvs> $$6 = $$3.a($$4, $$5);
         if ($$6.isEmpty()) {
            return bqc.b();
         } else {
            bqc.a<cvs> $$7 = new bqc.a<>();
            ObjectListIterator var10 = $$6.iterator();

            while (var10.hasNext()) {
               cvs $$8 = (cvs)var10.next();
               $$7.a($$8.c(1), $$8.K());
            }

            this.p = $$7.a();
            return this.p;
         }
      }
   }

   private static long a(arj $$0, jf $$1) {
      jf $$2 = new jf(azf.d((float)$$1.u() / 30.0F), azf.d((float)$$1.v() / 20.0F), azf.d((float)$$1.w() / 30.0F));
      return $$0.C() + $$2.a();
   }
}
