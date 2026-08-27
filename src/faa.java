import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class faa extends gsq {
   static final Logger a = LogUtils.getLogger();
   private static final ws b = ws.c("mco.configure.world.backup");
   static final ws c = ws.c("mco.backup.button.restore");
   static final ws B = ws.c("mco.backup.changes.tooltip");
   private static final ws C = ws.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fad F;
   List<eyj> G = Collections.emptyList();
   @Nullable
   faa.a H;
   final fih I = new fih(this);
   private final int J;
   @Nullable
   feu K;
   final eyu L;
   boolean M = false;

   public faa(fad $$0, eyu $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new faa.a());
      fil $$0 = this.I.b(fil.e().a(8));
      this.K = $$0.a(feu.a(ws.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.K.j = false;
      $$0.a(feu.a(wr.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M && this.H != null) {
         $$0.a(this.p, C, this.n / 2 - this.p.a(C) / 2, this.H.D() + this.H.v() / 2 - 9 / 2, -1, false);
      }
   }

   @Override
   protected void c() {
      this.I.a();
      if (this.H != null) {
         this.H.a(this.n, this.I);
      }
   }

   private void C() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            eyd $$0 = eyd.a();

            try {
               List<eyj> $$1 = $$0.e(faa.this.L.a).a;
               faa.this.m.execute(() -> {
                  faa.this.G = $$1;
                  faa.this.M = faa.this.G.isEmpty();
                  if (!faa.this.M && faa.this.K != null) {
                     faa.this.K.j = true;
                  }

                  if (faa.this.H != null) {
                     faa.this.H.aE_().clear();

                     for (eyj $$1x : faa.this.G) {
                        faa.this.H.a($$1x);
                     }
                  }
               });
            } catch (ezq var3) {
               faa.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void D() {
      ws $$0 = ws.c("mco.configure.world.restore.download.question.line1");
      ws $$1 = ws.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new faj($$0x -> {
         if ($$0x) {
            this.m.a(new fak(this.F.f(), new fbs(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, faj.a.b, $$0, $$1, true));
   }

   class a extends ffa<faa.b> {
      private static final int m = 36;

      public a() {
         super(fcu.Q(), faa.this.n, faa.this.I.d(), faa.this.I.c(), 36);
      }

      public void a(eyj $$0) {
         this.b(faa.this.new b($$0));
      }

      @Override
      public int a() {
         return this.l() * 36 + this.f;
      }

      @Override
      public int b() {
         return 300;
      }
   }

   class b extends ffa.a<faa.b> {
      private static final int b = 2;
      private final eyj c;
      @Nullable
      private feu d;
      @Nullable
      private feu e;
      private final List<fes> f = new ArrayList<>();

      public b(eyj $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = feu.a(faa.B, $$0x -> faa.this.m.a(new ezz(faa.this, this.c)))
               .a(8 + faa.this.p.a(faa.B))
               .a($$0x -> wr.a(ws.a("mco.backup.narration", this.c()), (ws)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!faa.this.L.j) {
            this.d = feu.a(faa.c, $$0x -> this.d()).a(8 + faa.this.p.a(faa.B)).a($$0x -> wr.a(ws.a("mco.backup.narration", this.c()), (ws)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(eyj $$0) {
         int $$1 = faa.this.G.indexOf($$0);
         if ($$1 != faa.this.G.size() - 1) {
            eyj $$2 = faa.this.G.get($$1 + 1);

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
            String $$1 = DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
            this.c.e.put($$0, $$1);
            this.c.a(true);
         } else {
            this.c.e.put($$0, this.c.d.get($$0));
         }
      }

      private String c() {
         return DateFormat.getDateTimeInstance(3, 3).format(this.c.b);
      }

      private void d() {
         ws $$0 = fbk.a(this.c.b);
         ws $$1 = ws.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         ws $$2 = ws.c("mco.configure.world.restore.question.line2");
         faa.this.m.a(new faj($$0x -> {
            if ($$0x) {
               faa.this.m.a(new fak(faa.this.F.f(), new fca(this.c, faa.this.L.a, faa.this.F)));
            } else {
               faa.this.m.a(faa.this);
            }
         }, faj.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fgq> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fio> b() {
         return this.f;
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(faa.this.p, ws.a("mco.backup.entry", fbk.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(faa.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.x() + 8;
            this.d.m($$3 + $$4 - $$14);
            this.d.n($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.x() + 8;
            this.e.m($$3 + $$4 - $$14);
            this.e.n($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
