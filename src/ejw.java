import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ejw extends eht {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ejw.b l;
   private final ejw.a m;

   public ejw(elk $$0, io $$1, ejw.b $$2, ejw.a $$3, akm $$4, elj $$5, dkl $$6, div $$7, io $$8) {
      super(eia.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ejw(elk $$0, ud $$1) {
      super(eia.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ejw.b.a($$1.l("VerticalPlacement"));
      this.m = (ejw.a)ejw.a.a.parse(new Dynamic(ur.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ehz $$0, ud $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ejw.a.a.encodeStart(ur.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static elf a(elk $$0, ud $$1, akm $$2) {
      elj $$3 = $$0.a($$2);
      io $$4 = new io($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         div.valueOf($$1.l("Mirror")),
         dkl.valueOf($$1.l("Rotation")),
         ejw.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ejw.a)ejw.a.a.parse(new Dynamic(ur.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static elf a(div $$0, dkl $$1, ejw.b $$2, io $$3, ejw.a $$4) {
      ekl $$5 = $$4.d ? ekl.b : ekl.d;
      List<eky> $$6 = Lists.newArrayList();
      $$6.add(a(dea.ch, 0.3F, dea.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dea.dV, 0.07F, dea.kJ));
      }

      elf $$7 = new elf().a($$1).a($$0).a($$3).a($$5).a(new elc($$6)).a(new ekk($$4.c)).a(new ekz(avw.bO)).a(new eks());
      if ($$4.g) {
         $$7.a(ekj.b);
      }

      return $$7;
   }

   private static eky a(ejw.b $$0, ejw.a $$1) {
      if ($$0 == ejw.b.c) {
         return a(dea.H, dea.kJ);
      } else {
         return $$1.b ? a(dea.H, dea.dV) : a(dea.H, 0.2F, dea.kJ);
      }
   }

   @Override
   public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
      ehb $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            io.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (day)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, io $$1, dbm $$2, ayk $$3, ehb $$4) {
   }

   private void a(ayk $$0, day $$1, io $$2) {
      drb $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dea.ff)) {
         it $$4 = a($$0);
         io $$5 = $$2.a($$4);
         drb $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (ddy.a($$3.k($$1, $$2), $$4)) {
               drs $$7 = dmu.a($$4.g());
               $$1.a($$5, dea.ff.n().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(ayk $$0, day $$1, io $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dea.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dea.aH.n().a(dii.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(ayk $$0, day $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            io $$4 = new io($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dea.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(ayk $$0, day $$1, io $$2) {
      io.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(it.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(ayk $$0, day $$1) {
      boolean $$2 = this.l == ejw.b.a || this.l == ejw.b.c;
      io $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      io.a $$11 = io.c.j();

      for (int $$12 = $$4 - $$7; $$12 <= $$4 + $$7; $$12++) {
         for (int $$13 = $$5 - $$7; $$13 <= $$5 + $$7; $$13++) {
            int $$14 = Math.abs($$12 - $$4) + Math.abs($$13 - $$5);
            int $$15 = Math.max(0, $$14 + $$9);
            if ($$15 < $$7) {
               float $$16 = $$6[$$15];
               if ($$0.j() < (double)$$16) {
                  int $$17 = a($$1, $$12, $$13, this.l);
                  int $$18 = $$2 ? $$17 : Math.min(this.f.i(), $$17);
                  $$11.d($$12, $$18, $$13);
                  if (Math.abs($$18 - this.f.i()) <= 3 && this.a($$1, $$11)) {
                     this.d($$0, $$1, $$11);
                     if (this.m.e) {
                        this.b($$0, $$1, $$11);
                     }

                     this.c($$0, $$1, $$11.d());
                  }
               }
            }
         }
      }
   }

   private boolean a(day $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      return !$$2.a(dea.a) && !$$2.a(dea.co) && !$$2.a(avw.bO) && (this.l == ejw.b.f || !$$2.a(dea.H));
   }

   private void d(ayk $$0, day $$1, io $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dea.kJ.n(), 3);
      } else {
         $$1.a($$2, dea.dV.n(), 3);
      }
   }

   private static int a(day $$0, int $$1, int $$2, ejw.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dwt.a a(ejw.b $$0) {
      return $$0 == ejw.b.c ? dwt.a.c : dwt.a.a;
   }

   private static eky a(ddy $$0, float $$1, ddy $$2) {
      return new eky(new ela($$0, $$1), ekh.b, $$2.n());
   }

   private static eky a(ddy $$0, ddy $$1) {
      return new eky(new ekm($$0), ekh.b, $$1.n());
   }

   public static class a {
      public static final Codec<ejw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ejw.a::new)
      );
      public boolean b;
      public float c;
      public boolean d;
      public boolean e;
      public boolean f;
      public boolean g;

      public a() {
      }

      public a(boolean $$0, float $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }
   }

   public static enum b implements ayx {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayx.a<ejw.b> g = ayx.a(ejw.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ejw.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
