import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnm extends div implements dma {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsr.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dnm::new)
   );
   public static final dst b = dss.u;
   public static final dta<dtb> c = dss.af;
   public static final dst d = dss.w;
   public static final dst e = dss.C;
   protected static final int f = 3;
   protected static final ewk g = dez.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ewk h = dez.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewk i = dez.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ewk j = dez.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ewk k = dez.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ewk l = dez.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dsr m;

   @Override
   public MapCodec<? extends dnm> a() {
      return a;
   }

   protected dnm(dsr $$0, dsb.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(c, dtb.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dtb.a ? l : k;
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
   protected boolean a(dsc $$0, eok $$1) {
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
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if (!this.m.c()) {
         return bqu.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bqu.a($$1.B);
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dbq $$3, BiConsumer<cup, iz> $$4) {
      if ($$3.j() == dbq.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dsc $$0, dby $$1, iz $$2, @Nullable cmx $$3) {
      dsc $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, enw.c, enw.c.a((dcb)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cmx $$0, dby $$1, iz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dwv.h : dwv.d, $$2);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, enw.c, enw.c.a((dcb)$$1));
            }
         }
      }
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = this.o();
      env $$2 = $$0.q().b_($$0.a());
      je $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dtb.a : dtb.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == je.b ? dtb.b : dtb.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == enw.c));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(e) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dsr m() {
      return this.m;
   }
}
