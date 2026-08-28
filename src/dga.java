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

public record dga(wy e, dga.c f, jj<dga> g, kh h) {
   public static final int a = 255;
   public static final Codec<dga> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(dga::f),
               dga.c.a.forGetter(dga::g),
               ju.a(mh.aR).optionalFieldOf("exclusive_set", jj.a()).forGetter(dga::h),
               dgb.b.optionalFieldOf("effects", kh.a).forGetter(dga::i)
            )
            .apply($$0, dga::new)
   );
   public static final Codec<jf<dga>> c = ald.a(mh.aR);
   public static final yw<wj, jf<dga>> d = yu.b(mh.aR);

   public static dga.b a(int $$0) {
      return new dga.b($$0, 0);
   }

   public static dga.b a(int $$0, int $$1) {
      return new dga.b($$0, $$1);
   }

   public static dga.c a(jj<czj> $$0, jj<czj> $$1, int $$2, int $$3, dga.b $$4, dga.b $$5, int $$6, bwt... $$7) {
      return new dga.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dga.c a(jj<czj> $$0, int $$1, int $$2, dga.b $$3, dga.b $$4, int $$5, bwt... $$6) {
      return new dga.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bws, czn> a(bxj $$0) {
      Map<bws, czn> $$1 = Maps.newEnumMap(bws.class);

      for (bws $$2 : bws.j) {
         if (this.a($$2)) {
            czn $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jj<czj> a() {
      return this.f.a();
   }

   public boolean a(bws $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(czn $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(czn $$0) {
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

   public static boolean a(jf<dga> $$0, jf<dga> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wy a(jf<dga> $$0, int $$1) {
      xm $$2 = $$0.a().e.f();
      if ($$0.a(axe.o)) {
         xb.a($$2, xv.a.a(o.m));
      } else {
         xb.a($$2, xv.a.a(o.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wx.v).b(wy.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(czn $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kj<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arq $$0, int $$1, bwi $$2, bux $$3) {
      ezt $$4 = b($$0, $$1, $$2, $$3);

      for (dfx<dgp> $$5 : this.a(dgb.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arq $$0, int $$1, czn $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      ezt $$6 = b($$0, $$1, $$3, $$4);

      for (dfx<dgt> $$7 : this.a(dgb.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dX(), $$5.floatValue()));
         }
      }
   }

   public void a(arq $$0, int $$1, czn $$2, MutableFloat $$3) {
      this.a(dgb.k, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czn $$2, MutableFloat $$3) {
      this.a(dgb.p, $$0, $$1, $$2, $$3);
   }

   public void c(arq $$0, int $$1, czn $$2, MutableFloat $$3) {
      this.a(dgb.q, $$0, $$1, $$2, $$3);
   }

   public void d(arq $$0, int $$1, czn $$2, MutableFloat $$3) {
      this.a(dgb.x, $$0, $$1, $$2, $$3);
   }

   public void a(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arq $$0, int $$1, czn $$2, MutableFloat $$3) {
      this.a(dgb.z, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dgb.F, $$0, $$1, $$2);
   }

   public void c(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arq $$0, int $$1, czn $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dgb.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arq $$0, int $$1, czn $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dgb.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arq $$0, int $$1, czn $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dgb.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arq $$0, int $$1, czn $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dgb.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arq $$0, int $$1, dfz $$2, dge $$3, bwi $$4, bux $$5) {
      for (dgj<dgr> $$6 : this.a(dgb.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dgj<dgr> $$0, arq $$1, int $$2, dfz $$3, bwi $$4, bux $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bwi $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.ds());
         }
      }
   }

   public void e(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arq $$0, int $$1, czn $$2, bwi $$3, MutableFloat $$4) {
      this.a(dgb.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dgb.A, $$0, $$1, $$2);
   }

   public void a(kj<dgt> $$0, azv $$1, int $$2, MutableFloat $$3) {
      dgt $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arq $$0, int $$1, dfz $$2, bwi $$3) {
      a(this.a(dgb.o), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void b(arq $$0, int $$1, dfz $$2, bwi $$3) {
      a(this.a(dgb.r), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4, eat $$5) {
      a(this.a(dgb.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kj<List<dfx<dgt>>> $$0, arq $$1, int $$2, czn $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(kj<List<dfx<dgt>>> $$0, arq $$1, int $$2, czn $$3, bwi $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.ds()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dX(), $$5.floatValue())));
   }

   private void a(kj<List<dfx<dgt>>> $$0, arq $$1, int $$2, czn $$3, bwi $$4, bux $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dX(), $$6.floatValue())));
   }

   public static ezt b(arq $$0, int $$1, bwi $$2, bux $$3) {
      ezw $$4 = new ezw.a($$0).a(fcn.a, $$2).a(fcn.k, $$1).a(fcn.f, $$2.ds()).a(fcn.c, $$3).b(fcn.d, $$3.d()).b(fcn.e, $$3.c()).a(fcm.t);
      return new ezt.a($$4).a(Optional.empty());
   }

   private static ezt a(arq $$0, int $$1, czn $$2) {
      ezw $$3 = new ezw.a($$0).a(fcn.i, $$2).a(fcn.k, $$1).a(fcm.u);
      return new ezt.a($$3).a(Optional.empty());
   }

   private static ezt a(arq $$0, int $$1, bwi $$2, boolean $$3) {
      ezw $$4 = new ezw.a($$0).a(fcn.a, $$2).a(fcn.k, $$1).a(fcn.f, $$2.ds()).a(fcn.l, $$3).a(fcm.v);
      return new ezt.a($$4).a(Optional.empty());
   }

   private static ezt a(arq $$0, int $$1, bwi $$2, ffc $$3) {
      ezw $$4 = new ezw.a($$0).a(fcn.a, $$2).a(fcn.k, $$1).a(fcn.f, $$3).a(fcm.w);
      return new ezt.a($$4).a(Optional.empty());
   }

   private static ezt a(arq $$0, int $$1, bwi $$2, ffc $$3, eat $$4) {
      ezw $$5 = new ezw.a($$0).a(fcn.a, $$2).a(fcn.k, $$1).a(fcn.f, $$3).a(fcn.g, $$4).a(fcm.x);
      return new ezt.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dfx<T>> $$0, ezt $$1, Consumer<T> $$2) {
      for (dfx<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arq $$0, int $$1, dfz $$2, bxj $$3) {
      bws $$4 = $$2.b();
      if ($$4 != null) {
         Map<dga, Set<dgs>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dgs> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.ds(), $$1));
            }
         } else {
            Set<dgs> $$7 = $$5.get(this);

            for (dfx<dgs> $$8 : this.a(dgb.n)) {
               dgs $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.ds(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.ds(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dfz $$1, bxj $$2) {
      bws $$3 = $$1.b();
      if ($$3 != null) {
         Set<dgs> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dgs $$5 : $$4) {
               $$5.a($$1, $$2, $$2.ds(), $$0);
            }
         }
      }
   }

   public static dga.a a(dga.c $$0) {
      return new dga.a($$0);
   }

   public wy f() {
      return this.e;
   }

   public dga.c g() {
      return this.f;
   }

   public jj<dga> h() {
      return this.g;
   }

   public kh i() {
      return this.h;
   }

   public static class a {
      private final dga.c a;
      private jj<dga> b = jj.a();
      private final Map<kj<?>, List<?>> c = new HashMap<>();
      private final kh.a d = kh.a();

      public a(dga.c $$0) {
         this.a = $$0;
      }

      public dga.a a(jj<dga> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dga.a a(kj<List<dfx<E>>> $$0, E $$1, fdc.a $$2) {
         this.b($$0).add(new dfx<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dga.a a(kj<List<dfx<E>>> $$0, E $$1) {
         this.b($$0).add(new dfx<>($$1, Optional.empty()));
         return this;
      }

      public <E> dga.a a(kj<List<dgj<E>>> $$0, dge $$1, dge $$2, E $$3, fdc.a $$4) {
         this.b($$0).add(new dgj<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dga.a a(kj<List<dgj<E>>> $$0, dge $$1, dge $$2, E $$3) {
         this.b($$0).add(new dgj<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dga.a a(kj<List<dgq>> $$0, dgq $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dga.a b(kj<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dga.a a(kj<bau> $$0) {
         this.d.a($$0, bau.a);
         return this;
      }

      private <E> List<E> b(kj<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public dga a(alg $$0) {
         return new dga(wy.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dga.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dga.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dga.b::b)).apply($$0, dga.b::new)
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

   public static record c(jj<czj> b, Optional<jj<czj>> c, int d, int e, dga.b f, dga.b g, int h, List<bwt> i) {
      public static final MapCodec<dga.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.K).fieldOf("supported_items").forGetter(dga.c::a),
                  ju.a(mh.K).optionalFieldOf("primary_items").forGetter(dga.c::b),
                  ayu.a(1, 1024).fieldOf("weight").forGetter(dga.c::c),
                  ayu.a(1, 255).fieldOf("max_level").forGetter(dga.c::d),
                  dga.b.a.fieldOf("min_cost").forGetter(dga.c::e),
                  dga.b.a.fieldOf("max_cost").forGetter(dga.c::f),
                  ayu.l.fieldOf("anvil_cost").forGetter(dga.c::g),
                  bwt.m.listOf().fieldOf("slots").forGetter(dga.c::h)
               )
               .apply($$0, dga.c::new)
      );

      public jj<czj> a() {
         return this.b;
      }

      public Optional<jj<czj>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dga.b e() {
         return this.f;
      }

      public dga.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bwt> h() {
         return this.i;
      }
   }
}
