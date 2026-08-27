import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fei extends gxb {
   private static final Logger b = LogUtils.getLogger();
   public static final xe a = xe.c("mco.upload.select.world.title");
   private static final xe c = xe.c("selectWorld.unable_to_load");
   static final xe B = xe.c("selectWorld.world");
   private static final xe C = xe.c("mco.upload.hardcore").b(-65536);
   private static final xe D = xe.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final ffl F;
   private final feh G;
   private final long H;
   private final int I;
   fin J;
   List<erg> K = Lists.newArrayList();
   int L = -1;
   fei.b M;

   public fei(@Nullable ffl $$0, long $$1, int $$2, feh $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void C() {
      erf.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(erg::v).collect(Collectors.toList());

      for (erg $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.M = this.c(new fei.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fdw(c, xe.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fin.a(xe.c("mco.upload.button.name"), $$0 -> this.D()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fin.a(xd.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new gwz(xe.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gwz(xe.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xe i() {
      return xd.a(this.n(), this.B());
   }

   private void D() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         erg $$0 = this.K.get(this.L);
         this.m.a(new feo(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
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

   static xe a(erg $$0) {
      return $$0.h().d();
   }

   static String b(erg $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fjj.a<fei.a> {
      private final erg b;
      private final String c;
      private final xe d;
      private final xe e;

      public a(erg $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xe.a("mco.upload.entry.id", $$0.a(), fei.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fei.this.M.b(fei.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fia $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fei.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fei.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fei.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fei.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xe a() {
         xe $$0 = xd.b(xe.b(this.b.b()), xe.b(fei.b(this.b)), fei.a(this.b));
         return xe.a("narrator.select", $$0);
      }
   }

   class b extends gxa<fei.a> {
      public b() {
         super(fei.this.n, fei.this.o - 40 - fei.g(0), fei.g(0), 36);
      }

      public void a(erg $$0) {
         this.a((fei.a)(fei.this.new a($$0)));
      }

      @Override
      public int a() {
         return fei.this.K.size() * 36;
      }

      public void a(@Nullable fei.a $$0) {
         super.a($$0);
         fei.this.L = this.aE_().indexOf($$0);
         fei.this.J.j = fei.this.L >= 0 && fei.this.L < this.l() && !fei.this.K.get(fei.this.L).i();
      }
   }
}
