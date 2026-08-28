import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ead {
   private static final Codec<xg[]> c = xi.a
      .listOf()
      .comapFlatMap(
         $$0 -> ag.a($$0, 4).map($$0x -> new xg[]{(xg)$$0x.get(0), (xg)$$0x.get(1), (xg)$$0x.get(2), (xg)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<ead> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(ead::d),
               czi.q.fieldOf("color").orElse(czi.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ead::a)
   );
   public static final int b = 4;
   private final xg[] d;
   private final xg[] e;
   private final czi f;
   private final boolean g;
   @Nullable
   private azk[] h;
   private boolean i;

   public ead() {
      this(c(), c(), czi.p, false);
   }

   public ead(xg[] $$0, xg[] $$1, czi $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xg[] c() {
      return new xg[]{xf.a, xf.a, xf.a, xf.a};
   }

   private static ead a(xg[] $$0, Optional<xg[]> $$1, czi $$2, boolean $$3) {
      return new ead($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public ead a(boolean $$0) {
      return $$0 == this.g ? this : new ead(this.d, this.e, this.f, $$0);
   }

   public czi b() {
      return this.f;
   }

   public ead a(czi $$0) {
      return $$0 == this.b() ? this : new ead(this.d, this.e, $$0, this.g);
   }

   public xg a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public ead a(int $$0, xg $$1) {
      return this.a($$0, $$1, $$1);
   }

   public ead a(int $$0, xg $$1, xg $$2) {
      xg[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xg[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new ead($$3, $$4, this.f, this.g);
   }

   public boolean a(csi $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xg[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public azk[] a(boolean $$0, Function<xg, azk> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new azk[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xg[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(csi $$0) {
      for (xg $$1 : this.b($$0.W())) {
         yd $$2 = $$1.a();
         xe $$3 = $$2.i();
         if ($$3 != null && $$3.a() == xe.a.c) {
            return true;
         }
      }

      return false;
   }
}
