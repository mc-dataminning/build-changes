import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eou extends gfx {
   static final Logger a = LogUtils.getLogger();
   static final ui b = ui.c("mco.backup.button.restore");
   static final ui c = ui.c("mco.backup.changes.tooltip");
   private static final ui y = ui.c("mco.configure.world.backup");
   private static final ui z = ui.c("mco.backup.nobackups");
   private final eox A;
   List<end> B = Collections.emptyList();
   eou.a C;
   int D = -1;
   private final int E;
   private etj F;
   private etj G;
   private etj H;
   Boolean I = false;
   final eno J;
   private static final String K = "uploaded";

   public eou(eox $$0, eno $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aM_() {
      this.C = new eou.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            emx $$0 = emx.a();

            try {
               List<end> $$1 = $$0.e(eou.this.J.a).a;
               eou.this.f.execute(() -> {
                  eou.this.B = $$1;
                  eou.this.I = eou.this.B.isEmpty();
                  eou.this.C.v();

                  for (end $$1x : eou.this.B) {
                     eou.this.C.a($$1x);
                  }
               });
            } catch (eok var3) {
               eou.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((etj)etj.a(ui.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((etj)etj.a(ui.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((etj)etj.a(ui.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eot(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((etj)etj.a(uh.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.C);
      this.b(this.C);
      this.C();
   }

   @Override
   void C() {
      this.G.j = this.E();
      this.H.j = this.D();
   }

   private boolean D() {
      return this.D == -1 ? false : !this.B.get(this.D).e.isEmpty();
   }

   private boolean E() {
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
         ui $$3 = eqe.a($$1);
         ui $$4 = ui.a("mco.configure.world.restore.question.line1", $$2, $$3);
         ui $$5 = ui.c("mco.configure.world.restore.question.line2");
         this.f.a(new epd($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, epd.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      ui $$0 = ui.c("mco.configure.world.restore.download.question.line1");
      ui $$1 = ui.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new epd($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, epd.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new epe(this.A.f(), new eqm(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void H() {
      end $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new epe(this.A.f(), new eqt($$0, this.J.a, this.A)));
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gfw<eou.b> {
      public a() {
         super(eou.this.g - 150, eou.this.h, 32, eou.this.h - 15, 36);
      }

      public void a(end $$0) {
         this.a((eou.b)(eou.this.new b($$0)));
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
         eou.this.D = $$0;
         eou.this.C();
      }

      public void a(@Nullable eou.b $$0) {
         super.a($$0);
         eou.this.D = this.i().indexOf($$0);
         eou.this.C();
      }
   }

   class b extends euf.a<eou.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final euw d = new euw(new afw("backup/changes"), new afw("backup/changes_highlighted"));
      private static final euw e = new euw(new afw("backup/restore"), new afw("backup/restore_highlighted"));
      private final end f;
      private final List<eth> g = new ArrayList<>();
      @Nullable
      private etv h;
      @Nullable
      private etv i;

      public b(end $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eou.this.J.j) {
            this.c();
         }
      }

      private void a(end $$0) {
         int $$1 = eou.this.B.indexOf($$0);
         if ($$1 != eou.this.B.size() - 1) {
            end $$2 = eou.this.B.get($$1 + 1);

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
         int $$2 = eou.this.C.p() - 9 - 28;
         int $$3 = eou.this.C.h(eou.this.B.indexOf(this.f)) + 2;
         this.i = new etv($$2, $$3, 9, 9, d, $$0x -> eou.this.f.a(new eot(eou.this, this.f)), uh.a);
         this.i.a(euu.a(eou.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eou.this.C.p() - 17 - 7;
         int $$3 = eou.this.C.h(eou.this.B.indexOf(this.f)) + 2;
         this.h = new etv($$2, $$3, 17, 10, e, $$0x -> eou.this.a(eou.this.B.indexOf(this.f)), uh.a);
         this.h.a(euu.a(eou.b));
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
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eou.this.i, ui.a("mco.backup.entry", eqe.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eou.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public ui a() {
         return ui.a("narrator.select", this.f.b.toString());
      }
   }
}
