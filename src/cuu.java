import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cuu extends cxu {
   public static final MapCodec<cuu> a = b(cuu::new);
   public static final dgv b = cxu.aE;
   @Nullable
   private dgg c;
   @Nullable
   private dgg d;
   @Nullable
   private dgg e;
   @Nullable
   private dgg f;
   private static final Predicate<dgb> g = $$0 -> $$0 != null && ($$0.a(cuc.ee) || $$0.a(cuc.ef));

   @Override
   public MapCodec<? extends cuu> a() {
      return a;
   }

   protected cuu(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(crc $$0, ht $$1) {
      return this.b().a($$0, $$1) != null || this.x().a($$0, $$1) != null;
   }

   private void a(cqz $$0, ht $$1) {
      dgg.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bws $$3 = bjx.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dgg.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bwg $$5 = bjx.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cqz $$0, dgg.b $$1, bjt $$2, ht $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (alr $$4 : $$0.a(alr.class, $$2.cG().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cqz $$0, dgg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dgf $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cuc.a.o(), 2);
            $$0.c(2001, $$4.d(), cua.i($$4.a()));
         }
      }
   }

   public static void b(cqz $$0, dgg.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dgf $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cuc.a);
         }
      }
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   private dgg b() {
      if (this.c == null) {
         this.c = dgh.a().a(" ", "#", "#").a('#', dgf.a(dgk.a(cuc.dP))).b();
      }

      return this.c;
   }

   private dgg g() {
      if (this.d == null) {
         this.d = dgh.a().a("^", "#", "#").a('^', dgf.a(g)).a('#', dgf.a(dgk.a(cuc.dP))).b();
      }

      return this.d;
   }

   private dgg x() {
      if (this.e == null) {
         this.e = dgh.a().a("~ ~", "###", "~#~").a('#', dgf.a(dgk.a(cuc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dgg y() {
      if (this.f == null) {
         this.f = dgh.a().a("~^~", "###", "~#~").a('^', dgf.a(g)).a('#', dgf.a(dgk.a(cuc.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
