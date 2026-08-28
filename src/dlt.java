import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dlt extends dke {
   public static final MapCodec<dke> a = mb.e.q().fieldOf("dead");
   public static final MapCodec<dlt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dlt::new));
   private final dke c;

   public dlt(dke $$0, dxp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dlt> a() {
      return b;
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dgf $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         etw $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
