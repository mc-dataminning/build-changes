import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dux extends dvd {
   public static final Codec<dux> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dux::new));

   public dux(bja $$0, bja $$1) {
      super($$0, $$1);
   }

   @Override
   protected dve<?> a() {
      return dve.d;
   }

   @Override
   protected void a(cto $$0, dvd.b $$1, aup $$2, dun $$3, int $$4, dvd.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      hx $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(aup $$0, int $$1, dun $$2) {
      return 0;
   }

   @Override
   protected boolean a(aup $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
