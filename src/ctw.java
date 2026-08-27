import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctw extends cww {
   public static final MapCodec<ctw> a = b(ctw::new);
   public static final dfx b = cww.aE;
   @Nullable
   private dfi c;
   @Nullable
   private dfi d;
   @Nullable
   private dfi e;
   @Nullable
   private dfi f;
   private static final Predicate<dfd> g = $$0 -> $$0 != null && ($$0.a(cte.ee) || $$0.a(cte.ef));

   @Override
   public MapCodec<? extends ctw> a() {
      return a;
   }

   protected ctw(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c));
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cqe $$0, gw $$1) {
      return this.b().a($$0, $$1) != null || this.x().a($$0, $$1) != null;
   }

   private void a(cqb $$0, gw $$1) {
      dfi.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bvv $$3 = bja.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dfi.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bvj $$5 = bja.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cqb $$0, dfi.b $$1, biw $$2, gw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aku $$4 : $$0.a(aku.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cqb $$0, dfi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfh $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cte.a.o(), 2);
            $$0.c(2001, $$4.d(), ctc.i($$4.a()));
         }
      }
   }

   public static void b(cqb $$0, dfi.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dfh $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cte.a);
         }
      }
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   private dfi b() {
      if (this.c == null) {
         this.c = dfj.a().a(" ", "#", "#").a('#', dfh.a(dfm.a(cte.dP))).b();
      }

      return this.c;
   }

   private dfi g() {
      if (this.d == null) {
         this.d = dfj.a().a("^", "#", "#").a('^', dfh.a(g)).a('#', dfh.a(dfm.a(cte.dP))).b();
      }

      return this.d;
   }

   private dfi x() {
      if (this.e == null) {
         this.e = dfj.a().a("~ ~", "###", "~#~").a('#', dfh.a(dfm.a(cte.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dfi y() {
      if (this.f == null) {
         this.f = dfj.a().a("~^~", "###", "~#~").a('^', dfh.a(g)).a('#', dfh.a(dfm.a(cte.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
