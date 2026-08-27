import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnz {
   private static final Codec<wi[]> c = wk.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wi[]{(wi)$$0x.get(0), (wi)$$0x.get(1), (wi)$$0x.get(2), (wi)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dnz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dnz::d),
               cql.q.fieldOf("color").orElse(cql.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnz::a)
   );
   public static final int b = 4;
   private final wi[] d;
   private final wi[] e;
   private final cql f;
   private final boolean g;
   @Nullable
   private awy[] h;
   private boolean i;

   public dnz() {
      this(c(), c(), cql.p, false);
   }

   public dnz(wi[] $$0, wi[] $$1, cql $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wi[] c() {
      return new wi[]{wh.a, wh.a, wh.a, wh.a};
   }

   private static dnz a(wi[] $$0, Optional<wi[]> $$1, cql $$2, boolean $$3) {
      return new dnz($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dnz a(boolean $$0) {
      return $$0 == this.g ? this : new dnz(this.d, this.e, this.f, $$0);
   }

   public cql b() {
      return this.f;
   }

   public dnz a(cql $$0) {
      return $$0 == this.b() ? this : new dnz(this.d, this.e, $$0, this.g);
   }

   public wi a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dnz a(int $$0, wi $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dnz a(int $$0, wi $$1, wi $$2) {
      wi[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wi[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dnz($$3, $$4, this.f, this.g);
   }

   public boolean a(cka $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wi[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public awy[] a(boolean $$0, Function<wi, awy> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new awy[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wi[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cka $$0) {
      for (wi $$1 : this.b($$0.Y())) {
         xf $$2 = $$1.a();
         wg $$3 = $$2.h();
         if ($$3 != null && $$3.a() == wg.a.c) {
            return true;
         }
      }

      return false;
   }
}
