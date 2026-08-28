import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsr {
   private static final Codec<xd[]> c = xf.g
      .listOf()
      .comapFlatMap(
         $$0 -> ad.a($$0, 4).map($$0x -> new xd[]{(xd)$$0x.get(0), (xd)$$0x.get(1), (xd)$$0x.get(2), (xd)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dsr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.lenientOptionalFieldOf("filtered_messages").forGetter(dsr::d),
               cue.q.fieldOf("color").orElse(cue.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dsr::a)
   );
   public static final int b = 4;
   private final xd[] d;
   private final xd[] e;
   private final cue f;
   private final boolean g;
   @Nullable
   private ayo[] h;
   private boolean i;

   public dsr() {
      this(c(), c(), cue.p, false);
   }

   public dsr(xd[] $$0, xd[] $$1, cue $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static xd[] c() {
      return new xd[]{xc.a, xc.a, xc.a, xc.a};
   }

   private static dsr a(xd[] $$0, Optional<xd[]> $$1, cue $$2, boolean $$3) {
      return new dsr($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dsr a(boolean $$0) {
      return $$0 == this.g ? this : new dsr(this.d, this.e, this.f, $$0);
   }

   public cue b() {
      return this.f;
   }

   public dsr a(cue $$0) {
      return $$0 == this.b() ? this : new dsr(this.d, this.e, $$0, this.g);
   }

   public xd a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dsr a(int $$0, xd $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dsr a(int $$0, xd $$1, xd $$2) {
      xd[] $$3 = Arrays.copyOf(this.d, this.d.length);
      xd[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dsr($$3, $$4, this.f, this.g);
   }

   public boolean a(cnp $$0) {
      return Arrays.stream(this.b($$0.ab())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public xd[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ayo[] a(boolean $$0, Function<xd, ayo> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ayo[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<xd[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(cnp $$0) {
      for (xd $$1 : this.b($$0.ab())) {
         ya $$2 = $$1.a();
         xb $$3 = $$2.h();
         if ($$3 != null && $$3.a() == xb.a.c) {
            return true;
         }
      }

      return false;
   }
}
