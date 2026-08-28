import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class feg extends gwj {
   private static final Logger b = LogUtils.getLogger();
   public static final wy a = wy.c("mco.upload.select.world.title");
   private static final wy c = wy.c("selectWorld.unable_to_load");
   static final wy A = wy.c("selectWorld.world");
   private static final wy B = wy.c("mco.upload.hardcore").b(-65536);
   private static final wy C = wy.c("selectWorld.commands");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final ffj E;
   private final fef F;
   private final long G;
   private final int H;
   fig I;
   List<era> J = Lists.newArrayList();
   int K = -1;
   feg.b L;

   public feg(@Nullable ffj $$0, long $$1, int $$2, fef $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void D() {
      eqz.a $$0 = this.l.m().b();
      this.J = this.l.m().a($$0).join().stream().filter(era::v).collect(Collectors.toList());

      for (era $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aP_() {
      this.L = this.c(new feg.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.l.a(new fdv(c, wy.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fig.a(wy.c("mco.upload.button.name"), $$0 -> this.E()).a(this.m / 2 - 154, this.n - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fig.a(wx.k, $$0 -> this.l.a(this.F)).a(this.m / 2 + 6, this.n - 32, 153, 20).a());
      this.a(new gwh(wy.c("mco.upload.select.world.subtitle"), this.m / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new gwh(wy.c("mco.upload.select.world.none"), this.m / 2, this.n / 2 - 20, -1));
      }
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.m());
   }

   private void E() {
      if (this.K != -1 && !this.J.get(this.K).i()) {
         era $$0 = this.J.get(this.K);
         this.l.a(new fem(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.F);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wy a(era $$0) {
      return $$0.h().d();
   }

   static String b(era $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fjc.a<feg.a> {
      private final era b;
      private final String c;
      private final wy d;
      private final wy e;

      public a(final era $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wy.a("mco.upload.entry.id", $$0.a(), feg.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         feg.this.L.b(feg.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fht $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = feg.A + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(feg.this.o, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(feg.this.o, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(feg.this.o, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.b.b()), wy.b(feg.b(this.b)), feg.a(this.b));
         return wy.a("narrator.select", $$0);
      }
   }

   class b extends gwi<feg.a> {
      public b() {
         super(feg.this.m, feg.this.n - 40 - feg.g(0), feg.g(0), 36);
      }

      public void a(era $$0) {
         this.a((feg.a)(feg.this.new a($$0)));
      }

      @Override
      public int a() {
         return feg.this.J.size() * 36;
      }

      public void a(@Nullable feg.a $$0) {
         super.a($$0);
         feg.this.K = this.aG_().indexOf($$0);
         feg.this.I.j = feg.this.K >= 0 && feg.this.K < this.l() && !feg.this.J.get(feg.this.K).i();
      }
   }
}
