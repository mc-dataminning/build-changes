import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmv extends hpw {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.backup");
   static final wy c = wy.c("mco.backup.button.restore");
   static final wy C = wy.c("mco.backup.changes.tooltip");
   private static final wy D = wy.c("mco.backup.nobackups");
   private static final wy E = wy.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fmy H;
   List<fle> I = Collections.emptyList();
   @Nullable
   fmv.a J;
   final fwj K = new fwj(this);
   private final int L;
   @Nullable
   fsv M;
   final flp N;
   boolean O = false;

   public fmv(fmy $$0, flp $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aO_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fmv.a());
      fwn $$0 = this.K.b(fwn.e().a(8));
      this.M = $$0.a(fsv.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fsv.a(wx.k, $$0x -> this.aL_()).a());
      this.K.a($$1 -> {
         fst var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.O && this.J != null) {
         $$0.b(this.p, D, this.n / 2 - this.p.a(D) / 2, this.J.G() + this.J.y() / 2 - 9 / 2, -1);
      }
   }

   @Override
   protected void c() {
      this.K.a();
      if (this.J != null) {
         this.J.a(this.n, this.K);
      }
   }

   private void E() {
      (new Thread("Realms-fetch-backups") {
         @Override
         public void run() {
            fko $$0 = fko.a();

            try {
               List<fle> $$1 = $$0.e(fmv.this.N.a).a;
               fmv.this.m.execute(() -> {
                  fmv.this.I = $$1;
                  fmv.this.O = fmv.this.I.isEmpty();
                  if (!fmv.this.O && fmv.this.M != null) {
                     fmv.this.M.j = true;
                  }

                  if (fmv.this.J != null) {
                     fmv.this.J.a(fmv.this.I.stream().map($$0xx -> fmv.this.new b($$0xx)).toList());
                  }
               });
            } catch (fmk var3) {
               fmv.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aL_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fnk.a(
               this,
               wy.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fne(
                           this.H.g(),
                           new foj(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends ftb<fmv.b> {
      private static final int a = 36;

      public a() {
         super(fpo.Q(), fmv.this.n, fmv.this.K.d(), fmv.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends ftb.a<fmv.b> {
      private static final int b = 2;
      private final fle c;
      @Nullable
      private fsv d;
      @Nullable
      private fsv e;
      private final List<fst> f = new ArrayList<>();

      public b(final fle $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fsv.a(fmv.C, $$0x -> fmv.this.m.a(new fmu(fmv.this, this.c)))
               .a(8 + fmv.this.p.a(fmv.C))
               .a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fmv.this.N.j) {
            this.d = fsv.a(fmv.c, $$0x -> this.g()).a(8 + fmv.this.p.a(fmv.C)).a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fle $$0) {
         int $$1 = fmv.this.I.indexOf($$0);
         if ($$1 != fmv.this.I.size() - 1) {
            fle $$2 = fmv.this.I.get($$1 + 1);

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

      private void g() {
         wy $$0 = fod.a(this.c.b);
         wy $$1 = wy.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fmv.this.m.a(fnk.b(fmv.this, $$1, $$0x -> fmv.this.m.a(new fne(fmv.this.H.g(), new foq(this.c, fmv.this.N.a, fmv.this.H)))));
      }

      @Override
      public List<? extends fus> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fwq> b() {
         return this.f;
      }

      @Override
      public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fmv.this.p, wy.a("mco.backup.entry", fod.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fmv.this.p, this.a(this.c.b), $$3, $$12, 5000268);
         int $$14 = 0;
         int $$15 = $$2 + $$5 / 2 - 10;
         if (this.d != null) {
            $$14 += this.d.A() + 8;
            this.d.j($$3 + $$4 - $$14);
            this.d.k($$15);
            this.d.a($$0, $$6, $$7, $$9);
         }

         if (this.e != null) {
            $$14 += this.e.A() + 8;
            this.e.j($$3 + $$4 - $$14);
            this.e.k($$15);
            this.e.a($$0, $$6, $$7, $$9);
         }
      }

      private String a(Date $$0) {
         return DateFormat.getDateTimeInstance(3, 3).format($$0);
      }
   }
}
