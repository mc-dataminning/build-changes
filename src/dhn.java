import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dhn {
   private static final Codec<vb[]> c = vd.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vb[]{(vb)$$0x.get(0), (vb)$$0x.get(1), (vb)$$0x.get(2), (vb)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dhn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dhn::d),
               ckv.q.fieldOf("color").orElse(ckv.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dhn::a)
   );
   public static final int b = 4;
   private final vb[] d;
   private final vb[] e;
   private final ckv f;
   private final boolean g;
   @Nullable
   private atk[] h;
   private boolean i;

   public dhn() {
      this(c(), c(), ckv.p, false);
   }

   public dhn(vb[] $$0, vb[] $$1, ckv $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vb[] c() {
      return new vb[]{va.a, va.a, va.a, va.a};
   }

   private static dhn a(vb[] $$0, Optional<vb[]> $$1, ckv $$2, boolean $$3) {
      return new dhn($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dhn a(boolean $$0) {
      return $$0 == this.g ? this : new dhn(this.d, this.e, this.f, $$0);
   }

   public ckv b() {
      return this.f;
   }

   public dhn a(ckv $$0) {
      return $$0 == this.b() ? this : new dhn(this.d, this.e, $$0, this.g);
   }

   public vb a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dhn a(int $$0, vb $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dhn a(int $$0, vb $$1, vb $$2) {
      vb[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vb[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dhn($$3, $$4, this.f, this.g);
   }

   public boolean a(cer $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vb[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public atk[] a(boolean $$0, Function<vb, atk> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new atk[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vb[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cer $$0) {
      for (vb $$1 : this.b($$0.Y())) {
         vy $$2 = $$1.a();
         uz $$3 = $$2.h();
         if ($$3 != null && $$3.a() == uz.a.c) {
            return true;
         }
      }

      return false;
   }
}
