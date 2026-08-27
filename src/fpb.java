import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fpb implements fpg<dca> {
   private static final int b = 20;
   private static final int c = 40;
   private static final int d = 16;
   public static final String a = "flag";
   private static final String e = "pole";
   private static final String f = "bar";
   private final fhj g;
   private final fhj h;
   private final fhj i;

   public fpb(fph.a $$0) {
      fhj $$1 = $$0.a(fhi.f);
      this.g = $$1.b("flag");
      this.h = $$1.b("pole");
      this.i = $$1.b("bar");
   }

   public static fhp a() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("flag", fho.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), fhl.a);
      $$1.a("pole", fho.c().a(44, 0).a(-1.0F, -30.0F, -1.0F, 2.0F, 42.0F, 2.0F), fhl.a);
      $$1.a("bar", fho.c().a(0, 42).a(-10.0F, -32.0F, -1.0F, 20.0F, 2.0F, 2.0F), fhl.a);
      return fhp.a($$0, 64, 64);
   }

   public void a(dca $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      List<Pair<hf<dcb>, chk>> $$6 = $$0.c();
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
         dey $$11 = $$0.q();
         if ($$11.b() instanceof crq) {
            $$2.a(0.5F, 0.5F, 0.5F);
            float $$12 = -dge.b($$11.c(crq.a));
            $$2.a(a.d.rotationDegrees($$12));
            this.h.k = true;
         } else {
            $$2.a(0.5F, -0.16666667F, 0.5F);
            float $$13 = -$$11.c(dbf.a).p();
            $$2.a(a.d.rotationDegrees($$13));
            $$2.a(0.0F, -0.3125F, -0.4375F);
            this.h.k = false;
         }
      }

      $$2.a();
      $$2.b(0.6666667F, -0.6666667F, -0.6666667F);
      ell $$14 = gam.f.a($$3, fno::b);
      this.h.a($$2, $$14, $$4, $$5);
      this.i.a($$2, $$14, $$4, $$5);
      gv $$15 = $$0.p();
      float $$16 = ((float)Math.floorMod((long)($$15.u() * 7 + $$15.v() * 9 + $$15.w() * 13) + $$9, 100L) + $$1) / 100.0F;
      this.g.e = (-0.0125F + 0.01F * aro.b((float) (Math.PI * 2) * $$16)) * (float) Math.PI;
      this.g.c = -32.0F;
      a($$2, $$3, $$4, $$5, this.g, gam.f, true, $$6);
      $$2.b();
      $$2.b();
   }

   public static void a(elh $$0, fng $$1, int $$2, int $$3, fhj $$4, gak $$5, boolean $$6, List<Pair<hf<dcb>, chk>> $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, false);
   }

   public static void a(elh $$0, fng $$1, int $$2, int $$3, fhj $$4, gak $$5, boolean $$6, List<Pair<hf<dcb>, chk>> $$7, boolean $$8) {
      $$4.a($$0, $$5.a($$1, fno::b, $$8), $$2, $$3);

      for (int $$9 = 0; $$9 < 17 && $$9 < $$7.size(); $$9++) {
         Pair<hf<dcb>, chk> $$10 = $$7.get($$9);
         float[] $$11 = ((chk)$$10.getSecond()).d();
         ((hf)$$10.getFirst())
            .e()
            .map($$1x -> $$6 ? fnu.a($$1x) : fnu.b($$1x))
            .ifPresent($$6x -> $$4.a($$0, $$6x.a($$1, fno::l), $$2, $$3, $$11[0], $$11[1], $$11[2], 1.0F));
      }
   }
}
