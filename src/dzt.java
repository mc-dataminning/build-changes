import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dzt {
   private static final Codec<xc[]> c = xe.a
      .listOf()
      .comapFlatMap(
         $$0 -> ag.a($$0, 4).map($$0x -> new xc[]{(xc)$$0x.get(0), (xc)$$0x.get(1), (xc)$$0x.get(2), (xc)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dzt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dzt::d),
               cyy.q.fieldOf("color").orElse(cyy.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzt::a)
   );
   public static final int b = 4;
   private final xc[] d;
   private final xc[] e;
   private final cyy f;
   private final boolean g;
   @Nullable
   private azc[] h;
   private boolean i;

   public dzt() {
      this(c(), c(), cyy.p, false);
   }

   public dzt(xc[] $$0, xc[] $$1, cyy $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xc[] c() {
      return new xc[]{xb.a, xb.a, xb.a, xb.a};
   }

   private static dzt a(xc[] $$0, Optional<xc[]> $$1, cyy $$2, boolean $$3) {
      return new dzt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dzt a(boolean $$0) {
      return $$0 == this.g ? this : new dzt(this.d, this.e, this.f, $$0);
   }

   public cyy b() {
      return this.f;
   }

   public dzt a(cyy $$0) {
      return $$0 == this.b() ? this : new dzt(this.d, this.e, $$0, this.g);
   }

   public xc a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dzt a(int $$0, xc $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dzt a(int $$0, xc $$1, xc $$2) {
      xc[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xc[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dzt($$3, $$4, this.f, this.g);
   }

   public boolean a(crz $$0) {
      return Arrays.stream(this.b($$0.X())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xc[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public azc[] a(boolean $$0, Function<xc, azc> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new azc[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xc[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(crz $$0) {
      for (xc $$1 : this.b($$0.X())) {
         xz $$2 = $$1.a();
         xa $$3 = $$2.i();
         if ($$3 != null && $$3.a() == xa.a.c) {
            return true;
         }
      }

      return false;
   }
}
