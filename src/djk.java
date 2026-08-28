import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djk extends dml {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dws<jm> b = dml.aF;
   @Nullable
   private dwa c;
   @Nullable
   private dwa d;
   @Nullable
   private dwa e;
   @Nullable
   private dwa f;
   private static final Predicate<dvv> g = $$0 -> $$0 != null && ($$0.a(dis.ee) || $$0.a(dis.ef));

   @Override
   public MapCodec<? extends djk> a() {
      return a;
   }

   protected djk(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dfp $$0, jh $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dfm $$0, jh $$1) {
      dwa.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         chw $$3 = bus.bh.a($$0, bur.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dwa.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            chk $$5 = bus.ao.a($$0, bur.k);
            if ($$5 != null) {
               $$5.y(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dfm $$0, dwa.b $$1, bul $$2, jh $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arq $$4 : $$0.a(arq.class, $$2.cR().g(5.0))) {
         ao.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dfm $$0, dwa.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvz $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dis.a.m(), 2);
            $$0.c(2001, $$4.d(), diq.j($$4.a()));
         }
      }
   }

   public static void b(dfm $$0, dwa.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dvz $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dis.a);
         }
      }
   }

   @Override
   public dvv a(dad $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   private dwa b() {
      if (this.c == null) {
         this.c = dwb.a().a(" ", "#", "#").a('#', dvz.a(dwe.a(dis.dP))).b();
      }

      return this.c;
   }

   private dwa q() {
      if (this.d == null) {
         this.d = dwb.a().a("^", "#", "#").a('^', dvz.a(g)).a('#', dvz.a(dwe.a(dis.dP))).b();
      }

      return this.d;
   }

   private dwa r() {
      if (this.e == null) {
         this.e = dwb.a().a("~ ~", "###", "~#~").a('#', dvz.a(dwe.a(dis.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.e;
   }

   private dwa y() {
      if (this.f == null) {
         this.f = dwb.a().a("~^~", "###", "~#~").a('^', dvz.a(g)).a('#', dvz.a(dwe.a(dis.ci))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }
}
