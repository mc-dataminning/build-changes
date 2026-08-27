import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dao extends dan {
   public static final MapCodec<dao> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dan::b), u()).apply($$0, dao::new));

   @Override
   public MapCodec<dao> a() {
      return b;
   }

   public dao(cwp $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dda.i, ic.a.b));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return dda.b($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(dda.i);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(dda.i, $$0.k().o());
   }
}
