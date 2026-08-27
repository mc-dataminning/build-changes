import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ddz {
   private static final Codec<ti[]> c = arb.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new ti[]{(ti)$$0x.get(0), (ti)$$0x.get(1), (ti)$$0x.get(2), (ti)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<ddz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(ddz::d),
               cho.q.fieldOf("color").orElse(cho.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ddz::a)
   );
   public static final int b = 4;
   private final ti[] d;
   private final ti[] e;
   private final cho f;
   private final boolean g;
   @Nullable
   private arf[] h;
   private boolean i;

   public ddz() {
      this(c(), c(), cho.p, false);
   }

   public ddz(ti[] $$0, ti[] $$1, cho $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static ti[] c() {
      return new ti[]{th.a, th.a, th.a, th.a};
   }

   private static ddz a(ti[] $$0, Optional<ti[]> $$1, cho $$2, boolean $$3) {
      return new ddz($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public ddz a(boolean $$0) {
      return $$0 == this.g ? this : new ddz(this.d, this.e, this.f, $$0);
   }

   public cho b() {
      return this.f;
   }

   public ddz a(cho $$0) {
      return $$0 == this.b() ? this : new ddz(this.d, this.e, $$0, this.g);
   }

   public ti a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public ddz a(int $$0, ti $$1) {
      return this.a($$0, $$1, $$1);
   }

   public ddz a(int $$0, ti $$1, ti $$2) {
      ti[] $$3 = Arrays.copyOf(this.d, this.d.length);
      ti[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new ddz($$3, $$4, this.f, this.g);
   }

   public boolean a(cbp $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public ti[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public arf[] a(boolean $$0, Function<ti, arf> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new arf[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<ti[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cbp $$0) {
      for (ti $$1 : this.b($$0.W())) {
         ue $$2 = $$1.a();
         tg $$3 = $$2.h();
         if ($$3 != null && $$3.a() == tg.a.c) {
            return true;
         }
      }

      return false;
   }
}
