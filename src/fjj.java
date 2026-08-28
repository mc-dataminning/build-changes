import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjj extends hlf {
   private static final Logger b = LogUtils.getLogger();
   public static final wp a = wp.c("mco.upload.select.world.title");
   private static final wp c = wp.c("selectWorld.unable_to_load");
   static final wp C = wp.c("selectWorld.world");
   private static final wp D = wp.c("mco.upload.hardcore").b(-65536);
   private static final wp E = wp.c("selectWorld.commands");
   private static final DateFormat F = new SimpleDateFormat();
   @Nullable
   private final fkk G;
   private final fji H;
   private final long I;
   private final int J;
   fou K;
   List<evh> L = Lists.newArrayList();
   int M = -1;
   fjj.b N;

   public fjj(@Nullable fkk $$0, long $$1, int $$2, fji $$3) {
      super(a);
      this.G = $$0;
      this.H = $$3;
      this.I = $$1;
      this.J = $$2;
   }

   private void E() {
      evg.a $$0 = this.m.m().b();
      this.L = this.m.m().a($$0).join().stream().filter(evh::v).collect(Collectors.toList());

      for (evh $$1 : this.L) {
         this.N.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.N = this.c(new fjj.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fiz(c, wp.a(var2.getMessage()), this.H));
         return;
      }

      this.K = this.c(fou.a(wp.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.K.j = this.M >= 0 && this.M < this.L.size();
      this.c(fou.a(wo.k, $$0 -> this.m.a(this.H)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hle(wp.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.L.isEmpty()) {
         this.a(new hle(wp.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wp i() {
      return wo.a(this.n(), this.m());
   }

   private void F() {
      if (this.M != -1 && !this.L.get(this.M).i()) {
         evh $$0 = this.L.get(this.M);
         this.m.a(new fjp(this.G, this.I, this.J, this.H, $$0));
      }
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
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

   static wp a(evh $$0) {
      return $$0.h().d();
   }

   static String b(evh $$0) {
      return F.format(new Date($$0.f()));
   }

   class a extends fpq.a<fjj.a> {
      private final evh b;
      private final String c;
      private final wp d;
      private final wp e;

      public a(final evh $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wp.a("mco.upload.entry.id", $$0.a(), fjj.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fof $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fjj.this.N.a(fjj.this.L.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fof $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fjj.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fjj.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fjj.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fjj.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wp a() {
         wp $$0 = wo.b(wp.b(this.b.b()), wp.b(fjj.b(this.b)), fjj.a(this.b));
         return wp.a("narrator.select", $$0);
      }
   }

   class b extends fpq<fjj.a> {
      public b() {
         super(flk.Q(), fjj.this.n, fjj.this.o - 40 - fjj.g(0), fjj.g(0), 36);
      }

      public void a(evh $$0) {
         this.b(fjj.this.new a($$0));
      }

      public void a(@Nullable fjj.a $$0) {
         super.a($$0);
         fjj.this.M = this.aH_().indexOf($$0);
         fjj.this.K.j = fjj.this.M >= 0 && fjj.this.M < this.t() && !fjj.this.L.get(fjj.this.M).i();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
