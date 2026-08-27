import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class din {
   private static final Codec<vg[]> c = vi.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vg[]{(vg)$$0x.get(0), (vg)$$0x.get(1), (vg)$$0x.get(2), (vg)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<din> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(din::d),
               clv.q.fieldOf("color").orElse(clv.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, din::a)
   );
   public static final int b = 4;
   private final vg[] d;
   private final vg[] e;
   private final clv f;
   private final boolean g;
   @Nullable
   private aub[] h;
   private boolean i;

   public din() {
      this(c(), c(), clv.p, false);
   }

   public din(vg[] $$0, vg[] $$1, clv $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vg[] c() {
      return new vg[]{vf.a, vf.a, vf.a, vf.a};
   }

   private static din a(vg[] $$0, Optional<vg[]> $$1, clv $$2, boolean $$3) {
      return new din($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public din a(boolean $$0) {
      return $$0 == this.g ? this : new din(this.d, this.e, this.f, $$0);
   }

   public clv b() {
      return this.f;
   }

   public din a(clv $$0) {
      return $$0 == this.b() ? this : new din(this.d, this.e, $$0, this.g);
   }

   public vg a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public din a(int $$0, vg $$1) {
      return this.a($$0, $$1, $$1);
   }

   public din a(int $$0, vg $$1, vg $$2) {
      vg[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vg[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new din($$3, $$4, this.f, this.g);
   }

   public boolean a(cfq $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vg[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aub[] a(boolean $$0, Function<vg, aub> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aub[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vg[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cfq $$0) {
      for (vg $$1 : this.b($$0.Y())) {
         wd $$2 = $$1.a();
         ve $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ve.a.c) {
            return true;
         }
      }

      return false;
   }
}
