import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dpe extends dno {
   public static final MapCodec<dno> a = mh.e.q().fieldOf("dead");
   public static final MapCodec<dpe> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dpe::new));
   private final dno c;

   public dpe(dno $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dpe> a() {
      return b;
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(djn $$0, iw $$1) {
      for (jc $$2 : jc.values()) {
         eya $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axs.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().G_().a(40));
      }

      return this.m();
   }
}
