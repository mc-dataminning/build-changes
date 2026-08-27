import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoh extends gei {
   static final aer a = new aer("pending_invite/accept_highlighted");
   static final aer b = new aer("pending_invite/accept");
   static final aer c = new aer("pending_invite/reject_highlighted");
   static final aer y = new aer("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final tf A = tf.c("mco.invites.nopending");
   static final tf B = tf.c("mco.invites.button.accept");
   static final tf C = tf.c("mco.invites.button.reject");
   private final exz D;
   private final CompletableFuture<List<emg>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return elw.a().h().a;
      } catch (enj var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   tf F;
   eoh.b G;
   int H = -1;
   private esh I;
   private esh J;

   public eoh(exz $$0, tf $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aE_() {
      this.G = new eoh.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eoh.a> $$1 = $$0.stream().map($$0x -> new eoh.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.e(this.G);
      this.I = this.d(esh.a(tf.c("mco.invites.button.accept"), $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.B();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(esh.a(te.d, $$0 -> this.au_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(esh.a(tf.c("mco.invites.button.reject"), $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.B();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.B();
   }

   @Override
   public void au_() {
      this.f.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.k()) {
         String $$2 = this.G.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               elw $$2x = elw.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (enj var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               enn $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.e.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F = null;
      this.G.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 12, -1);
      if (this.F != null) {
         $$0.a(this.i, this.F, $$1, $$2);
      }

      if (this.E.isDone() && this.G.k() == 0) {
         $$0.a(this.i, A, this.g / 2, this.h / 2 - 20, -1);
      }
   }

   @Override
   void B() {
      this.I.j = this.a(this.H);
      this.J.j = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends etd.a<eoh.a> {
      private static final int b = 38;
      final emg c;
      private final List<enr> d;

      a(emg $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eoh.a.a(), new eoh.a.b());
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         enr.a(eoh.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(erw $$0, emg $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eoh.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eoh.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eoh.this.i, epd.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         enr.a($$0, this.d, eoh.this.G, $$2, $$3, $$4, $$5);
         epd.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public tf a() {
         tf $$0 = te.b(tf.b(this.c.b), tf.b(this.c.c), epd.a(this.c.e));
         return tf.a("narrator.select", $$0);
      }

      class a extends enr {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(erw $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eoh.a : eoh.b, $$1, $$2, 18, 18);
            if ($$3) {
               eoh.this.F = eoh.B;
            }
         }

         @Override
         public void a(int $$0) {
            eoh.this.a($$0, true);
         }
      }

      class b extends enr {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(erw $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eoh.c : eoh.y, $$1, $$2, 18, 18);
            if ($$3) {
               eoh.this.F = eoh.C;
            }
         }

         @Override
         public void a(int $$0) {
            eoh.this.a($$0, false);
         }
      }
   }

   class b extends geh<eoh.a> {
      public b() {
         super(eoh.this.g, eoh.this.h, 32, eoh.this.h - 40, 36);
      }

      public void b(int $$0) {
         this.i($$0);
      }

      @Override
      public int a() {
         return this.k() * 36;
      }

      @Override
      public int b() {
         return 260;
      }

      @Override
      public void a(int $$0) {
         super.a($$0);
         this.c($$0);
      }

      public void c(int $$0) {
         eoh.this.H = $$0;
         eoh.this.B();
      }

      public void a(@Nullable eoh.a $$0) {
         super.a($$0);
         eoh.this.H = this.i().indexOf($$0);
         eoh.this.B();
      }
   }
}
