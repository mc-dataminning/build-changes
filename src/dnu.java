import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnu extends der {
   public static final MapCodec<dnu> a = b(dnu::new);
   public static final dtf<drn> b = dsx.by;
   public static final dsy c = dsx.bA;

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new drh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return $$0 instanceof aqk $$3
         ? a($$2, dpp.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dsx.bA).orElse(false)))
         : a($$2, dpp.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dsx.bA).orElse(false)));
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcw.a($$0, $$2, "spawn_data");
   }
}
