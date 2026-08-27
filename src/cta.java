import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cta extends cwu {
   public static final MapCodec<cta> a = b(cta::new);
   public static final dgv b = cxu.aE;
   private static final eiy c = cua.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final eiy d = cua.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final eiy e = cua.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final eiy f = cua.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final eiy g = cua.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final eiy h = cua.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final eiy i = cua.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final eiy j = eiv.a(c, d, e, f);
   private static final eiy k = eiv.a(c, g, h, i);
   private static final ui l = ui.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<cta> a() {
      return a;
   }

   public cta(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.aC);
         return bib.b;
      }
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new cfr($$2x, $$3, cga.a($$1, $$2)), l);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      hx $$4 = $$0.c(b);
      return $$4.o() == hx.a.a ? j : k;
   }

   @Override
   protected void a(bzp $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, dgb $$3, bzp $$4) {
      if (!$$4.aS()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, bzp $$2) {
      if (!$$2.aS()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bir a(bjt $$0) {
      return $$0.dM().b($$0);
   }

   @Nullable
   public static dgb e(dgb $$0) {
      if ($$0.a(cuc.gS)) {
         return cuc.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(cuc.gT) ? cuc.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public int d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
