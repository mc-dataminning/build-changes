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

public record dfx(wy e, dfx.c f, jj<dfx> g, kh h) {
   public static final int a = 255;
   public static final Codec<dfx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(dfx::f),
               dfx.c.a.forGetter(dfx::g),
               ju.a(mh.aR).optionalFieldOf("exclusive_set", jj.a()).forGetter(dfx::h),
               dfy.b.optionalFieldOf("effects", kh.a).forGetter(dfx::i)
            )
            .apply($$0, dfx::new)
   );
   public static final Codec<jf<dfx>> c = ald.a(mh.aR);
   public static final yw<wj, jf<dfx>> d = yu.b(mh.aR);

   public static dfx.b a(int $$0) {
      return new dfx.b($$0, 0);
   }

   public static dfx.b a(int $$0, int $$1) {
      return new dfx.b($$0, $$1);
   }

   public static dfx.c a(jj<czg> $$0, jj<czg> $$1, int $$2, int $$3, dfx.b $$4, dfx.b $$5, int $$6, bwt... $$7) {
      return new dfx.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static dfx.c a(jj<czg> $$0, int $$1, int $$2, dfx.b $$3, dfx.b $$4, int $$5, bwt... $$6) {
      return new dfx.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bws, czk> a(bxj $$0) {
      Map<bws, czk> $$1 = Maps.newEnumMap(bws.class);

      for (bws $$2 : bws.j) {
         if (this.a($$2)) {
            czk $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jj<czg> a() {
      return this.f.a();
   }

   public boolean a(bws $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(czk $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(czk $$0) {
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

   public static boolean a(jf<dfx> $$0, jf<dfx> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wy a(jf<dfx> $$0, int $$1) {
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

   public boolean c(czk $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kj<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arq $$0, int $$1, bwi $$2, bux $$3) {
      ezo $$4 = b($$0, $$1, $$2, $$3);

      for (dfu<dgm> $$5 : this.a(dfy.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arq $$0, int $$1, czk $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      ezo $$6 = b($$0, $$1, $$3, $$4);

      for (dfu<dgq> $$7 : this.a(dfy.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dX(), $$5.floatValue()));
         }
      }
   }

   public void a(arq $$0, int $$1, czk $$2, MutableFloat $$3) {
      this.a(dfy.k, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czk $$2, MutableFloat $$3) {
      this.a(dfy.p, $$0, $$1, $$2, $$3);
   }

   public void c(arq $$0, int $$1, czk $$2, MutableFloat $$3) {
      this.a(dfy.q, $$0, $$1, $$2, $$3);
   }

   public void d(arq $$0, int $$1, czk $$2, MutableFloat $$3) {
      this.a(dfy.x, $$0, $$1, $$2, $$3);
   }

   public void a(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arq $$0, int $$1, czk $$2, MutableFloat $$3) {
      this.a(dfy.z, $$0, $$1, $$2, $$3);
   }

   public void b(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfy.F, $$0, $$1, $$2);
   }

   public void c(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arq $$0, int $$1, czk $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dfy.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arq $$0, int $$1, czk $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dfy.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arq $$0, int $$1, czk $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dfy.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arq $$0, int $$1, czk $$2, bwi $$3, bux $$4, MutableFloat $$5) {
      this.a(dfy.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arq $$0, int $$1, dfw $$2, dgb $$3, bwi $$4, bux $$5) {
      for (dgg<dgo> $$6 : this.a(dfy.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dgg<dgo> $$0, arq $$1, int $$2, dfw $$3, bwi $$4, bux $$5) {
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

   public void e(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arq $$0, int $$1, czk $$2, bwi $$3, MutableFloat $$4) {
      this.a(dfy.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azv $$0, int $$1, MutableFloat $$2) {
      this.a(dfy.A, $$0, $$1, $$2);
   }

   public void a(kj<dgq> $$0, azv $$1, int $$2, MutableFloat $$3) {
      dgq $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arq $$0, int $$1, dfw $$2, bwi $$3) {
      a(this.a(dfy.o), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void b(arq $$0, int $$1, dfw $$2, bwi $$3) {
      a(this.a(dfy.r), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4, eao $$5) {
      a(this.a(dfy.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kj<List<dfu<dgq>>> $$0, arq $$1, int $$2, czk $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(kj<List<dfu<dgq>>> $$0, arq $$1, int $$2, czk $$3, bwi $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.ds()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dX(), $$5.floatValue())));
   }

   private void a(kj<List<dfu<dgq>>> $$0, arq $$1, int $$2, czk $$3, bwi $$4, bux $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dX(), $$6.floatValue())));
   }

   public static ezo b(arq $$0, int $$1, bwi $$2, bux $$3) {
      ezr $$4 = new ezr.a($$0).a(fci.a, $$2).a(fci.k, $$1).a(fci.f, $$2.ds()).a(fci.c, $$3).b(fci.d, $$3.d()).b(fci.e, $$3.c()).a(fch.t);
      return new ezo.a($$4).a(Optional.empty());
   }

   private static ezo a(arq $$0, int $$1, czk $$2) {
      ezr $$3 = new ezr.a($$0).a(fci.i, $$2).a(fci.k, $$1).a(fch.u);
      return new ezo.a($$3).a(Optional.empty());
   }

   private static ezo a(arq $$0, int $$1, bwi $$2, boolean $$3) {
      ezr $$4 = new ezr.a($$0).a(fci.a, $$2).a(fci.k, $$1).a(fci.f, $$2.ds()).a(fci.l, $$3).a(fch.v);
      return new ezo.a($$4).a(Optional.empty());
   }

   private static ezo a(arq $$0, int $$1, bwi $$2, fex $$3) {
      ezr $$4 = new ezr.a($$0).a(fci.a, $$2).a(fci.k, $$1).a(fci.f, $$3).a(fch.w);
      return new ezo.a($$4).a(Optional.empty());
   }

   private static ezo a(arq $$0, int $$1, bwi $$2, fex $$3, eao $$4) {
      ezr $$5 = new ezr.a($$0).a(fci.a, $$2).a(fci.k, $$1).a(fci.f, $$3).a(fci.g, $$4).a(fch.x);
      return new ezo.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dfu<T>> $$0, ezo $$1, Consumer<T> $$2) {
      for (dfu<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arq $$0, int $$1, dfw $$2, bxj $$3) {
      bws $$4 = $$2.b();
      if ($$4 != null) {
         Map<dfx, Set<dgp>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dgp> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.ds(), $$1));
            }
         } else {
            Set<dgp> $$7 = $$5.get(this);

            for (dfu<dgp> $$8 : this.a(dfy.n)) {
               dgp $$9 = $$8.a();
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

   public void a(int $$0, dfw $$1, bxj $$2) {
      bws $$3 = $$1.b();
      if ($$3 != null) {
         Set<dgp> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dgp $$5 : $$4) {
               $$5.a($$1, $$2, $$2.ds(), $$0);
            }
         }
      }
   }

   public static dfx.a a(dfx.c $$0) {
      return new dfx.a($$0);
   }

   public wy f() {
      return this.e;
   }

   public dfx.c g() {
      return this.f;
   }

   public jj<dfx> h() {
      return this.g;
   }

   public kh i() {
      return this.h;
   }

   public static class a {
      private final dfx.c a;
      private jj<dfx> b = jj.a();
      private final Map<kj<?>, List<?>> c = new HashMap<>();
      private final kh.a d = kh.a();

      public a(dfx.c $$0) {
         this.a = $$0;
      }

      public dfx.a a(jj<dfx> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> dfx.a a(kj<List<dfu<E>>> $$0, E $$1, fcx.a $$2) {
         this.b($$0).add(new dfu<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> dfx.a a(kj<List<dfu<E>>> $$0, E $$1) {
         this.b($$0).add(new dfu<>($$1, Optional.empty()));
         return this;
      }

      public <E> dfx.a a(kj<List<dgg<E>>> $$0, dgb $$1, dgb $$2, E $$3, fcx.a $$4) {
         this.b($$0).add(new dgg<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> dfx.a a(kj<List<dgg<E>>> $$0, dgb $$1, dgb $$2, E $$3) {
         this.b($$0).add(new dgg<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public dfx.a a(kj<List<dgn>> $$0, dgn $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> dfx.a b(kj<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public dfx.a a(kj<bau> $$0) {
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

      public dfx a(alg $$0) {
         return new dfx(wy.c(ag.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<dfx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(dfx.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(dfx.b::b)).apply($$0, dfx.b::new)
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

   public static record c(jj<czg> b, Optional<jj<czg>> c, int d, int e, dfx.b f, dfx.b g, int h, List<bwt> i) {
      public static final MapCodec<dfx.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ju.a(mh.K).fieldOf("supported_items").forGetter(dfx.c::a),
                  ju.a(mh.K).optionalFieldOf("primary_items").forGetter(dfx.c::b),
                  ayu.a(1, 1024).fieldOf("weight").forGetter(dfx.c::c),
                  ayu.a(1, 255).fieldOf("max_level").forGetter(dfx.c::d),
                  dfx.b.a.fieldOf("min_cost").forGetter(dfx.c::e),
                  dfx.b.a.fieldOf("max_cost").forGetter(dfx.c::f),
                  ayu.l.fieldOf("anvil_cost").forGetter(dfx.c::g),
                  bwt.m.listOf().fieldOf("slots").forGetter(dfx.c::h)
               )
               .apply($$0, dfx.c::new)
      );

      public jj<czg> a() {
         return this.b;
      }

      public Optional<jj<czg>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public dfx.b e() {
         return this.f;
      }

      public dfx.b f() {
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
