import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epb extends epo {
   public static final MapCodec<epb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egu.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, epb::new)
   );
   private final egu c;

   private epb(egu $$0) {
      this.c = $$0;
   }

   public static epb a(egu $$0) {
      return new epb($$0);
   }

   @Override
   protected boolean a(epn $$0, azt $$1, iu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public epq<?> b() {
      return epq.a;
   }
}
