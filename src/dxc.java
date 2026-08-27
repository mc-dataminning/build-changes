import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxc extends dxi {
   public static final Codec<dxc> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dxc::new));

   public dxc(bkz $$0, bkz $$1) {
      super($$0, $$1);
   }

   @Override
   protected dxj<?> a() {
      return dxj.d;
   }

   @Override
   protected void a(cvt $$0, dxi.b $$1, awo $$2, dws $$3, int $$4, dxi.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      hz $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(awo $$0, int $$1, dws $$2) {
      return 0;
   }

   @Override
   protected boolean a(awo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
