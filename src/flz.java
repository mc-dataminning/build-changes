import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flz extends hpb {
   static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("mco.configure.world.backup");
   static final wy c = wy.c("mco.backup.button.restore");
   static final wy C = wy.c("mco.backup.changes.tooltip");
   private static final wy D = wy.c("mco.backup.nobackups");
   private static final wy E = wy.c("mco.backup.button.download");
   private static final String F = "uploaded";
   private static final int G = 8;
   final fmc H;
   List<fki> I = Collections.emptyList();
   @Nullable
   flz.a J;
   final fvq K = new fvq(this);
   private final int L;
   @Nullable
   fsc M;
   final fkt N;
   boolean O = false;

   public flz(fmc $$0, fkt $$1, int $$2) {
      super(b);
      this.H = $$0;
      this.N = $$1;
      this.L = $$2;
   }

   @Override
   public void aN_() {
      this.K.a(b, this.p);
      this.J = this.K.c(new flz.a());
      fvu $$0 = this.K.b(fvu.e().a(8));
      this.M = $$0.a(fsc.a(E, $$0x -> this.F()).a());
      this.M.j = false;
      $$0.a(fsc.a(wx.k, $$0x -> this.aK_()).a());
      this.K.a($$1 -> {
         fsa var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
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
            fjs $$0 = fjs.a();

            try {
               List<fki> $$1 = $$0.e(flz.this.N.a).a;
               flz.this.m.execute(() -> {
                  flz.this.I = $$1;
                  flz.this.O = flz.this.I.isEmpty();
                  if (!flz.this.O && flz.this.M != null) {
                     flz.this.M.j = true;
                  }

                  if (flz.this.J != null) {
                     flz.this.J.a(flz.this.I.stream().map($$0xx -> flz.this.new b($$0xx)).toList());
                  }
               });
            } catch (flo var3) {
               flz.a.error("Couldn't request backups", var3);
            }
         }
      }).start();
   }

   @Override
   public void aK_() {
      this.m.a(this.H);
   }

   private void F() {
      this.m
         .a(
            fmo.a(
               this,
               wy.c("mco.configure.world.restore.download.question.line1"),
               $$0 -> this.m
                     .a(
                        new fmi(
                           this.H.g(),
                           new fnn(this.N.a, this.L, Objects.requireNonNullElse(this.N.c, "") + " (" + this.N.i.get(this.N.p).a(this.N.p) + ")", this)
                        )
                     )
            )
         );
   }

   class a extends fsi<flz.b> {
      private static final int a = 36;

      public a() {
         super(fos.Q(), flz.this.n, flz.this.K.d(), flz.this.K.c(), 36);
      }

      @Override
      public int a() {
         return 300;
      }
   }

   class b extends fsi.a<flz.b> {
      private static final int b = 2;
      private final fki c;
      @Nullable
      private fsc d;
      @Nullable
      private fsc e;
      private final List<fsa> f = new ArrayList<>();

      public b(final fki $$0) {
         this.c = $$0;
         this.a($$0);
         if (!$$0.e.isEmpty()) {
            this.e = fsc.a(flz.C, $$0x -> flz.this.m.a(new fly(flz.this, this.c)))
               .a(8 + flz.this.p.a(flz.C))
               .a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get()))
               .a();
            this.f.add(this.e);
         }

         if (!flz.this.N.j) {
            this.d = fsc.a(flz.c, $$0x -> this.g()).a(8 + flz.this.p.a(flz.C)).a($$0x -> wx.a(wy.a("mco.backup.narration", this.c()), (wy)$$0x.get())).a();
            this.f.add(this.d);
         }
      }

      private void a(fki $$0) {
         int $$1 = flz.this.I.indexOf($$0);
         if ($$1 != flz.this.I.size() - 1) {
            fki $$2 = flz.this.I.get($$1 + 1);

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
         wy $$0 = fnh.a(this.c.b);
         wy $$1 = wy.a("mco.configure.world.restore.question.line1", this.c(), $$0);
         flz.this.m.a(fmo.b(flz.this, $$1, $$0x -> flz.this.m.a(new fmi(flz.this.H.g(), new fnu(this.c, flz.this.N.a, flz.this.H)))));
      }

      @Override
      public List<? extends ftz> aD_() {
         return this.f;
      }

      @Override
      public List<? extends fvx> b() {
         return this.f;
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         int $$10 = $$2 + $$5 / 2;
         int $$11 = $$10 - 9 - 2;
         int $$12 = $$10 + 2;
         int $$13 = this.c.a() ? -8388737 : -1;
         $$0.b(flz.this.p, wy.a("mco.backup.entry", fnh.a(this.c.b)), $$3, $$11, $$13);
         $$0.b(flz.this.p, this.a(this.c.b), $$3, $$12, 5000268);
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
