import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record daw(ji<cum> d, int e, kk f, cur g) {
   public static final Codec<daw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cur.a.fieldOf("id").forGetter(daw::a),
               ayh.l.fieldOf("count").orElse(1).forGetter(daw::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(daw::c)
            )
            .apply($$0, daw::new)
   );
   public static final zn<xa, daw> b = zn.a(zl.b(lq.G), daw::a, zl.g, daw::b, kk.b, daw::c, daw::new);
   public static final zn<xa, Optional<daw>> c = b.a(zl::a);

   public daw(dbz $$0) {
      this($$0, 1);
   }

   public daw(dbz $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public daw(ji<cum> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public daw a(UnaryOperator<kk.a> $$0) {
      return new daw(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cur a(ji<cum> $$0, int $$1, kk $$2) {
      return new cur($$0, $$1, $$2.c());
   }

   public boolean a(cur $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cum> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cur d() {
      return this.g;
   }
}
