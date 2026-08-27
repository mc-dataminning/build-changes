import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class daw {
   private static final Codec<sw[]> c = aoi.c
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new sw[]{(sw)$$0x.get(0), (sw)$$0x.get(1), (sw)$$0x.get(2), (sw)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<daw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(daw::d),
               cen.q.fieldOf("color").orElse(cen.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, daw::a)
   );
   public static final int b = 4;
   private final sw[] d;
   private final sw[] e;
   private final cen f;
   private final boolean g;
   @Nullable
   private aom[] h;
   private boolean i;

   public daw() {
      this(c(), c(), cen.p, false);
   }

   public daw(sw[] $$0, sw[] $$1, cen $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static sw[] c() {
      return new sw[]{sv.a, sv.a, sv.a, sv.a};
   }

   private static daw a(sw[] $$0, Optional<sw[]> $$1, cen $$2, boolean $$3) {
      sw[] $$4 = $$1.orElseGet(daw::c);
      a($$0, $$4);
      return new daw($$0, $$4, $$2, $$3);
   }

   private static void a(sw[] $$0, sw[] $$1) {
      for (int $$2 = 0; $$2 < 4; $$2++) {
         if ($$1[$$2].equals(sv.a)) {
            $$1[$$2] = $$0[$$2];
         }
      }
   }

   public boolean a() {
      return this.g;
   }

   public daw a(boolean $$0) {
      return $$0 == this.g ? this : new daw(this.d, this.e, this.f, $$0);
   }

   public cen b() {
      return this.f;
   }

   public daw a(cen $$0) {
      return $$0 == this.b() ? this : new daw(this.d, this.e, $$0, this.g);
   }

   public sw a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public daw a(int $$0, sw $$1) {
      return this.a($$0, $$1, $$1);
   }

   public daw a(int $$0, sw $$1, sw $$2) {
      sw[] $$3 = Arrays.copyOf(this.d, this.d.length);
      sw[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new daw($$3, $$4, this.f, this.g);
   }

   public boolean a(byo $$0) {
      return Arrays.stream(this.b($$0.U())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public sw[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public aom[] a(boolean $$0, Function<sw, aom> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new aom[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<sw[]> d() {
      sw[] $$0 = new sw[4];
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 4; $$2++) {
         sw $$3 = this.e[$$2];
         if (!$$3.equals(this.d[$$2])) {
            $$0[$$2] = $$3;
            $$1 = true;
         } else {
            $$0[$$2] = sv.a;
         }
      }

      return $$1 ? Optional.of($$0) : Optional.empty();
   }

   public boolean b(byo $$0) {
      for (sw $$1 : this.b($$0.U())) {
         ts $$2 = $$1.a();
         su $$3 = $$2.h();
         if ($$3 != null && $$3.a() == su.a.c) {
            return true;
         }
      }

      return false;
   }
}
