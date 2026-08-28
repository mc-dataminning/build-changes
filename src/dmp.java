import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dmp extends dpt {
   public static final MapCodec<dmp> a = b(dmp::new);
   public static final eam<ja> b = dpt.e;
   @Nullable
   private dzt c;
   @Nullable
   private dzt d;
   @Nullable
   private dzt f;
   @Nullable
   private dzt g;
   private static final Predicate<dzo> h = $$0 -> $$0 != null && ($$0.a(dlw.er) || $$0.a(dlw.es));

   @Override
   public MapCodec<? extends dmp> a() {
      return a;
   }

   protected dmp(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dis $$0, iu $$1) {
      return this.b().a($$0, $$1) != null || this.r().a($$0, $$1) != null;
   }

   private void a(dip $$0, iu $$1) {
      dzt.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         cjo $$3 = bwj.bl.a($$0, bwi.k);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dzt.b $$4 = this.y().a($$0, $$1);
         if ($$4 != null) {
            cja $$5 = bwj.ap.a($$0, bwi.k);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dip $$0, dzt.b $$1, bwa $$2, iu $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arp $$4 : $$0.a(arp.class, $$2.cR().g(5.0))) {
         ap.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dip $$0, dzt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dzs $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dlw.a.m(), 2);
            $$0.c(2001, $$4.d(), dlu.j($$4.a()));
         }
      }
   }

   public static void b(dip $$0, dzt.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dzs $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dlw.a);
         }
      }
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   private dzt b() {
      if (this.c == null) {
         this.c = dzu.a().a(" ", "#", "#").a('#', dzs.a(dzx.a(dlw.ec))).b();
      }

      return this.c;
   }

   private dzt q() {
      if (this.d == null) {
         this.d = dzu.a().a("^", "#", "#").a('^', dzs.a(h)).a('#', dzs.a(dzx.a(dlw.ec))).b();
      }

      return this.d;
   }

   private dzt r() {
      if (this.f == null) {
         this.f = dzu.a().a("~ ~", "###", "~#~").a('#', dzs.a(dzx.a(dlw.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.f;
   }

   private dzt y() {
      if (this.g == null) {
         this.g = dzu.a().a("~^~", "###", "~#~").a('^', dzs.a(h)).a('#', dzs.a(dzx.a(dlw.cp))).a('~', $$0 -> $$0.a().l()).b();
      }

      return this.g;
   }
}
