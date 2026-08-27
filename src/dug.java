import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dug implements dtt {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jg.v(16).optionalFieldOf("offset", jg.g).forGetter($$0x -> $$0x.e), dmz.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dug::new)
   );
   private final jg e;
   private final dmz f;

   protected dug(jg $$0, dmz $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cxu $$0, ib $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dtu<?> a() {
      return dtu.g;
   }
}
