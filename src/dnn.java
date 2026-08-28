import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnn extends diw implements dmb {
   public static final MapCodec<dnn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dss.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnn::new)
   );
   public static final dsu b = dst.u;
   public static final dtb<dtc> c = dst.af;
   public static final dsu d = dst.w;
   public static final dsu e = dst.C;
   protected static final int f = 3;
   protected static final ewl g = dfa.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewl h = dfa.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewl i = dfa.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewl j = dfa.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewl k = dfa.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewl l = dfa.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dss m;

   @Override
   public MapCodec<? extends dnn> a() {
      return a;
   }

   protected dnn(dss $$0, dsc.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dtc.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtc.a ? l : k;
      } else {
         switch ((je)$$0.c(aE)) {
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
   protected boolean a(dsd $$0, eol $$1) {
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
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (!this.m.c()) {
         return bqv.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqv.a($$1.B);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dbr $$3, BiConsumer<cuq, iz> $$4) {
      if ($$3.j() == dbr.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsd $$0, dbz $$1, iz $$2, @Nullable cmy $$3) {
      dsd $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, enx.c, enx.c.a((dcc)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmy $$0, dbz $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dww.h : dww.d, $$2);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, enx.c, enx.c.a((dcc)$$1));
            }
         }
      }
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      enw $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtc.a : dtc.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dtc.b : dtc.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == enx.c));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(e) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dss m() {
      return this.m;
   }
}
