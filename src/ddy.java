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

public record ddy(xv e, ddy.c f, ju<ddy> g, kq h) {
   public static final int a = 255;
   public static final Codec<ddy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xx.a.fieldOf("description").forGetter(ddy::f),
               ddy.c.a.forGetter(ddy::g),
               kf.a(mb.aO).optionalFieldOf("exclusive_set", ju.a()).forGetter(ddy::h),
               ddz.b.optionalFieldOf("effects", kq.a).forGetter(ddy::i)
            )
            .apply($$0, ddy::new)
   );
   public static final Codec<jq<ddy>> c = alw.a(mb.aO);
   public static final zt<xg, jq<ddy>> d = zr.b(mb.aO);

   public static ddy.b a(int $$0) {
      return new ddy.b($$0, 0);
   }

   public static ddy.b a(int $$0, int $$1) {
      return new ddy.b($$0, $$1);
   }

   public static ddy.c a(ju<cxk> $$0, ju<cxk> $$1, int $$2, int $$3, ddy.b $$4, ddy.b $$5, int $$6, bvs... $$7) {
      return new ddy.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static ddy.c a(ju<cxk> $$0, int $$1, int $$2, ddy.b $$3, ddy.b $$4, int $$5, bvs... $$6) {
      return new ddy.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bvr, cxo> a(bwf $$0) {
      Map<bvr, cxo> $$1 = Maps.newEnumMap(bvr.class);

      for (bvr $$2 : bvr.i) {
         if (this.a($$2)) {
            cxo $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cxk> a() {
      return this.f.a();
   }

   public boolean a(bvr $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxo $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxo $$0) {
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

   public static boolean a(jq<ddy> $$0, jq<ddy> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xv a(jq<ddy> $$0, int $$1) {
      yj $$2 = $$0.a().e.f();
      if ($$0.a(axx.o)) {
         xy.a($$2, ys.a.a(n.m));
      } else {
         xy.a($$2, ys.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xu.v).b(xv.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cxo $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ash $$0, int $$1, bvj $$2, btz $$3) {
      ewo $$4 = b($$0, $$1, $$2, $$3);

      for (ddv<den> $$5 : this.a(ddz.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ash $$0, int $$1, cxo $$2, bvj $$3, btz $$4, MutableFloat $$5) {
      ewo $$6 = b($$0, $$1, $$3, $$4);

      for (ddv<der> $$7 : this.a(ddz.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ash $$0, int $$1, cxo $$2, MutableFloat $$3) {
      this.a(ddz.k, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxo $$2, MutableFloat $$3) {
      this.a(ddz.p, $$0, $$1, $$2, $$3);
   }

   public void c(ash $$0, int $$1, cxo $$2, MutableFloat $$3) {
      this.a(ddz.q, $$0, $$1, $$2, $$3);
   }

   public void d(ash $$0, int $$1, cxo $$2, MutableFloat $$3) {
      this.a(ddz.x, $$0, $$1, $$2, $$3);
   }

   public void a(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ash $$0, int $$1, cxo $$2, MutableFloat $$3) {
      this.a(ddz.z, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bam $$0, int $$1, MutableFloat $$2) {
      this.a(ddz.F, $$0, $$1, $$2);
   }

   public void c(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ash $$0, int $$1, cxo $$2, bvj $$3, btz $$4, MutableFloat $$5) {
      this.a(ddz.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ash $$0, int $$1, cxo $$2, bvj $$3, btz $$4, MutableFloat $$5) {
      this.a(ddz.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ash $$0, int $$1, cxo $$2, bvj $$3, btz $$4, MutableFloat $$5) {
      this.a(ddz.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ash $$0, int $$1, cxo $$2, bvj $$3, btz $$4, MutableFloat $$5) {
      this.a(ddz.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ash $$0, int $$1, ddx $$2, dec $$3, bvj $$4, btz $$5) {
      for (deh<dep> $$6 : this.a(ddz.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(deh<dep> $$0, ash $$1, int $$2, ddx $$3, bvj $$4, btz $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bvj $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ash $$0, int $$1, cxo $$2, bvj $$3, MutableFloat $$4) {
      this.a(ddz.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bam $$0, int $$1, MutableFloat $$2) {
      this.a(ddz.A, $$0, $$1, $$2);
   }

   public void a(kt<der> $$0, bam $$1, int $$2, MutableFloat $$3) {
      der $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ash $$0, int $$1, ddx $$2, bvj $$3) {
      a(this.a(ddz.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ash $$0, int $$1, ddx $$2, bvj $$3) {
      a(this.a(ddz.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4, dxu $$5) {
      a(this.a(ddz.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<ddv<der>>> $$0, ash $$1, int $$2, cxo $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(kt<List<ddv<der>>> $$0, ash $$1, int $$2, cxo $$3, bvj $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kt<List<ddv<der>>> $$0, ash $$1, int $$2, cxo $$3, bvj $$4, btz $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static ewo b(ash $$0, int $$1, bvj $$2, btz $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$2.dt()).a(ezi.c, $$3).b(ezi.d, $$3.d()).b(ezi.e, $$3.c()).a(ezh.t);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ash $$0, int $$1, cxo $$2) {
      ewr $$3 = new ewr.a($$0).a(ezi.i, $$2).a(ezi.k, $$1).a(ezh.u);
      return new ewo.a($$3).a(Optional.empty());
   }

   private static ewo a(ash $$0, int $$1, bvj $$2, boolean $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$2.dt()).a(ezi.l, $$3).a(ezh.v);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ash $$0, int $$1, bvj $$2, fbx $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$3).a(ezh.w);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ash $$0, int $$1, bvj $$2, fbx $$3, dxu $$4) {
      ewr $$5 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$3).a(ezi.g, $$4).a(ezh.x);
      return new ewo.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<ddv<T>> $$0, ewo $$1, Consumer<T> $$2) {
      for (ddv<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ash $$0, int $$1, ddx $$2, bwf $$3) {
      bvr $$4 = $$2.b();
      if ($$4 != null) {
         Map<ddy, Set<deq>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<deq> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<deq> $$7 = $$5.get(this);

            for (ddv<deq> $$8 : this.a(ddz.n)) {
               deq $$9 = $$8.a();
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

   public void a(int $$0, ddx $$1, bwf $$2) {
      bvr $$3 = $$1.b();
      if ($$3 != null) {
         Set<deq> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (deq $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static ddy.a a(ddy.c $$0) {
      return new ddy.a($$0);
   }

   public xv f() {
      return this.e;
   }

   public ddy.c g() {
      return this.f;
   }

   public ju<ddy> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final ddy.c a;
      private ju<ddy> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(ddy.c $$0) {
         this.a = $$0;
      }

      public ddy.a a(ju<ddy> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> ddy.a a(kt<List<ddv<E>>> $$0, E $$1, ezx.a $$2) {
         this.b($$0).add(new ddv<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> ddy.a a(kt<List<ddv<E>>> $$0, E $$1) {
         this.b($$0).add(new ddv<>($$1, Optional.empty()));
         return this;
      }

      public <E> ddy.a a(kt<List<deh<E>>> $$0, dec $$1, dec $$2, E $$3, ezx.a $$4) {
         this.b($$0).add(new deh<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> ddy.a a(kt<List<deh<E>>> $$0, dec $$1, dec $$2, E $$3) {
         this.b($$0).add(new deh<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public ddy.a a(kt<List<deo>> $$0, deo $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> ddy.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public ddy.a a(kt<bbk> $$0) {
         this.d.a($$0, bbk.a);
         return this;
      }

      private <E> List<E> b(kt<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public ddy a(alz $$0) {
         return new ddy(xv.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<ddy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(ddy.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(ddy.b::b)).apply($$0, ddy.b::new)
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

   public static record c(ju<cxk> b, Optional<ju<cxk>> c, int d, int e, ddy.b f, ddy.b g, int h, List<bvs> i) {
      public static final MapCodec<ddy.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.K).fieldOf("supported_items").forGetter(ddy.c::a),
                  kf.a(mb.K).optionalFieldOf("primary_items").forGetter(ddy.c::b),
                  azn.a(1, 1024).fieldOf("weight").forGetter(ddy.c::c),
                  azn.a(1, 255).fieldOf("max_level").forGetter(ddy.c::d),
                  ddy.b.a.fieldOf("min_cost").forGetter(ddy.c::e),
                  ddy.b.a.fieldOf("max_cost").forGetter(ddy.c::f),
                  azn.l.fieldOf("anvil_cost").forGetter(ddy.c::g),
                  bvs.l.listOf().fieldOf("slots").forGetter(ddy.c::h)
               )
               .apply($$0, ddy.c::new)
      );

      public ju<cxk> a() {
         return this.b;
      }

      public Optional<ju<cxk>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public ddy.b e() {
         return this.f;
      }

      public ddy.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bvs> h() {
         return this.i;
      }
   }
}
