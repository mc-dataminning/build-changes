import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejg extends ejm {
   public static final MapCodec<ejg> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejg::new));

   public ejg(brn $$0, brn $$1) {
      super($$0, $$1);
   }

   @Override
   protected ejn<?> a() {
      return ejn.d;
   }

   @Override
   protected void a(dgm $$0, ejm.b $$1, azg $$2, eiw $$3, int $$4, ejm.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      ji $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azg $$0, int $$1, eiw $$2) {
      return 0;
   }

   @Override
   protected boolean a(azg $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
