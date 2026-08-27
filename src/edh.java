import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edh extends edn {
   public static final MapCodec<edh> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, edh::new));

   public edh(boz $$0, boz $$1) {
      super($$0, $$1);
   }

   @Override
   protected edo<?> a() {
      return edo.d;
   }

   @Override
   protected void a(dbd $$0, edn.b $$1, ayk $$2, ecx $$3, int $$4, edn.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      io $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ayk $$0, int $$1, ecx $$2) {
      return 0;
   }

   @Override
   protected boolean a(ayk $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
