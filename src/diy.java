import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class diy extends cwb {
   public static final MapCodec<diy> a = b(diy::new);
   public static final dka b = dja.a;
   public static final dke<dki> c = dja.c;

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, dki.a));
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return null;
   }

   public static dgu a(hx $$0, djg $$1, djg $$2, ic $$3, boolean $$4, boolean $$5) {
      return new djc($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.k, djc::a);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dgu $$5 = $$1.c_($$2);
         if ($$5 instanceof djc) {
            ((djc)$$5).l();
         }
      }
   }

   @Override
   public void a(ctp $$0, hx $$1, djg $$2) {
      hx $$3 = $$1.a($$2.c(b).g());
      djg $$4 = $$0.a_($$3);
      if ($$4.b() instanceof diz && $$4.c(diz.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bka.b;
      } else {
         return bka.d;
      }
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      djc $$2 = this.a($$1.a(), hx.a($$1.a(ejg.f)));
      return $$2 == null ? Collections.emptyList() : $$2.k().a($$1);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return emi.a();
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      djc $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : emi.a();
   }

   @Nullable
   private djc a(csu $$0, hx $$1) {
      dgu $$2 = $$0.c_($$1);
      return $$2 instanceof djc ? (djc)$$2 : null;
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return cmx.f;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
