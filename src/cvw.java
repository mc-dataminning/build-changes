import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cvw {
   private static final Codec<cvw> e = ay.a.flatComapMap($$0 -> new cvw(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cvw> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.b(ay.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cvw::a)
            )
            .apply($$0, cvw::new)
   );
   public static final Codec<cvw> a = Codec.withAlternative(f, e);
   public static final yt<wg, cvw> b = yt.a(ay.b.a(yr.a()), $$0 -> $$0.h, yr.b, cvw::a, cvw::new);
   public static final wv c = wv.c("item.canBreak").a(n.h);
   public static final wv d = wv.c("item.canPlace").a(n.h);
   private static final wv g = wv.c("item.canUse.unknown").a(n.h);
   private final List<ay> h;
   private final boolean i;
   @Nullable
   private List<wv> j;
   @Nullable
   private dyq k;
   private boolean l;
   private boolean m;

   public cvw(List<ay> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   private static boolean a(dyq $$0, @Nullable dyq $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         kg $$3 = $$0.c().F_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dyq $$0) {
      if (a($$0, this.k, this.m)) {
         return this.l;
      } else {
         this.k = $$0;
         this.m = false;

         for (ay $$1 : this.h) {
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

   private List<wv> b() {
      if (this.j == null) {
         this.j = a(this.h);
      }

      return this.j;
   }

   public void a(Consumer<wv> $$0) {
      this.b().forEach($$0);
   }

   public cvw a(boolean $$0) {
      return new cvw(this.h, $$0);
   }

   private static List<wv> a(List<ay> $$0) {
      for (ay $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dku)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cvw $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
