import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dug extends dgv {
   public static final MapCodec<dug> a = b(dug::new);
   public static final dvi b = dui.a;
   public static final dvm<dvq> c = dui.c;

   @Override
   public MapCodec<dug> a() {
      return a;
   }

   public dug(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c).b(c, dvq.a));
   }

   @Nullable
   @Override
   public drs a(je $$0, duo $$1) {
      return null;
   }

   public static drs a(je $$0, duo $$1, duo $$2, jj $$3, boolean $$4, boolean $$5) {
      return new duk($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.k, duk::a);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         drs $$5 = $$1.c_($$2);
         if ($$5 instanceof duk) {
            ((duk)$$5).k();
         }
      }
   }

   @Override
   public void a(deh $$0, je $$1, duo $$2) {
      je $$3 = $$1.a($$2.c(b).g());
      duo $$4 = $$0.a_($$3);
      if ($$4.b() instanceof duh && $$4.c(duh.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return brp.c;
      } else {
         return brp.e;
      }
   }

   @Override
   protected List<cvp> a(duo $$0, etk.a $$1) {
      duk $$2 = this.a($$1.a(), je.a($$1.a(ewd.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      duk $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ezj.a();
   }

   @Nullable
   private duk a(ddl $$0, je $$1) {
      drs $$2 = $$0.c_($$1);
      return $$2 instanceof duk ? (duk)$$2 : null;
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return cvp.k;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
