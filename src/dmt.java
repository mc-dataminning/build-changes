import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dmt extends der {
   public static final MapCodec<dmt> a = b(dmt::new);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dsg.d $$0) {
      super($$0);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.j, $$0.B ? drb::a : drb::b);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.z.a(15) + $$1.z.a(15);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcw.a($$0, $$2, "SpawnData");
   }
}
