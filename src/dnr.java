import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnr extends dol implements dfp {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dnr::b), u()).apply($$0, dnr::new));
   private final cti c;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(cti $$0, dtb.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cti b() {
      return this.c;
   }
}
