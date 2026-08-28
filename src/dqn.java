import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqn {
   private static final Codec<xl[]> c = xn.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new xl[]{(xl)$$0x.get(0), (xl)$$0x.get(1), (xl)$$0x.get(2), (xl)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dqn::d),
               ctd.q.fieldOf("color").orElse(ctd.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dqn::a)
   );
   public static final int b = 4;
   private final xl[] d;
   private final xl[] e;
   private final ctd f;
   private final boolean g;
   @Nullable
   private ayg[] h;
   private boolean i;

   public dqn() {
      this(c(), c(), ctd.p, false);
   }

   public dqn(xl[] $$0, xl[] $$1, ctd $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xl[] c() {
      return new xl[]{xk.a, xk.a, xk.a, xk.a};
   }

   private static dqn a(xl[] $$0, Optional<xl[]> $$1, ctd $$2, boolean $$3) {
      return new dqn($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dqn a(boolean $$0) {
      return $$0 == this.g ? this : new dqn(this.d, this.e, this.f, $$0);
   }

   public ctd b() {
      return this.f;
   }

   public dqn a(ctd $$0) {
      return $$0 == this.b() ? this : new dqn(this.d, this.e, $$0, this.g);
   }

   public xl a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dqn a(int $$0, xl $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dqn a(int $$0, xl $$1, xl $$2) {
      xl[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xl[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dqn($$3, $$4, this.f, this.g);
   }

   public boolean a(cms $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xl[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayg[] a(boolean $$0, Function<xl, ayg> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayg[4];

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

   public boolean b(cms $$0) {
      for (xl $$1 : this.b($$0.Y())) {
         yi $$2 = $$1.a();
         xj $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xj.a.c) {
            return true;
         }
      }

      return false;
   }
}
