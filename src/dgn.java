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

public record dgn(xc e, dgn.c f, jk<dgn> g, ki h) {
   public static final int a = 255;
   public static final Codec<dgn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xe.a.fieldOf("description").forGetter(dgn::f),
               dgn.c.a.forGetter(dgn::g),
               jv.a(mi.aR).optionalFieldOf("exclusive_set", jk.a()).forGetter(dgn::h),
               dgo.b.optionalFieldOf("effects", ki.a).forGetter(dgn::i)
            )
            .apply($$0, dgn::new)
   );
   public static final Codec<jg<dgn>> c = alh.a(mi.aR);
   public static final za<wn, jg<dgn>> d = yy.b(mi.aR);

   public static dgn.b a(int $$0) {
      return new dgn.b($$0, 0);
   }

   public static dgn.b a(int $$0, int $$1) {
      return new dgn.b($$0, $$1);
   }

   public static dgn.c a(jk<czw> $$0, jk<czw> $$1, int $$2, int $$3, dgn.b $$4, dgn.b $$5, int $$6, bxg... $$7) {
      return new dgn.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dgn.c a(jk<czw> $$0, int $$1, int $$2, dgn.b $$3, dgn.b $$4, int $$5, bxg... $$6) {
      return new dgn.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bxf, daa> a(bxw $$0) {
      Map<bxf, daa> $$1 = Maps.newEnumMap(bxf.class);

      for (bxf $$2 : bxf.j) {
         if (this.a($$2)) {
            daa $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jk<czw> a() {
      return this.f.a();
   }

   public boolean a(bxf $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(daa $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(daa $$0) {
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

   public static boolean a(jg<dgn> $$0, jg<dgn> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xc a(jg<dgn> $$0, int $$1) {
      xq $$2 = $$0.a().e.f();
      if ($$0.a(axi.o)) {
         xf.a($$2, xz.a.a(o.m));
      } else {
         xf.a($$2, xz.a.a(o.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xb.v).b(xc.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(daa $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kk<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aru $$0, int $$1, bwv $$2, bvk $$3) {
      faj $$4 = b($$0, $$1, $$2, $$3);

      for (dgk<dhc> $$5 : this.a(dgo.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aru $$0, int $$1, daa $$2, bwv $$3, bvk $$4, MutableFloat $$5) {
      faj $$6 = b($$0, $$1, $$3, $$4);

      for (dgk<dhg> $$7 : this.a(dgo.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(aru $$0, int $$1, daa $$2, MutableFloat $$3) {
      this.a(dgo.k, $$0, $$1, $$2, $$3);
   }

   public void b(aru $$0, int $$1, daa $$2, MutableFloat $$3) {
      this.a(dgo.p, $$0, $$1, $$2, $$3);
   }

   public void c(aru $$0, int $$1, daa $$2, MutableFloat $$3) {
      this.a(dgo.q, $$0, $$1, $$2, $$3);
   }

   public void d(aru $$0, int $$1, daa $$2, MutableFloat $$3) {
      this.a(dgo.x, $$0, $$1, $$2, $$3);
   }

   public void a(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aru $$0, int $$1, daa $$2, MutableFloat $$3) {
      this.a(dgo.z, $$0, $$1, $$2, $$3);
   }

   public void b(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azz $$0, int $$1, MutableFloat $$2) {
      this.a(dgo.F, $$0, $$1, $$2);
   }

   public void c(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aru $$0, int $$1, daa $$2, bwv $$3, bvk $$4, MutableFloat $$5) {
      this.a(dgo.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aru $$0, int $$1, daa $$2, bwv $$3, bvk $$4, MutableFloat $$5) {
      this.a(dgo.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aru $$0, int $$1, daa $$2, bwv $$3, bvk $$4, MutableFloat $$5) {
      this.a(dgo.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aru $$0, int $$1, daa $$2, bwv $$3, bvk $$4, MutableFloat $$5) {
      this.a(dgo.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(aru $$0, int $$1, dgm $$2, dgr $$3, bwv $$4, bvk $$5) {
      for (dgw<dhe> $$6 : this.a(dgo.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dgw<dhe> $$0, aru $$1, int $$2, dgm $$3, bwv $$4, bvk $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwv $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aru $$0, int $$1, daa $$2, bwv $$3, MutableFloat $$4) {
      this.a(dgo.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azz $$0, int $$1, MutableFloat $$2) {
      this.a(dgo.A, $$0, $$1, $$2);
   }

   public void a(kk<dhg> $$0, azz $$1, int $$2, MutableFloat $$3) {
      dhg $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aru $$0, int $$1, dgm $$2, bwv $$3) {
      a(this.a(dgo.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(aru $$0, int $$1, dgm $$2, bwv $$3) {
      a(this.a(dgo.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4, ebg $$5) {
      a(this.a(dgo.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kk<List<dgk<dhg>>> $$0, aru $$1, int $$2, daa $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.G_(), $$4.getValue())));
   }

   private void a(kk<List<dgk<dhg>>> $$0, aru $$1, int $$2, daa $$3, bwv $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kk<List<dgk<dhg>>> $$0, aru $$1, int $$2, daa $$3, bwv $$4, bvk $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static faj b(aru $$0, int $$1, bwv $$2, bvk $$3) {
      fam $$4 = new fam.a($$0).a(fdd.a, $$2).a(fdd.k, $$1).a(fdd.f, $$2.dt()).a(fdd.c, $$3).b(fdd.d, $$3.d()).b(fdd.e, $$3.c()).a(fdc.t);
      return new faj.a($$4).a(Optional.empty());
   }

   private static faj a(aru $$0, int $$1, daa $$2) {
      fam $$3 = new fam.a($$0).a(fdd.i, $$2).a(fdd.k, $$1).a(fdc.u);
      return new faj.a($$3).a(Optional.empty());
   }

   private static faj a(aru $$0, int $$1, bwv $$2, boolean $$3) {
      fam $$4 = new fam.a($$0).a(fdd.a, $$2).a(fdd.k, $$1).a(fdd.f, $$2.dt()).a(fdd.l, $$3).a(fdc.v);
      return new faj.a($$4).a(Optional.empty());
   }

   private static faj a(aru $$0, int $$1, bwv $$2, ffs $$3) {
      fam $$4 = new fam.a($$0).a(fdd.a, $$2).a(fdd.k, $$1).a(fdd.f, $$3).a(fdc.w);
      return new faj.a($$4).a(Optional.empty());
   }

   private static faj a(aru $$0, int $$1, bwv $$2, ffs $$3, ebg $$4) {
      fam $$5 = new fam.a($$0).a(fdd.a, $$2).a(fdd.k, $$1).a(fdd.f, $$3).a(fdd.g, $$4).a(fdc.x);
      return new faj.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dgk<T>> $$0, faj $$1, Consumer<T> $$2) {
      for (dgk<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aru $$0, int $$1, dgm $$2, bxw $$3) {
      bxf $$4 = $$2.b();
      if ($$4 != null) {
         Map<dgn, Set<dhf>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dhf> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dhf> $$7 = $$5.get(this);

            for (dgk<dhf> $$8 : this.a(dgo.n)) {
               dhf $$9 = $$8.a();
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

   public void a(int $$0, dgm $$1, bxw $$2) {
      bxf $$3 = $$1.b();
      if ($$3 != null) {
         Set<dhf> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dhf $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dgn.a a(dgn.c $$0) {
      return new dgn.a($$0);
   }

   public xc f() {
      return this.e;
   }

   public dgn.c g() {
      return this.f;
   }

   public jk<dgn> h() {
      return this.g;
   }

   public ki i() {
      return this.h;
   }

   public static class a {
      private final dgn.c a;
      private jk<dgn> b = jk.a();
      private final Map<kk<?>, List<?>> c = new HashMap<>();
      private final ki.a d = ki.a();

      public a(dgn.c $$0) {
         this.a = $$0;
      }

      public dgn.a a(jk<dgn> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dgn.a a(kk<List<dgk<E>>> $$0, E $$1, fds.a $$2) {
         this.b($$0).add(new dgk<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dgn.a a(kk<List<dgk<E>>> $$0, E $$1) {
         this.b($$0).add(new dgk<>($$1, Optional.empty()));
         return this;
      }

      public <E> dgn.a a(kk<List<dgw<E>>> $$0, dgr $$1, dgr $$2, E $$3, fds.a $$4) {
         this.b($$0).add(new dgw<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dgn.a a(kk<List<dgw<E>>> $$0, dgr $$1, dgr $$2, E $$3) {
         this.b($$0).add(new dgw<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dgn.a a(kk<List<dhd>> $$0, dhd $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dgn.a b(kk<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dgn.a a(kk<bay> $$0) {
         this.d.a($$0, bay.a);
         return this;
      }

      private <E> List<E> b(kk<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dgn a(alk $$0) {
         return new dgn(xc.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dgn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dgn.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dgn.b::b)).apply($$0, dgn.b::new)
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

   public static record c(jk<czw> b, Optional<jk<czw>> c, int d, int e, dgn.b f, dgn.b g, int h, List<bxg> i) {
      public static final MapCodec<dgn.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jv.a(mi.K).fieldOf("supported_items").forGetter(dgn.c::a),
                  jv.a(mi.K).optionalFieldOf("primary_items").forGetter(dgn.c::b),
                  ayy.a(1, 1024).fieldOf("weight").forGetter(dgn.c::c),
                  ayy.a(1, 255).fieldOf("max_level").forGetter(dgn.c::d),
                  dgn.b.a.fieldOf("min_cost").forGetter(dgn.c::e),
                  dgn.b.a.fieldOf("max_cost").forGetter(dgn.c::f),
                  ayy.l.fieldOf("anvil_cost").forGetter(dgn.c::g),
                  bxg.m.listOf().fieldOf("slots").forGetter(dgn.c::h)
               )
               .apply($$0, dgn.c::new)
      );

      public jk<czw> a() {
         return this.b;
      }

      public Optional<jk<czw>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dgn.b e() {
         return this.f;
      }

      public dgn.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bxg> h() {
         return this.i;
      }
   }
}
