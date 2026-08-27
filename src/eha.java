import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eha extends egj {
   public static final Codec<eha> a = RecordCodecBuilder.create($$0 -> a($$0).and(jy.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eha::new));
   private final ib<cng> b;

   private eha(List<ehw> $$0, ib<cng> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.z;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      cni.a($$0, this.b.a());
      return $$0;
   }

   public static egj.a<?> a(cng $$0) {
      return a($$1 -> new eha($$1, $$0.c()));
   }
}
