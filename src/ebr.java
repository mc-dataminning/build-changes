import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebr {
   public static final Codec<ebr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ebr::new)
   );
   public final ix<egn> b;
   public final float c;

   public ebr(ix<egn> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dbs $$0, dsy $$1, ayk $$2, io $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
