import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dic extends dfj implements dnc {
   protected static final MapCodec<cxu> a = cxu.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dic> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dic::b), u()).apply($$0, dic::new));
   protected static final float c = 3.0F;
   protected static final ewl d = dfa.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cxu e;

   @Override
   public MapCodec<? extends dic> a() {
      return b;
   }

   public dic(ji<bsb> $$0, float $$1, dsc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dic(cxu $$0, dsc.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cxu a(ji<bsb> $$0, float $$1) {
      return new cxu(List.of(new cxu.a($$0, ayz.d($$1 * 20.0F))));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      evs $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cxu b() {
      return this.e;
   }
}
