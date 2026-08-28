import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drr {
   private static final Codec<wy[]> c = xa.g
      .listOf()
      .comapFlatMap(
         $$0 -> ad.a($$0, 4).map($$0x -> new wy[]{(wy)$$0x.get(0), (wy)$$0x.get(1), (wy)$$0x.get(2), (wy)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<drr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(drr::d),
               ctg.q.fieldOf("color").orElse(ctg.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drr::a)
   );
   public static final int b = 4;
   private final wy[] d;
   private final wy[] e;
   private final ctg f;
   private final boolean g;
   @Nullable
   private axz[] h;
   private boolean i;

   public drr() {
      this(c(), c(), ctg.p, false);
   }

   public drr(wy[] $$0, wy[] $$1, ctg $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wy[] c() {
      return new wy[]{wx.a, wx.a, wx.a, wx.a};
   }

   private static drr a(wy[] $$0, Optional<wy[]> $$1, ctg $$2, boolean $$3) {
      return new drr($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public drr a(boolean $$0) {
      return $$0 == this.g ? this : new drr(this.d, this.e, this.f, $$0);
   }

   public ctg b() {
      return this.f;
   }

   public drr a(ctg $$0) {
      return $$0 == this.b() ? this : new drr(this.d, this.e, $$0, this.g);
   }

   public wy a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public drr a(int $$0, wy $$1) {
      return this.a($$0, $$1, $$1);
   }

   public drr a(int $$0, wy $$1, wy $$2) {
      wy[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wy[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new drr($$3, $$4, this.f, this.g);
   }

   public boolean a(cmv $$0) {
      return Arrays.stream(this.b($$0.Z())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wy[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public axz[] a(boolean $$0, Function<wy, axz> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new axz[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wy[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cmv $$0) {
      for (wy $$1 : this.b($$0.Z())) {
         xv $$2 = $$1.a();
         ww $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ww.a.c) {
            return true;
         }
      }

      return false;
   }
}
