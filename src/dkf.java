import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dkf extends dni {
   public static final MapCodec<dkf> a = b(dkf::new);
   public static final dxs<jn> b = dni.aF;
   @Nullable
   private dxa c;
   @Nullable
   private dxa d;
   @Nullable
   private dxa e;
   @Nullable
   private dxa f;
   private static final Predicate<dwv> g = $$0 -> $$0 != null && ($$0.a(djm.er) || $$0.a(djm.es));

   @Override
   public MapCodec<? extends dkf> a() {
      return a;
   }

   protected dkf(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dgj $$0, ji $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dgg $$0, ji $$1) {
      dxa.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chu $$3 = buq.bk.a($$0, bup.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dxa.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chi $$5 = buq.ap.a($$0, bup.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dgg $$0, dxa.b $$1, buj $$2, ji $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (ard $$4 : $$0.a(ard.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dgg $$0, dxa.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dwz $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), djm.a.m(), 2);
            $$0.c(2001, $$4.d(), djk.j($$4.a()));
         }
      }
   }

   public static void b(dgg $$0, dxa.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dwz $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), djm.a);
         }
      }
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   private dxa b() {
      if (this.c == null) {
         this.c = dxb.a().a(" ", "#", "#").a('#', dwz.a(dxe.a(djm.ec))).b();
      }

      return this.c;
   }

   private dxa q() {
      if (this.d == null) {
         this.d = dxb.a().a("^", "#", "#").a('^', dwz.a(g)).a('#', dwz.a(dxe.a(djm.ec))).b();
      }

      return this.d;
   }

   private dxa r() {
      if (this.e == null) {
         this.e = dxb.a().a("~ ~", "###", "~#~").a('#', dwz.a(dxe.a(djm.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dxa y() {
      if (this.f == null) {
         this.f = dxb.a().a("~^~", "###", "~#~").a('^', dwz.a(g)).a('#', dwz.a(dxe.a(djm.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
