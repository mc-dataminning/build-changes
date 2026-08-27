import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ejh {
   public static final int a = 90;
   static final akm b = new akm("igloo/top");
   private static final akm c = new akm("igloo/middle");
   private static final akm d = new akm("igloo/bottom");
   static final Map<akm, io> e = ImmutableMap.of(b, new io(3, 5, 5), c, new io(1, 3, 1), d, new io(3, 6, 7));
   static final Map<akm, io> f = ImmutableMap.of(b, io.c, c, new io(2, -3, 4), d, new io(0, -3, -2));

   public static void a(elk $$0, io $$1, dkl $$2, eho $$3, ayk $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new ejh.a($$0, d, $$1, $$2, $$5 * 3));

         for (int $$6 = 0; $$6 < $$5 - 1; $$6++) {
            $$3.a(new ejh.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new ejh.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends eht {
      public a(elk $$0, akm $$1, io $$2, dkl $$3, int $$4) {
         super(eia.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(elk $$0, ud $$1) {
         super(eia.I, $$1, $$0, $$1x -> a(dkl.valueOf($$1.l("Rot")), $$1x));
      }

      private static elf a(dkl $$0, akm $$1) {
         return new elf().a($$0).a(div.a).a(ejh.e.get($$1)).a(ekl.b);
      }

      private static io a(akm $$0, io $$1, int $$2) {
         return $$1.a(ejh.f.get($$0)).c($$2);
      }

      @Override
      protected void a(ehz $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, io $$1, dbm $$2, ayk $$3, ehb $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dea.a.n(), 3);
            dog $$5 = $$2.c_($$1.d());
            if ($$5 instanceof don) {
               ((don)$$5).a(epd.C, $$3.g());
            }
         }
      }

      @Override
      public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
         akm $$7 = new akm(this.a);
         elf $$8 = a(this.c.d(), $$7);
         io $$9 = ejh.f.get($$7);
         io $$10 = this.d.a((js)elj.a($$8, new io(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dwt.a.a, $$10.u(), $$10.w());
         io $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(ejh.b)) {
            io $$13 = this.d.a((js)elj.a($$8, new io(3, 0, 5)));
            drb $$14 = $$0.a_($$13.d());
            if (!$$14.i() && !$$14.a(dea.cO)) {
               $$0.a($$13, dea.dP.n(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
