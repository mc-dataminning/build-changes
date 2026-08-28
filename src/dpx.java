import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpx extends dlf implements dol {
   public static final MapCodec<dpx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dpx::new)
   );
   public static final dvf b = dve.u;
   public static final dvm<dvn> c = dve.af;
   public static final dvf d = dve.w;
   public static final dvf e = dve.C;
   protected static final int f = 3;
   protected static final ezm g = dhj.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ezm h = dhj.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ezm i = dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ezm j = dhj.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ezm k = dhj.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ezm l = dhj.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dvd m;

   @Override
   public MapCodec<? extends dpx> a() {
      return a;
   }

   protected dpx(dvd $$0, dun.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jj.c).b(b, Boolean.valueOf(false)).b(c, dvn.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dvn.a ? l : k;
      } else {
         switch ((jj)$$0.c(aF)) {
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
   protected boolean a(duo $$0, ere $$1) {
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
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!this.m.c()) {
         return brp.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return brp.a;
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(duo $$0, deg $$1, je $$2, @Nullable cnu $$3) {
      duo $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, eqq.c, eqq.c.a((dej)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cnu $$0, deg $$1, je $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awf.e, 1.0F, $$1.C_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dzl.h : dzl.d, $$2);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, eqq.c, eqq.c.a((dej)$$1));
            }
         }
      }
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      eqp $$2 = $$0.q().b_($$0.a());
      jj $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dvn.a : dvn.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jj.b ? dvn.b : dvn.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == eqq.c));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(e) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eqq.c, eqq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dvd l() {
      return this.m;
   }
}
