import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class duk extends dgy {
   public static final MapCodec<duk> a = b(duk::new);
   public static final dvm b = dum.a;
   public static final dvq<dvu> c = dum.c;

   @Override
   public MapCodec<duk> a() {
      return a;
   }

   public duk(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, dvu.a));
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return null;
   }

   public static drv a(jf $$0, dus $$1, dus $$2, jk $$3, boolean $$4, boolean $$5) {
      return new duo($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.k, duo::a);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drv $$5 = $$1.c_($$2);
         if ($$5 instanceof duo) {
            ((duo)$$5).k();
         }
      }
   }

   @Override
   public void a(dek $$0, jf $$1, dus $$2) {
      jf $$3 = $$1.a($$2.c(b).g());
      dus $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dul && $$4.c(dul.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return brs.c;
      } else {
         return brs.e;
      }
   }

   @Override
   protected List<cvs> a(dus $$0, eto.a $$1) {
      duo $$2 = this.a($$1.a(), jf.a($$1.a(ewh.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.a();
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      duo $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ezn.a();
   }

   @Nullable
   private duo a(ddo $$0, jf $$1) {
      drv $$2 = $$0.c_($$1);
      return $$2 instanceof duo ? (duo)$$2 : null;
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return cvs.k;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
