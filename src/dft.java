import com.mojang.serialization.MapCodec;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dft extends div {
   public static final MapCodec<dft> a = b(dft::new);
   public static final dsw b = div.aE;
   @Nullable
   private dsh c;
   @Nullable
   private dsh d;
   @Nullable
   private dsh e;
   @Nullable
   private dsh f;
   private static final Predicate<dsc> g = $$0 -> $$0 != null && ($$0.a(dfb.ee) || $$0.a(dfb.ef));

   @Override
   public MapCodec<? extends dft> a() {
      return a;
   }

   protected dft(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(dcb $$0, iz $$1) {
      return this.b().a($$0, $$1) != null || this.y().a($$0, $$1) != null;
   }

   private void a(dby $$0, iz $$1) {
      dsh.b $$2 = this.m().a($$0, $$1);
      if ($$2 != null) {
         cgd $$3 = bta.aS.a($$0);
         if ($$3 != null) {
            a($$0, $$2, $$3, $$2.a(0, 2, 0).d());
         }
      } else {
         dsh.b $$4 = this.z().a($$0, $$1);
         if ($$4 != null) {
            cfr $$5 = bta.af.a($$0);
            if ($$5 != null) {
               $$5.x(true);
               a($$0, $$4, $$5, $$4.a(1, 2, 0).d());
            }
         }
      }
   }

   private static void a(dby $$0, dsh.b $$1, bsu $$2, iz $$3) {
      a($$0, $$1);
      $$2.b((double)$$3.u() + 0.5, (double)$$3.v() + 0.05, (double)$$3.w() + 0.5, 0.0F, 0.0F);
      $$0.b($$2);

      for (arg $$4 : $$0.a(arg.class, $$2.cK().g(5.0))) {
         am.o.a($$4, $$2);
      }

      b($$0, $$1);
   }

   public static void a(dby $$0, dsh.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsg $$4 = $$1.a($$2, $$3, 0);
            $$0.a($$4.d(), dfb.a.o(), 2);
            $$0.c(2001, $$4.d(), dez.i($$4.a()));
         }
      }
   }

   public static void b(dby $$0, dsh.b $$1) {
      for (int $$2 = 0; $$2 < $$1.d(); $$2++) {
         for (int $$3 = 0; $$3 < $$1.e(); $$3++) {
            dsg $$4 = $$1.a($$2, $$3, 0);
            $$0.b($$4.d(), dfb.a);
         }
      }
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   private dsh b() {
      if (this.c == null) {
         this.c = dsi.a().a(" ", "#", "#").a('#', dsg.a(dsl.a(dfb.dP))).b();
      }

      return this.c;
   }

   private dsh m() {
      if (this.d == null) {
         this.d = dsi.a().a("^", "#", "#").a('^', dsg.a(g)).a('#', dsg.a(dsl.a(dfb.dP))).b();
      }

      return this.d;
   }

   private dsh y() {
      if (this.e == null) {
         this.e = dsi.a().a("~ ~", "###", "~#~").a('#', dsg.a(dsl.a(dfb.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.e;
   }

   private dsh z() {
      if (this.f == null) {
         this.f = dsi.a().a("~^~", "###", "~#~").a('^', dsg.a(g)).a('#', dsg.a(dsl.a(dfb.ci))).a('~', $$0 -> $$0.a().i()).b();
      }

      return this.f;
   }
}
