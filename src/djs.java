import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djs extends ddn implements ddh {
   public static final MapCodec<djs> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djs::new)
   );
   public static final drh f = dqx.aU;
   protected static final float g = 6.0F;
   protected static final eui h = dde.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dpw i;

   @Override
   public MapCodec<? extends djs> a() {
      return e;
   }

   protected djs(dpw $$0, dqg.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return h;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqh $$0, in $$1, dqh $$2, ayg $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f);
   }
}
