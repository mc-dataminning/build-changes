import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cts {
   private static final Codec<cts> e = aw.a.flatComapMap($$0 -> new cts(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cts> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.a(aw.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cts::a)
            )
            .apply($$0, cts::new)
   );
   public static final Codec<cts> a = Codec.withAlternative(f, e);
   public static final zf<ws, cts> b = zf.a(aw.b.a(zd.a()), $$0 -> $$0.h, zd.b, cts::a, cts::new);
   public static final xh c = xh.c("item.canBreak").a(n.h);
   public static final xh d = xh.c("item.canPlace").a(n.h);
   private static final xh g = xh.c("item.canUse.unknown").a(n.h);
   private final List<aw> h;
   private final boolean i;
   private final List<xh> j;
   @Nullable
   private dvh k;
   private boolean l;
   private boolean m;

   private cts(List<aw> $$0, boolean $$1, List<xh> $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public cts(List<aw> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(dvh $$0, @Nullable dvh $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         kd $$3 = $$0.c().H_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dvh $$0) {
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

   public void a(Consumer<xh> $$0) {
      this.j.forEach($$0);
   }

   public cts a(boolean $$0) {
      return new cts(this.h, $$0, this.j);
   }

   private static List<xh> a(List<aw> $$0) {
      for (aw $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dhy)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cts $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
