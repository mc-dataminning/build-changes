import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqq {
   private static final Codec<xo[]> c = xq.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new xo[]{(xo)$$0x.get(0), (xo)$$0x.get(1), (xo)$$0x.get(2), (xo)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dqq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dqq::d),
               ctg.q.fieldOf("color").orElse(ctg.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dqq::a)
   );
   public static final int b = 4;
   private final xo[] d;
   private final xo[] e;
   private final ctg f;
   private final boolean g;
   @Nullable
   private ayj[] h;
   private boolean i;

   public dqq() {
      this(c(), c(), ctg.p, false);
   }

   public dqq(xo[] $$0, xo[] $$1, ctg $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xo[] c() {
      return new xo[]{xn.a, xn.a, xn.a, xn.a};
   }

   private static dqq a(xo[] $$0, Optional<xo[]> $$1, ctg $$2, boolean $$3) {
      return new dqq($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dqq a(boolean $$0) {
      return $$0 == this.g ? this : new dqq(this.d, this.e, this.f, $$0);
   }

   public ctg b() {
      return this.f;
   }

   public dqq a(ctg $$0) {
      return $$0 == this.b() ? this : new dqq(this.d, this.e, $$0, this.g);
   }

   public xo a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dqq a(int $$0, xo $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dqq a(int $$0, xo $$1, xo $$2) {
      xo[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xo[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dqq($$3, $$4, this.f, this.g);
   }

   public boolean a(cmv $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xo[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayj[] a(boolean $$0, Function<xo, ayj> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayj[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xo[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cmv $$0) {
      for (xo $$1 : this.b($$0.Y())) {
         yl $$2 = $$1.a();
         xm $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xm.a.c) {
            return true;
         }
      }

      return false;
   }
}
