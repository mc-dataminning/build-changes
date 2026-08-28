import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnn extends dqs {
   public static final MapCodec<dnn> a = b(dnn::new);
   public static final ebr<jb> b = dqs.e;
   @Nullable
   private eay c;
   @Nullable
   private eay d;
   @Nullable
   private eay f;
   @Nullable
   private eay g;
   private static final Predicate<eat> h = $$0 -> $$0 != null && ($$0.a(dmt.ev) || $$0.a(dmt.ew));

   @Override
   public MapCodec<? extends dnn> a() {
      return a;
   }

   protected dnn(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(djp $$0, iv $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(djm $$0, iv $$1) {
      eay.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ckc $$3 = bwr.bl.a($$0, bwq.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         eay.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cjp $$5 = bwr.ap.a($$0, bwq.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(djm $$0, eay.b $$1, bwi $$2, iv $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arr $$4 : $$0.a(arr.class, $$2.cQ().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(djm $$0, eay.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eax $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmt.a.m(), 2);
            $$0.c(2001, $$4.d(), dmr.j($$4.a()));
         }
      }
   }

   public static void b(djm $$0, eay.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eax $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmt.a);
         }
      }
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   private eay b() {
      if (this.c == null) {
         this.c = eaz.a().a(" ", "#", "#").a('#', eax.a(ebc.a(dmt.ef))).b();
      }

      return this.c;
   }

   private eay q() {
      if (this.d == null) {
         this.d = eaz.a().a("^", "#", "#").a('^', eax.a(h)).a('#', eax.a(ebc.a(dmt.ef))).b();
      }

      return this.d;
   }

   private eay r() {
      if (this.f == null) {
         this.f = eaz.a().a("~ ~", "###", "~#~").a('#', eax.a(ebc.a(dmt.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private eay y() {
      if (this.g == null) {
         this.g = eaz.a().a("~^~", "###", "~#~").a('^', eax.a(h)).a('#', eax.a(ebc.a(dmt.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
