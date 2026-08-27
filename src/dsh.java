import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsh extends dsn {
   final aup<cys> a;
   public static final Codec<dsh> e = RecordCodecBuilder.create($$0 -> a($$0).and(aup.a(kg.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dsh::new));

   protected dsh(jd $$0, aup<cys> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dlj $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dsd<?> a() {
      return dsd.b;
   }
}
