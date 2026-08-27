import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egu extends egj {
   public static final Codec<egu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arv.b(jz.C).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, egu::new)
   );
   private final arv<clb> b;

   private egu(List<ehw> $$0, arv<clb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public egl b() {
      return egm.A;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      clc.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static egj.a<?> a(arv<clb> $$0) {
      return a($$1 -> new egu($$1, $$0));
   }
}
