import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class ddk extends dbn implements djw {
   public static final MapCodec<ddk> c = b(ddk::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dqy f = dqo.az;
   public static final dqp g = dbn.b;
   public static final dqp h = dqo.C;
   public static final ToIntFunction<dpy> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<etf>> j = ac.a(() -> {
      Int2ObjectMap<List<etf>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new etf(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new etf(0.375, 0.44, 0.5), new etf(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new etf(0.5, 0.313, 0.625), new etf(0.375, 0.44, 0.5), new etf(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new etf(0.44, 0.313, 0.56), new etf(0.625, 0.44, 0.56), new etf(0.375, 0.44, 0.375), new etf(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ety k = dcv.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ety l = dcv.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ety m = dcv.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ety n = dcv.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<ddk> a() {
      return c;
   }

   public ddk(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$0.d() && $$4.gb().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bos.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      return !$$1.h() && $$1.n().f() == this.p() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         elr $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == els.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(h) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ($$0.c(f)) {
         case 1:
         default:
            return k;
         case 2:
            return l;
         case 3:
            return m;
         case 4:
            return n;
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      if (!$$2.c(h) && $$3.a() == els.c) {
         dpy $$4 = $$2.a(h, Boolean.valueOf(true));
         if ($$2.c(g)) {
            a(null, $$4, $$0, $$1);
         } else {
            $$0.a($$1, $$4, 3);
         }

         $$0.a($$1, $$3.a(), $$3.a().a($$0));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(dpy $$0) {
      return $$0.a(avo.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<etf> b(dpy $$0) {
      return (Iterable<etf>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dpy $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return dcv.a($$1, $$2.d(), ir.b);
   }
}
