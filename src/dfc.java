import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfc(jr<cwk> d, int e, kt f, cwo g) {
   public static final Codec<dfc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwk.e.fieldOf("id").forGetter(dfc::a),
               ayi.m.fieldOf("count").orElse(1).forGetter(dfc::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(dfc::c)
            )
            .apply($$0, dfc::new)
   );
   public static final yn<wa, dfc> b = yn.a(yl.b(mc.K), dfc::a, yl.h, dfc::b, kt.b, dfc::c, dfc::new);
   public static final yn<wa, Optional<dfc>> c = b.a(yl::a);

   public dfc(dgg $$0) {
      this($$0, 1);
   }

   public dfc(dgg $$0, int $$1) {
      this($$0.j().f(), $$1, kt.c);
   }

   public dfc(jr<cwk> $$0, int $$1, kt $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfc a(UnaryOperator<kt.a> $$0) {
      return new dfc(this.d, this.e, $$0.apply(kt.a()).a());
   }

   private static cwo a(jr<cwk> $$0, int $$1, kt $$2) {
      return new cwo($$0, $$1, $$2.c());
   }

   public boolean a(cwo $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jr<cwk> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kt c() {
      return this.f;
   }

   public cwo d() {
      return this.g;
   }
}
