import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgc extends dje {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dtf b = dje.aE;
   @Nullable
   private dsq c;
   @Nullable
   private dsq d;
   @Nullable
   private dsq e;
   @Nullable
   private dsq f;
   private static final Predicate<dsl> g = $$0 -> $$0 != null && ($$0.a(dfk.ee) || $$0.a(dfk.ef));

   @Override
   public MapCodec<? extends dgc> a() {
      return a;
   }

   protected dgc(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcj $$0, ja $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dcg $$0, ja $$1) {
      dsq.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cfq $$3 = bsn.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsq.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfe $$5 = bsn.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dcg $$0, dsq.b $$1, bsh $$2, ja $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aqn $$4 : $$0.a(aqn.class, $$2.cM().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dcg $$0, dsq.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsp $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfk.a.o(), 2);
            $$0.c(2001, $$4.d(), dfi.i($$4.a()));
         }
      }
   }

   public static void b(dcg $$0, dsq.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsp $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfk.a);
         }
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   private dsq b() {
      if (this.c == null) {
         this.c = dsr.a().a(" ", "#", "#").a('#', dsp.a(dsu.a(dfk.dP))).b();
      }

      return this.c;
   }

   private dsq m() {
      if (this.d == null) {
         this.d = dsr.a().a("^", "#", "#").a('^', dsp.a(g)).a('#', dsp.a(dsu.a(dfk.dP))).b();
      }

      return this.d;
   }

   private dsq y() {
      if (this.e == null) {
         this.e = dsr.a().a("~ ~", "###", "~#~").a('#', dsp.a(dsu.a(dfk.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsq z() {
      if (this.f == null) {
         this.f = dsr.a().a("~^~", "###", "~#~").a('^', dsp.a(g)).a('#', dsp.a(dsu.a(dfk.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
