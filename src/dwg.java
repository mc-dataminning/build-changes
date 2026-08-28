import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dwg {
   private static final Codec<wp[]> c = wr.a
      .listOf()
      .comapFlatMap(
         $$0 -> af.a($$0, 4).map($$0x -> new wp[]{(wp)$$0x.get(0), (wp)$$0x.get(1), (wp)$$0x.get(2), (wp)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dwg::d),
               cwe.q.fieldOf("color").orElse(cwe.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dwg::a)
   );
   public static final int b = 4;
   private final wp[] d;
   private final wp[] e;
   private final cwe f;
   private final boolean g;
   @Nullable
   private ayl[] h;
   private boolean i;

   public dwg() {
      this(c(), c(), cwe.p, false);
   }

   public dwg(wp[] $$0, wp[] $$1, cwe $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static wp[] c() {
      return new wp[]{wo.a, wo.a, wo.a, wo.a};
   }

   private static dwg a(wp[] $$0, Optional<wp[]> $$1, cwe $$2, boolean $$3) {
      return new dwg($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dwg a(boolean $$0) {
      return $$0 == this.g ? this : new dwg(this.d, this.e, this.f, $$0);
   }

   public cwe b() {
      return this.f;
   }

   public dwg a(cwe $$0) {
      return $$0 == this.b() ? this : new dwg(this.d, this.e, $$0, this.g);
   }

   public wp a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dwg a(int $$0, wp $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dwg a(int $$0, wp $$1, wp $$2) {
      wp[] $$3 = Arrays.copyOf(this.d, this.d.length);
      wp[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dwg($$3, $$4, this.f, this.g);
   }

   public boolean a(cpr $$0) {
      return Arrays.stream(this.b($$0.aa())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public wp[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayl[] a(boolean $$0, Function<wp, ayl> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayl[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<wp[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cpr $$0) {
      for (wp $$1 : this.b($$0.aa())) {
         xm $$2 = $$1.a();
         wn $$3 = $$2.i();
         if ($$3 != null && $$3.a() == wn.a.c) {
            return true;
         }
      }

      return false;
   }
}
