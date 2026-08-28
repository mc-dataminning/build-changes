import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends doe {
   public static final MapCodec<dof> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(doe::b), t()).apply($$0, dof::new));

   @Override
   public MapCodec<dof> a() {
      return b;
   }

   public dof(dkd $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqu.i, jm.a.b));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return dqu.b($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(dqu.i);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(dqu.i, $$0.k().o());
   }
}
