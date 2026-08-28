import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu extends efa {
   public static final MapCodec<eeu> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eeu::new));

   public eeu(bpl $$0, bpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected efb<?> a() {
      return efb.d;
   }

   @Override
   protected void a(dcl $$0, efa.b $$1, ayo $$2, eek $$3, int $$4, efa.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ja $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(ayo $$0, int $$1, eek $$2) {
      return 0;
   }

   @Override
   protected boolean a(ayo $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
