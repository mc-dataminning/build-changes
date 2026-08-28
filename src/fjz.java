import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjz extends hhs {
   private static final Logger b = LogUtils.getLogger();
   public static final xk a = xk.c("mco.upload.select.world.title");
   private static final xk c = xk.c("selectWorld.unable_to_load");
   static final xk C = xk.c("selectWorld.world");
   private static final xk D = xk.c("mco.upload.hardcore").b(-65536);
   private static final xk E = xk.c("selectWorld.commands");
   private static final DateFormat F = new SimpleDateFormat();
   @Nullable
   private final fla G;
   private final fjy H;
   private final long I;
   private final int J;
   fny K;
   List<evx> L = Lists.newArrayList();
   int M = -1;
   fjz.b N;

   public fjz(@Nullable fla $$0, long $$1, int $$2, fjy $$3) {
      super(a);
      this.G = $$0;
      this.H = $$3;
      this.I = $$1;
      this.J = $$2;
   }

   private void E() {
      evw.a $$0 = this.m.m().b();
      this.L = this.m.m().a($$0).join().stream().filter(evx::v).collect(Collectors.toList());

      for (evx $$1 : this.L) {
         this.N.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.N = this.c(new fjz.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fjp(c, xk.a(var2.getMessage()), this.H));
         return;
      }

      this.K = this.c(fny.a(xk.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.K.j = this.M >= 0 && this.M < this.L.size();
      this.c(fny.a(xj.k, $$0 -> this.m.a(this.H)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hhr(xk.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.L.isEmpty()) {
         this.a(new hhr(xk.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xk i() {
      return xj.a(this.m(), this.l());
   }

   private void F() {
      if (this.M != -1 && !this.L.get(this.M).i()) {
         evx $$0 = this.L.get(this.M);
         this.m.a(new fkf(this.G, this.I, this.J, this.H, $$0));
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.H);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xk a(evx $$0) {
      return $$0.h().d();
   }

   static String b(evx $$0) {
      return F.format(new Date($$0.f()));
   }

   class a extends fov.a<fjz.a> {
      private final evx b;
      private final String c;
      private final xk d;
      private final xk e;

      public a(final evx $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xk.a("mco.upload.entry.id", $$0.a(), fjz.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fjz.this.N.a(fjz.this.L.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fnl $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fjz.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fjz.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fjz.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fjz.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public xk a() {
         xk $$0 = xj.b(xk.b(this.b.b()), xk.b(fjz.b(this.b)), fjz.a(this.b));
         return xk.a("narrator.select", $$0);
      }
   }

   class b extends fov<fjz.a> {
      public b() {
         super(flz.Q(), fjz.this.n, fjz.this.o - 40 - fjz.g(0), fjz.g(0), 36);
      }

      public void a(evx $$0) {
         this.b(fjz.this.new a($$0));
      }

      public void a(@Nullable fjz.a $$0) {
         super.a($$0);
         fjz.this.M = this.aI_().indexOf($$0);
         fjz.this.K.j = fjz.this.M >= 0 && fjz.this.M < this.k() && !fjz.this.L.get(fjz.this.M).i();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
