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

public record czl(wu c, czl.c d, jn<czl> e, kj f) {
   public static final Codec<czl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ww.a.fieldOf("description").forGetter(czl::f),
               czl.c.a.forGetter(czl::g),
               jy.a(lr.aK).optionalFieldOf("exclusive_set", jn.a()).forGetter(czl::h),
               czm.b.optionalFieldOf("effects", kj.a).forGetter(czl::i)
            )
            .apply($$0, czl::new)
   );
   public static final Codec<jj<czl>> b = akh.a(lr.aK);

   public static czl.b a(int $$0) {
      return new czl.b($$0, 0);
   }

   public static czl.b a(int $$0, int $$1) {
      return new czl.b($$0, $$1);
   }

   public static czl.c a(jn<ctx> $$0, jn<ctx> $$1, int $$2, int $$3, czl.b $$4, czl.b $$5, int $$6, bso... $$7) {
      return new czl.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static czl.c a(jn<ctx> $$0, int $$1, int $$2, czl.b $$3, czl.b $$4, int $$5, bso... $$6) {
      return new czl.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bsn, cuc> a(btb $$0) {
      Map<bsn, cuc> $$1 = Maps.newEnumMap(bsn.class);

      for (bsn $$2 : bsn.values()) {
         if (this.a($$2)) {
            cuc $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jn<ctx> a() {
      return this.d.a();
   }

   public boolean a(bsn $$0) {
      return this.d.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cuc $$0) {
      return this.b($$0) && (this.d.c.isEmpty() || $$0.a(this.d.c.get()));
   }

   public boolean b(cuc $$0) {
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

   public static boolean a(jj<czl> $$0, jj<czl> $$1) {
      return !$$0.equals($$1) && !$$0.a().e.a($$1) && !$$1.a().e.a($$0);
   }

   public static wu a(jj<czl> $$0, int $$1) {
      xi $$2 = $$0.a().c.f();
      if ($$0.a(avz.o)) {
         wx.a($$2, xr.a.a(n.m));
      } else {
         wx.a($$2, xr.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wt.v).b(wu.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cuc $$0) {
      return this.d.a().a($$0.h());
   }

   public <T> List<T> a(km<List<T>> $$0) {
      return this.f.a($$0, List.of());
   }

   public boolean a(aqm $$0, int $$1, bsg $$2, bqz $$3) {
      equ $$4 = b($$0, $$1, $$2, $$3);

      for (czj<czy> $$5 : this.a(czm.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aqm $$0, int $$1, cuc $$2, bsg $$3, bqz $$4, MutableFloat $$5) {
      equ $$6 = b($$0, $$1, $$3, $$4);

      for (czj<dad> $$7 : this.a(czm.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dT(), $$5.floatValue()));
         }
      }
   }

   public void a(aqm $$0, int $$1, cuc $$2, MutableFloat $$3) {
      this.a(czm.k, $$0, $$1, $$2, $$3);
   }

   public void b(aqm $$0, int $$1, cuc $$2, MutableFloat $$3) {
      this.a(czm.p, $$0, $$1, $$2, $$3);
   }

   public void c(aqm $$0, int $$1, cuc $$2, MutableFloat $$3) {
      this.a(czm.q, $$0, $$1, $$2, $$3);
   }

   public void d(aqm $$0, int $$1, cuc $$2, MutableFloat $$3) {
      this.a(czm.x, $$0, $$1, $$2, $$3);
   }

   public void a(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqm $$0, int $$1, cuc $$2, MutableFloat $$3) {
      this.a(czm.z, $$0, $$1, $$2, $$3);
   }

   public void b(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(ayo $$0, int $$1, MutableFloat $$2) {
      this.a(czm.F, $$0, $$1, $$2);
   }

   public void c(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aqm $$0, int $$1, cuc $$2, bsg $$3, bqz $$4, MutableFloat $$5) {
      this.a(czm.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aqm $$0, int $$1, cuc $$2, bsg $$3, bqz $$4, MutableFloat $$5) {
      this.a(czm.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aqm $$0, int $$1, cuc $$2, bsg $$3, bqz $$4, MutableFloat $$5) {
      this.a(czm.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aqm $$0, int $$1, cuc $$2, bsg $$3, bqz $$4, MutableFloat $$5) {
      this.a(czm.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(czt<dab> $$0, aqm $$1, int $$2, czk $$3, bsg $$4, bqz $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bsg $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.do());
         }
      }
   }

   public void a(aqm $$0, int $$1, czk $$2, czp $$3, bsg $$4, bqz $$5) {
      for (czt<dab> $$6 : this.a(czm.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aqm $$0, int $$1, cuc $$2, bsg $$3, MutableFloat $$4) {
      this.a(czm.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ayo $$0, int $$1, MutableFloat $$2) {
      this.a(czm.A, $$0, $$1, $$2);
   }

   public void a(km<dad> $$0, ayo $$1, int $$2, MutableFloat $$3) {
      dad $$4 = this.f.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aqm $$0, int $$1, czk $$2, bsg $$3) {
      a(this.a(czm.o), a($$0, $$1, $$3, $$3.do()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.do()));
   }

   public void b(aqm $$0, int $$1, czk $$2, bsg $$3) {
      a(this.a(czm.r), a($$0, $$1, $$3, $$3.do()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.do()));
   }

   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      a(this.a(czm.j), a($$0, $$1, $$3, $$4), $$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(km<List<czj<dad>>> $$0, aqm $$1, int $$2, cuc $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(km<List<czj<dad>>> $$0, aqm $$1, int $$2, cuc $$3, bsg $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.do()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dT(), $$5.floatValue())));
   }

   private void a(km<List<czj<dad>>> $$0, aqm $$1, int $$2, cuc $$3, bsg $$4, bqz $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dT(), $$6.floatValue())));
   }

   public static equ b(aqm $$0, int $$1, bsg $$2, bqz $$3) {
      eqx $$4 = new eqx.a($$0).a(etq.a, $$2).a(etq.k, $$1).a(etq.f, $$2.do()).a(etq.c, $$3).b(etq.d, $$3.d()).b(etq.e, $$3.c()).a(etp.t);
      return new equ.a($$4).a(Optional.empty());
   }

   private static equ a(aqm $$0, int $$1, cuc $$2) {
      eqx $$3 = new eqx.a($$0).a(etq.i, $$2).a(etq.k, $$1).a(etp.u);
      return new equ.a($$3).a(Optional.empty());
   }

   private static equ a(aqm $$0, int $$1, bsg $$2, boolean $$3) {
      eqx $$4 = new eqx.a($$0).a(etq.a, $$2).a(etq.k, $$1).a(etq.f, $$2.do()).a(etq.l, $$3).a(etp.v);
      return new equ.a($$4).a(Optional.empty());
   }

   private static equ a(aqm $$0, int $$1, bsg $$2, ewf $$3) {
      eqx $$4 = new eqx.a($$0).a(etq.a, $$2).a(etq.k, $$1).a(etq.f, $$3).a(etp.w);
      return new equ.a($$4).a(Optional.empty());
   }

   private static <T> void a(List<czj<T>> $$0, equ $$1, Consumer<T> $$2) {
      for (czj<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aqm $$0, int $$1, czk $$2, btb $$3) {
      if ($$2.b() != null && !this.a($$2.b())) {
         Set<dac> $$4 = $$3.eH().remove(this);
         if ($$4 != null) {
            $$4.forEach($$3x -> $$3x.a($$2, $$3, $$3.do(), $$1));
         }
      } else {
         Set<dac> $$5 = $$3.eH().get(this);

         for (czj<dac> $$6 : this.a(czm.n)) {
            dac $$7 = $$6.a();
            boolean $$8 = $$5 != null && $$5.contains($$7);
            if ($$6.a(a($$0, $$1, $$3, $$8))) {
               if (!$$8) {
                  if ($$5 == null) {
                     $$5 = new ObjectArraySet();
                     $$3.eH().put(this, $$5);
                  }

                  $$5.add($$7);
               }

               $$7.a($$0, $$1, $$2, $$3, $$3.do(), !$$8);
            } else if ($$5 != null && $$5.remove($$7)) {
               $$7.a($$2, $$3, $$3.do(), $$1);
            }
         }

         if ($$5 != null && $$5.isEmpty()) {
            $$3.eH().remove(this);
         }
      }
   }

   public void a(int $$0, czk $$1, btb $$2) {
      Set<dac> $$3 = $$2.eH().remove(this);
      if ($$3 != null) {
         for (dac $$4 : $$3) {
            $$4.a($$1, $$2, $$2.do(), $$0);
         }
      }
   }

   public static czl.a a(czl.c $$0) {
      return new czl.a($$0);
   }

   public wu f() {
      return this.c;
   }

   public czl.c g() {
      return this.d;
   }

   public jn<czl> h() {
      return this.e;
   }

   public kj i() {
      return this.f;
   }

   public static class a {
      private final czl.c a;
      private jn<czl> b = jn.a();
      private final Map<km<?>, List<?>> c = new HashMap<>();
      private final kj.a d = kj.a();

      public a(czl.c $$0) {
         this.a = $$0;
      }

      public czl.a a(jn<czl> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> czl.a a(km<List<czj<E>>> $$0, E $$1, euf.a $$2) {
         this.b($$0).add(new czj<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> czl.a a(km<List<czj<E>>> $$0, E $$1) {
         this.b($$0).add(new czj<>($$1, Optional.empty()));
         return this;
      }

      public <E> czl.a a(km<List<czt<E>>> $$0, czp $$1, czp $$2, E $$3, euf.a $$4) {
         this.b($$0).add(new czt<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> czl.a a(km<List<czt<E>>> $$0, czp $$1, czp $$2, E $$3) {
         this.b($$0).add(new czt<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public czl.a a(km<List<daa>> $$0, daa $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> czl.a b(km<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public czl.a a(km<azk> $$0) {
         this.d.a($$0, azk.a);
         return this;
      }

      private <E> List<E> b(km<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public czl a(akk $$0) {
         return new czl(wu.c(ac.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<czl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(czl.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(czl.b::b)).apply($$0, czl.b::new)
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

   public static record c(jn<ctx> b, Optional<jn<ctx>> c, int d, int e, czl.b f, czl.b g, int h, List<bso> i) {
      public static final MapCodec<czl.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  jy.a(lr.K).fieldOf("supported_items").forGetter(czl.c::a),
                  jy.a(lr.K).optionalFieldOf("primary_items").forGetter(czl.c::b),
                  axo.l.fieldOf("weight").forGetter(czl.c::c),
                  axo.l.fieldOf("max_level").forGetter(czl.c::d),
                  czl.b.a.fieldOf("min_cost").forGetter(czl.c::e),
                  czl.b.a.fieldOf("max_cost").forGetter(czl.c::f),
                  axo.k.fieldOf("anvil_cost").forGetter(czl.c::g),
                  bso.l.listOf().fieldOf("slots").forGetter(czl.c::h)
               )
               .apply($$0, czl.c::new)
      );

      public jn<ctx> a() {
         return this.b;
      }

      public Optional<jn<ctx>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public czl.b e() {
         return this.f;
      }

      public czl.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bso> h() {
         return this.i;
      }
   }
}
