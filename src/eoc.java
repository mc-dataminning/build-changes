import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoc extends gfb {
   static final Logger a = LogUtils.getLogger();
   static final tl b = tl.c("mco.backup.button.restore");
   static final tl c = tl.c("mco.backup.changes.tooltip");
   private static final tl y = tl.c("mco.configure.world.backup");
   private static final tl z = tl.c("mco.backup.nobackups");
   private final eof A;
   List<eml> B = Collections.emptyList();
   eoc.a C;
   int D = -1;
   private final int E;
   private esq F;
   private esq G;
   private esq H;
   Boolean I = false;
   final emw J;
   private static final String K = "uploaded";

   public eoc(eof $$0, emw $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aI_() {
      this.C = new eoc.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            emf $$0 = emf.a();

            try {
               List<eml> $$1 = $$0.e(eoc.this.J.a).a;
               eoc.this.f.execute(() -> {
                  eoc.this.B = $$1;
                  eoc.this.I = eoc.this.B.isEmpty();
                  eoc.this.C.w();

                  for (eml $$1x : eoc.this.B) {
                     eoc.this.C.a($$1x);
                  }
               });
            } catch (ens var3) {
               eoc.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esq)esq.a(tl.c("mco.backup.button.download"), $$0 -> this.F()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esq)esq.a(tl.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esq)esq.a(tl.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new eob(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esq)esq.a(tk.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
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
         tl $$3 = epm.a($$1);
         tl $$4 = tl.a("mco.configure.world.restore.question.line1", $$2, $$3);
         tl $$5 = tl.c("mco.configure.world.restore.question.line2");
         this.f.a(new eol($$0x -> {
            if ($$0x) {
               this.H();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eol.a.a, $$4, $$5, true));
      }
   }

   private void F() {
      tl $$0 = tl.c("mco.configure.world.restore.download.question.line1");
      tl $$1 = tl.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eol($$0x -> {
         if ($$0x) {
            this.G();
         } else {
            this.f.a(this);
         }
      }, eol.a.b, $$0, $$1, true));
   }

   private void G() {
      this.f.a(new eom(this.A.f(), new ept(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void H() {
      eml $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eom(this.A.f(), new eqa($$0, this.J.a, this.A)));
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gfa<eoc.b> {
      public a() {
         super(eoc.this.g - 150, eoc.this.h, 32, eoc.this.h - 15, 36);
      }

      public void a(eml $$0) {
         this.a((eoc.b)(eoc.this.new b($$0)));
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
         eoc.this.D = $$0;
         eoc.this.C();
      }

      public void a(@Nullable eoc.b $$0) {
         super.a($$0);
         eoc.this.D = this.i().indexOf($$0);
         eoc.this.C();
      }
   }

   class b extends etm.a<eoc.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final euc d = new euc(new aex("backup/changes"), new aex("backup/changes_highlighted"));
      private static final euc e = new euc(new aex("backup/restore"), new aex("backup/restore_highlighted"));
      private final eml f;
      private final List<eso> g = new ArrayList<>();
      @Nullable
      private etc h;
      @Nullable
      private etc i;

      public b(eml $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!eoc.this.J.j) {
            this.d();
         }
      }

      private void a(eml $$0) {
         int $$1 = eoc.this.B.indexOf($$0);
         if ($$1 != eoc.this.B.size() - 1) {
            eml $$2 = eoc.this.B.get($$1 + 1);

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
         int $$2 = eoc.this.C.p() - 9 - 28;
         int $$3 = eoc.this.C.h(eoc.this.B.indexOf(this.f)) + 2;
         this.i = new etc($$2, $$3, 9, 9, d, $$0x -> eoc.this.f.a(new eob(eoc.this, this.f)), tk.a);
         this.i.a(eua.a(eoc.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = eoc.this.C.p() - 17 - 7;
         int $$3 = eoc.this.C.h(eoc.this.B.indexOf(this.f)) + 2;
         this.h = new etc($$2, $$3, 17, 10, e, $$0x -> eoc.this.a(eoc.this.B.indexOf(this.f)), tk.a);
         this.h.a(eua.a(eoc.b));
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
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(eoc.this.i, tl.a("mco.backup.entry", epm.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(eoc.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.g($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public tl a() {
         return tl.a("narrator.select", this.f.b.toString());
      }
   }
}
