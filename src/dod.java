import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dod extends doj {
   final arv<cva> a;
   public static final Codec<dod> e = RecordCodecBuilder.create($$0 -> a($$0).and(arv.a(jz.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dod::new));

   protected dod(iw $$0, arv<cva> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dhi $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dnz<?> a() {
      return dnz.b;
   }
}
