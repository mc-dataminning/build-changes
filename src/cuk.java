import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cuk {
   private static final Codec<cuk> e = ay.a.flatComapMap($$0 -> new cuk(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cuk> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.b(ay.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cuk::a)
            )
            .apply($$0, cuk::new)
   );
   public static final Codec<cuk> a = Codec.withAlternative(f, e);
   public static final yn<wa, cuk> b = yn.a(ay.b.a(yl.a()), $$0 -> $$0.h, yl.b, cuk::a, cuk::new);
   public static final wp c = wp.c("item.canBreak").a(n.h);
   public static final wp d = wp.c("item.canPlace").a(n.h);
   private static final wp g = wp.c("item.canUse.unknown").a(n.h);
   private final List<ay> h;
   private final boolean i;
   @Nullable
   private List<wp> j;
   @Nullable
   private dxa k;
   private boolean l;
   private boolean m;

   public cuk(List<ay> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   private static boolean a(dxa $$0, @Nullable dxa $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         kf $$3 = $$0.c().K_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dxa $$0) {
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

   private List<wp> b() {
      if (this.j == null) {
         this.j = a(this.h);
      }

      return this.j;
   }

   public void a(Consumer<wp> $$0) {
      this.b().forEach($$0);
   }

   public cuk a(boolean $$0) {
      return new cuk(this.h, $$0);
   }

   private static List<wp> a(List<ay> $$0) {
      for (ay $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((djl)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cuk $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
