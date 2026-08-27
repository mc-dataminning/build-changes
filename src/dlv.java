import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlv extends dmb {
   final aqa<csm> a;
   public static final Codec<dlv> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqa.a(jc.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dlv::new));

   protected dlv(hz $$0, aqa<csm> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dfa $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dlr<?> a() {
      return dlr.b;
   }
}
