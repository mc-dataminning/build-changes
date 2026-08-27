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

public class fav extends faz {
   static final agm b = new agm("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int k = 18;
   private static final int l = 20;
   private static final int m = 1;
   private static final int n = 1;
   private static final int o = 2;
   private static final int p = 2;
   private static final agl<ctd> q = ctk.b;
   public static final uv a = uv.c("flat_world_preset.unknown");
   private final ezv r;
   private uv t;
   private uv u;
   private fav.a v;
   private eve w;
   evn x;
   dvp y;

   public fav(ezv $$0) {
      super(uv.c("createWorld.customize.presets.title"));
      this.r = $$0;
   }

   @Nullable
   private static dvm a(ih<cvf> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dkw.c);
      int $$10 = $$9 - $$2;

      Optional<ig.c<cvf>> $$11;
      try {
         $$11 = $$0.a(agl.a(kd.e, new agm($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new dvm($$10, $$11.get().a());
      }
   }

   private static List<dvm> a(ih<cvf> $$0, String $$1) {
      List<dvm> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         dvm $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static dvp a(ih<cvf> $$0, ih<ctd> $$1, ih<dxs> $$2, ih<dwq> $$3, String $$4, dvp $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return dvp.a($$1, $$2, $$3);
      } else {
         List<dvm> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return dvp.a($$1, $$2, $$3);
         } else {
            ig.c<ctd> $$8 = $$1.b(q);
            ig<ctd> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(agm.a($$10)).map($$0x -> agl.a(kd.ar, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(dvp $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(agl::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aQ_() {
      this.t = uv.c("createWorld.customize.presets.share");
      this.u = uv.c("createWorld.customize.presets.list");
      this.x = new evn(this.i, 50, 40, this.g - 100, 20, this.t);
      this.x.l(1230);
      ffx $$0 = this.r.a.l().k();
      it $$1 = $$0.a();
      cgi $$2 = $$0.g().b();
      ih<ctd> $$3 = $$1.b(kd.ar);
      ih<dxs> $$4 = $$1.b(kd.aD);
      ih<dwq> $$5 = $$1.b(kd.aA);
      ih<cvf> $$6 = $$1.b(kd.e).a($$2);
      this.x.a(a(this.r.k()));
      this.y = this.r.k();
      this.e(this.x);
      this.v = new fav.a($$1, $$2);
      this.e(this.v);
      this.w = this.d(eve.a(uv.c("createWorld.customize.presets.select"), $$4x -> {
         dvp $$5x = a($$6, $$3, $$4, $$5, this.x.a(), this.y);
         this.r.a($$5x);
         this.f.a(this.r);
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a());
      this.d(eve.a(uu.e, $$0x -> this.f.a(this.r)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
      this.c(this.v.f() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.v.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(eti $$0, int $$1, int $$2) {
      String $$3 = this.x.a();
      this.b($$0, $$1, $$2);
      this.x.a($$3);
   }

   @Override
   public void aG_() {
      this.f.a(this.r);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
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

   class a extends ewa<fav.a.a> {
      public a(it $$0, cgi $$1) {
         super(fav.this.f, fav.this.g, fav.this.h, 80, fav.this.h - 37, 24);

         for (ig<dvn> $$2 : $$0.d(kd.ax).c(aro.a)) {
            Set<cvf> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fav.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fav.a.a($$2));
            }
         }
      }

      public void a(@Nullable fav.a.a $$0) {
         super.a($$0);
         fav.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (ezc.a($$0) && this.f() != null) {
               this.f().b();
            }

            return false;
         }
      }

      public class a extends ewa.a<fav.a.a> {
         private static final agm b = new agm("textures/gui/container/stats_icons.png");
         private final dvn c;
         private final uv d;

         public a(ig<dvn> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> uv.c($$0x.a().f("flat_world_preset"))).orElse(fav.a);
         }

         @Override
         public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(fav.this.i, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return true;
         }

         void b() {
            a.this.a(this);
            fav.this.y = this.c.b();
            fav.this.x.a(fav.a(fav.this.y));
            fav.this.x.b(false);
         }

         private void a(eut $$0, int $$1, int $$2, clj $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new clo($$3), $$1 + 2, $$2 + 2);
         }

         private void a(eut $$0, int $$1, int $$2) {
            $$0.a(fav.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public uv a() {
            return uv.a("narrator.select", this.d);
         }
      }
   }
}
