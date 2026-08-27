import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enw extends gex {
   static final Logger a = LogUtils.getLogger();
   static final tl b = tl.c("mco.backup.button.restore");
   static final tl c = tl.c("mco.backup.changes.tooltip");
   private static final tl y = tl.c("mco.configure.world.backup");
   private static final tl z = tl.c("mco.backup.nobackups");
   private final enz A;
   List<emf> B = Collections.emptyList();
   enw.a C;
   int D = -1;
   private final int E;
   private esk F;
   private esk G;
   private esk H;
   Boolean I = false;
   final emq J;
   private static final String K = "uploaded";

   public enw(enz $$0, emq $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aH_() {
      this.C = new enw.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            elz $$0 = elz.a();

            try {
               List<emf> $$1 = $$0.e(enw.this.J.a).a;
               enw.this.f.execute(() -> {
                  enw.this.B = $$1;
                  enw.this.I = enw.this.B.isEmpty();
                  enw.this.C.w();

                  for (emf $$1x : enw.this.B) {
                     enw.this.C.a($$1x);
                  }
               });
            } catch (enm var3) {
               enw.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esk)esk.a(tl.c("mco.backup.button.download"), $$0 -> this.G()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esk)esk.a(tl.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esk)esk.a(tl.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new env(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esk)esk.a(tk.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.C);
      this.b(this.C);
      this.D();
   }

   @Override
   void D() {
      this.G.j = this.F();
      this.H.j = this.E();
   }

   private boolean E() {
      return this.D == -1 ? false : !this.B.get(this.D).e.isEmpty();
   }

   private boolean F() {
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
         tl $$3 = epg.a($$1);
         tl $$4 = tl.a("mco.configure.world.restore.question.line1", $$2, $$3);
         tl $$5 = tl.c("mco.configure.world.restore.question.line2");
         this.f.a(new eof($$0x -> {
            if ($$0x) {
               this.I();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eof.a.a, $$4, $$5, true));
      }
   }

   private void G() {
      tl $$0 = tl.c("mco.configure.world.restore.download.question.line1");
      tl $$1 = tl.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eof($$0x -> {
         if ($$0x) {
            this.H();
         } else {
            this.f.a(this);
         }
      }, eof.a.b, $$0, $$1, true));
   }

   private void H() {
      this.f.a(new eog(this.A.f(), new epn(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void I() {
      emf $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eog(this.A.f(), new epu($$0, this.J.a, this.A)));
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gew<enw.b> {
      public a() {
         super(enw.this.g - 150, enw.this.h, 32, enw.this.h - 15, 36);
      }

      public void a(emf $$0) {
         this.a((enw.b)(enw.this.new b($$0)));
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
         enw.this.D = $$0;
         enw.this.D();
      }

      public void a(@Nullable enw.b $$0) {
         super.a($$0);
         enw.this.D = this.i().indexOf($$0);
         enw.this.D();
      }
   }

   class b extends etg.a<enw.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final etx d = new etx(new aez("backup/changes"), new aez("backup/changes_highlighted"));
      private static final etx e = new etx(new aez("backup/restore"), new aez("backup/restore_highlighted"));
      private final emf f;
      private final List<esi> g = new ArrayList<>();
      @Nullable
      private esw h;
      @Nullable
      private esw i;

      public b(emf $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!enw.this.J.j) {
            this.d();
         }
      }

      private void a(emf $$0) {
         int $$1 = enw.this.B.indexOf($$0);
         if ($$1 != enw.this.B.size() - 1) {
            emf $$2 = enw.this.B.get($$1 + 1);

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
         int $$2 = enw.this.C.p() - 9 - 28;
         int $$3 = enw.this.C.h(enw.this.B.indexOf(this.f)) + 2;
         this.i = new esw($$2, $$3, 9, 9, d, $$0x -> enw.this.f.a(new env(enw.this, this.f)), tk.a);
         this.i.a(etv.a(enw.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = enw.this.C.p() - 17 - 7;
         int $$3 = enw.this.C.h(enw.this.B.indexOf(this.f)) + 2;
         this.h = new esw($$2, $$3, 17, 10, e, $$0x -> enw.this.a(enw.this.B.indexOf(this.f)), tk.a);
         this.h.a(etv.a(enw.b));
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
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(enw.this.i, tl.a("mco.backup.entry", epg.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(enw.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
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
