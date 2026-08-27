import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eee extends edt {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqa.b(jc.B).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eee::new)
   );
   private final aqa<ciq> b;

   private eee(List<efg> $$0, aqa<ciq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.A;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      cir.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static edt.a<?> a(aqa<ciq> $$0) {
      return a($$1 -> new eee($$1, $$0));
   }
}
