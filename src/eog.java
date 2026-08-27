import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eog extends ger {
   static final aer a = new aer("pending_invite/accept_highlighted");
   static final aer b = new aer("pending_invite/accept");
   static final aer c = new aer("pending_invite/reject_highlighted");
   static final aer y = new aer("pending_invite/reject");
   private static final Logger z = LogUtils.getLogger();
   private static final tf A = tf.c("mco.invites.nopending");
   static final tf B = tf.c("mco.invites.button.accept");
   static final tf C = tf.c("mco.invites.button.reject");
   private final eya D;
   private final CompletableFuture<List<emf>> E = CompletableFuture.supplyAsync(() -> {
      try {
         return elv.a().h().a;
      } catch (eni var1x) {
         z.error("Couldn't list invites", var1x);
         return List.of();
      }
   }, ac.g());
   @Nullable
   tf F;
   eog.b G;
   int H = -1;
   private esg I;
   private esg J;

   public eog(eya $$0, tf $$1) {
      super($$1);
      this.D = $$0;
   }

   @Override
   public void aC_() {
      this.G = new eog.b();
      this.E.thenAcceptAsync($$0 -> {
         List<eog.a> $$1 = $$0.stream().map($$0x -> new eog.a($$0x)).toList();
         this.G.a($$1);
      }, this.j);
      this.e(this.G);
      this.I = this.d(esg.a(tf.c("mco.invites.button.accept"), $$0 -> {
         this.a(this.H, true);
         this.H = -1;
         this.C();
      }).a(this.g / 2 - 174, this.h - 32, 100, 20).a());
      this.d(esg.a(te.d, $$0 -> this.at_()).a(this.g / 2 - 50, this.h - 32, 100, 20).a());
      this.J = this.d(esg.a(tf.c("mco.invites.button.reject"), $$0 -> {
         this.a(this.H, false);
         this.H = -1;
         this.C();
      }).a(this.g / 2 + 74, this.h - 32, 100, 20).a());
      this.C();
   }

   @Override
   public void at_() {
      this.f.a(this.D);
   }

   void a(int $$0, boolean $$1) {
      if ($$0 < this.G.k()) {
         String $$2 = this.G.i().get($$0).c.a;
         CompletableFuture.<Boolean>supplyAsync(() -> {
            try {
               elv $$2x = elv.a();
               if ($$1) {
                  $$2x.a($$2);
               } else {
                  $$2x.b($$2);
               }

               return true;
            } catch (eni var3x) {
               z.error("Couldn't handle invite", var3x);
               return false;
            }
         }, ac.g()).thenAcceptAsync($$2x -> {
            if ($$2x) {
               this.G.b($$0);
               enm $$3 = this.f.aY();
               if ($$1) {
                  $$3.c.a();
               }

               $$3.e.a();
            }
         }, this.j);
      }
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
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
   void C() {
      this.I.j = this.a(this.H);
      this.J.j = this.a(this.H);
   }

   private boolean a(int $$0) {
      return $$0 != -1;
   }

   class a extends etc.a<eog.a> {
      private static final int b = 38;
      final emf c;
      private final List<enq> d;

      a(emf $$0) {
         this.c = $$0;
         this.d = Arrays.asList(new eog.a.a(), new eog.a.b());
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, this.c, $$3, $$2, $$6, $$7);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         enq.a(eog.this.G, this, this.d, $$2, $$0, $$1);
         return true;
      }

      private void a(erv $$0, emf $$1, int $$2, int $$3, int $$4, int $$5) {
         $$0.a(eog.this.i, $$1.b, $$2 + 38, $$3 + 1, -1, false);
         $$0.a(eog.this.i, $$1.c, $$2 + 38, $$3 + 12, 7105644, false);
         $$0.a(eog.this.i, epc.a($$1.e), $$2 + 38, $$3 + 24, 7105644, false);
         enq.a($$0, this.d, eog.this.G, $$2, $$3, $$4, $$5);
         epc.a($$0, $$2, $$3, 32, $$1.d);
      }

      @Override
      public tf a() {
         tf $$0 = te.b(tf.b(this.c.b), tf.b(this.c.c), epc.a(this.c.e));
         return tf.a("narrator.select", $$0);
      }

      class a extends enq {
         a() {
            super(15, 15, 215, 5);
         }

         @Override
         protected void a(erv $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eog.a : eog.b, $$1, $$2, 18, 18);
            if ($$3) {
               eog.this.F = eog.B;
            }
         }

         @Override
         public void a(int $$0) {
            eog.this.a($$0, true);
         }
      }

      class b extends enq {
         b() {
            super(15, 15, 235, 5);
         }

         @Override
         protected void a(erv $$0, int $$1, int $$2, boolean $$3) {
            $$0.a($$3 ? eog.c : eog.y, $$1, $$2, 18, 18);
            if ($$3) {
               eog.this.F = eog.C;
            }
         }

         @Override
         public void a(int $$0) {
            eog.this.a($$0, false);
         }
      }
   }

   class b extends geq<eog.a> {
      public b() {
         super(eog.this.g, eog.this.h, 32, eog.this.h - 40, 36);
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
         eog.this.H = $$0;
         eog.this.C();
      }

      public void a(@Nullable eog.a $$0) {
         super.a($$0);
         eog.this.H = this.i().indexOf($$0);
         eog.this.C();
      }
   }
}
