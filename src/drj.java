import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drj extends dri {
   public static final MapCodec<drj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mh.e.q().fieldOf("host").forGetter(dri::b), t()).apply($$0, drj::new));

   @Override
   public MapCodec<drj> a() {
      return b;
   }

   public drj(dne $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dtx.d, jc.a.b));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return dtx.b($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(dtx.d);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(dtx.d, $$0.k().o());
   }
}
