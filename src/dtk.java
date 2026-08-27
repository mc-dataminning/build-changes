import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk implements dsx {
   public static final Codec<dtk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.v(16).optionalFieldOf("offset", jf.g).forGetter($$0x -> $$0x.e), dme.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dtk::new)
   );
   private final jf e;
   private final dme f;

   protected dtk(jf $$0, dme $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cwz $$0, ib $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dsy<?> a() {
      return dsy.g;
   }
}
