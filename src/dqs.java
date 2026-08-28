import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqs extends dul implements dlx {
   public static final MapCodec<dqs> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.a(0.0F, 1.0F).fieldOf("leaf_particle_chance").forGetter($$0x -> $$0x.e), t()).apply($$0, dqs::new)
   );

   @Override
   public MapCodec<dqs> a() {
      return f;
   }

   public dqs(float $$0, dzn.d $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      $$0.a($$2.e(), dqt.c(), 2);
   }

   @Override
   public iu a(iu $$0) {
      return $$0.e();
   }
}
