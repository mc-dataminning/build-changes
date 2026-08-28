import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpc extends hrm {
   private static final Logger b = LogUtils.getLogger();
   public static final xa a = xa.c("mco.upload.select.world.title");
   private static final xa c = xa.c("selectWorld.unable_to_load");
   static final xa C = xa.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fqd E;
   private final fpb F;
   private final long G;
   private final int H;
   ful I;
   List<ezw> J = Lists.newArrayList();
   int K = -1;
   fpc.b L;

   public fpc(@Nullable fqd $$0, long $$1, int $$2, fpb $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      ezv.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(ezw::v).collect(Collectors.toList());

      for (ezw $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aS_() {
      this.L = this.c(new fpc.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fos(c, xa.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(ful.a(xa.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(ful.a(wz.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hrl(xa.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hrl(xa.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xa i() {
      return wz.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         ezw $$0 = this.J.get(this.K);
         this.m.a(new fpi(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
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

   static xa a(ezw $$0) {
      return $$0.h().d();
   }

   static String b(ezw $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fvh.a<fpc.a> {
      private final ezw b;
      private final String c;
      private final xa d;
      private final xa e;

      public a(final ezw $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xa.a("mco.upload.entry.id", $$0.a(), fpc.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fpc.this.L.a(fpc.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(ftx $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fpc.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fpc.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fpc.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fpc.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public xa a() {
         xa $$0 = wz.b(xa.b(this.b.b()), xa.b(fpc.b(this.b)), fpc.a(this.b));
         return xa.a("narrator.select", $$0);
      }
   }

   class b extends fvh<fpc.a> {
      public b() {
         super(frd.Q(), fpc.this.n, fpc.this.o - 40 - fpc.g(0), fpc.g(0), 36);
      }

      public void a(ezw $$0) {
         this.b(fpc.this.new a($$0));
      }

      public void a(@Nullable fpc.a $$0) {
         super.a($$0);
         fpc.this.K = this.aI_().indexOf($$0);
         fpc.this.I.j = fpc.this.K >= 0 && fpc.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
