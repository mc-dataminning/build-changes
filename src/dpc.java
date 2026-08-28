import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpc extends dpw implements dha {
   public static final MapCodec<dpc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(dpc::b), u()).apply($$0, dpc::new));
   private final cuj c;

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   public dpc(cuj $$0, dun.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cuj b() {
      return this.c;
   }
}
