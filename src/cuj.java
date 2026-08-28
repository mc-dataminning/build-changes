import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cuj {
   private static final Codec<cuj> e = ay.a.flatComapMap($$0 -> new cuj(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cuj> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.b(ay.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cuj::a)
            )
            .apply($$0, cuj::new)
   );
   public static final Codec<cuj> a = Codec.withAlternative(f, e);
   public static final ym<vz, cuj> b = ym.a(ay.b.a(yk.a()), $$0 -> $$0.h, yk.b, cuj::a, cuj::new);
   public static final wo c = wo.c("item.canBreak").a(n.h);
   public static final wo d = wo.c("item.canPlace").a(n.h);
   private static final wo g = wo.c("item.canUse.unknown").a(n.h);
   private final List<ay> h;
   private final boolean i;
   @Nullable
   private List<wo> j;
   @Nullable
   private dwz k;
   private boolean l;
   private boolean m;

   public cuj(List<ay> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   private static boolean a(dwz $$0, @Nullable dwz $$1, boolean $$2) {
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

   public boolean a(dwz $$0) {
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

   private List<wo> b() {
      if (this.j == null) {
         this.j = a(this.h);
      }

      return this.j;
   }

   public void a(Consumer<wo> $$0) {
      this.b().forEach($$0);
   }

   public cuj a(boolean $$0) {
      return new cuj(this.h, $$0);
   }

   private static List<wo> a(List<ay> $$0) {
      for (ay $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((djk)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cuj $$1) ? false : this.h.equals($$1.h) && this.i == $$1.i;
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
