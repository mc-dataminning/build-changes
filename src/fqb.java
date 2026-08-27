import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fqb implements fqg<dcn> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fie g;
   private final fie h;
   private final fie i;

   public fqb(fqh.a $$0) {
      fie $$1 = $$0.a(fid.f);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fik a() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("flag", fij.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fig.a);
      $$1.a("pole", fij.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fig.a);
      $$1.a("bar", fij.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fig.a);
      return fik.a($$0, 64, 64);
   }

   public void a(dcn $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      List<Pair<hg<dco>, chv>> $$6 = $$0.c();
      float $$7 = 0.6666667F;
      boolean $$8 = $$0.k() == null;
      $$2.a();
      long $$9;
      if ($$8) {
         $$9 = 0L;
         $$2.a(0.5F, 0.5F, 0.5F);
         this.h.k = true;
      } else {
         $$9 = $$0.k().V();
         dfl $$11 = $$0.q();
         if ($$11.b() instanceof csd) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dgr.b($$11.c(csd.a));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dbs.a).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      elv $$14 = gbm.f.a($$3, foo::c);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      gw $$15 = $$0.p();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * ary.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gbm.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(elr $$0, fog $$1, int $$2, int $$3, fie $$4, gbk $$5, boolean $$6, List<Pair<hg<dco>, chv>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(elr $$0, fog $$1, int $$2, int $$3, fie $$4, gbk $$5, boolean $$6, List<Pair<hg<dco>, chv>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, foo::c, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<hg<dco>, chv> $$10 = $$7.get($$9);
         float[] $$11 = ((chv)$$10.getSecond()).d();
         ((hg)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fov.a($$1x) : fov.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, foo::m), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
