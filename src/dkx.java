import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dkx extends cya {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final dlz b = dkz.a;
   public static final dmd<dmh> c = dkz.c;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, dmh.a));
   }

   @Nullable
   @Override
   public dit a(hz $$0, dlf $$1) {
      return null;
   }

   public static dit a(hz $$0, dlf $$1, dlf $$2, ie $$3, boolean $$4, boolean $$5) {
      return new dlb($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.k, dlb::a);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dit $$5 = $$1.c_($$2);
         if ($$5 instanceof dlb) {
            ((dlb)$$5).l();
         }
      }
   }

   @Override
   public void a(cvo $$0, hz $$1, dlf $$2) {
      hz $$3 = $$1.a($$2.c(b).g());
      dlf $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dky && $$4.c(dky.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return blu.b;
      } else {
         return blu.d;
      }
   }

   @Override
   protected List<coz> a(dlf $$0, ejb.a $$1) {
      dlb $$2 = this.a($$1.a(), hz.a($$1.a(elg.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return eoi.a();
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      dlb $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eoi.a();
   }

   @Nullable
   private dlb a(cut $$0, hz $$1) {
      dit $$2 = $$0.c_($$1);
      return $$2 instanceof dlb ? (dlb)$$2 : null;
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return coz.h;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
