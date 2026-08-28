import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehf extends ehs {
   public static final MapCodec<ehf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzd.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ehf::new)
   );
   private final dzd c;

   private ehf(dzd $$0) {
      this.c = $$0;
   }

   public static ehf a(dzd $$0) {
      return new ehf($$0);
   }

   @Override
   protected boolean a(ehr $$0, azh $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehu<?> b() {
      return ehu.a;
   }
}
