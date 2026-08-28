import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnp extends dno {
   public static final MapCodec<dnp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dno::b), t()).apply($$0, dnp::new));

   @Override
   public MapCodec<dnp> a() {
      return b;
   }

   public dnp(djn $$0, dwx.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqe.i, jn.a.b));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return dqe.b($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(dqe.i);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(dqe.i, $$0.k().o());
   }
}
