import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dni extends dqn {
   public static final MapCodec<dni> a = b(dni::new);
   public static final ebm<jb> b = dqn.e;
   @Nullable
   private eat c;
   @Nullable
   private eat d;
   @Nullable
   private eat f;
   @Nullable
   private eat g;
   private static final Predicate<eao> h = $$0 -> $$0 != null && ($$0.a(dmo.ev) || $$0.a(dmo.ew));

   @Override
   public MapCodec<? extends dni> a() {
      return a;
   }

   protected dni(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(djk $$0, iv $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(djh $$0, iv $$1) {
      eat.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         ckc $$3 = bwr.bl.a($$0, bwq.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         eat.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cjp $$5 = bwr.ap.a($$0, bwq.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(djh $$0, eat.b $$1, bwi $$2, iv $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arr $$4 : $$0.a(arr.class, $$2.cQ().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(djh $$0, eat.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eas $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmo.a.m(), 2);
            $$0.c(2001, $$4.d(), dmm.j($$4.a()));
         }
      }
   }

   public static void b(djh $$0, eat.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            eas $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dmo.a);
         }
      }
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   private eat b() {
      if (this.c == null) {
         this.c = eau.a().a(" ", "#", "#").a('#', eas.a(eax.a(dmo.ef))).b();
      }

      return this.c;
   }

   private eat q() {
      if (this.d == null) {
         this.d = eau.a().a("^", "#", "#").a('^', eas.a(h)).a('#', eas.a(eax.a(dmo.ef))).b();
      }

      return this.d;
   }

   private eat r() {
      if (this.f == null) {
         this.f = eau.a().a("~ ~", "###", "~#~").a('#', eas.a(eax.a(dmo.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private eat y() {
      if (this.g == null) {
         this.g = eau.a().a("~^~", "###", "~#~").a('^', eas.a(h)).a('#', eas.a(eax.a(dmo.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
