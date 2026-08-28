import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class eax extends dmq {
   public static final MapCodec<eax> a = b(eax::new);
   public static final ece<jc> b = eaz.a;
   public static final ece<eci> c = eaz.c;

   @Override
   public MapCodec<eax> a() {
      return a;
   }

   public eax(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, eci.a));
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return null;
   }

   public static dye a(iw $$0, ebg $$1, ebg $$2, jc $$3, boolean $$4, boolean $$5) {
      return new ebb($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.l, ebb::a);
   }

   @Override
   public void a(dka $$0, iw $$1, ebg $$2) {
      iw $$3 = $$1.a($$2.c(b).g());
      ebg $$4 = $$0.a_($$3);
      if ($$4.b() instanceof eay && $$4.c(eay.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return but.c;
      } else {
         return but.e;
      }
   }

   @Override
   protected List<daa> a(ebg $$0, fam.a $$1) {
      ebb $$2 = this.a($$1.a(), iw.a($$1.a(fdd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return fgj.a();
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      ebb $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fgj.a();
   }

   @Nullable
   private ebb a(djd $$0, iw $$1) {
      dye $$2 = $$0.c_($$1);
      return $$2 instanceof ebb ? (ebb)$$2 : null;
   }

   @Override
   protected dtr a_(ebg $$0) {
      return dtr.a;
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return daa.k;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
