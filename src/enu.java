import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enu extends gei {
   static final Logger a = LogUtils.getLogger();
   static final tf b = tf.c("mco.backup.button.restore");
   static final tf c = tf.c("mco.backup.changes.tooltip");
   private static final tf y = tf.c("mco.configure.world.backup");
   private static final tf z = tf.c("mco.backup.nobackups");
   private final enx A;
   List<emc> B = Collections.emptyList();
   enu.a C;
   int D = -1;
   private final int E;
   private esh F;
   private esh G;
   private esh H;
   Boolean I = false;
   final emn J;
   private static final String K = "uploaded";

   public enu(enx $$0, emn $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aE_() {
      this.C = new enu.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            elw $$0 = elw.a();

            try {
               List<emc> $$1 = $$0.e(enu.this.J.a).a;
               enu.this.f.execute(() -> {
                  enu.this.B = $$1;
                  enu.this.I = enu.this.B.isEmpty();
                  enu.this.C.v();

                  for (emc $$1x : enu.this.B) {
                     enu.this.C.a($$1x);
                  }
               });
            } catch (enj var3) {
               enu.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esh)esh.a(tf.c("mco.backup.button.download"), $$0 -> this.E()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esh)esh.a(tf.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esh)esh.a(tf.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new ent(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esh)esh.a(te.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.C);
      this.b(this.C);
      this.B();
   }

   @Override
   void B() {
      this.G.j = this.D();
      this.H.j = this.C();
   }

   private boolean C() {
      return this.D == -1 ? false : !this.B.get(this.D).e.isEmpty();
   }

   private boolean D() {
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
         tf $$3 = epd.a($$1);
         tf $$4 = tf.a("mco.configure.world.restore.question.line1", $$2, $$3);
         tf $$5 = tf.c("mco.configure.world.restore.question.line2");
         this.f.a(new eod($$0x -> {
            if ($$0x) {
               this.G();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eod.a.a, $$4, $$5, true));
      }
   }

   private void E() {
      tf $$0 = tf.c("mco.configure.world.restore.download.question.line1");
      tf $$1 = tf.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eod($$0x -> {
         if ($$0x) {
            this.F();
         } else {
            this.f.a(this);
         }
      }, eod.a.b, $$0, $$1, true));
   }

   private void F() {
      this.f.a(new eoe(this.A.f(), new epk(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void G() {
      emc $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eoe(this.A.f(), new epr($$0, this.J.a, this.A)));
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends geh<enu.b> {
      public a() {
         super(enu.this.g - 150, enu.this.h, 32, enu.this.h - 15, 36);
      }

      public void a(emc $$0) {
         this.a((enu.b)(enu.this.new b($$0)));
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
         enu.this.D = $$0;
         enu.this.B();
      }

      public void a(@Nullable enu.b $$0) {
         super.a($$0);
         enu.this.D = this.i().indexOf($$0);
         enu.this.B();
      }
   }

   class b extends etd.a<enu.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final ets d = new ets(new aer("backup/changes"), new aer("backup/changes_highlighted"));
      private static final ets e = new ets(new aer("backup/restore"), new aer("backup/restore_highlighted"));
      private final emc f;
      private final List<esf> g = new ArrayList<>();
      @Nullable
      private est h;
      @Nullable
      private est i;

      public b(emc $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!enu.this.J.j) {
            this.d();
         }
      }

      private void a(emc $$0) {
         int $$1 = enu.this.B.indexOf($$0);
         if ($$1 != enu.this.B.size() - 1) {
            emc $$2 = enu.this.B.get($$1 + 1);

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
         int $$2 = enu.this.C.p() - 9 - 28;
         int $$3 = enu.this.C.g(enu.this.B.indexOf(this.f)) + 2;
         this.i = new est($$2, $$3, 9, 9, d, $$0x -> enu.this.f.a(new ent(enu.this, this.f)), te.a);
         this.i.a(etq.a(enu.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = enu.this.C.p() - 17 - 7;
         int $$3 = enu.this.C.g(enu.this.B.indexOf(this.f)) + 2;
         this.h = new est($$2, $$3, 17, 10, e, $$0x -> enu.this.a(enu.this.B.indexOf(this.f)), te.a);
         this.h.a(etq.a(enu.b));
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
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(enu.this.i, tf.a("mco.backup.entry", epd.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(enu.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.f($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public tf a() {
         return tf.a("narrator.select", this.f.b.toString());
      }
   }
}
