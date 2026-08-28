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

public record dgl(xa e, dgl.c f, jj<dgl> g, kh h) {
   public static final int a = 255;
   public static final Codec<dgl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xc.a.fieldOf("description").forGetter(dgl::f),
               dgl.c.a.forGetter(dgl::g),
               ju.a(mh.aR).optionalFieldOf("exclusive_set", jj.a()).forGetter(dgl::h),
               dgm.b.optionalFieldOf("effects", kh.a).forGetter(dgl::i)
            )
            .apply($$0, dgl::new)
   );
   public static final Codec<jf<dgl>> c = alf.a(mh.aR);
   public static final yy<wl, jf<dgl>> d = yw.b(mh.aR);

   public static dgl.b a(int $$0) {
      return new dgl.b($$0, 0);
   }

   public static dgl.b a(int $$0, int $$1) {
      return new dgl.b($$0, $$1);
   }

   public static dgl.c a(jj<czu> $$0, jj<czu> $$1, int $$2, int $$3, dgl.b $$4, dgl.b $$5, int $$6, bxe... $$7) {
      return new dgl.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dgl.c a(jj<czu> $$0, int $$1, int $$2, dgl.b $$3, dgl.b $$4, int $$5, bxe... $$6) {
      return new dgl.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bxd, czy> a(bxu $$0) {
      Map<bxd, czy> $$1 = Maps.newEnumMap(bxd.class);

      for (bxd $$2 : bxd.j) {
         if (this.a($$2)) {
            czy $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jj<czu> a() {
      return this.f.a();
   }

   public boolean a(bxd $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(czy $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(czy $$0) {
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

   public static boolean a(jf<dgl> $$0, jf<dgl> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xa a(jf<dgl> $$0, int $$1) {
      xo $$2 = $$0.a().e.f();
      if ($$0.a(axg.o)) {
         xd.a($$2, xx.a.a(o.m));
      } else {
         xd.a($$2, xx.a.a(o.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wz.v).b(xa.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(czy $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kj<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ars $$0, int $$1, bwt $$2, bvi $$3) {
      fah $$4 = b($$0, $$1, $$2, $$3);

      for (dgi<dha> $$5 : this.a(dgm.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ars $$0, int $$1, czy $$2, bwt $$3, bvi $$4, MutableFloat $$5) {
      fah $$6 = b($$0, $$1, $$3, $$4);

      for (dgi<dhe> $$7 : this.a(dgm.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ars $$0, int $$1, czy $$2, MutableFloat $$3) {
      this.a(dgm.k, $$0, $$1, $$2, $$3);
   }

   public void b(ars $$0, int $$1, czy $$2, MutableFloat $$3) {
      this.a(dgm.p, $$0, $$1, $$2, $$3);
   }

   public void c(ars $$0, int $$1, czy $$2, MutableFloat $$3) {
      this.a(dgm.q, $$0, $$1, $$2, $$3);
   }

   public void d(ars $$0, int $$1, czy $$2, MutableFloat $$3) {
      this.a(dgm.x, $$0, $$1, $$2, $$3);
   }

   public void a(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ars $$0, int $$1, czy $$2, MutableFloat $$3) {
      this.a(dgm.z, $$0, $$1, $$2, $$3);
   }

   public void b(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azx $$0, int $$1, MutableFloat $$2) {
      this.a(dgm.F, $$0, $$1, $$2);
   }

   public void c(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ars $$0, int $$1, czy $$2, bwt $$3, bvi $$4, MutableFloat $$5) {
      this.a(dgm.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ars $$0, int $$1, czy $$2, bwt $$3, bvi $$4, MutableFloat $$5) {
      this.a(dgm.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ars $$0, int $$1, czy $$2, bwt $$3, bvi $$4, MutableFloat $$5) {
      this.a(dgm.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ars $$0, int $$1, czy $$2, bwt $$3, bvi $$4, MutableFloat $$5) {
      this.a(dgm.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ars $$0, int $$1, dgk $$2, dgp $$3, bwt $$4, bvi $$5) {
      for (dgu<dhc> $$6 : this.a(dgm.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dgu<dhc> $$0, ars $$1, int $$2, dgk $$3, bwt $$4, bvi $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwt $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ars $$0, int $$1, czy $$2, bwt $$3, MutableFloat $$4) {
      this.a(dgm.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azx $$0, int $$1, MutableFloat $$2) {
      this.a(dgm.A, $$0, $$1, $$2);
   }

   public void a(kj<dhe> $$0, azx $$1, int $$2, MutableFloat $$3) {
      dhe $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ars $$0, int $$1, dgk $$2, bwt $$3) {
      a(this.a(dgm.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ars $$0, int $$1, dgk $$2, bwt $$3) {
      a(this.a(dgm.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4, ebe $$5) {
      a(this.a(dgm.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kj<List<dgi<dhe>>> $$0, ars $$1, int $$2, czy $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.G_(), $$4.getValue())));
   }

   private void a(kj<List<dgi<dhe>>> $$0, ars $$1, int $$2, czy $$3, bwt $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kj<List<dgi<dhe>>> $$0, ars $$1, int $$2, czy $$3, bwt $$4, bvi $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static fah b(ars $$0, int $$1, bwt $$2, bvi $$3) {
      fak $$4 = new fak.a($$0).a(fdb.a, $$2).a(fdb.k, $$1).a(fdb.f, $$2.dt()).a(fdb.c, $$3).b(fdb.d, $$3.d()).b(fdb.e, $$3.c()).a(fda.t);
      return new fah.a($$4).a(Optional.empty());
   }

   private static fah a(ars $$0, int $$1, czy $$2) {
      fak $$3 = new fak.a($$0).a(fdb.i, $$2).a(fdb.k, $$1).a(fda.u);
      return new fah.a($$3).a(Optional.empty());
   }

   private static fah a(ars $$0, int $$1, bwt $$2, boolean $$3) {
      fak $$4 = new fak.a($$0).a(fdb.a, $$2).a(fdb.k, $$1).a(fdb.f, $$2.dt()).a(fdb.l, $$3).a(fda.v);
      return new fah.a($$4).a(Optional.empty());
   }

   private static fah a(ars $$0, int $$1, bwt $$2, ffq $$3) {
      fak $$4 = new fak.a($$0).a(fdb.a, $$2).a(fdb.k, $$1).a(fdb.f, $$3).a(fda.w);
      return new fah.a($$4).a(Optional.empty());
   }

   private static fah a(ars $$0, int $$1, bwt $$2, ffq $$3, ebe $$4) {
      fak $$5 = new fak.a($$0).a(fdb.a, $$2).a(fdb.k, $$1).a(fdb.f, $$3).a(fdb.g, $$4).a(fda.x);
      return new fah.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dgi<T>> $$0, fah $$1, Consumer<T> $$2) {
      for (dgi<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ars $$0, int $$1, dgk $$2, bxu $$3) {
      bxd $$4 = $$2.b();
      if ($$4 != null) {
         Map<dgl, Set<dhd>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dhd> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dhd> $$7 = $$5.get(this);

            for (dgi<dhd> $$8 : this.a(dgm.n)) {
               dhd $$9 = $$8.a();
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

   public void a(int $$0, dgk $$1, bxu $$2) {
      bxd $$3 = $$1.b();
      if ($$3 != null) {
         Set<dhd> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dhd $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dgl.a a(dgl.c $$0) {
      return new dgl.a($$0);
   }

   public xa f() {
      return this.e;
   }

   public dgl.c g() {
      return this.f;
   }

   public jj<dgl> h() {
      return this.g;
   }

   public kh i() {
      return this.h;
   }

   public static class a {
      private final dgl.c a;
      private jj<dgl> b = jj.a();
      private final Map<kj<?>, List<?>> c = new HashMap<>();
      private final kh.a d = kh.a();

      public a(dgl.c $$0) {
         this.a = $$0;
      }

      public dgl.a a(jj<dgl> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dgl.a a(kj<List<dgi<E>>> $$0, E $$1, fdq.a $$2) {
         this.b($$0).add(new dgi<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dgl.a a(kj<List<dgi<E>>> $$0, E $$1) {
         this.b($$0).add(new dgi<>($$1, Optional.empty()));
         return this;
      }

      public <E> dgl.a a(kj<List<dgu<E>>> $$0, dgp $$1, dgp $$2, E $$3, fdq.a $$4) {
         this.b($$0).add(new dgu<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dgl.a a(kj<List<dgu<E>>> $$0, dgp $$1, dgp $$2, E $$3) {
         this.b($$0).add(new dgu<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dgl.a a(kj<List<dhb>> $$0, dhb $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dgl.a b(kj<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dgl.a a(kj<baw> $$0) {
         this.d.a($$0, baw.a);
         return this;
      }

      private <E> List<E> b(kj<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dgl a(ali $$0) {
         return new dgl(xa.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dgl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dgl.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dgl.b::b)).apply($$0, dgl.b::new)
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

   public static record c(jj<czu> b, Optional<jj<czu>> c, int d, int e, dgl.b f, dgl.b g, int h, List<bxe> i) {
      public static final MapCodec<dgl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.K).fieldOf("supported_items").forGetter(dgl.c::a),
                  ju.a(mh.K).optionalFieldOf("primary_items").forGetter(dgl.c::b),
                  ayw.a(1, 1024).fieldOf("weight").forGetter(dgl.c::c),
                  ayw.a(1, 255).fieldOf("max_level").forGetter(dgl.c::d),
                  dgl.b.a.fieldOf("min_cost").forGetter(dgl.c::e),
                  dgl.b.a.fieldOf("max_cost").forGetter(dgl.c::f),
                  ayw.l.fieldOf("anvil_cost").forGetter(dgl.c::g),
                  bxe.m.listOf().fieldOf("slots").forGetter(dgl.c::h)
               )
               .apply($$0, dgl.c::new)
      );

      public jj<czu> a() {
         return this.b;
      }

      public Optional<jj<czu>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dgl.b e() {
         return this.f;
      }

      public dgl.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bxe> h() {
         return this.i;
      }
   }
}
