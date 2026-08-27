import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eek extends edt {
   public static final Codec<eek> a = RecordCodecBuilder.create($$0 -> a($$0).and(jb.j.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eek::new));
   private final he<ckv> b;

   private eek(List<efg> $$0, he<ckv> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public edv b() {
      return edw.z;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      ckx.a($$0, this.b.a());
      return $$0;
   }

   public static edt.a<?> a(ckv $$0) {
      return a($$1 -> new eek($$1, $$0.c()));
   }
}
