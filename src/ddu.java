import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddu extends djv {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drl.a.fieldOf("wood_type").forGetter(djv::d), u()).apply($$0, ddu::new));
   public static final dqy b = dqo.ba;
   public static final dqp c = dqo.a;
   protected static final float d = 5.0F;
   protected static final ety e = dcv.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ety> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dcv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dcv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dcv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dcv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(drl $$0, dpx.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof don $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bos.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(ckl $$0, etb $$1, don $$2, csd $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.f() instanceof crq && $$1.b().equals(ir.a);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ir.a, dkw.b);
   }

   @Override
   public dpy a(cvl $$0) {
      czu $$1 = $$0.q();
      elr $$2 = $$1.b_($$0.a());
      im $$3 = $$0.a().c();
      dpy $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avo.aA);
      ir $$6 = ir.a((double)$$0.i());
      boolean $$7 = !dcv.a($$4.k($$1, $$3), ir.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dlu.b)) {
            ir $$8 = $$4.c(dlu.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ir> $$9 = dre.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dre.a($$6.g()) : dre.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == els.c));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ety $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return this.a($$0, $$1, $$2, etk.a());
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.b && !this.a($$0, $$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpy $$0) {
      return dre.b($$0.c(b));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.i, don::a);
   }
}
