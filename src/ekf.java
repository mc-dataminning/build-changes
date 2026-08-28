import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekf extends ekl {
   public static final MapCodec<ekf> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekf::new));

   public ekf(bsn $$0, bsn $$1) {
      super($$0, $$1);
   }

   @Override
   protected ekm<?> a() {
      return ekm.d;
   }

   @Override
   protected void a(dhn $$0, ekl.b $$1, bam $$2, ejv $$3, int $$4, ekl.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jh $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(bam $$0, int $$1, ejv $$2) {
      return 0;
   }

   @Override
   protected boolean a(bam $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
