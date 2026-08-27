import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dli extends dgr implements djw {
   public static final MapCodec<dli> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), u()).apply($$0, dli::new)
   );
   public static final dqp b = dqo.u;
   public static final dqw<dqx> c = dqo.af;
   public static final dqp d = dqo.w;
   public static final dqp e = dqo.C;
   protected static final int f = 3;
   protected static final ety g = dcv.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ety h = dcv.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety i = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ety j = dcv.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final ety k = dcv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final ety l = dcv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dqn m;

   @Override
   public MapCodec<? extends dli> a() {
      return a;
   }

   protected dli(dqn $$0, dpx.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.k(this.E.b().a(aE, ir.c).a(b, Boolean.valueOf(false)).a(c, dqx.b).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dqx.a ? l : k;
      } else {
         switch ((ir)$$0.c(aE)) {
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
   protected boolean a(dpy $$0, emg $$1) {
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
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (!this.m.c()) {
         return boq.d;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return boq.a($$1.B);
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dpy $$0, czu $$1, im $$2, @Nullable ckl $$3) {
      dpy $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, els.c, els.c.a((czx)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable ckl $$0, czu $$1, im $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), ava.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? dur.h : dur.d, $$2);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.a(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, els.c, els.c.a((czx)$$1));
            }
         }
      }
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      elr $$2 = $$0.q().b_($$0.a());
      ir $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.a(aE, $$3).a(c, $$0.l().d - (double)$$0.a().v() > 0.5 ? dqx.a : dqx.b);
      } else {
         $$1 = $$1.a(aE, $$0.g().g()).a(c, $$3 == ir.b ? dqx.b : dqx.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.a(b, Boolean.valueOf(true)).a(d, Boolean.valueOf(true));
      }

      return $$1.a(e, Boolean.valueOf($$2.a() == els.c));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, b, c, d, e);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(e) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dqn k() {
      return this.m;
   }
}
