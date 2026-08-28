import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqs {
   private static final Codec<xp[]> c = xr.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new xp[]{(xp)$$0x.get(0), (xp)$$0x.get(1), (xp)$$0x.get(2), (xp)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dqs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dqs::d),
               cti.q.fieldOf("color").orElse(cti.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dqs::a)
   );
   public static final int b = 4;
   private final xp[] d;
   private final xp[] e;
   private final cti f;
   private final boolean g;
   @Nullable
   private ayl[] h;
   private boolean i;

   public dqs() {
      this(c(), c(), cti.p, false);
   }

   public dqs(xp[] $$0, xp[] $$1, cti $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xp[] c() {
      return new xp[]{xo.a, xo.a, xo.a, xo.a};
   }

   private static dqs a(xp[] $$0, Optional<xp[]> $$1, cti $$2, boolean $$3) {
      return new dqs($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dqs a(boolean $$0) {
      return $$0 == this.g ? this : new dqs(this.d, this.e, this.f, $$0);
   }

   public cti b() {
      return this.f;
   }

   public dqs a(cti $$0) {
      return $$0 == this.b() ? this : new dqs(this.d, this.e, $$0, this.g);
   }

   public xp a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dqs a(int $$0, xp $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dqs a(int $$0, xp $$1, xp $$2) {
      xp[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xp[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dqs($$3, $$4, this.f, this.g);
   }

   public boolean a(cmx $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xp[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayl[] a(boolean $$0, Function<xp, ayl> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayl[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xp[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cmx $$0) {
      for (xp $$1 : this.b($$0.Y())) {
         ym $$2 = $$1.a();
         xn $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xn.a.c) {
            return true;
         }
      }

      return false;
   }
}
