import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdg extends gvi {
   private static final Logger b = LogUtils.getLogger();
   public static final xp a = xp.c("mco.upload.select.world.title");
   private static final xp c = xp.c("selectWorld.unable_to_load");
   static final xp B = xp.c("selectWorld.world");
   private static final xp C = xp.c("mco.upload.hardcore").b(-65536);
   private static final xp D = xp.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fej F;
   private final fdf G;
   private final long H;
   private final int I;
   fhg J;
   List<epz> K = Lists.newArrayList();
   int L = -1;
   fdg.b M;

   public fdg(@Nullable fej $$0, long $$1, int $$2, fdf $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void E() {
      epy.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(epz::v).collect(Collectors.toList());

      for (epz $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.M = this.c(new fdg.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fcu(c, xp.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fhg.a(xp.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fhg.a(xo.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new gvg(xp.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gvg(xp.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xp i() {
      return xo.a(this.n(), this.m());
   }

   private void F() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         epz $$0 = this.K.get(this.L);
         this.m.a(new fdm(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
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

   static xp a(epz $$0) {
      return $$0.h().d();
   }

   static String b(epz $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fic.a<fdg.a> {
      private final epz b;
      private final String c;
      private final xp d;
      private final xp e;

      public a(final epz $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xp.a("mco.upload.entry.id", $$0.a(), fdg.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdg.this.M.b(fdg.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fgt $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fdg.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fdg.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fdg.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fdg.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xp a() {
         xp $$0 = xo.b(xp.b(this.b.b()), xp.b(fdg.b(this.b)), fdg.a(this.b));
         return xp.a("narrator.select", $$0);
      }
   }

   class b extends gvh<fdg.a> {
      public b() {
         super(fdg.this.n, fdg.this.o - 40 - fdg.g(0), fdg.g(0), 36);
      }

      public void a(epz $$0) {
         this.a((fdg.a)(fdg.this.new a($$0)));
      }

      @Override
      public int a() {
         return fdg.this.K.size() * 36;
      }

      public void a(@Nullable fdg.a $$0) {
         super.a($$0);
         fdg.this.L = this.aD_().indexOf($$0);
         fdg.this.J.j = fdg.this.L >= 0 && fdg.this.L < this.l() && !fdg.this.K.get(fdg.this.L).i();
      }
   }
}
