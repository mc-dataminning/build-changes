import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esv extends esj {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(uv.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, esv::new));
   private final tx b;

   private esv(List<euh> $$0, tx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public esl<esv> b() {
      return esm.j;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      cwr.a(kn.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static esj.a<?> a(tx $$0) {
      return a($$1 -> new esv($$1, $$0));
   }
}
