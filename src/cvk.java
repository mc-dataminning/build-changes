import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cvk {
   private static final Codec<cvk> e = ax.a.flatComapMap($$0 -> new cvk(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cvk> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.a(ax.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cvk::a)
            )
            .apply($$0, cvk::new)
   );
   public static final Codec<cvk> a = Codec.withAlternative(f, e);
   public static final zt<xg, cvk> b = zt.a(ax.b.a(zr.a()), $$0 -> $$0.h, zr.b, cvk::a, cvk::new);
   public static final xv c = xv.c("item.canBreak").a(n.h);
   public static final xv d = xv.c("item.canPlace").a(n.h);
   private static final xv g = xv.c("item.canUse.unknown").a(n.h);
   private final List<ax> h;
   private final boolean i;
   private final List<xv> j;
   @Nullable
   private dxy k;
   private boolean l;
   private boolean m;

   private cvk(List<ax> $$0, boolean $$1, List<xv> $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public cvk(List<ax> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(dxy $$0, @Nullable dxy $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         ke $$3 = $$0.c().K_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dxy $$0) {
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

   public void a(Consumer<xv> $$0) {
      this.j.forEach($$0);
   }

   public cvk a(boolean $$0) {
      return new cvk(this.h, $$0, this.j);
   }

   private static List<xv> a(List<ax> $$0) {
      for (ax $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dkl)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cvk $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
