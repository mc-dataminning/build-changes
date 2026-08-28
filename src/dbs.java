import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableFloat;

public record dbs(xi e, dbs.c f, ju<dbs> g, kq h) {
   public static final int a = 255;
   public static final Codec<dbs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xk.a.fieldOf("description").forGetter(dbs::f),
               dbs.c.a.forGetter(dbs::g),
               kf.a(lz.aM).optionalFieldOf("exclusive_set", ju.a()).forGetter(dbs::h),
               dbt.b.optionalFieldOf("effects", kq.a).forGetter(dbs::i)
            )
            .apply($$0, dbs::new)
   );
   public static final Codec<jq<dbs>> c = alf.a(lz.aM);
   public static final zg<wt, jq<dbs>> d = ze.b(lz.aM);

   public static dbs.b a(int $$0) {
      return new dbs.b($$0, 0);
   }

   public static dbs.b a(int $$0, int $$1) {
      return new dbs.b($$0, $$1);
   }

   public static dbs.c a(ju<cvx> $$0, ju<cvx> $$1, int $$2, int $$3, dbs.b $$4, dbs.b $$5, int $$6, bun... $$7) {
      return new dbs.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dbs.c a(ju<cvx> $$0, int $$1, int $$2, dbs.b $$3, dbs.b $$4, int $$5, bun... $$6) {
      return new dbs.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bum, cwb> a(bva $$0) {
      Map<bum, cwb> $$1 = Maps.newEnumMap(bum.class);

      for (bum $$2 : bum.i) {
         if (this.a($$2)) {
            cwb $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cvx> a() {
      return this.f.a();
   }

   public boolean a(bum $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwb $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwb $$0) {
      return $$0.a(this.f.b);
   }

   public int b() {
      return this.f.c();
   }

   public int c() {
      return this.f.g();
   }

   public int d() {
      return 1;
   }

   public int e() {
      return this.f.d();
   }

   public int b(int $$0) {
      return this.f.e().a($$0);
   }

   public int c(int $$0) {
      return this.f.f().a($$0);
   }

   @Override
   public String toString() {
      return "Enchantment " + this.e.getString();
   }

   public static boolean a(jq<dbs> $$0, jq<dbs> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xi a(jq<dbs> $$0, int $$1) {
      xw $$2 = $$0.a().e.f();
      if ($$0.a(axd.o)) {
         xl.a($$2, yf.a.a(n.m));
      } else {
         xl.a($$2, yf.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xh.v).b(xi.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwb $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arn $$0, int $$1, bue $$2, bsu $$3) {
      euc $$4 = b($$0, $$1, $$2, $$3);

      for (dbp<dcg> $$5 : this.a(dbt.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arn $$0, int $$1, cwb $$2, bue $$3, bsu $$4, MutableFloat $$5) {
      euc $$6 = b($$0, $$1, $$3, $$4);

      for (dbp<dcl> $$7 : this.a(dbt.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.ea(), $$5.floatValue()));
         }
      }
   }

   public void a(arn $$0, int $$1, cwb $$2, MutableFloat $$3) {
      this.a(dbt.k, $$0, $$1, $$2, $$3);
   }

   public void b(arn $$0, int $$1, cwb $$2, MutableFloat $$3) {
      this.a(dbt.p, $$0, $$1, $$2, $$3);
   }

   public void c(arn $$0, int $$1, cwb $$2, MutableFloat $$3) {
      this.a(dbt.q, $$0, $$1, $$2, $$3);
   }

   public void d(arn $$0, int $$1, cwb $$2, MutableFloat $$3) {
      this.a(dbt.x, $$0, $$1, $$2, $$3);
   }

   public void a(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arn $$0, int $$1, cwb $$2, MutableFloat $$3) {
      this.a(dbt.z, $$0, $$1, $$2, $$3);
   }

   public void b(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azs $$0, int $$1, MutableFloat $$2) {
      this.a(dbt.F, $$0, $$1, $$2);
   }

   public void c(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arn $$0, int $$1, cwb $$2, bue $$3, bsu $$4, MutableFloat $$5) {
      this.a(dbt.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arn $$0, int $$1, cwb $$2, bue $$3, bsu $$4, MutableFloat $$5) {
      this.a(dbt.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arn $$0, int $$1, cwb $$2, bue $$3, bsu $$4, MutableFloat $$5) {
      this.a(dbt.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arn $$0, int $$1, cwb $$2, bue $$3, bsu $$4, MutableFloat $$5) {
      this.a(dbt.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arn $$0, int $$1, dbr $$2, dbw $$3, bue $$4, bsu $$5) {
      for (dcb<dcj> $$6 : this.a(dbt.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dcb<dcj> $$0, arn $$1, int $$2, dbr $$3, bue $$4, bsu $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bue $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dv());
         }
      }
   }

   public void e(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arn $$0, int $$1, cwb $$2, bue $$3, MutableFloat $$4) {
      this.a(dbt.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azs $$0, int $$1, MutableFloat $$2) {
      this.a(dbt.A, $$0, $$1, $$2);
   }

   public void a(kt<dcl> $$0, azs $$1, int $$2, MutableFloat $$3) {
      dcl $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arn $$0, int $$1, dbr $$2, bue $$3) {
      a(this.a(dbt.o), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void b(arn $$0, int $$1, dbr $$2, bue $$3) {
      a(this.a(dbt.r), a($$0, $$1, $$3, $$3.dv()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dv()));
   }

   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4, dvj $$5) {
      a(this.a(dbt.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<dbp<dcl>>> $$0, arn $$1, int $$2, cwb $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(kt<List<dbp<dcl>>> $$0, arn $$1, int $$2, cwb $$3, bue $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dv()), $$3x -> $$5.setValue($$3x.a($$2, $$4.ea(), $$5.floatValue())));
   }

   private void a(kt<List<dbp<dcl>>> $$0, arn $$1, int $$2, cwb $$3, bue $$4, bsu $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.ea(), $$6.floatValue())));
   }

   public static euc b(arn $$0, int $$1, bue $$2, bsu $$3) {
      euf $$4 = new euf.a($$0).a(ewy.a, $$2).a(ewy.k, $$1).a(ewy.f, $$2.dv()).a(ewy.c, $$3).b(ewy.d, $$3.d()).b(ewy.e, $$3.c()).a(ewx.t);
      return new euc.a($$4).a(Optional.empty());
   }

   private static euc a(arn $$0, int $$1, cwb $$2) {
      euf $$3 = new euf.a($$0).a(ewy.i, $$2).a(ewy.k, $$1).a(ewx.u);
      return new euc.a($$3).a(Optional.empty());
   }

   private static euc a(arn $$0, int $$1, bue $$2, boolean $$3) {
      euf $$4 = new euf.a($$0).a(ewy.a, $$2).a(ewy.k, $$1).a(ewy.f, $$2.dv()).a(ewy.l, $$3).a(ewx.v);
      return new euc.a($$4).a(Optional.empty());
   }

   private static euc a(arn $$0, int $$1, bue $$2, ezn $$3) {
      euf $$4 = new euf.a($$0).a(ewy.a, $$2).a(ewy.k, $$1).a(ewy.f, $$3).a(ewx.w);
      return new euc.a($$4).a(Optional.empty());
   }

   private static euc a(arn $$0, int $$1, bue $$2, ezn $$3, dvj $$4) {
      euf $$5 = new euf.a($$0).a(ewy.a, $$2).a(ewy.k, $$1).a(ewy.f, $$3).a(ewy.g, $$4).a(ewx.x);
      return new euc.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dbp<T>> $$0, euc $$1, Consumer<T> $$2) {
      for (dbp<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arn $$0, int $$1, dbr $$2, bva $$3) {
      bum $$4 = $$2.b();
      if ($$4 != null) {
         Map<dbs, Set<dck>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dck> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dv(), $$1));
            }
         } else {
            Set<dck> $$7 = $$5.get(this);

            for (dbp<dck> $$8 : this.a(dbt.n)) {
               dck $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dv(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dv(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dbr $$1, bva $$2) {
      bum $$3 = $$1.b();
      if ($$3 != null) {
         Set<dck> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dck $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dv(), $$0);
            }
         }
      }
   }

   public static dbs.a a(dbs.c $$0) {
      return new dbs.a($$0);
   }

   public xi f() {
      return this.e;
   }

   public dbs.c g() {
      return this.f;
   }

   public ju<dbs> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final dbs.c a;
      private ju<dbs> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(dbs.c $$0) {
         this.a = $$0;
      }

      public dbs.a a(ju<dbs> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dbs.a a(kt<List<dbp<E>>> $$0, E $$1, exn.a $$2) {
         this.b($$0).add(new dbp<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dbs.a a(kt<List<dbp<E>>> $$0, E $$1) {
         this.b($$0).add(new dbp<>($$1, Optional.empty()));
         return this;
      }

      public <E> dbs.a a(kt<List<dcb<E>>> $$0, dbw $$1, dbw $$2, E $$3, exn.a $$4) {
         this.b($$0).add(new dcb<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dbs.a a(kt<List<dcb<E>>> $$0, dbw $$1, dbw $$2, E $$3) {
         this.b($$0).add(new dcb<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dbs.a a(kt<List<dci>> $$0, dci $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dbs.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dbs.a a(kt<bap> $$0) {
         this.d.a($$0, bap.a);
         return this;
      }

      private <E> List<E> b(kt<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dbs a(ali $$0) {
         return new dbs(xi.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dbs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dbs.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dbs.b::b)).apply($$0, dbs.b::new)
      );

      public int a(int $$0) {
         return this.b + this.c * ($$0 - 1);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }

   public static record c(ju<cvx> b, Optional<ju<cvx>> c, int d, int e, dbs.b f, dbs.b g, int h, List<bun> i) {
      public static final MapCodec<dbs.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(lz.K).fieldOf("supported_items").forGetter(dbs.c::a),
                  kf.a(lz.K).optionalFieldOf("primary_items").forGetter(dbs.c::b),
                  ayt.a(1, 1024).fieldOf("weight").forGetter(dbs.c::c),
                  ayt.a(1, 255).fieldOf("max_level").forGetter(dbs.c::d),
                  dbs.b.a.fieldOf("min_cost").forGetter(dbs.c::e),
                  dbs.b.a.fieldOf("max_cost").forGetter(dbs.c::f),
                  ayt.l.fieldOf("anvil_cost").forGetter(dbs.c::g),
                  bun.l.listOf().fieldOf("slots").forGetter(dbs.c::h)
               )
               .apply($$0, dbs.c::new)
      );

      public ju<cvx> a() {
         return this.b;
      }

      public Optional<ju<cvx>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dbs.b e() {
         return this.f;
      }

      public dbs.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bun> h() {
         return this.i;
      }
   }
}
