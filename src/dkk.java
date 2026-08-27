import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkk extends dft implements diy {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpo.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dkk::new)
   );
   public static final dpq b = dpp.u;
   public static final dpx<dpy> c = dpp.af;
   public static final dpq d = dpp.w;
   public static final dpq e = dpp.C;
   protected static final int f = 3;
   protected static final est g = dby.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final est h = dby.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final est i = dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final est j = dby.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final est k = dby.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final est l = dby.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dpo m;

   @Override
   public MapCodec<? extends dkk> a() {
      return a;
   }

   protected dkk(dpo $$0, doy.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(c, dpy.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dpy.a ? l : k;
      } else {
         switch ((ih)$$0.c(aE)) {
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
   protected boolean a(doz $$0, elh $$1) {
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
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if (!this.m.c()) {
         return boa.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return boa.a($$1.B);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(doz $$0, cyx $$1, ib $$2, @Nullable cjt $$3) {
      doz $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, ekt.c, ekt.c.a((cza)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cjt $$0, cyx $$1, ib $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), aun.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dts.h : dts.d, $$2);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, ekt.c, ekt.c.a((cza)$$1));
            }
         }
      }
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      eks $$2 = $$0.q().b_($$0.a());
      ih $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dpy.a : dpy.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ih.b ? dpy.b : dpy.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == ekt.c));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(e) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dpo k() {
      return this.m;
   }
}
