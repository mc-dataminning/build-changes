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

public class dzf extends dxv<eat> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<dzf.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new dzf.b());

   public dzf(Codec<eat> $$0) {
      super($$0);
   }

   public static List<dzf.a> a(czs $$0) {
      axr $$1 = axr.a($$0.C());
      long $$2 = $$1.g() & 65535L;
      return (List<dzf.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(dxx<eat> $$0) {
      eat $$1 = $$0.f();
      czs $$2 = $$0.b();
      axr $$3 = $$0.d();
      ib $$4 = $$0.e();
      List<dzf.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (dzf.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(czm $$0, axr $$1, eat $$2, dzf.a $$3) {
      int $$4 = $$3.c();

      for (ib $$5 : ib.a(new ib($$3.a() - $$4, $$0.I_(), $$3.b() - $$4), new ib($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d((double)$$3.a(), (double)$$5.v(), (double)$$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
            this.a($$0, $$5, dca.co.n());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, dca.a.n());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         ib.a $$9 = new ib.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = axk.a($$10) == 2;
                  boolean $$14 = axk.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     doz $$18 = dca.eW
                        .n()
                        .a(dfy.a, Boolean.valueOf($$16 && $$11 != -2))
                        .a(dfy.c, Boolean.valueOf($$16 && $$11 != 2))
                        .a(dfy.d, Boolean.valueOf($$17 && $$10 != -2))
                        .a(dfy.b, Boolean.valueOf($$17 && $$10 != 2));
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      cew $$19 = bqb.E.a((cyx)$$0.E());
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.m($$2.a());
         $$19.b((double)$$3.a() + 0.5, (double)($$3.d() + 1), (double)$$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         ib $$20 = $$19.dm();
         this.a($$0, $$20.d(), dca.F.n());
         this.a($$0, $$20, dey.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<dzf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
                  Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
               )
               .apply($$0, dzf.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final erv g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new erv((double)($$0 - $$2), (double)dsr.e, (double)($$1 - $$2), (double)($$0 + $$2), (double)dsr.d, (double)($$1 + $$2));
      }

      public boolean a(ib $$0) {
         return je.a($$0.u()) == je.a(this.b) && je.a($$0.w()) == je.a(this.c);
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

      public erv f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<dzf.a>> {
      public List<dzf.a> a(Long $$0) {
         IntArrayList $$1 = ac.a(IntStream.range(0, 10), axr.a($$0));
         List<dzf.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = axk.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$5 = axk.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new dzf.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
