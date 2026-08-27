import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddv {
   private static final Codec<tf[]> c = aqy.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new tf[]{(tf)$$0x.get(0), (tf)$$0x.get(1), (tf)$$0x.get(2), (tf)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<ddv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(ddv::d),
               chm.q.fieldOf("color").orElse(chm.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ddv::a)
   );
   public static final int b = 4;
   private final tf[] d;
   private final tf[] e;
   private final chm f;
   private final boolean g;
   @Nullable
   private arc[] h;
   private boolean i;

   public ddv() {
      this(c(), c(), chm.p, false);
   }

   public ddv(tf[] $$0, tf[] $$1, chm $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static tf[] c() {
      return new tf[]{te.a, te.a, te.a, te.a};
   }

   private static ddv a(tf[] $$0, Optional<tf[]> $$1, chm $$2, boolean $$3) {
      return new ddv($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public ddv a(boolean $$0) {
      return $$0 == this.g ? this : new ddv(this.d, this.e, this.f, $$0);
   }

   public chm b() {
      return this.f;
   }

   public ddv a(chm $$0) {
      return $$0 == this.b() ? this : new ddv(this.d, this.e, $$0, this.g);
   }

   public tf a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public ddv a(int $$0, tf $$1) {
      return this.a($$0, $$1, $$1);
   }

   public ddv a(int $$0, tf $$1, tf $$2) {
      tf[] $$3 = Arrays.copyOf(this.d, this.d.length);
      tf[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new ddv($$3, $$4, this.f, this.g);
   }

   public boolean a(cbn $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public tf[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public arc[] a(boolean $$0, Function<tf, arc> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new arc[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<tf[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cbn $$0) {
      for (tf $$1 : this.b($$0.W())) {
         ub $$2 = $$1.a();
         td $$3 = $$2.h();
         if ($$3 != null && $$3.a() == td.a.c) {
            return true;
         }
      }

      return false;
   }
}
