import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dge(jg<dag> c, int d, kj e) {
   private static final Codec<dge> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dag.e.fieldOf("id").forGetter(dge::b),
               azg.a(1, 99).optionalFieldOf("count", 1).forGetter(dge::c),
               kj.b.optionalFieldOf("components", kj.a).forGetter(dge::d)
            )
            .apply($$0, dge::new)
   );
   public static final Codec<dge> a = Codec.withAlternative(f, dag.e, $$0 -> new dge((dag)$$0.a())).validate(dge::a);
   public static final ze<wp, dge> b = ze.a(dag.f, dge::b, zc.h, dge::c, kj.c, dge::d, dge::new);

   public dge(dag $$0) {
      this($$0.e(), 1, kj.a);
   }

   private static DataResult<dge> a(dge $$0) {
      return dak.a(new dak($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public dak a(dak $$0) {
      dak $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(dak $$0) {
      dak $$1 = this.a($$0);
      return $$1.M() == 1 && dak.c($$0, $$1);
   }

   public dgn a() {
      return new dgn.f(new dak(this.c, this.d, this.e));
   }

   public jg<dag> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public kj d() {
      return this.e;
   }
}
