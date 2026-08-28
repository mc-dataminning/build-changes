import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dsx extends dke {
   public static final MapCodec<dsx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dsx::new)
   );
   public static final dye b = dyd.x;
   public static final dye c = dyd.a;
   public static final dye d = dyd.d;
   public static final dye e = dpu.b;
   public static final dye f = dpu.c;
   public static final dye g = dpu.d;
   public static final dye h = dpu.e;
   private static final Map<jm, dye> k = dmc.f;
   protected static final fcm i = dke.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final fcm j = dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dke m;

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(dke $$0, dxm.d $$1) {
      super($$1);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.m = $$0;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dxn a(dbb $$0) {
      dgf $$1 = $$0.q();
      jh $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jm.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jm.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jm.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jm.e)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.o().d() ? $$0.b(k.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.C && !$$3.eX().f() && $$3.eX().a(cxo.sJ)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, ecj.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dha $$0, jh $$1, dxn $$2) {
      for (jm $$3 : new jm[]{jm.d, jm.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jh $$5 = $$1.a($$3, $$4);
            dxn $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dsy.b) == $$3.g()) {
                  dsy.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }
   }

   @Override
   protected fcm a_(dxn $$0, dha $$1, jh $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dha $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      List<? extends bvf> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dha $$0, jh $$1, List<? extends bvf> $$2) {
      dxn $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bvf $$6 : $$2) {
            if (!$$6.s_()) {
               $$5 = true;
               break;
            }
         }
      }

      if ($$5 != $$4) {
         $$3 = $$3.b(b, Boolean.valueOf($$5));
         $$0.a($$1, $$3, 3);
         this.a($$0, $$1, $$3);
      }

      if ($$5) {
         $$0.a(new jh($$1), this, 10);
      }
   }

   public boolean a(dxn $$0, jm $$1) {
      return $$0.a(this.m) ? $$0.c(dsy.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(e, $$0.c(g)).b(f, $$0.c(h)).b(g, $$0.c(e)).b(h, $$0.c(f));
         case d:
            return $$0.b(e, $$0.c(f)).b(f, $$0.c(g)).b(g, $$0.c(h)).b(h, $$0.c(e));
         case b:
            return $$0.b(e, $$0.c(h)).b(f, $$0.c(e)).b(g, $$0.c(f)).b(h, $$0.c(g));
         default:
            return $$0;
      }
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(e, $$0.c(g)).b(g, $$0.c(e));
         case c:
            return $$0.b(f, $$0.c(h)).b(h, $$0.c(f));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
