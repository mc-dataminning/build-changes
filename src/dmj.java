import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dmj extends dku {
   public static final MapCodec<dku> a = md.e.q().fieldOf("dead");
   public static final MapCodec<dmj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, dmj::new));
   private final dku c;

   public dmj(dku $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dmj> a() {
      return b;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dgv $$0, jj $$1) {
      for (jo $$2 : jo.values()) {
         eut $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(axf.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().C_().a(40));
      }

      return this.m();
   }
}
