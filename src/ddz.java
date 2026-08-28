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

public record ddz(xv e, ddz.c f, ju<ddz> g, kq h) {
   public static final int a = 255;
   public static final Codec<ddz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xx.a.fieldOf("description").forGetter(ddz::f),
               ddz.c.a.forGetter(ddz::g),
               kf.a(mb.aO).optionalFieldOf("exclusive_set", ju.a()).forGetter(ddz::h),
               dea.b.optionalFieldOf("effects", kq.a).forGetter(ddz::i)
            )
            .apply($$0, ddz::new)
   );
   public static final Codec<jq<ddz>> c = alw.a(mb.aO);
   public static final zt<xg, jq<ddz>> d = zr.b(mb.aO);

   public static ddz.b a(int $$0) {
      return new ddz.b($$0, 0);
   }

   public static ddz.b a(int $$0, int $$1) {
      return new ddz.b($$0, $$1);
   }

   public static ddz.c a(ju<cxl> $$0, ju<cxl> $$1, int $$2, int $$3, ddz.b $$4, ddz.b $$5, int $$6, bvt... $$7) {
      return new ddz.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static ddz.c a(ju<cxl> $$0, int $$1, int $$2, ddz.b $$3, ddz.b $$4, int $$5, bvt... $$6) {
      return new ddz.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bvs, cxp> a(bwg $$0) {
      Map<bvs, cxp> $$1 = Maps.newEnumMap(bvs.class);

      for (bvs $$2 : bvs.i) {
         if (this.a($$2)) {
            cxp $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cxl> a() {
      return this.f.a();
   }

   public boolean a(bvs $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxp $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxp $$0) {
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

   public static boolean a(jq<ddz> $$0, jq<ddz> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xv a(jq<ddz> $$0, int $$1) {
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

   public boolean c(cxp $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ash $$0, int $$1, bvk $$2, bua $$3) {
      ewp $$4 = b($$0, $$1, $$2, $$3);

      for (ddw<deo> $$5 : this.a(dea.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ash $$0, int $$1, cxp $$2, bvk $$3, bua $$4, MutableFloat $$5) {
      ewp $$6 = b($$0, $$1, $$3, $$4);

      for (ddw<des> $$7 : this.a(dea.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dZ(), $$5.floatValue()));
         }
      }
   }

   public void a(ash $$0, int $$1, cxp $$2, MutableFloat $$3) {
      this.a(dea.k, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxp $$2, MutableFloat $$3) {
      this.a(dea.p, $$0, $$1, $$2, $$3);
   }

   public void c(ash $$0, int $$1, cxp $$2, MutableFloat $$3) {
      this.a(dea.q, $$0, $$1, $$2, $$3);
   }

   public void d(ash $$0, int $$1, cxp $$2, MutableFloat $$3) {
      this.a(dea.x, $$0, $$1, $$2, $$3);
   }

   public void a(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ash $$0, int $$1, cxp $$2, MutableFloat $$3) {
      this.a(dea.z, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bam $$0, int $$1, MutableFloat $$2) {
      this.a(dea.F, $$0, $$1, $$2);
   }

   public void c(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ash $$0, int $$1, cxp $$2, bvk $$3, bua $$4, MutableFloat $$5) {
      this.a(dea.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ash $$0, int $$1, cxp $$2, bvk $$3, bua $$4, MutableFloat $$5) {
      this.a(dea.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ash $$0, int $$1, cxp $$2, bvk $$3, bua $$4, MutableFloat $$5) {
      this.a(dea.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ash $$0, int $$1, cxp $$2, bvk $$3, bua $$4, MutableFloat $$5) {
      this.a(dea.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ash $$0, int $$1, ddy $$2, ded $$3, bvk $$4, bua $$5) {
      for (dei<deq> $$6 : this.a(dea.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dei<deq> $$0, ash $$1, int $$2, ddy $$3, bvk $$4, bua $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bvk $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.du());
         }
      }
   }

   public void e(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ash $$0, int $$1, cxp $$2, bvk $$3, MutableFloat $$4) {
      this.a(dea.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bam $$0, int $$1, MutableFloat $$2) {
      this.a(dea.A, $$0, $$1, $$2);
   }

   public void a(kt<des> $$0, bam $$1, int $$2, MutableFloat $$3) {
      des $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ash $$0, int $$1, ddy $$2, bvk $$3) {
      a(this.a(dea.o), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void b(ash $$0, int $$1, ddy $$2, bvk $$3) {
      a(this.a(dea.r), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4, dxv $$5) {
      a(this.a(dea.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<ddw<des>>> $$0, ash $$1, int $$2, cxp $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(kt<List<ddw<des>>> $$0, ash $$1, int $$2, cxp $$3, bvk $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.du()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dZ(), $$5.floatValue())));
   }

   private void a(kt<List<ddw<des>>> $$0, ash $$1, int $$2, cxp $$3, bvk $$4, bua $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dZ(), $$6.floatValue())));
   }

   public static ewp b(ash $$0, int $$1, bvk $$2, bua $$3) {
      ews $$4 = new ews.a($$0).a(ezj.a, $$2).a(ezj.k, $$1).a(ezj.f, $$2.du()).a(ezj.c, $$3).b(ezj.d, $$3.d()).b(ezj.e, $$3.c()).a(ezi.t);
      return new ewp.a($$4).a(Optional.empty());
   }

   private static ewp a(ash $$0, int $$1, cxp $$2) {
      ews $$3 = new ews.a($$0).a(ezj.i, $$2).a(ezj.k, $$1).a(ezi.u);
      return new ewp.a($$3).a(Optional.empty());
   }

   private static ewp a(ash $$0, int $$1, bvk $$2, boolean $$3) {
      ews $$4 = new ews.a($$0).a(ezj.a, $$2).a(ezj.k, $$1).a(ezj.f, $$2.du()).a(ezj.l, $$3).a(ezi.v);
      return new ewp.a($$4).a(Optional.empty());
   }

   private static ewp a(ash $$0, int $$1, bvk $$2, fby $$3) {
      ews $$4 = new ews.a($$0).a(ezj.a, $$2).a(ezj.k, $$1).a(ezj.f, $$3).a(ezi.w);
      return new ewp.a($$4).a(Optional.empty());
   }

   private static ewp a(ash $$0, int $$1, bvk $$2, fby $$3, dxv $$4) {
      ews $$5 = new ews.a($$0).a(ezj.a, $$2).a(ezj.k, $$1).a(ezj.f, $$3).a(ezj.g, $$4).a(ezi.x);
      return new ewp.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<ddw<T>> $$0, ewp $$1, Consumer<T> $$2) {
      for (ddw<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ash $$0, int $$1, ddy $$2, bwg $$3) {
      bvs $$4 = $$2.b();
      if ($$4 != null) {
         Map<ddz, Set<der>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<der> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.du(), $$1));
            }
         } else {
            Set<der> $$7 = $$5.get(this);

            for (ddw<der> $$8 : this.a(dea.n)) {
               der $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.du(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.du(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, ddy $$1, bwg $$2) {
      bvs $$3 = $$1.b();
      if ($$3 != null) {
         Set<der> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (der $$5 : $$4) {
               $$5.a($$1, $$2, $$2.du(), $$0);
            }
         }
      }
   }

   public static ddz.a a(ddz.c $$0) {
      return new ddz.a($$0);
   }

   public xv f() {
      return this.e;
   }

   public ddz.c g() {
      return this.f;
   }

   public ju<ddz> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final ddz.c a;
      private ju<ddz> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(ddz.c $$0) {
         this.a = $$0;
      }

      public ddz.a a(ju<ddz> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> ddz.a a(kt<List<ddw<E>>> $$0, E $$1, ezy.a $$2) {
         this.b($$0).add(new ddw<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> ddz.a a(kt<List<ddw<E>>> $$0, E $$1) {
         this.b($$0).add(new ddw<>($$1, Optional.empty()));
         return this;
      }

      public <E> ddz.a a(kt<List<dei<E>>> $$0, ded $$1, ded $$2, E $$3, ezy.a $$4) {
         this.b($$0).add(new dei<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> ddz.a a(kt<List<dei<E>>> $$0, ded $$1, ded $$2, E $$3) {
         this.b($$0).add(new dei<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public ddz.a a(kt<List<dep>> $$0, dep $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> ddz.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public ddz.a a(kt<bbk> $$0) {
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

      public ddz a(alz $$0) {
         return new ddz(xv.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<ddz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(ddz.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(ddz.b::b)).apply($$0, ddz.b::new)
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

   public static record c(ju<cxl> b, Optional<ju<cxl>> c, int d, int e, ddz.b f, ddz.b g, int h, List<bvt> i) {
      public static final MapCodec<ddz.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.K).fieldOf("supported_items").forGetter(ddz.c::a),
                  kf.a(mb.K).optionalFieldOf("primary_items").forGetter(ddz.c::b),
                  azn.a(1, 1024).fieldOf("weight").forGetter(ddz.c::c),
                  azn.a(1, 255).fieldOf("max_level").forGetter(ddz.c::d),
                  ddz.b.a.fieldOf("min_cost").forGetter(ddz.c::e),
                  ddz.b.a.fieldOf("max_cost").forGetter(ddz.c::f),
                  azn.l.fieldOf("anvil_cost").forGetter(ddz.c::g),
                  bvt.l.listOf().fieldOf("slots").forGetter(ddz.c::h)
               )
               .apply($$0, ddz.c::new)
      );

      public ju<cxl> a() {
         return this.b;
      }

      public Optional<ju<cxl>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public ddz.b e() {
         return this.f;
      }

      public ddz.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bvt> h() {
         return this.i;
      }
   }
}
