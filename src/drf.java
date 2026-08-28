import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class drf extends dic {
   public static final MapCodec<drf> a = b(drf::new);
   public static final dws<dvb> b = dwl.by;
   public static final dwm c = dwl.bA;

   @Override
   public MapCodec<drf> a() {
      return a;
   }

   public drf(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvb.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0 instanceof arp $$3
         ? a($$2, dta.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dwl.bA).orElse(false)))
         : a($$2, dta.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dwl.bA).orElse(false)));
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      dgh.a($$0, $$2, "spawn_data");
   }
}
