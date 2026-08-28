import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cxe {
   public static final Codec<cxe> a = ayu.c(ay.a, ayu.b(ay.a.listOf())).xmap(cxe::new, $$0 -> $$0.f);
   public static final yw<wj, cxe> b = yw.a(ay.b.a(yu.a()), $$0 -> $$0.f, cxe::new);
   public static final wy c = wy.c("item.canBreak").a(n.h);
   public static final wy d = wy.c("item.canPlace").a(n.h);
   private static final wy e = wy.c("item.canUse.unknown").a(n.h);
   private final List<ay> f;
   @Nullable
   private List<wy> g;
   @Nullable
   private eal h;
   private boolean i;
   private boolean j;

   public cxe(List<ay> $$0) {
      this.f = $$0;
   }

   private static boolean a(eal $$0, @Nullable eal $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         js $$3 = $$0.c().F_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(eal $$0) {
      if (a($$0, this.h, this.j)) {
         return this.i;
      } else {
         this.h = $$0;
         this.j = false;

         for (ay $$1 : this.f) {
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

   private List<wy> a() {
      if (this.g == null) {
         this.g = a(this.f);
      }

      return this.g;
   }

   public void a(Consumer<wy> $$0) {
      this.a().forEach($$0);
   }

   private static List<wy> a(List<ay> $$0) {
      for (ay $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(e);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dmf)$$0x.a()).f().a(n.i)).toList();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof cxe $$1 ? this.f.equals($$1.f) : false;
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
