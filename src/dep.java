import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public class dep extends dcs implements dlb {
   public static final MapCodec<dep> c = b(dep::new);
   public static final int d = 1;
   public static final int e = 4;
   public static final dsd f = drt.az;
   public static final dru g = dcs.b;
   public static final dru h = drt.C;
   public static final ToIntFunction<drd> i = $$0 -> $$0.c(g) ? 3 * $$0.c(f) : 0;
   private static final Int2ObjectMap<List<eum>> j = ac.a(() -> {
      Int2ObjectMap<List<eum>> $$0 = new Int2ObjectOpenHashMap();
      $$0.defaultReturnValue(ImmutableList.of());
      $$0.put(1, ImmutableList.of(new eum(0.5, 0.5, 0.5)));
      $$0.put(2, ImmutableList.of(new eum(0.375, 0.44, 0.5), new eum(0.625, 0.5, 0.44)));
      $$0.put(3, ImmutableList.of(new eum(0.5, 0.313, 0.625), new eum(0.375, 0.44, 0.5), new eum(0.56, 0.5, 0.44)));
      $$0.put(4, ImmutableList.of(new eum(0.44, 0.313, 0.56), new eum(0.625, 0.44, 0.56), new eum(0.375, 0.44, 0.375), new eum(0.56, 0.5, 0.375)));
      return Int2ObjectMaps.unmodifiable($$0);
   });
   private static final evf k = dea.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0);
   private static final evf l = dea.a(5.0, 0.0, 6.0, 11.0, 6.0, 9.0);
   private static final evf m = dea.a(5.0, 0.0, 6.0, 10.0, 6.0, 11.0);
   private static final evf n = dea.a(5.0, 0.0, 5.0, 11.0, 6.0, 10.0);

   @Override
   public MapCodec<dep> a() {
      return c;
   }

   public dep(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Integer.valueOf(1)).a(g, Boolean.valueOf(false)).a(h, Boolean.valueOf(false)));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$0.e() && $$4.gd().e && $$1.c(g)) {
         a($$4, $$1, $$2, $$3);
         return bpy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      return !$$1.h() && $$1.n().g() == this.r() && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(f);
      } else {
         emw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emx.c;
         return super.a($$0).a(h, Boolean.valueOf($$3));
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(h) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
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
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      if (!$$2.c(h) && $$3.a() == emx.c) {
         drd $$4 = $$2.a(h, Boolean.valueOf(true));
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

   public static boolean g(drd $$0) {
      return $$0.a(avx.ae, $$0x -> $$0x.b(g) && $$0x.b(h)) && !$$0.c(g) && !$$0.c(h);
   }

   @Override
   protected Iterable<eum> b(drd $$0) {
      return (Iterable<eum>)j.get($$0.c(f));
   }

   @Override
   protected boolean d(drd $$0) {
      return !$$0.c(h) && super.d($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return dea.a($$1, $$2.d(), it.b);
   }
}
