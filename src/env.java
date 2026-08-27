import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class env extends ged {
   static final Logger a = LogUtils.getLogger();
   static final te b = te.c("mco.backup.button.restore");
   static final te c = te.c("mco.backup.changes.tooltip");
   private static final te y = te.c("mco.configure.world.backup");
   private static final te z = te.c("mco.backup.nobackups");
   private final eny A;
   List<emd> B = Collections.emptyList();
   env.a C;
   int D = -1;
   private final int E;
   private esi F;
   private esi G;
   private esi H;
   Boolean I = false;
   final emo J;
   private static final String K = "uploaded";

   public env(eny $$0, emo $$1, int $$2) {
      super(y);
      this.A = $$0;
      this.J = $$1;
      this.E = $$2;
   }

   @Override
   public void aE_() {
      this.C = new env.a();
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            elx $$0 = elx.a();

            try {
               List<emd> $$1 = $$0.e(env.this.J.a).a;
               env.this.f.execute(() -> {
                  env.this.B = $$1;
                  env.this.I = env.this.B.isEmpty();
                  env.this.C.v();

                  for (emd $$1x : env.this.B) {
                     env.this.C.a($$1x);
                  }
               });
            } catch (enk var3) {
               env.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
      this.F = this.d((esi)esi.a(te.c("mco.backup.button.download"), $$0 -> this.E()).a(this.g - 135, h(1), 120, 20).a());
      this.G = this.d((esi)esi.a(te.c("mco.backup.button.restore"), $$0 -> this.a(this.D)).a(this.g - 135, h(3), 120, 20).a());
      this.H = this.d((esi)esi.a(te.c("mco.backup.changes.tooltip"), $$0 -> {
         this.f.a(new enu(this, this.B.get(this.D)));
         this.D = -1;
      }).a(this.g - 135, h(5), 120, 20).a());
      this.d((esi)esi.a(td.k, $$0 -> this.f.a(this.A)).a(this.g - 100, this.h - 35, 85, 20).a());
      this.e(this.C);
      this.b(this.C);
      this.B();
   }

   @Override
   void B() {
      this.G.j = this.D();
      this.H.j = this.C();
   }

   private boolean C() {
      return this.D == -1 ? false : !this.B.get(this.D).e.isEmpty();
   }

   private boolean D() {
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
         te $$3 = epe.a($$1);
         te $$4 = te.a("mco.configure.world.restore.question.line1", $$2, $$3);
         te $$5 = te.c("mco.configure.world.restore.question.line2");
         this.f.a(new eoe($$0x -> {
            if ($$0x) {
               this.G();
            } else {
               this.D = -1;
               this.f.a(this);
            }
         }, eoe.a.a, $$4, $$5, true));
      }
   }

   private void E() {
      te $$0 = te.c("mco.configure.world.restore.download.question.line1");
      te $$1 = te.c("mco.configure.world.restore.download.question.line2");
      this.f.a(new eoe($$0x -> {
         if ($$0x) {
            this.F();
         } else {
            this.f.a(this);
         }
      }, eoe.a.b, $$0, $$1, true));
   }

   private void F() {
      this.f.a(new eof(this.A.f(), new epl(this.J.a, this.E, this.J.c + " (" + this.J.i.get(this.J.n).a(this.J.n) + ")", this)));
   }

   private void G() {
      emd $$0 = this.B.get(this.D);
      this.D = -1;
      this.f.a(new eof(this.A.f(), new eps($$0, this.J.a, this.A)));
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.I) {
         $$0.a(this.i, z, 20, this.h / 2 - 10, -1, false);
      }

      this.F.i = !this.I;
   }

   class a extends gec<env.b> {
      public a() {
         super(env.this.g - 150, env.this.h, 32, env.this.h - 15, 36);
      }

      public void a(emd $$0) {
         this.a((env.b)(env.this.new b($$0)));
      }

      @Override
      public int b() {
         return (int)((double)this.d * 0.93);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int c() {
         return this.d - 5;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.b($$0);
      }

      public void b(int $$0) {
         env.this.D = $$0;
         env.this.B();
      }

      public void a(@Nullable env.b $$0) {
         super.a($$0);
         env.this.D = this.i().indexOf($$0);
         env.this.B();
      }
   }

   class b extends ete.a<env.b> {
      private static final int b = 2;
      private static final int c = 7;
      private static final ett d = new ett(new aep("backup/changes"), new aep("backup/changes_highlighted"));
      private static final ett e = new ett(new aep("backup/restore"), new aep("backup/restore_highlighted"));
      private final emd f;
      private final List<esg> g = new ArrayList<>();
      @Nullable
      private esu h;
      @Nullable
      private esu i;

      public b(emd $$0) {
         this.f = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.b();
         }

         if (!env.this.J.j) {
            this.d();
         }
      }

      private void a(emd $$0) {
         int $$1 = env.this.B.indexOf($$0);
         if ($$1 != env.this.B.size() - 1) {
            emd $$2 = env.this.B.get($$1 + 1);

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
         int $$2 = env.this.C.p() - 9 - 28;
         int $$3 = env.this.C.g(env.this.B.indexOf(this.f)) + 2;
         this.i = new esu($$2, $$3, 9, 9, d, $$0x -> env.this.f.a(new enu(env.this, this.f)), td.a);
         this.i.a(etr.a(env.c));
         this.g.add(this.i);
      }

      private void d() {
         int $$0 = 17;
         int $$1 = 10;
         int $$2 = env.this.C.p() - 17 - 7;
         int $$3 = env.this.C.g(env.this.B.indexOf(this.f)) + 2;
         this.h = new esu($$2, $$3, 17, 10, e, $$0x -> env.this.a(env.this.B.indexOf(this.f)), td.a);
         this.h.a(etr.a(env.b));
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
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = this.f.a() ? -8388737 : 16777215;
         $$0.a(env.this.i, te.a("mco.backup.entry", epe.a(this.f.b)), $$3, $$2 + 1, $$10, false);
         $$0.a(env.this.i, this.a(this.f.b), $$3, $$2 + 12, 5000268, false);
         this.g.forEach($$5x -> {
            $$5x.f($$2 + 2);
            $$5x.a($$0, $$6, $$7, $$9);
         });
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }

      @Override
      public te a() {
         return te.a("narrator.select", this.f.b.toString());
      }
   }
}
