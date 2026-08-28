import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drb {
   private static final Codec<wu[]> c = ww.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wu[]{(wu)$$0x.get(0), (wu)$$0x.get(1), (wu)$$0x.get(2), (wu)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<drb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(drb::d),
               csv.q.fieldOf("color").orElse(csv.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, drb::a)
   );
   public static final int b = 4;
   private final wu[] d;
   private final wu[] e;
   private final csv f;
   private final boolean g;
   @Nullable
   private axs[] h;
   private boolean i;

   public drb() {
      this(c(), c(), csv.p, false);
   }

   public drb(wu[] $$0, wu[] $$1, csv $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wu[] c() {
      return new wu[]{wt.a, wt.a, wt.a, wt.a};
   }

   private static drb a(wu[] $$0, Optional<wu[]> $$1, csv $$2, boolean $$3) {
      return new drb($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public drb a(boolean $$0) {
      return $$0 == this.g ? this : new drb(this.d, this.e, this.f, $$0);
   }

   public csv b() {
      return this.f;
   }

   public drb a(csv $$0) {
      return $$0 == this.b() ? this : new drb(this.d, this.e, $$0, this.g);
   }

   public wu a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public drb a(int $$0, wu $$1) {
      return this.a($$0, $$1, $$1);
   }

   public drb a(int $$0, wu $$1, wu $$2) {
      wu[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wu[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new drb($$3, $$4, this.f, this.g);
   }

   public boolean a(cmk $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
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

   public boolean b(cmk $$0) {
      for (wu $$1 : this.b($$0.Y())) {
         xr $$2 = $$1.a();
         ws $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ws.a.c) {
            return true;
         }
      }

      return false;
   }
}
