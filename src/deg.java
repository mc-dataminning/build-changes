import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class deg {
   private static final Codec<tn[]> c = arh.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new tn[]{(tn)$$0x.get(0), (tn)$$0x.get(1), (tn)$$0x.get(2), (tn)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<deg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(deg::d),
               chv.q.fieldOf("color").orElse(chv.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, deg::a)
   );
   public static final int b = 4;
   private final tn[] d;
   private final tn[] e;
   private final chv f;
   private final boolean g;
   @Nullable
   private arl[] h;
   private boolean i;

   public deg() {
      this(c(), c(), chv.p, false);
   }

   public deg(tn[] $$0, tn[] $$1, chv $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static tn[] c() {
      return new tn[]{tm.a, tm.a, tm.a, tm.a};
   }

   private static deg a(tn[] $$0, Optional<tn[]> $$1, chv $$2, boolean $$3) {
      return new deg($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public deg a(boolean $$0) {
      return $$0 == this.g ? this : new deg(this.d, this.e, this.f, $$0);
   }

   public chv b() {
      return this.f;
   }

   public deg a(chv $$0) {
      return $$0 == this.b() ? this : new deg(this.d, this.e, $$0, this.g);
   }

   public tn a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public deg a(int $$0, tn $$1) {
      return this.a($$0, $$1, $$1);
   }

   public deg a(int $$0, tn $$1, tn $$2) {
      tn[] $$3 = Arrays.copyOf(this.d, this.d.length);
      tn[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new deg($$3, $$4, this.f, this.g);
   }

   public boolean a(cbw $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public tn[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public arl[] a(boolean $$0, Function<tn, arl> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new arl[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<tn[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cbw $$0) {
      for (tn $$1 : this.b($$0.W())) {
         uj $$2 = $$1.a();
         tl $$3 = $$2.h();
         if ($$3 != null && $$3.a() == tl.a.c) {
            return true;
         }
      }

      return false;
   }
}
