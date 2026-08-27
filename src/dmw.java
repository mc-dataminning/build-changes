import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmw extends dnc {
   final arh<cua> a;
   public static final Codec<dmw> e = RecordCodecBuilder.create($$0 -> a($$0).and(arh.a(jz.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dmw::new));

   protected dmw(iw $$0, arh<cua> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dgb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dms<?> a() {
      return dms.b;
   }
}
