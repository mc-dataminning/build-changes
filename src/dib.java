import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dib extends dge implements doo {
   public static final MapCodec<dib> c = b(dib::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dvs f = dvi.az;
   public static final dvj g = dge.b;
   public static final dvj h = dvi.C;
   public static final ToIntFunction<dus> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eyw>> j = ad.a(() -> {
      Int2ObjectMap<List<eyw>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eyw(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eyw(0.375, 0.44, 0.5), new eyw(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eyw(0.5, 0.313, 0.625), new eyw(0.375, 0.44, 0.5), new eyw(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eyw(0.44, 0.313, 0.56), new eyw(0.625, 0.44, 0.56), new eyw(0.375, 0.44, 0.375), new eyw(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ezq k = dhm.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ezq l = dhm.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ezq m = dhm.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ezq n = dhm.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dib> a() {
      return c;
   }

   public dib(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Integer.valueOf(1)).b(g, Boolean.valueOf(false)).b(h, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$0.f() && $$4.ge().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return brs.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return !$$1.h() && $$1.n().h() == this.q() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eqt $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == equ.c;
         return super.a($$0).b(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(h) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
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
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      if (!$$2.c(h) && $$3.a() == equ.c) {
         dus $$4 = $$2.b(h, Boolean.valueOf(true));
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

   public static boolean h(dus $$0) {
      return $$0.a(awv.af, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eyw> b(dus $$0) {
      return (Iterable<eyw>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(dus $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return dhm.a($$1, $$2.e(), jk.b);
   }
}
