import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dll extends dlr {
   public static final MapCodec<dll> a = b(dll::new);
   public static final ebf<ja> b = eax.R;
   public static final eay c = eax.y;

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dwx $$6) {
         $$3.a($$6);
         $$3.a(awx.ar);
         cps.a($$5, $$3, true);
      }

      return bud.a;
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dxf $$4 = $$1.c_($$2);
      if ($$4 instanceof dwx) {
         ((dwx)$$4).k();
      }
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dwx($$0, $$1);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
