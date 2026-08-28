import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnb extends dqg {
   public static final MapCodec<dnb> a = b(dnb::new);
   public static final ebf<ja> b = dqg.e;
   @Nullable
   private eam c;
   @Nullable
   private eam d;
   @Nullable
   private eam f;
   @Nullable
   private eam g;
   private static final Predicate<eah> h = $$0 -> $$0 != null && ($$0.a(dmh.ev) || $$0.a(dmh.ew));

   @Override
   public MapCodec<? extends dnb> a() {
      return a;
   }

   protected dnb(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.c));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(djd $$0, iu $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dja $$0, iu $$1) {
      eam.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cjy $$3 = bwo.bl.a($$0, bwn.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         eam.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cjk $$5 = bwo.ap.a($$0, bwn.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dja $$0, eam.b $$1, bwf $$2, iu $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arr $$4 : $$0.a(arr.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dja $$0, eam.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eal $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmh.a.m(), 2);
            $$0.c(2001, $$4.d(), dmf.j($$4.a()));
         }
      }
   }

   public static void b(dja $$0, eam.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eal $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmh.a);
         }
      }
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   private eam b() {
      if (this.c == null) {
         this.c = ean.a().a(" ", "#", "#").a('#', eal.a(eaq.a(dmh.ef))).b();
      }

      return this.c;
   }

   private eam q() {
      if (this.d == null) {
         this.d = ean.a().a("^", "#", "#").a('^', eal.a(h)).a('#', eal.a(eaq.a(dmh.ef))).b();
      }

      return this.d;
   }

   private eam r() {
      if (this.f == null) {
         this.f = ean.a().a("~ ~", "###", "~#~").a('#', eal.a(eaq.a(dmh.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private eam y() {
      if (this.g == null) {
         this.g = ean.a().a("~^~", "###", "~#~").a('^', eal.a(h)).a('#', eal.a(eaq.a(dmh.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
