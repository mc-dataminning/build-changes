import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgn extends dey {
   public static final MapCodec<dey> a = lp.e.q().fieldOf("dead");
   public static final MapCodec<dgn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgn::new));
   private final dey c;

   public dgn(dey $$0, dsa.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgn> a() {
      return b;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbd $$0, iz $$1) {
      for (je $$2 : je.values()) {
         enu $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awu.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
