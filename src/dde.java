import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dde(jo<cvn> d, int e, kq f, cvs g) {
   public static final Codec<dde> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvs.a.fieldOf("id").forGetter(dde::a),
               ayo.l.fieldOf("count").orElse(1).forGetter(dde::b),
               kq.a.optionalFieldOf("components", kq.c).forGetter(dde::c)
            )
            .apply($$0, dde::new)
   );
   public static final zc<wp, dde> b = zc.a(za.b(lw.K), dde::a, za.h, dde::b, kq.b, dde::c, dde::new);
   public static final zc<wp, Optional<dde>> c = b.a(za::a);

   public dde(dei $$0) {
      this($$0, 1);
   }

   public dde(dei $$0, int $$1) {
      this($$0.q().n(), $$1, kq.c);
   }

   public dde(jo<cvn> $$0, int $$1, kq $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dde a(UnaryOperator<kq.a> $$0) {
      return new dde(this.d, this.e, $$0.apply(kq.a()).a());
   }

   private static cvs a(jo<cvn> $$0, int $$1, kq $$2) {
      return new cvs($$0, $$1, $$2.c());
   }

   public boolean a(cvs $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jo<cvn> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kq c() {
      return this.f;
   }

   public cvs d() {
      return this.g;
   }
}
