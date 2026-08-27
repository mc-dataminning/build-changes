import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enx extends gew {
   static final Logger a = LogUtils.getLogger();
   static final ti b = ti.c("mco.backup.button.restore");
   static final ti c = ti.c("mco.backup.changes.tooltip");
   private static final ti y = ti.c("mco.configure.world.backup");
   private static final ti z = ti.c("mco.backup.nobackups");
   private final eoa A;
   List<emg> B = Collections.emptyList();
   enx.a C;
   int D = -1;
   private final int E;
   private esl F;
   private esl G;
   private esl H;
   Boolean I = false;
   final emr J;
   private static final String K = "uploaded";

   public enx(eoa $$0, emr $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aD_() {
      this.C = new enx.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ema $$0 = ema.a();

            try {
               List<emg> $$1 = $$0.e(enx.this.J.a).a;
               enx.this.f.execute(() -> {
                  enx.this.B = $$1;
                  enx.this.I = enx.this.B.isEmpty();
                  enx.this.C.w();

                  for (emg $$1x : enx.this.B) {
                     enx.this.C.a($$1x);
                  }
               });
            } catch (enn var3) {
               enx.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esl)esl.a(ti.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esl)esl.a(ti.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esl)esl.a(ti.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new enw(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esl)esl.a(th.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
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
         ti $$3 = eph.a($$1);
         ti $$4 = ti.a("mco.configure.world.restore.question.line1", $$2, $$3);
         ti $$5 = ti.c("mco.configure.world.restore.question.line2");
         this.f.a(new eog($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eog.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      ti $$0 = ti.c("mco.configure.world.restore.download.question.line1");
      ti $$1 = ti.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eog($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eog.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eoh(this.A.f(), new epo(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void H() {
      emg $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eoh(this.A.f(), new epv($$0, this.J.a, this.A)));
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gev<enx.b> {
      public a() {
         super(enx.this.g - 150, enx.this.h, 32, enx.this.h - 15, 36);
      }

      public void a(emg $$0) {
         this.a((enx.b)(enx.this.new b($$0)));
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
         enx.this.D = $$0;
         enx.this.C();
      }

      public void a(@Nullable enx.b $$0) {
         super.a($$0);
         enx.this.D = this.i().indexOf($$0);
         enx.this.C();
      }
   }

   class b extends eth.a<enx.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final etx d = new etx(new aeu("backup/changes"), new aeu("backup/changes_highlighted"));
      private static final etx e = new etx(new aeu("backup/restore"), new aeu("backup/restore_highlighted"));
      private final emg f;
      private final List<esj> g = new ArrayList<>();
      @Nullable
      private esx h;
      @Nullable
      private esx i;

      public b(emg $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!enx.this.J.j) {
            this.d();
         }
      }

      private void a(emg $$0) {
         int $$1 = enx.this.B.indexOf($$0);
         if ($$1 != enx.this.B.size() - 1) {
            emg $$2 = enx.this.B.get($$1 + 1);

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
         int $$2 = enx.this.C.p() - 9 - 28;
         int $$3 = enx.this.C.h(enx.this.B.indexOf(this.f)) + 2;
         this.i = new esx($$2, $$3, 9, 9, d, $$0x -> enx.this.f.a(new enw(enx.this, this.f)), th.a);
         this.i.a(etv.a(enx.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = enx.this.C.p() - 17 - 7;
         int $$3 = enx.this.C.h(enx.this.B.indexOf(this.f)) + 2;
         this.h = new esx($$2, $$3, 17, 10, e, $$0x -> enx.this.a(enx.this.B.indexOf(this.f)), th.a);
         this.h.a(etv.a(enx.b));
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
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(enx.this.i, ti.a("mco.backup.entry", eph.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(enx.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public ti a() {
         return ti.a("narrator.select", this.f.b.toString());
      }
   }
}
