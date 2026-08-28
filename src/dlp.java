import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlp extends dot {
   public static final MapCodec<dlp> a = b(dlp::new);
   public static final dzk<jo> b = dot.e;
   @Nullable
   private dyr c;
   @Nullable
   private dyr d;
   @Nullable
   private dyr f;
   @Nullable
   private dyr g;
   private static final Predicate<dym> h = $$0 -> $$0 != null && ($$0.a(dkw.er) || $$0.a(dkw.es));

   @Override
   public MapCodec<? extends dlp> a() {
      return a;
   }

   protected dlp(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dhs $$0, jj $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dhp $$0, jj $$1) {
      dyr.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cjg $$3 = bwb.bk.a($$0, bwa.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dyr.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cis $$5 = bwb.ap.a($$0, bwa.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dhp $$0, dyr.b $$1, bvs $$2, jj $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aro $$4 : $$0.a(aro.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dhp $$0, dyr.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dyq $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkw.a.m(), 2);
            $$0.c(2001, $$4.d(), dku.j($$4.a()));
         }
      }
   }

   public static void b(dhp $$0, dyr.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dyq $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dkw.a);
         }
      }
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   private dyr b() {
      if (this.c == null) {
         this.c = dys.a().a(" ", "#", "#").a('#', dyq.a(dyv.a(dkw.ec))).b();
      }

      return this.c;
   }

   private dyr q() {
      if (this.d == null) {
         this.d = dys.a().a("^", "#", "#").a('^', dyq.a(h)).a('#', dyq.a(dyv.a(dkw.ec))).b();
      }

      return this.d;
   }

   private dyr r() {
      if (this.f == null) {
         this.f = dys.a().a("~ ~", "###", "~#~").a('#', dyq.a(dyv.a(dkw.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private dyr y() {
      if (this.g == null) {
         this.g = dys.a().a("~^~", "###", "~#~").a('^', dyq.a(h)).a('#', dyq.a(dyv.a(dkw.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
