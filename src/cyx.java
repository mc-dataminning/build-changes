import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyx extends cyh implements czj {
   public static final MapCodec<cyx> c = b(cyx::new);

   @Override
   public MapCodec<cyx> a() {
      return c;
   }

   protected cyx(dgv.d $$0) {
      super($$0, hx.b, ejy.b(), true);
   }

   @Override
   protected cyi c() {
      return (cyi)cuv.mc;
   }

   @Override
   public ecg c_(dgw $$0) {
      return ech.c.a(false);
   }

   @Override
   protected boolean h(dgw $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return false;
   }

   @Override
   public boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      return false;
   }
}
