import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dew extends dcp {
   public static final MapCodec<dew> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(det.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dew::new));
   private final dde f;

   @Override
   public MapCodec<dew> a() {
      return e;
   }

   protected dew(dde $$0, dqg.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      this.a($$0, (dae)$$1, $$2);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
