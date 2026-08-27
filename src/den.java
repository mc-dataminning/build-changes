import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class den extends dcq implements dkz {
   public static final MapCodec<den> c = b(den::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dsb f = drr.az;
   public static final drs g = dcq.b;
   public static final drs h = drr.C;
   public static final ToIntFunction<drb> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<euk>> j = ac.a(() -> {
      Int2ObjectMap<List<euk>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new euk(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new euk(0.375, 0.44, 0.5), new euk(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new euk(0.5, 0.313, 0.625), new euk(0.375, 0.44, 0.5), new euk(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new euk(0.44, 0.313, 0.56), new euk(0.625, 0.44, 0.56), new euk(0.375, 0.44, 0.375), new euk(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final evd k = ddy.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final evd l = ddy.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final evd m = ddy.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final evd n = ddy.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<den> a() {
      return c;
   }

   public den(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bpw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return !$$1.h() && $$1.n().g() == this.q() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         emu $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emv.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(h) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
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
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      if (!$$2.c(h) && $$3.a() == emv.c) {
         drb $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(drb $$0) {
      return $$0.a(avw.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<euk> b(drb $$0) {
      return (Iterable<euk>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(drb $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return ddy.a($$1, $$2.d(), it.b);
   }
}
