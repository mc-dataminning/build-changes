import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dex extends cvv {
   public static final MapCodec<dex> a = b(dex::new);
   public static final djy<din> b = djq.by;

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, din.a));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public dco b_(dja $$0) {
      return dco.c;
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dih($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0 instanceof amz $$3
         ? a($$2, dgq.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, dgq.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cmr $$0, @Nullable cso $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      cua.a($$0, $$2, "spawn_data");
   }
}
