import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddt {
   private static final Codec<te[]> c = aqw.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new te[]{(te)$$0x.get(0), (te)$$0x.get(1), (te)$$0x.get(2), (te)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<ddt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(ddt::d),
               chk.q.fieldOf("color").orElse(chk.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ddt::a)
   );
   public static final int b = 4;
   private final te[] d;
   private final te[] e;
   private final chk f;
   private final boolean g;
   @Nullable
   private ara[] h;
   private boolean i;

   public ddt() {
      this(c(), c(), chk.p, false);
   }

   public ddt(te[] $$0, te[] $$1, chk $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static te[] c() {
      return new te[]{td.a, td.a, td.a, td.a};
   }

   private static ddt a(te[] $$0, Optional<te[]> $$1, chk $$2, boolean $$3) {
      return new ddt($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public ddt a(boolean $$0) {
      return $$0 == this.g ? this : new ddt(this.d, this.e, this.f, $$0);
   }

   public chk b() {
      return this.f;
   }

   public ddt a(chk $$0) {
      return $$0 == this.b() ? this : new ddt(this.d, this.e, $$0, this.g);
   }

   public te a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public ddt a(int $$0, te $$1) {
      return this.a($$0, $$1, $$1);
   }

   public ddt a(int $$0, te $$1, te $$2) {
      te[] $$3 = Arrays.copyOf(this.d, this.d.length);
      te[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new ddt($$3, $$4, this.f, this.g);
   }

   public boolean a(cbl $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public te[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ara[] a(boolean $$0, Function<te, ara> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ara[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<te[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cbl $$0) {
      for (te $$1 : this.b($$0.W())) {
         ua $$2 = $$1.a();
         tc $$3 = $$2.h();
         if ($$3 != null && $$3.a() == tc.a.c) {
            return true;
         }
      }

      return false;
   }
}
