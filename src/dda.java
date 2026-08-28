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

public record dda(wp e, dda.c f, jv<dda> g, kr h) {
   public static final int a = 255;
   public static final Codec<dda> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.fieldOf("description").forGetter(dda::f),
               dda.c.a.forGetter(dda::g),
               kg.a(mc.aO).optionalFieldOf("exclusive_set", jv.a()).forGetter(dda::h),
               ddb.b.optionalFieldOf("effects", kr.a).forGetter(dda::i)
            )
            .apply($$0, dda::new)
   );
   public static final Codec<jr<dda>> c = aks.a(mc.aO);
   public static final yn<wa, jr<dda>> d = yl.b(mc.aO);

   public static dda.b a(int $$0) {
      return new dda.b($$0, 0);
   }

   public static dda.b a(int $$0, int $$1) {
      return new dda.b($$0, $$1);
   }

   public static dda.c a(jv<cwm> $$0, jv<cwm> $$1, int $$2, int $$3, dda.b $$4, dda.b $$5, int $$6, buv... $$7) {
      return new dda.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dda.c a(jv<cwm> $$0, int $$1, int $$2, dda.b $$3, dda.b $$4, int $$5, buv... $$6) {
      return new dda.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<buu, cwq> a(bvi $$0) {
      Map<buu, cwq> $$1 = Maps.newEnumMap(buu.class);

      for (buu $$2 : buu.i) {
         if (this.a($$2)) {
            cwq $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jv<cwm> a() {
      return this.f.a();
   }

   public boolean a(buu $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cwq $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cwq $$0) {
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

   public static boolean a(jr<dda> $$0, jr<dda> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wp a(jr<dda> $$0, int $$1) {
      xd $$2 = $$0.a().e.f();
      if ($$0.a(aws.o)) {
         ws.a($$2, xm.a.a(n.m));
      } else {
         ws.a($$2, xm.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wo.v).b(wp.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cwq $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ku<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ard $$0, int $$1, bum $$2, btc $$3) {
      evs $$4 = b($$0, $$1, $$2, $$3);

      for (dcx<ddp> $$5 : this.a(ddb.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ard $$0, int $$1, cwq $$2, bum $$3, btc $$4, MutableFloat $$5) {
      evs $$6 = b($$0, $$1, $$3, $$4);

      for (dcx<ddt> $$7 : this.a(ddb.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(ard $$0, int $$1, cwq $$2, MutableFloat $$3) {
      this.a(ddb.k, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwq $$2, MutableFloat $$3) {
      this.a(ddb.p, $$0, $$1, $$2, $$3);
   }

   public void c(ard $$0, int $$1, cwq $$2, MutableFloat $$3) {
      this.a(ddb.q, $$0, $$1, $$2, $$3);
   }

   public void d(ard $$0, int $$1, cwq $$2, MutableFloat $$3) {
      this.a(ddb.x, $$0, $$1, $$2, $$3);
   }

   public void a(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ard $$0, int $$1, cwq $$2, MutableFloat $$3) {
      this.a(ddb.z, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azh $$0, int $$1, MutableFloat $$2) {
      this.a(ddb.F, $$0, $$1, $$2);
   }

   public void c(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ard $$0, int $$1, cwq $$2, bum $$3, btc $$4, MutableFloat $$5) {
      this.a(ddb.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ard $$0, int $$1, cwq $$2, bum $$3, btc $$4, MutableFloat $$5) {
      this.a(ddb.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ard $$0, int $$1, cwq $$2, bum $$3, btc $$4, MutableFloat $$5) {
      this.a(ddb.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ard $$0, int $$1, cwq $$2, bum $$3, btc $$4, MutableFloat $$5) {
      this.a(ddb.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ard $$0, int $$1, dcz $$2, dde $$3, bum $$4, btc $$5) {
      for (ddj<ddr> $$6 : this.a(ddb.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(ddj<ddr> $$0, ard $$1, int $$2, dcz $$3, bum $$4, btc $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bum $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ard $$0, int $$1, cwq $$2, bum $$3, MutableFloat $$4) {
      this.a(ddb.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azh $$0, int $$1, MutableFloat $$2) {
      this.a(ddb.A, $$0, $$1, $$2);
   }

   public void a(ku<ddt> $$0, azh $$1, int $$2, MutableFloat $$3) {
      ddt $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ard $$0, int $$1, dcz $$2, bum $$3) {
      a(this.a(ddb.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(ard $$0, int $$1, dcz $$2, bum $$3) {
      a(this.a(ddb.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4, dwy $$5) {
      a(this.a(ddb.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ku<List<dcx<ddt>>> $$0, ard $$1, int $$2, cwq $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(ku<List<dcx<ddt>>> $$0, ard $$1, int $$2, cwq $$3, bum $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(ku<List<dcx<ddt>>> $$0, ard $$1, int $$2, cwq $$3, bum $$4, btc $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static evs b(ard $$0, int $$1, bum $$2, btc $$3) {
      evv $$4 = new evv.a($$0).a(eym.a, $$2).a(eym.k, $$1).a(eym.f, $$2.dt()).a(eym.c, $$3).b(eym.d, $$3.d()).b(eym.e, $$3.c()).a(eyl.t);
      return new evs.a($$4).a(Optional.empty());
   }

   private static evs a(ard $$0, int $$1, cwq $$2) {
      evv $$3 = new evv.a($$0).a(eym.i, $$2).a(eym.k, $$1).a(eyl.u);
      return new evs.a($$3).a(Optional.empty());
   }

   private static evs a(ard $$0, int $$1, bum $$2, boolean $$3) {
      evv $$4 = new evv.a($$0).a(eym.a, $$2).a(eym.k, $$1).a(eym.f, $$2.dt()).a(eym.l, $$3).a(eyl.v);
      return new evs.a($$4).a(Optional.empty());
   }

   private static evs a(ard $$0, int $$1, bum $$2, fbb $$3) {
      evv $$4 = new evv.a($$0).a(eym.a, $$2).a(eym.k, $$1).a(eym.f, $$3).a(eyl.w);
      return new evs.a($$4).a(Optional.empty());
   }

   private static evs a(ard $$0, int $$1, bum $$2, fbb $$3, dwy $$4) {
      evv $$5 = new evv.a($$0).a(eym.a, $$2).a(eym.k, $$1).a(eym.f, $$3).a(eym.g, $$4).a(eyl.x);
      return new evs.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dcx<T>> $$0, evs $$1, Consumer<T> $$2) {
      for (dcx<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ard $$0, int $$1, dcz $$2, bvi $$3) {
      buu $$4 = $$2.b();
      if ($$4 != null) {
         Map<dda, Set<dds>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dds> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dds> $$7 = $$5.get(this);

            for (dcx<dds> $$8 : this.a(ddb.n)) {
               dds $$9 = $$8.a();
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

   public void a(int $$0, dcz $$1, bvi $$2) {
      buu $$3 = $$1.b();
      if ($$3 != null) {
         Set<dds> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dds $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static dda.a a(dda.c $$0) {
      return new dda.a($$0);
   }

   public wp f() {
      return this.e;
   }

   public dda.c g() {
      return this.f;
   }

   public jv<dda> h() {
      return this.g;
   }

   public kr i() {
      return this.h;
   }

   public static class a {
      private final dda.c a;
      private jv<dda> b = jv.a();
      private final Map<ku<?>, List<?>> c = new HashMap<>();
      private final kr.a d = kr.a();

      public a(dda.c $$0) {
         this.a = $$0;
      }

      public dda.a a(jv<dda> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dda.a a(ku<List<dcx<E>>> $$0, E $$1, ezb.a $$2) {
         this.b($$0).add(new dcx<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dda.a a(ku<List<dcx<E>>> $$0, E $$1) {
         this.b($$0).add(new dcx<>($$1, Optional.empty()));
         return this;
      }

      public <E> dda.a a(ku<List<ddj<E>>> $$0, dde $$1, dde $$2, E $$3, ezb.a $$4) {
         this.b($$0).add(new ddj<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dda.a a(ku<List<ddj<E>>> $$0, dde $$1, dde $$2, E $$3) {
         this.b($$0).add(new ddj<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dda.a a(ku<List<ddq>> $$0, ddq $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dda.a b(ku<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dda.a a(ku<baf> $$0) {
         this.d.a($$0, baf.a);
         return this;
      }

      private <E> List<E> b(ku<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dda a(akv $$0) {
         return new dda(wp.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dda.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dda.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dda.b::b)).apply($$0, dda.b::new)
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

   public static record c(jv<cwm> b, Optional<jv<cwm>> c, int d, int e, dda.b f, dda.b g, int h, List<buv> i) {
      public static final MapCodec<dda.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.K).fieldOf("supported_items").forGetter(dda.c::a),
                  kg.a(mc.K).optionalFieldOf("primary_items").forGetter(dda.c::b),
                  ayi.a(1, 1024).fieldOf("weight").forGetter(dda.c::c),
                  ayi.a(1, 255).fieldOf("max_level").forGetter(dda.c::d),
                  dda.b.a.fieldOf("min_cost").forGetter(dda.c::e),
                  dda.b.a.fieldOf("max_cost").forGetter(dda.c::f),
                  ayi.l.fieldOf("anvil_cost").forGetter(dda.c::g),
                  buv.l.listOf().fieldOf("slots").forGetter(dda.c::h)
               )
               .apply($$0, dda.c::new)
      );

      public jv<cwm> a() {
         return this.b;
      }

      public Optional<jv<cwm>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dda.b e() {
         return this.f;
      }

      public dda.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<buv> h() {
         return this.i;
      }
   }
}
