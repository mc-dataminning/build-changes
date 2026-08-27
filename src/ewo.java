import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewo extends gpe {
   static final Logger a = LogUtils.getLogger();
   static final vu b = vu.c("mco.backup.button.restore");
   static final vu c = vu.c("mco.backup.changes.tooltip");
   private static final vu v = vu.c("mco.configure.world.backup");
   private static final vu w = vu.c("mco.backup.nobackups");
   private final ewr x;
   List<eux> y = Collections.emptyList();
   ewo.a z;
   int A = -1;
   private final int B;
   private fbi C;
   private fbi D;
   private fbi E;
   Boolean F = false;
   final evi G;
   private static final String H = "uploaded";

   public ewo(ewr $$0, evi $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aO_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eur $$0 = eur.a();

            try {
               List<eux> $$1 = $$0.e(ewo.this.G.a).a;
               ewo.this.f.execute(() -> {
                  ewo.this.y = $$1;
                  ewo.this.F = ewo.this.y.isEmpty();
                  ewo.this.z.H();

                  for (eux $$1x : ewo.this.y) {
                     ewo.this.z.a($$1x);
                  }
               });
            } catch (ewe var3) {
               ewo.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.c((fbi)fbi.a(vu.c("mco.backup.button.download"), $$0 -> this.J()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.c((fbi)fbi.a(vu.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.c((fbi)fbi.a(vu.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new ewn(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.c((fbi)fbi.a(vt.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.c(new ewo.a());
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
         vu $$3 = exy.a($$1);
         vu $$4 = vu.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vu $$5 = vu.c("mco.configure.world.restore.question.line2");
         this.f.a(new ewx($$0x -> {
            if ($$0x) {
               this.L();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, ewx.a.a, $$4, $$5, true));
      }
   }

   private void J() {
      vu $$0 = vu.c("mco.configure.world.restore.download.question.line1");
      vu $$1 = vu.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new ewx($$0x -> {
         if ($$0x) {
            this.K();
         } else {
            this.f.a(this);
         }
      }, ewx.a.b, $$0, $$1, true));
   }

   private void K() {
      this.f.a(new ewy(this.x.f(), new eyg(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void L() {
      eux $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new ewy(this.x.f(), new eyo($$0, this.G.a, this.x)));
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends gpd<ewo.b> {
      public a() {
         super(ewo.this.g - 150, ewo.this.h - 47, 32, 36);
      }

      public void a(eux $$0) {
         this.a((ewo.b)(ewo.this.new b($$0)));
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
         ewo.this.A = $$0;
         ewo.this.E();
      }

      public void a(@Nullable ewo.b $$0) {
         super.a($$0);
         ewo.this.A = this.l().indexOf($$0);
         ewo.this.E();
      }
   }

   class b extends fce.a<ewo.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final fcv d = new fcv(new ajh("backup/changes"), new ajh("backup/changes_highlighted"));
      private static final fcv e = new fcv(new ajh("backup/restore"), new ajh("backup/restore_highlighted"));
      private final eux f;
      private final List<fbg> g = new ArrayList<>();
      @Nullable
      private fbu h;
      @Nullable
      private fbu i;

      public b(eux $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!ewo.this.G.j) {
            this.c();
         }
      }

      private void a(eux $$0) {
         int $$1 = ewo.this.y.indexOf($$0);
         if ($$1 != ewo.this.y.size() - 1) {
            eux $$2 = ewo.this.y.get($$1 + 1);

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
         int $$2 = ewo.this.z.r() - 9 - 28;
         int $$3 = ewo.this.z.g(ewo.this.y.indexOf(this.f)) + 2;
         this.i = new fbu($$2, $$3, 9, 9, d, $$0x -> ewo.this.f.a(new ewn(ewo.this, this.f)), vt.a);
         this.i.a(fct.a(ewo.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = ewo.this.z.r() - 17 - 7;
         int $$3 = ewo.this.z.g(ewo.this.y.indexOf(this.f)) + 2;
         this.h = new fbu($$2, $$3, 17, 10, e, $$0x -> ewo.this.a(ewo.this.y.indexOf(this.f)), vt.a);
         this.h.a(fct.a(ewo.b));
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
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(ewo.this.i, vu.a("mco.backup.entry", exy.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(ewo.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.n($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vu a() {
         return vu.a("narrator.select", this.f.b.toString());
      }
   }
}
