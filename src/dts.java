import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dts extends dku {
   public static final MapCodec<dts> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.e.q().fieldOf("hook").forGetter($$0x -> $$0x.S), t()).apply($$0, dts::new)
   );
   public static final dzd b = dzc.A;
   public static final dzd c = dzc.a;
   public static final dzd d = dzc.g;
   public static final dzd e = dqm.b;
   public static final dzd f = dqm.c;
   public static final dzd g = dqm.d;
   public static final dzd h = dqm.e;
   private static final Map<jo, dzd> i = dmr.f;
   private static final fdo C = dku.b(16.0, 1.0, 2.5);
   private static final fdo Q = dku.b(16.0, 0.0, 8.0);
   private static final int R = 10;
   private final dku S;

   @Override
   public MapCodec<dts> a() {
      return a;
   }

   public dts(dku $$0, dyl.d $$1) {
      super($$1);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
            .b(h, Boolean.valueOf(false))
      );
      this.S = $$0;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(c) ? C : Q;
   }

   @Override
   public dym a(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      return this.m()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jo.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jo.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jo.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jo.e)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4.o().d() ? $$0.b(i.get($$4), Boolean.valueOf(this.a($$6, $$4))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dym a(dhp $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$0.C && !$$3.fa().f() && $$3.fa().a(cyc.sW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 260);
         $$0.a($$3, edm.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      for (jo $$3 : new jo[]{jo.d, jo.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jj $$5 = $$1.a($$3, $$4);
            dym $$6 = $$0.a_($$5);
            if ($$6.a(this.S)) {
               if ($$6.c(dtt.b) == $$3.g()) {
                  dtt.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected fdo a_(dym $$0, dhp $$1, jj $$2) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.C) {
         if (!$$0.c(b)) {
            this.a($$1, $$2, List.of($$3));
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dhp $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      List<? extends bvs> $$3 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      this.a($$0, $$1, $$3);
   }

   private void a(dhp $$0, jj $$1, List<? extends bvs> $$2) {
      dym $$3 = $$0.a_($$1);
      boolean $$4 = $$3.c(b);
      boolean $$5 = false;
      if (!$$2.isEmpty()) {
         for (bvs $$6 : $$2) {
            if (!$$6.g_()) {
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
         $$0.a(new jj($$1), this, 10);
      }
   }

   public boolean a(dym $$0, jo $$1) {
      return $$0.a(this.S) ? $$0.c(dtt.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
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
   protected dym a(dym $$0, dpv $$1) {
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
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
