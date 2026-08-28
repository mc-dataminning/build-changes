import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtt {
   private static final Codec<xh[]> c = xj.g
      .listOf()
      .comapFlatMap(
         $$0 -> ad.a($$0, 4).map($$0x -> new xh[]{(xh)$$0x.get(0), (xh)$$0x.get(1), (xh)$$0x.get(2), (xh)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dtt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dtt::d),
               cuu.q.fieldOf("color").orElse(cuu.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dtt::a)
   );
   public static final int b = 4;
   private final xh[] d;
   private final xh[] e;
   private final cuu f;
   private final boolean g;
   @Nullable
   private ayv[] h;
   private boolean i;

   public dtt() {
      this(c(), c(), cuu.p, false);
   }

   public dtt(xh[] $$0, xh[] $$1, cuu $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xh[] c() {
      return new xh[]{xg.a, xg.a, xg.a, xg.a};
   }

   private static dtt a(xh[] $$0, Optional<xh[]> $$1, cuu $$2, boolean $$3) {
      return new dtt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dtt a(boolean $$0) {
      return $$0 == this.g ? this : new dtt(this.d, this.e, this.f, $$0);
   }

   public cuu b() {
      return this.f;
   }

   public dtt a(cuu $$0) {
      return $$0 == this.b() ? this : new dtt(this.d, this.e, $$0, this.g);
   }

   public xh a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dtt a(int $$0, xh $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dtt a(int $$0, xh $$1, xh $$2) {
      xh[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xh[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dtt($$3, $$4, this.f, this.g);
   }

   public boolean a(coh $$0) {
      return Arrays.stream(this.b($$0.ab())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xh[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayv[] a(boolean $$0, Function<xh, ayv> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayv[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xh[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(coh $$0) {
      for (xh $$1 : this.b($$0.ab())) {
         ye $$2 = $$1.a();
         xf $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xf.a.c) {
            return true;
         }
      }

      return false;
   }
}
