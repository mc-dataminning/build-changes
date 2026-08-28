import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djy extends dij {
   public static final MapCodec<dij> a = lz.e.q().fieldOf("dead");
   public static final MapCodec<djy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, djy::new));
   private final dij c;

   public djy(dij $$0, dvn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<djy> a() {
      return b;
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dek $$0, jh $$1) {
      for (jm $$2 : jm.values()) {
         ero $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axj.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.m();
   }
}
