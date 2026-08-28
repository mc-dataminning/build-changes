import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsc extends dni implements dqq {
   public static final MapCodec<dsc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxk.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dsc::new)
   );
   public static final dxm b = dxl.z;
   public static final dxs<dxt> c = dxl.ai;
   public static final dxm d = dxl.B;
   public static final dxm e = dxl.J;
   protected static final int f = 3;
   protected static final fbs g = djk.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbs h = djk.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbs i = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbs j = djk.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbs k = djk.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fbs l = djk.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dxk m;

   @Override
   public MapCodec<? extends dsc> a() {
      return a;
   }

   protected dsc(dxk $$0, dwu.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(c, dxt.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dxt.a ? l : k;
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
   protected boolean a(dwv $$0, etm $$1) {
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
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!this.m.c()) {
         return bsi.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsi.a;
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, dfy $$3, BiConsumer<cwn, ji> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dwv $$0, dgg $$1, ji $$2, @Nullable cov $$3) {
      dwv $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, esy.c, esy.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cov $$0, dgg $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awa.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ebr.h : ebr.d, $$2);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, esy.c, esy.c.a($$1));
            }
         }
      }
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = this.m();
      esx $$2 = $$0.q().b_($$0.a());
      jn $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dxt.a : dxt.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jn.b ? dxt.b : dxt.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == esy.c));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dxk q() {
      return this.m;
   }
}
