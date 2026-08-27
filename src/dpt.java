import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpt {
   private static final Codec<wx[]> c = wz.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wx[]{(wx)$$0x.get(0), (wx)$$0x.get(1), (wx)$$0x.get(2), (wx)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dpt::d),
               csj.q.fieldOf("color").orElse(csj.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dpt::a)
   );
   public static final int b = 4;
   private final wx[] d;
   private final wx[] e;
   private final csj f;
   private final boolean g;
   @Nullable
   private axr[] h;
   private boolean i;

   public dpt() {
      this(c(), c(), csj.p, false);
   }

   public dpt(wx[] $$0, wx[] $$1, csj $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wx[] c() {
      return new wx[]{ww.a, ww.a, ww.a, ww.a};
   }

   private static dpt a(wx[] $$0, Optional<wx[]> $$1, csj $$2, boolean $$3) {
      return new dpt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dpt a(boolean $$0) {
      return $$0 == this.g ? this : new dpt(this.d, this.e, this.f, $$0);
   }

   public csj b() {
      return this.f;
   }

   public dpt a(csj $$0) {
      return $$0 == this.b() ? this : new dpt(this.d, this.e, $$0, this.g);
   }

   public wx a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dpt a(int $$0, wx $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dpt a(int $$0, wx $$1, wx $$2) {
      wx[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wx[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dpt($$3, $$4, this.f, this.g);
   }

   public boolean a(cly $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wx[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public axr[] a(boolean $$0, Function<wx, axr> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new axr[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wx[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cly $$0) {
      for (wx $$1 : this.b($$0.Y())) {
         xu $$2 = $$1.a();
         wv $$3 = $$2.h();
         if ($$3 != null && $$3.a() == wv.a.c) {
            return true;
         }
      }

      return false;
   }
}
