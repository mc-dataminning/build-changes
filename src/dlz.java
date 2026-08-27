import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlz extends dmf {
   final aqd<csq> a;
   public static final Codec<dlz> e = RecordCodecBuilder.create($$0 -> a($$0).and(aqd.a(je.e).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dlz::new));

   protected dlz(ib $$0, aqd<csq> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dfe $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dlv<?> a() {
      return dlv.b;
   }
}
