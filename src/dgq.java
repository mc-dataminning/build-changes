import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgq extends die {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(awz.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, dgq::new)
   );
   private final awz b;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(awz $$0, dsk.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(dsl $$0, dbm $$1, ja $$2) {
      return this.b.a();
   }
}
