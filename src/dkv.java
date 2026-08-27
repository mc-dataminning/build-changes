import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkv {
   private static final Codec<vs[]> c = vu.e
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vs[]{(vs)$$0x.get(0), (vs)$$0x.get(1), (vs)$$0x.get(2), (vs)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dkv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dkv::d),
               cog.q.fieldOf("color").orElse(cog.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dkv::a)
   );
   public static final int b = 4;
   private final vs[] d;
   private final vs[] e;
   private final cog f;
   private final boolean g;
   @Nullable
   private avy[] h;
   private boolean i;

   public dkv() {
      this(c(), c(), cog.p, false);
   }

   public dkv(vs[] $$0, vs[] $$1, cog $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vs[] c() {
      return new vs[]{vr.a, vr.a, vr.a, vr.a};
   }

   private static dkv a(vs[] $$0, Optional<vs[]> $$1, cog $$2, boolean $$3) {
      return new dkv($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dkv a(boolean $$0) {
      return $$0 == this.g ? this : new dkv(this.d, this.e, this.f, $$0);
   }

   public cog b() {
      return this.f;
   }

   public dkv a(cog $$0) {
      return $$0 == this.b() ? this : new dkv(this.d, this.e, $$0, this.g);
   }

   public vs a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dkv a(int $$0, vs $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dkv a(int $$0, vs $$1, vs $$2) {
      vs[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vs[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dkv($$3, $$4, this.f, this.g);
   }

   public boolean a(cia $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vs[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public avy[] a(boolean $$0, Function<vs, avy> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new avy[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vs[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cia $$0) {
      for (vs $$1 : this.b($$0.Y())) {
         wp $$2 = $$1.a();
         vq $$3 = $$2.h();
         if ($$3 != null && $$3.a() == vq.a.c) {
            return true;
         }
      }

      return false;
   }
}
