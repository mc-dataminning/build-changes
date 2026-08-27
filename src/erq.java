import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erq extends gjl {
   static final Logger a = LogUtils.getLogger();
   static final vb b = vb.c("mco.backup.button.restore");
   static final vb c = vb.c("mco.backup.changes.tooltip");
   private static final vb v = vb.c("mco.configure.world.backup");
   private static final vb w = vb.c("mco.backup.nobackups");
   private final ert x;
   List<epz> y = Collections.emptyList();
   erq.a z;
   int A = -1;
   private final int B;
   private ewh C;
   private ewh D;
   private ewh E;
   Boolean F = false;
   final eqk G;
   private static final String H = "uploaded";

   public erq(ert $$0, eqk $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aP_() {
      this.z = new erq.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            ept $$0 = ept.a();

            try {
               List<epz> $$1 = $$0.e(erq.this.G.a).a;
               erq.this.f.execute(() -> {
                  erq.this.y = $$1;
                  erq.this.F = erq.this.y.isEmpty();
                  erq.this.z.v();

                  for (epz $$1x : erq.this.y) {
                     erq.this.z.a($$1x);
                  }
               });
            } catch (erg var3) {
               erq.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((ewh)ewh.a(vb.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.D = this.d((ewh)ewh.a(vb.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, h(3), 120, 20).a());
      this.E = this.d((ewh)ewh.a(vb.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new erp(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((ewh)ewh.a(va.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.z);
      this.b(this.z);
      this.C();
   }

   @Override
   void C() {
      this.D.j = this.E();
      this.E.j = this.D();
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
         vb $$3 = eta.a($$1);
         vb $$4 = vb.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vb $$5 = vb.c("mco.configure.world.restore.question.line2");
         this.f.a(new erz($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, erz.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      vb $$0 = vb.c("mco.configure.world.restore.download.question.line1");
      vb $$1 = vb.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new erz($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, erz.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new esa(this.x.f(), new eti(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void H() {
      epz $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new esa(this.x.f(), new etp($$0, this.G.a, this.x)));
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.i = !this.F;
   }

   class a extends gjk<erq.b> {
      public a() {
         super(erq.this.g - 150, erq.this.h, 32, erq.this.h - 15, 36);
      }

      public void a(epz $$0) {
         this.a((erq.b)(erq.this.new b($$0)));
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
         erq.this.A = $$0;
         erq.this.C();
      }

      public void a(@Nullable erq.b $$0) {
         super.a($$0);
         erq.this.A = this.i().indexOf($$0);
         erq.this.C();
      }
   }

   class b extends exd.a<erq.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final exu d = new exu(new agt("backup/changes"), new agt("backup/changes_highlighted"));
      private static final exu e = new exu(new agt("backup/restore"), new agt("backup/restore_highlighted"));
      private final epz f;
      private final List<ewf> g = new ArrayList<>();
      @Nullable
      private ewt h;
      @Nullable
      private ewt i;

      public b(epz $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!erq.this.G.j) {
            this.c();
         }
      }

      private void a(epz $$0) {
         int $$1 = erq.this.y.indexOf($$0);
         if ($$1 != erq.this.y.size() - 1) {
            epz $$2 = erq.this.y.get($$1 + 1);

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
         int $$2 = erq.this.z.p() - 9 - 28;
         int $$3 = erq.this.z.h(erq.this.y.indexOf(this.f)) + 2;
         this.i = new ewt($$2, $$3, 9, 9, d, $$0x -> erq.this.f.a(new erp(erq.this, this.f)), va.a);
         this.i.a(exs.a(erq.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = erq.this.z.p() - 17 - 7;
         int $$3 = erq.this.z.h(erq.this.y.indexOf(this.f)) + 2;
         this.h = new ewt($$2, $$3, 17, 10, e, $$0x -> erq.this.a(erq.this.y.indexOf(this.f)), va.a);
         this.h.a(exs.a(erq.b));
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
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(erq.this.i, vb.a("mco.backup.entry", eta.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(erq.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vb a() {
         return vb.a("narrator.select", this.f.b.toString());
      }
   }
}
