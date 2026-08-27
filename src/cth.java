import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cth extends ctj {
   private final awl<ctg> a;

   public cth(ctj.a $$0, awl<ctg> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akl<ctg>> $$4 = this.j($$0).flatMap(ix::e);
      if ($$4.isPresent()) {
         xl $$5 = wx.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cto a(ctj $$0, ix<ctg> $$1) {
      cto $$2 = new cto($$0);
      $$2.b(kb.O, $$1);
      return $$2;
   }

   public static void a(cto $$0, awl<ctg> $$1, ayk $$2) {
      Optional<ix<ctg>> $$3 = le.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kb.O, $$1x));
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      ix<ctg> $$4 = $$3.a(kb.O);
      if ($$4 != null) {
         ctg $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(avr.c.b(this));
         return bpv.b($$3);
      } else {
         return bpv.d($$3);
      }
   }

   @Override
   public int b(cto $$0) {
      Optional<ix<ctg>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((ctg)$$0x.a()).b()).orElse(0);
   }

   private Optional<ix<ctg>> j(cto $$0) {
      ix<ctg> $$1 = $$0.a(kb.O);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ix<ctg>> $$2 = le.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cvj c(cto $$0) {
      return cvj.i;
   }

   private static void a(dax $$0, clw $$1, ctg $$2) {
      avg $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avi.c, $$4, 1.0F);
      $$0.a(dvu.B, $$1.dn(), dvu.a.a($$1));
   }
}
