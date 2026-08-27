import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dio extends czm {
   public static final MapCodec<dio> a = b(dio::new);
   public static final dnx<dmf> b = dnp.by;

   @Override
   public MapCodec<dio> a() {
      return a;
   }

   public dio(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmf.a));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return $$0 instanceof apf $$3
         ? a($$2, dki.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dki.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(cqk $$0, @Nullable cwf $$1, List<vu> $$2, csb $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxr.a($$0, $$2, "spawn_data");
   }
}
