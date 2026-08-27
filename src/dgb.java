import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dgb extends cya {
   public static final MapCodec<dgb> a = b(dgb::new);

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   protected dgb(dle.d $$0) {
      super($$0);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.j, $$0.B ? dkg::a : dkg::b);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   public void a(coz $$0, @Nullable cut $$1, List<vq> $$2, cqq $$3) {
      super.a($$0, $$1, $$2, $$3);
      cwf.a($$0, $$2, "SpawnData");
   }
}
