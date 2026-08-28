import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flc extends hne {
   private static final Logger b = LogUtils.getLogger();
   public static final wv a = wv.c("mco.upload.select.world.title");
   private static final wv c = wv.c("selectWorld.unable_to_load");
   static final wv C = wv.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fmd E;
   private final flb F;
   private final long G;
   private final int H;
   fqn I;
   List<exa> J = Lists.newArrayList();
   int K = -1;
   flc.b L;

   public flc(@Nullable fmd $$0, long $$1, int $$2, flb $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      ewz.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(exa::v).collect(Collectors.toList());

      for (exa $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.L = this.c(new flc.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fks(c, wv.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fqn.a(wv.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fqn.a(wu.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hnd(wv.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hnd(wv.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wv i() {
      return wu.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         exa $$0 = this.J.get(this.K);
         this.m.a(new fli(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
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

   static wv a(exa $$0) {
      return $$0.h().d();
   }

   static String b(exa $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends frj.a<flc.a> {
      private final exa b;
      private final String c;
      private final wv d;
      private final wv e;

      public a(final exa $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wv.a("mco.upload.entry.id", $$0.a(), flc.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         flc.this.L.a(flc.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fpz $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = flc.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(flc.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(flc.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(flc.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wv a() {
         wv $$0 = wu.b(wv.b(this.b.b()), wv.b(flc.b(this.b)), flc.a(this.b));
         return wv.a("narrator.select", $$0);
      }
   }

   class b extends frj<flc.a> {
      public b() {
         super(fnd.Q(), flc.this.n, flc.this.o - 40 - flc.g(0), flc.g(0), 36);
      }

      public void a(exa $$0) {
         this.b(flc.this.new a($$0));
      }

      public void a(@Nullable flc.a $$0) {
         super.a($$0);
         flc.this.K = this.aD_().indexOf($$0);
         flc.this.I.j = flc.this.K >= 0 && flc.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
