import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dgb {
   private static final Codec<ur[]> c = ut.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new ur[]{(ur)$$0x.get(0), (ur)$$0x.get(1), (ur)$$0x.get(2), (ur)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dgb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dgb::d),
               cjp.q.fieldOf("color").orElse(cjp.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dgb::a)
   );
   public static final int b = 4;
   private final ur[] d;
   private final ur[] e;
   private final cjp f;
   private final boolean g;
   @Nullable
   private asu[] h;
   private boolean i;

   public dgb() {
      this(c(), c(), cjp.p, false);
   }

   public dgb(ur[] $$0, ur[] $$1, cjp $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static ur[] c() {
      return new ur[]{uq.a, uq.a, uq.a, uq.a};
   }

   private static dgb a(ur[] $$0, Optional<ur[]> $$1, cjp $$2, boolean $$3) {
      return new dgb($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dgb a(boolean $$0) {
      return $$0 == this.g ? this : new dgb(this.d, this.e, this.f, $$0);
   }

   public cjp b() {
      return this.f;
   }

   public dgb a(cjp $$0) {
      return $$0 == this.b() ? this : new dgb(this.d, this.e, $$0, this.g);
   }

   public ur a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dgb a(int $$0, ur $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dgb a(int $$0, ur $$1, ur $$2) {
      ur[] $$3 = Arrays.copyOf(this.d, this.d.length);
      ur[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dgb($$3, $$4, this.f, this.g);
   }

   public boolean a(cdm $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public ur[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public asu[] a(boolean $$0, Function<ur, asu> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new asu[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<ur[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cdm $$0) {
      for (ur $$1 : this.b($$0.W())) {
         vo $$2 = $$1.a();
         up $$3 = $$2.h();
         if ($$3 != null && $$3.a() == up.a.c) {
            return true;
         }
      }

      return false;
   }
}
