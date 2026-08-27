import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoe extends gfd {
   static final Logger a = LogUtils.getLogger();
   static final tn b = tn.c("mco.backup.button.restore");
   static final tn c = tn.c("mco.backup.changes.tooltip");
   private static final tn y = tn.c("mco.configure.world.backup");
   private static final tn z = tn.c("mco.backup.nobackups");
   private final eoh A;
   List<emn> B = Collections.emptyList();
   eoe.a C;
   int D = -1;
   private final int E;
   private ess F;
   private ess G;
   private ess H;
   Boolean I = false;
   final emy J;
   private static final String K = "uploaded";

   public eoe(eoh $$0, emy $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aH_() {
      this.C = new eoe.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            emh $$0 = emh.a();

            try {
               List<emn> $$1 = $$0.e(eoe.this.J.a).a;
               eoe.this.f.execute(() -> {
                  eoe.this.B = $$1;
                  eoe.this.I = eoe.this.B.isEmpty();
                  eoe.this.C.w();

                  for (emn $$1x : eoe.this.B) {
                     eoe.this.C.a($$1x);
                  }
               });
            } catch (enu var3) {
               eoe.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((ess)ess.a(tn.c("mco.backup.button.download"), $$0 -> this.G()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((ess)ess.a(tn.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((ess)ess.a(tn.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eod(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((ess)ess.a(tm.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.C);
      this.b(this.C);
      this.D();
   }

   @Override
   void D() {
      this.G.j = this.F();
      this.H.j = this.E();
   }

   private boolean E() {
      return this.D == -1 ? false : !this.B.get(this.D).e.isEmpty();
   }

   private boolean F() {
      return this.D == -1 ? false : !this.J.j;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   void a(int $$0) {
      if ($$0 >= 0 && $$0 < this.B.size() && !this.J.j) {
         this.D = $$0;
         Date $$1 = this.B.get($$0).b;
         String $$2 = DateFormat.getDateTimeInstance(3, 3).format($$1);
         tn $$3 = epo.a($$1);
         tn $$4 = tn.a("mco.configure.world.restore.question.line1", $$2, $$3);
         tn $$5 = tn.c("mco.configure.world.restore.question.line2");
         this.f.a(new eon($$0x -> {
            if ($$0x) {
               this.I();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eon.a.a, $$4, $$5, true));
      }
   }

   private void G() {
      tn $$0 = tn.c("mco.configure.world.restore.download.question.line1");
      tn $$1 = tn.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eon($$0x -> {
         if ($$0x) {
            this.H();
         } else {
            this.f.a(this);
         }
      }, eon.a.b, $$0, $$1, true));
   }

   private void H() {
      this.f.a(new eoo(this.A.f(), new epv(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void I() {
      emn $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eoo(this.A.f(), new eqc($$0, this.J.a, this.A)));
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gfc<eoe.b> {
      public a() {
         super(eoe.this.g - 150, eoe.this.h, 32, eoe.this.h - 15, 36);
      }

      public void a(emn $$0) {
         this.a((eoe.b)(eoe.this.new b($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.e * 0.93);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int c() {
         return this.e - 5;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         eoe.this.D = $$0;
         eoe.this.D();
      }

      public void a(@Nullable eoe.b $$0) {
         super.a($$0);
         eoe.this.D = this.i().indexOf($$0);
         eoe.this.D();
      }
   }

   class b extends eto.a<eoe.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final eue d = new eue(new aey("backup/changes"), new aey("backup/changes_highlighted"));
      private static final eue e = new eue(new aey("backup/restore"), new aey("backup/restore_highlighted"));
      private final emn f;
      private final List<esq> g = new ArrayList<>();
      @Nullable
      private ete h;
      @Nullable
      private ete i;

      public b(emn $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eoe.this.J.j) {
            this.d();
         }
      }

      private void a(emn $$0) {
         int $$1 = eoe.this.B.indexOf($$0);
         if ($$1 != eoe.this.B.size() - 1) {
            emn $$2 = eoe.this.B.get($$1 + 1);

            for (String $$3 : $$0.d.keySet()) {
               if (!$$3.contains("uploaded") && $$2.d.containsKey($$3)) {
                  if (!$$0.d.get($$3).equals($$2.d.get($$3))) {
                     this.a($$3);
                  }
               } else {
                  this.a($$3);
               }
            }
         }
      }

      private void a(String $$0) {
         if ($$0.contains("uploaded")) {
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.f.b);
            this.f.e.put($$0, $$1);
            this.f.a(true);
         } else {
            this.f.e.put($$0, this.f.d.get($$0));
         }
      }

      private void b() {
         int $$0 = 9;
         int $$1 = 9;
         int $$2 = eoe.this.C.p() - 9 - 28;
         int $$3 = eoe.this.C.h(eoe.this.B.indexOf(this.f)) + 2;
         this.i = new ete($$2, $$3, 9, 9, d, $$0x -> eoe.this.f.a(new eod(eoe.this, this.f)), tm.a);
         this.i.a(euc.a(eoe.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eoe.this.C.p() - 17 - 7;
         int $$3 = eoe.this.C.h(eoe.this.B.indexOf(this.f)) + 2;
         this.h = new ete($$2, $$3, 17, 10, e, $$0x -> eoe.this.a(eoe.this.B.indexOf(this.f)), tm.a);
         this.h.a(euc.a(eoe.b));
         this.g.add(this.h);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         if (this.h != null) {
            this.h.a($$0, $$1, $$2);
         }

         if (this.i != null) {
            this.i.a($$0, $$1, $$2);
         }

         return true;
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eoe.this.i, tn.a("mco.backup.entry", epo.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eoe.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public tn a() {
         return tn.a("narrator.select", this.f.b.toString());
      }
   }
}
