import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmd extends dmc {
   public static final MapCodec<dmd> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ly.e.q().fieldOf("host").forGetter(dmc::b), t()).apply($$0, dmd::new));

   @Override
   public MapCodec<dmd> a() {
      return b;
   }

   public dmd(die $$0, dvi.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(doq.i, jm.a.b));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return doq.b($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(doq.i);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(doq.i, $$0.k().o());
   }
}
