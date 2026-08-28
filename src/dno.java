import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dno extends dnn {
   public static final MapCodec<dno> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnn::b), t()).apply($$0, dno::new));

   @Override
   public MapCodec<dno> a() {
      return b;
   }

   public dno(djm $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqd.i, jn.a.b));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return dqd.b($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(dqd.i);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(dqd.i, $$0.k().o());
   }
}
