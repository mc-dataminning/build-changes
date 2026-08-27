import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fat extends gsq {
   private static final Logger b = LogUtils.getLogger();
   public static final ws a = ws.c("mco.upload.select.world.title");
   private static final ws c = ws.c("selectWorld.unable_to_load");
   static final ws B = ws.c("selectWorld.world");
   private static final ws C = ws.c("mco.upload.hardcore").b(-65536);
   private static final ws D = ws.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fbw F;
   private final fas G;
   private final long H;
   private final int I;
   feu J;
   List<enr> K = Lists.newArrayList();
   int L = -1;
   fat.b M;

   public fat(@Nullable fbw $$0, long $$1, int $$2, fas $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void C() {
      enq.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(enr::v).collect(Collectors.toList());

      for (enr $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.M = this.c(new fat.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fah(c, ws.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(feu.a(ws.c("mco.upload.button.name"), $$0 -> this.D()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(feu.a(wr.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new gso(ws.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gso(ws.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public ws i() {
      return wr.a(this.n(), this.m());
   }

   private void D() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         enr $$0 = this.K.get(this.L);
         this.m.a(new faz(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.G);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static ws a(enr $$0) {
      return $$0.h().d();
   }

   static String b(enr $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends ffq.a<fat.a> {
      private final enr b;
      private final String c;
      private final ws d;
      private final ws e;

      public a(enr $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = ws.a("mco.upload.entry.id", $$0.a(), fat.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fat.this.M.b(fat.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(feh $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fat.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fat.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fat.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fat.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public ws a() {
         ws $$0 = wr.b(ws.b(this.b.b()), ws.b(fat.b(this.b)), fat.a(this.b));
         return ws.a("narrator.select", $$0);
      }
   }

   class b extends gsp<fat.a> {
      public b() {
         super(fat.this.n, fat.this.o - 40 - fat.g(0), fat.g(0), 36);
      }

      public void a(enr $$0) {
         this.a((fat.a)(fat.this.new a($$0)));
      }

      @Override
      public int a() {
         return fat.this.K.size() * 36;
      }

      public void a(@Nullable fat.a $$0) {
         super.a($$0);
         fat.this.L = this.aE_().indexOf($$0);
         fat.this.J.j = fat.this.L >= 0 && fat.this.L < this.l() && !fat.this.K.get(fat.this.L).i();
      }
   }
}
