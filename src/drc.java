import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drc {
   private static final Codec<wu[]> c = ww.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wu[]{(wu)$$0x.get(0), (wu)$$0x.get(1), (wu)$$0x.get(2), (wu)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<drc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(drc::d),
               csw.q.fieldOf("color").orElse(csw.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drc::a)
   );
   public static final int b = 4;
   private final wu[] d;
   private final wu[] e;
   private final csw f;
   private final boolean g;
   @Nullable
   private axs[] h;
   private boolean i;

   public drc() {
      this(c(), c(), csw.p, false);
   }

   public drc(wu[] $$0, wu[] $$1, csw $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wu[] c() {
      return new wu[]{wt.a, wt.a, wt.a, wt.a};
   }

   private static drc a(wu[] $$0, Optional<wu[]> $$1, csw $$2, boolean $$3) {
      return new drc($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public drc a(boolean $$0) {
      return $$0 == this.g ? this : new drc(this.d, this.e, this.f, $$0);
   }

   public csw b() {
      return this.f;
   }

   public drc a(csw $$0) {
      return $$0 == this.b() ? this : new drc(this.d, this.e, $$0, this.g);
   }

   public wu a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public drc a(int $$0, wu $$1) {
      return this.a($$0, $$1, $$1);
   }

   public drc a(int $$0, wu $$1, wu $$2) {
      wu[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wu[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new drc($$3, $$4, this.f, this.g);
   }

   public boolean a(cml $$0) {
      return Arrays.stream(this.b($$0.Z())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wu[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public axs[] a(boolean $$0, Function<wu, axs> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new axs[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wu[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cml $$0) {
      for (wu $$1 : this.b($$0.Z())) {
         xr $$2 = $$1.a();
         ws $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ws.a.c) {
            return true;
         }
      }

      return false;
   }
}
