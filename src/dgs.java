import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dgs {
   private static final Codec<uv[]> c = ux.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new uv[]{(uv)$$0x.get(0), (uv)$$0x.get(1), (uv)$$0x.get(2), (uv)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dgs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dgs::d),
               ckc.q.fieldOf("color").orElse(ckc.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dgs::a)
   );
   public static final int b = 4;
   private final uv[] d;
   private final uv[] e;
   private final ckc f;
   private final boolean g;
   @Nullable
   private atc[] h;
   private boolean i;

   public dgs() {
      this(c(), c(), ckc.p, false);
   }

   public dgs(uv[] $$0, uv[] $$1, ckc $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static uv[] c() {
      return new uv[]{uu.a, uu.a, uu.a, uu.a};
   }

   private static dgs a(uv[] $$0, Optional<uv[]> $$1, ckc $$2, boolean $$3) {
      return new dgs($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dgs a(boolean $$0) {
      return $$0 == this.g ? this : new dgs(this.d, this.e, this.f, $$0);
   }

   public ckc b() {
      return this.f;
   }

   public dgs a(ckc $$0) {
      return $$0 == this.b() ? this : new dgs(this.d, this.e, $$0, this.g);
   }

   public uv a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dgs a(int $$0, uv $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dgs a(int $$0, uv $$1, uv $$2) {
      uv[] $$3 = Arrays.copyOf(this.d, this.d.length);
      uv[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dgs($$3, $$4, this.f, this.g);
   }

   public boolean a(cdz $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public uv[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public atc[] a(boolean $$0, Function<uv, atc> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new atc[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<uv[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cdz $$0) {
      for (uv $$1 : this.b($$0.Y())) {
         vs $$2 = $$1.a();
         ut $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ut.a.c) {
            return true;
         }
      }

      return false;
   }
}
