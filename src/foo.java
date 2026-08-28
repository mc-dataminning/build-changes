import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foo extends hrc {
   private static final Logger b = LogUtils.getLogger();
   public static final xg a = xg.c("mco.upload.select.world.title");
   private static final xg c = xg.c("selectWorld.unable_to_load");
   static final xg C = xg.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fpq E;
   private final fon F;
   private final long G;
   private final int H;
   fty I;
   List<fai> J = Lists.newArrayList();
   int K = -1;
   foo.b L;

   public foo(@Nullable fpq $$0, long $$1, int $$2, fon $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      fah.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(fai::v).collect(Collectors.toList());

      for (fai $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.L = this.c(new foo.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new foe(c, xg.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fty.a(xg.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fty.a(xf.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hrb(xg.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hrb(xg.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xg i() {
      return xf.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         fai $$0 = this.J.get(this.K);
         this.m.a(new fov(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
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

   static xg a(fai $$0) {
      return $$0.h().d();
   }

   static String b(fai $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fuu.a<foo.a> {
      private final fai b;
      private final String c;
      private final xg d;
      private final xg e;

      public a(final fai $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xg.a("mco.upload.entry.id", $$0.a(), foo.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         foo.this.L.a(foo.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(ftk $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = foo.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(foo.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(foo.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(foo.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public xg a() {
         xg $$0 = xf.b(xg.b(this.b.b()), xg.b(foo.b(this.b)), foo.a(this.b));
         return xg.a("narrator.select", $$0);
      }
   }

   class b extends fuu<foo.a> {
      public b() {
         super(fqq.Q(), foo.this.n, foo.this.o - 40 - foo.g(0), foo.g(0), 36);
      }

      public void a(fai $$0) {
         this.b(foo.this.new a($$0));
      }

      public void a(@Nullable foo.a $$0) {
         super.a($$0);
         foo.this.K = this.aJ_().indexOf($$0);
         foo.this.I.j = foo.this.K >= 0 && foo.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
