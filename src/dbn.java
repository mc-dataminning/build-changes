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

public record dbn(xe e, dbn.c f, js<dbn> g, ko h) {
   public static final int a = 255;
   public static final Codec<dbn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xg.a.fieldOf("description").forGetter(dbn::f),
               dbn.c.a.forGetter(dbn::g),
               kd.a(lw.aN).optionalFieldOf("exclusive_set", js.a()).forGetter(dbn::h),
               dbo.b.optionalFieldOf("effects", ko.a).forGetter(dbn::i)
            )
            .apply($$0, dbn::new)
   );
   public static final Codec<jo<dbn>> c = alb.a(lw.aN);
   public static final zc<wp, jo<dbn>> d = za.b(lw.aN);

   public static dbn.b a(int $$0) {
      return new dbn.b($$0, 0);
   }

   public static dbn.b a(int $$0, int $$1) {
      return new dbn.b($$0, $$1);
   }

   public static dbn.c a(js<cvn> $$0, js<cvn> $$1, int $$2, int $$3, dbn.b $$4, dbn.b $$5, int $$6, bua... $$7) {
      return new dbn.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dbn.c a(js<cvn> $$0, int $$1, int $$2, dbn.b $$3, dbn.b $$4, int $$5, bua... $$6) {
      return new dbn.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<btz, cvs> a(bun $$0) {
      Map<btz, cvs> $$1 = Maps.newEnumMap(btz.class);

      for (btz $$2 : btz.values()) {
         if (this.a($$2)) {
            cvs $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public js<cvn> a() {
      return this.f.a();
   }

   public boolean a(btz $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cvs $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cvs $$0) {
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

   public static boolean a(jo<dbn> $$0, jo<dbn> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xe a(jo<dbn> $$0, int $$1) {
      xs $$2 = $$0.a().e.f();
      if ($$0.a(awy.o)) {
         xh.a($$2, yb.a.a(n.m));
      } else {
         xh.a($$2, yb.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xd.v).b(xe.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cvs $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kr<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arj $$0, int $$1, btr $$2, bsj $$3) {
      etl $$4 = b($$0, $$1, $$2, $$3);

      for (dbk<dcb> $$5 : this.a(dbo.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arj $$0, int $$1, cvs $$2, btr $$3, bsj $$4, MutableFloat $$5) {
      etl $$6 = b($$0, $$1, $$3, $$4);

      for (dbk<dcg> $$7 : this.a(dbo.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dV(), $$5.floatValue()));
         }
      }
   }

   public void a(arj $$0, int $$1, cvs $$2, MutableFloat $$3) {
      this.a(dbo.k, $$0, $$1, $$2, $$3);
   }

   public void b(arj $$0, int $$1, cvs $$2, MutableFloat $$3) {
      this.a(dbo.p, $$0, $$1, $$2, $$3);
   }

   public void c(arj $$0, int $$1, cvs $$2, MutableFloat $$3) {
      this.a(dbo.q, $$0, $$1, $$2, $$3);
   }

   public void d(arj $$0, int $$1, cvs $$2, MutableFloat $$3) {
      this.a(dbo.x, $$0, $$1, $$2, $$3);
   }

   public void a(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arj $$0, int $$1, cvs $$2, MutableFloat $$3) {
      this.a(dbo.z, $$0, $$1, $$2, $$3);
   }

   public void b(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azn $$0, int $$1, MutableFloat $$2) {
      this.a(dbo.F, $$0, $$1, $$2);
   }

   public void c(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arj $$0, int $$1, cvs $$2, btr $$3, bsj $$4, MutableFloat $$5) {
      this.a(dbo.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arj $$0, int $$1, cvs $$2, btr $$3, bsj $$4, MutableFloat $$5) {
      this.a(dbo.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arj $$0, int $$1, cvs $$2, btr $$3, bsj $$4, MutableFloat $$5) {
      this.a(dbo.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arj $$0, int $$1, cvs $$2, btr $$3, bsj $$4, MutableFloat $$5) {
      this.a(dbo.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arj $$0, int $$1, dbm $$2, dbr $$3, btr $$4, bsj $$5) {
      for (dbw<dce> $$6 : this.a(dbo.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dbw<dce> $$0, arj $$1, int $$2, dbm $$3, btr $$4, bsj $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         btr $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dq());
         }
      }
   }

   public void e(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arj $$0, int $$1, cvs $$2, btr $$3, MutableFloat $$4) {
      this.a(dbo.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azn $$0, int $$1, MutableFloat $$2) {
      this.a(dbo.A, $$0, $$1, $$2);
   }

   public void a(kr<dcg> $$0, azn $$1, int $$2, MutableFloat $$3) {
      dcg $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arj $$0, int $$1, dbm $$2, btr $$3) {
      a(this.a(dbo.o), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void b(arj $$0, int $$1, dbm $$2, btr $$3) {
      a(this.a(dbo.r), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4, dus $$5) {
      a(this.a(dbo.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kr<List<dbk<dcg>>> $$0, arj $$1, int $$2, cvs $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.D_(), $$4.getValue())));
   }

   private void a(kr<List<dbk<dcg>>> $$0, arj $$1, int $$2, cvs $$3, btr $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dq()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dV(), $$5.floatValue())));
   }

   private void a(kr<List<dbk<dcg>>> $$0, arj $$1, int $$2, cvs $$3, btr $$4, bsj $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dV(), $$6.floatValue())));
   }

   public static etl b(arj $$0, int $$1, btr $$2, bsj $$3) {
      eto $$4 = new eto.a($$0).a(ewh.a, $$2).a(ewh.k, $$1).a(ewh.f, $$2.dq()).a(ewh.c, $$3).b(ewh.d, $$3.d()).b(ewh.e, $$3.c()).a(ewg.t);
      return new etl.a($$4).a(Optional.empty());
   }

   private static etl a(arj $$0, int $$1, cvs $$2) {
      eto $$3 = new eto.a($$0).a(ewh.i, $$2).a(ewh.k, $$1).a(ewg.u);
      return new etl.a($$3).a(Optional.empty());
   }

   private static etl a(arj $$0, int $$1, btr $$2, boolean $$3) {
      eto $$4 = new eto.a($$0).a(ewh.a, $$2).a(ewh.k, $$1).a(ewh.f, $$2.dq()).a(ewh.l, $$3).a(ewg.v);
      return new etl.a($$4).a(Optional.empty());
   }

   private static etl a(arj $$0, int $$1, btr $$2, eyw $$3) {
      eto $$4 = new eto.a($$0).a(ewh.a, $$2).a(ewh.k, $$1).a(ewh.f, $$3).a(ewg.w);
      return new etl.a($$4).a(Optional.empty());
   }

   private static etl a(arj $$0, int $$1, btr $$2, eyw $$3, dus $$4) {
      eto $$5 = new eto.a($$0).a(ewh.a, $$2).a(ewh.k, $$1).a(ewh.f, $$3).a(ewh.g, $$4).a(ewg.x);
      return new etl.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dbk<T>> $$0, etl $$1, Consumer<T> $$2) {
      for (dbk<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arj $$0, int $$1, dbm $$2, bun $$3) {
      btz $$4 = $$2.b();
      if ($$4 != null) {
         Map<dbn, Set<dcf>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dcf> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dq(), $$1));
            }
         } else {
            Set<dcf> $$7 = $$5.get(this);

            for (dbk<dcf> $$8 : this.a(dbo.n)) {
               dcf $$9 = $$8.a();
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

   public void a(int $$0, dbm $$1, bun $$2) {
      btz $$3 = $$1.b();
      if ($$3 != null) {
         Set<dcf> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dcf $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dq(), $$0);
            }
         }
      }
   }

   public static dbn.a a(dbn.c $$0) {
      return new dbn.a($$0);
   }

   public xe f() {
      return this.e;
   }

   public dbn.c g() {
      return this.f;
   }

   public js<dbn> h() {
      return this.g;
   }

   public ko i() {
      return this.h;
   }

   public static class a {
      private final dbn.c a;
      private js<dbn> b = js.a();
      private final Map<kr<?>, List<?>> c = new HashMap<>();
      private final ko.a d = ko.a();

      public a(dbn.c $$0) {
         this.a = $$0;
      }

      public dbn.a a(js<dbn> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dbn.a a(kr<List<dbk<E>>> $$0, E $$1, eww.a $$2) {
         this.b($$0).add(new dbk<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dbn.a a(kr<List<dbk<E>>> $$0, E $$1) {
         this.b($$0).add(new dbk<>($$1, Optional.empty()));
         return this;
      }

      public <E> dbn.a a(kr<List<dbw<E>>> $$0, dbr $$1, dbr $$2, E $$3, eww.a $$4) {
         this.b($$0).add(new dbw<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dbn.a a(kr<List<dbw<E>>> $$0, dbr $$1, dbr $$2, E $$3) {
         this.b($$0).add(new dbw<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dbn.a a(kr<List<dcd>> $$0, dcd $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dbn.a b(kr<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dbn.a a(kr<bak> $$0) {
         this.d.a($$0, bak.a);
         return this;
      }

      private <E> List<E> b(kr<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dbn a(ale $$0) {
         return new dbn(xe.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dbn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dbn.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dbn.b::b)).apply($$0, dbn.b::new)
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

   public static record c(js<cvn> b, Optional<js<cvn>> c, int d, int e, dbn.b f, dbn.b g, int h, List<bua> i) {
      public static final MapCodec<dbn.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kd.a(lw.K).fieldOf("supported_items").forGetter(dbn.c::a),
                  kd.a(lw.K).optionalFieldOf("primary_items").forGetter(dbn.c::b),
                  ayo.a(1, 1024).fieldOf("weight").forGetter(dbn.c::c),
                  ayo.a(1, 255).fieldOf("max_level").forGetter(dbn.c::d),
                  dbn.b.a.fieldOf("min_cost").forGetter(dbn.c::e),
                  dbn.b.a.fieldOf("max_cost").forGetter(dbn.c::f),
                  ayo.k.fieldOf("anvil_cost").forGetter(dbn.c::g),
                  bua.l.listOf().fieldOf("slots").forGetter(dbn.c::h)
               )
               .apply($$0, dbn.c::new)
      );

      public js<cvn> a() {
         return this.b;
      }

      public Optional<js<cvn>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dbn.b e() {
         return this.f;
      }

      public dbn.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bua> h() {
         return this.i;
      }
   }
}
