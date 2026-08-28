import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dul {
   private static final Codec<xj[]> c = xl.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xj[]{(xj)$$0x.get(0), (xj)$$0x.get(1), (xj)$$0x.get(2), (xj)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dul::d),
               cvj.q.fieldOf("color").orElse(cvj.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dul::a)
   );
   public static final int b = 4;
   private final xj[] d;
   private final xj[] e;
   private final cvj f;
   private final boolean g;
   @Nullable
   private ayy[] h;
   private boolean i;

   public dul() {
      this(c(), c(), cvj.p, false);
   }

   public dul(xj[] $$0, xj[] $$1, cvj $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xj[] c() {
      return new xj[]{xi.a, xi.a, xi.a, xi.a};
   }

   private static dul a(xj[] $$0, Optional<xj[]> $$1, cvj $$2, boolean $$3) {
      return new dul($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dul a(boolean $$0) {
      return $$0 == this.g ? this : new dul(this.d, this.e, this.f, $$0);
   }

   public cvj b() {
      return this.f;
   }

   public dul a(cvj $$0) {
      return $$0 == this.b() ? this : new dul(this.d, this.e, $$0, this.g);
   }

   public xj a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dul a(int $$0, xj $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dul a(int $$0, xj $$1, xj $$2) {
      xj[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xj[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dul($$3, $$4, this.f, this.g);
   }

   public boolean a(cou $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xj[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayy[] a(boolean $$0, Function<xj, ayy> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayy[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xj[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cou $$0) {
      for (xj $$1 : this.b($$0.aa())) {
         yg $$2 = $$1.a();
         xh $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xh.a.c) {
            return true;
         }
      }

      return false;
   }
}
