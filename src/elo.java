import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class elo extends gan {
   private static final Logger a = LogUtils.getLogger();
   private static final sw b = sw.c("selectWorld.unable_to_load");
   static final sw c = sw.c("selectWorld.world");
   static final sw G = sw.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final sw H = sw.c("selectWorld.cheats");
   private static final DateFormat I = new SimpleDateFormat();
   private final eln J;
   private final long K;
   private final int L;
   epi M;
   List<dyz> N = Lists.newArrayList();
   int O = -1;
   elo.b P;
   private final Runnable Q;

   public elo(long $$0, int $$1, eln $$2, Runnable $$3) {
      super(sw.c("mco.upload.select.world.title"));
      this.J = $$2;
      this.K = $$0;
      this.L = $$1;
      this.Q = $$3;
   }

   private void B() throws Exception {
      dyy.a $$0 = this.f.k().b();
      this.N = this.f.k().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (dyz $$1 : this.N) {
         this.P.a($$1);
      }
   }

   @Override
   public void b() {
      this.P = new elo.b();

      try {
         this.B();
      } catch (Exception var2) {
         a.error("Couldn't load level list", var2);
         this.f.a(new ele(b, sw.a(var2.getMessage()), this.J));
         return;
      }

      this.e(this.P);
      this.M = this.d(epi.a(sw.c("mco.upload.button.name"), $$0 -> this.C()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.M.r = this.O >= 0 && this.O < this.N.size();
      this.d(epi.a(sv.k, $$0 -> this.f.a(this.J)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gal(sw.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), 10526880));
      if (this.N.isEmpty()) {
         this.a(new gal(sw.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, 16777215));
      }
   }

   @Override
   public sw au_() {
      return sv.a(this.m(), this.l());
   }

   private void C() {
      if (this.O != -1 && !this.N.get(this.O).i()) {
         dyz $$0 = this.N.get(this.O);
         this.f.a(new elu(this.K, this.L, this.J, $$0, this.Q));
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.P.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.J);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static sw a(dyz $$0) {
      return $$0.h().d();
   }

   static String b(dyz $$0) {
      return I.format(new Date($$0.f()));
   }

   class a extends eqc.a<elo.a> {
      private final dyz b;
      private final String c;
      private final sw d;
      private final sw e;

      public a(dyz $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = sw.a("mco.upload.entry.id", $$0.a(), elo.b($$0));
         sw $$1;
         if ($$0.i()) {
            $$1 = elo.G;
         } else {
            $$1 = elo.a($$0);
         }

         if ($$0.j()) {
            $$1 = sw.a("mco.upload.entry.cheats", $$1.getString(), elo.H);
         }

         this.e = $$1;
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         elo.this.P.a(elo.this.N.indexOf(this.b));
         return true;
      }

      protected void a(eox $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = elo.c + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(elo.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(elo.this.i, this.d, $$2 + 2, $$3 + 12, 8421504, false);
         $$0.a(elo.this.i, this.e, $$2 + 2, $$3 + 12 + 10, 8421504, false);
      }

      @Override
      public sw a() {
         sw $$0 = sv.b(sw.b(this.b.b()), sw.b(elo.b(this.b)), elo.a(this.b));
         return sw.a("narrator.select", $$0);
      }
   }

   class b extends gam<elo.a> {
      public b() {
         super(elo.this.g, elo.this.h, elo.h(0), elo.this.h - 40, 36);
      }

      public void a(dyz $$0) {
         this.a((elo.a)(elo.this.new a($$0)));
      }

      @Override
      public int a() {
         return elo.this.N.size() * 36;
      }

      @Override
      public void a(eox $$0) {
         elo.this.a($$0);
      }

      public void a(@Nullable elo.a $$0) {
         super.a($$0);
         elo.this.O = this.i().indexOf($$0);
         elo.this.M.r = elo.this.O >= 0 && elo.this.O < this.k() && !elo.this.N.get(elo.this.O).i();
      }
   }
}
