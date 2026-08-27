import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esg extends gkc {
   static final Logger a = LogUtils.getLogger();
   static final vd b = vd.c("mco.backup.button.restore");
   static final vd c = vd.c("mco.backup.changes.tooltip");
   private static final vd v = vd.c("mco.configure.world.backup");
   private static final vd w = vd.c("mco.backup.nobackups");
   private final esj x;
   List<eqp> y = Collections.emptyList();
   esg.a z;
   int A = -1;
   private final int B;
   private ewy C;
   private ewy D;
   private ewy E;
   Boolean F = false;
   final era G;
   private static final String H = "uploaded";

   public esg(esj $$0, era $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aN_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eqj $$0 = eqj.a();

            try {
               List<eqp> $$1 = $$0.e(esg.this.G.a).a;
               esg.this.f.execute(() -> {
                  esg.this.y = $$1;
                  esg.this.F = esg.this.y.isEmpty();
                  esg.this.z.H();

                  for (eqp $$1x : esg.this.y) {
                     esg.this.z.a($$1x);
                  }
               });
            } catch (erw var3) {
               esg.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((ewy)ewy.a(vd.c("mco.backup.button.download"), $$0 -> this.H()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.d((ewy)ewy.a(vd.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.d((ewy)ewy.a(vd.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new esf(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.d((ewy)ewy.a(vc.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.d(new esg.a());
      this.b(this.z);
      this.C();
   }

   @Override
   void C() {
      this.D.k = this.E();
      this.E.k = this.D();
   }

   private boolean D() {
      return this.A == -1 ? false : !this.y.get(this.A).e.isEmpty();
   }

   private boolean E() {
      return this.A == -1 ? false : !this.G.j;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.x);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   void a(int $$0) {
      if ($$0 >= 0 && $$0 < this.y.size() && !this.G.j) {
         this.A = $$0;
         Date $$1 = this.y.get($$0).b;
         String $$2 = DateFormat.getDateTimeInstance(3, 3).format($$1);
         vd $$3 = etq.a($$1);
         vd $$4 = vd.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vd $$5 = vd.c("mco.configure.world.restore.question.line2");
         this.f.a(new esp($$0x -> {
            if ($$0x) {
               this.J();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, esp.a.a, $$4, $$5, true));
      }
   }

   private void H() {
      vd $$0 = vd.c("mco.configure.world.restore.download.question.line1");
      vd $$1 = vd.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new esp($$0x -> {
         if ($$0x) {
            this.I();
         } else {
            this.f.a(this);
         }
      }, esp.a.b, $$0, $$1, true));
   }

   private void I() {
      this.f.a(new esq(this.x.f(), new ety(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void J() {
      eqp $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new esq(this.x.f(), new euf($$0, this.G.a, this.x)));
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends gkb<esg.b> {
      public a() {
         super(esg.this.g - 150, esg.this.h - 47, 32, 36);
      }

      public void a(eqp $$0) {
         this.a((esg.b)(esg.this.new b($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.g * 0.93);
      }

      @Override
      public int a() {
         return this.n() * 36;
      }

      @Override
      public int c() {
         return this.g - 5;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         esg.this.A = $$0;
         esg.this.C();
      }

      public void a(@Nullable esg.b $$0) {
         super.a($$0);
         esg.this.A = this.l().indexOf($$0);
         esg.this.C();
      }
   }

   class b extends exu.a<esg.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final eyl d = new eyl(new ahd("backup/changes"), new ahd("backup/changes_highlighted"));
      private static final eyl e = new eyl(new ahd("backup/restore"), new ahd("backup/restore_highlighted"));
      private final eqp f;
      private final List<eww> g = new ArrayList<>();
      @Nullable
      private exk h;
      @Nullable
      private exk i;

      public b(eqp $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!esg.this.G.j) {
            this.c();
         }
      }

      private void a(eqp $$0) {
         int $$1 = esg.this.y.indexOf($$0);
         if ($$1 != esg.this.y.size() - 1) {
            eqp $$2 = esg.this.y.get($$1 + 1);

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
         int $$2 = esg.this.z.r() - 9 - 28;
         int $$3 = esg.this.z.g(esg.this.y.indexOf(this.f)) + 2;
         this.i = new exk($$2, $$3, 9, 9, d, $$0x -> esg.this.f.a(new esf(esg.this, this.f)), vc.a);
         this.i.a(eyj.a(esg.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = esg.this.z.r() - 17 - 7;
         int $$3 = esg.this.z.g(esg.this.y.indexOf(this.f)) + 2;
         this.h = new exk($$2, $$3, 17, 10, e, $$0x -> esg.this.a(esg.this.y.indexOf(this.f)), vc.a);
         this.h.a(eyj.a(esg.b));
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
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(esg.this.i, vd.a("mco.backup.entry", etq.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(esg.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.o($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vd a() {
         return vd.a("narrator.select", this.f.b.toString());
      }
   }
}
