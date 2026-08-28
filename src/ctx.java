import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ctx {
   private static final Codec<ctx> e = ax.a.flatComapMap($$0 -> new ctx(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<ctx> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.a(ax.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(ctx::a)
            )
            .apply($$0, ctx::new)
   );
   public static final Codec<ctx> a = Codec.withAlternative(f, e);
   public static final zg<wt, ctx> b = zg.a(ax.b.a(ze.a()), $$0 -> $$0.h, ze.b, ctx::a, ctx::new);
   public static final xi c = xi.c("item.canBreak").a(n.h);
   public static final xi d = xi.c("item.canPlace").a(n.h);
   private static final xi g = xi.c("item.canUse.unknown").a(n.h);
   private final List<ax> h;
   private final boolean i;
   private final List<xi> j;
   @Nullable
   private dvn k;
   private boolean l;
   private boolean m;

   private ctx(List<ax> $$0, boolean $$1, List<xi> $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public ctx(List<ax> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(dvn $$0, @Nullable dvn $$1, boolean $$2) {
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

   public boolean a(dvn $$0) {
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

   public void a(Consumer<xi> $$0) {
      this.j.forEach($$0);
   }

   public ctx a(boolean $$0) {
      return new ctx(this.h, $$0, this.j);
   }

   private static List<xi> a(List<ax> $$0) {
      for (ax $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((die)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ctx $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
