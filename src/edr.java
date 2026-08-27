import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class edr extends ebo {
   private static final Logger h = LogUtils.getLogger();
   private static final float i = 0.3F;
   private static final float j = 0.07F;
   private static final float k = 0.2F;
   private final edr.b l;
   private final edr.a m;

   public edr(eff $$0, hz $$1, edr.b $$2, edr.a $$3, aiy $$4, efe $$5, dfa $$6, ddk $$7, hz $$8) {
      super(ebv.J, 0, $$0, $$4, $$4.toString(), a($$7, $$6, $$2, $$8, $$3), $$1);
      this.l = $$2;
      this.m = $$3;
   }

   public edr(eff $$0, sw $$1) {
      super(ebv.J, $$1, $$0, $$2 -> a($$0, $$1, $$2));
      this.l = edr.b.a($$1.l("VerticalPlacement"));
      this.m = (edr.a)edr.a.a.parse(new Dynamic(tk.a, $$1.c("Properties"))).getOrThrow(true, h::error);
   }

   @Override
   protected void a(ebu $$0, sw $$1) {
      super.a($$0, $$1);
      $$1.a("Rotation", this.c.d().name());
      $$1.a("Mirror", this.c.c().name());
      $$1.a("VerticalPlacement", this.l.a());
      edr.a.a.encodeStart(tk.a, this.m).resultOrPartial(h::error).ifPresent($$1x -> $$1.a("Properties", $$1x));
   }

   private static efa a(eff $$0, sw $$1, aiy $$2) {
      efe $$3 = $$0.a($$2);
      hz $$4 = new hz($$3.a().u() / 2, 0, $$3.a().w() / 2);
      return a(
         ddk.valueOf($$1.l("Mirror")),
         dfa.valueOf($$1.l("Rotation")),
         edr.b.a($$1.l("VerticalPlacement")),
         $$4,
         (edr.a)edr.a.a.parse(new Dynamic(tk.a, $$1.c("Properties"))).getOrThrow(true, h::error)
      );
   }

   private static efa a(ddk $$0, dfa $$1, edr.b $$2, hz $$3, edr.a $$4) {
      eeg $$5 = $$4.d ? eeg.b : eeg.d;
      List<eet> $$6 = Lists.newArrayList();
      $$6.add(a(cyq.ch, 0.3F, cyq.a));
      $$6.add(a($$2, $$4));
      if (!$$4.b) {
         $$6.add(a(cyq.dV, 0.07F, cyq.kJ));
      }

      efa $$7 = new efa().a($$1).a($$0).a($$3).a($$5).a(new eex($$6)).a(new eef($$4.c)).a(new eeu(atz.bH)).a(new een());
      if ($$4.g) {
         $$7.a(eee.b);
      }

      return $$7;
   }

   private static eet a(edr.b $$0, edr.a $$1) {
      if ($$0 == edr.b.c) {
         return a(cyq.H, cyq.kJ);
      } else {
         return $$1.b ? a(cyq.H, cyq.dV) : a(cyq.H, 0.2F, cyq.kJ);
      }
   }

   @Override
   public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
      eaw $$7 = this.b.b(this.c, this.d);
      if ($$4.b($$7.g())) {
         $$4.b($$7);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         this.b($$3, $$0);
         this.a($$3, $$0);
         if (this.m.f || this.m.e) {
            hz.a(this.f()).forEach($$2x -> {
               if (this.m.f) {
                  this.a($$3, (cvo)$$0, $$2x);
               }

               if (this.m.e) {
                  this.b($$3, $$0, $$2x);
               }
            });
         }
      }
   }

   @Override
   protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
   }

   private void a(awo $$0, cvo $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2);
      if (!$$3.i() && !$$3.a(cyq.ff)) {
         ie $$4 = a($$0);
         hz $$5 = $$2.a($$4);
         dlf $$6 = $$1.a_($$5);
         if ($$6.i()) {
            if (cyo.a($$3.k($$1, $$2), $$4)) {
               dlw $$7 = dhi.a($$4.g());
               $$1.a($$5, cyq.ff.o().a($$7, Boolean.valueOf(true)), 3);
            }
         }
      }
   }

   private void b(awo $$0, cvo $$1, hz $$2) {
      if ($$0.i() < 0.5F && $$1.a_($$2).a(cyq.dV) && $$1.a_($$2.c()).i()) {
         $$1.a($$2.c(), cyq.aH.o().a(dcx.e, Boolean.valueOf(true)), 3);
      }
   }

   private void a(awo $$0, cvo $$1) {
      for (int $$2 = this.f.h() + 1; $$2 < this.f.k(); $$2++) {
         for (int $$3 = this.f.j() + 1; $$3 < this.f.m(); $$3++) {
            hz $$4 = new hz($$2, this.f.i(), $$3);
            if ($$1.a_($$4).a(cyq.dV)) {
               this.c($$0, $$1, $$4.d());
            }
         }
      }
   }

   private void c(awo $$0, cvo $$1, hz $$2) {
      hz.a $$3 = $$2.j();
      this.d($$0, $$1, $$3);
      int $$4 = 8;

      while ($$4 > 0 && $$0.i() < 0.5F) {
         $$3.c(ie.a);
         $$4--;
         this.d($$0, $$1, $$3);
      }
   }

   private void b(awo $$0, cvo $$1) {
      boolean $$2 = this.l == edr.b.a || this.l == edr.b.c;
      hz $$3 = this.f.g();
      int $$4 = $$3.u();
      int $$5 = $$3.w();
      float[] $$6 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int $$7 = $$6.length;
      int $$8 = (this.f.d() + this.f.f()) / 2;
      int $$9 = $$0.a(Math.max(1, 8 - $$8 / 2));
      int $$10 = 3;
      hz.a $$11 = hz.c.j();

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

   private boolean a(cvo $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return !$$2.a(cyq.a) && !$$2.a(cyq.co) && !$$2.a(atz.bH) && (this.l == edr.b.f || !$$2.a(cyq.H));
   }

   private void d(awo $$0, cvo $$1, hz $$2) {
      if (!this.m.b && $$0.i() < 0.07F) {
         $$1.a($$2, cyq.kJ.o(), 3);
      } else {
         $$1.a($$2, cyq.dV.o(), 3);
      }
   }

   private static int a(cvo $$0, int $$1, int $$2, edr.b $$3) {
      return $$0.a(a($$3), $$1, $$2) - 1;
   }

   public static dqo.a a(edr.b $$0) {
      return $$0 == edr.b.c ? dqo.a.c : dqo.a.a;
   }

   private static eet a(cyo $$0, float $$1, cyo $$2) {
      return new eet(new eev($$0, $$1), eec.b, $$2.o());
   }

   private static eet a(cyo $$0, cyo $$1) {
      return new eet(new eeh($$0), eec.b, $$1.o());
   }

   public static class a {
      public static final Codec<edr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.BOOL.fieldOf("cold").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("mossiness").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.fieldOf("air_pocket").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.fieldOf("overgrown").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("vines").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.fieldOf("replace_with_blackstone").forGetter($$0x -> $$0x.g)
               )
               .apply($$0, edr.a::new)
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

   public static enum b implements axc {
      a("on_land_surface"),
      b("partly_buried"),
      c("on_ocean_floor"),
      d("in_mountain"),
      e("underground"),
      f("in_nether");

      public static final axc.a<edr.b> g = axc.a(edr.b::values);
      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }

      public static edr.b a(String $$0) {
         return g.a($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
