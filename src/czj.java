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

public record czj(wu c, czj.c d, jn<czj> e, kj f) {
   public static final Codec<czj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(czj::f),
               czj.c.a.forGetter(czj::g),
               jy.a(lr.aK).optionalFieldOf("exclusive_set", jn.a()).forGetter(czj::h),
               czk.b.optionalFieldOf("effects", kj.a).forGetter(czj::i)
            )
            .apply($$0, czj::new)
   );
   public static final Codec<jj<czj>> b = akh.a(lr.aK);

   public static czj.b a(int $$0) {
      return new czj.b($$0, 0);
   }

   public static czj.b a(int $$0, int $$1) {
      return new czj.b($$0, $$1);
   }

   public static czj.c a(jn<ctv> $$0, jn<ctv> $$1, int $$2, int $$3, czj.b $$4, czj.b $$5, int $$6, bsl... $$7) {
      return new czj.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static czj.c a(jn<ctv> $$0, int $$1, int $$2, czj.b $$3, czj.b $$4, int $$5, bsl... $$6) {
      return new czj.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bsk, cua> a(bsy $$0) {
      Map<bsk, cua> $$1 = Maps.newEnumMap(bsk.class);

      for (bsk $$2 : bsk.values()) {
         if (this.a($$2)) {
            cua $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jn<ctv> a() {
      return this.d.a();
   }

   public boolean a(bsk $$0) {
      return this.d.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cua $$0) {
      return this.b($$0) && (this.d.c.isEmpty() || $$0.a(this.d.c.get()));
   }

   public boolean b(cua $$0) {
      return $$0.a(this.d.b);
   }

   public int b() {
      return this.d.c();
   }

   public int c() {
      return this.d.g();
   }

   public int d() {
      return 1;
   }

   public int e() {
      return this.d.d();
   }

   public int b(int $$0) {
      return this.d.e().a($$0);
   }

   public int c(int $$0) {
      return this.d.f().a($$0);
   }

   @Override
   public String toString() {
      return "Enchantment " + this.c.getString();
   }

   public static boolean a(jj<czj> $$0, jj<czj> $$1) {
      return !$$0.equals($$1) && !$$0.a().e.a($$1) && !$$1.a().e.a($$0);
   }

   public static wu a(jj<czj> $$0, int $$1) {
      xi $$2 = $$0.a().c.f();
      if ($$0.a(avx.o)) {
         wx.a($$2, xr.a.a(n.m));
      } else {
         wx.a($$2, xr.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wt.v).b(wu.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cua $$0) {
      return this.d.a().a($$0.h());
   }

   public <T> List<T> a(km<List<T>> $$0) {
      return this.f.a($$0, List.of());
   }

   public boolean a(aqk $$0, int $$1, bsd $$2, bqw $$3) {
      eqo $$4 = b($$0, $$1, $$2, $$3);

      for (czh<czw> $$5 : this.a(czk.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aqk $$0, int $$1, cua $$2, bsd $$3, bqw $$4, MutableFloat $$5) {
      eqo $$6 = b($$0, $$1, $$3, $$4);

      for (czh<dab> $$7 : this.a(czk.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$2, $$1, $$3.dS(), $$5.floatValue()));
         }
      }
   }

   public void a(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.k, $$0, $$1, $$2, $$3);
   }

   public void b(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.p, $$0, $$1, $$2, $$3);
   }

   public void c(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.q, $$0, $$1, $$2, $$3);
   }

   public void d(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.y, $$0, $$1, $$2, $$3);
   }

   public void a(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.z, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.B, $$0, $$1, $$2, $$3);
   }

   public void b(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void c(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.A, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.x, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aqk $$0, int $$1, cua $$2, bsd $$3, bqw $$4, MutableFloat $$5) {
      this.a(czk.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aqk $$0, int $$1, cua $$2, bsd $$3, bqw $$4, MutableFloat $$5) {
      this.a(czk.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aqk $$0, int $$1, cua $$2, bsd $$3, bqw $$4, MutableFloat $$5) {
      this.a(czk.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aqk $$0, int $$1, cua $$2, bsd $$3, bqw $$4, MutableFloat $$5) {
      this.a(czk.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(czr<czz> $$0, aqk $$1, int $$2, czi $$3, bsd $$4, bqw $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bsd $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dn());
         }
      }
   }

   public void a(aqk $$0, int $$1, czi $$2, czn $$3, bsd $$4, bqw $$5) {
      for (czr<czz> $$6 : this.a(czk.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void f(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void g(aqk $$0, int $$1, cua $$2, bsd $$3, MutableFloat $$4) {
      this.a(czk.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aqk $$0, int $$1, cua $$2, MutableFloat $$3) {
      this.a(czk.u, $$0, $$1, $$2, $$3);
   }

   public void a(aqk $$0, int $$1, czi $$2, bsd $$3) {
      a(this.a(czk.o), a($$0, $$1, $$3, $$3.dn()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dn()));
   }

   public void b(aqk $$0, int $$1, czi $$2, bsd $$3) {
      a(this.a(czk.r), a($$0, $$1, $$3, $$3.dn()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dn()));
   }

   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      a(this.a(czk.j), a($$0, $$1, $$3, $$4), $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(km<List<czh<dab>>> $$0, aqk $$1, int $$2, cua $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$4x -> $$4.setValue($$4x.a($$3, $$2, $$1.E_(), $$4.getValue())));
   }

   private void a(km<List<czh<dab>>> $$0, aqk $$1, int $$2, cua $$3, bsd $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dn()), $$4x -> $$5.setValue($$4x.a($$3, $$2, $$4.dS(), $$5.floatValue())));
   }

   private void a(km<List<czh<dab>>> $$0, aqk $$1, int $$2, cua $$3, bsd $$4, bqw $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$4x -> $$6.setValue($$4x.a($$3, $$2, $$4.dS(), $$6.floatValue())));
   }

   public static eqo b(aqk $$0, int $$1, bsd $$2, bqw $$3) {
      eqr $$4 = new eqr.a($$0).a(etk.a, $$2).a(etk.k, $$1).a(etk.f, $$2.dn()).a(etk.c, $$3).b(etk.d, $$3.d()).b(etk.e, $$3.c()).a(etj.t);
      return new eqo.a($$4).a(Optional.empty());
   }

   private static eqo a(aqk $$0, int $$1, cua $$2) {
      eqr $$3 = new eqr.a($$0).a(etk.i, $$2).a(etk.k, $$1).a(etj.u);
      return new eqo.a($$3).a(Optional.empty());
   }

   private static eqo a(aqk $$0, int $$1, bsd $$2, boolean $$3) {
      eqr $$4 = new eqr.a($$0).a(etk.a, $$2).a(etk.k, $$1).a(etk.f, $$2.dn()).a(etk.l, $$3).a(etj.v);
      return new eqo.a($$4).a(Optional.empty());
   }

   private static eqo a(aqk $$0, int $$1, bsd $$2, evz $$3) {
      eqr $$4 = new eqr.a($$0).a(etk.a, $$2).a(etk.k, $$1).a(etk.f, $$3).a(etj.w);
      return new eqo.a($$4).a(Optional.empty());
   }

   private static <T> void a(List<czh<T>> $$0, eqo $$1, Consumer<T> $$2) {
      for (czh<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aqk $$0, int $$1, czi $$2, bsy $$3) {
      if ($$2.b() != null && !this.a($$2.b())) {
         Set<daa> $$4 = $$3.eG().remove(this);
         if ($$4 != null) {
            $$4.forEach($$3x -> $$3x.a($$2, $$3, $$3.dn(), $$1));
         }
      } else {
         Set<daa> $$5 = $$3.eG().get(this);

         for (czh<daa> $$6 : this.a(czk.n)) {
            daa $$7 = $$6.a();
            boolean $$8 = $$5 != null && $$5.contains($$7);
            if ($$6.a(a($$0, $$1, $$3, $$8))) {
               if (!$$8) {
                  if ($$5 == null) {
                     $$5 = new ObjectArraySet();
                     $$3.eG().put(this, $$5);
                  }

                  $$5.add($$7);
               }

               $$7.a($$0, $$1, $$2, $$3, $$3.dn(), !$$8);
            } else if ($$5 != null && $$5.remove($$7)) {
               $$7.a($$2, $$3, $$3.dn(), $$1);
            }
         }

         if ($$5 != null && $$5.isEmpty()) {
            $$3.eG().remove(this);
         }
      }
   }

   public void a(int $$0, czi $$1, bsy $$2) {
      Set<daa> $$3 = $$2.eG().remove(this);
      if ($$3 != null) {
         for (daa $$4 : $$3) {
            $$4.a($$1, $$2, $$2.dn(), $$0);
         }
      }
   }

   public static czj.a a(czj.c $$0) {
      return new czj.a($$0);
   }

   public wu f() {
      return this.c;
   }

   public czj.c g() {
      return this.d;
   }

   public jn<czj> h() {
      return this.e;
   }

   public kj i() {
      return this.f;
   }

   public static class a {
      private final czj.c a;
      private jn<czj> b = jn.a();
      private final Map<km<?>, List<?>> c = new HashMap<>();
      private final kj.a d = kj.a();

      public a(czj.c $$0) {
         this.a = $$0;
      }

      public czj.a a(jn<czj> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> czj.a a(km<List<czh<E>>> $$0, E $$1, etz.a $$2) {
         this.b($$0).add(new czh<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> czj.a a(km<List<czh<E>>> $$0, E $$1) {
         this.b($$0).add(new czh<>($$1, Optional.empty()));
         return this;
      }

      public <E> czj.a a(km<List<czr<E>>> $$0, czn $$1, czn $$2, E $$3, etz.a $$4) {
         this.b($$0).add(new czr<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> czj.a a(km<List<czr<E>>> $$0, czn $$1, czn $$2, E $$3) {
         this.b($$0).add(new czr<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public czj.a a(km<List<czy>> $$0, czy $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> czj.a b(km<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public czj.a a(km<azh> $$0) {
         this.d.a($$0, azh.a);
         return this;
      }

      private <E> List<E> b(km<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public czj a(akk $$0) {
         return new czj(wu.c(ac.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<czj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(czj.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(czj.b::b)).apply($$0, czj.b::new)
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

   public static record c(jn<ctv> b, Optional<jn<ctv>> c, int d, int e, czj.b f, czj.b g, int h, List<bsl> i) {
      public static final MapCodec<czj.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.K).fieldOf("supported_items").forGetter(czj.c::a),
                  jy.a(lr.K).optionalFieldOf("primary_items").forGetter(czj.c::b),
                  axm.l.fieldOf("weight").forGetter(czj.c::c),
                  axm.l.fieldOf("max_level").forGetter(czj.c::d),
                  czj.b.a.fieldOf("min_cost").forGetter(czj.c::e),
                  czj.b.a.fieldOf("max_cost").forGetter(czj.c::f),
                  axm.k.fieldOf("anvil_cost").forGetter(czj.c::g),
                  bsl.l.listOf().fieldOf("slots").forGetter(czj.c::h)
               )
               .apply($$0, czj.c::new)
      );

      public jn<ctv> a() {
         return this.b;
      }

      public Optional<jn<ctv>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public czj.b e() {
         return this.f;
      }

      public czj.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bsl> h() {
         return this.i;
      }
   }
}
