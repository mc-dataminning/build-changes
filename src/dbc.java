import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public final class dbc implements dcd {
   public static final dbc a = new dbc(List.of());
   public static final Codec<dbc> b = cyy.b.listOf().xmap(dbc::new, $$0 -> $$0.d);
   public static final yw<wj, dbc> c = cyy.i.a(yu.a()).a(dbc::new, $$0 -> $$0.d);
   private final List<cyy> d;

   private dbc(List<cyy> $$0) {
      this.d = $$0;
   }

   public static dbc a(cyy $$0) {
      return new dbc(List.of($$0.v()));
   }

   public static dbc a(List<cyy> $$0) {
      return new dbc(List.copyOf(Lists.transform($$0, cyy::v)));
   }

   public boolean a(cyu $$0) {
      for (cyy $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public List<cyy> a() {
      return Lists.transform(this.d, cyy::v);
   }

   public boolean b() {
      return this.d.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbc $$1 && cyy.a(this.d, $$1.d)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cyy.a(this.d);
   }

   @Override
   public String toString() {
      return "ChargedProjectiles[items=" + this.d + "]";
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      for (cyy $$4 : this.d) {
         $$1.accept(wy.c("item.minecraft.crossbow.projectile").b(wx.v).b($$4.K()));
         dcc $$5 = $$4.a(kj.q, dcc.c);
         $$4.a($$0, $$5, null, dan.a, $$1x -> $$1.accept(wy.b("  ").b($$1x).a(n.h)));
      }
   }
}
