import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dml extends dhu implements dkz {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drq.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dml::new)
   );
   public static final drs b = drr.u;
   public static final drz<dsa> c = drr.af;
   public static final drs d = drr.w;
   public static final drs e = drr.C;
   protected static final int f = 3;
   protected static final evd g = ddy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final evd h = ddy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final evd i = ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final evd j = ddy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final evd k = ddy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final evd l = ddy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final drq m;

   @Override
   public MapCodec<? extends dml> a() {
      return a;
   }

   protected dml(drq $$0, dra.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(c, dsa.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dsa.a ? l : k;
      } else {
         switch ((it)$$0.c(aE)) {
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
   protected boolean a(drb $$0, enj $$1) {
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
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (!this.m.c()) {
         return bpu.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bpu.a($$1.B);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(drb $$0, dax $$1, io $$2, @Nullable clw $$3) {
      drb $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, emv.c, emv.c.a((dba)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable clw $$0, dax $$1, io $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), avi.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dvu.h : dvu.d, $$2);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, emv.c, emv.c.a((dba)$$1));
            }
         }
      }
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = this.n();
      emu $$2 = $$0.q().b_($$0.a());
      it $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dsa.a : dsa.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == it.b ? dsa.b : dsa.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == emv.c));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(e) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected drq l() {
      return this.m;
   }
}
