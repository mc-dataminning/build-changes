import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsf extends dnl implements dqt {
   public static final MapCodec<dsf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dsf::new)
   );
   public static final dxp b = dxo.z;
   public static final dxv<dxw> c = dxo.ai;
   public static final dxp d = dxo.B;
   public static final dxp e = dxo.J;
   protected static final int f = 3;
   protected static final fbv g = djn.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbv h = djn.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv i = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbv j = djn.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbv k = djn.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fbv l = djn.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dxn m;

   @Override
   public MapCodec<? extends dsf> a() {
      return a;
   }

   protected dsf(dxn $$0, dwx.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(c, dxw.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dxw.a ? l : k;
      } else {
         switch ((jn)$$0.c(aF)) {
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
   protected boolean a(dwy $$0, etp $$1) {
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
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!this.m.c()) {
         return bsl.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsl.a;
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, dgb $$3, BiConsumer<cwq, ji> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dwy $$0, dgj $$1, ji $$2, @Nullable coy $$3) {
      dwy $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, etb.c, etb.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable coy $$0, dgj $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ebu.h : ebu.d, $$2);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, etb.c, etb.c.a($$1));
            }
         }
      }
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m();
      eta $$2 = $$0.q().b_($$0.a());
      jn $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dxw.a : dxw.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jn.b ? dxw.b : dxw.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == etb.c));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dxn q() {
      return this.m;
   }
}
