import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epk extends eox {
   public static final Codec<epk> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avt.b(ku.E).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, epk::new)
   );
   private final avt<crk> b;

   private epk(List<eql> $$0, avt<crk> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoz b() {
      return epa.B;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      crl.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eox.a<?> a(avt<crk> $$0) {
      return a($$1 -> new epk($$1, $$0));
   }
}
