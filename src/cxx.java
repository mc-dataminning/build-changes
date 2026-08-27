import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxx extends czl {
   public static final MapCodec<cxx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ath.a.fieldOf("falling_dust_color").forGetter($$0x -> $$0x.b), u()).apply($$0, cxx::new)
   );
   private final ath b;

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   public cxx(ath $$0, djf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2) {
      return this.b.a();
   }
}
