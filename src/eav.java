import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class eav extends dmo {
   public static final MapCodec<eav> a = b(eav::new);
   public static final ecc<jb> b = eax.a;
   public static final ecc<ecg> c = eax.c;

   @Override
   public MapCodec<eav> a() {
      return a;
   }

   public eav(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, ecg.a));
   }

   @Nullable
   @Override
   public dyc a(iv $$0, ebe $$1) {
      return null;
   }

   public static dyc a(iv $$0, ebe $$1, ebe $$2, jb $$3, boolean $$4, boolean $$5) {
      return new eaz($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.l, eaz::a);
   }

   @Override
   public void a(djy $$0, iv $$1, ebe $$2) {
      iv $$3 = $$1.a($$2.c(b).g());
      ebe $$4 = $$0.a_($$3);
      if ($$4.b() instanceof eaw && $$4.c(eaw.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bur.c;
      } else {
         return bur.e;
      }
   }

   @Override
   protected List<czy> a(ebe $$0, fak.a $$1) {
      eaz $$2 = this.a($$1.a(), iv.a($$1.a(fdb.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      eaz $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fgh.a();
   }

   @Nullable
   private eaz a(djb $$0, iv $$1) {
      dyc $$2 = $$0.c_($$1);
      return $$2 instanceof eaz ? (eaz)$$2 : null;
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return czy.k;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
