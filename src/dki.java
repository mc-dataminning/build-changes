import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dki extends dnl {
   public static final MapCodec<dki> a = b(dki::new);
   public static final dxv<jn> b = dnl.aF;
   @Nullable
   private dxd c;
   @Nullable
   private dxd d;
   @Nullable
   private dxd e;
   @Nullable
   private dxd f;
   private static final Predicate<dwy> g = $$0 -> $$0 != null && ($$0.a(djp.er) || $$0.a(djp.es));

   @Override
   public MapCodec<? extends dki> a() {
      return a;
   }

   protected dki(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dgm $$0, ji $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgj $$0, ji $$1) {
      dxd.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chx $$3 = but.bk.a($$0, bus.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxd.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chl $$5 = but.ap.a($$0, bus.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgj $$0, dxd.b $$1, bum $$2, ji $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (are $$4 : $$0.a(are.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgj $$0, dxd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxc $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), djp.a.m(), 2);
            $$0.c(2001, $$4.d(), djn.j($$4.a()));
         }
      }
   }

   public static void b(dgj $$0, dxd.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dxc $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), djp.a);
         }
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   private dxd b() {
      if (this.c == null) {
         this.c = dxe.a().a(" ", "#", "#").a('#', dxc.a(dxh.a(djp.ec))).b();
      }

      return this.c;
   }

   private dxd q() {
      if (this.d == null) {
         this.d = dxe.a().a("^", "#", "#").a('^', dxc.a(g)).a('#', dxc.a(dxh.a(djp.ec))).b();
      }

      return this.d;
   }

   private dxd r() {
      if (this.e == null) {
         this.e = dxe.a().a("~ ~", "###", "~#~").a('#', dxc.a(dxh.a(djp.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxd y() {
      if (this.f == null) {
         this.f = dxe.a().a("~^~", "###", "~#~").a('^', dxc.a(g)).a('#', dxc.a(dxh.a(djp.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
