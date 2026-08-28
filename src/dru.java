import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dru extends del {
   public static final MapCodec<dru> a = b(dru::new);
   public static final dsw b = drw.a;
   public static final dta<dte> c = drw.c;

   @Override
   public MapCodec<dru> a() {
      return a;
   }

   public dru(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, dte.a));
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return null;
   }

   public static dph a(iz $$0, dsc $$1, dsc $$2, je $$3, boolean $$4, boolean $$5) {
      return new dry($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.k, dry::a);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dph $$5 = $$1.c_($$2);
         if ($$5 instanceof dry) {
            ((dry)$$5).k();
         }
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, dsc $$2) {
      iz $$3 = $$1.a($$2.c(b).g());
      dsc $$4 = $$0.a_($$3);
      if ($$4.b() instanceof drv && $$4.c(drv.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bqu.c;
      } else {
         return bqu.e;
      }
   }

   @Override
   protected List<cup> a(dsc $$0, eql.a $$1) {
      dry $$2 = this.a($$1.a(), iz.a($$1.a(ete.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.a();
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      dry $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ewh.a();
   }

   @Nullable
   private dry a(dbe $$0, iz $$1) {
      dph $$2 = $$0.c_($$1);
      return $$2 instanceof dry ? (dry)$$2 : null;
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return cup.l;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
