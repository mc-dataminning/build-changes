import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ddw extends cvv {
   public static final MapCodec<ddw> a = b(ddw::new);

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   protected ddw(diz.d $$0) {
      super($$0);
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dib($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.j, $$0.B ? dib::a : dib::b);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, cmr $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Override
   public void a(cmr $$0, @Nullable cso $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      cua.a($$0, $$2, "SpawnData");
   }
}
