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

public class drf extends dpv<dst> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<drf.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new drf.b());

   public drf(Codec<dst> $$0) {
      super($$0);
   }

   public static List<drf.a> a(csu $$0) {
      ats $$1 = ats.a($$0.B());
      long $$2 = $$1.g() & 65535L;
      return (List<drf.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(dpx<dst> $$0) {
      dst $$1 = $$0.f();
      csu $$2 = $$0.b();
      ats $$3 = $$0.d();
      ht $$4 = $$0.e();
      List<drf.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (drf.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(csp $$0, ats $$1, dst $$2, drf.a $$3) {
      int $$4 = $$3.c();

      for (ht $$5 : ht.a(new ht($$3.a() - $$4, $$0.I_(), $$3.b() - $$4), new ht($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d((double)$$3.a(), (double)$$5.v(), (double)$$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
            this.a($$0, $$5, cvc.co.o());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, cvc.a.o());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         ht.a $$9 = new ht.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = atm.a($$10) == 2;
                  boolean $$14 = atm.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     dhi $$18 = cvc.eW
                        .o()
                        .a(cza.a, Boolean.valueOf($$16 && $$11 != -2))
                        .a(cza.c, Boolean.valueOf($$16 && $$11 != 2))
                        .a(cza.d, Boolean.valueOf($$17 && $$10 != -2))
                        .a(cza.b, Boolean.valueOf($$17 && $$10 != 2));
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      bzg $$19 = bku.B.a((csa)$$0.D());
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.m($$2.a());
         $$19.b((double)$$3.a() + 0.5, (double)($$3.d() + 1), (double)$$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         ht $$20 = $$19.dn();
         this.a($$0, $$20.d(), cvc.F.o());
         this.a($$0, $$20, cya.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<drf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
                  Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
               )
               .apply($$0, drf.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final ejp g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new ejp((double)($$0 - $$2), (double)dkr.e, (double)($$1 - $$2), (double)($$0 + $$2), (double)dkr.d, (double)($$1 + $$2));
      }

      public boolean a(ht $$0) {
         return iu.a($$0.u()) == iu.a(this.b) && iu.a($$0.w()) == iu.a(this.c);
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

      public ejp f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<drf.a>> {
      public List<drf.a> a(Long $$0) {
         IntArrayList $$1 = ac.a(IntStream.range(0, 10), ats.a($$0));
         List<drf.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = atm.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$5 = atm.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new drf.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
