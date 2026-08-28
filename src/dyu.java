import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dyu {
   private static final Codec<wy[]> c = xa.a
      .listOf()
      .comapFlatMap(
         $$0 -> af.a($$0, 4).map($$0x -> new wy[]{(wy)$$0x.get(0), (wy)$$0x.get(1), (wy)$$0x.get(2), (wy)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dyu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dyu::d),
               cyb.q.fieldOf("color").orElse(cyb.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dyu::a)
   );
   public static final int b = 4;
   private final wy[] d;
   private final wy[] e;
   private final cyb f;
   private final boolean g;
   @Nullable
   private ayy[] h;
   private boolean i;

   public dyu() {
      this(c(), c(), cyb.p, false);
   }

   public dyu(wy[] $$0, wy[] $$1, cyb $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wy[] c() {
      return new wy[]{wx.a, wx.a, wx.a, wx.a};
   }

   private static dyu a(wy[] $$0, Optional<wy[]> $$1, cyb $$2, boolean $$3) {
      return new dyu($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dyu a(boolean $$0) {
      return $$0 == this.g ? this : new dyu(this.d, this.e, this.f, $$0);
   }

   public cyb b() {
      return this.f;
   }

   public dyu a(cyb $$0) {
      return $$0 == this.b() ? this : new dyu(this.d, this.e, $$0, this.g);
   }

   public wy a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dyu a(int $$0, wy $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dyu a(int $$0, wy $$1, wy $$2) {
      wy[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wy[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dyu($$3, $$4, this.f, this.g);
   }

   public boolean a(crc $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wy[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayy[] a(boolean $$0, Function<wy, ayy> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayy[4];

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

   public boolean b(crc $$0) {
      for (wy $$1 : this.b($$0.aa())) {
         xv $$2 = $$1.a();
         ww $$3 = $$2.i();
         if ($$3 != null && $$3.a() == ww.a.c) {
            return true;
         }
      }

      return false;
   }
}
