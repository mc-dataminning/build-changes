import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfe(jr<cwm> d, int e, kt f, cwq g) {
   public static final Codec<dfe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwm.e.fieldOf("id").forGetter(dfe::a),
               ayi.m.fieldOf("count").orElse(1).forGetter(dfe::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(dfe::c)
            )
            .apply($$0, dfe::new)
   );
   public static final yn<wa, dfe> b = yn.a(yl.b(mc.K), dfe::a, yl.h, dfe::b, kt.b, dfe::c, dfe::new);
   public static final yn<wa, Optional<dfe>> c = b.a(yl::a);

   public dfe(dgi $$0) {
      this($$0, 1);
   }

   public dfe(dgi $$0, int $$1) {
      this($$0.j().f(), $$1, kt.c);
   }

   public dfe(jr<cwm> $$0, int $$1, kt $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfe a(UnaryOperator<kt.a> $$0) {
      return new dfe(this.d, this.e, $$0.apply(kt.a()).a());
   }

   private static cwq a(jr<cwm> $$0, int $$1, kt $$2) {
      return new cwq($$0, $$1, $$2.c());
   }

   public boolean a(cwq $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jr<cwm> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kt c() {
      return this.f;
   }

   public cwq d() {
      return this.g;
   }
}
