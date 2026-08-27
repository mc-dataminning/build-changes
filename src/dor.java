import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dor extends dbk {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dpt b = dot.a;
   public static final dpx<dqb> c = dot.c;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dqb.a));
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return null;
   }

   public static dmf a(ib $$0, doz $$1, doz $$2, ih $$3, boolean $$4, boolean $$5) {
      return new dov($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dmf> dmg<T> a(cyx $$0, doz $$1, dmh<T> $$2) {
      return a($$2, dmh.k, dov::a);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dmf $$5 = $$1.c_($$2);
         if ($$5 instanceof dov) {
            ((dov)$$5).k();
         }
      }
   }

   @Override
   public void a(cyy $$0, ib $$1, doz $$2) {
      ib $$3 = $$1.a($$2.c(b).g());
      doz $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dos && $$4.c(dos.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return boa.b;
      } else {
         return boa.d;
      }
   }

   @Override
   protected List<crj> a(doz $$0, enh.a $$1) {
      dov $$2 = this.a($$1.a(), ib.a($$1.a(epo.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.a();
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      dov $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : esq.a();
   }

   @Nullable
   private dov a(cyd $$0, ib $$1) {
      dmf $$2 = $$0.c_($$1);
      return $$2 instanceof dov ? (dov)$$2 : null;
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return crj.i;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
