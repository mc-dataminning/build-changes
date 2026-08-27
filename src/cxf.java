import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxf extends cwp implements cxr {
   public static final MapCodec<cxf> c = b(cxf::new);

   @Override
   public MapCodec<cxf> a() {
      return c;
   }

   protected cxf(dfc.d $$0) {
      super($$0, ha.b, ehx.b(), true);
   }

   @Override
   protected cwq c() {
      return (cwq)cte.mc;
   }

   @Override
   public eag c_(dfd $$0) {
      return eah.c.a(false);
   }

   @Override
   protected boolean h(dfd $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return false;
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      return false;
   }
}
