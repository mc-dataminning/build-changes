import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhe extends dcn implements dfs {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dly.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dhe::new)
   );
   public static final dma b = dlz.u;
   public static final dmh<dmi> c = dlz.af;
   public static final dma d = dlz.w;
   public static final dma e = dlz.C;
   protected static final int f = 3;
   protected static final eos g = cys.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eos h = cys.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eos i = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eos j = cys.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final eos k = cys.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final eos l = cys.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dly m;

   @Override
   public MapCodec<? extends dhe> a() {
      return a;
   }

   protected dhe(dly $$0, dli.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ie.c).a(b, Boolean.valueOf(false)).a(c, dmi.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dmi.a ? l : k;
      } else {
         switch ((ie)$$0.c(aE)) {
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
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      switch ($$3) {
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
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if (!this.m.c()) {
         return blw.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return blw.a($$1.B);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cvj $$3, BiConsumer<cpd, hz> $$4) {
      if ($$3.j() == cvj.a.d && !$$1.y_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dlj $$0, cvr $$1, hz $$2, @Nullable chl $$3) {
      dlj $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, egx.c, egx.c.a((cvu)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable chl $$0, cvr $$1, hz $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), atm.e, 1.0F, $$1.F_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dpw.h : dpw.d, $$2);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, egx.c, egx.c.a((cvu)$$1));
            }
         }
      }
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o();
      egw $$2 = $$0.q().b_($$0.a());
      ie $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dmi.a : dmi.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ie.b ? dmi.b : dmi.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == egx.c));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(e) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dly g() {
      return this.m;
   }
}
