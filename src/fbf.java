import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbf extends gty {
   static final Logger a = LogUtils.getLogger();
   private static final wx b = wx.c("mco.configure.world.backup");
   static final wx c = wx.c("mco.backup.button.restore");
   static final wx B = wx.c("mco.backup.changes.tooltip");
   private static final wx C = wx.c("mco.backup.nobackups");
   private static final String D = "uploaded";
   private static final int E = 8;
   final fbi F;
   List<ezo> G = Collections.emptyList();
   @Nullable
   fbf.a H;
   final fjm I = new fjm(this);
   private final int J;
   @Nullable
   ffz K;
   final ezz L;
   boolean M = false;

   public fbf(fbi $$0, ezz $$1, int $$2) {
      super(b);
      this.F = $$0;
      this.L = $$1;
      this.J = $$2;
   }

   @Override
   public void aM_() {
      this.I.a(b, this.p);
      this.H = this.I.c(new fbf.a());
      fjq $$0 = this.I.b(fjq.e().a(8));
      this.K = $$0.a(ffz.a(wx.c("mco.backup.button.download"), $$0x -> this.D()).a());
      this.K.j = false;
      $$0.a(ffz.a(ww.k, $$0x -> this.d()).a());
      this.I.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
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
            ezi $$0 = ezi.a();

            try {
               List<ezo> $$1 = $$0.e(fbf.this.L.a).a;
               fbf.this.m.execute(() -> {
                  fbf.this.G = $$1;
                  fbf.this.M = fbf.this.G.isEmpty();
                  if (!fbf.this.M && fbf.this.K != null) {
                     fbf.this.K.j = true;
                  }

                  if (fbf.this.H != null) {
                     fbf.this.H.aE_().clear();

                     for (ezo $$1x : fbf.this.G) {
                        fbf.this.H.a($$1x);
                     }
                  }
               });
            } catch (fav var3) {
               fbf.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void d() {
      this.m.a(this.F);
   }

   private void D() {
      wx $$0 = wx.c("mco.configure.world.restore.download.question.line1");
      wx $$1 = wx.c("mco.configure.world.restore.download.question.line2");
      this.m.a(new fbo($$0x -> {
         if ($$0x) {
            this.m.a(new fbp(this.F.f(), new fcx(this.L.a, this.J, this.L.c + " (" + this.L.i.get(this.L.n).a(this.L.n) + ")", this)));
         } else {
            this.m.a(this);
         }
      }, fbo.a.b, $$0, $$1, true));
   }

   class a extends fgf<fbf.b> {
      private static final int m = 36;

      public a() {
         super(fdz.Q(), fbf.this.n, fbf.this.I.d(), fbf.this.I.c(), 36);
      }

      public void a(ezo $$0) {
         this.b(fbf.this.new b($$0));
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

   class b extends fgf.a<fbf.b> {
      private static final int b = 2;
      private final ezo c;
      @Nullable
      private ffz d;
      @Nullable
      private ffz e;
      private final List<ffx> f = new ArrayList<>();

      public b(ezo $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = ffz.a(fbf.B, $$0x -> fbf.this.m.a(new fbe(fbf.this, this.c)))
               .a(8 + fbf.this.p.a(fbf.B))
               .a($$0x -> ww.a(wx.a("mco.backup.narration", this.c()), (wx)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fbf.this.L.j) {
            this.d = ffz.a(fbf.c, $$0x -> this.d()).a(8 + fbf.this.p.a(fbf.B)).a($$0x -> ww.a(wx.a("mco.backup.narration", this.c()), (wx)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(ezo $$0) {
         int $$1 = fbf.this.G.indexOf($$0);
         if ($$1 != fbf.this.G.size() - 1) {
            ezo $$2 = fbf.this.G.get($$1 + 1);

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
         wx $$0 = fcp.a(this.c.b);
         wx $$1 = wx.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         wx $$2 = wx.c("mco.configure.world.restore.question.line2");
         fbf.this.m.a(new fbo($$0x -> {
            if ($$0x) {
               fbf.this.m.a(new fbp(fbf.this.F.f(), new fdf(this.c, fbf.this.L.a, fbf.this.F)));
            } else {
               fbf.this.m.a(fbf.this);
            }
         }, fbo.a.a, $$1, $$2, true));
      }

      @Override
      public List<? extends fhv> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fjt> b() {
         return this.f;
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.a(fbf.this.p, wx.a("mco.backup.entry", fcp.a(this.c.b)), $$3, $$11, $$13, false);
         $$0.a(fbf.this.p, this.a(this.c.b), $$3, $$12, 5000268, false);
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
