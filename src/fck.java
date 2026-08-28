import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fck extends gvf {
   static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.backup");
   static final xo c = xo.c("mco.backup.button.restore");
   static final xo B = xo.c("mco.backup.changes.tooltip");
   private static final xo C = xo.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fcn F;
   List<fat> G = Collections.emptyList();
   @Nullable
   fck.a H;
   final fkq I = new fkq(this);
   private final int J;
   @Nullable
   fhd K;
   final fbe L;
   boolean M = false;

   public fck(fcn $$0, fbe $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fck.a());
      fku $$0 = this.I.b(fku.e().a(8));
      this.K = $$0.a(fhd.a(xo.c("mco.backup.button.download"), $$0x -> this.F()).a());
      this.K.j = false;
      $$0.a(fhd.a(xn.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         fhb var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
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

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fan $$0 = fan.a();

            try {
               List<fat> $$1 = $$0.e(fck.this.L.a).a;
               fck.this.m.execute(() -> {
                  fck.this.G = $$1;
                  fck.this.M = fck.this.G.isEmpty();
                  if (!fck.this.M && fck.this.K != null) {
                     fck.this.K.j = true;
                  }

                  if (fck.this.H != null) {
                     fck.this.H.aD_().clear();

                     for (fat $$1x : fck.this.G) {
                        fck.this.H.a($$1x);
                     }
                  }
               });
            } catch (fca var3) {
               fck.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void F() {
      xo $$0 = xo.c("mco.configure.world.restore.download.question.line1");
      xo $$1 = xo.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new fct($$0x -> {
         if ($$0x) {
            this.m.a(new fcu(this.F.f(), new fec(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fct.a.b, $$0, $$1, true));
   }

   class a extends fhj<fck.b> {
      private static final int m = 36;

      public a() {
         super(ffe.Q(), fck.this.n, fck.this.I.d(), fck.this.I.c(), 36);
      }

      public void a(fat $$0) {
         this.b(fck.this.new b($$0));
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

   class b extends fhj.a<fck.b> {
      private static final int b = 2;
      private final fat c;
      @Nullable
      private fhd d;
      @Nullable
      private fhd e;
      private final List<fhb> f = new ArrayList<>();

      public b(final fat $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fhd.a(fck.B, $$0x -> fck.this.m.a(new fcj(fck.this, this.c)))
               .a(8 + fck.this.p.a(fck.B))
               .a($$0x -> xn.a(xo.a("mco.backup.narration", this.c()), (xo)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fck.this.L.j) {
            this.d = fhd.a(fck.c, $$0x -> this.d()).a(8 + fck.this.p.a(fck.B)).a($$0x -> xn.a(xo.a("mco.backup.narration", this.c()), (xo)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fat $$0) {
         int $$1 = fck.this.G.indexOf($$0);
         if ($$1 != fck.this.G.size() - 1) {
            fat $$2 = fck.this.G.get($$1 + 1);

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
         xo $$0 = fdu.a(this.c.b);
         xo $$1 = xo.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         xo $$2 = xo.c("mco.configure.world.restore.question.line2");
         fck.this.m.a(new fct($$0x -> {
            if ($$0x) {
               fck.this.m.a(new fcu(fck.this.F.f(), new fek(this.c, fck.this.L.a, fck.this.F)));
            } else {
               fck.this.m.a(fck.this);
            }
         }, fct.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fiz> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fkx> b() {
         return this.f;
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fck.this.p, xo.a("mco.backup.entry", fdu.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fck.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
