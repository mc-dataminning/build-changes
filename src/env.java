import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class env extends eob {
   public static final MapCodec<env> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, env::new));

   public env(btw $$0, btw $$1) {
      super($$0, $$1);
   }

   @Override
   protected eoc<?> a() {
      return eoc.d;
   }

   @Override
   protected void a(dkd $$0, eob.b $$1, azx $$2, enl $$3, int $$4, eob.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iv $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azx $$0, int $$1, enl $$2) {
      return 0;
   }

   @Override
   protected boolean a(azx $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
