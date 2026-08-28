import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dpb extends dgy {
   public static final MapCodec<dpb> a = b(dpb::new);

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   protected dpb(dur.d $$0) {
      super($$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.j, $$0.B ? dtl::a : dtl::b);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, cvs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfd.a($$0, $$2, "SpawnData");
   }
}
