import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class ebh extends dna {
   public static final MapCodec<ebh> a = b(ebh::new);
   public static final eco<jc> b = ebj.a;
   public static final eco<ecs> c = ebj.c;

   @Override
   public MapCodec<ebh> a() {
      return a;
   }

   public ebh(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c).b(c, ecs.a));
   }

   @Nullable
   @Override
   public dyo a(iw $$0, ebq $$1) {
      return null;
   }

   public static dyo a(iw $$0, ebq $$1, ebq $$2, jc $$3, boolean $$4, boolean $$5) {
      return new ebl($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return a($$2, dyq.l, ebl::a);
   }

   @Override
   public void a(dkk $$0, iw $$1, ebq $$2) {
      iw $$3 = $$1.a($$2.c(b).g());
      ebq $$4 = $$0.a_($$3);
      if ($$4.b() instanceof ebi && $$4.c(ebi.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bvc.c;
      } else {
         return bvc.e;
      }
   }

   @Override
   protected List<dak> a(ebq $$0, faw.a $$1) {
      ebl $$2 = this.a($$1.a(), iw.a($$1.a(fdn.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.a();
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      ebl $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fgt.a();
   }

   @Nullable
   private ebl a(djn $$0, iw $$1) {
      dyo $$2 = $$0.c_($$1);
      return $$2 instanceof ebl ? (ebl)$$2 : null;
   }

   @Override
   protected dub a_(ebq $$0) {
      return dub.a;
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return dak.l;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
