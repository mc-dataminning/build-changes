import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class cov {
   private static final Codec<cov> e = av.a.flatComapMap($$0 -> new cov(List.of($$0), true), $$0 -> DataResult.error(() -> "Cannot encode"));
   private static final Codec<cov> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a(av.a.listOf()).fieldOf("predicates").forGetter($$0x -> $$0x.h), aws.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cov::a))
            .apply($$0, cov::new)
   );
   public static final Codec<cov> a = aws.e(f, e);
   public static final ye<vr, cov> b = ye.a(av.b.a(yc.a()), $$0 -> $$0.h, yc.b, cov::a, cov::new);
   public static final wg c = wg.c("item.canBreak").a(n.h);
   public static final wg d = wg.c("item.canPlace").a(n.h);
   private static final wg g = wg.c("item.canUse.unknown").a(n.h);
   private final List<av> h;
   private final boolean i;
   private final List<wg> j;
   @Nullable
   private dpd k;
   private boolean l;
   private boolean m;

   public cov(List<av> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      this.j = a($$0);
   }

   private static boolean a(dpd $$0, @Nullable dpd $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         iz $$3 = $$0.c().H_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(dpd $$0) {
      if (a($$0, this.k, this.m)) {
         return this.l;
      } else {
         this.k = $$0;
         this.m = false;

         for (av $$1 : this.h) {
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

   public void a(Consumer<wg> $$0) {
      this.j.forEach($$0);
   }

   private static List<wg> a(List<av> $$0) {
      for (av $$1 : $$0) {
         if ($$1.b().isEmpty()) {
            return List.of(g);
         }
      }

      return $$0.stream().flatMap($$0x -> $$0x.b().orElseThrow().a()).distinct().map($$0x -> ((dby)$$0x.a()).f().a(n.i)).toList();
   }

   public boolean a() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof cov $$1 ? this.h.equals($$1.h) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.h.hashCode();
   }
}
