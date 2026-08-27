import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efq extends efw {
   public static final Codec<efq> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, efq::new));

   public efq(bpf $$0, bpf $$1) {
      super($$0, $$1);
   }

   @Override
   protected efx<?> a() {
      return efx.d;
   }

   @Override
   protected void a(dcg $$0, efw.b $$1, ayt $$2, efg $$3, int $$4, efw.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ir $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ayt $$0, int $$1, efg $$2) {
      return 0;
   }

   @Override
   protected boolean a(ayt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
