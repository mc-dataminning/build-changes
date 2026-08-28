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

public record ddr(xv e, ddr.c f, ju<ddr> g, kq h) {
   public static final int a = 255;
   public static final Codec<ddr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xx.a.fieldOf("description").forGetter(ddr::f),
               ddr.c.a.forGetter(ddr::g),
               kf.a(mb.aN).optionalFieldOf("exclusive_set", ju.a()).forGetter(ddr::h),
               dds.b.optionalFieldOf("effects", kq.a).forGetter(ddr::i)
            )
            .apply($$0, ddr::new)
   );
   public static final Codec<jq<ddr>> c = alw.a(mb.aN);
   public static final zt<xg, jq<ddr>> d = zr.b(mb.aN);

   public static ddr.b a(int $$0) {
      return new ddr.b($$0, 0);
   }

   public static ddr.b a(int $$0, int $$1) {
      return new ddr.b($$0, $$1);
   }

   public static ddr.c a(ju<cxg> $$0, ju<cxg> $$1, int $$2, int $$3, ddr.b $$4, ddr.b $$5, int $$6, bvo... $$7) {
      return new ddr.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static ddr.c a(ju<cxg> $$0, int $$1, int $$2, ddr.b $$3, ddr.b $$4, int $$5, bvo... $$6) {
      return new ddr.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bvn, cxk> a(bwb $$0) {
      Map<bvn, cxk> $$1 = Maps.newEnumMap(bvn.class);

      for (bvn $$2 : bvn.i) {
         if (this.a($$2)) {
            cxk $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cxg> a() {
      return this.f.a();
   }

   public boolean a(bvn $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxk $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxk $$0) {
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

   public static boolean a(jq<ddr> $$0, jq<ddr> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xv a(jq<ddr> $$0, int $$1) {
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

   public boolean c(cxk $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ash $$0, int $$1, bvf $$2, btv $$3) {
      ewh $$4 = b($$0, $$1, $$2, $$3);

      for (ddo<deg> $$5 : this.a(dds.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ash $$0, int $$1, cxk $$2, bvf $$3, btv $$4, MutableFloat $$5) {
      ewh $$6 = b($$0, $$1, $$3, $$4);

      for (ddo<dek> $$7 : this.a(dds.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ash $$0, int $$1, cxk $$2, MutableFloat $$3) {
      this.a(dds.k, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxk $$2, MutableFloat $$3) {
      this.a(dds.p, $$0, $$1, $$2, $$3);
   }

   public void c(ash $$0, int $$1, cxk $$2, MutableFloat $$3) {
      this.a(dds.q, $$0, $$1, $$2, $$3);
   }

   public void d(ash $$0, int $$1, cxk $$2, MutableFloat $$3) {
      this.a(dds.x, $$0, $$1, $$2, $$3);
   }

   public void a(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ash $$0, int $$1, cxk $$2, MutableFloat $$3) {
      this.a(dds.z, $$0, $$1, $$2, $$3);
   }

   public void b(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bam $$0, int $$1, MutableFloat $$2) {
      this.a(dds.F, $$0, $$1, $$2);
   }

   public void c(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ash $$0, int $$1, cxk $$2, bvf $$3, btv $$4, MutableFloat $$5) {
      this.a(dds.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ash $$0, int $$1, cxk $$2, bvf $$3, btv $$4, MutableFloat $$5) {
      this.a(dds.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ash $$0, int $$1, cxk $$2, bvf $$3, btv $$4, MutableFloat $$5) {
      this.a(dds.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ash $$0, int $$1, cxk $$2, bvf $$3, btv $$4, MutableFloat $$5) {
      this.a(dds.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ash $$0, int $$1, ddq $$2, ddv $$3, bvf $$4, btv $$5) {
      for (dea<dei> $$6 : this.a(dds.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dea<dei> $$0, ash $$1, int $$2, ddq $$3, bvf $$4, btv $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bvf $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ash $$0, int $$1, cxk $$2, bvf $$3, MutableFloat $$4) {
      this.a(dds.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bam $$0, int $$1, MutableFloat $$2) {
      this.a(dds.A, $$0, $$1, $$2);
   }

   public void a(kt<dek> $$0, bam $$1, int $$2, MutableFloat $$3) {
      dek $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ash $$0, int $$1, ddq $$2, bvf $$3) {
      a(this.a(dds.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ash $$0, int $$1, ddq $$2, bvf $$3) {
      a(this.a(dds.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4, dxn $$5) {
      a(this.a(dds.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<ddo<dek>>> $$0, ash $$1, int $$2, cxk $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(kt<List<ddo<dek>>> $$0, ash $$1, int $$2, cxk $$3, bvf $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kt<List<ddo<dek>>> $$0, ash $$1, int $$2, cxk $$3, bvf $$4, btv $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static ewh b(ash $$0, int $$1, bvf $$2, btv $$3) {
      ewk $$4 = new ewk.a($$0).a(ezd.a, $$2).a(ezd.k, $$1).a(ezd.f, $$2.dt()).a(ezd.c, $$3).b(ezd.d, $$3.d()).b(ezd.e, $$3.c()).a(ezc.t);
      return new ewh.a($$4).a(Optional.empty());
   }

   private static ewh a(ash $$0, int $$1, cxk $$2) {
      ewk $$3 = new ewk.a($$0).a(ezd.i, $$2).a(ezd.k, $$1).a(ezc.u);
      return new ewh.a($$3).a(Optional.empty());
   }

   private static ewh a(ash $$0, int $$1, bvf $$2, boolean $$3) {
      ewk $$4 = new ewk.a($$0).a(ezd.a, $$2).a(ezd.k, $$1).a(ezd.f, $$2.dt()).a(ezd.l, $$3).a(ezc.v);
      return new ewh.a($$4).a(Optional.empty());
   }

   private static ewh a(ash $$0, int $$1, bvf $$2, fbs $$3) {
      ewk $$4 = new ewk.a($$0).a(ezd.a, $$2).a(ezd.k, $$1).a(ezd.f, $$3).a(ezc.w);
      return new ewh.a($$4).a(Optional.empty());
   }

   private static ewh a(ash $$0, int $$1, bvf $$2, fbs $$3, dxn $$4) {
      ewk $$5 = new ewk.a($$0).a(ezd.a, $$2).a(ezd.k, $$1).a(ezd.f, $$3).a(ezd.g, $$4).a(ezc.x);
      return new ewh.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<ddo<T>> $$0, ewh $$1, Consumer<T> $$2) {
      for (ddo<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ash $$0, int $$1, ddq $$2, bwb $$3) {
      bvn $$4 = $$2.b();
      if ($$4 != null) {
         Map<ddr, Set<dej>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dej> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dej> $$7 = $$5.get(this);

            for (ddo<dej> $$8 : this.a(dds.n)) {
               dej $$9 = $$8.a();
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

   public void a(int $$0, ddq $$1, bwb $$2) {
      bvn $$3 = $$1.b();
      if ($$3 != null) {
         Set<dej> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dej $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static ddr.a a(ddr.c $$0) {
      return new ddr.a($$0);
   }

   public xv f() {
      return this.e;
   }

   public ddr.c g() {
      return this.f;
   }

   public ju<ddr> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final ddr.c a;
      private ju<ddr> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(ddr.c $$0) {
         this.a = $$0;
      }

      public ddr.a a(ju<ddr> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> ddr.a a(kt<List<ddo<E>>> $$0, E $$1, ezs.a $$2) {
         this.b($$0).add(new ddo<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> ddr.a a(kt<List<ddo<E>>> $$0, E $$1) {
         this.b($$0).add(new ddo<>($$1, Optional.empty()));
         return this;
      }

      public <E> ddr.a a(kt<List<dea<E>>> $$0, ddv $$1, ddv $$2, E $$3, ezs.a $$4) {
         this.b($$0).add(new dea<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> ddr.a a(kt<List<dea<E>>> $$0, ddv $$1, ddv $$2, E $$3) {
         this.b($$0).add(new dea<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public ddr.a a(kt<List<deh>> $$0, deh $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> ddr.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public ddr.a a(kt<bbk> $$0) {
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

      public ddr a(alz $$0) {
         return new ddr(xv.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<ddr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(ddr.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(ddr.b::b)).apply($$0, ddr.b::new)
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

   public static record c(ju<cxg> b, Optional<ju<cxg>> c, int d, int e, ddr.b f, ddr.b g, int h, List<bvo> i) {
      public static final MapCodec<ddr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.K).fieldOf("supported_items").forGetter(ddr.c::a),
                  kf.a(mb.K).optionalFieldOf("primary_items").forGetter(ddr.c::b),
                  azn.a(1, 1024).fieldOf("weight").forGetter(ddr.c::c),
                  azn.a(1, 255).fieldOf("max_level").forGetter(ddr.c::d),
                  ddr.b.a.fieldOf("min_cost").forGetter(ddr.c::e),
                  ddr.b.a.fieldOf("max_cost").forGetter(ddr.c::f),
                  azn.l.fieldOf("anvil_cost").forGetter(ddr.c::g),
                  bvo.l.listOf().fieldOf("slots").forGetter(ddr.c::h)
               )
               .apply($$0, ddr.c::new)
      );

      public ju<cxg> a() {
         return this.b;
      }

      public Optional<ju<cxg>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public ddr.b e() {
         return this.f;
      }

      public ddr.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bvo> h() {
         return this.i;
      }
   }
}
