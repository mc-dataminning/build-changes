import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class due {
   private static final Codec<xl[]> c = xn.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xl[]{(xl)$$0x.get(0), (xl)$$0x.get(1), (xl)$$0x.get(2), (xl)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<due> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(due::d),
               cvc.q.fieldOf("color").orElse(cvc.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, due::a)
   );
   public static final int b = 4;
   private final xl[] d;
   private final xl[] e;
   private final cvc f;
   private final boolean g;
   @Nullable
   private ayz[] h;
   private boolean i;

   public due() {
      this(c(), c(), cvc.p, false);
   }

   public due(xl[] $$0, xl[] $$1, cvc $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xl[] c() {
      return new xl[]{xk.a, xk.a, xk.a, xk.a};
   }

   private static due a(xl[] $$0, Optional<xl[]> $$1, cvc $$2, boolean $$3) {
      return new due($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public due a(boolean $$0) {
      return $$0 == this.g ? this : new due(this.d, this.e, this.f, $$0);
   }

   public cvc b() {
      return this.f;
   }

   public due a(cvc $$0) {
      return $$0 == this.b() ? this : new due(this.d, this.e, $$0, this.g);
   }

   public xl a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public due a(int $$0, xl $$1) {
      return this.a($$0, $$1, $$1);
   }

   public due a(int $$0, xl $$1, xl $$2) {
      xl[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xl[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new due($$3, $$4, this.f, this.g);
   }

   public boolean a(cor $$0) {
      return Arrays.stream(this.b($$0.ab())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xl[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayz[] a(boolean $$0, Function<xl, ayz> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayz[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xl[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cor $$0) {
      for (xl $$1 : this.b($$0.ab())) {
         yi $$2 = $$1.a();
         xj $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xj.a.c) {
            return true;
         }
      }

      return false;
   }
}
