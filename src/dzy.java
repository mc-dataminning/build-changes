import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dzy extends dlr {
   public static final MapCodec<dzy> a = b(dzy::new);
   public static final ebf<ja> b = eaa.a;
   public static final ebf<ebj> c = eaa.c;

   @Override
   public MapCodec<dzy> a() {
      return a;
   }

   public dzy(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c).b(c, ebj.a));
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return null;
   }

   public static dxf a(iu $$0, eah $$1, eah $$2, ja $$3, boolean $$4, boolean $$5) {
      return new eac($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return a($$2, dxh.l, eac::a);
   }

   @Override
   public void a(djb $$0, iu $$1, eah $$2) {
      iu $$3 = $$1.a($$2.c(b).g());
      eah $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dzz && $$4.c(dzz.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bud.c;
      } else {
         return bud.e;
      }
   }

   @Override
   protected List<czd> a(eah $$0, ezk.a $$1) {
      eac $$2 = this.a($$1.a(), iu.a($$1.a(fcb.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.a();
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      eac $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ffh.a();
   }

   @Nullable
   private eac a(dig $$0, iu $$1) {
      dxf $$2 = $$0.c_($$1);
      return $$2 instanceof eac ? (eac)$$2 : null;
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return czd.k;
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
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
