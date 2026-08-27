import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eqj extends ghr {
   static final Logger a = LogUtils.getLogger();
   static final ur b = ur.c("mco.backup.button.restore");
   static final ur c = ur.c("mco.backup.changes.tooltip");
   private static final ur v = ur.c("mco.configure.world.backup");
   private static final ur w = ur.c("mco.backup.nobackups");
   private final eqm x;
   List<eos> y = Collections.emptyList();
   eqj.a z;
   int A = -1;
   private final int B;
   private euz C;
   private euz D;
   private euz E;
   Boolean F = false;
   final epd G;
   private static final String H = "uploaded";

   public eqj(eqm $$0, epd $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aP_() {
      this.z = new eqj.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eom $$0 = eom.a();

            try {
               List<eos> $$1 = $$0.e(eqj.this.G.a).a;
               eqj.this.f.execute(() -> {
                  eqj.this.y = $$1;
                  eqj.this.F = eqj.this.y.isEmpty();
                  eqj.this.z.v();

                  for (eos $$1x : eqj.this.y) {
                     eqj.this.z.a($$1x);
                  }
               });
            } catch (epz var3) {
               eqj.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((euz)euz.a(ur.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.D = this.d((euz)euz.a(ur.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, h(3), 120, 20).a());
      this.E = this.d((euz)euz.a(ur.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eqi(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((euz)euz.a(uq.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
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
         ur $$3 = ert.a($$1);
         ur $$4 = ur.a("mco.configure.world.restore.question.line1", $$2, $$3);
         ur $$5 = ur.c("mco.configure.world.restore.question.line2");
         this.f.a(new eqs($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, eqs.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      ur $$0 = ur.c("mco.configure.world.restore.download.question.line1");
      ur $$1 = ur.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eqs($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eqs.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eqt(this.x.f(), new esb(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void H() {
      eos $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eqt(this.x.f(), new esi($$0, this.G.a, this.x)));
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.i = !this.F;
   }

   class a extends ghq<eqj.b> {
      public a() {
         super(eqj.this.g - 150, eqj.this.h, 32, eqj.this.h - 15, 36);
      }

      public void a(eos $$0) {
         this.a((eqj.b)(eqj.this.new b($$0)));
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
         eqj.this.A = $$0;
         eqj.this.C();
      }

      public void a(@Nullable eqj.b $$0) {
         super.a($$0);
         eqj.this.A = this.i().indexOf($$0);
         eqj.this.C();
      }
   }

   class b extends evv.a<eqj.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final ewm d = new ewm(new agi("backup/changes"), new agi("backup/changes_highlighted"));
      private static final ewm e = new ewm(new agi("backup/restore"), new agi("backup/restore_highlighted"));
      private final eos f;
      private final List<eux> g = new ArrayList<>();
      @Nullable
      private evl h;
      @Nullable
      private evl i;

      public b(eos $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eqj.this.G.j) {
            this.c();
         }
      }

      private void a(eos $$0) {
         int $$1 = eqj.this.y.indexOf($$0);
         if ($$1 != eqj.this.y.size() - 1) {
            eos $$2 = eqj.this.y.get($$1 + 1);

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
         int $$2 = eqj.this.z.p() - 9 - 28;
         int $$3 = eqj.this.z.h(eqj.this.y.indexOf(this.f)) + 2;
         this.i = new evl($$2, $$3, 9, 9, d, $$0x -> eqj.this.f.a(new eqi(eqj.this, this.f)), uq.a);
         this.i.a(ewk.a(eqj.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eqj.this.z.p() - 17 - 7;
         int $$3 = eqj.this.z.h(eqj.this.y.indexOf(this.f)) + 2;
         this.h = new evl($$2, $$3, 17, 10, e, $$0x -> eqj.this.a(eqj.this.y.indexOf(this.f)), uq.a);
         this.h.a(ewk.a(eqj.b));
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
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eqj.this.i, ur.a("mco.backup.entry", ert.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eqj.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
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
