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

public record deh(wv e, deh.c f, jw<deh> g, kt h) {
   public static final int a = 255;
   public static final Codec<deh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wx.a.fieldOf("description").forGetter(deh::f),
               deh.c.a.forGetter(deh::g),
               kh.a(me.aS).optionalFieldOf("exclusive_set", jw.a()).forGetter(deh::h),
               dei.b.optionalFieldOf("effects", kt.a).forGetter(deh::i)
            )
            .apply($$0, deh::new)
   );
   public static final Codec<js<deh>> c = ala.a(me.aS);
   public static final yt<wg, js<deh>> d = yr.b(me.aS);

   public static deh.b a(int $$0) {
      return new deh.b($$0, 0);
   }

   public static deh.b a(int $$0, int $$1) {
      return new deh.b($$0, $$1);
   }

   public static deh.c a(jw<cxu> $$0, jw<cxu> $$1, int $$2, int $$3, deh.b $$4, deh.b $$5, int $$6, bwd... $$7) {
      return new deh.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static deh.c a(jw<cxu> $$0, int $$1, int $$2, deh.b $$3, deh.b $$4, int $$5, bwd... $$6) {
      return new deh.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bwc, cxy> a(bwr $$0) {
      Map<bwc, cxy> $$1 = Maps.newEnumMap(bwc.class);

      for (bwc $$2 : bwc.j) {
         if (this.a($$2)) {
            cxy $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jw<cxu> a() {
      return this.f.a();
   }

   public boolean a(bwc $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxy $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxy $$0) {
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

   public static boolean a(js<deh> $$0, js<deh> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wv a(js<deh> $$0, int $$1) {
      xj $$2 = $$0.a().e.f();
      if ($$0.a(axc.o)) {
         wy.a($$2, xs.a.a(n.m));
      } else {
         wy.a($$2, xs.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wu.v).b(wv.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cxy $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kw<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arn $$0, int $$1, bvs $$2, buh $$3) {
      exl $$4 = b($$0, $$1, $$2, $$3);

      for (dee<dew> $$5 : this.a(dei.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arn $$0, int $$1, cxy $$2, bvs $$3, buh $$4, MutableFloat $$5) {
      exl $$6 = b($$0, $$1, $$3, $$4);

      for (dee<dfa> $$7 : this.a(dei.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dY(), $$5.floatValue()));
         }
      }
   }

   public void a(arn $$0, int $$1, cxy $$2, MutableFloat $$3) {
      this.a(dei.k, $$0, $$1, $$2, $$3);
   }

   public void b(arn $$0, int $$1, cxy $$2, MutableFloat $$3) {
      this.a(dei.p, $$0, $$1, $$2, $$3);
   }

   public void c(arn $$0, int $$1, cxy $$2, MutableFloat $$3) {
      this.a(dei.q, $$0, $$1, $$2, $$3);
   }

   public void d(arn $$0, int $$1, cxy $$2, MutableFloat $$3) {
      this.a(dei.x, $$0, $$1, $$2, $$3);
   }

   public void a(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arn $$0, int $$1, cxy $$2, MutableFloat $$3) {
      this.a(dei.z, $$0, $$1, $$2, $$3);
   }

   public void b(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azs $$0, int $$1, MutableFloat $$2) {
      this.a(dei.F, $$0, $$1, $$2);
   }

   public void c(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arn $$0, int $$1, cxy $$2, bvs $$3, buh $$4, MutableFloat $$5) {
      this.a(dei.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arn $$0, int $$1, cxy $$2, bvs $$3, buh $$4, MutableFloat $$5) {
      this.a(dei.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arn $$0, int $$1, cxy $$2, bvs $$3, buh $$4, MutableFloat $$5) {
      this.a(dei.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arn $$0, int $$1, cxy $$2, bvs $$3, buh $$4, MutableFloat $$5) {
      this.a(dei.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arn $$0, int $$1, deg $$2, del $$3, bvs $$4, buh $$5) {
      for (deq<dey> $$6 : this.a(dei.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(deq<dey> $$0, arn $$1, int $$2, deg $$3, bvs $$4, buh $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bvs $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dt());
         }
      }
   }

   public void e(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arn $$0, int $$1, cxy $$2, bvs $$3, MutableFloat $$4) {
      this.a(dei.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azs $$0, int $$1, MutableFloat $$2) {
      this.a(dei.A, $$0, $$1, $$2);
   }

   public void a(kw<dfa> $$0, azs $$1, int $$2, MutableFloat $$3) {
      dfa $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arn $$0, int $$1, deg $$2, bvs $$3) {
      a(this.a(dei.o), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void b(arn $$0, int $$1, deg $$2, bvs $$3) {
      a(this.a(dei.r), a($$0, $$1, $$3, $$3.dt()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dt()));
   }

   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4, dym $$5) {
      a(this.a(dei.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kw<List<dee<dfa>>> $$0, arn $$1, int $$2, cxy $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(kw<List<dee<dfa>>> $$0, arn $$1, int $$2, cxy $$3, bvs $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dt()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dY(), $$5.floatValue())));
   }

   private void a(kw<List<dee<dfa>>> $$0, arn $$1, int $$2, cxy $$3, bvs $$4, buh $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dY(), $$6.floatValue())));
   }

   public static exl b(arn $$0, int $$1, bvs $$2, buh $$3) {
      exo $$4 = new exo.a($$0).a(faf.a, $$2).a(faf.k, $$1).a(faf.f, $$2.dt()).a(faf.c, $$3).b(faf.d, $$3.d()).b(faf.e, $$3.c()).a(fae.t);
      return new exl.a($$4).a(Optional.empty());
   }

   private static exl a(arn $$0, int $$1, cxy $$2) {
      exo $$3 = new exo.a($$0).a(faf.i, $$2).a(faf.k, $$1).a(fae.u);
      return new exl.a($$3).a(Optional.empty());
   }

   private static exl a(arn $$0, int $$1, bvs $$2, boolean $$3) {
      exo $$4 = new exo.a($$0).a(faf.a, $$2).a(faf.k, $$1).a(faf.f, $$2.dt()).a(faf.l, $$3).a(fae.v);
      return new exl.a($$4).a(Optional.empty());
   }

   private static exl a(arn $$0, int $$1, bvs $$2, fcu $$3) {
      exo $$4 = new exo.a($$0).a(faf.a, $$2).a(faf.k, $$1).a(faf.f, $$3).a(fae.w);
      return new exl.a($$4).a(Optional.empty());
   }

   private static exl a(arn $$0, int $$1, bvs $$2, fcu $$3, dym $$4) {
      exo $$5 = new exo.a($$0).a(faf.a, $$2).a(faf.k, $$1).a(faf.f, $$3).a(faf.g, $$4).a(fae.x);
      return new exl.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dee<T>> $$0, exl $$1, Consumer<T> $$2) {
      for (dee<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arn $$0, int $$1, deg $$2, bwr $$3) {
      bwc $$4 = $$2.b();
      if ($$4 != null) {
         Map<deh, Set<dez>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dez> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dt(), $$1));
            }
         } else {
            Set<dez> $$7 = $$5.get(this);

            for (dee<dez> $$8 : this.a(dei.n)) {
               dez $$9 = $$8.a();
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

   public void a(int $$0, deg $$1, bwr $$2) {
      bwc $$3 = $$1.b();
      if ($$3 != null) {
         Set<dez> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dez $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dt(), $$0);
            }
         }
      }
   }

   public static deh.a a(deh.c $$0) {
      return new deh.a($$0);
   }

   public wv f() {
      return this.e;
   }

   public deh.c g() {
      return this.f;
   }

   public jw<deh> h() {
      return this.g;
   }

   public kt i() {
      return this.h;
   }

   public static class a {
      private final deh.c a;
      private jw<deh> b = jw.a();
      private final Map<kw<?>, List<?>> c = new HashMap<>();
      private final kt.a d = kt.a();

      public a(deh.c $$0) {
         this.a = $$0;
      }

      public deh.a a(jw<deh> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> deh.a a(kw<List<dee<E>>> $$0, E $$1, fau.a $$2) {
         this.b($$0).add(new dee<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> deh.a a(kw<List<dee<E>>> $$0, E $$1) {
         this.b($$0).add(new dee<>($$1, Optional.empty()));
         return this;
      }

      public <E> deh.a a(kw<List<deq<E>>> $$0, del $$1, del $$2, E $$3, fau.a $$4) {
         this.b($$0).add(new deq<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> deh.a a(kw<List<deq<E>>> $$0, del $$1, del $$2, E $$3) {
         this.b($$0).add(new deq<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public deh.a a(kw<List<dex>> $$0, dex $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> deh.a b(kw<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public deh.a a(kw<baq> $$0) {
         this.d.a($$0, baq.a);
         return this;
      }

      private <E> List<E> b(kw<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public deh a(ald $$0) {
         return new deh(wv.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<deh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(deh.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(deh.b::b)).apply($$0, deh.b::new)
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

   public static record c(jw<cxu> b, Optional<jw<cxu>> c, int d, int e, deh.b f, deh.b g, int h, List<bwd> i) {
      public static final MapCodec<deh.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kh.a(me.K).fieldOf("supported_items").forGetter(deh.c::a),
                  kh.a(me.K).optionalFieldOf("primary_items").forGetter(deh.c::b),
                  ays.a(1, 1024).fieldOf("weight").forGetter(deh.c::c),
                  ays.a(1, 255).fieldOf("max_level").forGetter(deh.c::d),
                  deh.b.a.fieldOf("min_cost").forGetter(deh.c::e),
                  deh.b.a.fieldOf("max_cost").forGetter(deh.c::f),
                  ays.l.fieldOf("anvil_cost").forGetter(deh.c::g),
                  bwd.m.listOf().fieldOf("slots").forGetter(deh.c::h)
               )
               .apply($$0, deh.c::new)
      );

      public jw<cxu> a() {
         return this.b;
      }

      public Optional<jw<cxu>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public deh.b e() {
         return this.f;
      }

      public deh.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bwd> h() {
         return this.i;
      }
   }
}
