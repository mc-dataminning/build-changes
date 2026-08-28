import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnl extends diu implements dlz {
   public static final MapCodec<dnl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnl::new)
   );
   public static final dss b = dsr.u;
   public static final dsz<dta> c = dsr.af;
   public static final dss d = dsr.w;
   public static final dss e = dsr.C;
   protected static final int f = 3;
   protected static final ewj g = dey.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewj h = dey.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewj i = dey.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewj j = dey.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewj k = dey.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewj l = dey.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsq m;

   @Override
   public MapCodec<? extends dnl> a() {
      return a;
   }

   protected dnl(dsq $$0, dsa.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dta.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dta.a ? l : k;
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
   protected boolean a(dsb $$0, eoj $$1) {
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
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if (!this.m.c()) {
         return bqt.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqt.a($$1.B);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dbp $$3, BiConsumer<cuo, iz> $$4) {
      if ($$3.j() == dbp.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsb $$0, dbx $$1, iz $$2, @Nullable cmw $$3) {
      dsb $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, env.c, env.c.a((dca)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmw $$0, dbx $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awa.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dwu.h : dwu.d, $$2);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, env.c, env.c.a((dca)$$1));
            }
         }
      }
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = this.o();
      enu $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dta.a : dta.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dta.b : dta.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == env.c));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(e) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsq m() {
      return this.m;
   }
}
