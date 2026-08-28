import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgb extends djd {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final dte b = djd.aE;
   @Nullable
   private dsp c;
   @Nullable
   private dsp d;
   @Nullable
   private dsp e;
   @Nullable
   private dsp f;
   private static final Predicate<dsk> g = $$0 -> $$0 != null && ($$0.a(dfj.ee) || $$0.a(dfj.ef));

   @Override
   public MapCodec<? extends dgb> a() {
      return a;
   }

   protected dgb(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dci $$0, ja $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dcf $$0, ja $$1) {
      dsp.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cfp $$3 = bsm.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsp.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfd $$5 = bsm.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dcf $$0, dsp.b $$1, bsg $$2, ja $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqn $$4 : $$0.a(aqn.class, $$2.cL().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dcf $$0, dsp.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dso $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfj.a.o(), 2);
            $$0.c(2001, $$4.d(), dfh.i($$4.a()));
         }
      }
   }

   public static void b(dcf $$0, dsp.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dso $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfj.a);
         }
      }
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   private dsp b() {
      if (this.c == null) {
         this.c = dsq.a().a(" ", "#", "#").a('#', dso.a(dst.a(dfj.dP))).b();
      }

      return this.c;
   }

   private dsp m() {
      if (this.d == null) {
         this.d = dsq.a().a("^", "#", "#").a('^', dso.a(g)).a('#', dso.a(dst.a(dfj.dP))).b();
      }

      return this.d;
   }

   private dsp y() {
      if (this.e == null) {
         this.e = dsq.a().a("~ ~", "###", "~#~").a('#', dso.a(dst.a(dfj.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsp z() {
      if (this.f == null) {
         this.f = dsq.a().a("~^~", "###", "~#~").a('^', dso.a(g)).a('#', dso.a(dst.a(dfj.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
