import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cyl {
   public static final Codec<cyl> a = azg.c(az.a, azg.b(az.a.listOf())).xmap(cyl::new, $$0 -> $$0.f);
   public static final ze<wp, cyl> b = ze.a(az.b.a(zc.a()), $$0 -> $$0.f, cyl::new);
   public static final xg c = xg.c("item.canBreak").a(o.h);
   public static final xg d = xg.c("item.canPlace").a(o.h);
   private static final xg e = xg.c("item.canUse.unknown").a(o.h);
   private final List<az> f;
   @Nullable
   private List<xg> g;
   @Nullable
   private ebu h;
   private boolean i;
   private boolean j;

   public cyl(List<az> $$0) {
      this.f = $$0;
   }

   private static boolean a(ebu $$0, @Nullable ebu $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         ju $$3 = $$0.c().J_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(ebu $$0) {
      if (a($$0, this.h, this.j)) {
         return this.i;
      } else {
         this.h = $$0;
         this.j = false;

         for (az $$1 : this.f) {
            if ($$1.a($$0)) {
               this.j = this.j | $$1.a();
               this.i = true;
               return true;
            }
         }

         this.i = false;
         return false;
      }
   }

   private List<xg> a() {
      if (this.g == null) {
         this.g = a(this.f);
      }

      return this.g;
   }

   public void a(Consumer<xg> $$0) {
      this.a().forEach($$0);
   }

   private static List<xg> a(List<az> $$0) {
      for (az $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(e);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dno)$$0x.a()).f().a(o.i)).toList();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof cyl $$1 ? this.f.equals($$1.f) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.f.hashCode();
   }

   @Override
   public String toString() {
      return "AdventureModePredicate{predicates=" + this.f + "}";
   }
}
