import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmx extends hpj {
   private static final Logger b = LogUtils.getLogger();
   public static final wy a = wy.c("mco.upload.select.world.title");
   private static final wy c = wy.c("selectWorld.unable_to_load");
   static final wy C = wy.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fny E;
   private final fmw F;
   private final long G;
   private final int H;
   fsj I;
   List<eyw> J = Lists.newArrayList();
   int K = -1;
   fmx.b L;

   public fmx(@Nullable fny $$0, long $$1, int $$2, fmw $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      eyv.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(eyw::v).collect(Collectors.toList());

      for (eyw $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aO_() {
      this.L = this.c(new fmx.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fmn(c, wy.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fsj.a(wy.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fsj.a(wx.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hpi(wy.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hpi(wy.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         eyw $$0 = this.J.get(this.K);
         this.m.a(new fnd(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.F);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wy a(eyw $$0) {
      return $$0.h().d();
   }

   static String b(eyw $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends ftf.a<fmx.a> {
      private final eyw b;
      private final String c;
      private final wy d;
      private final wy e;

      public a(final eyw $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wy.a("mco.upload.entry.id", $$0.a(), fmx.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmx.this.L.a(fmx.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(frv $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fmx.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fmx.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fmx.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fmx.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.b.b()), wy.b(fmx.b(this.b)), fmx.a(this.b));
         return wy.a("narrator.select", $$0);
      }
   }

   class b extends ftf<fmx.a> {
      public b() {
         super(foz.Q(), fmx.this.n, fmx.this.o - 40 - fmx.g(0), fmx.g(0), 36);
      }

      public void a(eyw $$0) {
         this.b(fmx.this.new a($$0));
      }

      public void a(@Nullable fmx.a $$0) {
         super.a($$0);
         fmx.this.K = this.aE_().indexOf($$0);
         fmx.this.I.j = fmx.this.K >= 0 && fmx.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
