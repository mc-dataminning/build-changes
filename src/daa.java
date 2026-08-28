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

public record daa(wy e, daa.c f, jq<daa> g, km h) {
   public static final int a = 255;
   public static final Codec<daa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(daa::f),
               daa.c.a.forGetter(daa::g),
               kb.a(lu.aL).optionalFieldOf("exclusive_set", jq.a()).forGetter(daa::h),
               dab.b.optionalFieldOf("effects", km.a).forGetter(daa::i)
            )
            .apply($$0, daa::new)
   );
   public static final Codec<jm<daa>> c = akn.a(lu.aL);
   public static final yw<wj, jm<daa>> d = yu.b(lu.aL);

   public static daa.b a(int $$0) {
      return new daa.b($$0, 0);
   }

   public static daa.b a(int $$0, int $$1) {
      return new daa.b($$0, $$1);
   }

   public static daa.c a(jq<cuj> $$0, jq<cuj> $$1, int $$2, int $$3, daa.b $$4, daa.b $$5, int $$6, bsy... $$7) {
      return new daa.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static daa.c a(jq<cuj> $$0, int $$1, int $$2, daa.b $$3, daa.b $$4, int $$5, bsy... $$6) {
      return new daa.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bsx, cuo> a(btl $$0) {
      Map<bsx, cuo> $$1 = Maps.newEnumMap(bsx.class);

      for (bsx $$2 : bsx.values()) {
         if (this.a($$2)) {
            cuo $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jq<cuj> a() {
      return this.f.a();
   }

   public boolean a(bsx $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cuo $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cuo $$0) {
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

   public static boolean a(jm<daa> $$0, jm<daa> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wy a(jm<daa> $$0, int $$1) {
      xm $$2 = $$0.a().e.f();
      if ($$0.a(awg.o)) {
         xb.a($$2, xv.a.a(n.m));
      } else {
         xb.a($$2, xv.a.a(n.h));
      }

      if ($$1 != 1 || $$0.a().e() != 1) {
         $$2.b(wx.v).b(wy.c("enchantment.level." + $$1));
      }

      return $$2;
   }

   public boolean c(cuo $$0) {
      return this.f.a().a($$0.h());
   }

   public <T> List<T> a(kp<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(aqt $$0, int $$1, bsq $$2, brj $$3) {
      erl $$4 = b($$0, $$1, $$2, $$3);

      for (czy<dan> $$5 : this.a(dab.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(aqt $$0, int $$1, cuo $$2, bsq $$3, brj $$4, MutableFloat $$5) {
      erl $$6 = b($$0, $$1, $$3, $$4);

      for (czy<das> $$7 : this.a(dab.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dT(), $$5.floatValue()));
         }
      }
   }

   public void a(aqt $$0, int $$1, cuo $$2, MutableFloat $$3) {
      this.a(dab.k, $$0, $$1, $$2, $$3);
   }

   public void b(aqt $$0, int $$1, cuo $$2, MutableFloat $$3) {
      this.a(dab.p, $$0, $$1, $$2, $$3);
   }

   public void c(aqt $$0, int $$1, cuo $$2, MutableFloat $$3) {
      this.a(dab.q, $$0, $$1, $$2, $$3);
   }

   public void d(aqt $$0, int $$1, cuo $$2, MutableFloat $$3) {
      this.a(dab.x, $$0, $$1, $$2, $$3);
   }

   public void a(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(aqt $$0, int $$1, cuo $$2, MutableFloat $$3) {
      this.a(dab.z, $$0, $$1, $$2, $$3);
   }

   public void b(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(ayv $$0, int $$1, MutableFloat $$2) {
      this.a(dab.F, $$0, $$1, $$2);
   }

   public void c(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(aqt $$0, int $$1, cuo $$2, bsq $$3, brj $$4, MutableFloat $$5) {
      this.a(dab.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(aqt $$0, int $$1, cuo $$2, bsq $$3, brj $$4, MutableFloat $$5) {
      this.a(dab.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(aqt $$0, int $$1, cuo $$2, bsq $$3, brj $$4, MutableFloat $$5) {
      this.a(dab.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(aqt $$0, int $$1, cuo $$2, bsq $$3, brj $$4, MutableFloat $$5) {
      this.a(dab.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void a(dai<daq> $$0, aqt $$1, int $$2, czz $$3, bsq $$4, brj $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bsq $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.do());
         }
      }
   }

   public void a(aqt $$0, int $$1, czz $$2, dae $$3, bsq $$4, brj $$5) {
      for (dai<daq> $$6 : this.a(dab.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public void e(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(aqt $$0, int $$1, cuo $$2, bsq $$3, MutableFloat $$4) {
      this.a(dab.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ayv $$0, int $$1, MutableFloat $$2) {
      this.a(dab.A, $$0, $$1, $$2);
   }

   public void a(kp<das> $$0, ayv $$1, int $$2, MutableFloat $$3) {
      das $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(aqt $$0, int $$1, czz $$2, bsq $$3) {
      a(this.a(dab.o), a($$0, $$1, $$3, $$3.do()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.do()));
   }

   public void b(aqt $$0, int $$1, czz $$2, bsq $$3) {
      a(this.a(dab.r), a($$0, $$1, $$3, $$3.do()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.do()));
   }

   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4, dta $$5) {
      a(this.a(dab.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(kp<List<czy<das>>> $$0, aqt $$1, int $$2, cuo $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.E_(), $$4.getValue())));
   }

   private void a(kp<List<czy<das>>> $$0, aqt $$1, int $$2, cuo $$3, bsq $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.do()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dT(), $$5.floatValue())));
   }

   private void a(kp<List<czy<das>>> $$0, aqt $$1, int $$2, cuo $$3, bsq $$4, brj $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dT(), $$6.floatValue())));
   }

   public static erl b(aqt $$0, int $$1, bsq $$2, brj $$3) {
      ero $$4 = new ero.a($$0).a(euh.a, $$2).a(euh.k, $$1).a(euh.f, $$2.do()).a(euh.c, $$3).b(euh.d, $$3.d()).b(euh.e, $$3.c()).a(eug.t);
      return new erl.a($$4).a(Optional.empty());
   }

   private static erl a(aqt $$0, int $$1, cuo $$2) {
      ero $$3 = new ero.a($$0).a(euh.i, $$2).a(euh.k, $$1).a(eug.u);
      return new erl.a($$3).a(Optional.empty());
   }

   private static erl a(aqt $$0, int $$1, bsq $$2, boolean $$3) {
      ero $$4 = new ero.a($$0).a(euh.a, $$2).a(euh.k, $$1).a(euh.f, $$2.do()).a(euh.l, $$3).a(eug.v);
      return new erl.a($$4).a(Optional.empty());
   }

   private static erl a(aqt $$0, int $$1, bsq $$2, eww $$3) {
      ero $$4 = new ero.a($$0).a(euh.a, $$2).a(euh.k, $$1).a(euh.f, $$3).a(eug.w);
      return new erl.a($$4).a(Optional.empty());
   }

   private static erl a(aqt $$0, int $$1, bsq $$2, eww $$3, dta $$4) {
      ero $$5 = new ero.a($$0).a(euh.a, $$2).a(euh.k, $$1).a(euh.f, $$3).a(euh.g, $$4).a(eug.x);
      return new erl.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<czy<T>> $$0, erl $$1, Consumer<T> $$2) {
      for (czy<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(aqt $$0, int $$1, czz $$2, btl $$3) {
      if ($$2.b() != null && !this.a($$2.b())) {
         Set<dar> $$4 = $$3.eH().remove(this);
         if ($$4 != null) {
            $$4.forEach($$3x -> $$3x.a($$2, $$3, $$3.do(), $$1));
         }
      } else {
         Set<dar> $$5 = $$3.eH().get(this);

         for (czy<dar> $$6 : this.a(dab.n)) {
            dar $$7 = $$6.a();
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

   public void a(int $$0, czz $$1, btl $$2) {
      Set<dar> $$3 = $$2.eH().remove(this);
      if ($$3 != null) {
         for (dar $$4 : $$3) {
            $$4.a($$1, $$2, $$2.do(), $$0);
         }
      }
   }

   public static daa.a a(daa.c $$0) {
      return new daa.a($$0);
   }

   public wy f() {
      return this.e;
   }

   public daa.c g() {
      return this.f;
   }

   public jq<daa> h() {
      return this.g;
   }

   public km i() {
      return this.h;
   }

   public static class a {
      private final daa.c a;
      private jq<daa> b = jq.a();
      private final Map<kp<?>, List<?>> c = new HashMap<>();
      private final km.a d = km.a();

      public a(daa.c $$0) {
         this.a = $$0;
      }

      public daa.a a(jq<daa> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> daa.a a(kp<List<czy<E>>> $$0, E $$1, euw.a $$2) {
         this.b($$0).add(new czy<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> daa.a a(kp<List<czy<E>>> $$0, E $$1) {
         this.b($$0).add(new czy<>($$1, Optional.empty()));
         return this;
      }

      public <E> daa.a a(kp<List<dai<E>>> $$0, dae $$1, dae $$2, E $$3, euw.a $$4) {
         this.b($$0).add(new dai<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> daa.a a(kp<List<dai<E>>> $$0, dae $$1, dae $$2, E $$3) {
         this.b($$0).add(new dai<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public daa.a a(kp<List<dap>> $$0, dap $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> daa.a b(kp<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public daa.a a(kp<azr> $$0) {
         this.d.a($$0, azr.a);
         return this;
      }

      private <E> List<E> b(kp<List<E>> $$0) {
         return (List<E>)this.c.computeIfAbsent($$0, $$1 -> {
            ArrayList<E> $$2 = new ArrayList<>();
            this.d.a($$0, $$2);
            return $$2;
         });
      }

      public daa a(akq $$0) {
         return new daa(wy.c(ad.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<daa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(daa.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(daa.b::b)).apply($$0, daa.b::new)
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

   public static record c(jq<cuj> b, Optional<jq<cuj>> c, int d, int e, daa.b f, daa.b g, int h, List<bsy> i) {
      public static final MapCodec<daa.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kb.a(lu.K).fieldOf("supported_items").forGetter(daa.c::a),
                  kb.a(lu.K).optionalFieldOf("primary_items").forGetter(daa.c::b),
                  axv.a(1, 1024).fieldOf("weight").forGetter(daa.c::c),
                  axv.a(1, 255).fieldOf("max_level").forGetter(daa.c::d),
                  daa.b.a.fieldOf("min_cost").forGetter(daa.c::e),
                  daa.b.a.fieldOf("max_cost").forGetter(daa.c::f),
                  axv.k.fieldOf("anvil_cost").forGetter(daa.c::g),
                  bsy.l.listOf().fieldOf("slots").forGetter(daa.c::h)
               )
               .apply($$0, daa.c::new)
      );

      public jq<cuj> a() {
         return this.b;
      }

      public Optional<jq<cuj>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public daa.b e() {
         return this.f;
      }

      public daa.b f() {
         return this.g;
      }

      public int g() {
         return this.h;
      }

      public List<bsy> h() {
         return this.i;
      }
   }
}
