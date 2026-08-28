import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpc extends dfy implements cte {
   public static final MapCodec<dpc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(dpc::b), u()).apply($$0, dpc::new));
   private final csv d;

   @Override
   public MapCodec<dpc> a() {
      return c;
   }

   protected dpc(csv $$0, dsj.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public csv b() {
      return this.d;
   }

   @Override
   public bsn m() {
      return bsn.g;
   }

   @Override
   public jj<avg> n() {
      return avh.og;
   }
}
