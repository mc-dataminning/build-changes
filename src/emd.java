import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emd extends emq {
   public static final MapCodec<emd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edx.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, emd::new)
   );
   private final edx c;

   private emd(edx $$0) {
      this.c = $$0;
   }

   public static emd a(edx $$0) {
      return new emd($$0);
   }

   @Override
   protected boolean a(emp $$0, azg $$1, ji $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ems<?> b() {
      return ems.a;
   }
}
