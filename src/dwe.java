import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dwe {
   private static final Codec<xk[]> c = xm.g
      .listOf()
      .comapFlatMap(
         $$0 -> ae.a($$0, 4).map($$0x -> new xk[]{(xk)$$0x.get(0), (xk)$$0x.get(1), (xk)$$0x.get(2), (xk)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dwe::d),
               cwd.q.fieldOf("color").orElse(cwd.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dwe::a)
   );
   public static final int b = 4;
   private final xk[] d;
   private final xk[] e;
   private final cwd f;
   private final boolean g;
   @Nullable
   private azg[] h;
   private boolean i;

   public dwe() {
      this(c(), c(), cwd.p, false);
   }

   public dwe(xk[] $$0, xk[] $$1, cwd $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xk[] c() {
      return new xk[]{xj.a, xj.a, xj.a, xj.a};
   }

   private static dwe a(xk[] $$0, Optional<xk[]> $$1, cwd $$2, boolean $$3) {
      return new dwe($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dwe a(boolean $$0) {
      return $$0 == this.g ? this : new dwe(this.d, this.e, this.f, $$0);
   }

   public cwd b() {
      return this.f;
   }

   public dwe a(cwd $$0) {
      return $$0 == this.b() ? this : new dwe(this.d, this.e, $$0, this.g);
   }

   public xk a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dwe a(int $$0, xk $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dwe a(int $$0, xk $$1, xk $$2) {
      xk[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xk[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dwe($$3, $$4, this.f, this.g);
   }

   public boolean a(cpo $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xk[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public azg[] a(boolean $$0, Function<xk, azg> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new azg[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xk[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cpo $$0) {
      for (xk $$1 : this.b($$0.aa())) {
         yh $$2 = $$1.a();
         xi $$3 = $$2.i();
         if ($$3 != null && $$3.a() == xi.a.c) {
            return true;
         }
      }

      return false;
   }
}
