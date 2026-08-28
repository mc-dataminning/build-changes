import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dti {
   private static final Codec<xe[]> c = xg.g
      .listOf()
      .comapFlatMap(
         $$0 -> ad.a($$0, 4).map($$0x -> new xe[]{(xe)$$0x.get(0), (xe)$$0x.get(1), (xe)$$0x.get(2), (xe)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dti::d),
               cum.q.fieldOf("color").orElse(cum.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dti::a)
   );
   public static final int b = 4;
   private final xe[] d;
   private final xe[] e;
   private final cum f;
   private final boolean g;
   @Nullable
   private ayr[] h;
   private boolean i;

   public dti() {
      this(c(), c(), cum.p, false);
   }

   public dti(xe[] $$0, xe[] $$1, cum $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xe[] c() {
      return new xe[]{xd.a, xd.a, xd.a, xd.a};
   }

   private static dti a(xe[] $$0, Optional<xe[]> $$1, cum $$2, boolean $$3) {
      return new dti($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dti a(boolean $$0) {
      return $$0 == this.g ? this : new dti(this.d, this.e, this.f, $$0);
   }

   public cum b() {
      return this.f;
   }

   public dti a(cum $$0) {
      return $$0 == this.b() ? this : new dti(this.d, this.e, $$0, this.g);
   }

   public xe a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dti a(int $$0, xe $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dti a(int $$0, xe $$1, xe $$2) {
      xe[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xe[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dti($$3, $$4, this.f, this.g);
   }

   public boolean a(cnx $$0) {
      return Arrays.stream(this.b($$0.ab())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xe[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayr[] a(boolean $$0, Function<xe, ayr> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayr[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xe[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cnx $$0) {
      for (xe $$1 : this.b($$0.ab())) {
         yb $$2 = $$1.a();
         xc $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xc.a.c) {
            return true;
         }
      }

      return false;
   }
}
