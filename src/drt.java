import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drt {
   private static final Codec<wz[]> c = xb.g
      .listOf()
      .comapFlatMap(
         $$0 -> ad.a($$0, 4).map($$0x -> new wz[]{(wz)$$0x.get(0), (wz)$$0x.get(1), (wz)$$0x.get(2), (wz)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<drt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(drt::d),
               cti.q.fieldOf("color").orElse(cti.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drt::a)
   );
   public static final int b = 4;
   private final wz[] d;
   private final wz[] e;
   private final cti f;
   private final boolean g;
   @Nullable
   private aya[] h;
   private boolean i;

   public drt() {
      this(c(), c(), cti.p, false);
   }

   public drt(wz[] $$0, wz[] $$1, cti $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wz[] c() {
      return new wz[]{wy.a, wy.a, wy.a, wy.a};
   }

   private static drt a(wz[] $$0, Optional<wz[]> $$1, cti $$2, boolean $$3) {
      return new drt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public drt a(boolean $$0) {
      return $$0 == this.g ? this : new drt(this.d, this.e, this.f, $$0);
   }

   public cti b() {
      return this.f;
   }

   public drt a(cti $$0) {
      return $$0 == this.b() ? this : new drt(this.d, this.e, $$0, this.g);
   }

   public wz a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public drt a(int $$0, wz $$1) {
      return this.a($$0, $$1, $$1);
   }

   public drt a(int $$0, wz $$1, wz $$2) {
      wz[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wz[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new drt($$3, $$4, this.f, this.g);
   }

   public boolean a(cmx $$0) {
      return Arrays.stream(this.b($$0.Z())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wz[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aya[] a(boolean $$0, Function<wz, aya> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aya[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wz[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cmx $$0) {
      for (wz $$1 : this.b($$0.Z())) {
         xw $$2 = $$1.a();
         wx $$3 = $$2.h();
         if ($$3 != null && $$3.a() == wx.a.c) {
            return true;
         }
      }

      return false;
   }
}
