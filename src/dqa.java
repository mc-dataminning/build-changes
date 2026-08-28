import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dqa extends drt implements dmp {
   public static final MapCodec<dqa> a = b(dqa::new);
   private final dru e = new dru(this);

   @Override
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(ean.d $$0) {
      super($$0);
   }

   public static ToIntFunction<eao> b(int $$0) {
      return $$1 -> drs.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      return jb.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(eao $$0) {
      return $$0.y().c();
   }

   @Override
   public dru c() {
      return this.e;
   }
}
