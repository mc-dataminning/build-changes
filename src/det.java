import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class det extends dde {
   public static final MapCodec<dde> a = ld.e.q().fieldOf("dead");
   public static final MapCodec<det> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, det::new));
   private final dde c;

   public det(dde $$0, dqg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<det> a() {
      return b;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(czj $$0, in $$1) {
      for (is $$2 : is.values()) {
         ema $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(avw.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.n();
   }
}
