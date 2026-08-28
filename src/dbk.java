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

public record dbk(xd e, dbk.c f, jr<dbk> g, kn h) {
   public static final int a = 255;
   public static final Codec<dbk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xf.a.fieldOf("description").forGetter(dbk::f),
               dbk.c.a.forGetter(dbk::g),
               kc.a(lv.aM).optionalFieldOf("exclusive_set", jr.a()).forGetter(dbk::h),
               dbl.b.optionalFieldOf("effects", kn.a).forGetter(dbk::i)
            )
            .apply($$0, dbk::new)
   );
   public static final Codec<jn<dbk>> c = akz.a(lv.aM);
   public static final zb<wo, jn<dbk>> d = yz.b(lv.aM);

   public static dbk.b a(int $$0) {
      return new dbk.b($$0, 0);
   }

   public static dbk.b a(int $$0, int $$1) {
      return new dbk.b($$0, $$1);
   }

   public static dbk.c a(jr<cvk> $$0, jr<cvk> $$1, int $$2, int $$3, dbk.b $$4, dbk.b $$5, int $$6, btx... $$7) {
      return new dbk.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dbk.c a(jr<cvk> $$0, int $$1, int $$2, dbk.b $$3, dbk.b $$4, int $$5, btx... $$6) {
      return new dbk.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<btw, cvp> a(buk $$0) {
      Map<btw, cvp> $$1 = Maps.newEnumMap(btw.class);

      for (btw $$2 : btw.values()) {
         if (this.a($$2)) {
            cvp $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jr<cvk> a() {
      return this.f.a();
   }

   public boolean a(btw $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cvp $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cvp $$0) {
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

   public static boolean a(jn<dbk> $$0, jn<dbk> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xd a(jn<dbk> $$0, int $$1) {
      xr $$2 = $$0.a().e.f();
      if ($$0.a(aww.o)) {
         xg.a($$2, ya.a.a(n.m));
      } else {
         xg.a($$2, ya.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xc.v).b(xd.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cvp $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kq<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arh $$0, int $$1, bto $$2, bsg $$3) {
      eth $$4 = b($$0, $$1, $$2, $$3);

      for (dbh<dby> $$5 : this.a(dbl.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arh $$0, int $$1, cvp $$2, bto $$3, bsg $$4, MutableFloat $$5) {
      eth $$6 = b($$0, $$1, $$3, $$4);

      for (dbh<dcd> $$7 : this.a(dbl.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dV(), $$5.floatValue()));
         }
      }
   }

   public void a(arh $$0, int $$1, cvp $$2, MutableFloat $$3) {
      this.a(dbl.k, $$0, $$1, $$2, $$3);
   }

   public void b(arh $$0, int $$1, cvp $$2, MutableFloat $$3) {
      this.a(dbl.p, $$0, $$1, $$2, $$3);
   }

   public void c(arh $$0, int $$1, cvp $$2, MutableFloat $$3) {
      this.a(dbl.q, $$0, $$1, $$2, $$3);
   }

   public void d(arh $$0, int $$1, cvp $$2, MutableFloat $$3) {
      this.a(dbl.x, $$0, $$1, $$2, $$3);
   }

   public void a(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arh $$0, int $$1, cvp $$2, MutableFloat $$3) {
      this.a(dbl.z, $$0, $$1, $$2, $$3);
   }

   public void b(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azl $$0, int $$1, MutableFloat $$2) {
      this.a(dbl.F, $$0, $$1, $$2);
   }

   public void c(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arh $$0, int $$1, cvp $$2, bto $$3, bsg $$4, MutableFloat $$5) {
      this.a(dbl.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arh $$0, int $$1, cvp $$2, bto $$3, bsg $$4, MutableFloat $$5) {
      this.a(dbl.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arh $$0, int $$1, cvp $$2, bto $$3, bsg $$4, MutableFloat $$5) {
      this.a(dbl.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arh $$0, int $$1, cvp $$2, bto $$3, bsg $$4, MutableFloat $$5) {
      this.a(dbl.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(dbt<dcb> $$0, arh $$1, int $$2, dbj $$3, bto $$4, bsg $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bto $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dq());
         }
      }
   }

   public void a(arh $$0, int $$1, dbj $$2, dbo $$3, bto $$4, bsg $$5) {
      for (dbt<dcb> $$6 : this.a(dbl.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arh $$0, int $$1, cvp $$2, bto $$3, MutableFloat $$4) {
      this.a(dbl.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azl $$0, int $$1, MutableFloat $$2) {
      this.a(dbl.A, $$0, $$1, $$2);
   }

   public void a(kq<dcd> $$0, azl $$1, int $$2, MutableFloat $$3) {
      dcd $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arh $$0, int $$1, dbj $$2, bto $$3) {
      a(this.a(dbl.o), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void b(arh $$0, int $$1, dbj $$2, bto $$3) {
      a(this.a(dbl.r), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4, duo $$5) {
      a(this.a(dbl.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kq<List<dbh<dcd>>> $$0, arh $$1, int $$2, cvp $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(kq<List<dbh<dcd>>> $$0, arh $$1, int $$2, cvp $$3, bto $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dq()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dV(), $$5.floatValue())));
   }

   private void a(kq<List<dbh<dcd>>> $$0, arh $$1, int $$2, cvp $$3, bto $$4, bsg $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dV(), $$6.floatValue())));
   }

   public static eth b(arh $$0, int $$1, bto $$2, bsg $$3) {
      etk $$4 = new etk.a($$0).a(ewd.a, $$2).a(ewd.k, $$1).a(ewd.f, $$2.dq()).a(ewd.c, $$3).b(ewd.d, $$3.d()).b(ewd.e, $$3.c()).a(ewc.t);
      return new eth.a($$4).a(Optional.empty());
   }

   private static eth a(arh $$0, int $$1, cvp $$2) {
      etk $$3 = new etk.a($$0).a(ewd.i, $$2).a(ewd.k, $$1).a(ewc.u);
      return new eth.a($$3).a(Optional.empty());
   }

   private static eth a(arh $$0, int $$1, bto $$2, boolean $$3) {
      etk $$4 = new etk.a($$0).a(ewd.a, $$2).a(ewd.k, $$1).a(ewd.f, $$2.dq()).a(ewd.l, $$3).a(ewc.v);
      return new eth.a($$4).a(Optional.empty());
   }

   private static eth a(arh $$0, int $$1, bto $$2, eys $$3) {
      etk $$4 = new etk.a($$0).a(ewd.a, $$2).a(ewd.k, $$1).a(ewd.f, $$3).a(ewc.w);
      return new eth.a($$4).a(Optional.empty());
   }

   private static eth a(arh $$0, int $$1, bto $$2, eys $$3, duo $$4) {
      etk $$5 = new etk.a($$0).a(ewd.a, $$2).a(ewd.k, $$1).a(ewd.f, $$3).a(ewd.g, $$4).a(ewc.x);
      return new eth.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dbh<T>> $$0, eth $$1, Consumer<T> $$2) {
      for (dbh<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arh $$0, int $$1, dbj $$2, buk $$3) {
      btw $$4 = $$2.b();
      if ($$4 != null) {
         Map<dbk, Set<dcc>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dcc> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dq(), $$1));
            }
         } else {
            Set<dcc> $$7 = $$5.get(this);

            for (dbh<dcc> $$8 : this.a(dbl.n)) {
               dcc $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dq(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dq(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dbj $$1, buk $$2) {
      btw $$3 = $$1.b();
      if ($$3 != null) {
         Set<dcc> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dcc $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dq(), $$0);
            }
         }
      }
   }

   public static dbk.a a(dbk.c $$0) {
      return new dbk.a($$0);
   }

   public xd f() {
      return this.e;
   }

   public dbk.c g() {
      return this.f;
   }

   public jr<dbk> h() {
      return this.g;
   }

   public kn i() {
      return this.h;
   }

   public static class a {
      private final dbk.c a;
      private jr<dbk> b = jr.a();
      private final Map<kq<?>, List<?>> c = new HashMap<>();
      private final kn.a d = kn.a();

      public a(dbk.c $$0) {
         this.a = $$0;
      }

      public dbk.a a(jr<dbk> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dbk.a a(kq<List<dbh<E>>> $$0, E $$1, ews.a $$2) {
         this.b($$0).add(new dbh<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dbk.a a(kq<List<dbh<E>>> $$0, E $$1) {
         this.b($$0).add(new dbh<>($$1, Optional.empty()));
         return this;
      }

      public <E> dbk.a a(kq<List<dbt<E>>> $$0, dbo $$1, dbo $$2, E $$3, ews.a $$4) {
         this.b($$0).add(new dbt<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dbk.a a(kq<List<dbt<E>>> $$0, dbo $$1, dbo $$2, E $$3) {
         this.b($$0).add(new dbt<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dbk.a a(kq<List<dca>> $$0, dca $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dbk.a b(kq<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dbk.a a(kq<bai> $$0) {
         this.d.a($$0, bai.a);
         return this;
      }

      private <E> List<E> b(kq<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dbk a(alc $$0) {
         return new dbk(xd.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dbk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dbk.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dbk.b::b)).apply($$0, dbk.b::new)
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

   public static record c(jr<cvk> b, Optional<jr<cvk>> c, int d, int e, dbk.b f, dbk.b g, int h, List<btx> i) {
      public static final MapCodec<dbk.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kc.a(lv.K).fieldOf("supported_items").forGetter(dbk.c::a),
                  kc.a(lv.K).optionalFieldOf("primary_items").forGetter(dbk.c::b),
                  aym.a(1, 1024).fieldOf("weight").forGetter(dbk.c::c),
                  aym.a(1, 255).fieldOf("max_level").forGetter(dbk.c::d),
                  dbk.b.a.fieldOf("min_cost").forGetter(dbk.c::e),
                  dbk.b.a.fieldOf("max_cost").forGetter(dbk.c::f),
                  aym.k.fieldOf("anvil_cost").forGetter(dbk.c::g),
                  btx.l.listOf().fieldOf("slots").forGetter(dbk.c::h)
               )
               .apply($$0, dbk.c::new)
      );

      public jr<cvk> a() {
         return this.b;
      }

      public Optional<jr<cvk>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dbk.b e() {
         return this.f;
      }

      public dbk.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<btx> h() {
         return this.i;
      }
   }
}
