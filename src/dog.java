import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dog extends dof {
   public static final MapCodec<dog> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(dof::b), t()).apply($$0, dog::new));

   @Override
   public MapCodec<dog> a() {
      return b;
   }

   public dog(dke $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dqt.i, jm.a.b));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return dqt.b($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(dqt.i);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(dqt.i, $$0.k().o());
   }
}
