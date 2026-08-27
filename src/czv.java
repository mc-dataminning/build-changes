import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record czv(ix<ctl> d, int e, jz f, ctq g) {
   public static final Codec<czv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.h.r().fieldOf("id").forGetter(czv::a),
               axn.j.fieldOf("count").orElse(1).forGetter(czv::b),
               jz.a.optionalFieldOf("components", jz.c).forGetter(czv::c)
            )
            .apply($$0, czv::new)
   );
   public static final yv<wi, czv> b = yv.a(yt.b(lf.G), czv::a, yt.f, czv::b, jz.b, czv::c, czv::new);
   public static final yv<wi, Optional<czv>> c = b.a(yt::a);

   public czv(day $$0) {
      this($$0, 1);
   }

   public czv(day $$0, int $$1) {
      this($$0.r().o(), $$1, jz.c);
   }

   public czv(ix<ctl> $$0, int $$1, jz $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public czv a(UnaryOperator<jz.a> $$0) {
      return new czv(this.d, this.e, $$0.apply(jz.a()).a());
   }

   private static ctq a(ix<ctl> $$0, int $$1, jz $$2) {
      return new ctq($$0, $$1, $$2.c());
   }

   public boolean a(ctq $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ix<ctl> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jz c() {
      return this.f;
   }

   public ctq d() {
      return this.g;
   }
}
