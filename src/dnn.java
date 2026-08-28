import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dnn extends dek {
   public static final MapCodec<dnn> a = b(dnn::new);
   public static final dsz<drh> b = dsr.by;
   public static final dss c = dsr.bA;

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   public dnn(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dra($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0 instanceof are $$3
         ? a($$2, dpi.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dsr.bA).orElse(false)))
         : a($$2, dpi.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dsr.bA).orElse(false)));
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      dcp.a($$0, $$2, "spawn_data");
   }
}
