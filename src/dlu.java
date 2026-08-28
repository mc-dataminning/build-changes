import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlu extends dke {
   public static final MapCodec<dke> a = ma.e.q().fieldOf("dead");
   public static final MapCodec<dlu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dlu::new));
   private final dke c;

   public dlu(dke $$0, dxm.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dlu> a() {
      return b;
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dgf $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         etp $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(aya.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
