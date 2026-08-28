import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dnp extends dma {
   public static final MapCodec<dma> a = mf.e.q().fieldOf("dead");
   public static final MapCodec<dnp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dnp::new));
   private final dma c;

   public dnp(dma $$0, dzy.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dnp> a() {
      return b;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dib $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         ewg $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axh.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
