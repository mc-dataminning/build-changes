import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cub {
   private static final Codec<cub> e = ax.a.flatComapMap($$0 -> new cub(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cub> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.a(ax.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cub::a)
            )
            .apply($$0, cub::new)
   );
   public static final Codec<cub> a = Codec.withAlternative(f, e);
   public static final zj<ww, cub> b = zj.a(ax.b.a(zh.a()), $$0 -> $$0.h, zh.b, cub::a, cub::new);
   public static final xl c = xl.c("item.canBreak").a(n.h);
   public static final xl d = xl.c("item.canPlace").a(n.h);
   private static final xl g = xl.c("item.canUse.unknown").a(n.h);
   private final List<ax> h;
   private final boolean i;
   private final List<xl> j;
   @Nullable
   private dvs k;
   private boolean l;
   private boolean m;

   private cub(List<ax> $$0, boolean $$1, List<xl> $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public cub(List<ax> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(dvs $$0, @Nullable dvs $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         ke $$3 = $$0.c().H_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dvs $$0) {
      if (a($$0, this.k, this.m)) {
         return this.l;
      } else {
         this.k = $$0;
         this.m = false;

         for (ax $$1 : this.h) {
            if ($$1.a($$0)) {
               this.m = this.m | $$1.a();
               this.l = true;
               return true;
            }
         }

         this.l = false;
         return false;
      }
   }

   public void a(Consumer<xl> $$0) {
      this.j.forEach($$0);
   }

   public cub a(boolean $$0) {
      return new cub(this.h, $$0, this.j);
   }

   private static List<xl> a(List<ax> $$0) {
      for (ax $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dij)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cub $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
      }
   }

   @Override
   public int hashCode() {
      return this.h.hashCode() * 31 + (this.i ? 1 : 0);
   }

   @Override
   public String toString() {
      return "AdventureModePredicate{predicates=" + this.h + ", showInTooltip=" + this.i + "}";
   }
}
