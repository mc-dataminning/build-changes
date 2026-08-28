import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtz {
   private static final Codec<xi[]> c = xk.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xi[]{(xi)$$0x.get(0), (xi)$$0x.get(1), (xi)$$0x.get(2), (xi)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dtz::d),
               cuy.q.fieldOf("color").orElse(cuy.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dtz::a)
   );
   public static final int b = 4;
   private final xi[] d;
   private final xi[] e;
   private final cuy f;
   private final boolean g;
   @Nullable
   private ayw[] h;
   private boolean i;

   public dtz() {
      this(c(), c(), cuy.p, false);
   }

   public dtz(xi[] $$0, xi[] $$1, cuy $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xi[] c() {
      return new xi[]{xh.a, xh.a, xh.a, xh.a};
   }

   private static dtz a(xi[] $$0, Optional<xi[]> $$1, cuy $$2, boolean $$3) {
      return new dtz($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dtz a(boolean $$0) {
      return $$0 == this.g ? this : new dtz(this.d, this.e, this.f, $$0);
   }

   public cuy b() {
      return this.f;
   }

   public dtz a(cuy $$0) {
      return $$0 == this.b() ? this : new dtz(this.d, this.e, $$0, this.g);
   }

   public xi a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dtz a(int $$0, xi $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dtz a(int $$0, xi $$1, xi $$2) {
      xi[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xi[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dtz($$3, $$4, this.f, this.g);
   }

   public boolean a(com $$0) {
      return Arrays.stream(this.b($$0.ab())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xi[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayw[] a(boolean $$0, Function<xi, ayw> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayw[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xi[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(com $$0) {
      for (xi $$1 : this.b($$0.ab())) {
         yf $$2 = $$1.a();
         xg $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xg.a.c) {
            return true;
         }
      }

      return false;
   }
}
