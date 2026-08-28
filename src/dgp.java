import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dgp extends dfa {
   public static final MapCodec<dfa> a = lp.e.q().fieldOf("dead");
   public static final MapCodec<dgp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), u()).apply($$0, dgp::new));
   private final dfa c;

   public dgp(dfa $$0, dsc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.o(), 2);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!this.a($$3, $$4)) {
         $$3.a($$4, this, 60 + $$3.E_().a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected boolean a(dbf $$0, iz $$1) {
      for (je $$2 : je.values()) {
         enw $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(awv.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().E_().a(40));
      }

      return this.o();
   }
}
