import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmc extends dkm {
   public static final MapCodec<dkm> a = ma.e.q().fieldOf("dead");
   public static final MapCodec<dmc> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dmc::new));
   private final dkm c;

   public dmc(dkm $$0, dxu.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dmc> a() {
      return b;
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dgn $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         etx $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
