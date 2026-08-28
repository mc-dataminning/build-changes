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

public record ddq(xk e, ddq.c f, ju<ddq> g, kq h) {
   public static final int a = 255;
   public static final Codec<ddq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xm.a.fieldOf("description").forGetter(ddq::f),
               ddq.c.a.forGetter(ddq::g),
               kf.a(mb.aO).optionalFieldOf("exclusive_set", ju.a()).forGetter(ddq::h),
               ddr.b.optionalFieldOf("effects", kq.a).forGetter(ddq::i)
            )
            .apply($$0, ddq::new)
   );
   public static final Codec<jq<ddq>> c = alm.a(mb.aO);
   public static final zi<wv, jq<ddq>> d = zg.b(mb.aO);

   public static ddq.b a(int $$0) {
      return new ddq.b($$0, 0);
   }

   public static ddq.b a(int $$0, int $$1) {
      return new ddq.b($$0, $$1);
   }

   public static ddq.c a(ju<cxc> $$0, ju<cxc> $$1, int $$2, int $$3, ddq.b $$4, ddq.b $$5, int $$6, bvk... $$7) {
      return new ddq.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static ddq.c a(ju<cxc> $$0, int $$1, int $$2, ddq.b $$3, ddq.b $$4, int $$5, bvk... $$6) {
      return new ddq.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bvj, cxg> a(bvx $$0) {
      Map<bvj, cxg> $$1 = Maps.newEnumMap(bvj.class);

      for (bvj $$2 : bvj.i) {
         if (this.a($$2)) {
            cxg $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public ju<cxc> a() {
      return this.f.a();
   }

   public boolean a(bvj $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxg $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxg $$0) {
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

   public static boolean a(jq<ddq> $$0, jq<ddq> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xk a(jq<ddq> $$0, int $$1) {
      xy $$2 = $$0.a().e.f();
      if ($$0.a(axn.o)) {
         xn.a($$2, yh.a.a(n.m));
      } else {
         xn.a($$2, yh.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xj.v).b(xk.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cxg $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kt<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arx $$0, int $$1, bvb $$2, btr $$3) {
      ewi $$4 = b($$0, $$1, $$2, $$3);

      for (ddn<def> $$5 : this.a(ddr.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arx $$0, int $$1, cxg $$2, bvb $$3, btr $$4, MutableFloat $$5) {
      ewi $$6 = b($$0, $$1, $$3, $$4);

      for (ddn<dej> $$7 : this.a(ddr.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dZ(), $$5.floatValue()));
         }
      }
   }

   public void a(arx $$0, int $$1, cxg $$2, MutableFloat $$3) {
      this.a(ddr.k, $$0, $$1, $$2, $$3);
   }

   public void b(arx $$0, int $$1, cxg $$2, MutableFloat $$3) {
      this.a(ddr.p, $$0, $$1, $$2, $$3);
   }

   public void c(arx $$0, int $$1, cxg $$2, MutableFloat $$3) {
      this.a(ddr.q, $$0, $$1, $$2, $$3);
   }

   public void d(arx $$0, int $$1, cxg $$2, MutableFloat $$3) {
      this.a(ddr.x, $$0, $$1, $$2, $$3);
   }

   public void a(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arx $$0, int $$1, cxg $$2, MutableFloat $$3) {
      this.a(ddr.z, $$0, $$1, $$2, $$3);
   }

   public void b(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(bac $$0, int $$1, MutableFloat $$2) {
      this.a(ddr.F, $$0, $$1, $$2);
   }

   public void c(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arx $$0, int $$1, cxg $$2, bvb $$3, btr $$4, MutableFloat $$5) {
      this.a(ddr.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arx $$0, int $$1, cxg $$2, bvb $$3, btr $$4, MutableFloat $$5) {
      this.a(ddr.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arx $$0, int $$1, cxg $$2, bvb $$3, btr $$4, MutableFloat $$5) {
      this.a(ddr.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arx $$0, int $$1, cxg $$2, bvb $$3, btr $$4, MutableFloat $$5) {
      this.a(ddr.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(arx $$0, int $$1, ddp $$2, ddu $$3, bvb $$4, btr $$5) {
      for (ddz<deh> $$6 : this.a(ddr.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(ddz<deh> $$0, arx $$1, int $$2, ddp $$3, bvb $$4, btr $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bvb $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.du());
         }
      }
   }

   public void e(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arx $$0, int $$1, cxg $$2, bvb $$3, MutableFloat $$4) {
      this.a(ddr.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(bac $$0, int $$1, MutableFloat $$2) {
      this.a(ddr.A, $$0, $$1, $$2);
   }

   public void a(kt<dej> $$0, bac $$1, int $$2, MutableFloat $$3) {
      dej $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arx $$0, int $$1, ddp $$2, bvb $$3) {
      a(this.a(ddr.o), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void b(arx $$0, int $$1, ddp $$2, bvb $$3) {
      a(this.a(ddr.r), a($$0, $$1, $$3, $$3.du()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.du()));
   }

   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4, dxo $$5) {
      a(this.a(ddr.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kt<List<ddn<dej>>> $$0, arx $$1, int $$2, cxg $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.H_(), $$4.getValue())));
   }

   private void a(kt<List<ddn<dej>>> $$0, arx $$1, int $$2, cxg $$3, bvb $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.du()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dZ(), $$5.floatValue())));
   }

   private void a(kt<List<ddn<dej>>> $$0, arx $$1, int $$2, cxg $$3, bvb $$4, btr $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dZ(), $$6.floatValue())));
   }

   public static ewi b(arx $$0, int $$1, bvb $$2, btr $$3) {
      ewl $$4 = new ewl.a($$0).a(ezc.a, $$2).a(ezc.k, $$1).a(ezc.f, $$2.du()).a(ezc.c, $$3).b(ezc.d, $$3.d()).b(ezc.e, $$3.c()).a(ezb.t);
      return new ewi.a($$4).a(Optional.empty());
   }

   private static ewi a(arx $$0, int $$1, cxg $$2) {
      ewl $$3 = new ewl.a($$0).a(ezc.i, $$2).a(ezc.k, $$1).a(ezb.u);
      return new ewi.a($$3).a(Optional.empty());
   }

   private static ewi a(arx $$0, int $$1, bvb $$2, boolean $$3) {
      ewl $$4 = new ewl.a($$0).a(ezc.a, $$2).a(ezc.k, $$1).a(ezc.f, $$2.du()).a(ezc.l, $$3).a(ezb.v);
      return new ewi.a($$4).a(Optional.empty());
   }

   private static ewi a(arx $$0, int $$1, bvb $$2, fbr $$3) {
      ewl $$4 = new ewl.a($$0).a(ezc.a, $$2).a(ezc.k, $$1).a(ezc.f, $$3).a(ezb.w);
      return new ewi.a($$4).a(Optional.empty());
   }

   private static ewi a(arx $$0, int $$1, bvb $$2, fbr $$3, dxo $$4) {
      ewl $$5 = new ewl.a($$0).a(ezc.a, $$2).a(ezc.k, $$1).a(ezc.f, $$3).a(ezc.g, $$4).a(ezb.x);
      return new ewi.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<ddn<T>> $$0, ewi $$1, Consumer<T> $$2) {
      for (ddn<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arx $$0, int $$1, ddp $$2, bvx $$3) {
      bvj $$4 = $$2.b();
      if ($$4 != null) {
         Map<ddq, Set<dei>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dei> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.du(), $$1));
            }
         } else {
            Set<dei> $$7 = $$5.get(this);

            for (ddn<dei> $$8 : this.a(ddr.n)) {
               dei $$9 = $$8.a();
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

   public void a(int $$0, ddp $$1, bvx $$2) {
      bvj $$3 = $$1.b();
      if ($$3 != null) {
         Set<dei> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dei $$5 : $$4) {
               $$5.a($$1, $$2, $$2.du(), $$0);
            }
         }
      }
   }

   public static ddq.a a(ddq.c $$0) {
      return new ddq.a($$0);
   }

   public xk f() {
      return this.e;
   }

   public ddq.c g() {
      return this.f;
   }

   public ju<ddq> h() {
      return this.g;
   }

   public kq i() {
      return this.h;
   }

   public static class a {
      private final ddq.c a;
      private ju<ddq> b = ju.a();
      private final Map<kt<?>, List<?>> c = new HashMap<>();
      private final kq.a d = kq.a();

      public a(ddq.c $$0) {
         this.a = $$0;
      }

      public ddq.a a(ju<ddq> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> ddq.a a(kt<List<ddn<E>>> $$0, E $$1, ezr.a $$2) {
         this.b($$0).add(new ddn<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> ddq.a a(kt<List<ddn<E>>> $$0, E $$1) {
         this.b($$0).add(new ddn<>($$1, Optional.empty()));
         return this;
      }

      public <E> ddq.a a(kt<List<ddz<E>>> $$0, ddu $$1, ddu $$2, E $$3, ezr.a $$4) {
         this.b($$0).add(new ddz<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> ddq.a a(kt<List<ddz<E>>> $$0, ddu $$1, ddu $$2, E $$3) {
         this.b($$0).add(new ddz<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public ddq.a a(kt<List<deg>> $$0, deg $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> ddq.a b(kt<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public ddq.a a(kt<bba> $$0) {
         this.d.a($$0, bba.a);
         return this;
      }

      private <E> List<E> b(kt<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public ddq a(alp $$0) {
         return new ddq(xk.c(ae.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<ddq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(ddq.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(ddq.b::b)).apply($$0, ddq.b::new)
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

   public static record c(ju<cxc> b, Optional<ju<cxc>> c, int d, int e, ddq.b f, ddq.b g, int h, List<bvk> i) {
      public static final MapCodec<ddq.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kf.a(mb.K).fieldOf("supported_items").forGetter(ddq.c::a),
                  kf.a(mb.K).optionalFieldOf("primary_items").forGetter(ddq.c::b),
                  azd.a(1, 1024).fieldOf("weight").forGetter(ddq.c::c),
                  azd.a(1, 255).fieldOf("max_level").forGetter(ddq.c::d),
                  ddq.b.a.fieldOf("min_cost").forGetter(ddq.c::e),
                  ddq.b.a.fieldOf("max_cost").forGetter(ddq.c::f),
                  azd.l.fieldOf("anvil_cost").forGetter(ddq.c::g),
                  bvk.l.listOf().fieldOf("slots").forGetter(ddq.c::h)
               )
               .apply($$0, ddq.c::new)
      );

      public ju<cxc> a() {
         return this.b;
      }

      public Optional<ju<cxc>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public ddq.b e() {
         return this.f;
      }

      public ddq.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bvk> h() {
         return this.i;
      }
   }
}
