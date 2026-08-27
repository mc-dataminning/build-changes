import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnq {
   private static final Codec<wg[]> c = wi.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new wg[]{(wg)$$0x.get(0), (wg)$$0x.get(1), (wg)$$0x.get(2), (wg)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dnq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dnq::d),
               cqc.q.fieldOf("color").orElse(cqc.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dnq::a)
   );
   public static final int b = 4;
   private final wg[] d;
   private final wg[] e;
   private final cqc f;
   private final boolean g;
   @Nullable
   private aww[] h;
   private boolean i;

   public dnq() {
      this(c(), c(), cqc.p, false);
   }

   public dnq(wg[] $$0, wg[] $$1, cqc $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wg[] c() {
      return new wg[]{wf.a, wf.a, wf.a, wf.a};
   }

   private static dnq a(wg[] $$0, Optional<wg[]> $$1, cqc $$2, boolean $$3) {
      return new dnq($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dnq a(boolean $$0) {
      return $$0 == this.g ? this : new dnq(this.d, this.e, this.f, $$0);
   }

   public cqc b() {
      return this.f;
   }

   public dnq a(cqc $$0) {
      return $$0 == this.b() ? this : new dnq(this.d, this.e, $$0, this.g);
   }

   public wg a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dnq a(int $$0, wg $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dnq a(int $$0, wg $$1, wg $$2) {
      wg[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wg[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dnq($$3, $$4, this.f, this.g);
   }

   public boolean a(cjt $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wg[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aww[] a(boolean $$0, Function<wg, aww> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aww[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wg[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cjt $$0) {
      for (wg $$1 : this.b($$0.Y())) {
         xd $$2 = $$1.a();
         we $$3 = $$2.h();
         if ($$3 != null && $$3.a() == we.a.c) {
            return true;
         }
      }

      return false;
   }
}
