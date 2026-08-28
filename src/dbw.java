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

public record dbw(xl e, dbw.c f, ju<dbw> g, kq h) {
   public static final int a = 255;
   public static final Codec<dbw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xn.a.fieldOf("description").forGetter(dbw::f),
               dbw.c.a.forGetter(dbw::g),
               kf.a(ma.aM).optionalFieldOf("exclusive_set", ju.a()).forGetter(dbw::h),
               dbx.b.optionalFieldOf("effects", kq.a).forGetter(dbw::i)
            )
            .apply($$0, dbw::new)
   );
   public static final Codec<jq<dbw>> c = ali.a(ma.aM);
   public static final zj<ww, jq<dbw>> d = zh.b(ma.aM);

   public static dbw.b a(int $$0) {
      return new dbw.b($$0, 0);
   }

   public static dbw.b a(int $$0, int $$1) {
      return new dbw.b($$0, $$1);
   }

   public static dbw.c a(ju<cwb> $$0, ju<cwb> $$1, int $$2, int $$3, dbw.b $$4, dbw.b $$5, int $$6, bur... $$7) {
      return new dbw.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dbw.c a(ju<cwb> $$0, int $$1, int $$2, dbw.b $$3, dbw.b $$4, int $$5, bur... $$6) {
      return new dbw.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<buq, cwf> a(bve $$0) {
      Map<buq, cwf> $$1 = Maps.newEnumMap(buq.class);

      for (buq $$2 : buq.i) {
         if (this.a($$2)) {
            cwf $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cwb> a() {
      return this.f.a();
   }

   public boolean a(buq $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwf $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwf $$0) {
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

   public static boolean a(jq<dbw> $$0, jq<dbw> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xl a(jq<dbw> $$0, int $$1) {
      xz $$2 = $$0.a().e.f();
      if ($$0.a(axg.o)) {
         xo.a($$2, yi.a.a(n.m));
      } else {
         xo.a($$2, yi.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xk.v).b(xl.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwf $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arq $$0, int $$1, bui $$2, bsy $$3) {
      eug $$4 = b($$0, $$1, $$2, $$3);

      for (dbt<dck> $$5 : this.a(dbx.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arq $$0, int $$1, cwf $$2, bui $$3, bsy $$4, MutableFloat $$5) {
      eug $$6 = b($$0, $$1, $$3, $$4);

      for (dbt<dcp> $$7 : this.a(dbx.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.eb(), $$5.floatValue()));
         }
      }
   }

   public void a(arq $$0, int $$1, cwf $$2, MutableFloat $$3) {
      this.a(dbx.k, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, cwf $$2, MutableFloat $$3) {
      this.a(dbx.p, $$0, $$1, $$2, $$3);
   }

   public void c(arq $$0, int $$1, cwf $$2, MutableFloat $$3) {
      this.a(dbx.q, $$0, $$1, $$2, $$3);
   }

   public void d(arq $$0, int $$1, cwf $$2, MutableFloat $$3) {
      this.a(dbx.x, $$0, $$1, $$2, $$3);
   }

   public void a(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arq $$0, int $$1, cwf $$2, MutableFloat $$3) {
      this.a(dbx.z, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dbx.F, $$0, $$1, $$2);
   }

   public void c(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arq $$0, int $$1, cwf $$2, bui $$3, bsy $$4, MutableFloat $$5) {
      this.a(dbx.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arq $$0, int $$1, cwf $$2, bui $$3, bsy $$4, MutableFloat $$5) {
      this.a(dbx.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arq $$0, int $$1, cwf $$2, bui $$3, bsy $$4, MutableFloat $$5) {
      this.a(dbx.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arq $$0, int $$1, cwf $$2, bui $$3, bsy $$4, MutableFloat $$5) {
      this.a(dbx.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arq $$0, int $$1, dbv $$2, dca $$3, bui $$4, bsy $$5) {
      for (dcf<dcn> $$6 : this.a(dbx.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dcf<dcn> $$0, arq $$1, int $$2, dbv $$3, bui $$4, bsy $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bui $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dw());
         }
      }
   }

   public void e(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arq $$0, int $$1, cwf $$2, bui $$3, MutableFloat $$4) {
      this.a(dbx.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dbx.A, $$0, $$1, $$2);
   }

   public void a(kt<dcp> $$0, azv $$1, int $$2, MutableFloat $$3) {
      dcp $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arq $$0, int $$1, dbv $$2, bui $$3) {
      a(this.a(dbx.o), a($$0, $$1, $$3, $$3.dw()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dw()));
   }

   public void b(arq $$0, int $$1, dbv $$2, bui $$3) {
      a(this.a(dbx.r), a($$0, $$1, $$3, $$3.dw()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dw()));
   }

   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4, dvo $$5) {
      a(this.a(dbx.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<dbt<dcp>>> $$0, arq $$1, int $$2, cwf $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(kt<List<dbt<dcp>>> $$0, arq $$1, int $$2, cwf $$3, bui $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dw()), $$3x -> $$5.setValue($$3x.a($$2, $$4.eb(), $$5.floatValue())));
   }

   private void a(kt<List<dbt<dcp>>> $$0, arq $$1, int $$2, cwf $$3, bui $$4, bsy $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.eb(), $$6.floatValue())));
   }

   public static eug b(arq $$0, int $$1, bui $$2, bsy $$3) {
      euj $$4 = new euj.a($$0).a(exc.a, $$2).a(exc.k, $$1).a(exc.f, $$2.dw()).a(exc.c, $$3).b(exc.d, $$3.d()).b(exc.e, $$3.c()).a(exb.t);
      return new eug.a($$4).a(Optional.empty());
   }

   private static eug a(arq $$0, int $$1, cwf $$2) {
      euj $$3 = new euj.a($$0).a(exc.i, $$2).a(exc.k, $$1).a(exb.u);
      return new eug.a($$3).a(Optional.empty());
   }

   private static eug a(arq $$0, int $$1, bui $$2, boolean $$3) {
      euj $$4 = new euj.a($$0).a(exc.a, $$2).a(exc.k, $$1).a(exc.f, $$2.dw()).a(exc.l, $$3).a(exb.v);
      return new eug.a($$4).a(Optional.empty());
   }

   private static eug a(arq $$0, int $$1, bui $$2, ezr $$3) {
      euj $$4 = new euj.a($$0).a(exc.a, $$2).a(exc.k, $$1).a(exc.f, $$3).a(exb.w);
      return new eug.a($$4).a(Optional.empty());
   }

   private static eug a(arq $$0, int $$1, bui $$2, ezr $$3, dvo $$4) {
      euj $$5 = new euj.a($$0).a(exc.a, $$2).a(exc.k, $$1).a(exc.f, $$3).a(exc.g, $$4).a(exb.x);
      return new eug.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dbt<T>> $$0, eug $$1, Consumer<T> $$2) {
      for (dbt<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arq $$0, int $$1, dbv $$2, bve $$3) {
      buq $$4 = $$2.b();
      if ($$4 != null) {
         Map<dbw, Set<dco>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dco> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dw(), $$1));
            }
         } else {
            Set<dco> $$7 = $$5.get(this);

            for (dbt<dco> $$8 : this.a(dbx.n)) {
               dco $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dw(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dw(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dbv $$1, bve $$2) {
      buq $$3 = $$1.b();
      if ($$3 != null) {
         Set<dco> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dco $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dw(), $$0);
            }
         }
      }
   }

   public static dbw.a a(dbw.c $$0) {
      return new dbw.a($$0);
   }

   public xl f() {
      return this.e;
   }

   public dbw.c g() {
      return this.f;
   }

   public ju<dbw> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final dbw.c a;
      private ju<dbw> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(dbw.c $$0) {
         this.a = $$0;
      }

      public dbw.a a(ju<dbw> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dbw.a a(kt<List<dbt<E>>> $$0, E $$1, exr.a $$2) {
         this.b($$0).add(new dbt<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dbw.a a(kt<List<dbt<E>>> $$0, E $$1) {
         this.b($$0).add(new dbt<>($$1, Optional.empty()));
         return this;
      }

      public <E> dbw.a a(kt<List<dcf<E>>> $$0, dca $$1, dca $$2, E $$3, exr.a $$4) {
         this.b($$0).add(new dcf<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dbw.a a(kt<List<dcf<E>>> $$0, dca $$1, dca $$2, E $$3) {
         this.b($$0).add(new dcf<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dbw.a a(kt<List<dcm>> $$0, dcm $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dbw.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dbw.a a(kt<bat> $$0) {
         this.d.a($$0, bat.a);
         return this;
      }

      private <E> List<E> b(kt<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dbw a(all $$0) {
         return new dbw(xl.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dbw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dbw.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dbw.b::b)).apply($$0, dbw.b::new)
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

   public static record c(ju<cwb> b, Optional<ju<cwb>> c, int d, int e, dbw.b f, dbw.b g, int h, List<bur> i) {
      public static final MapCodec<dbw.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(ma.K).fieldOf("supported_items").forGetter(dbw.c::a),
                  kf.a(ma.K).optionalFieldOf("primary_items").forGetter(dbw.c::b),
                  ayw.a(1, 1024).fieldOf("weight").forGetter(dbw.c::c),
                  ayw.a(1, 255).fieldOf("max_level").forGetter(dbw.c::d),
                  dbw.b.a.fieldOf("min_cost").forGetter(dbw.c::e),
                  dbw.b.a.fieldOf("max_cost").forGetter(dbw.c::f),
                  ayw.l.fieldOf("anvil_cost").forGetter(dbw.c::g),
                  bur.l.listOf().fieldOf("slots").forGetter(dbw.c::h)
               )
               .apply($$0, dbw.c::new)
      );

      public ju<cwb> a() {
         return this.b;
      }

      public Optional<ju<cwb>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dbw.b e() {
         return this.f;
      }

      public dbw.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bur> h() {
         return this.i;
      }
   }
}
