import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dha extends deh implements dma {
   protected static final MapCodec<cws> a = cws.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dha> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dha::b), u()).apply($$0, dha::new));
   protected static final float c = 3.0F;
   protected static final evd d = ddy.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cws e;

   @Override
   public MapCodec<? extends dha> a() {
      return b;
   }

   public dha(ix<bra> $$0, float $$1, dra.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dha(cws $$0, dra.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cws a(ix<bra> $$0, float $$1) {
      return new cws(List.of(new cws.a($$0, ayd.d($$1 * 20.0F))));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      euk $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cws b() {
      return this.e;
   }
}
