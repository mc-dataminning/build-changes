import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euu extends gnd {
   static final Logger a = LogUtils.getLogger();
   static final vq b = vq.c("mco.backup.button.restore");
   static final vq c = vq.c("mco.backup.changes.tooltip");
   private static final vq v = vq.c("mco.configure.world.backup");
   private static final vq w = vq.c("mco.backup.nobackups");
   private final eux x;
   List<etd> y = Collections.emptyList();
   euu.a z;
   int A = -1;
   private final int B;
   private ezo C;
   private ezo D;
   private ezo E;
   Boolean F = false;
   final eto G;
   private static final String H = "uploaded";

   public euu(eux $$0, eto $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aQ_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            esx $$0 = esx.a();

            try {
               List<etd> $$1 = $$0.e(euu.this.G.a).a;
               euu.this.f.execute(() -> {
                  euu.this.y = $$1;
                  euu.this.F = euu.this.y.isEmpty();
                  euu.this.z.H();

                  for (etd $$1x : euu.this.y) {
                     euu.this.z.a($$1x);
                  }
               });
            } catch (euk var3) {
               euu.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.c((ezo)ezo.a(vq.c("mco.backup.button.download"), $$0 -> this.J()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.c((ezo)ezo.a(vq.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.c((ezo)ezo.a(vq.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eut(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.c((ezo)ezo.a(vp.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.c(new euu.a());
      this.E();
   }

   void E() {
      this.D.k = this.I();
      this.E.k = this.H();
   }

   private boolean H() {
      return this.A == -1 ? false : !this.y.get(this.A).e.isEmpty();
   }

   private boolean I() {
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
         vq $$3 = ewe.a($$1);
         vq $$4 = vq.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vq $$5 = vq.c("mco.configure.world.restore.question.line2");
         this.f.a(new evd($$0x -> {
            if ($$0x) {
               this.L();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, evd.a.a, $$4, $$5, true));
      }
   }

   private void J() {
      vq $$0 = vq.c("mco.configure.world.restore.download.question.line1");
      vq $$1 = vq.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new evd($$0x -> {
         if ($$0x) {
            this.K();
         } else {
            this.f.a(this);
         }
      }, evd.a.b, $$0, $$1, true));
   }

   private void K() {
      this.f.a(new eve(this.x.f(), new ewm(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void L() {
      etd $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eve(this.x.f(), new ewu($$0, this.G.a, this.x)));
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends gnc<euu.b> {
      public a() {
         super(euu.this.g - 150, euu.this.h - 47, 32, 36);
      }

      public void a(etd $$0) {
         this.a((euu.b)(euu.this.new b($$0)));
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
         euu.this.A = $$0;
         euu.this.E();
      }

      public void a(@Nullable euu.b $$0) {
         super.a($$0);
         euu.this.A = this.l().indexOf($$0);
         euu.this.E();
      }
   }

   class b extends fak.a<euu.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final fbb d = new fbb(new aiy("backup/changes"), new aiy("backup/changes_highlighted"));
      private static final fbb e = new fbb(new aiy("backup/restore"), new aiy("backup/restore_highlighted"));
      private final etd f;
      private final List<ezm> g = new ArrayList<>();
      @Nullable
      private faa h;
      @Nullable
      private faa i;

      public b(etd $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!euu.this.G.j) {
            this.c();
         }
      }

      private void a(etd $$0) {
         int $$1 = euu.this.y.indexOf($$0);
         if ($$1 != euu.this.y.size() - 1) {
            etd $$2 = euu.this.y.get($$1 + 1);

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
         int $$2 = euu.this.z.r() - 9 - 28;
         int $$3 = euu.this.z.g(euu.this.y.indexOf(this.f)) + 2;
         this.i = new faa($$2, $$3, 9, 9, d, $$0x -> euu.this.f.a(new eut(euu.this, this.f)), vp.a);
         this.i.a(faz.a(euu.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = euu.this.z.r() - 17 - 7;
         int $$3 = euu.this.z.g(euu.this.y.indexOf(this.f)) + 2;
         this.h = new faa($$2, $$3, 17, 10, e, $$0x -> euu.this.a(euu.this.y.indexOf(this.f)), vp.a);
         this.h.a(faz.a(euu.b));
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
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(euu.this.i, vq.a("mco.backup.entry", ewe.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(euu.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.n($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vq a() {
         return vq.a("narrator.select", this.f.b.toString());
      }
   }
}
