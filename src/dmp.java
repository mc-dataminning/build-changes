import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmp extends dmo {
   public static final MapCodec<dmp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lz.e.q().fieldOf("host").forGetter(dmo::b), t()).apply($$0, dmp::new));

   @Override
   public MapCodec<dmp> a() {
      return b;
   }

   public dmp(diq $$0, dvu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dpc.i, jm.a.b));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return dpc.b($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(dpc.i);
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(dpc.i, $$0.k().o());
   }
}
