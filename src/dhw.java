import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dhw extends dfd implements dmw {
   protected static final MapCodec<cxo> a = cxo.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dhw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhw::b), u()).apply($$0, dhw::new));
   protected static final float c = 3.0F;
   protected static final ewf d = deu.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxo e;

   @Override
   public MapCodec<? extends dhw> a() {
      return b;
   }

   public dhw(ji<brv> $$0, float $$1, drw.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dhw(cxo $$0, drw.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxo a(ji<brv> $$0, float $$1) {
      return new cxo(List.of(new cxo.a($$0, ayu.d($$1 * 20.0F))));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      evm $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxo b() {
      return this.e;
   }
}
