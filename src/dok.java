import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dok extends drp {
   public static final MapCodec<dok> a = b(dok::new);
   public static final eco<jc> b = drp.e;
   @Nullable
   private ebv c;
   @Nullable
   private ebv d;
   @Nullable
   private ebv f;
   @Nullable
   private ebv g;
   private static final Predicate<ebq> h = $$0 -> $$0 != null && ($$0.a(dnq.ev) || $$0.a(dnq.ew));

   @Override
   public MapCodec<? extends dok> a() {
      return a;
   }

   protected dok(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dkm $$0, iw $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dkj $$0, iw $$1) {
      ebv.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cky $$3 = bxn.bm.a($$0, bxm.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         ebv.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            ckl $$5 = bxn.aq.a($$0, bxm.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dkj $$0, ebv.b $$1, bxe $$2, iw $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (asc $$4 : $$0.a(asc.class, $$2.cR().g(5.0))) {
         aq.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dkj $$0, ebv.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebu $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dnq.a.m(), 2);
            $$0.c(2001, $$4.d(), dno.j($$4.a()));
         }
      }
   }

   public static void b(dkj $$0, ebv.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            ebu $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dnq.a);
         }
      }
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   private ebv b() {
      if (this.c == null) {
         this.c = ebw.a().a(" ", "#", "#").a('#', ebu.a(ebz.a(dnq.ef))).b();
      }

      return this.c;
   }

   private ebv q() {
      if (this.d == null) {
         this.d = ebw.a().a("^", "#", "#").a('^', ebu.a(h)).a('#', ebu.a(ebz.a(dnq.ef))).b();
      }

      return this.d;
   }

   private ebv r() {
      if (this.f == null) {
         this.f = ebw.a().a("~ ~", "###", "~#~").a('#', ebu.a(ebz.a(dnq.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private ebv y() {
      if (this.g == null) {
         this.g = ebw.a().a("~^~", "###", "~#~").a('^', ebu.a(h)).a('#', ebu.a(ebz.a(dnq.cs))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
