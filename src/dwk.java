import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dwk {
   private static final Codec<xv[]> c = xx.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xv[]{(xv)$$0x.get(0), (xv)$$0x.get(1), (xv)$$0x.get(2), (xv)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dwk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dwk::d),
               cwl.q.fieldOf("color").orElse(cwl.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dwk::a)
   );
   public static final int b = 4;
   private final xv[] d;
   private final xv[] e;
   private final cwl f;
   private final boolean g;
   @Nullable
   private azq[] h;
   private boolean i;

   public dwk() {
      this(c(), c(), cwl.p, false);
   }

   public dwk(xv[] $$0, xv[] $$1, cwl $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xv[] c() {
      return new xv[]{xu.a, xu.a, xu.a, xu.a};
   }

   private static dwk a(xv[] $$0, Optional<xv[]> $$1, cwl $$2, boolean $$3) {
      return new dwk($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dwk a(boolean $$0) {
      return $$0 == this.g ? this : new dwk(this.d, this.e, this.f, $$0);
   }

   public cwl b() {
      return this.f;
   }

   public dwk a(cwl $$0) {
      return $$0 == this.b() ? this : new dwk(this.d, this.e, $$0, this.g);
   }

   public xv a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dwk a(int $$0, xv $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dwk a(int $$0, xv $$1, xv $$2) {
      xv[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xv[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dwk($$3, $$4, this.f, this.g);
   }

   public boolean a(cpw $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xv[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public azq[] a(boolean $$0, Function<xv, azq> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new azq[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xv[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cpw $$0) {
      for (xv $$1 : this.b($$0.aa())) {
         ys $$2 = $$1.a();
         xt $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xt.a.c) {
            return true;
         }
      }

      return false;
   }
}
