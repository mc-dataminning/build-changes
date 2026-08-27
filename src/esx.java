import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esx extends gld {
   static final Logger a = LogUtils.getLogger();
   static final vg b = vg.c("mco.backup.button.restore");
   static final vg c = vg.c("mco.backup.changes.tooltip");
   private static final vg v = vg.c("mco.configure.world.backup");
   private static final vg w = vg.c("mco.backup.nobackups");
   private final eta x;
   List<erg> y = Collections.emptyList();
   esx.a z;
   int A = -1;
   private final int B;
   private exr C;
   private exr D;
   private exr E;
   Boolean F = false;
   final err G;
   private static final String H = "uploaded";

   public esx(eta $$0, err $$1, int $$2) {
      super(v);
      this.x = $$0;
      this.G = $$1;
      this.B = $$2;
   }

   @Override
   public void aP_() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            era $$0 = era.a();

            try {
               List<erg> $$1 = $$0.e(esx.this.G.a).a;
               esx.this.f.execute(() -> {
                  esx.this.y = $$1;
                  esx.this.F = esx.this.y.isEmpty();
                  esx.this.z.H();

                  for (erg $$1x : esx.this.y) {
                     esx.this.z.a($$1x);
                  }
               });
            } catch (esn var3) {
               esx.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((exr)exr.a(vg.c("mco.backup.button.download"), $$0 -> this.J()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.d((exr)exr.a(vg.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.d((exr)exr.a(vg.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new esw(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.d((exr)exr.a(vf.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.d(new esx.a());
      this.b(this.z);
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
         vg $$3 = euh.a($$1);
         vg $$4 = vg.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vg $$5 = vg.c("mco.configure.world.restore.question.line2");
         this.f.a(new etg($$0x -> {
            if ($$0x) {
               this.L();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, etg.a.a, $$4, $$5, true));
      }
   }

   private void J() {
      vg $$0 = vg.c("mco.configure.world.restore.download.question.line1");
      vg $$1 = vg.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new etg($$0x -> {
         if ($$0x) {
            this.K();
         } else {
            this.f.a(this);
         }
      }, etg.a.b, $$0, $$1, true));
   }

   private void K() {
      this.f.a(new eth(this.x.f(), new eup(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void L() {
      erg $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new eth(this.x.f(), new euw($$0, this.G.a, this.x)));
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends glc<esx.b> {
      public a() {
         super(esx.this.g - 150, esx.this.h - 47, 32, 36);
      }

      public void a(erg $$0) {
         this.a((esx.b)(esx.this.new b($$0)));
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
         esx.this.A = $$0;
         esx.this.E();
      }

      public void a(@Nullable esx.b $$0) {
         super.a($$0);
         esx.this.A = this.l().indexOf($$0);
         esx.this.E();
      }
   }

   class b extends eyn.a<esx.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final eze d = new eze(new ahh("backup/changes"), new ahh("backup/changes_highlighted"));
      private static final eze e = new eze(new ahh("backup/restore"), new ahh("backup/restore_highlighted"));
      private final erg f;
      private final List<exp> g = new ArrayList<>();
      @Nullable
      private eyd h;
      @Nullable
      private eyd i;

      public b(erg $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!esx.this.G.j) {
            this.c();
         }
      }

      private void a(erg $$0) {
         int $$1 = esx.this.y.indexOf($$0);
         if ($$1 != esx.this.y.size() - 1) {
            erg $$2 = esx.this.y.get($$1 + 1);

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
         int $$2 = esx.this.z.r() - 9 - 28;
         int $$3 = esx.this.z.g(esx.this.y.indexOf(this.f)) + 2;
         this.i = new eyd($$2, $$3, 9, 9, d, $$0x -> esx.this.f.a(new esw(esx.this, this.f)), vf.a);
         this.i.a(ezc.a(esx.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = esx.this.z.r() - 17 - 7;
         int $$3 = esx.this.z.g(esx.this.y.indexOf(this.f)) + 2;
         this.h = new eyd($$2, $$3, 17, 10, e, $$0x -> esx.this.a(esx.this.y.indexOf(this.f)), vf.a);
         this.h.a(ezc.a(esx.b));
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
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(esx.this.i, vg.a("mco.backup.entry", euh.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(esx.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.o($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vg a() {
         return vg.a("narrator.select", this.f.b.toString());
      }
   }
}
