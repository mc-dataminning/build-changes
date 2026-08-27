import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlt extends dlz {
   final apy<csk> a;
   public static final Codec<dlt> e = RecordCodecBuilder.create($$0 -> a($$0).and(apy.a(jd.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dlt::new));

   protected dlt(ia $$0, apy<csk> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dey $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dlp<?> a() {
      return dlp.b;
   }
}
