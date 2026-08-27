import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ent extends ger {
   static final Logger a = LogUtils.getLogger();
   static final tf b = tf.c("mco.backup.button.restore");
   static final tf c = tf.c("mco.backup.changes.tooltip");
   private static final tf y = tf.c("mco.configure.world.backup");
   private static final tf z = tf.c("mco.backup.nobackups");
   private final enw A;
   List<emb> B = Collections.emptyList();
   ent.a C;
   int D = -1;
   private final int E;
   private esg F;
   private esg G;
   private esg H;
   Boolean I = false;
   final emm J;
   private static final String K = "uploaded";

   public ent(enw $$0, emm $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aC_() {
      this.C = new ent.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            elv $$0 = elv.a();

            try {
               List<emb> $$1 = $$0.e(ent.this.J.a).a;
               ent.this.f.execute(() -> {
                  ent.this.B = $$1;
                  ent.this.I = ent.this.B.isEmpty();
                  ent.this.C.w();

                  for (emb $$1x : ent.this.B) {
                     ent.this.C.a($$1x);
                  }
               });
            } catch (eni var3) {
               ent.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esg)esg.a(tf.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esg)esg.a(tf.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esg)esg.a(tf.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new ens(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esg)esg.a(te.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
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
         tf $$3 = epc.a($$1);
         tf $$4 = tf.a("mco.configure.world.restore.question.line1", $$2, $$3);
         tf $$5 = tf.c("mco.configure.world.restore.question.line2");
         this.f.a(new eoc($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eoc.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      tf $$0 = tf.c("mco.configure.world.restore.download.question.line1");
      tf $$1 = tf.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eoc($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eoc.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eod(this.A.g(), new epj(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void H() {
      emb $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eod(this.A.g(), new epq($$0, this.J.a, this.A)));
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends geq<ent.b> {
      public a() {
         super(ent.this.g - 150, ent.this.h, 32, ent.this.h - 15, 36);
      }

      public void a(emb $$0) {
         this.a((ent.b)(ent.this.new b($$0)));
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
         ent.this.D = $$0;
         ent.this.C();
      }

      public void a(@Nullable ent.b $$0) {
         super.a($$0);
         ent.this.D = this.i().indexOf($$0);
         ent.this.C();
      }
   }

   class b extends etc.a<ent.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final ets d = new ets(new aer("backup/changes"), new aer("backup/changes_highlighted"));
      private static final ets e = new ets(new aer("backup/restore"), new aer("backup/restore_highlighted"));
      private final emb f;
      private final List<ese> g = new ArrayList<>();
      @Nullable
      private ess h;
      @Nullable
      private ess i;

      public b(emb $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!ent.this.J.j) {
            this.d();
         }
      }

      private void a(emb $$0) {
         int $$1 = ent.this.B.indexOf($$0);
         if ($$1 != ent.this.B.size() - 1) {
            emb $$2 = ent.this.B.get($$1 + 1);

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
         int $$2 = ent.this.C.p() - 9 - 28;
         int $$3 = ent.this.C.g(ent.this.B.indexOf(this.f)) + 2;
         this.i = new ess($$2, $$3, 9, 9, d, $$0x -> ent.this.f.a(new ens(ent.this, this.f)), te.a);
         this.i.a(etq.a(ent.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = ent.this.C.p() - 17 - 7;
         int $$3 = ent.this.C.g(ent.this.B.indexOf(this.f)) + 2;
         this.h = new ess($$2, $$3, 17, 10, e, $$0x -> ent.this.a(ent.this.B.indexOf(this.f)), te.a);
         this.h.a(etq.a(ent.b));
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
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(ent.this.i, tf.a("mco.backup.entry", epc.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(ent.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
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
