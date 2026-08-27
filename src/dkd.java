import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkd {
   private static final Codec<vq[]> c = vs.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vq[]{(vq)$$0x.get(0), (vq)$$0x.get(1), (vq)$$0x.get(2), (vq)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dkd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dkd::d),
               cnn.q.fieldOf("color").orElse(cnn.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dkd::a)
   );
   public static final int b = 4;
   private final vq[] d;
   private final vq[] e;
   private final cnn f;
   private final boolean g;
   @Nullable
   private avt[] h;
   private boolean i;

   public dkd() {
      this(c(), c(), cnn.p, false);
   }

   public dkd(vq[] $$0, vq[] $$1, cnn $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vq[] c() {
      return new vq[]{vp.a, vp.a, vp.a, vp.a};
   }

   private static dkd a(vq[] $$0, Optional<vq[]> $$1, cnn $$2, boolean $$3) {
      return new dkd($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dkd a(boolean $$0) {
      return $$0 == this.g ? this : new dkd(this.d, this.e, this.f, $$0);
   }

   public cnn b() {
      return this.f;
   }

   public dkd a(cnn $$0) {
      return $$0 == this.b() ? this : new dkd(this.d, this.e, $$0, this.g);
   }

   public vq a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dkd a(int $$0, vq $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dkd a(int $$0, vq $$1, vq $$2) {
      vq[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vq[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dkd($$3, $$4, this.f, this.g);
   }

   public boolean a(chh $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vq[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public avt[] a(boolean $$0, Function<vq, avt> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new avt[4];

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

   public boolean b(chh $$0) {
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
