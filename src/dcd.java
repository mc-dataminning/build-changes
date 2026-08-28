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

public record dcd(xj e, dcd.c f, ju<dcd> g, kq h) {
   public static final int a = 255;
   public static final Codec<dcd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xl.a.fieldOf("description").forGetter(dcd::f),
               dcd.c.a.forGetter(dcd::g),
               kf.a(ma.aM).optionalFieldOf("exclusive_set", ju.a()).forGetter(dcd::h),
               dce.b.optionalFieldOf("effects", kq.a).forGetter(dcd::i)
            )
            .apply($$0, dcd::new)
   );
   public static final Codec<jq<dcd>> c = alg.a(ma.aM);
   public static final zh<wu, jq<dcd>> d = zf.b(ma.aM);

   public static dcd.b a(int $$0) {
      return new dcd.b($$0, 0);
   }

   public static dcd.b a(int $$0, int $$1) {
      return new dcd.b($$0, $$1);
   }

   public static dcd.c a(ju<cwi> $$0, ju<cwi> $$1, int $$2, int $$3, dcd.b $$4, dcd.b $$5, int $$6, buu... $$7) {
      return new dcd.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dcd.c a(ju<cwi> $$0, int $$1, int $$2, dcd.b $$3, dcd.b $$4, int $$5, buu... $$6) {
      return new dcd.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<but, cwm> a(bvh $$0) {
      Map<but, cwm> $$1 = Maps.newEnumMap(but.class);

      for (but $$2 : but.i) {
         if (this.a($$2)) {
            cwm $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cwi> a() {
      return this.f.a();
   }

   public boolean a(but $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwm $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwm $$0) {
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

   public static boolean a(jq<dcd> $$0, jq<dcd> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xj a(jq<dcd> $$0, int $$1) {
      xx $$2 = $$0.a().e.f();
      if ($$0.a(axf.o)) {
         xm.a($$2, yg.a.a(n.m));
      } else {
         xm.a($$2, yg.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xi.v).b(xj.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwm $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arp $$0, int $$1, bul $$2, btb $$3) {
      eun $$4 = b($$0, $$1, $$2, $$3);

      for (dca<dcr> $$5 : this.a(dce.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arp $$0, int $$1, cwm $$2, bul $$3, btb $$4, MutableFloat $$5) {
      eun $$6 = b($$0, $$1, $$3, $$4);

      for (dca<dcw> $$7 : this.a(dce.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(arp $$0, int $$1, cwm $$2, MutableFloat $$3) {
      this.a(dce.k, $$0, $$1, $$2, $$3);
   }

   public void b(arp $$0, int $$1, cwm $$2, MutableFloat $$3) {
      this.a(dce.p, $$0, $$1, $$2, $$3);
   }

   public void c(arp $$0, int $$1, cwm $$2, MutableFloat $$3) {
      this.a(dce.q, $$0, $$1, $$2, $$3);
   }

   public void d(arp $$0, int $$1, cwm $$2, MutableFloat $$3) {
      this.a(dce.x, $$0, $$1, $$2, $$3);
   }

   public void a(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arp $$0, int $$1, cwm $$2, MutableFloat $$3) {
      this.a(dce.z, $$0, $$1, $$2, $$3);
   }

   public void b(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azu $$0, int $$1, MutableFloat $$2) {
      this.a(dce.F, $$0, $$1, $$2);
   }

   public void c(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arp $$0, int $$1, cwm $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dce.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arp $$0, int $$1, cwm $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dce.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arp $$0, int $$1, cwm $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dce.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arp $$0, int $$1, cwm $$2, bul $$3, btb $$4, MutableFloat $$5) {
      this.a(dce.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arp $$0, int $$1, dcc $$2, dch $$3, bul $$4, btb $$5) {
      for (dcm<dcu> $$6 : this.a(dce.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dcm<dcu> $$0, arp $$1, int $$2, dcc $$3, bul $$4, btb $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bul $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arp $$0, int $$1, cwm $$2, bul $$3, MutableFloat $$4) {
      this.a(dce.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azu $$0, int $$1, MutableFloat $$2) {
      this.a(dce.A, $$0, $$1, $$2);
   }

   public void a(kt<dcw> $$0, azu $$1, int $$2, MutableFloat $$3) {
      dcw $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arp $$0, int $$1, dcc $$2, bul $$3) {
      a(this.a(dce.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(arp $$0, int $$1, dcc $$2, bul $$3) {
      a(this.a(dce.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4, dvv $$5) {
      a(this.a(dce.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<dca<dcw>>> $$0, arp $$1, int $$2, cwm $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.G_(), $$4.getValue())));
   }

   private void a(kt<List<dca<dcw>>> $$0, arp $$1, int $$2, cwm $$3, bul $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kt<List<dca<dcw>>> $$0, arp $$1, int $$2, cwm $$3, bul $$4, btb $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static eun b(arp $$0, int $$1, bul $$2, btb $$3) {
      euq $$4 = new euq.a($$0).a(exj.a, $$2).a(exj.k, $$1).a(exj.f, $$2.dt()).a(exj.c, $$3).b(exj.d, $$3.d()).b(exj.e, $$3.c()).a(exi.t);
      return new eun.a($$4).a(Optional.empty());
   }

   private static eun a(arp $$0, int $$1, cwm $$2) {
      euq $$3 = new euq.a($$0).a(exj.i, $$2).a(exj.k, $$1).a(exi.u);
      return new eun.a($$3).a(Optional.empty());
   }

   private static eun a(arp $$0, int $$1, bul $$2, boolean $$3) {
      euq $$4 = new euq.a($$0).a(exj.a, $$2).a(exj.k, $$1).a(exj.f, $$2.dt()).a(exj.l, $$3).a(exi.v);
      return new eun.a($$4).a(Optional.empty());
   }

   private static eun a(arp $$0, int $$1, bul $$2, ezy $$3) {
      euq $$4 = new euq.a($$0).a(exj.a, $$2).a(exj.k, $$1).a(exj.f, $$3).a(exi.w);
      return new eun.a($$4).a(Optional.empty());
   }

   private static eun a(arp $$0, int $$1, bul $$2, ezy $$3, dvv $$4) {
      euq $$5 = new euq.a($$0).a(exj.a, $$2).a(exj.k, $$1).a(exj.f, $$3).a(exj.g, $$4).a(exi.x);
      return new eun.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dca<T>> $$0, eun $$1, Consumer<T> $$2) {
      for (dca<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arp $$0, int $$1, dcc $$2, bvh $$3) {
      but $$4 = $$2.b();
      if ($$4 != null) {
         Map<dcd, Set<dcv>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dcv> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dcv> $$7 = $$5.get(this);

            for (dca<dcv> $$8 : this.a(dce.n)) {
               dcv $$9 = $$8.a();
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

   public void a(int $$0, dcc $$1, bvh $$2) {
      but $$3 = $$1.b();
      if ($$3 != null) {
         Set<dcv> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dcv $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dcd.a a(dcd.c $$0) {
      return new dcd.a($$0);
   }

   public xj f() {
      return this.e;
   }

   public dcd.c g() {
      return this.f;
   }

   public ju<dcd> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final dcd.c a;
      private ju<dcd> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(dcd.c $$0) {
         this.a = $$0;
      }

      public dcd.a a(ju<dcd> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dcd.a a(kt<List<dca<E>>> $$0, E $$1, exy.a $$2) {
         this.b($$0).add(new dca<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dcd.a a(kt<List<dca<E>>> $$0, E $$1) {
         this.b($$0).add(new dca<>($$1, Optional.empty()));
         return this;
      }

      public <E> dcd.a a(kt<List<dcm<E>>> $$0, dch $$1, dch $$2, E $$3, exy.a $$4) {
         this.b($$0).add(new dcm<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dcd.a a(kt<List<dcm<E>>> $$0, dch $$1, dch $$2, E $$3) {
         this.b($$0).add(new dcm<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dcd.a a(kt<List<dct>> $$0, dct $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dcd.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dcd.a a(kt<bas> $$0) {
         this.d.a($$0, bas.a);
         return this;
      }

      private <E> List<E> b(kt<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dcd a(alj $$0) {
         return new dcd(xj.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dcd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dcd.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dcd.b::b)).apply($$0, dcd.b::new)
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

   public static record c(ju<cwi> b, Optional<ju<cwi>> c, int d, int e, dcd.b f, dcd.b g, int h, List<buu> i) {
      public static final MapCodec<dcd.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(ma.K).fieldOf("supported_items").forGetter(dcd.c::a),
                  kf.a(ma.K).optionalFieldOf("primary_items").forGetter(dcd.c::b),
                  ayv.a(1, 1024).fieldOf("weight").forGetter(dcd.c::c),
                  ayv.a(1, 255).fieldOf("max_level").forGetter(dcd.c::d),
                  dcd.b.a.fieldOf("min_cost").forGetter(dcd.c::e),
                  dcd.b.a.fieldOf("max_cost").forGetter(dcd.c::f),
                  ayv.l.fieldOf("anvil_cost").forGetter(dcd.c::g),
                  buu.l.listOf().fieldOf("slots").forGetter(dcd.c::h)
               )
               .apply($$0, dcd.c::new)
      );

      public ju<cwi> a() {
         return this.b;
      }

      public Optional<ju<cwi>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dcd.b e() {
         return this.f;
      }

      public dcd.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<buu> h() {
         return this.i;
      }
   }
}
