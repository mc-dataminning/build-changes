import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eso extends gkp {
   static final Logger a = LogUtils.getLogger();
   static final vf b = vf.c("mco.backup.button.restore");
   static final vf c = vf.c("mco.backup.changes.tooltip");
   private static final vf v = vf.c("mco.configure.world.backup");
   private static final vf w = vf.c("mco.backup.nobackups");
   private final esr x;
   List<eqx> y = Collections.emptyList();
   eso.a z;
   int A = -1;
   private final int B;
   private exg C;
   private exg D;
   private exg E;
   Boolean F = false;
   final eri G;
   private static final String H = "uploaded";

   public eso(esr $$0, eri $$1, int $$2) {
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
            eqr $$0 = eqr.a();

            try {
               List<eqx> $$1 = $$0.e(eso.this.G.a).a;
               eso.this.f.execute(() -> {
                  eso.this.y = $$1;
                  eso.this.F = eso.this.y.isEmpty();
                  eso.this.z.H();

                  for (eqx $$1x : eso.this.y) {
                     eso.this.z.a($$1x);
                  }
               });
            } catch (ese var3) {
               eso.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.C = this.d((exg)exg.a(vf.c("mco.backup.button.download"), $$0 -> this.I()).a(this.g - 135, g(1), 120, 20).a());
      this.D = this.d((exg)exg.a(vf.c("mco.backup.button.restore"), $$0 -> this.a(this.A)).a(this.g - 135, g(3), 120, 20).a());
      this.E = this.d((exg)exg.a(vf.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new esn(this, this.y.get(this.A)));
         this.A = -1;
      }).a(this.g - 135, g(5), 120, 20).a());
      this.d((exg)exg.a(ve.k, $$0 -> this.f.a(this.x)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.z = this.d(new eso.a());
      this.b(this.z);
      this.D();
   }

   void D() {
      this.D.k = this.H();
      this.E.k = this.E();
   }

   private boolean E() {
      return this.A == -1 ? false : !this.y.get(this.A).e.isEmpty();
   }

   private boolean H() {
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
         vf $$3 = ety.a($$1);
         vf $$4 = vf.a("mco.configure.world.restore.question.line1", $$2, $$3);
         vf $$5 = vf.c("mco.configure.world.restore.question.line2");
         this.f.a(new esx($$0x -> {
            if ($$0x) {
               this.K();
            } else {
               this.A = -1;
               this.f.a(this);
            }
         }, esx.a.a, $$4, $$5, true));
      }
   }

   private void I() {
      vf $$0 = vf.c("mco.configure.world.restore.download.question.line1");
      vf $$1 = vf.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new esx($$0x -> {
         if ($$0x) {
            this.J();
         } else {
            this.f.a(this);
         }
      }, esx.a.b, $$0, $$1, true));
   }

   private void J() {
      this.f.a(new esy(this.x.f(), new eug(this.G.a, this.B, this.G.c + " (" + this.G.i.get(this.G.n).a(this.G.n) + ")", this)));
   }

   private void K() {
      eqx $$0 = this.y.get(this.A);
      this.A = -1;
      this.f.a(new esy(this.x.f(), new eun($$0, this.G.a, this.x)));
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F) {
         $$0.a(this.i, w, 20, this.h / 2 - 10, -1, false);
      }

      this.C.j = !this.F;
   }

   class a extends gko<eso.b> {
      public a() {
         super(eso.this.g - 150, eso.this.h - 47, 32, 36);
      }

      public void a(eqx $$0) {
         this.a((eso.b)(eso.this.new b($$0)));
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
         eso.this.A = $$0;
         eso.this.D();
      }

      public void a(@Nullable eso.b $$0) {
         super.a($$0);
         eso.this.A = this.l().indexOf($$0);
         eso.this.D();
      }
   }

   class b extends eyc.a<eso.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final eyt d = new eyt(new ahg("backup/changes"), new ahg("backup/changes_highlighted"));
      private static final eyt e = new eyt(new ahg("backup/restore"), new ahg("backup/restore_highlighted"));
      private final eqx f;
      private final List<exe> g = new ArrayList<>();
      @Nullable
      private exs h;
      @Nullable
      private exs i;

      public b(eqx $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eso.this.G.j) {
            this.c();
         }
      }

      private void a(eqx $$0) {
         int $$1 = eso.this.y.indexOf($$0);
         if ($$1 != eso.this.y.size() - 1) {
            eqx $$2 = eso.this.y.get($$1 + 1);

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
         int $$2 = eso.this.z.r() - 9 - 28;
         int $$3 = eso.this.z.g(eso.this.y.indexOf(this.f)) + 2;
         this.i = new exs($$2, $$3, 9, 9, d, $$0x -> eso.this.f.a(new esn(eso.this, this.f)), ve.a);
         this.i.a(eyr.a(eso.c));
         this.g.add(this.i);
      }

      private void c() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eso.this.z.r() - 17 - 7;
         int $$3 = eso.this.z.g(eso.this.y.indexOf(this.f)) + 2;
         this.h = new exs($$2, $$3, 17, 10, e, $$0x -> eso.this.a(eso.this.y.indexOf(this.f)), ve.a);
         this.h.a(eyr.a(eso.b));
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
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eso.this.i, vf.a("mco.backup.entry", ety.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eso.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.o($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public vf a() {
         return vf.a("narrator.select", this.f.b.toString());
      }
   }
}
