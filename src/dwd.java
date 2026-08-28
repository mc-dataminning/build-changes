import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dwd {
   private static final Codec<xv[]> c = xx.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xv[]{(xv)$$0x.get(0), (xv)$$0x.get(1), (xv)$$0x.get(2), (xv)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dwd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dwd::d),
               cwh.q.fieldOf("color").orElse(cwh.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dwd::a)
   );
   public static final int b = 4;
   private final xv[] d;
   private final xv[] e;
   private final cwh f;
   private final boolean g;
   @Nullable
   private azq[] h;
   private boolean i;

   public dwd() {
      this(c(), c(), cwh.p, false);
   }

   public dwd(xv[] $$0, xv[] $$1, cwh $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xv[] c() {
      return new xv[]{xu.a, xu.a, xu.a, xu.a};
   }

   private static dwd a(xv[] $$0, Optional<xv[]> $$1, cwh $$2, boolean $$3) {
      return new dwd($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dwd a(boolean $$0) {
      return $$0 == this.g ? this : new dwd(this.d, this.e, this.f, $$0);
   }

   public cwh b() {
      return this.f;
   }

   public dwd a(cwh $$0) {
      return $$0 == this.b() ? this : new dwd(this.d, this.e, $$0, this.g);
   }

   public xv a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dwd a(int $$0, xv $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dwd a(int $$0, xv $$1, xv $$2) {
      xv[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xv[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dwd($$3, $$4, this.f, this.g);
   }

   public boolean a(cps $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xv[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public azq[] a(boolean $$0, Function<xv, azq> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new azq[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xv[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cps $$0) {
      for (xv $$1 : this.b($$0.aa())) {
         ys $$2 = $$1.a();
         xt $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xt.a.c) {
            return true;
         }
      }

      return false;
   }
}
