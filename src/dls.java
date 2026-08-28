import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dls extends dkd {
   public static final MapCodec<dkd> a = ma.e.q().fieldOf("dead");
   public static final MapCodec<dls> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dls::new));
   private final dkd c;

   public dls(dkd $$0, dxn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dls> a() {
      return b;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dge $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         etq $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axq.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
