import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cxf extends cvi implements ddq {
   public static final MapCodec<cxf> c = b(cxf::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dkh f = djx.az;
   public static final djy g = cvi.b;
   public static final djy h = djx.C;
   public static final ToIntFunction<djh> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<elt>> j = ac.a(() -> {
      Int2ObjectMap<List<elt>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new elt(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new elt(0.375, 0.44, 0.5), new elt(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new elt(0.5, 0.313, 0.625), new elt(0.375, 0.44, 0.5), new elt(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new elt(0.44, 0.313, 0.56), new elt(0.625, 0.44, 0.56), new elt(0.375, 0.44, 0.375), new elt(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final emm k = cwq.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final emm l = cwq.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final emm m = cwq.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final emm n = cwq.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cxf> a() {
      return c;
   }

   public cxf(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bkb.a($$1.B);
      } else {
         return bkb.d;
      }
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eer $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ees.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(h) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      if (!$$2.c(h) && $$3.a() == ees.c) {
         djh $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(djh $$0) {
      return $$0.a(ash.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<elt> b(djh $$0) {
      return (Iterable<elt>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(djh $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return cwq.a($$1, $$2.d(), ic.b);
   }
}
