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

public class eza extends ezd {
   static final afw b = new afw("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final afv<crx> q = cse.b;
   public static final ui a = ui.c("flat_world_preset.unknown");
   private final eya s;
   private ui t;
   private ui u;
   private eza.a v;
   private etj w;
   ets x;
   dud y;

   public eza(eya $$0) {
      super(ui.c("createWorld.customize.presets.title"));
      this.s = $$0;
   }

   @Nullable
   private static dua a(ic<cua> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, djk.c);
      int $$10 = $$9 - $$2;

      Optional<ib.c<cua>> $$11;
      try {
         $$11 = $$0.a(afv.a(jz.e, new afw($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dua($$10, $$11.get().a());
      }
   }

   private static List<dua> a(ic<cua> $$0, String $$1) {
      List<dua> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dua $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dud a(ic<cua> $$0, ic<crx> $$1, ic<dwg> $$2, ic<dve> $$3, String $$4, dud $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dud.a($$1, $$2, $$3);
      } else {
         List<dua> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dud.a($$1, $$2, $$3);
         } else {
            ib.c<crx> $$8 = $$1.b(q);
            ib<crx> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(afw.a($$10)).map($$0x -> afv.a(jz.aq, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dud $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(afv::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aM_() {
      this.t = ui.c("createWorld.customize.presets.share");
      this.u = ui.c("createWorld.customize.presets.list");
      this.x = new ets(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.l(1230);
      fea $$0 = this.s.a.l().k();
      ip $$1 = $$0.a();
      cfg $$2 = $$0.g().b();
      ic<crx> $$3 = $$1.b(jz.aq);
      ic<dwg> $$4 = $$1.b(jz.aC);
      ic<dve> $$5 = $$1.b(jz.az);
      ic<cua> $$6 = $$1.b(jz.e).a($$2);
      this.x.a(a(this.s.k()));
      this.y = this.s.k();
      this.e(this.x);
      this.v = new eza.a($$1, $$2);
      this.e(this.v);
      this.w = this.d(etj.a(ui.c("createWorld.customize.presets.select"), $$4x -> {
         dud $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.s.a($$5x);
         this.f.a(this.s);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(etj.a(uh.e, $$0x -> this.f.a(this.s)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ero $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void aC_() {
      this.f.a(this.s);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.v.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      $$0.b(this.i, this.t, 51, 30, 10526880);
      $$0.b(this.i, this.u, 51, 70, 10526880);
      $$0.c().b();
      this.x.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.w.i = $$0 || this.x.a().length() > 1;
   }

   class a extends euf<eza.a.a> {
      public a(ip $$0, cfg $$1) {
         super(eza.this.f, eza.this.g, eza.this.h, 80, eza.this.h - 37, 24);

         for (ib<dub> $$2 : $$0.d(jz.aw).c(aqw.a)) {
            Set<cua> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               eza.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new eza.a.a($$2));
            }
         }
      }

      public void a(@Nullable eza.a.a $$0) {
         super.a($$0);
         eza.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (exh.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends euf.a<eza.a.a> {
         private static final afw b = new afw("textures/gui/container/stats_icons.png");
         private final dub c;
         private final ui d;

         public a(ib<dub> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> ui.c($$0x.a().f("flat_world_preset"))).orElse(eza.a);
         }

         @Override
         public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(eza.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return true;
         }

         void b() {
            a.this.a(this);
            eza.this.y = this.c.b();
            eza.this.x.a(eza.a(eza.this.y));
            eza.this.x.b(false);
         }

         private void a(esy $$0, int $$1, int $$2, cke $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new ckj($$3), $$1 + 2, $$2 + 2);
         }

         private void a(esy $$0, int $$1, int $$2) {
            $$0.a(eza.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public ui a() {
            return ui.a("narrator.select", this.d);
         }
      }
   }
}
