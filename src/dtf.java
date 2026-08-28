import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtf extends dlr {
   public static final MapCodec<dtf> a = b(dtf::new);
   public static final eay b = eax.c;
   private final bti c = btf.a(5);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? null : a($$2, dxh.L, dyp::a);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
