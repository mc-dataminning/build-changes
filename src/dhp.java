import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhp extends dkr {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final duu b = dkr.aE;
   @Nullable
   private duf c;
   @Nullable
   private duf d;
   @Nullable
   private duf e;
   @Nullable
   private duf f;
   private static final Predicate<dua> g = $$0 -> $$0 != null && ($$0.a(dgx.ee) || $$0.a(dgx.ef));

   @Override
   public MapCodec<? extends dhp> a() {
      return a;
   }

   protected dhp(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, jj.c));
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(ddv $$0, je $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dds $$0, je $$1) {
      duf.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgt $$3 = btq.aS.a($$0, btp.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         duf.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cgh $$5 = btq.af.a($$0, btp.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dds $$0, duf.b $$1, btj $$2, je $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arh $$4 : $$0.a(arh.class, $$2.cO().g(5.0))) {
         an.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dds $$0, duf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            due $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dgx.a.o(), 2);
            $$0.c(2001, $$4.d(), dgv.j($$4.a()));
         }
      }
   }

   public static void b(dds $$0, duf.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            due $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dgx.a);
         }
      }
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   private duf b() {
      if (this.c == null) {
         this.c = dug.a().a(" ", "#", "#").a('#', due.a(duj.a(dgx.dP))).b();
      }

      return this.c;
   }

   private duf m() {
      if (this.d == null) {
         this.d = dug.a().a("^", "#", "#").a('^', due.a(g)).a('#', due.a(duj.a(dgx.dP))).b();
      }

      return this.d;
   }

   private duf y() {
      if (this.e == null) {
         this.e = dug.a().a("~ ~", "###", "~#~").a('#', due.a(duj.a(dgx.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private duf z() {
      if (this.f == null) {
         this.f = dug.a().a("~^~", "###", "~#~").a('^', due.a(g)).a('#', due.a(duj.a(dgx.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
