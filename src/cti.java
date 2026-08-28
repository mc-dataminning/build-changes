import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cti {
   private static final Codec<cti> e = aw.a.flatComapMap($$0 -> new cti(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cti> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.a(aw.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cti::a)
            )
            .apply($$0, cti::new)
   );
   public static final Codec<cti> a = Codec.withAlternative(f, e);
   public static final zc<wp, cti> b = zc.a(aw.b.a(za.a()), $$0 -> $$0.h, za.b, cti::a, cti::new);
   public static final xe c = xe.c("item.canBreak").a(n.h);
   public static final xe d = xe.c("item.canPlace").a(n.h);
   private static final xe g = xe.c("item.canUse.unknown").a(n.h);
   private final List<aw> h;
   private final boolean i;
   private final List<xe> j;
   @Nullable
   private duw k;
   private boolean l;
   private boolean m;

   private cti(List<aw> $$0, boolean $$1, List<xe> $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public cti(List<aw> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(duw $$0, @Nullable duw $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         kc $$3 = $$0.c().G_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(duw $$0) {
      if (a($$0, this.k, this.m)) {
         return this.l;
      } else {
         this.k = $$0;
         this.m = false;

         for (aw $$1 : this.h) {
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

   public void a(Consumer<xe> $$0) {
      this.j.forEach($$0);
   }

   public cti a(boolean $$0) {
      return new cti(this.h, $$0, this.j);
   }

   private static List<xe> a(List<aw> $$0) {
      for (aw $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dhm)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cti $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
