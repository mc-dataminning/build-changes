import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dhy {
   private static final Codec<vd[]> c = vf.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new vd[]{(vd)$$0x.get(0), (vd)$$0x.get(1), (vd)$$0x.get(2), (vd)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dhy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dhy::d),
               clf.q.fieldOf("color").orElse(clf.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dhy::a)
   );
   public static final int b = 4;
   private final vd[] d;
   private final vd[] e;
   private final clf f;
   private final boolean g;
   @Nullable
   private atu[] h;
   private boolean i;

   public dhy() {
      this(c(), c(), clf.p, false);
   }

   public dhy(vd[] $$0, vd[] $$1, clf $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static vd[] c() {
      return new vd[]{vc.a, vc.a, vc.a, vc.a};
   }

   private static dhy a(vd[] $$0, Optional<vd[]> $$1, clf $$2, boolean $$3) {
      return new dhy($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dhy a(boolean $$0) {
      return $$0 == this.g ? this : new dhy(this.d, this.e, this.f, $$0);
   }

   public clf b() {
      return this.f;
   }

   public dhy a(clf $$0) {
      return $$0 == this.b() ? this : new dhy(this.d, this.e, $$0, this.g);
   }

   public vd a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dhy a(int $$0, vd $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dhy a(int $$0, vd $$1, vd $$2) {
      vd[] $$3 = Arrays.copyOf(this.d, this.d.length);
      vd[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dhy($$3, $$4, this.f, this.g);
   }

   public boolean a(cfb $$0) {
      return Arrays.stream(this.b($$0.Y())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public vd[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public atu[] a(boolean $$0, Function<vd, atu> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new atu[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<vd[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cfb $$0) {
      for (vd $$1 : this.b($$0.Y())) {
         wa $$2 = $$1.a();
         vb $$3 = $$2.h();
         if ($$3 != null && $$3.a() == vb.a.c) {
            return true;
         }
      }

      return false;
   }
}
