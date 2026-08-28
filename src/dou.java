import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dou extends dfq implements ctr {
   public static final MapCodec<dou> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dou::b), u()).apply($$0, dou::new));
   private final cti d;

   @Override
   public MapCodec<dou> a() {
      return c;
   }

   protected dou(cti $$0, dsb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cti b() {
      return this.d;
   }

   @Override
   public btb m() {
      return btb.g;
   }

   @Override
   public ji<avz> n() {
      return awa.og;
   }
}
