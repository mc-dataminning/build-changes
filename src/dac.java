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

public record dac(wz e, dac.c f, jq<dac> g, km h) {
   public static final int a = 255;
   public static final Codec<dac> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xb.a.fieldOf("description").forGetter(dac::f),
               dac.c.a.forGetter(dac::g),
               kb.a(lu.aL).optionalFieldOf("exclusive_set", jq.a()).forGetter(dac::h),
               dad.b.optionalFieldOf("effects", km.a).forGetter(dac::i)
            )
            .apply($$0, dac::new)
   );
   public static final Codec<jm<dac>> c = ako.a(lu.aL);
   public static final yx<wk, jm<dac>> d = yv.b(lu.aL);

   public static dac.b a(int $$0) {
      return new dac.b($$0, 0);
   }

   public static dac.b a(int $$0, int $$1) {
      return new dac.b($$0, $$1);
   }

   public static dac.c a(jq<cul> $$0, jq<cul> $$1, int $$2, int $$3, dac.b $$4, dac.b $$5, int $$6, bsz... $$7) {
      return new dac.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dac.c a(jq<cul> $$0, int $$1, int $$2, dac.b $$3, dac.b $$4, int $$5, bsz... $$6) {
      return new dac.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bsy, cuq> a(btn $$0) {
      Map<bsy, cuq> $$1 = Maps.newEnumMap(bsy.class);

      for (bsy $$2 : bsy.values()) {
         if (this.a($$2)) {
            cuq $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jq<cul> a() {
      return this.f.a();
   }

   public boolean a(bsy $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cuq $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cuq $$0) {
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

   public static boolean a(jm<dac> $$0, jm<dac> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wz a(jm<dac> $$0, int $$1) {
      xn $$2 = $$0.a().e.f();
      if ($$0.a(awh.o)) {
         xc.a($$2, xw.a.a(n.m));
      } else {
         xc.a($$2, xw.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wy.v).b(wz.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cuq $$0) {
      return this.f.a().a($$0.h());
   }

   public <T> List<T> a(kp<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aqu $$0, int $$1, bsr $$2, brk $$3) {
      err $$4 = b($$0, $$1, $$2, $$3);

      for (daa<dap> $$5 : this.a(dad.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aqu $$0, int $$1, cuq $$2, bsr $$3, brk $$4, MutableFloat $$5) {
      err $$6 = b($$0, $$1, $$3, $$4);

      for (daa<dau> $$7 : this.a(dad.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dR(), $$5.floatValue()));
         }
      }
   }

   public void a(aqu $$0, int $$1, cuq $$2, MutableFloat $$3) {
      this.a(dad.k, $$0, $$1, $$2, $$3);
   }

   public void b(aqu $$0, int $$1, cuq $$2, MutableFloat $$3) {
      this.a(dad.p, $$0, $$1, $$2, $$3);
   }

   public void c(aqu $$0, int $$1, cuq $$2, MutableFloat $$3) {
      this.a(dad.q, $$0, $$1, $$2, $$3);
   }

   public void d(aqu $$0, int $$1, cuq $$2, MutableFloat $$3) {
      this.a(dad.x, $$0, $$1, $$2, $$3);
   }

   public void a(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqu $$0, int $$1, cuq $$2, MutableFloat $$3) {
      this.a(dad.z, $$0, $$1, $$2, $$3);
   }

   public void b(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(ayw $$0, int $$1, MutableFloat $$2) {
      this.a(dad.F, $$0, $$1, $$2);
   }

   public void c(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aqu $$0, int $$1, cuq $$2, bsr $$3, brk $$4, MutableFloat $$5) {
      this.a(dad.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aqu $$0, int $$1, cuq $$2, bsr $$3, brk $$4, MutableFloat $$5) {
      this.a(dad.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aqu $$0, int $$1, cuq $$2, bsr $$3, brk $$4, MutableFloat $$5) {
      this.a(dad.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aqu $$0, int $$1, cuq $$2, bsr $$3, brk $$4, MutableFloat $$5) {
      this.a(dad.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(dak<das> $$0, aqu $$1, int $$2, dab $$3, bsr $$4, brk $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bsr $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dm());
         }
      }
   }

   public void a(aqu $$0, int $$1, dab $$2, dag $$3, bsr $$4, brk $$5) {
      for (dak<das> $$6 : this.a(dad.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aqu $$0, int $$1, cuq $$2, bsr $$3, MutableFloat $$4) {
      this.a(dad.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ayw $$0, int $$1, MutableFloat $$2) {
      this.a(dad.A, $$0, $$1, $$2);
   }

   public void a(kp<dau> $$0, ayw $$1, int $$2, MutableFloat $$3) {
      dau $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aqu $$0, int $$1, dab $$2, bsr $$3) {
      a(this.a(dad.o), a($$0, $$1, $$3, $$3.dm()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dm()));
   }

   public void b(aqu $$0, int $$1, dab $$2, bsr $$3) {
      a(this.a(dad.r), a($$0, $$1, $$3, $$3.dm()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dm()));
   }

   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4, dtc $$5) {
      a(this.a(dad.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kp<List<daa<dau>>> $$0, aqu $$1, int $$2, cuq $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(kp<List<daa<dau>>> $$0, aqu $$1, int $$2, cuq $$3, bsr $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dm()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dR(), $$5.floatValue())));
   }

   private void a(kp<List<daa<dau>>> $$0, aqu $$1, int $$2, cuq $$3, bsr $$4, brk $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dR(), $$6.floatValue())));
   }

   public static err b(aqu $$0, int $$1, bsr $$2, brk $$3) {
      eru $$4 = new eru.a($$0).a(eun.a, $$2).a(eun.k, $$1).a(eun.f, $$2.dm()).a(eun.c, $$3).b(eun.d, $$3.d()).b(eun.e, $$3.c()).a(eum.t);
      return new err.a($$4).a(Optional.empty());
   }

   private static err a(aqu $$0, int $$1, cuq $$2) {
      eru $$3 = new eru.a($$0).a(eun.i, $$2).a(eun.k, $$1).a(eum.u);
      return new err.a($$3).a(Optional.empty());
   }

   private static err a(aqu $$0, int $$1, bsr $$2, boolean $$3) {
      eru $$4 = new eru.a($$0).a(eun.a, $$2).a(eun.k, $$1).a(eun.f, $$2.dm()).a(eun.l, $$3).a(eum.v);
      return new err.a($$4).a(Optional.empty());
   }

   private static err a(aqu $$0, int $$1, bsr $$2, exc $$3) {
      eru $$4 = new eru.a($$0).a(eun.a, $$2).a(eun.k, $$1).a(eun.f, $$3).a(eum.w);
      return new err.a($$4).a(Optional.empty());
   }

   private static err a(aqu $$0, int $$1, bsr $$2, exc $$3, dtc $$4) {
      eru $$5 = new eru.a($$0).a(eun.a, $$2).a(eun.k, $$1).a(eun.f, $$3).a(eun.g, $$4).a(eum.x);
      return new err.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<daa<T>> $$0, err $$1, Consumer<T> $$2) {
      for (daa<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aqu $$0, int $$1, dab $$2, btn $$3) {
      if ($$2.b() != null && !this.a($$2.b())) {
         Set<dat> $$4 = $$3.eG().remove(this);
         if ($$4 != null) {
            $$4.forEach($$3x -> $$3x.a($$2, $$3, $$3.dm(), $$1));
         }
      } else {
         Set<dat> $$5 = $$3.eG().get(this);

         for (daa<dat> $$6 : this.a(dad.n)) {
            dat $$7 = $$6.a();
            boolean $$8 = $$5 != null && $$5.contains($$7);
            if ($$6.a(a($$0, $$1, $$3, $$8))) {
               if (!$$8) {
                  if ($$5 == null) {
                     $$5 = new ObjectArraySet();
                     $$3.eG().put(this, $$5);
                  }

                  $$5.add($$7);
               }

               $$7.a($$0, $$1, $$2, $$3, $$3.dm(), !$$8);
            } else if ($$5 != null && $$5.remove($$7)) {
               $$7.a($$2, $$3, $$3.dm(), $$1);
            }
         }

         if ($$5 != null && $$5.isEmpty()) {
            $$3.eG().remove(this);
         }
      }
   }

   public void a(int $$0, dab $$1, btn $$2) {
      Set<dat> $$3 = $$2.eG().remove(this);
      if ($$3 != null) {
         for (dat $$4 : $$3) {
            $$4.a($$1, $$2, $$2.dm(), $$0);
         }
      }
   }

   public static dac.a a(dac.c $$0) {
      return new dac.a($$0);
   }

   public wz f() {
      return this.e;
   }

   public dac.c g() {
      return this.f;
   }

   public jq<dac> h() {
      return this.g;
   }

   public km i() {
      return this.h;
   }

   public static class a {
      private final dac.c a;
      private jq<dac> b = jq.a();
      private final Map<kp<?>, List<?>> c = new HashMap<>();
      private final km.a d = km.a();

      public a(dac.c $$0) {
         this.a = $$0;
      }

      public dac.a a(jq<dac> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dac.a a(kp<List<daa<E>>> $$0, E $$1, evc.a $$2) {
         this.b($$0).add(new daa<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dac.a a(kp<List<daa<E>>> $$0, E $$1) {
         this.b($$0).add(new daa<>($$1, Optional.empty()));
         return this;
      }

      public <E> dac.a a(kp<List<dak<E>>> $$0, dag $$1, dag $$2, E $$3, evc.a $$4) {
         this.b($$0).add(new dak<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dac.a a(kp<List<dak<E>>> $$0, dag $$1, dag $$2, E $$3) {
         this.b($$0).add(new dak<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dac.a a(kp<List<dar>> $$0, dar $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dac.a b(kp<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dac.a a(kp<azs> $$0) {
         this.d.a($$0, azs.a);
         return this;
      }

      private <E> List<E> b(kp<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dac a(akr $$0) {
         return new dac(wz.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dac.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dac.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dac.b::b)).apply($$0, dac.b::new)
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

   public static record c(jq<cul> b, Optional<jq<cul>> c, int d, int e, dac.b f, dac.b g, int h, List<bsz> i) {
      public static final MapCodec<dac.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kb.a(lu.K).fieldOf("supported_items").forGetter(dac.c::a),
                  kb.a(lu.K).optionalFieldOf("primary_items").forGetter(dac.c::b),
                  axw.a(1, 1024).fieldOf("weight").forGetter(dac.c::c),
                  axw.a(1, 255).fieldOf("max_level").forGetter(dac.c::d),
                  dac.b.a.fieldOf("min_cost").forGetter(dac.c::e),
                  dac.b.a.fieldOf("max_cost").forGetter(dac.c::f),
                  axw.k.fieldOf("anvil_cost").forGetter(dac.c::g),
                  bsz.l.listOf().fieldOf("slots").forGetter(dac.c::h)
               )
               .apply($$0, dac.c::new)
      );

      public jq<cul> a() {
         return this.b;
      }

      public Optional<jq<cul>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dac.b e() {
         return this.f;
      }

      public dac.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bsz> h() {
         return this.i;
      }
   }
}
