import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fna extends hqd {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.backup");
   static final wy c = wy.c("mco.backup.button.restore");
   static final wy C = wy.c("mco.backup.changes.tooltip");
   private static final wy D = wy.c("mco.backup.nobackups");
   private static final wy E = wy.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fnd H;
   List<flj> I = Collections.emptyList();
   @Nullable
   fna.a J;
   final fwo K = new fwo(this);
   private final int L;
   @Nullable
   fta M;
   final flu N;
   boolean O = false;

   public fna(fnd $$0, flu $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aO_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new fna.a());
      fws $$0 = this.K.b(fws.e().a(8));
      this.M = $$0.a(fta.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fta.a(wx.k, $$0x -> this.aL_()).a());
      this.K.a($$1 -> {
         fsy var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
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
            fkt $$0 = fkt.a();

            try {
               List<flj> $$1 = $$0.e(fna.this.N.a).a;
               fna.this.m.execute(() -> {
                  fna.this.I = $$1;
                  fna.this.O = fna.this.I.isEmpty();
                  if (!fna.this.O && fna.this.M != null) {
                     fna.this.M.j = true;
                  }

                  if (fna.this.J != null) {
                     fna.this.J.a(fna.this.I.stream().map($$0xx -> fna.this.new b($$0xx)).toList());
                  }
               });
            } catch (fmp var3) {
               fna.a.error("Couldn't request backups", var3);
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
            fnp.a(
               this,
               wy.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fnj(
                           this.H.g(),
                           new foo(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends ftg<fna.b> {
      private static final int a = 36;

      public a() {
         super(fpt.Q(), fna.this.n, fna.this.K.d(), fna.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends ftg.a<fna.b> {
      private static final int b = 2;
      private final flj c;
      @Nullable
      private fta d;
      @Nullable
      private fta e;
      private final List<fsy> f = new ArrayList<>();

      public b(final flj $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fta.a(fna.C, $$0x -> fna.this.m.a(new fmz(fna.this, this.c)))
               .a(8 + fna.this.p.a(fna.C))
               .a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!fna.this.N.j) {
            this.d = fta.a(fna.c, $$0x -> this.g()).a(8 + fna.this.p.a(fna.C)).a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(flj $$0) {
         int $$1 = fna.this.I.indexOf($$0);
         if ($$1 != fna.this.I.size() - 1) {
            flj $$2 = fna.this.I.get($$1 + 1);

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
         wy $$0 = foi.a(this.c.b);
         wy $$1 = wy.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         fna.this.m.a(fnp.b(fna.this, $$1, $$0x -> fna.this.m.a(new fnj(fna.this.H.g(), new fow(this.c, fna.this.N.a, fna.this.H)))));
      }

      @Override
      public List<? extends fux> aE_() {
         return this.f;
      }

      @Override
      public List<? extends fwv> b() {
         return this.f;
      }

      @Override
      public void a(fsm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(fna.this.p, wy.a("mco.backup.entry", foi.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(fna.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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
