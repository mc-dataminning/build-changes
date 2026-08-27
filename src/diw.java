import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diw extends djc {
   final anl<cpn> a;
   public static final Codec<diw> e = RecordCodecBuilder.create($$0 -> a($$0).and(anl.a(jc.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, diw::new));

   protected diw(hz $$0, anl<cpn> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dcb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dis<?> a() {
      return dis.b;
   }
}
