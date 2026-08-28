import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dqd extends dhm {
   public static final MapCodec<dqd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("hook").forGetter($$0x -> $$0x.m), t()).apply($$0, dqd::new)
   );
   public static final dvj b = dvi.w;
   public static final dvj c = dvi.a;
   public static final dvj d = dvi.d;
   public static final dvj e = dna.b;
   public static final dvj f = dna.c;
   public static final dvj g = dna.d;
   public static final dvj h = dna.e;
   private static final Map<jk, dvj> k = dji.f;
   protected static final ezq i = dhm.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final ezq j = dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int l = 10;
   private final dhm m;

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   public dqd(dhm $$0, dur.d $$1) {
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
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return $$0.c(c) ? i : j;
   }

   @Override
   public dus a(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      return this.n()
         .b(e, Boolean.valueOf(this.a($$1.a_($$2.f()), jk.c)))
         .b(f, Boolean.valueOf(this.a($$1.a_($$2.i()), jk.f)))
         .b(g, Boolean.valueOf(this.a($$1.a_($$2.g()), jk.d)))
         .b(h, Boolean.valueOf(this.a($$1.a_($$2.h()), jk.e)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.o().d() ? $$0.b(k.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.b(b, Boolean.valueOf(true)));
      }
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B && !$$3.eW().f() && $$3.eW().a(cvw.rW)) {
         $$0.a($$1, $$2.b(d, Boolean.valueOf(true)), 4);
         $$0.a($$3, dzp.M, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      for (jk $$3 : new jk[]{jk.d, jk.e}) {
         for (int $$4 = 1; $$4 < 42; $$4++) {
            jf $$5 = $$1.a($$3, $$4);
            dus $$6 = $$0.a_($$5);
            if ($$6.a(this.m)) {
               if ($$6.c(dqe.b) == $$3.g()) {
                  dqe.a($$0, $$5, $$6, false, true, $$4, $$2);
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
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B) {
         if (!$$0.c(b)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.a_($$2).c(b)) {
         this.a($$1, $$2);
      }
   }

   private void a(dej $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(b);
      boolean $$4 = false;
      List<? extends btr> $$5 = $$0.a_(null, $$2.f($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for (btr $$6 : $$5) {
            if (!$$6.r_()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.b(b, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new jf($$1), this, 10);
      }
   }

   public boolean a(dus $$0, jk $$1) {
      return $$0.a(this.m) ? $$0.c(dqe.b) == $$1.g() : $$0.a(this);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
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
   protected dus a(dus $$0, dmj $$1) {
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
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d, e, f, h, g);
   }
}
