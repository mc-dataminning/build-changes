import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dev extends dco {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(det.a.forGetter($$0x -> $$0x.e), u()).apply($$0, dev::new));
   private final dde e;
   protected static final float b = 6.0F;
   protected static final eui c = dde.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(dde $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      this.a($$0, (dae)$$1, $$2);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.e.n().a(d, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.a && !$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         this.a($$0, $$3, $$4);
         if ($$0.c(d)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }
}
