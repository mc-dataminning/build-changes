import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmb extends dkl {
   public static final MapCodec<dkl> a = ma.e.q().fieldOf("dead");
   public static final MapCodec<dmb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dmb::new));
   private final dkl c;

   public dmb(dkl $$0, dxt.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dmb> a() {
      return b;
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dgm $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         etw $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
