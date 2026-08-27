import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eei extends edx {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqd.b(je.B).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eei::new)
   );
   private final aqd<cis> b;

   private eei(List<efk> $$0, aqd<cis> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edz b() {
      return eea.A;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      cit.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static edx.a<?> a(aqd<cis> $$0) {
      return a($$1 -> new eei($$1, $$0));
   }
}
