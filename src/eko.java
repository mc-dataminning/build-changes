import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class eko extends eje<emc> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<eko.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new eko.b());

   public eko(Codec<emc> $$0) {
      super($$0);
   }

   public static List<eko.a> a(dju $$0) {
      azv $$1 = azv.a($$0.E());
      long $$2 = $$1.g() & 65535L;
      return (List<eko.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(ejg<emc> $$0) {
      emc $$1 = $$0.f();
      dju $$2 = $$0.b();
      azv $$3 = $$0.d();
      iu $$4 = $$0.e();
      List<eko.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (eko.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(djm $$0, azv $$1, emc $$2, eko.a $$3) {
      int $$4 = $$3.c();

      for (iu $$5 : iu.c(new iu($$3.a() - $$4, $$0.G_(), $$3.b() - $$4), new iu($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d((double)$$3.a(), (double)$$5.v(), (double)$$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
            this.a($$0, $$5, dmc.cw.m());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, dmc.a.m());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         iu.a $$9 = new iu.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = azm.a($$10) == 2;
                  boolean $$14 = azm.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     dzz $$18 = dmc.fl
                        .m()
                        .b(dqf.a, Boolean.valueOf($$16 && $$11 != -2))
                        .b(dqf.c, Boolean.valueOf($$16 && $$11 != 2))
                        .b(dqf.d, Boolean.valueOf($$17 && $$10 != -2))
                        .b(dqf.b, Boolean.valueOf($$17 && $$10 != 2));
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      clv $$19 = bwm.R.a($$0.a(), bwl.d);
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.m($$2.a());
         $$19.b((double)$$3.a() + 0.5, (double)($$3.d() + 1), (double)$$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         iu $$20 = $$19.dv();
         this.a($$0, $$20.e(), dmc.I.m());
         this.a($$0, $$20, dpb.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<eko.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
                  Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
               )
               .apply($$0, eko.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final fed g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new fed((double)($$0 - $$2), (double)edw.e, (double)($$1 - $$2), (double)($$0 + $$2), (double)edw.d, (double)($$1 + $$2));
      }

      public boolean a(iu $$0) {
         return jx.a($$0.u()) == jx.a(this.b) && jx.a($$0.w()) == jx.a(this.c);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public fed f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<eko.a>> {
      public List<eko.a> a(Long $$0) {
         IntArrayList $$1 = af.a(IntStream.range(0, 10), azv.a($$0));
         List<eko.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = azm.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$5 = azm.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new eko.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
