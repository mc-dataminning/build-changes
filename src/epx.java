import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epx extends ghe {
   static final Logger a = LogUtils.getLogger();
   static final ur b = ur.c("mco.backup.button.restore");
   static final ur c = ur.c("mco.backup.changes.tooltip");
   private static final ur v = ur.c("mco.configure.world.backup");
   private static final ur w = ur.c("mco.backup.nobackups");
   private final eqa x;
   List<eog> y = Collections.emptyList();
   epx.a z;
   int A = -1;
   private final int B;
   private eum C;
   private eum D;
   private eum E;
   Boolean F = false;
   final eor G;
   private static final String H = "uploaded";

   public epx(eqa $$0, eor $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aO_() {
      this.z = new epx.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eoa $$0 = eoa.a();

            try {
               List<eog> $$1 = $$0.e(epx.this.G.a).a;
               epx.this.f.execute(() -> {
                  epx.this.y = $$1;
                  epx.this.F = epx.this.y.isEmpty();
                  epx.this.z.v();

                  for (eog $$1x : epx.this.y) {
                     epx.this.z.a($$1x);
                  }
               });
            } catch (epn var3) {
               epx.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((eum)eum.a(ur.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.D = this.d((eum)eum.a(ur.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, h(3), 120, 20).a());
      this.E = this.d((eum)eum.a(ur.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new epw(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((eum)eum.a(uq.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
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
         ur $$3 = erh.a($$1);
         ur $$4 = ur.a("mco.configure.world.restore.question.line1", $$2, $$3);
         ur $$5 = ur.c("mco.configure.world.restore.question.line2");
         this.f.a(new eqg($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, eqg.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      ur $$0 = ur.c("mco.configure.world.restore.download.question.line1");
      ur $$1 = ur.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eqg($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eqg.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eqh(this.x.f(), new erp(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void H() {
      eog $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eqh(this.x.f(), new erw($$0, this.G.a, this.x)));
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.i = !this.F;
   }

   class a extends ghd<epx.b> {
      public a() {
         super(epx.this.g - 150, epx.this.h, 32, epx.this.h - 15, 36);
      }

      public void a(eog $$0) {
         this.a((epx.b)(epx.this.new b($$0)));
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
         epx.this.A = $$0;
         epx.this.C();
      }

      public void a(@Nullable epx.b $$0) {
         super.a($$0);
         epx.this.A = this.i().indexOf($$0);
         epx.this.C();
      }
   }

   class b extends evi.a<epx.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final evz d = new evz(new agg("backup/changes"), new agg("backup/changes_highlighted"));
      private static final evz e = new evz(new agg("backup/restore"), new agg("backup/restore_highlighted"));
      private final eog f;
      private final List<euk> g = new ArrayList<>();
      @Nullable
      private euy h;
      @Nullable
      private euy i;

      public b(eog $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!epx.this.G.j) {
            this.c();
         }
      }

      private void a(eog $$0) {
         int $$1 = epx.this.y.indexOf($$0);
         if ($$1 != epx.this.y.size() - 1) {
            eog $$2 = epx.this.y.get($$1 + 1);

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
         int $$2 = epx.this.z.p() - 9 - 28;
         int $$3 = epx.this.z.h(epx.this.y.indexOf(this.f)) + 2;
         this.i = new euy($$2, $$3, 9, 9, d, $$0x -> epx.this.f.a(new epw(epx.this, this.f)), uq.a);
         this.i.a(evx.a(epx.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = epx.this.z.p() - 17 - 7;
         int $$3 = epx.this.z.h(epx.this.y.indexOf(this.f)) + 2;
         this.h = new euy($$2, $$3, 17, 10, e, $$0x -> epx.this.a(epx.this.y.indexOf(this.f)), uq.a);
         this.h.a(evx.a(epx.b));
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
      public void a(eub $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(epx.this.i, ur.a("mco.backup.entry", erh.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(epx.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public ur a() {
         return ur.a("narrator.select", this.f.b.toString());
      }
   }
}
