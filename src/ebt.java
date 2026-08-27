import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class ebt extends dzq {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final ebt.b l;
   private final ebt.a m;

   public ebt(edh $$0, hx $$1, ebt.b $$2, ebt.a $$3, ahg $$4, edg $$5, ddc $$6, dbm $$7, hx $$8) {
      super(dzx.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public ebt(edh $$0, sn $$1) {
      super(dzx.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = ebt.b.a($$1.l("VerticalPlacement"));
      this.m = (ebt.a)ebt.a.a.parse(new Dynamic(tb.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(dzw $$0, sn $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      ebt.a.a.encodeStart(tb.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static edc a(edh $$0, sn $$1, ahg $$2) {
      edg $$3 = $$0.a($$2);
      hx $$4 = new hx($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         dbm.valueOf($$1.l("Mirror")),
         ddc.valueOf($$1.l("Rotation")),
         ebt.b.a($$1.l("VerticalPlacement")),
         $$4,
         (ebt.a)ebt.a.a.parse(new Dynamic(tb.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static edc a(dbm $$0, ddc $$1, ebt.b $$2, hx $$3, ebt.a $$4) {
      eci $$5 = $$4.d ? eci.b : eci.d;
      List<ecv> $$6 = Lists.newArrayList();
      $$6.add(a(cws.ch, 0.3F, cws.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cws.dV, 0.07F, cws.kJ));
      }

      edc $$7 = new edc().a($$1).a($$0).a($$3).a($$5).a(new ecz($$6)).a(new ech($$4.c)).a(new ecw(ash.bH)).a(new ecp());
      if ($$4.g) {
         $$7.a(ecg.b);
      }

      return $$7;
   }

   private static ecv a(ebt.b $$0, ebt.a $$1) {
      if ($$0 == ebt.b.c) {
         return a(cws.H, cws.kJ);
      } else {
         return $$1.b ? a(cws.H, cws.dV) : a(cws.H, 0.2F, cws.kJ);
      }
   }

   @Override
   public void a(cuk $$0, cui $$1, dle $$2, auv $$3, dyy $$4, csw $$5, hx $$6) {
      dyy $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            hx.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (ctq)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, hx $$1, cue $$2, auv $$3, dyy $$4) {
   }

   private void a(auv $$0, ctq $$1, hx $$2) {
      djh $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cws.ff)) {
         ic $$4 = a($$0);
         hx $$5 = $$2.a($$4);
         djh $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cwq.a($$3.k($$1, $$2), $$4)) {
               djy $$7 = dfk.a($$4.g());
               $$1.a($$5, cws.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(auv $$0, ctq $$1, hx $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cws.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cws.aH.o().a(daz.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(auv $$0, ctq $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            hx $$4 = new hx($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(cws.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(auv $$0, ctq $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ic.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(auv $$0, ctq $$1) {
      boolean $$2 = this.l == ebt.b.a || this.l == ebt.b.c;
      hx $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      hx.a $$11 = hx.b.j();

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

   private boolean a(ctq $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      return !$$2.a(cws.a) && !$$2.a(cws.co) && !$$2.a(ash.bH) && (this.l == ebt.b.f || !$$2.a(cws.H));
   }

   private void d(auv $$0, ctq $$1, hx $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cws.kJ.o(), 3);
      } else {
         $$1.a($$2, cws.dV.o(), 3);
      }
   }

   private static int a(ctq $$0, int $$1, int $$2, ebt.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static doq.a a(ebt.b $$0) {
      return $$0 == ebt.b.c ? doq.a.c : doq.a.a;
   }

   private static ecv a(cwq $$0, float $$1, cwq $$2) {
      return new ecv(new ecx($$0, $$1), ece.b, $$2.o());
   }

   private static ecv a(cwq $$0, cwq $$1) {
      return new ecv(new ecj($$0), ece.b, $$1.o());
   }

   public static class a {
      public static final Codec<ebt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ebt.a::new)
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

   public static enum b implements avk {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final avk.a<ebt.b> g = avk.a(ebt.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static ebt.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
