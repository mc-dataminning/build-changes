import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class cxe extends cvh implements ddp {
   public static final MapCodec<cxe> c = b(cxe::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dkg f = djw.az;
   public static final djx g = cvh.b;
   public static final djx h = djw.C;
   public static final ToIntFunction<djg> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<els>> j = ac.a(() -> {
      Int2ObjectMap<List<els>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new els(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new els(0.375, 0.44, 0.5), new els(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new els(0.5, 0.313, 0.625), new els(0.375, 0.44, 0.5), new els(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new els(0.44, 0.313, 0.56), new els(0.625, 0.44, 0.56), new els(0.375, 0.44, 0.375), new els(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final eml k = cwp.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final eml l = cwp.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final eml m = cwp.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final eml n = cwp.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<cxe> a() {
      return c;
   }

   public cxe(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$3.fT().e && $$3.b($$4).b() && $$0.c(g)) {
         a($$3, $$0, $$1, $$2);
         return bka.a($$1.B);
      } else {
         return bka.d;
      }
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return !$$1.h() && $$1.n().d() == this.k() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         eeq $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eer.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(h) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
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
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      if (!$$2.c(h) && $$3.a() == eer.c) {
         djg $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(djg $$0) {
      return $$0.a(asg.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<els> b(djg $$0) {
      return (Iterable<els>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(djg $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return cwp.a($$1, $$2.d(), ic.b);
   }
}
