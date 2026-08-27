import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fak extends gtb {
   static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("mco.configure.world.backup");
   static final wu c = wu.c("mco.backup.button.restore");
   static final wu B = wu.c("mco.backup.changes.tooltip");
   private static final wu C = wu.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fan F;
   List<eyt> G = Collections.emptyList();
   @Nullable
   fak.a H;
   final fir I = new fir(this);
   private final int J;
   @Nullable
   ffe K;
   final eze L;
   boolean M = false;

   public fak(fan $$0, eze $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fak.a());
      fiv $$0 = this.I.b(fiv.e().a(8));
      this.K = $$0.a(ffe.a(wu.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.K.j = false;
      $$0.a(ffe.a(wt.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         ffc var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
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
            eyn $$0 = eyn.a();

            try {
               List<eyt> $$1 = $$0.e(fak.this.L.a).a;
               fak.this.m.execute(() -> {
                  fak.this.G = $$1;
                  fak.this.M = fak.this.G.isEmpty();
                  if (!fak.this.M && fak.this.K != null) {
                     fak.this.K.j = true;
                  }

                  if (fak.this.H != null) {
                     fak.this.H.aE_().clear();

                     for (eyt $$1x : fak.this.G) {
                        fak.this.H.a($$1x);
                     }
                  }
               });
            } catch (faa var3) {
               fak.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void D() {
      wu $$0 = wu.c("mco.configure.world.restore.download.question.line1");
      wu $$1 = wu.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new fat($$0x -> {
         if ($$0x) {
            this.m.a(new fau(this.F.f(), new fcc(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fat.a.b, $$0, $$1, true));
   }

   class a extends ffk<fak.b> {
      private static final int m = 36;

      public a() {
         super(fde.Q(), fak.this.n, fak.this.I.d(), fak.this.I.c(), 36);
      }

      public void a(eyt $$0) {
         this.b(fak.this.new b($$0));
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

   class b extends ffk.a<fak.b> {
      private static final int b = 2;
      private final eyt c;
      @Nullable
      private ffe d;
      @Nullable
      private ffe e;
      private final List<ffc> f = new ArrayList<>();

      public b(eyt $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = ffe.a(fak.B, $$0x -> fak.this.m.a(new faj(fak.this, this.c)))
               .a(8 + fak.this.p.a(fak.B))
               .a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fak.this.L.j) {
            this.d = ffe.a(fak.c, $$0x -> this.d()).a(8 + fak.this.p.a(fak.B)).a($$0x -> wt.a(wu.a("mco.backup.narration", this.c()), (wu)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(eyt $$0) {
         int $$1 = fak.this.G.indexOf($$0);
         if ($$1 != fak.this.G.size() - 1) {
            eyt $$2 = fak.this.G.get($$1 + 1);

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
         wu $$0 = fbu.a(this.c.b);
         wu $$1 = wu.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         wu $$2 = wu.c("mco.configure.world.restore.question.line2");
         fak.this.m.a(new fat($$0x -> {
            if ($$0x) {
               fak.this.m.a(new fau(fak.this.F.f(), new fck(this.c, fak.this.L.a, fak.this.F)));
            } else {
               fak.this.m.a(fak.this);
            }
         }, fat.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fha> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fiy> b() {
         return this.f;
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fak.this.p, wu.a("mco.backup.entry", fbu.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fak.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
