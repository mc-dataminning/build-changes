import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgs extends dju {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final dtw b = dju.aE;
   @Nullable
   private dth c;
   @Nullable
   private dth d;
   @Nullable
   private dth e;
   @Nullable
   private dth f;
   private static final Predicate<dtc> g = $$0 -> $$0 != null && ($$0.a(dga.ee) || $$0.a(dga.ef));

   @Override
   public MapCodec<? extends dgs> a() {
      return a;
   }

   protected dgs(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcz $$0, jd $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dcw $$0, jd $$1) {
      dth.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgc $$3 = bsx.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dth.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfq $$5 = bsx.af.a($$0);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dcw $$0, dth.b $$1, bsr $$2, jd $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqv $$4 : $$0.a(aqv.class, $$2.cK().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dcw $$0, dth.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dtg $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dga.a.o(), 2);
            $$0.c(2001, $$4.d(), dfy.i($$4.a()));
         }
      }
   }

   public static void b(dcw $$0, dth.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dtg $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dga.a);
         }
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   private dth b() {
      if (this.c == null) {
         this.c = dti.a().a(" ", "#", "#").a('#', dtg.a(dtl.a(dga.dP))).b();
      }

      return this.c;
   }

   private dth m() {
      if (this.d == null) {
         this.d = dti.a().a("^", "#", "#").a('^', dtg.a(g)).a('#', dtg.a(dtl.a(dga.dP))).b();
      }

      return this.d;
   }

   private dth y() {
      if (this.e == null) {
         this.e = dti.a().a("~ ~", "###", "~#~").a('#', dtg.a(dtl.a(dga.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dth z() {
      if (this.f == null) {
         this.f = dti.a().a("~^~", "###", "~#~").a('^', dtg.a(g)).a('#', dtg.a(dtl.a(dga.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
