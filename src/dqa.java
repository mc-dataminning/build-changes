import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dqa extends dli implements doo {
   public static final MapCodec<dqa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvh.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dqa::new)
   );
   public static final dvj b = dvi.u;
   public static final dvq<dvr> c = dvi.af;
   public static final dvj d = dvi.w;
   public static final dvj e = dvi.C;
   protected static final int f = 3;
   protected static final ezq g = dhm.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ezq h = dhm.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezq i = dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezq j = dhm.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ezq k = dhm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ezq l = dhm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dvh m;

   @Override
   public MapCodec<? extends dqa> a() {
      return a;
   }

   protected dqa(dvh $$0, dur.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jk.c).b(b, Boolean.valueOf(false)).b(c, dvr.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dvr.a ? l : k;
      } else {
         switch ((jk)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!this.m.c()) {
         return brs.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return brs.a;
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dus $$0, dej $$1, jf $$2, @Nullable cnx $$3) {
      dus $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, equ.c, equ.c.a((dem)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cnx $$0, dej $$1, jf $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awh.e, 1.0F, $$1.D_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dzp.h : dzp.d, $$2);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, equ.c, equ.c.a((dem)$$1));
            }
         }
      }
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n();
      eqt $$2 = $$0.q().b_($$0.a());
      jk $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dvr.a : dvr.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jk.b ? dvr.b : dvr.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == equ.c));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(e) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dvh l() {
      return this.m;
   }
}
