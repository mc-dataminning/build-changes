import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkh {
   private static final Codec<vq[]> c = vs.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vq[]{(vq)$$0x.get(0), (vq)$$0x.get(1), (vq)$$0x.get(2), (vq)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dkh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dkh::d),
               cnr.q.fieldOf("color").orElse(cnr.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dkh::a)
   );
   public static final int b = 4;
   private final vq[] d;
   private final vq[] e;
   private final cnr f;
   private final boolean g;
   @Nullable
   private avu[] h;
   private boolean i;

   public dkh() {
      this(c(), c(), cnr.p, false);
   }

   public dkh(vq[] $$0, vq[] $$1, cnr $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vq[] c() {
      return new vq[]{vp.a, vp.a, vp.a, vp.a};
   }

   private static dkh a(vq[] $$0, Optional<vq[]> $$1, cnr $$2, boolean $$3) {
      return new dkh($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dkh a(boolean $$0) {
      return $$0 == this.g ? this : new dkh(this.d, this.e, this.f, $$0);
   }

   public cnr b() {
      return this.f;
   }

   public dkh a(cnr $$0) {
      return $$0 == this.b() ? this : new dkh(this.d, this.e, $$0, this.g);
   }

   public vq a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dkh a(int $$0, vq $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dkh a(int $$0, vq $$1, vq $$2) {
      vq[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vq[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dkh($$3, $$4, this.f, this.g);
   }

   public boolean a(chl $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vq[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public avu[] a(boolean $$0, Function<vq, avu> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new avu[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vq[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(chl $$0) {
      for (vq $$1 : this.b($$0.Y())) {
         wn $$2 = $$1.a();
         vo $$3 = $$2.h();
         if ($$3 != null && $$3.a() == vo.a.c) {
            return true;
         }
      }

      return false;
   }
}
