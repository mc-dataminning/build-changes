import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dav(ji<cul> d, int e, kk f, cuq g) {
   public static final Codec<dav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuq.a.fieldOf("id").forGetter(dav::a),
               ayh.l.fieldOf("count").orElse(1).forGetter(dav::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(dav::c)
            )
            .apply($$0, dav::new)
   );
   public static final zn<xa, dav> b = zn.a(zl.b(lq.G), dav::a, zl.g, dav::b, kk.b, dav::c, dav::new);
   public static final zn<xa, Optional<dav>> c = b.a(zl::a);

   public dav(dby $$0) {
      this($$0, 1);
   }

   public dav(dby $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public dav(ji<cul> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dav a(UnaryOperator<kk.a> $$0) {
      return new dav(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cuq a(ji<cul> $$0, int $$1, kk $$2) {
      return new cuq($$0, $$1, $$2.c());
   }

   public boolean a(cuq $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cul> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cuq d() {
      return this.g;
   }
}
