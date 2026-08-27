import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class czi extends dcj {
   public static final MapCodec<czi> a = b(czi::new);
   public static final dlz b = dcj.aE;
   @Nullable
   private dlk c;
   @Nullable
   private dlk d;
   @Nullable
   private dlk e;
   @Nullable
   private dlk f;
   private static final Predicate<dlf> g = $$0 -> $$0 != null && ($$0.a(cyq.ee) || $$0.a(cyq.ef));

   @Override
   public MapCodec<? extends czi> a() {
      return a;
   }

   protected czi(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   protected void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cvq $$0, hz $$1) {
      return this.b().a($$0, $$1) != null || this.s().a($$0, $$1) != null;
   }

   private void a(cvn $$0, hz $$1) {
      dlk.b $$2 = this.g().a($$0, $$1);
      if ($$2 != null) {
         car $$3 = bnu.aQ.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dlk.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            caf $$5 = bnu.ae.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(cvn $$0, dlk.b $$1, bno $$2, hz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (aow $$4 : $$0.a(aow.class, $$2.cH().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(cvn $$0, dlk.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dlj $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), cyq.a.o(), 2);
            $$0.c(2001, $$4.d(), cyo.i($$4.a()));
         }
      }
   }

   public static void b(cvn $$0, dlk.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dlj $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), cyq.a);
         }
      }
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   private dlk b() {
      if (this.c == null) {
         this.c = dll.a().a(" ", "#", "#").a('#', dlj.a(dlo.a(cyq.dP))).b();
      }

      return this.c;
   }

   private dlk g() {
      if (this.d == null) {
         this.d = dll.a().a("^", "#", "#").a('^', dlj.a(g)).a('#', dlj.a(dlo.a(cyq.dP))).b();
      }

      return this.d;
   }

   private dlk s() {
      if (this.e == null) {
         this.e = dll.a().a("~ ~", "###", "~#~").a('#', dlj.a(dlo.a(cyq.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dlk y() {
      if (this.f == null) {
         this.f = dll.a().a("~^~", "###", "~#~").a('^', dlj.a(g)).a('#', dlj.a(dlo.a(cyq.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
