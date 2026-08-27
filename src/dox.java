import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dox {
   private static final Codec<wu[]> c = ww.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wu[]{(wu)$$0x.get(0), (wu)$$0x.get(1), (wu)$$0x.get(2), (wu)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dox> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dox::d),
               crs.q.fieldOf("color").orElse(crs.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dox::a)
   );
   public static final int b = 4;
   private final wu[] d;
   private final wu[] e;
   private final crs f;
   private final boolean g;
   @Nullable
   private axl[] h;
   private boolean i;

   public dox() {
      this(c(), c(), crs.p, false);
   }

   public dox(wu[] $$0, wu[] $$1, crs $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wu[] c() {
      return new wu[]{wt.a, wt.a, wt.a, wt.a};
   }

   private static dox a(wu[] $$0, Optional<wu[]> $$1, crs $$2, boolean $$3) {
      return new dox($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dox a(boolean $$0) {
      return $$0 == this.g ? this : new dox(this.d, this.e, this.f, $$0);
   }

   public crs b() {
      return this.f;
   }

   public dox a(crs $$0) {
      return $$0 == this.b() ? this : new dox(this.d, this.e, $$0, this.g);
   }

   public wu a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dox a(int $$0, wu $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dox a(int $$0, wu $$1, wu $$2) {
      wu[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wu[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dox($$3, $$4, this.f, this.g);
   }

   public boolean a(clh $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wu[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public axl[] a(boolean $$0, Function<wu, axl> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new axl[4];

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

   public boolean b(clh $$0) {
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
