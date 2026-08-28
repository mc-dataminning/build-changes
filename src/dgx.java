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

public record dgx(xg e, dgx.c f, jk<dgx> g, ki h) {
   public static final int a = 255;
   public static final Codec<dgx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xi.a.fieldOf("description").forGetter(dgx::f),
               dgx.c.a.forGetter(dgx::g),
               jv.a(mi.aR).optionalFieldOf("exclusive_set", jk.a()).forGetter(dgx::h),
               dgy.b.optionalFieldOf("effects", ki.a).forGetter(dgx::i)
            )
            .apply($$0, dgx::new)
   );
   public static final Codec<jg<dgx>> c = alo.a(mi.aR);
   public static final ze<wp, jg<dgx>> d = zc.b(mi.aR);

   public static dgx.b a(int $$0) {
      return new dgx.b($$0, 0);
   }

   public static dgx.b a(int $$0, int $$1) {
      return new dgx.b($$0, $$1);
   }

   public static dgx.c a(jk<dag> $$0, jk<dag> $$1, int $$2, int $$3, dgx.b $$4, dgx.b $$5, int $$6, bxp... $$7) {
      return new dgx.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dgx.c a(jk<dag> $$0, int $$1, int $$2, dgx.b $$3, dgx.b $$4, int $$5, bxp... $$6) {
      return new dgx.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bxo, dak> a(byf $$0) {
      Map<bxo, dak> $$1 = Maps.newEnumMap(bxo.class);

      for (bxo $$2 : bxo.j) {
         if (this.a($$2)) {
            dak $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jk<dag> a() {
      return this.f.a();
   }

   public boolean a(bxo $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(dak $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(dak $$0) {
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

   public static boolean a(jg<dgx> $$0, jg<dgx> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xg a(jg<dgx> $$0, int $$1) {
      xu $$2 = $$0.a().e.f();
      if ($$0.a(axp.o)) {
         xj.a($$2, yd.a.a(o.m));
      } else {
         xj.a($$2, yd.a.a(o.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xf.v).b(xg.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(dak $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kk<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(asb $$0, int $$1, bxe $$2, bvt $$3) {
      fat $$4 = b($$0, $$1, $$2, $$3);

      for (dgu<dhm> $$5 : this.a(dgy.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(asb $$0, int $$1, dak $$2, bxe $$3, bvt $$4, MutableFloat $$5) {
      fat $$6 = b($$0, $$1, $$3, $$4);

      for (dgu<dhq> $$7 : this.a(dgy.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(asb $$0, int $$1, dak $$2, MutableFloat $$3) {
      this.a(dgy.k, $$0, $$1, $$2, $$3);
   }

   public void b(asb $$0, int $$1, dak $$2, MutableFloat $$3) {
      this.a(dgy.p, $$0, $$1, $$2, $$3);
   }

   public void c(asb $$0, int $$1, dak $$2, MutableFloat $$3) {
      this.a(dgy.q, $$0, $$1, $$2, $$3);
   }

   public void d(asb $$0, int $$1, dak $$2, MutableFloat $$3) {
      this.a(dgy.x, $$0, $$1, $$2, $$3);
   }

   public void a(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(asb $$0, int $$1, dak $$2, MutableFloat $$3) {
      this.a(dgy.z, $$0, $$1, $$2, $$3);
   }

   public void b(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bai $$0, int $$1, MutableFloat $$2) {
      this.a(dgy.F, $$0, $$1, $$2);
   }

   public void c(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(asb $$0, int $$1, dak $$2, bxe $$3, bvt $$4, MutableFloat $$5) {
      this.a(dgy.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(asb $$0, int $$1, dak $$2, bxe $$3, bvt $$4, MutableFloat $$5) {
      this.a(dgy.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(asb $$0, int $$1, dak $$2, bxe $$3, bvt $$4, MutableFloat $$5) {
      this.a(dgy.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(asb $$0, int $$1, dak $$2, bxe $$3, bvt $$4, MutableFloat $$5) {
      this.a(dgy.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(asb $$0, int $$1, dgw $$2, dhb $$3, bxe $$4, bvt $$5) {
      for (dhg<dho> $$6 : this.a(dgy.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dhg<dho> $$0, asb $$1, int $$2, dgw $$3, bxe $$4, bvt $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bxe $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(asb $$0, int $$1, dak $$2, bxe $$3, MutableFloat $$4) {
      this.a(dgy.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bai $$0, int $$1, MutableFloat $$2) {
      this.a(dgy.A, $$0, $$1, $$2);
   }

   public void a(kk<dhq> $$0, bai $$1, int $$2, MutableFloat $$3) {
      dhq $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(asb $$0, int $$1, dgw $$2, bxe $$3) {
      a(this.a(dgy.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(asb $$0, int $$1, dgw $$2, bxe $$3) {
      a(this.a(dgy.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4, ebq $$5) {
      a(this.a(dgy.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kk<List<dgu<dhq>>> $$0, asb $$1, int $$2, dak $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.G_(), $$4.getValue())));
   }

   private void a(kk<List<dgu<dhq>>> $$0, asb $$1, int $$2, dak $$3, bxe $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kk<List<dgu<dhq>>> $$0, asb $$1, int $$2, dak $$3, bxe $$4, bvt $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static fat b(asb $$0, int $$1, bxe $$2, bvt $$3) {
      faw $$4 = new faw.a($$0).a(fdn.a, $$2).a(fdn.k, $$1).a(fdn.f, $$2.dt()).a(fdn.c, $$3).b(fdn.d, $$3.d()).b(fdn.e, $$3.c()).a(fdm.t);
      return new fat.a($$4).a(Optional.empty());
   }

   private static fat a(asb $$0, int $$1, dak $$2) {
      faw $$3 = new faw.a($$0).a(fdn.i, $$2).a(fdn.k, $$1).a(fdm.u);
      return new fat.a($$3).a(Optional.empty());
   }

   private static fat a(asb $$0, int $$1, bxe $$2, boolean $$3) {
      faw $$4 = new faw.a($$0).a(fdn.a, $$2).a(fdn.k, $$1).a(fdn.f, $$2.dt()).a(fdn.l, $$3).a(fdm.v);
      return new fat.a($$4).a(Optional.empty());
   }

   private static fat a(asb $$0, int $$1, bxe $$2, fgc $$3) {
      faw $$4 = new faw.a($$0).a(fdn.a, $$2).a(fdn.k, $$1).a(fdn.f, $$3).a(fdm.w);
      return new fat.a($$4).a(Optional.empty());
   }

   private static fat a(asb $$0, int $$1, bxe $$2, fgc $$3, ebq $$4) {
      faw $$5 = new faw.a($$0).a(fdn.a, $$2).a(fdn.k, $$1).a(fdn.f, $$3).a(fdn.g, $$4).a(fdm.x);
      return new fat.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dgu<T>> $$0, fat $$1, Consumer<T> $$2) {
      for (dgu<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(asb $$0, int $$1, dgw $$2, byf $$3) {
      bxo $$4 = $$2.b();
      if ($$4 != null) {
         Map<dgx, Set<dhp>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dhp> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dhp> $$7 = $$5.get(this);

            for (dgu<dhp> $$8 : this.a(dgy.n)) {
               dhp $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dt(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dt(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dgw $$1, byf $$2) {
      bxo $$3 = $$1.b();
      if ($$3 != null) {
         Set<dhp> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dhp $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dgx.a a(dgx.c $$0) {
      return new dgx.a($$0);
   }

   public xg f() {
      return this.e;
   }

   public dgx.c g() {
      return this.f;
   }

   public jk<dgx> h() {
      return this.g;
   }

   public ki i() {
      return this.h;
   }

   public static class a {
      private final dgx.c a;
      private jk<dgx> b = jk.a();
      private final Map<kk<?>, List<?>> c = new HashMap<>();
      private final ki.a d = ki.a();

      public a(dgx.c $$0) {
         this.a = $$0;
      }

      public dgx.a a(jk<dgx> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dgx.a a(kk<List<dgu<E>>> $$0, E $$1, fec.a $$2) {
         this.b($$0).add(new dgu<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dgx.a a(kk<List<dgu<E>>> $$0, E $$1) {
         this.b($$0).add(new dgu<>($$1, Optional.empty()));
         return this;
      }

      public <E> dgx.a a(kk<List<dhg<E>>> $$0, dhb $$1, dhb $$2, E $$3, fec.a $$4) {
         this.b($$0).add(new dhg<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dgx.a a(kk<List<dhg<E>>> $$0, dhb $$1, dhb $$2, E $$3) {
         this.b($$0).add(new dhg<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dgx.a a(kk<List<dhn>> $$0, dhn $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dgx.a b(kk<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dgx.a a(kk<bbh> $$0) {
         this.d.a($$0, bbh.a);
         return this;
      }

      private <E> List<E> b(kk<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dgx a(alr $$0) {
         return new dgx(xg.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dgx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dgx.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dgx.b::b)).apply($$0, dgx.b::new)
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

   public static record c(jk<dag> b, Optional<jk<dag>> c, int d, int e, dgx.b f, dgx.b g, int h, List<bxp> i) {
      public static final MapCodec<dgx.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jv.a(mi.K).fieldOf("supported_items").forGetter(dgx.c::a),
                  jv.a(mi.K).optionalFieldOf("primary_items").forGetter(dgx.c::b),
                  azg.a(1, 1024).fieldOf("weight").forGetter(dgx.c::c),
                  azg.a(1, 255).fieldOf("max_level").forGetter(dgx.c::d),
                  dgx.b.a.fieldOf("min_cost").forGetter(dgx.c::e),
                  dgx.b.a.fieldOf("max_cost").forGetter(dgx.c::f),
                  azg.l.fieldOf("anvil_cost").forGetter(dgx.c::g),
                  bxp.m.listOf().fieldOf("slots").forGetter(dgx.c::h)
               )
               .apply($$0, dgx.c::new)
      );

      public jk<dag> a() {
         return this.b;
      }

      public Optional<jk<dag>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dgx.b e() {
         return this.f;
      }

      public dgx.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bxp> h() {
         return this.i;
      }
   }
}
