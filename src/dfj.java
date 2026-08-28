import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dfj extends ddm implements dlv {
   public static final MapCodec<dfj> c = b(dfj::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dsx f = dsn.az;
   public static final dso g = ddm.b;
   public static final dso h = dsn.C;
   public static final ToIntFunction<drx> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<evm>> j = ac.a(() -> {
      Int2ObjectMap<List<evm>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new evm(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new evm(0.375, 0.44, 0.5), new evm(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new evm(0.5, 0.313, 0.625), new evm(0.375, 0.44, 0.5), new evm(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new evm(0.44, 0.313, 0.56), new evm(0.625, 0.44, 0.56), new evm(0.375, 0.44, 0.375), new evm(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final ewf k = deu.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final ewf l = deu.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final ewf m = deu.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final ewf n = deu.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dfj> a() {
      return c;
   }

   public dfj(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bqr.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         enq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enr.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enr.c, enr.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(h) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
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
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      if (!$$2.c(h) && $$3.a() == enr.c) {
         drx $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(drx $$0) {
      return $$0.a(awl.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<evm> b(drx $$0) {
      return (Iterable<evm>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(drx $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return deu.a($$1, $$2.d(), je.b);
   }
}
