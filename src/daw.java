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

public record daw(xd e, daw.c f, jr<daw> g, kn h) {
   public static final int a = 255;
   public static final Codec<daw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xf.a.fieldOf("description").forGetter(daw::f),
               daw.c.a.forGetter(daw::g),
               kc.a(lv.aL).optionalFieldOf("exclusive_set", jr.a()).forGetter(daw::h),
               dax.b.optionalFieldOf("effects", kn.a).forGetter(daw::i)
            )
            .apply($$0, daw::new)
   );
   public static final Codec<jn<daw>> c = aky.a(lv.aL);
   public static final zb<wo, jn<daw>> d = yz.b(lv.aL);

   public static daw.b a(int $$0) {
      return new daw.b($$0, 0);
   }

   public static daw.b a(int $$0, int $$1) {
      return new daw.b($$0, $$1);
   }

   public static daw.c a(jr<cvg> $$0, jr<cvg> $$1, int $$2, int $$3, daw.b $$4, daw.b $$5, int $$6, bts... $$7) {
      return new daw.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static daw.c a(jr<cvg> $$0, int $$1, int $$2, daw.b $$3, daw.b $$4, int $$5, bts... $$6) {
      return new daw.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<btr, cvl> a(buf $$0) {
      Map<btr, cvl> $$1 = Maps.newEnumMap(btr.class);

      for (btr $$2 : btr.values()) {
         if (this.a($$2)) {
            cvl $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jr<cvg> a() {
      return this.f.a();
   }

   public boolean a(btr $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cvl $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cvl $$0) {
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

   public static boolean a(jn<daw> $$0, jn<daw> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static xd a(jn<daw> $$0, int $$1) {
      xr $$2 = $$0.a().e.f();
      if ($$0.a(awv.o)) {
         xg.a($$2, ya.a.a(n.m));
      } else {
         xg.a($$2, ya.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(xc.v).b(xd.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cvl $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(kq<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(arg $$0, int $$1, btj $$2, bsb $$3) {
      est $$4 = b($$0, $$1, $$2, $$3);

      for (dat<dbk> $$5 : this.a(dax.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(arg $$0, int $$1, cvl $$2, btj $$3, bsb $$4, MutableFloat $$5) {
      est $$6 = b($$0, $$1, $$3, $$4);

      for (dat<dbp> $$7 : this.a(dax.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dV(), $$5.floatValue()));
         }
      }
   }

   public void a(arg $$0, int $$1, cvl $$2, MutableFloat $$3) {
      this.a(dax.k, $$0, $$1, $$2, $$3);
   }

   public void b(arg $$0, int $$1, cvl $$2, MutableFloat $$3) {
      this.a(dax.p, $$0, $$1, $$2, $$3);
   }

   public void c(arg $$0, int $$1, cvl $$2, MutableFloat $$3) {
      this.a(dax.q, $$0, $$1, $$2, $$3);
   }

   public void d(arg $$0, int $$1, cvl $$2, MutableFloat $$3) {
      this.a(dax.x, $$0, $$1, $$2, $$3);
   }

   public void a(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(arg $$0, int $$1, cvl $$2, MutableFloat $$3) {
      this.a(dax.z, $$0, $$1, $$2, $$3);
   }

   public void b(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azk $$0, int $$1, MutableFloat $$2) {
      this.a(dax.F, $$0, $$1, $$2);
   }

   public void c(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(arg $$0, int $$1, cvl $$2, btj $$3, bsb $$4, MutableFloat $$5) {
      this.a(dax.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(arg $$0, int $$1, cvl $$2, btj $$3, bsb $$4, MutableFloat $$5) {
      this.a(dax.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(arg $$0, int $$1, cvl $$2, btj $$3, bsb $$4, MutableFloat $$5) {
      this.a(dax.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(arg $$0, int $$1, cvl $$2, btj $$3, bsb $$4, MutableFloat $$5) {
      this.a(dax.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(dbf<dbn> $$0, arg $$1, int $$2, dav $$3, btj $$4, bsb $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         btj $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.dq());
         }
      }
   }

   public void a(arg $$0, int $$1, dav $$2, dba $$3, btj $$4, bsb $$5) {
      for (dbf<dbn> $$6 : this.a(dax.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(arg $$0, int $$1, cvl $$2, btj $$3, MutableFloat $$4) {
      this.a(dax.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azk $$0, int $$1, MutableFloat $$2) {
      this.a(dax.A, $$0, $$1, $$2);
   }

   public void a(kq<dbp> $$0, azk $$1, int $$2, MutableFloat $$3) {
      dbp $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(arg $$0, int $$1, dav $$2, btj $$3) {
      a(this.a(dax.o), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void b(arg $$0, int $$1, dav $$2, btj $$3) {
      a(this.a(dax.r), a($$0, $$1, $$3, $$3.dq()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.dq()));
   }

   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4, dua $$5) {
      a(this.a(dax.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kq<List<dat<dbp>>> $$0, arg $$1, int $$2, cvl $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(kq<List<dat<dbp>>> $$0, arg $$1, int $$2, cvl $$3, btj $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.dq()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dV(), $$5.floatValue())));
   }

   private void a(kq<List<dat<dbp>>> $$0, arg $$1, int $$2, cvl $$3, btj $$4, bsb $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dV(), $$6.floatValue())));
   }

   public static est b(arg $$0, int $$1, btj $$2, bsb $$3) {
      esw $$4 = new esw.a($$0).a(evp.a, $$2).a(evp.k, $$1).a(evp.f, $$2.dq()).a(evp.c, $$3).b(evp.d, $$3.d()).b(evp.e, $$3.c()).a(evo.t);
      return new est.a($$4).a(Optional.empty());
   }

   private static est a(arg $$0, int $$1, cvl $$2) {
      esw $$3 = new esw.a($$0).a(evp.i, $$2).a(evp.k, $$1).a(evo.u);
      return new est.a($$3).a(Optional.empty());
   }

   private static est a(arg $$0, int $$1, btj $$2, boolean $$3) {
      esw $$4 = new esw.a($$0).a(evp.a, $$2).a(evp.k, $$1).a(evp.f, $$2.dq()).a(evp.l, $$3).a(evo.v);
      return new est.a($$4).a(Optional.empty());
   }

   private static est a(arg $$0, int $$1, btj $$2, eye $$3) {
      esw $$4 = new esw.a($$0).a(evp.a, $$2).a(evp.k, $$1).a(evp.f, $$3).a(evo.w);
      return new est.a($$4).a(Optional.empty());
   }

   private static est a(arg $$0, int $$1, btj $$2, eye $$3, dua $$4) {
      esw $$5 = new esw.a($$0).a(evp.a, $$2).a(evp.k, $$1).a(evp.f, $$3).a(evp.g, $$4).a(evo.x);
      return new est.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<dat<T>> $$0, est $$1, Consumer<T> $$2) {
      for (dat<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(arg $$0, int $$1, dav $$2, buf $$3) {
      btr $$4 = $$2.b();
      if ($$4 != null) {
         Map<daw, Set<dbo>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dbo> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.dq(), $$1));
            }
         } else {
            Set<dbo> $$7 = $$5.get(this);

            for (dat<dbo> $$8 : this.a(dax.n)) {
               dbo $$9 = $$8.a();
               boolean $$10 = $$7 != null && $$7.contains($$9);
               if ($$8.a(a($$0, $$1, $$3, $$10))) {
                  if (!$$10) {
                     if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, $$7);
                     }

                     $$7.add($$9);
                  }

                  $$9.a($$0, $$1, $$2, $$3, $$3.dq(), !$$10);
               } else if ($$7 != null && $$7.remove($$9)) {
                  $$9.a($$2, $$3, $$3.dq(), $$1);
               }
            }

            if ($$7 != null && $$7.isEmpty()) {
               $$5.remove(this);
            }
         }
      }
   }

   public void a(int $$0, dav $$1, buf $$2) {
      btr $$3 = $$1.b();
      if ($$3 != null) {
         Set<dbo> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dbo $$5 : $$4) {
               $$5.a($$1, $$2, $$2.dq(), $$0);
            }
         }
      }
   }

   public static daw.a a(daw.c $$0) {
      return new daw.a($$0);
   }

   public xd f() {
      return this.e;
   }

   public daw.c g() {
      return this.f;
   }

   public jr<daw> h() {
      return this.g;
   }

   public kn i() {
      return this.h;
   }

   public static class a {
      private final daw.c a;
      private jr<daw> b = jr.a();
      private final Map<kq<?>, List<?>> c = new HashMap<>();
      private final kn.a d = kn.a();

      public a(daw.c $$0) {
         this.a = $$0;
      }

      public daw.a a(jr<daw> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> daw.a a(kq<List<dat<E>>> $$0, E $$1, ewe.a $$2) {
         this.b($$0).add(new dat<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> daw.a a(kq<List<dat<E>>> $$0, E $$1) {
         this.b($$0).add(new dat<>($$1, Optional.empty()));
         return this;
      }

      public <E> daw.a a(kq<List<dbf<E>>> $$0, dba $$1, dba $$2, E $$3, ewe.a $$4) {
         this.b($$0).add(new dbf<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> daw.a a(kq<List<dbf<E>>> $$0, dba $$1, dba $$2, E $$3) {
         this.b($$0).add(new dbf<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public daw.a a(kq<List<dbm>> $$0, dbm $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> daw.a b(kq<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public daw.a a(kq<bah> $$0) {
         this.d.a($$0, bah.a);
         return this;
      }

      private <E> List<E> b(kq<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public daw a(alb $$0) {
         return new daw(xd.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<daw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(daw.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(daw.b::b)).apply($$0, daw.b::new)
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

   public static record c(jr<cvg> b, Optional<jr<cvg>> c, int d, int e, daw.b f, daw.b g, int h, List<bts> i) {
      public static final MapCodec<daw.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kc.a(lv.K).fieldOf("supported_items").forGetter(daw.c::a),
                  kc.a(lv.K).optionalFieldOf("primary_items").forGetter(daw.c::b),
                  ayl.a(1, 1024).fieldOf("weight").forGetter(daw.c::c),
                  ayl.a(1, 255).fieldOf("max_level").forGetter(daw.c::d),
                  daw.b.a.fieldOf("min_cost").forGetter(daw.c::e),
                  daw.b.a.fieldOf("max_cost").forGetter(daw.c::f),
                  ayl.k.fieldOf("anvil_cost").forGetter(daw.c::g),
                  bts.l.listOf().fieldOf("slots").forGetter(daw.c::h)
               )
               .apply($$0, daw.c::new)
      );

      public jr<cvg> a() {
         return this.b;
      }

      public Optional<jr<cvg>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public daw.b e() {
         return this.f;
      }

      public daw.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bts> h() {
         return this.i;
      }
   }
}
