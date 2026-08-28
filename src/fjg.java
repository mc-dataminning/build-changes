import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjg extends hky {
   private static final Logger b = LogUtils.getLogger();
   public static final wo a = wo.c("mco.upload.select.world.title");
   private static final wo c = wo.c("selectWorld.unable_to_load");
   static final wo C = wo.c("selectWorld.world");
   private static final wo D = wo.c("mco.upload.hardcore").b(-65536);
   private static final wo E = wo.c("selectWorld.commands");
   private static final DateFormat F = new SimpleDateFormat();
   @Nullable
   private final fkh G;
   private final fjf H;
   private final long I;
   private final int J;
   fop K;
   List<eve> L = Lists.newArrayList();
   int M = -1;
   fjg.b N;

   public fjg(@Nullable fkh $$0, long $$1, int $$2, fjf $$3) {
      super(a);
      this.G = $$0;
      this.H = $$3;
      this.I = $$1;
      this.J = $$2;
   }

   private void E() {
      evd.a $$0 = this.m.m().b();
      this.L = this.m.m().a($$0).join().stream().filter(eve::v).collect(Collectors.toList());

      for (eve $$1 : this.L) {
         this.N.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.N = this.c(new fjg.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fiw(c, wo.a(var2.getMessage()), this.H));
         return;
      }

      this.K = this.c(fop.a(wo.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.K.j = this.M >= 0 && this.M < this.L.size();
      this.c(fop.a(wn.k, $$0 -> this.m.a(this.H)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hkx(wo.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.L.isEmpty()) {
         this.a(new hkx(wo.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wo i() {
      return wn.a(this.n(), this.m());
   }

   private void F() {
      if (this.M != -1 && !this.L.get(this.M).i()) {
         eve $$0 = this.L.get(this.M);
         this.m.a(new fjm(this.G, this.I, this.J, this.H, $$0));
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
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

   static wo a(eve $$0) {
      return $$0.h().d();
   }

   static String b(eve $$0) {
      return F.format(new Date($$0.f()));
   }

   class a extends fpm.a<fjg.a> {
      private final eve b;
      private final String c;
      private final wo d;
      private final wo e;

      public a(final eve $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wo.a("mco.upload.entry.id", $$0.a(), fjg.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fjg.this.N.a(fjg.this.L.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fob $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fjg.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fjg.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fjg.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fjg.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wo a() {
         wo $$0 = wn.b(wo.b(this.b.b()), wo.b(fjg.b(this.b)), fjg.a(this.b));
         return wo.a("narrator.select", $$0);
      }
   }

   class b extends fpm<fjg.a> {
      public b() {
         super(flh.Q(), fjg.this.n, fjg.this.o - 40 - fjg.g(0), fjg.g(0), 36);
      }

      public void a(eve $$0) {
         this.b(fjg.this.new a($$0));
      }

      public void a(@Nullable fjg.a $$0) {
         super.a($$0);
         fjg.this.M = this.aH_().indexOf($$0);
         fjg.this.K.j = fjg.this.M >= 0 && fjg.this.M < this.t() && !fjg.this.L.get(fjg.this.M).i();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
