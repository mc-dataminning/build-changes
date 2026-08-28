import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdw(float b, dgs c, jf<dgl> g) implements fdq {
   public static final MapCodec<fdw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fdw::c),
               dgs.b.fieldOf("enchanted_chance").forGetter(fdw::d),
               dgl.c.fieldOf("enchantment").forGetter(fdw::e)
            )
            .apply($$0, fdw::new)
   );

   @Override
   public fdr b() {
      return fds.e;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.d);
   }

   public boolean a(fah $$0) {
      bwt $$1 = $$0.c(fdb.d);
      int $$3 = $$1 instanceof bxu $$2 ? dgn.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fdq.a a(jh.a $$0, float $$1, float $$2) {
      jh.b<dgl> $$3 = $$0.e(mh.aR);
      return () -> new fdw($$1, new dgs.e($$1 + $$2, $$2), $$3.b(dgq.s));
   }

   public float c() {
      return this.b;
   }

   public dgs d() {
      return this.c;
   }

   public jf<dgl> e() {
      return this.g;
   }
}
