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

public class foj extends fon {
   static final akt b = new akt("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int r = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   private static final aks<dcz> x = ddg.b;
   public static final xe a = xe.c("flat_world_preset.unknown");
   private final fnh y;
   private xe z;
   private xe A;
   private foj.a B;
   private fin C;
   fiw D;
   ehv E;

   public foj(fnh $$0) {
      super(xe.c("createWorld.customize.presets.title"));
      this.y = $$0;
   }

   @Nullable
   private static ehs a(jb<dfc> $$0, String $$1, int $$2) {
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

      int $$9 = Math.min($$2 + $$5, dwu.c);
      int $$10 = $$9 - $$2;

      Optional<ja.c<dfc>> $$11;
      try {
         $$11 = $$0.a(aks.a(li.f, new akt($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new ehs($$10, $$11.get().a());
      }
   }

   private static List<ehs> a(jb<dfc> $$0, String $$1) {
      List<ehs> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         ehs $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static ehv a(jb<dfc> $$0, jb<dcz> $$1, jb<ejz> $$2, jb<eix> $$3, String $$4, ehv $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return ehv.a($$1, $$2, $$3);
      } else {
         List<ehs> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return ehv.a($$1, $$2, $$3);
         } else {
            ja.c<dcz> $$8 = $$1.b(x);
            ja<dcz> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(akt.a($$10)).map($$0x -> aks.a(li.az, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(ehv $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(aks::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aN_() {
      this.z = xe.c("createWorld.customize.presets.share");
      this.A = xe.c("createWorld.customize.presets.list");
      this.D = new fiw(this.p, 50, 40, this.n - 100, 20, this.z);
      this.D.f(1230);
      ftp $$0 = this.y.a.B().k();
      jo $$1 = $$0.a();
      cop $$2 = $$0.g().b();
      jb<dcz> $$3 = $$1.b(li.az);
      jb<ejz> $$4 = $$1.b(li.aL);
      jb<eix> $$5 = $$1.b(li.aI);
      jb<dfc> $$6 = $$1.b(li.f).a($$2);
      this.D.a(a(this.y.l()));
      this.E = this.y.l();
      this.d(this.D);
      this.B = this.c(new foj.a($$1, $$2));
      this.C = this.c(fin.a(xe.c("createWorld.customize.presets.select"), $$4x -> {
         ehv $$5x = a($$6, $$3, $$4, $$5, this.D.a(), this.E);
         this.y.a($$5x);
         this.m.a(this.y);
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fin.a(xd.e, $$0x -> this.m.a(this.y)).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.c(this.B.h() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.B.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fgj $$0, int $$1, int $$2) {
      String $$3 = this.D.a();
      this.b($$0, $$1, $$2);
      this.D.a($$3);
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
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

   class a extends fjj<foj.a.a> {
      public a(jo $$0, cop $$1) {
         super(foj.this.m, foj.this.n, foj.this.o - 117, 80, 24);

         for (ja<eht> $$2 : $$0.d(li.aF).c(awi.a)) {
            Set<dfc> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               foj.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new foj.a.a($$2));
            }
         }
      }

      public void a(@Nullable foj.a.a $$0) {
         super.a($$0);
         foj.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fmo.a($$0) && this.h() != null) {
               this.h().b();
            }

            return false;
         }
      }

      public class a extends fjj.a<foj.a.a> {
         private static final akt b = new akt("textures/gui/container/stats_icons.png");
         private final eht c;
         private final xe d;

         public a(ja<eht> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> xe.c($$0x.a().f("flat_world_preset"))).orElse(foj.a);
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.a(foj.this.p, this.d, $$3 + 18 + 5, $$2 + 6, 16777215, false);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            foj.this.E = this.c.b();
            foj.this.D.a(foj.a(foj.this.E));
            foj.this.D.b(false);
         }

         private void a(fia $$0, int $$1, int $$2, cuc $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new cuh($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fia $$0, int $$1, int $$2) {
            $$0.a(foj.b, $$1, $$2, 0, 18, 18);
         }

         @Override
         public xe a() {
            return xe.a("narrator.select", this.d);
         }
      }
   }
}
