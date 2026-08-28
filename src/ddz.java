import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddz extends dhv {
   public static final MapCodec<ddz> a = b(ddz::new);
   public static final dsw b = div.aE;
   private static final ewk c = dez.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ewk d = dez.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ewk e = dez.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ewk f = dez.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ewk g = dez.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ewk h = dez.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ewk i = dez.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ewk j = ewh.a(c, d, e, f);
   private static final ewk k = ewh.a(c, g, h, i);
   private static final xp l = xp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aC);
         return bqu.c;
      }
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new cpw($$2x, $$3, cqf.a($$1, $$2)), l);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      je $$4 = $$0.c(b);
      return $$4.o() == je.a.a ? j : k;
   }

   @Override
   protected void a(cjg $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dby $$0, iz $$1, dsc $$2, dsc $$3, cjg $$4) {
      if (!$$4.aW()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dby $$0, iz $$1, cjg $$2) {
      if (!$$2.aW()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brn a(bsu $$0) {
      return $$0.dQ().b($$0);
   }

   @Nullable
   public static dsc e(dsc $$0) {
      if ($$0.a(dfb.gS)) {
         return dfb.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dfb.gT) ? dfb.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   public int b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
