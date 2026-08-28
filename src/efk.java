import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efk extends efq {
   public static final MapCodec<efk> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, efk::new));

   public efk(bpv $$0, bpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected efr<?> a() {
      return efr.d;
   }

   @Override
   protected void a(dda $$0, efq.b $$1, ayv $$2, efa $$3, int $$4, efq.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jd $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ayv $$0, int $$1, efa $$2) {
      return 0;
   }

   @Override
   protected boolean a(ayv $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
