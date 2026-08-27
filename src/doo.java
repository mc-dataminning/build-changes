import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class doo {
   private static final Codec<ws[]> c = wu.g
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new ws[]{(ws)$$0x.get(0), (ws)$$0x.get(1), (ws)$$0x.get(2), (ws)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<doo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(doo::d),
               cqw.q.fieldOf("color").orElse(cqw.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, doo::a)
   );
   public static final int b = 4;
   private final ws[] d;
   private final ws[] e;
   private final cqw f;
   private final boolean g;
   @Nullable
   private axi[] h;
   private boolean i;

   public doo() {
      this(c(), c(), cqw.p, false);
   }

   public doo(ws[] $$0, ws[] $$1, cqw $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static ws[] c() {
      return new ws[]{wr.a, wr.a, wr.a, wr.a};
   }

   private static doo a(ws[] $$0, Optional<ws[]> $$1, cqw $$2, boolean $$3) {
      return new doo($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public doo a(boolean $$0) {
      return $$0 == this.g ? this : new doo(this.d, this.e, this.f, $$0);
   }

   public cqw b() {
      return this.f;
   }

   public doo a(cqw $$0) {
      return $$0 == this.b() ? this : new doo(this.d, this.e, $$0, this.g);
   }

   public ws a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public doo a(int $$0, ws $$1) {
      return this.a($$0, $$1, $$1);
   }

   public doo a(int $$0, ws $$1, ws $$2) {
      ws[] $$3 = Arrays.copyOf(this.d, this.d.length);
      ws[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new doo($$3, $$4, this.f, this.g);
   }

   public boolean a(ckl $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public ws[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public axi[] a(boolean $$0, Function<ws, axi> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new axi[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<ws[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(ckl $$0) {
      for (ws $$1 : this.b($$0.Y())) {
         xp $$2 = $$1.a();
         wq $$3 = $$2.h();
         if ($$3 != null && $$3.a() == wq.a.c) {
            return true;
         }
      }

      return false;
   }
}
