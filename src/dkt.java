import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkt extends dgc implements djh {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpx.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dkt::new)
   );
   public static final dpz b = dpy.u;
   public static final dqg<dqh> c = dpy.af;
   public static final dpz d = dpy.w;
   public static final dpz e = dpy.C;
   protected static final int f = 3;
   protected static final etc g = dch.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final etc h = dch.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final etc i = dch.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final etc j = dch.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final etc k = dch.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final etc l = dch.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dpx m;

   @Override
   public MapCodec<? extends dkt> a() {
      return a;
   }

   protected dkt(dpx $$0, dph.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ij.c).a(b, Boolean.valueOf(false)).a(c, dqh.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dqh.a ? l : k;
      } else {
         switch ((ij)$$0.c(aE)) {
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
   protected boolean a(dpi $$0, elq $$1) {
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
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if (!this.m.c()) {
         return bof.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bof.a($$1.B);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dpi $$0, czg $$1, id $$2, @Nullable cka $$3) {
      dpi $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, elc.c, elc.c.a((czj)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cka $$0, czg $$1, id $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), aup.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dub.h : dub.d, $$2);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, elc.c, elc.c.a((czj)$$1));
            }
         }
      }
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n();
      elb $$2 = $$0.q().b_($$0.a());
      ij $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dqh.a : dqh.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ij.b ? dqh.b : dqh.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == elc.c));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(e) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dpx k() {
      return this.m;
   }
}
