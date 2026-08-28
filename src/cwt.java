import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cwt {
   public static final Codec<cwt> a = ays.c(ay.a, ays.b(ay.a.listOf())).xmap(cwt::new, $$0 -> $$0.f);
   public static final yu<wh, cwt> b = yu.a(ay.b.a(ys.a()), $$0 -> $$0.f, cwt::new);
   public static final ww c = ww.c("item.canBreak").a(n.h);
   public static final ww d = ww.c("item.canPlace").a(n.h);
   private static final ww e = ww.c("item.canUse.unknown").a(n.h);
   private final List<ay> f;
   @Nullable
   private List<ww> g;
   @Nullable
   private dzs h;
   private boolean i;
   private boolean j;

   public cwt(List<ay> $$0) {
      this.f = $$0;
   }

   private static boolean a(dzs $$0, @Nullable dzs $$1, boolean $$2) {
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

   public boolean a(dzs $$0) {
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

   private List<ww> a() {
      if (this.g == null) {
         this.g = a(this.f);
      }

      return this.g;
   }

   public void a(Consumer<ww> $$0) {
      this.a().forEach($$0);
   }

   private static List<ww> a(List<ay> $$0) {
      for (ay $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(e);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dlu)$$0x.a()).f().a(n.i)).toList();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof cwt $$1 ? this.f.equals($$1.f) : false;
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
