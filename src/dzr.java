import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dzr {
   private static final Codec<xa[]> c = xc.a
      .listOf()
      .comapFlatMap(
         $$0 -> ag.a($$0, 4).map($$0x -> new xa[]{(xa)$$0x.get(0), (xa)$$0x.get(1), (xa)$$0x.get(2), (xa)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dzr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dzr::d),
               cyw.q.fieldOf("color").orElse(cyw.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzr::a)
   );
   public static final int b = 4;
   private final xa[] d;
   private final xa[] e;
   private final cyw f;
   private final boolean g;
   @Nullable
   private aza[] h;
   private boolean i;

   public dzr() {
      this(c(), c(), cyw.p, false);
   }

   public dzr(xa[] $$0, xa[] $$1, cyw $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xa[] c() {
      return new xa[]{wz.a, wz.a, wz.a, wz.a};
   }

   private static dzr a(xa[] $$0, Optional<xa[]> $$1, cyw $$2, boolean $$3) {
      return new dzr($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dzr a(boolean $$0) {
      return $$0 == this.g ? this : new dzr(this.d, this.e, this.f, $$0);
   }

   public cyw b() {
      return this.f;
   }

   public dzr a(cyw $$0) {
      return $$0 == this.b() ? this : new dzr(this.d, this.e, $$0, this.g);
   }

   public xa a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dzr a(int $$0, xa $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dzr a(int $$0, xa $$1, xa $$2) {
      xa[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xa[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dzr($$3, $$4, this.f, this.g);
   }

   public boolean a(crx $$0) {
      return Arrays.stream(this.b($$0.X())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xa[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aza[] a(boolean $$0, Function<xa, aza> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aza[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xa[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(crx $$0) {
      for (xa $$1 : this.b($$0.X())) {
         xx $$2 = $$1.a();
         wy $$3 = $$2.i();
         if ($$3 != null && $$3.a() == wy.a.c) {
            return true;
         }
      }

      return false;
   }
}
