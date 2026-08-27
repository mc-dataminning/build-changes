import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkp extends fkt {
   static final akf b = new akf("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int r = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private static final ake<dat> x = dba.b;
   public static final ws a = ws.c("flat_world_preset.unknown");
   private final fjo y;
   private ws z;
   private ws A;
   private fkp.a B;
   private feu C;
   ffd D;
   eej E;

   public fkp(fjo $$0) {
      super(ws.c("createWorld.customize.presets.title"));
      this.y = $$0;
   }

   @Nullable
   private static eeg a(iw<dcv> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, dtq.c);
      int $$10 = $$9 - $$2;

      Optional<iv.c<dcv>> $$11;
      try {
         $$11 = $$0.a(ake.a(ld.f, new akf($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new eeg($$10, $$11.get().a());
      }
   }

   private static List<eeg> a(iw<dcv> $$0, String $$1) {
      List<eeg> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         eeg $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static eej a(iw<dcv> $$0, iw<dat> $$1, iw<egm> $$2, iw<efk> $$3, String $$4, eej $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return eej.a($$1, $$2, $$3);
      } else {
         List<eeg> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return eej.a($$1, $$2, $$3);
         } else {
            iv.c<dat> $$8 = $$1.b(x);
            iv<dat> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(akf.a($$10)).map($$0x -> ake.a(ld.ay, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(eej $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(ake::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aM_() {
      this.z = ws.c("createWorld.customize.presets.share");
      this.A = ws.c("createWorld.customize.presets.list");
      this.D = new ffd(this.p, 50, 40, this.n - 100, 20, this.z);
      this.D.f(1230);
      fpr $$0 = this.y.a.m().k();
      jj $$1 = $$0.a();
      cmy $$2 = $$0.g().b();
      iw<dat> $$3 = $$1.b(ld.ay);
      iw<egm> $$4 = $$1.b(ld.aK);
      iw<efk> $$5 = $$1.b(ld.aH);
      iw<dcv> $$6 = $$1.b(ld.f).a($$2);
      this.D.a(a(this.y.l()));
      this.E = this.y.l();
      this.d(this.D);
      this.B = this.c(new fkp.a($$1, $$2));
      this.C = this.c(feu.a(ws.c("createWorld.customize.presets.select"), $$4x -> {
         eej $$5x = a($$6, $$3, $$4, $$5, this.D.a(), this.E);
         this.y.a($$5x);
         this.m.a(this.y);
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(feu.a(wr.e, $$0x -> this.m.a(this.y)).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.c(this.B.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.B.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fcu $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      $$0.b(this.p, this.z, 51, 30, 10526880);
      $$0.b(this.p, this.A, 51, 70, 10526880);
      $$0.c().b();
      this.D.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.C.j = $$0 || this.D.a().length() > 1;
   }

   class a extends ffq<fkp.a.a> {
      public a(jj $$0, cmy $$1) {
         super(fkp.this.m, fkp.this.n, fkp.this.o - 117, 80, 24);

         for (iv<eeh> $$2 : $$0.d(ld.aE).c(avs.a)) {
            Set<dcv> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fkp.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fkp.a.a($$2));
            }
         }
      }

      public void a(@Nullable fkp.a.a $$0) {
         super.a($$0);
         fkp.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fiv.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends ffq.a<fkp.a.a> {
         private static final akf b = new akf("textures/gui/container/stats_icons.png");
         private final eeh c;
         private final ws d;

         public a(iv<eeh> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> ws.c($$0x.a().f("flat_world_preset"))).orElse(fkp.a);
         }

         @Override
         public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fkp.this.p, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fkp.this.E = this.c.b();
            fkp.this.D.a(fkp.a(fkp.this.E));
            fkp.this.D.b(false);
         }

         private void a(feh $$0, int $$1, int $$2, cry $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new csd($$3), $$1 + 2, $$2 + 2);
         }

         private void a(feh $$0, int $$1, int $$2) {
            $$0.a(fkp.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public ws a() {
            return ws.a("narrator.select", this.d);
         }
      }
   }
}
