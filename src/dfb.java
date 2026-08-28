import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfb(jr<cwj> d, int e, kt f, cwn g) {
   public static final Codec<dfb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwj.e.fieldOf("id").forGetter(dfb::a),
               ayh.m.fieldOf("count").orElse(1).forGetter(dfb::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(dfb::c)
            )
            .apply($$0, dfb::new)
   );
   public static final ym<vz, dfb> b = ym.a(yk.b(mc.K), dfb::a, yk.h, dfb::b, kt.b, dfb::c, dfb::new);
   public static final ym<vz, Optional<dfb>> c = b.a(yk::a);

   public dfb(dgf $$0) {
      this($$0, 1);
   }

   public dfb(dgf $$0, int $$1) {
      this($$0.j().f(), $$1, kt.c);
   }

   public dfb(jr<cwj> $$0, int $$1, kt $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfb a(UnaryOperator<kt.a> $$0) {
      return new dfb(this.d, this.e, $$0.apply(kt.a()).a());
   }

   private static cwn a(jr<cwj> $$0, int $$1, kt $$2) {
      return new cwn($$0, $$1, $$2.c());
   }

   public boolean a(cwn $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jr<cwj> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kt c() {
      return this.f;
   }

   public cwn d() {
      return this.g;
   }
}
