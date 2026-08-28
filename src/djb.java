import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class djb extends dhm {
   public static final MapCodec<dhm> a = lv.e.q().fieldOf("dead");
   public static final MapCodec<djb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, djb::new));
   private final dhm c;

   public djb(dhm $$0, dur.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<djb> a() {
      return b;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.n(), 2);
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.D_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(ddo $$0, jf $$1) {
      for (jk $$2 : jk.values()) {
         eqt $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axb.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().D_().a(40));
      }

      return this.n();
   }
}
