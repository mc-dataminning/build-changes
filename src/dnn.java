import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnn extends dnm {
   public static final MapCodec<dnn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnm::b), t()).apply($$0, dnn::new));

   @Override
   public MapCodec<dnn> a() {
      return b;
   }

   public dnn(djl $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqc.i, jn.a.b));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return dqc.b($$0, $$1);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(dqc.i);
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(dqc.i, $$0.k().o());
   }
}
