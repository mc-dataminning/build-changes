import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edj extends edp {
   public static final MapCodec<edj> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, edj::new));

   public edj(bpb $$0, bpb $$1) {
      super($$0, $$1);
   }

   @Override
   protected edq<?> a() {
      return edq.d;
   }

   @Override
   protected void a(dbf $$0, edp.b $$1, aym $$2, ecz $$3, int $$4, edp.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      io $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(aym $$0, int $$1, ecz $$2) {
      return 0;
   }

   @Override
   protected boolean a(aym $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
