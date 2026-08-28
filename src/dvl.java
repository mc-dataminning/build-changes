import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dvl {
   private static final Codec<wo[]> c = wq.g
      .listOf()
      .comapFlatMap(
         $$0 -> af.a($$0, 4).map($$0x -> new wo[]{(wo)$$0x.get(0), (wo)$$0x.get(1), (wo)$$0x.get(2), (wo)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dvl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dvl::d),
               cvk.q.fieldOf("color").orElse(cvk.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dvl::a)
   );
   public static final int b = 4;
   private final wo[] d;
   private final wo[] e;
   private final cvk f;
   private final boolean g;
   @Nullable
   private ayk[] h;
   private boolean i;

   public dvl() {
      this(c(), c(), cvk.p, false);
   }

   public dvl(wo[] $$0, wo[] $$1, cvk $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wo[] c() {
      return new wo[]{wn.a, wn.a, wn.a, wn.a};
   }

   private static dvl a(wo[] $$0, Optional<wo[]> $$1, cvk $$2, boolean $$3) {
      return new dvl($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dvl a(boolean $$0) {
      return $$0 == this.g ? this : new dvl(this.d, this.e, this.f, $$0);
   }

   public cvk b() {
      return this.f;
   }

   public dvl a(cvk $$0) {
      return $$0 == this.b() ? this : new dvl(this.d, this.e, $$0, this.g);
   }

   public wo a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dvl a(int $$0, wo $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dvl a(int $$0, wo $$1, wo $$2) {
      wo[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wo[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dvl($$3, $$4, this.f, this.g);
   }

   public boolean a(cov $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wo[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayk[] a(boolean $$0, Function<wo, ayk> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayk[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wo[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cov $$0) {
      for (wo $$1 : this.b($$0.aa())) {
         xl $$2 = $$1.a();
         wm $$3 = $$2.i();
         if ($$3 != null && $$3.a() == wm.a.c) {
            return true;
         }
      }

      return false;
   }
}
