import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dee {
   private static final Codec<tm[]> c = arg.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new tm[]{(tm)$$0x.get(0), (tm)$$0x.get(1), (tm)$$0x.get(2), (tm)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dee::d),
               cht.q.fieldOf("color").orElse(cht.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dee::a)
   );
   public static final int b = 4;
   private final tm[] d;
   private final tm[] e;
   private final cht f;
   private final boolean g;
   @Nullable
   private ark[] h;
   private boolean i;

   public dee() {
      this(c(), c(), cht.p, false);
   }

   public dee(tm[] $$0, tm[] $$1, cht $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static tm[] c() {
      return new tm[]{tl.a, tl.a, tl.a, tl.a};
   }

   private static dee a(tm[] $$0, Optional<tm[]> $$1, cht $$2, boolean $$3) {
      return new dee($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dee a(boolean $$0) {
      return $$0 == this.g ? this : new dee(this.d, this.e, this.f, $$0);
   }

   public cht b() {
      return this.f;
   }

   public dee a(cht $$0) {
      return $$0 == this.b() ? this : new dee(this.d, this.e, $$0, this.g);
   }

   public tm a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dee a(int $$0, tm $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dee a(int $$0, tm $$1, tm $$2) {
      tm[] $$3 = Arrays.copyOf(this.d, this.d.length);
      tm[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dee($$3, $$4, this.f, this.g);
   }

   public boolean a(cbu $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public tm[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ark[] a(boolean $$0, Function<tm, ark> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ark[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<tm[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cbu $$0) {
      for (tm $$1 : this.b($$0.W())) {
         ui $$2 = $$1.a();
         tk $$3 = $$2.h();
         if ($$3 != null && $$3.a() == tk.a.c) {
            return true;
         }
      }

      return false;
   }
}
