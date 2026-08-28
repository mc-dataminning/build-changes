import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfd(jr<cwl> d, int e, kt f, cwp g) {
   public static final Codec<dfd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwl.e.fieldOf("id").forGetter(dfd::a),
               ayi.m.fieldOf("count").orElse(1).forGetter(dfd::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(dfd::c)
            )
            .apply($$0, dfd::new)
   );
   public static final yn<wa, dfd> b = yn.a(yl.b(mc.K), dfd::a, yl.h, dfd::b, kt.b, dfd::c, dfd::new);
   public static final yn<wa, Optional<dfd>> c = b.a(yl::a);

   public dfd(dgh $$0) {
      this($$0, 1);
   }

   public dfd(dgh $$0, int $$1) {
      this($$0.j().f(), $$1, kt.c);
   }

   public dfd(jr<cwl> $$0, int $$1, kt $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfd a(UnaryOperator<kt.a> $$0) {
      return new dfd(this.d, this.e, $$0.apply(kt.a()).a());
   }

   private static cwp a(jr<cwl> $$0, int $$1, kt $$2) {
      return new cwp($$0, $$1, $$2.c());
   }

   public boolean a(cwp $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jr<cwl> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kt c() {
      return this.f;
   }

   public cwp d() {
      return this.g;
   }
}
