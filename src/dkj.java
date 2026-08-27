import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dkj extends dch {
   public static final MapCodec<dkj> a = b(dkj::new);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dpx.d $$0) {
      super($$0);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dor($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.j, $$0.B ? dor::a : dor::b);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   public void a(csd $$0, @Nullable cza $$1, List<ws> $$2, ctu $$3, @Nullable jj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dam.a($$0, $$2, "SpawnData");
   }
}
