import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dls {
   private static final Codec<vu[]> c = vw.e
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vu[]{(vu)$$0x.get(0), (vu)$$0x.get(1), (vu)$$0x.get(2), (vu)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dls> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dls::d),
               cpd.q.fieldOf("color").orElse(cpd.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dls::a)
   );
   public static final int b = 4;
   private final vu[] d;
   private final vu[] e;
   private final cpd f;
   private final boolean g;
   @Nullable
   private awi[] h;
   private boolean i;

   public dls() {
      this(c(), c(), cpd.p, false);
   }

   public dls(vu[] $$0, vu[] $$1, cpd $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vu[] c() {
      return new vu[]{vt.a, vt.a, vt.a, vt.a};
   }

   private static dls a(vu[] $$0, Optional<vu[]> $$1, cpd $$2, boolean $$3) {
      return new dls($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dls a(boolean $$0) {
      return $$0 == this.g ? this : new dls(this.d, this.e, this.f, $$0);
   }

   public cpd b() {
      return this.f;
   }

   public dls a(cpd $$0) {
      return $$0 == this.b() ? this : new dls(this.d, this.e, $$0, this.g);
   }

   public vu a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dls a(int $$0, vu $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dls a(int $$0, vu $$1, vu $$2) {
      vu[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vu[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dls($$3, $$4, this.f, this.g);
   }

   public boolean a(ciu $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vu[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public awi[] a(boolean $$0, Function<vu, awi> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new awi[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vu[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(ciu $$0) {
      for (vu $$1 : this.b($$0.Y())) {
         wr $$2 = $$1.a();
         vs $$3 = $$2.h();
         if ($$3 != null && $$3.a() == vs.a.c) {
            return true;
         }
      }

      return false;
   }
}
