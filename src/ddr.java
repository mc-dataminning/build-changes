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

public record ddr(wp e, ddr.c f, jv<ddr> g, kr h) {
   public static final int a = 255;
   public static final Codec<ddr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wr.a.fieldOf("description").forGetter(ddr::f),
               ddr.c.a.forGetter(ddr::g),
               kg.a(mc.aP).optionalFieldOf("exclusive_set", jv.a()).forGetter(ddr::h),
               dds.b.optionalFieldOf("effects", kr.a).forGetter(ddr::i)
            )
            .apply($$0, ddr::new)
   );
   public static final Codec<jr<ddr>> c = akr.a(mc.aP);
   public static final yn<wa, jr<ddr>> d = yl.b(mc.aP);

   public static ddr.b a(int $$0) {
      return new ddr.b($$0, 0);
   }

   public static ddr.b a(int $$0, int $$1) {
      return new ddr.b($$0, $$1);
   }

   public static ddr.c a(jv<cxd> $$0, jv<cxd> $$1, int $$2, int $$3, ddr.b $$4, ddr.b $$5, int $$6, bvk... $$7) {
      return new ddr.c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
   }

   public static ddr.c a(jv<cxd> $$0, int $$1, int $$2, ddr.b $$3, ddr.b $$4, int $$5, bvk... $$6) {
      return new ddr.c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
   }

   public Map<bvj, cxh> a(bvy $$0) {
      Map<bvj, cxh> $$1 = Maps.newEnumMap(bvj.class);

      for (bvj $$2 : bvj.i) {
         if (this.a($$2)) {
            cxh $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1.put($$2, $$3);
            }
         }
      }

      return $$1;
   }

   public jv<cxd> a() {
      return this.f.a();
   }

   public boolean a(bvj $$0) {
      return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
   }

   public boolean a(cxh $$0) {
      return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
   }

   public boolean b(cxh $$0) {
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

   public static boolean a(jr<ddr> $$0, jr<ddr> $$1) {
      return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
   }

   public static wp a(jr<ddr> $$0, int $$1) {
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

   public boolean c(cxh $$0) {
      return this.f.a().a($$0.i());
   }

   public <T> List<T> a(ku<List<T>> $$0) {
      return this.h.a($$0, List.of());
   }

   public boolean a(ard $$0, int $$1, bva $$2, btp $$3) {
      ewo $$4 = b($$0, $$1, $$2, $$3);

      for (ddo<deg> $$5 : this.a(dds.d)) {
         if ($$5.a($$4)) {
            return true;
         }
      }

      return false;
   }

   public void a(ard $$0, int $$1, cxh $$2, bva $$3, btp $$4, MutableFloat $$5) {
      ewo $$6 = b($$0, $$1, $$3, $$4);

      for (ddo<dek> $$7 : this.a(dds.c)) {
         if ($$7.a($$6)) {
            $$5.setValue($$7.a().a($$1, $$3.dX(), $$5.floatValue()));
         }
      }
   }

   public void a(ard $$0, int $$1, cxh $$2, MutableFloat $$3) {
      this.a(dds.k, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cxh $$2, MutableFloat $$3) {
      this.a(dds.p, $$0, $$1, $$2, $$3);
   }

   public void c(ard $$0, int $$1, cxh $$2, MutableFloat $$3) {
      this.a(dds.q, $$0, $$1, $$2, $$3);
   }

   public void d(ard $$0, int $$1, cxh $$2, MutableFloat $$3) {
      this.a(dds.x, $$0, $$1, $$2, $$3);
   }

   public void a(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.y, $$0, $$1, $$2, $$3, $$4);
   }

   public void e(ard $$0, int $$1, cxh $$2, MutableFloat $$3) {
      this.a(dds.z, $$0, $$1, $$2, $$3);
   }

   public void b(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.u, $$0, $$1, $$2, $$3, $$4);
   }

   public void a(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dds.F, $$0, $$1, $$2);
   }

   public void c(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.v, $$0, $$1, $$2, $$3, $$4);
   }

   public void d(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.w, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(ard $$0, int $$1, cxh $$2, bva $$3, btp $$4, MutableFloat $$5) {
      this.a(dds.e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void c(ard $$0, int $$1, cxh $$2, bva $$3, btp $$4, MutableFloat $$5) {
      this.a(dds.f, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void d(ard $$0, int $$1, cxh $$2, bva $$3, btp $$4, MutableFloat $$5) {
      this.a(dds.g, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void e(ard $$0, int $$1, cxh $$2, bva $$3, btp $$4, MutableFloat $$5) {
      this.a(dds.h, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   public void a(ard $$0, int $$1, ddq $$2, ddv $$3, bva $$4, btp $$5) {
      for (dea<dei> $$6 : this.a(dds.i)) {
         if ($$3 == $$6.a()) {
            a($$6, $$0, $$1, $$2, $$4, $$5);
         }
      }
   }

   public static void a(dea<dei> $$0, ard $$1, int $$2, ddq $$3, bva $$4, btp $$5) {
      if ($$0.a(b($$1, $$2, $$4, $$5))) {
         bva $$6 = switch ($$0.b()) {
            case a -> $$5.d();
            case b -> $$5.c();
            case c -> $$4;
         };
         if ($$6 != null) {
            $$0.c().a($$1, $$2, $$3, $$6, $$6.ds());
         }
      }
   }

   public void e(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.t, $$0, $$1, $$2, $$3, $$4);
   }

   public void f(ard $$0, int $$1, cxh $$2, bva $$3, MutableFloat $$4) {
      this.a(dds.s, $$0, $$1, $$2, $$3, $$4);
   }

   public void b(azh $$0, int $$1, MutableFloat $$2) {
      this.a(dds.A, $$0, $$1, $$2);
   }

   public void a(ku<dek> $$0, azh $$1, int $$2, MutableFloat $$3) {
      dek $$4 = this.h.a($$0);
      if ($$4 != null) {
         $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
      }
   }

   public void a(ard $$0, int $$1, ddq $$2, bva $$3) {
      a(this.a(dds.o), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void b(ard $$0, int $$1, ddq $$2, bva $$3) {
      a(this.a(dds.r), a($$0, $$1, $$3, $$3.ds()), $$4 -> $$4.a($$0, $$1, $$2, $$3, $$3.ds()));
   }

   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4, dxq $$5) {
      a(this.a(dds.j), a($$0, $$1, $$3, $$4, $$5), $$5x -> $$5x.a($$0, $$1, $$2, $$3, $$4));
   }

   private void a(ku<List<ddo<dek>>> $$0, ard $$1, int $$2, cxh $$3, MutableFloat $$4) {
      a(this.a($$0), a($$1, $$2, $$3), $$3x -> $$4.setValue($$3x.a($$2, $$1.C_(), $$4.getValue())));
   }

   private void a(ku<List<ddo<dek>>> $$0, ard $$1, int $$2, cxh $$3, bva $$4, MutableFloat $$5) {
      a(this.a($$0), a($$1, $$2, $$4, $$4.ds()), $$3x -> $$5.setValue($$3x.a($$2, $$4.dX(), $$5.floatValue())));
   }

   private void a(ku<List<ddo<dek>>> $$0, ard $$1, int $$2, cxh $$3, bva $$4, btp $$5, MutableFloat $$6) {
      a(this.a($$0), b($$1, $$2, $$4, $$5), $$3x -> $$6.setValue($$3x.a($$2, $$4.dX(), $$6.floatValue())));
   }

   public static ewo b(ard $$0, int $$1, bva $$2, btp $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$2.ds()).a(ezi.c, $$3).b(ezi.d, $$3.d()).b(ezi.e, $$3.c()).a(ezh.t);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ard $$0, int $$1, cxh $$2) {
      ewr $$3 = new ewr.a($$0).a(ezi.i, $$2).a(ezi.k, $$1).a(ezh.u);
      return new ewo.a($$3).a(Optional.empty());
   }

   private static ewo a(ard $$0, int $$1, bva $$2, boolean $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$2.ds()).a(ezi.l, $$3).a(ezh.v);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ard $$0, int $$1, bva $$2, fbx $$3) {
      ewr $$4 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$3).a(ezh.w);
      return new ewo.a($$4).a(Optional.empty());
   }

   private static ewo a(ard $$0, int $$1, bva $$2, fbx $$3, dxq $$4) {
      ewr $$5 = new ewr.a($$0).a(ezi.a, $$2).a(ezi.k, $$1).a(ezi.f, $$3).a(ezi.g, $$4).a(ezh.x);
      return new ewo.a($$5).a(Optional.empty());
   }

   private static <T> void a(List<ddo<T>> $$0, ewo $$1, Consumer<T> $$2) {
      for (ddo<T> $$3 : $$0) {
         if ($$3.a($$1)) {
            $$2.accept($$3.a());
         }
      }
   }

   public void a(ard $$0, int $$1, ddq $$2, bvy $$3) {
      bvj $$4 = $$2.b();
      if ($$4 != null) {
         Map<ddr, Set<dej>> $$5 = $$3.c($$4);
         if (!this.a($$4)) {
            Set<dej> $$6 = $$5.remove(this);
            if ($$6 != null) {
               $$6.forEach($$3x -> $$3x.a($$2, $$3, $$3.ds(), $$1));
            }
         } else {
            Set<dej> $$7 = $$5.get(this);

            for (ddo<dej> $$8 : this.a(dds.n)) {
               dej $$9 = $$8.a();
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

   public void a(int $$0, ddq $$1, bvy $$2) {
      bvj $$3 = $$1.b();
      if ($$3 != null) {
         Set<dej> $$4 = $$2.c($$3).remove(this);
         if ($$4 != null) {
            for (dej $$5 : $$4) {
               $$5.a($$1, $$2, $$2.ds(), $$0);
            }
         }
      }
   }

   public static ddr.a a(ddr.c $$0) {
      return new ddr.a($$0);
   }

   public wp f() {
      return this.e;
   }

   public ddr.c g() {
      return this.f;
   }

   public jv<ddr> h() {
      return this.g;
   }

   public kr i() {
      return this.h;
   }

   public static class a {
      private final ddr.c a;
      private jv<ddr> b = jv.a();
      private final Map<ku<?>, List<?>> c = new HashMap<>();
      private final kr.a d = kr.a();

      public a(ddr.c $$0) {
         this.a = $$0;
      }

      public ddr.a a(jv<ddr> $$0) {
         this.b = $$0;
         return this;
      }

      public <E> ddr.a a(ku<List<ddo<E>>> $$0, E $$1, ezx.a $$2) {
         this.b($$0).add(new ddo<>($$1, Optional.of($$2.build())));
         return this;
      }

      public <E> ddr.a a(ku<List<ddo<E>>> $$0, E $$1) {
         this.b($$0).add(new ddo<>($$1, Optional.empty()));
         return this;
      }

      public <E> ddr.a a(ku<List<dea<E>>> $$0, ddv $$1, ddv $$2, E $$3, ezx.a $$4) {
         this.b($$0).add(new dea<>($$1, $$2, $$3, Optional.of($$4.build())));
         return this;
      }

      public <E> ddr.a a(ku<List<dea<E>>> $$0, ddv $$1, ddv $$2, E $$3) {
         this.b($$0).add(new dea<>($$1, $$2, $$3, Optional.empty()));
         return this;
      }

      public ddr.a a(ku<List<deh>> $$0, deh $$1) {
         this.b($$0).add($$1);
         return this;
      }

      public <E> ddr.a b(ku<E> $$0, E $$1) {
         this.d.a($$0, $$1);
         return this;
      }

      public ddr.a a(ku<baf> $$0) {
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

      public ddr a(aku $$0) {
         return new ddr(wp.c(af.a("enchantment", $$0)), this.a, this.b, this.d.a());
      }
   }

   public static record b(int b, int c) {
      public static final Codec<ddr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.INT.fieldOf("base").forGetter(ddr.b::a), Codec.INT.fieldOf("per_level_above_first").forGetter(ddr.b::b)).apply($$0, ddr.b::new)
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

   public static record c(jv<cxd> b, Optional<jv<cxd>> c, int d, int e, ddr.b f, ddr.b g, int h, List<bvk> i) {
      public static final MapCodec<ddr.c> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  kg.a(mc.K).fieldOf("supported_items").forGetter(ddr.c::a),
                  kg.a(mc.K).optionalFieldOf("primary_items").forGetter(ddr.c::b),
                  ayi.a(1, 1024).fieldOf("weight").forGetter(ddr.c::c),
                  ayi.a(1, 255).fieldOf("max_level").forGetter(ddr.c::d),
                  ddr.b.a.fieldOf("min_cost").forGetter(ddr.c::e),
                  ddr.b.a.fieldOf("max_cost").forGetter(ddr.c::f),
                  ayi.l.fieldOf("anvil_cost").forGetter(ddr.c::g),
                  bvk.l.listOf().fieldOf("slots").forGetter(ddr.c::h)
               )
               .apply($$0, ddr.c::new)
      );

      public jv<cxd> a() {
         return this.b;
      }

      public Optional<jv<cxd>> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public ddr.b e() {
         return this.f;
      }

      public ddr.b f() {
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
