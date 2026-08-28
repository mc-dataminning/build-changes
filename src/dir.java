import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dir extends dkf {
   public static final MapCodec<dir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(axx.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dir::new)
   );
   private final axx b;

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(axx $$0, dun.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(duo $$0, ddl $$1, je $$2) {
      return this.b.a();
   }
}
