import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgg extends ddn implements dlg {
   protected static final MapCodec<cwb> a = cwb.b.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dgg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dgg::b), u()).apply($$0, dgg::new));
   protected static final float c = 3.0F;
   protected static final eui d = dde.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final cwb e;

   @Override
   public MapCodec<? extends dgg> a() {
      return b;
   }

   public dgg(iw<bqr> $$0, float $$1, dqg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dgg(cwb $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   protected static cwb a(iw<bqr> $$0, float $$1) {
      return new cwb(List.of(new cwb.a($$0, axz.d($$1 * 20.0F))));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      etp $$4 = $$0.n($$1, $$2);
      return d.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public cwb b() {
      return this.e;
   }
}
