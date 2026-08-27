import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deu extends dcm {
   public static final MapCodec<deu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(det.a.forGetter($$0x -> $$0x.c), u()).apply($$0, deu::new));
   private final dde c;

   @Override
   public MapCodec<deu> a() {
      return b;
   }

   protected deu(dde $$0, dqg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      this.a($$0, (dae)$$1, $$2);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.c.n().a(d, Boolean.valueOf(false)), 2);
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
}
