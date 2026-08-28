import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class eld extends eja {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final eld.b l;
   private final eld.a m;

   public eld(emr $$0, ja $$1, eld.b $$2, eld.a $$3, akk $$4, emq $$5, dls $$6, dkc $$7, ja $$8) {
      super(ejh.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public eld(emr $$0, tx $$1) {
      super(ejh.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = eld.b.a($$1.l("VerticalPlacement"));
      this.m = (eld.a)eld.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow();
   }

   @Override
   protected void a(ejg $$0, tx $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      eld.a.a.encodeStart(ul.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static emm a(emr $$0, tx $$1, akk $$2) {
      emq $$3 = $$0.a($$2);
      ja $$4 = new ja($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dkc.valueOf($$1.l("Mirror")),
         dls.valueOf($$1.l("Rotation")),
         eld.b.a($$1.l("VerticalPlacement")),
         $$4,
         (eld.a)eld.a.a.parse(new Dynamic(ul.a, $$1.c("Properties"))).getPartialOrThrow()
      );
   }

   private static emm a(dkc $$0, dls $$1, eld.b $$2, ja $$3, eld.a $$4) {
      els $$5 = $$4.d ? els.b : els.d;
      List<emf> $$6 = Lists.newArrayList();
      $$6.add(a(dfh.ch, 0.3F, dfh.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(dfh.dV, 0.07F, dfh.kJ));
      }

      emm $$7 = new emm().a($$1).a($$0).a($$3).a($$5).a(new emj($$6)).a(new elr($$4.c)).a(new emg(avu.bO)).a(new elz());
      if ($$4.g) {
         $$7.a(elq.b);
      }

      return $$7;
   }

   private static emf a(eld.b $$0, eld.a $$1) {
      if ($$0 == eld.b.c) {
         return a(dfh.H, dfh.kJ);
      } else {
         return $$1.b ? a(dfh.H, dfh.dV) : a(dfh.H, 0.2F, dfh.kJ);
      }
   }

   @Override
   public void a(dcz $$0, dcx $$1, due $$2, aym $$3, eii $$4, dbk $$5, ja $$6) {
      eii $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            ja.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (dce)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, ja $$1, dcs $$2, aym $$3, eii $$4) {
   }

   private void a(aym $$0, dce $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(dfh.ff)) {
         jf $$4 = a($$0);
         ja $$5 = $$2.a($$4);
         dsh $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (dff.a($$3.k($$1, $$2), $$4)) {
               dsy $$7 = dob.a($$4.g());
               $$1.a($$5, dfh.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(aym $$0, dce $$1, ja $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(dfh.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), dfh.aH.o().a(djp.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(aym $$0, dce $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            ja $$4 = new ja($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(dfh.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(aym $$0, dce $$1, ja $$2) {
      ja.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(jf.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(aym $$0, dce $$1) {
      boolean $$2 = this.l == eld.b.a || this.l == eld.b.c;
      ja $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      ja.a $$11 = ja.c.j();

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

   private boolean a(dce $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      return !$$2.a(dfh.a) && !$$2.a(dfh.co) && !$$2.a(avu.bO) && (this.l == eld.b.f || !$$2.a(dfh.H));
   }

   private void d(aym $$0, dce $$1, ja $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, dfh.kJ.o(), 3);
      } else {
         $$1.a($$2, dfh.dV.o(), 3);
      }
   }

   private static int a(dce $$0, int $$1, int $$2, eld.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dxz.a a(eld.b $$0) {
      return $$0 == eld.b.c ? dxz.a.c : dxz.a.a;
   }

   private static emf a(dff $$0, float $$1, dff $$2) {
      return new emf(new emh($$0, $$1), elo.b, $$2.o());
   }

   private static emf a(dff $$0, dff $$1) {
      return new emf(new elt($$0), elo.b, $$1.o());
   }

   public static class a {
      public static final Codec<eld.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, eld.a::new)
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

   public static enum b implements ayz {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final ayz.a<eld.b> g = ayz.a(eld.b::values);
      private final String h;

      private b(final String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static eld.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
