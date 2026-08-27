import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dif {
   private static final Codec<vf[]> c = vh.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vf[]{(vf)$$0x.get(0), (vf)$$0x.get(1), (vf)$$0x.get(2), (vf)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dif> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dif::d),
               clm.q.fieldOf("color").orElse(clm.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dif::a)
   );
   public static final int b = 4;
   private final vf[] d;
   private final vf[] e;
   private final clm f;
   private final boolean g;
   @Nullable
   private aua[] h;
   private boolean i;

   public dif() {
      this(c(), c(), clm.p, false);
   }

   public dif(vf[] $$0, vf[] $$1, clm $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vf[] c() {
      return new vf[]{ve.a, ve.a, ve.a, ve.a};
   }

   private static dif a(vf[] $$0, Optional<vf[]> $$1, clm $$2, boolean $$3) {
      return new dif($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dif a(boolean $$0) {
      return $$0 == this.g ? this : new dif(this.d, this.e, this.f, $$0);
   }

   public clm b() {
      return this.f;
   }

   public dif a(clm $$0) {
      return $$0 == this.b() ? this : new dif(this.d, this.e, $$0, this.g);
   }

   public vf a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dif a(int $$0, vf $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dif a(int $$0, vf $$1, vf $$2) {
      vf[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vf[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dif($$3, $$4, this.f, this.g);
   }

   public boolean a(cfi $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vf[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aua[] a(boolean $$0, Function<vf, aua> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aua[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vf[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cfi $$0) {
      for (vf $$1 : this.b($$0.Y())) {
         wc $$2 = $$1.a();
         vd $$3 = $$2.h();
         if ($$3 != null && $$3.a() == vd.a.c) {
            return true;
         }
      }

      return false;
   }
}
