import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egz extends ego {
   public static final Codec<egz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arz.b(kd.C).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, egz::new)
   );
   private final arz<clg> b;

   private egz(List<eib> $$0, arz<clg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egq b() {
      return egr.A;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      clh.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ego.a<?> a(arz<clg> $$0) {
      return a($$1 -> new egz($$1, $$0));
   }
}
