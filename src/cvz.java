import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvz extends cza {
   public static final MapCodec<cvz> a = b(cvz::new);
   public static final dih b = cza.aE;
   @Nullable
   private dhs c;
   @Nullable
   private dhs d;
   @Nullable
   private dhs e;
   @Nullable
   private dhs f;
   private static final Predicate<dhn> g = $$0 -> $$0 != null && ($$0.a(cvh.ee) || $$0.a(cvh.ef));

   @Override
   public MapCodec<? extends cvz> a() {
      return a;
   }

   protected cvz(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c));
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(csi $$0, hx $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(csf $$0, hx $$1) {
      dhs.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         bxu $$3 = bkz.aO.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dhs.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            bxi $$5 = bkz.ac.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(csf $$0, dhs.b $$1, bkv $$2, hx $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (amj $$4 : $$0.a(amj.class, $$2.cH().g(5.0))) {
         al.n.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(csf $$0, dhs.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dhr $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cvh.a.o(), 2);
            $$0.c(2001, $$4.d(), cvf.i($$4.a()));
         }
      }
   }

   public static void b(csf $$0, dhs.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dhr $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cvh.a);
         }
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   private dhs b() {
      if (this.c == null) {
         this.c = dht.a().a(" ", "#", "#").a('#', dhr.a(dhw.a(cvh.dP))).b();
      }

      return this.c;
   }

   private dhs g() {
      if (this.d == null) {
         this.d = dht.a().a("^", "#", "#").a('^', dhr.a(g)).a('#', dhr.a(dhw.a(cvh.dP))).b();
      }

      return this.d;
   }

   private dhs s() {
      if (this.e == null) {
         this.e = dht.a().a("~ ~", "###", "~#~").a('#', dhr.a(dhw.a(cvh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dhs y() {
      if (this.f == null) {
         this.f = dht.a().a("~^~", "###", "~#~").a('^', dhr.a(g)).a('#', dhr.a(dhw.a(cvh.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
